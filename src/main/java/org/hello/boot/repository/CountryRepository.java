package org.hello.boot.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hello.boot.entity.Country;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class CountryRepository {
	@PersistenceContext	
	private EntityManager entityManager;	
	
	@SuppressWarnings("unchecked")
	public List<Country> getAll(){
		return (List<Country>) entityManager.createQuery("from Country").getResultList();
	}
	
	public Country getByID(String code){
		return (Country)entityManager.createQuery("from Country where code = :code")
				.setParameter("code", code).getSingleResult();
	}
	
	public Country getByName(String name){
		return (Country)entityManager.createQuery("from Country where name = :name")
				.setParameter("name", name).getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Country> getByContinent(String continent){
		return (List<Country>) entityManager.createQuery("from Country where continent = :continent")
				.setParameter("continent", continent).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Country> getByRegion(String region){
		return (List<Country>) entityManager.createQuery("from Country where region = :region")
				.setParameter("region", region).getResultList();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Country> getByCountryLessGNP(float gnp){
		return (List<Country>) entityManager.createQuery("from Country where gnp <= :gnp")
				.setParameter("gnp", gnp).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Country> getByCountryGreateGNP(float gnp){
		return (List<Country>) entityManager.createQuery("from Country where gnp >= :gnp")
				.setParameter("gnp", gnp).getResultList();
	}
	
}
