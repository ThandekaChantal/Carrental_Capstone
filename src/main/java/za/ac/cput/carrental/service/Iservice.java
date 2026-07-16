package za.ac.cput.carrental.service;

public interface Iservice <ID ,T>{
  T   create  (T t);
   T  read (ID id);
    T update (T t);
    boolean delete (ID id);

}
