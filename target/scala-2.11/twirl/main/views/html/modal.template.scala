
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object modal_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class modal extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* modal Template File */
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
   
   
    <script>
    
    </script>
    <style>
        pre """),format.raw/*32.13*/("""{"""),format.raw/*32.14*/("""margin: 45px 0 60px;"""),format.raw/*32.34*/("""}"""),format.raw/*32.35*/("""
        """),format.raw/*33.9*/("""h1 """),format.raw/*33.12*/("""{"""),format.raw/*33.13*/("""margin: 60px 0 60px 0;"""),format.raw/*33.35*/("""}"""),format.raw/*33.36*/("""
        """),format.raw/*34.9*/("""p """),format.raw/*34.11*/("""{"""),format.raw/*34.12*/("""margin-bottom: 10px;"""),format.raw/*34.32*/("""}"""),format.raw/*34.33*/("""
        """),format.raw/*35.9*/(""".error """),format.raw/*35.16*/("""{"""),format.raw/*35.17*/("""color: #c7254e;"""),format.raw/*35.32*/("""}"""),format.raw/*35.33*/("""

        
    """),format.raw/*38.5*/("""</style>

</head>
<body>
<div class="container">
    <div class="site-index">
        <div class="body-content">

            <div class="row">
                <div class="col-md-12">
                	   <form id="consitute-form" enctype='application/json'>
                	     <div class="checkbox">
                     	<label onclick="main.onClick('test');">
                        		<input type="checkbox" name="test" id="test" value="test" > test
                        	</label>
                      </div>
                      <div class="checkbox">
                      	<label onclick="main.onClick('test2');">
                      		<input type="checkbox" name="test2" id="test2" value="test2" > 111
                      	</label>
                      </div>
                      <div class="checkbox" >
                      	<label onclick="main.onClick('test3');">
                         	<input type="checkbox" name="test3" id="test3" value="test3" > 222
                        </label>
                      </div>
                    	 <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" id="modal-button" onclick="main.getKeys();">
                            Launch modal
                    	 </button>
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
<script>

</script>
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

/* modal Template File */
object modal extends modal_Scope0.modal
              /*
                  -- GENERATED --
                  DATE: Mon Sep 12 14:02:54 KST 2016
                  SOURCE: /home/ichthysNgs/app/views/modal.scala.html
                  HASH: 1c25758129dd5aa501ffaa81e950b863675adde9
                  MATRIX: 545->27|652->39|679->40|1018->352|1033->358|1102->406|1241->518|1256->524|1338->584|1578->797|1593->803|1681->869|1772->933|1787->939|1868->999|1977->1081|1992->1087|2092->1165|2140->1186|2155->1192|2261->1276|2382->1370|2397->1376|2487->1445|2544->1475|2559->1481|2635->1536|2739->1612|2768->1613|2816->1633|2845->1634|2881->1643|2912->1646|2941->1647|2991->1669|3020->1670|3056->1679|3086->1681|3115->1682|3163->1702|3192->1703|3228->1712|3263->1719|3292->1720|3335->1735|3364->1736|3406->1751
                  LINES: 20->2|25->2|26->3|33->10|33->10|33->10|35->12|35->12|35->12|38->15|38->15|38->15|39->16|39->16|39->16|42->19|42->19|42->19|43->20|43->20|43->20|47->24|47->24|47->24|48->25|48->25|48->25|55->32|55->32|55->32|55->32|56->33|56->33|56->33|56->33|56->33|57->34|57->34|57->34|57->34|57->34|58->35|58->35|58->35|58->35|58->35|61->38
                  -- GENERATED --
              */
          