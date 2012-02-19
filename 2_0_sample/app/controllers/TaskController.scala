package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import views._

import models._


object TaskController extends Controller {
  
  val taskForm = Form(
      "label" -> nonEmptyText
  )
    
  def index = Action {
//    Ok("Hello world")
    Ok(views.html.tasks_index(Task.all(), taskForm))
  }
 
  def tasks = TODO
  
  def newTask = Action { implicit request =>
    taskForm.bindFromRequest.fold(
        errors => BadRequest(views.html.tasks_index(Task.all(), errors)),
        label => { 
          Task.create(label)
          Redirect(routes.TaskController.index)
        }
      )
  }
  
  def deleteTask(id: Long) = Action {
    Task.delete(id)
    Redirect(routes.TaskController.index)
  }

}