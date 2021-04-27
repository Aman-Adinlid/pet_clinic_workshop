package se.lexicon.aman.pet_workshop.service;

import se.lexicon.aman.pet_workshop.dto.OwnerDto;
import se.lexicon.aman.pet_workshop.exception.DataNotFoundException;

import java.util.List;

public interface OwnerService {
    OwnerDto save(OwnerDto dto);

    OwnerDto update(OwnerDto dto) throws DataNotFoundException;

    OwnerDto findById(String id) throws DataNotFoundException;

    void deleteById(String id);

    List<OwnerDto> getAll();

    List<OwnerDto> advanceSearch(String firstName, String lastname);
}
