package com.example.demo.Repository;

import com.example.demo.entity.CustomerRelation;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CustomerRelationRepository extends Neo4jRepository<CustomerRelation,Long> {
}