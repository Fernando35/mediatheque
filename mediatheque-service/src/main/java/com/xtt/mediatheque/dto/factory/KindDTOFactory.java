package com.xtt.mediatheque.dto.factory;

import com.xtt.mediatheque.dto.KindsDTO;
import com.xtt.mediatheque.model.MovieKindsEntity;

public interface KindDTOFactory {

	KindsDTO buildKindsDTO(MovieKindsEntity movieEntity);

}
