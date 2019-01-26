package com.video8.service.msg;

import java.util.List;

import com.video8.pojo.Bgm;

public interface BgmService {
	/**
	 * @Description: 查询背景音乐列表
	 */
	public List<Bgm> queryBgmList();
	
	/**
	 * @Description: 根据id查询bgm信息
	 */
	public Bgm queryBgmById(String bgmId);
}
