package study.querydsl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter 
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id","username","age"})
public class Member {
	@Id 
	@GeneratedValue
	@Column(name = "member_id")
	private Long id;
	private String username;
	private int age;
	
	public Member(String username) {
		this.username = username;
	}

	
	public Member(String username,int age) {
		this.username = username;
		this.age = age;
	}
	
	
}