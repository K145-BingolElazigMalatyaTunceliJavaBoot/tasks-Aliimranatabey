package com.fourthweek.ToDoList.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.fourthweek.ToDoList.model.Activites;

@RepositoryRestResource(path = "activites")
public interface ActivitesRepository extends JpaRepository<Activites, UUID>, JpaSpecificationExecutor<Activites> {

    @Query("SELECT a FROM Activites a WHERE "
			+ "(:startDate = '' OR :startDate IS NULL OR to_date(to_char(a.date, 'DD-MM-YYYY'),'DD-MM-YYYY') >= to_date(:startDate,'DD-MM-YYYY')) AND "
            + "(:endDate = '' OR :endDate IS NULL OR to_date(to_char(a.date, 'DD-MM-YYYY'),'DD-MM-YYYY') <= to_date(:endDate,'DD-MM-YYYY'))")
	@RestResource(path = "getActivites")
	public List<Activites> getActivites(@Param("startDate") String startDate, @Param("endDate") String endDate);

    public List<Activites> findAllByDoneTrue();
}
