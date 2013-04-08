# Place all the behaviors and hooks related to the matching controller here.
# All this logic will automatically be available in application.js.
# You can use CoffeeScript in this file: http://jashkenas.github.com/coffee-script/
#//
//=  require jquery
//=  require jquery_ujs
//= require jquery-ui
//= require tag-it

$(document).ready ->
  #availableTags = ["ActionScript","AppleScript","Asp","BASIC"];
  #jQuery('#demo6').tagit({tagSource:availableTags, sortable:true});
    
  
  tags = []
  $.ajax '/filters.json',
    success  : (data, status, xhr) ->
      for elem in data
        tags.push(elem['value']+" | "+elem['prop'])
  $("#filter-select").tagit
    tags: tags
    field: "tag"