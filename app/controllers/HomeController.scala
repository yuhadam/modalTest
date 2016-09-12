package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.validation())
  }
  def getHtml(data:String) = Action{
    implicit request =>
      val text= "views.html."+data
       
      Logger.debug(text)
      if(data=="test")
         Ok(views.html.test())
      else if(data=="test2")
          Ok(views.html.test2())
      else 
          Ok(views.html.test3())
    
  }
}
