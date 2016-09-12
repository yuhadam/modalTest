
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object test3_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class test3 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* test3 Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.14*/("""
"""),format.raw/*3.1*/("""<fieldset id="test3">
<input type="hidden" id="test3-val">
<legend>Final step</legend>
   	<div class="row">
     	<div class="col-lg-12">
       	<div class="row">
           	<div class="col-lg-6">
              	<div class="form-group">
                  	<label class="sr-only" for="exampleInputName1">Your name</label>
                     <input type="text" class="form-control" id="exampleInputName1" placeholder="Your name" name="your_name" required>
                 	</div>
        			<div class="form-group">
                  	<label class="sr-only" for="exampleInputCat1">Name of your cat</label>
                     <input type="text" class="form-control" id="exampleInputCat1" name="exampleInputCat1" placeholder="Name of your cat">
                 	</div>
                 	 
             	</div>
              <div class="col-lg-6">
              	<div class="form-group">
                  	<label class="sr-only" for="exampleInputHam1"></label>
                     <input type="text" class="form-control" id="exampleInputHam1" name="exampleInputHam1" placeholder="Name of your hamster">
                 	</div>
             	</div>
              <div class="col-lg-6">
              	<div class="form-group">
                  	<label class="sr-only" for="exampleInputGrocer1"></label>
                     <input type="text" class="form-control" id="exampleInputGrocer1" name="exampleInputGrocer1" placeholder="Name of your grocery seller">
                	</div>
            	</div>
         	</div>
     	</div>
       <div class="col-lg-12">
       	<div class="row">
           	<div class="col-lg-6">
           		<div class="radio">
                  	<label>
                     	<input type="radio" name="optionsRadios" value="option1" checked>
                         	Option one is this and that&mdash;be sure to include why it's great
                   	</label>
                 	</div>
             		<div class="radio">
              		<label>
                  		<input type="radio" name="optionsRadios" value="option2">
                     		Option two can be something else and selecting it will deselect option one
	                 	</label>
     	        	</div>
              </div>
            	<div class="col-lg-6">
              	<div class="checkbox">
                  	<label>
           				<input type="checkbox" name="superPower"> I want have super-power
               		</label>
                 	</div>
             		<div class="checkbox">
                  	<label>
                     	<input type="checkbox" name="moreSuperPower"> I have one or more super-power already
                   	</label>
                	</div>
           	</div>
        	</div>
     	</div>
       <div class="col-lg-12">
		</div>
		<noscript>
       	<input class="nocsript-finish-btn sf-right nocsript-sf-btn" type="submit" value="finish"/>
       </noscript>
 	</div>           
</fieldset>"""))
      }
    }
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}


}

/* test3 Template File */
object test3 extends test3_Scope0.test3
              /*
                  -- GENERATED --
                  DATE: Mon Sep 12 10:52:24 KST 2016
                  SOURCE: /home/ichthysNgs/app/views/test3.scala.html
                  HASH: 0f34f61888dba42f6ba014f07c01ade904b7de2e
                  MATRIX: 545->27|652->39|679->40
                  LINES: 20->2|25->2|26->3
                  -- GENERATED --
              */
          