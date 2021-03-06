package com.lt.service;

import java.util.List;

import com.lt.pojo.FirstReply;

public interface IFirstReplyService {
	/**
	 * 查询全部的一级回复
	 * 
	 * @return
	 */
    List<FirstReply> selectAllFirstReplies();
    
    /**
     * 根据主键查询一级回复
     * 
     * @param fid
     * @return
     */
    FirstReply selectFirstReply(String fid);
    
    /**
     * 根据帖子ID查询一级回复
     * 
     * @param pId
     * @return
     */
    List<FirstReply> selectFirstReplyByPostId(String pId);
    
    /**
     * 根据用户ID查询一级回复
     * 
     * @param uId
     * @return
     */
    List<FirstReply> selectFirstReplyByUserId(String uId);
    
    /**
     * 添加一级回复
     * 
     * @param firstReply
     * @return
     */
    int insertFirstReply(FirstReply firstReply);
    
    /**
     * 更新一级回复
     * 
     * @param firstReply
     * @return
     */
    int updateFirstReply(FirstReply firstReply);
    
    /**
     * 根据主键编号删除一级回复
     * 
     * @param fid
     * @return
     */
    int deleteFirstReply(String fid);
    
    /**
     * 根据帖子编号删除一级回复
     * 
     * @param pId
     * @return
     */
    int deleteFirstReplyByPostId(String pId);
    
    /**
     * 根据用户编号删除一级回复
     * 
     * @param uid
     * @return
     */
    int deleteFirstReplyByUserId(String uid);
}
