package com.github.Pogryziony.TimeTracker.Data;


//Dla naszej encji definiujemy repozytorium JPA. Ponieważ będziemy wykonywać tylko podstawowe operacje, to nie jest konieczne definiowanie żadnych własnych metod


import com.github.Pogryziony.TimeTracker.Model.TimeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeDataRepository extends JpaRepository<TimeData,Long> {

}
