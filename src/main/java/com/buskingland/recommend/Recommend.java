package com.buskingland.recommend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recommend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String id1;
    private String id2;
    private String id3;
    private String id4;
    private String id5;
    private String id6;
    private String id7;
    private String id8;

	/**
	 * @return the id1
	 */
	public Long getid() {
		return id;
	}
	/**
	 * @param id1 the id1 to set
	 */
	public void setid(Long id) {
		this.id = id;
	}
    
    /**
	 * @return the id1
	 */
	public String getId1() {
		return id1;
	}
	/**
	 * @param id1 the id1 to set
	 */
	public void setId1(String id1) {
		this.id1 = id1;
	}
	/**
	 * @return the id2
	 */
	public String getId2() {
		return id2;
	}
	/**
	 * @param id2 the id2 to set
	 */
	public void setId2(String id2) {
		this.id2 = id2;
	}
	/**
	 * @return the id3
	 */
	public String getId3() {
		return id3;
	}
	/**
	 * @param id3 the id3 to set
	 */
	public void setId3(String id3) {
		this.id3 = id3;
	}
	/**
	 * @return the id4
	 */
	public String getId4() {
		return id4;
	}
	/**
	 * @param id4 the id4 to set
	 */
	public void setId4(String id4) {
		this.id4 = id4;
	}
	/**
	 * @return the id5
	 */
	public String getId5() {
		return id5;
	}
	/**
	 * @param id5 the id5 to set
	 */
	public void setId5(String id5) {
		this.id5 = id5;
	}
	/**
	 * @return the id6
	 */
	public String getId6() {
		return id6;
	}
	/**
	 * @param id6 the id6 to set
	 */
	public void setId6(String id6) {
		this.id6 = id6;
	}
	
    /**
	 * @return the id7
	 */
	public String getId7() {
		return id7;
	}
	/**
	 * @param id7 the id7 to set
	 */
	public void setId7(String id7) {
		this.id7 = id7;
	}
	
    /**
	 * @return the id8
	 */
	public String getId8() {
		return id8;
	}
	/**
	 * @param id8 the id8 to set
	 */
	public void setId8(String id8) {
		this.id8 = id8;
	}

    // 생성자, 게터, 세터 등을 추가할 수 있습니다.

    // getter와 setter 메서드는 id, id1, id2, id3, id4, id5, id6 필드에 대한 것입니다.
}