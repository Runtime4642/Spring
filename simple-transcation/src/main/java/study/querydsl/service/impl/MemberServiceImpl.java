package study.querydsl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import study.querydsl.entity.Member;
import study.querydsl.repository.MemberRepository;
import study.querydsl.service.MemberService;

@Service
@EnableAspectJAutoProxy
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberService2 service;
	
	public void insertService(String name) {
		service.serviceInsert1(name);
		service.serviceInsert2(name);
	}
	

}
