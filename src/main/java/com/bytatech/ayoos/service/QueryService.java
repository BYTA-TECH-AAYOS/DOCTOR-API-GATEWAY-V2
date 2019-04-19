package com.bytatech.ayoos.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bytatech.ayoos.client.doctor.domain.Doctor;


/*import com.diviso.graeshoppe.client.product.domain.Category;
import com.diviso.graeshoppe.client.product.domain.Product;
import com.diviso.graeshoppe.domain.Result;
*/
public interface QueryService {

	Doctor findDoctor(String searchTerm, Pageable pageable);

}
