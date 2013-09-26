package com.ticetime.tdbase.roa

import org.lilie.services.eliot.tdbase.Sujet
import org.lilie.services.eliot.tdbase.importexport.SujetExporterService

class SujetController {

  SujetExporterService sujetExporterService

  def show() {
    //Sujet sujet = Sujet.get(params.id)
    render "hello world"
  }
}
