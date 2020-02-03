/* no lugar de function() = $(document).ready(funtion() { 
 * 
 * })  
 * 
 * funciona com arrow function  "()=>" */  


$(function(){
    $('.js-decimal').mask('000.000.000.000.000,00', {reverse: true});
    $('.js-plain').mask('000', {reverse: true});     
  })