/*
 * 文 件 名:  IndexAction.java
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  卢慧 55318
 * 修改时间:  2015年8月25日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.wzl.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2015年8月25日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class IndexAction extends ActionSupport
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1125289887030944374L;
    
    private String username;

    private String password;
    
    private String result;

    public String execute()
    {
        result = "ad";
        System.out.println("haha");
        return ActionSupport.SUCCESS;
    }
    
    
    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getResult()
    {
        return result;
    }

    public void setResult(String result)
    {
        this.result = result;
    }

}
