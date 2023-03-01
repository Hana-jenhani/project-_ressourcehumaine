package com.project.rh.service;


import com.project.rh.model.Document;


import java.util.List;

public interface IDocumentService {
    List<Document> findAllDocuments();

    Document addDocument(Document d);

    List<Document> findDocumentByUserId(Long Id);

    List<Document> findDocumentByTitle(String titre);

    List<Document> findByDocumentType(String type);

}
