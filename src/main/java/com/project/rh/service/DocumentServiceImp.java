package com.project.rh.service;

import com.project.rh.model.Conge;
import com.project.rh.model.Document;
import com.project.rh.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImp implements IDocumentService  {

    @Autowired
    private DocumentRepository documentRepository;


    @Override
    public List<Document> findAllDocuments() {
        List<Document> Documents =  documentRepository.findAll();
        return Documents;
    }

    @Override
    public Document addDocument(Document d) {
        return documentRepository.save(d);
    }

    @Override
    public List<Document> findDocumentByUserId(Long Id) {
        List<Document> Documents =  documentRepository.findDocumentByUserId(Id);
        return Documents;
    }

    @Override
    public List<Document> findDocumentByTitle(String titre) {
        List<Document> Documents =  documentRepository.findDocumentByTitle(titre);
        return Documents;
    }

    @Override
    public List<Document> findByDocumentType(String type) {
        List<Document> Documents =  documentRepository.findByDocumentType(type);
        return Documents;
    }


}
