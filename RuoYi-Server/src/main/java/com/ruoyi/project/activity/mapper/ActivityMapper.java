package com.ruoyi.project.activity.mapper;

import java.util.List;
import com.ruoyi.project.activity.domain.Activity;

/**
 * 活动描述Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-02
 */
public interface ActivityMapper 
{
    /**
     * 查询活动描述
     * 
     * @param id 活动描述主键
     * @return 活动描述
     */
    public Activity selectActivityById(Long id);

    /**
     * 查询活动描述列表
     * 
     * @param activity 活动描述
     * @return 活动描述集合
     */
    public List<Activity> selectActivityList(Activity activity);

    /**
     * 新增活动描述
     * 
     * @param activity 活动描述
     * @return 结果
     */
    public int insertActivity(Activity activity);

    /**
     * 修改活动描述
     * 
     * @param activity 活动描述
     * @return 结果
     */
    public int updateActivity(Activity activity);

    /**
     * 删除活动描述
     * 
     * @param id 活动描述主键
     * @return 结果
     */
    public int deleteActivityById(Long id);

    /**
     * 批量删除活动描述
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteActivityByIds(Long[] ids);
}
