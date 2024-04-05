package com.buskingland.video;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buskingland.text.Text;

public interface VideoRepository extends JpaRepository<Video, Long> {

	List<Video> findByText(Text text);
}
