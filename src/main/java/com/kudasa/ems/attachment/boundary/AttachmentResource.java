/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kudasa.ems.attachment.boundary;

import com.kudasa.ems.attachment.control.AttachmentService;
import com.kudasa.ems.attachment.entity.Attachment;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Abdussamad.Musa
 */
@Path("attachments")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AttachmentResource {

	@Inject
	AttachmentService as;

	@GET
	public Response getAttachments() {
		return Response.ok(as.getAttachments()).build();
	}

	@GET
	@Path("byEvent")
	public Response getAttachmentsByEvent(@QueryParam("eventId") Long eventId) {
		return Response.ok(as.getAttachmentsByEventId(eventId)).build();
	}

	@POST
	public Response addAttachment(Attachment attachment) {
		return Response.ok(as.addAttachment(attachment)).build();
	}

}
