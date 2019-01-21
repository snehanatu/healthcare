package com.techtalentsouthhealthCare.healthCare;

import org.springframework.data.repository.CrudRepository;

import com.techtalentsouthhealthCare.healthCare.Patient;

public interface PatientRepository extends CrudRepository<Patient,Long> {

}
