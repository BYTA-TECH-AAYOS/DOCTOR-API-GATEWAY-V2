 /*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bytatech.ayoos.web.rest;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.client.doctor.api.HospitalResourceApi;
import com.bytatech.ayoos.client.doctor.model.HospitalDTO;
import com.bytatech.ayoos.web.rest.errors.BadRequestAlertException;
import com.bytatech.ayoos.web.rest.util.HeaderUtil;

/**
 * TODO Provide a detailed description here 
 * @author MayaSanjeev
 * mayabytatech, maya.k.k@lxisoft.com
 */
@RestController
@RequestMapping("/api/commands")
public class CommandResource {
	
	  @Autowired
	    HospitalResourceApi api;
	
	 @PostMapping("/hospitals")
	    public ResponseEntity<HospitalDTO> createHospital(@RequestBody HospitalDTO hospitalDTO) throws URISyntaxException {
	       
	        if (hospitalDTO.getId() != null) {
	            throw new BadRequestAlertException("A new hospital cannot already have an ID", "hospital", "idexists");
	        }
	        ResponseEntity<HospitalDTO> hospitalEntity = api.createHospitalUsingPOST(hospitalDTO);
	        HospitalDTO result=  hospitalEntity.getBody();
	        return ResponseEntity.created(new URI("/api/hospitals/" + result.getId()))
	            .headers(HeaderUtil.createEntityCreationAlert("hospital", result.getId().toString()))
	            .body(result);
	    }
}
