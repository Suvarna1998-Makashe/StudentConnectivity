package com.Task.Student123.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Task.Student123.Entities.Data;

public interface  Repo extends JpaRepository<Data,Integer> {

}
