package org.zoneproject.extractor.plugin.categorization_svm.model;

/*
 * #%L
 * ZONE-plugin-categorization_SVM
 * %%
 * Copyright (C) 2012 ZONE-project
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.zoneproject.extractor.utils.Item;

public class Text implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public int categorie;
    public transient Item item;
    public boolean isLearning;
    public List<Mot> mots;
    public int nbToTMots;
    public int nbMotsInDictionnaire;

    public Text(Item i) {
        this(i, 0, false);
    }

    public Text(Item i, int categorie, boolean isLearning) {

        this.item = i;
        this.categorie = categorie;
        this.isLearning = isLearning;
        this.nbToTMots = 0;
        this.nbMotsInDictionnaire = 0;
        mots = new ArrayList<Mot>();
    }

    @Override
    public String toString() {
        return "{Text: {categorie=" + this.categorie + ", text=" + item.concat() + ", "
                + "mots=" + mots + "}}";
    }
}
