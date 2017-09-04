package de.alexfrei.springboot.goaero.service;


import de.alexfrei.springboot.goaero.domain.Suggestion;
import de.alexfrei.springboot.goaero.dto.CsvSuggestionDto;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
public class CsvSuggestionConverter {
    public CsvSuggestionDto toCsvSuggestionDto(@NonNull Suggestion input){

        CsvSuggestionDto dto = new CsvSuggestionDto();

        dto.setId(input.getId());
        dto.setName(input.getName());
        dto.setType(input.getType());
        dto.setLatitude(input.getGeoPosition().getLatitude());
        dto.setLongtitude(input.getGeoPosition().getLongtitude());



        return dto;
    }
}
