
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object test2_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class test2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* test2 Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.14*/("""
"""),format.raw/*3.1*/("""<fieldset id="test2">
<input type="hidden" id="test2-val">
<legend>Condition</legend>
		<div class="form-group">
			<div class="radio">
       		<label>
       		<input type="radio" value="option1" name="condition" required>Yes, it is totaly right.
       		</label>
     		</div>
     	</div>
     	<div class="form-group">
     		<div class="radio">
      			<label>
      			<input type="radio" value="option2" name="condition" required>No, I check it twice and it is not right.
      			</label>
      		</div>
      	</div>		 
</fieldset>
"""))
      }
    }
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}


}

/* test2 Template File */
object test2 extends test2_Scope0.test2
              /*
                  -- GENERATED --
                  DATE: Mon Sep 12 10:52:24 KST 2016
                  SOURCE: /home/ichthysNgs/app/views/test2.scala.html
                  HASH: 595a1b6cb5acc451d30566523f1a17f0fe8e0889
                  MATRIX: 545->27|652->39|679->40
                  LINES: 20->2|25->2|26->3
                  -- GENERATED --
              */
          