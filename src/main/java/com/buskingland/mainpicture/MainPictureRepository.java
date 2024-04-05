package com.buskingland.mainpicture;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buskingland.text.Text;

public interface MainPictureRepository extends JpaRepository<MainPicture, Long> {

	MainPicture findByText(Text text);
    // 추가적인 메서드 정의 가능
}