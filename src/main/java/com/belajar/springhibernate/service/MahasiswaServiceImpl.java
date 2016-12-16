/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.springhibernate.service;

import com.belajar.springhibernate.dao.MahasiswaDao;
import com.belajar.springhibernate.model.Mahasiswa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author muhamad.fatah
 */
@Service("MahasiswaService")
@Transactional(readOnly = true)
public class MahasiswaServiceImpl implements MahasiswaService{

    @Autowired
    private MahasiswaDao mahasiswaDao;

    @Transactional
    @Override
    public void save(Mahasiswa mahasiswa) {
        mahasiswaDao.save(mahasiswa);
    }

    @Transactional
    @Override
    public void update(Mahasiswa mahasiswa) {
        mahasiswaDao.update(mahasiswa);
    }

    @Transactional
    @Override
    public void delete(Mahasiswa mahasiswa) {
        mahasiswaDao.delete(mahasiswa);
    }

    @Override
    public Mahasiswa getMahasiswa(String npm) {
        return mahasiswaDao.getMahasiswa(npm);
    }

    @Override
    public List<Mahasiswa> getMahasiswas() {
        return mahasiswaDao.getMahasiswas();
    }
    
}
