package com.fzw.service;

import com.fzw.entity.LoggerEntity;

import java.util.List;

public interface LogService {
    void addLog(LoggerEntity loggerEntity);
    List<LoggerEntity> findAll();

}
