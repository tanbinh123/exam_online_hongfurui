package com.itdupan.api;

import com.itdupan.bean.ResultBean;
import com.itdupan.pojo.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface SubjectApi {

    /**
     * 通过id查询
     *
     * @param subjectId
     * @return
     */
    @GetMapping("subject/findSubjectById")
    public ResultBean<Subject> findSubjectById(@RequestParam("subjectId") Long subjectId);

}
