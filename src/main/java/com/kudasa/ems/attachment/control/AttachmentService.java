/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kudasa.ems.attachment.control;

import com.kudasa.ems.attachment.entity.Attachment;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 *
 * @author Abdussamad.Musa
 */
@Transactional
public class AttachmentService {

	@PersistenceContext(unitName = "AttachmentDS")
	EntityManager em;

	public List<Attachment> getAttachments() {
		return em.createQuery("SELECT a FROM Attachment a", Attachment.class).getResultList();
	}

	public Attachment addAttachment(Attachment attachment) {
		em.persist(attachment);
		return attachment;
	}

	public List<Attachment> getAttachmentsByEventId(Long eventId) {
		return em.createNamedQuery("Attachments.byEventId", Attachment.class).setParameter("eventId", eventId).getResultList();
	}

}
