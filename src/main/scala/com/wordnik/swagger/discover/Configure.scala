package com.wordnik.swagger.discover

import com.wordnik.swagger.core.ApiOperation
import com.wordnik.swagger.core.ApiOperation._
import javax.ws.rs.core.Response
import javax.ws.rs.{POST, Path, GET}

/**
  * @author ayush
  * @since 11/15/11 8:13 PM
  *
  */
trait Configure {
  private val OK = "ok"

  @GET
  @Path("/logLevels")
  @ApiOperation(value = "Returns current log levels",
    responseClass = "String")
  def getLogLevels = Response.ok.entity(OK).build

  @POST
  @Path("/logLevels")
  @ApiOperation(value = "Sets current log levels",
    responseClass = "String")
  def setLogLevels = Response.ok.entity(OK).build
}