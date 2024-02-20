package com.example.inboxapp.folders;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FolderRepository extends CrudRepository<Folder, String> {


}
