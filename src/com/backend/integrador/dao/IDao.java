package com.backend.integrador.dao;
import java.util.List;

public interface IDao<T> {

    T registrar(T t);

    List<T> listarTodos();

}
