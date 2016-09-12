
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object validation_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class validation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* validation Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.14*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Step From Wizard - 11 - Validation example with jQuery Validation</title>
	<script src=""""),_display_(/*10.16*/routes/*10.22*/.Assets.versioned("plugins/jquery-2.1.4.min.js")),format.raw/*10.70*/(""""></script>
    <!-- bootstrap for better look example, but not necessary -->
    <link rel="stylesheet" href=""""),_display_(/*12.35*/routes/*12.41*/.Assets.versioned("plugins/bootstrap/css/bootstrap.min.css")),format.raw/*12.101*/("""" type="text/css" media="screen, projection">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <!-- Step Form Wizard plugin -->
    <link rel="stylesheet" href=""""),_display_(/*15.35*/routes/*15.41*/.Assets.versioned("step-form-wizard/css/step-form-wizard-all.css")),format.raw/*15.107*/("""" type="text/css" media="screen, projection">
    <script src=""""),_display_(/*16.19*/routes/*16.25*/.Assets.versioned("step-form-wizard/js/step-form-wizard.js")),format.raw/*16.85*/(""""></script>

    <!-- nicer scroll in steps -->
    <link rel="stylesheet" href=""""),_display_(/*19.35*/routes/*19.41*/.Assets.versioned("plugins/mcustom-scrollbar/jquery.mCustomScrollbar.min.css")),format.raw/*19.119*/("""">
    <script src=""""),_display_(/*20.19*/routes/*20.25*/.Assets.versioned("plugins/mcustom-scrollbar/jquery.mCustomScrollbar.concat.min.js")),format.raw/*20.109*/(""""></script>

	
    <!-- validation library http://jqueryvalidation.org/ -->
    <script src=""""),_display_(/*24.19*/routes/*24.25*/.Assets.versioned("plugins/jquery-validation/jquery.validate.min.js")),format.raw/*24.94*/(""""></script>
    <script src=""""),_display_(/*25.19*/routes/*25.25*/.Assets.versioned("step-form-wizard/js/create-json.js")),format.raw/*25.80*/(""""></script>
    <style>
        pre """),format.raw/*27.13*/("""{"""),format.raw/*27.14*/("""margin: 45px 0 60px;"""),format.raw/*27.34*/("""}"""),format.raw/*27.35*/("""
        """),format.raw/*28.9*/("""h1 """),format.raw/*28.12*/("""{"""),format.raw/*28.13*/("""margin: 60px 0 60px 0;"""),format.raw/*28.35*/("""}"""),format.raw/*28.36*/("""
        """),format.raw/*29.9*/("""p """),format.raw/*29.11*/("""{"""),format.raw/*29.12*/("""margin-bottom: 10px;"""),format.raw/*29.32*/("""}"""),format.raw/*29.33*/("""
        """),format.raw/*30.9*/(""".error """),format.raw/*30.16*/("""{"""),format.raw/*30.17*/("""color: #c7254e;"""),format.raw/*30.32*/("""}"""),format.raw/*30.33*/("""
    """),format.raw/*31.5*/("""</style>
</head>
<body>
<div class="container">
    <div class="site-index">
        <div class="body-content">
            <div class="row">
                <div class="col-md-12">
                    <h1>Validation example with jQuery Validation</h1>
                    <form id="wizard_example" action="">
                      	<fieldset>
                      		<div class="form-group">
									<label for="cpu">CPU</label>
									<input type="text" class="form-control" id="cpu" name="cpu" placeholder="cpu" required >
								</div>
								<div class="form-group">
									<label for="mem">MEM</label>
										<input type="mem" class="form-control" id="mem" name="mem" placeholder="mem" required >
								</div>
							</fieldset>
                        <fieldset>
                         <div class="checkbox">
                     	<label onclick="onClick('test');">
                        		<input type="checkbox" name="test" id="test" value="test" > test
                        	</label>
                      </div>
                      <div class="checkbox">
                      	<label onclick="onClick('test2');">
                      		<input type="checkbox" name="test2" id="test2" value="test2" > 111
                      	</label>
                      </div>
                      <div class="checkbox" >
                      	<label onclick="onClick('test3');">
                         	<input type="checkbox" name="test3" id="test3" value="test3" > 222
                        </label>
                      </div>
                        </fieldset>
                    </form>
                </div>
            </div>
		<!-- MODAL BOX -->
            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">         
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                        </div>
                        <div class="modal-body" id="modal-body">                    
                                <div id="wizard_example2">     
                                asdfsafsaf
									</div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" id="close-button" class="btn btn-default" data-dismiss="modal"  aria-hidden="true" id="modal-button" onclick="resetModal();">Close</button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END MODAL BOX -->

            <footer class="footer">
                <div class="container">
                    <p class="pull-left">© ajoke.cz/wizard 2015</p>
                </div>
            </footer>
        </div>
    </div>
</div>
</body>
</html>"""))
      }
    }
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}


}

/* validation Template File */
object validation extends validation_Scope0.validation
              /*
                  -- GENERATED --
                  DATE: Mon Sep 12 13:53:29 KST 2016
                  SOURCE: /home/ichthysNgs/app/views/validation.scala.html
                  HASH: 5b91e287b2123114e0449001153bb899951f1e51
                  MATRIX: 560->32|667->44|694->45|1029->353|1044->359|1113->407|1252->519|1267->525|1349->585|1589->798|1604->804|1692->870|1783->934|1798->940|1879->1000|1988->1082|2003->1088|2103->1166|2151->1187|2166->1193|2272->1277|2393->1371|2408->1377|2498->1446|2555->1476|2570->1482|2646->1537|2710->1573|2739->1574|2787->1594|2816->1595|2852->1604|2883->1607|2912->1608|2962->1630|2991->1631|3027->1640|3057->1642|3086->1643|3134->1663|3163->1664|3199->1673|3234->1680|3263->1681|3306->1696|3335->1697|3367->1702
                  LINES: 20->2|25->2|26->3|33->10|33->10|33->10|35->12|35->12|35->12|38->15|38->15|38->15|39->16|39->16|39->16|42->19|42->19|42->19|43->20|43->20|43->20|47->24|47->24|47->24|48->25|48->25|48->25|50->27|50->27|50->27|50->27|51->28|51->28|51->28|51->28|51->28|52->29|52->29|52->29|52->29|52->29|53->30|53->30|53->30|53->30|53->30|54->31
                  -- GENERATED --
              */
          