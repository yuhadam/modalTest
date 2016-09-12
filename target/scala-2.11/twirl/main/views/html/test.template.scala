
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object test_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* test Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.14*/("""
"""),format.raw/*3.1*/("""<fieldset id="test">
<input type="hidden" id="test-val">
<legend>Basic information</legend>
	<div class="row" >
		<div class="col-lg-6">
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label>
				<input type="email" class="form-control" id="exampleInputEmail1" name="exampleInputEmail1" placeholder="Enter email" required >
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label>
				<input type="password" class="form-control" id="exampleInputPassword1" name="exampleInputPassword1" placeholder="Password" required >
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password again</label>
				<input type="password" class="form-control" id="exampleInputPasswordAgain1" name="exampleInputPasswordAgain1" placeholder="Password" required>
			</div>
		</div>
		<div class="col-lg-6">
       	<div class="form-group">
           	<label for="exampleInputPassword1">Favorite number</label>
              <select class="form-control" name="favorite" required>
              	<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
              	</select>
			</div>
			<div class="form-group">
				<label>Own animals</label>
             	<div class="checkbox">
					<label>
						<input type="checkbox" name="animal[]" required> Goat
					</label>
				</div>
             	<div class="checkbox">
              	<label>
                 		<input type="checkbox" name="animal[]" > Cow
                 	</label>
             	</div>
              <div class="checkbox">
              	<label>
                  	<input type="checkbox" name="animal[]" > Rooster
                 	</label>
            	</div>
              <div class="checkbox">
              	<label>
                  	<input type="checkbox" name="animal[]" > Crocodile
                	</label>
             	</div>
       	</div>
     	</div>
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

/* test Template File */
object test extends test_Scope0.test
              /*
                  -- GENERATED --
                  DATE: Mon Sep 12 10:52:24 KST 2016
                  SOURCE: /home/ichthysNgs/app/views/test.scala.html
                  HASH: 745b849c9645f22fd10d52e7f493067cbbfaa16b
                  MATRIX: 542->26|649->38|676->39
                  LINES: 20->2|25->2|26->3
                  -- GENERATED --
              */
          