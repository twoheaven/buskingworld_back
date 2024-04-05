package com.buskingland.subpicture;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buskingland.text.Text;

public interface SubPictureRepository extends JpaRepository<SubPicture, Long> {

	List<SubPicture> findByText(Text text);
}