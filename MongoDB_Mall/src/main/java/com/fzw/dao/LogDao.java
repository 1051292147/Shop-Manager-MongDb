package com.fzw.dao;

import com.fzw.entity.LoggerEntity;

import java.util.List;

public interface LogDao {
     void addLog(LoggerEntity loggerEntity);
     List<LoggerEntity> findAll();
}
