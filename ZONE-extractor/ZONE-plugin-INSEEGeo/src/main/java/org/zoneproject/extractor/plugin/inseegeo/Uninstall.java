package org.zoneproject.extractor.plugin.inseegeo;

/*
 * #%L
 * ZONE-plugin-INSEEGeo
 * %%
 * Copyright (C) 2012 - 2013 ZONE-project
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */

import com.hp.hpl.jena.query.ResultSet;
import org.zoneproject.extractor.utils.Database;

/**
 *
 * @author Desclaux Christophe <christophe@zouig.org>
 */
public class Uninstall {
    private static final org.apache.log4j.Logger  logger = org.apache.log4j.Logger.getLogger(Uninstall.class);
    public static void main(String[] args) {
        logger.info("Remove the INSEE Database");
        String q= "DELETE { ?a ?b ?c }WHERE  { ?a ?b ?c. FILTER ( regex(?a, 'rdf.insee.fr') )  }";
        Database.runSPARQLRequest(q,"http://rdf.insee.fr/geo/2011/");
        Database.runSPARQLRequest(q);
    }
}
