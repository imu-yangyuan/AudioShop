package com.audioshop.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.audioshop.dao.AudioDao;
import com.audioshop.model.Audio;
import com.audioshop.service.AudioService;

@Service("audioService")
public class AudioServiceImpl extends BaseServiceImpl<Audio> implements
		AudioService {
	private AudioDao audioDao;

	@Resource
	public void setAudioDao(AudioDao audioDao) {
		super.setBaseDao(audioDao);
		this.audioDao = audioDao;
	}

}
