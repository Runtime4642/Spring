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
public class MemberService2  {
	
	@Autowired
	private MemberRepository mr;
	
	@Transactional
	public void serviceInsert1(String name) {
		System.out.println("insertService1:"+TransactionSynchronizationManager.getCurrentTransactionName());
		Member member = new Member("insert1_"+name);
		mr.save(member);
	}
	
	@Transactional
	public void serviceInsert2(String name) {
		String a = null;
		System.out.println("insertService2:"+TransactionSynchronizationManager.getCurrentTransactionName());
		Member member = new Member("insert2_"+name);
		mr.save(member);
		System.out.println(a.toString());
	}
	

}
