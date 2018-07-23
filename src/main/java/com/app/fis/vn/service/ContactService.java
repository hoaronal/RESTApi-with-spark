package com.app.fis.vn.service;

import com.app.fis.vn.domain.Contact;
import com.app.fis.vn.domain.Message;
import com.app.fis.vn.repository.ContactRepository;
import com.app.fis.vn.repository.Repository;
import com.google.gson.Gson;
import spark.Request;

import java.util.List;

public class ContactService {

    private Repository<Long, Contact> repository;

    public ContactService() {
        this.repository = new ContactRepository();
    }

    public List<Contact> findAll() {
        return repository.findAll();
    }

    public Contact findById(Request request) {
        Long id = request.attribute("id");
        return repository.findById(id);
    }

    public Contact save(Request request, Gson gson) {
        Contact contact = gson.fromJson(request.body(), Contact.class);
        return repository.save(contact);
    }

    public Contact update(Request request, Gson gson) {
        Contact contact = gson.fromJson(request.body(), Contact.class);
        return repository.save(contact);
    }

    public Message delete(Request request) {
        Long id = request.attribute("id");
        repository.delete(id);
        return new Message("Contact with identifier " + id + " was deleted.");
    }

}