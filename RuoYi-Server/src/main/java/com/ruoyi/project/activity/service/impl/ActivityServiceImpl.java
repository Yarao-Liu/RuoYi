package com.ruoyi.project.activity.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.activity.mapper.ActivityMapper;
import com.ruoyi.project.activity.domain.Activity;
import com.ruoyi.project.activity.service.IActivityService;

/**
 * 活动描述Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-02
 */
@Service
public class ActivityServiceImpl implements IActivityService 
{
    @Autowired
    private ActivityMapper activityMapper;

    /**
     * 查询活动描述
     * 
     * @param id 活动描述主键
     * @return 活动描述
     */
    @Override
    public Activity selectActivityById(Long id)
    {
        return activityMapper.selectActivityById(id);
    }

    /**
     * 查询活动描述列表
     * 
     * @param activity 活动描述
     * @return 活动描述
     */
    @Override
    public List<Activity> selectActivityList(Activity activity)
    {
        return activityMapper.selectActivityList(activity);
    }

    /**
     * 新增活动描述
     * 
     * @param activity 活动描述
     * @return 结果
     */
    @Override
    public int insertActivity(Activity activity)
    {
        return activityMapper.insertActivity(activity);
    }

    /**
     * 修改活动描述
     * 
     * @param activity 活动描述
     * @return 结果
     */
    @Override
    public int updateActivity(Activity activity)
    {
        return activityMapper.updateActivity(activity);
    }

    /**
     * 批量删除活动描述
     * 
     * @param ids 需要删除的活动描述主键
     * @return 结果
     */
    @Override
    public int deleteActivityByIds(Long[] ids)
    {
        return activityMapper.deleteActivityByIds(ids);
    }

    /**
     * 删除活动描述信息
     * 
     * @param id 活动描述主键
     * @return 结果
     */
    @Override
    public int deleteActivityById(Long id)
    {
        return activityMapper.deleteActivityById(id);
    }
}
