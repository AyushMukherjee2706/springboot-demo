package com.example.springbootdemo.repository;

import com.example.springbootdemo.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.Nullable;

import java.lang.annotation.Native;
import java.util.List;

public interface RecordRepository extends JpaRepository<Record, Long> {
	@Query(value = "select project from record", nativeQuery = true)
	public List<String> findAllProjects();

	public List<Record> findByProject(String name);

	@Query(value = "SELECT * FROM Record as r WHERE (:location is null or  r.location IN (:location)) AND  (:module is null  or r.module IN (:module)) AND  (:tower is null  or r.tower IN (:tower)) AND  (:type_of_resource is null  or r.type_of_resource  IN (:type_of_resource ))", nativeQuery = true)
	public List<Record> findAllRecords(@Param("location") List<String> location,
									   @Param("module") List<String> module,
									   @Param("tower") List<String> tower,
									   @Param("type_of_resource") List<String> type_of_resource
									   );
}
