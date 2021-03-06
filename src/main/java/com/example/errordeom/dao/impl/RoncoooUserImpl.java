//package com.example.errordeom.dao.impl;
//
//import com.example.errordeom.bean.RoncooUser;
//import com.example.errordeom.dao.RoncooUserDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import javax.swing.*;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//@Repository
//public class RoncoooUserImpl implements RoncooUserDao  {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public int insert(RoncooUser roncooUser) {
//        String sql = "insert into roncoo_user (name, create_time) values (?, ?)";
//        return jdbcTemplate.update(sql, roncooUser.getName(),
//                roncooUser.getCreateTime());
//    }
//
//    @Override
//    public int deleteById(int id) {
//        String sql = "delete from roncoo_user where id=?";
//        return jdbcTemplate.update(sql, id);
//    }
//
//    @Override
//    public int updateById(RoncooUser roncooUser) {
//        String sql = "update roncoo_user set name=?, create_time=? where id=?";
//        return jdbcTemplate.update(sql, roncooUser.getName(),
//                roncooUser.getCreateTime(), roncooUser.getId());
//    }
//
//    @Override
//    public RoncooUser selectById(int id) {
//        String sql = "select * from roncoo_user where id=?";
//        return jdbcTemplate.queryForObject(sql, new RowMapper<RoncooUser>() {
//            @Override
//            public RoncooUser mapRow(ResultSet rs, int rowNum) throws SQLException {
//                RoncooUser roncooUser = new RoncooUser();
//                roncooUser.setId(rs.getInt("id"));
//                roncooUser.setName(rs.getString("name"));
//                roncooUser.setCreateTime(rs.getDate("create_time"));
//                return roncooUser;
//            }
//
//        }, id);
//
//    }
//}
