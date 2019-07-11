package com.wrong.demo1.PO;

import java.util.ArrayList;
import java.util.List;

public class UrzInfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UrzInfoPOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUrzidIsNull() {
            addCriterion("urzID is null");
            return (Criteria) this;
        }

        public Criteria andUrzidIsNotNull() {
            addCriterion("urzID is not null");
            return (Criteria) this;
        }

        public Criteria andUrzidEqualTo(String value) {
            addCriterion("urzID =", value, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidNotEqualTo(String value) {
            addCriterion("urzID <>", value, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidGreaterThan(String value) {
            addCriterion("urzID >", value, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidGreaterThanOrEqualTo(String value) {
            addCriterion("urzID >=", value, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidLessThan(String value) {
            addCriterion("urzID <", value, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidLessThanOrEqualTo(String value) {
            addCriterion("urzID <=", value, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidLike(String value) {
            addCriterion("urzID like", value, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidNotLike(String value) {
            addCriterion("urzID not like", value, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidIn(List<String> values) {
            addCriterion("urzID in", values, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidNotIn(List<String> values) {
            addCriterion("urzID not in", values, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidBetween(String value1, String value2) {
            addCriterion("urzID between", value1, value2, "urzid");
            return (Criteria) this;
        }

        public Criteria andUrzidNotBetween(String value1, String value2) {
            addCriterion("urzID not between", value1, value2, "urzid");
            return (Criteria) this;
        }

        public Criteria andPermissionsIsNull() {
            addCriterion("permissions is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsIsNotNull() {
            addCriterion("permissions is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsEqualTo(Integer value) {
            addCriterion("permissions =", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsNotEqualTo(Integer value) {
            addCriterion("permissions <>", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsGreaterThan(Integer value) {
            addCriterion("permissions >", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("permissions >=", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsLessThan(Integer value) {
            addCriterion("permissions <", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsLessThanOrEqualTo(Integer value) {
            addCriterion("permissions <=", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsIn(List<Integer> values) {
            addCriterion("permissions in", values, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsNotIn(List<Integer> values) {
            addCriterion("permissions not in", values, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsBetween(Integer value1, Integer value2) {
            addCriterion("permissions between", value1, value2, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsNotBetween(Integer value1, Integer value2) {
            addCriterion("permissions not between", value1, value2, "permissions");
            return (Criteria) this;
        }

        public Criteria andAccoutIsNull() {
            addCriterion("accout is null");
            return (Criteria) this;
        }

        public Criteria andAccoutIsNotNull() {
            addCriterion("accout is not null");
            return (Criteria) this;
        }

        public Criteria andAccoutEqualTo(String value) {
            addCriterion("accout =", value, "accout");
            return (Criteria) this;
        }

        public Criteria andAccoutNotEqualTo(String value) {
            addCriterion("accout <>", value, "accout");
            return (Criteria) this;
        }

        public Criteria andAccoutGreaterThan(String value) {
            addCriterion("accout >", value, "accout");
            return (Criteria) this;
        }

        public Criteria andAccoutGreaterThanOrEqualTo(String value) {
            addCriterion("accout >=", value, "accout");
            return (Criteria) this;
        }

        public Criteria andAccoutLessThan(String value) {
            addCriterion("accout <", value, "accout");
            return (Criteria) this;
        }

        public Criteria andAccoutLessThanOrEqualTo(String value) {
            addCriterion("accout <=", value, "accout");
            return (Criteria) this;
        }

        public Criteria andAccoutLike(String value) {
            addCriterion("accout like", value, "accout");
            return (Criteria) this;
        }

        public Criteria andAccoutNotLike(String value) {
            addCriterion("accout not like", value, "accout");
            return (Criteria) this;
        }

        public Criteria andAccoutIn(List<String> values) {
            addCriterion("accout in", values, "accout");
            return (Criteria) this;
        }

        public Criteria andAccoutNotIn(List<String> values) {
            addCriterion("accout not in", values, "accout");
            return (Criteria) this;
        }

        public Criteria andAccoutBetween(String value1, String value2) {
            addCriterion("accout between", value1, value2, "accout");
            return (Criteria) this;
        }

        public Criteria andAccoutNotBetween(String value1, String value2) {
            addCriterion("accout not between", value1, value2, "accout");
            return (Criteria) this;
        }

        public Criteria andPazwordIsNull() {
            addCriterion("pazword is null");
            return (Criteria) this;
        }

        public Criteria andPazwordIsNotNull() {
            addCriterion("pazword is not null");
            return (Criteria) this;
        }

        public Criteria andPazwordEqualTo(String value) {
            addCriterion("pazword =", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordNotEqualTo(String value) {
            addCriterion("pazword <>", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordGreaterThan(String value) {
            addCriterion("pazword >", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordGreaterThanOrEqualTo(String value) {
            addCriterion("pazword >=", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordLessThan(String value) {
            addCriterion("pazword <", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordLessThanOrEqualTo(String value) {
            addCriterion("pazword <=", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordLike(String value) {
            addCriterion("pazword like", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordNotLike(String value) {
            addCriterion("pazword not like", value, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordIn(List<String> values) {
            addCriterion("pazword in", values, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordNotIn(List<String> values) {
            addCriterion("pazword not in", values, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordBetween(String value1, String value2) {
            addCriterion("pazword between", value1, value2, "pazword");
            return (Criteria) this;
        }

        public Criteria andPazwordNotBetween(String value1, String value2) {
            addCriterion("pazword not between", value1, value2, "pazword");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPartyIsNull() {
            addCriterion("party is null");
            return (Criteria) this;
        }

        public Criteria andPartyIsNotNull() {
            addCriterion("party is not null");
            return (Criteria) this;
        }

        public Criteria andPartyEqualTo(String value) {
            addCriterion("party =", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotEqualTo(String value) {
            addCriterion("party <>", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyGreaterThan(String value) {
            addCriterion("party >", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyGreaterThanOrEqualTo(String value) {
            addCriterion("party >=", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLessThan(String value) {
            addCriterion("party <", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLessThanOrEqualTo(String value) {
            addCriterion("party <=", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLike(String value) {
            addCriterion("party like", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotLike(String value) {
            addCriterion("party not like", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyIn(List<String> values) {
            addCriterion("party in", values, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotIn(List<String> values) {
            addCriterion("party not in", values, "party");
            return (Criteria) this;
        }

        public Criteria andPartyBetween(String value1, String value2) {
            addCriterion("party between", value1, value2, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotBetween(String value1, String value2) {
            addCriterion("party not between", value1, value2, "party");
            return (Criteria) this;
        }

        public Criteria andHometownIsNull() {
            addCriterion("hometown is null");
            return (Criteria) this;
        }

        public Criteria andHometownIsNotNull() {
            addCriterion("hometown is not null");
            return (Criteria) this;
        }

        public Criteria andHometownEqualTo(String value) {
            addCriterion("hometown =", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotEqualTo(String value) {
            addCriterion("hometown <>", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownGreaterThan(String value) {
            addCriterion("hometown >", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownGreaterThanOrEqualTo(String value) {
            addCriterion("hometown >=", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLessThan(String value) {
            addCriterion("hometown <", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLessThanOrEqualTo(String value) {
            addCriterion("hometown <=", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLike(String value) {
            addCriterion("hometown like", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotLike(String value) {
            addCriterion("hometown not like", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownIn(List<String> values) {
            addCriterion("hometown in", values, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotIn(List<String> values) {
            addCriterion("hometown not in", values, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownBetween(String value1, String value2) {
            addCriterion("hometown between", value1, value2, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotBetween(String value1, String value2) {
            addCriterion("hometown not between", value1, value2, "hometown");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andPortraiturlIsNull() {
            addCriterion("portraitURL is null");
            return (Criteria) this;
        }

        public Criteria andPortraiturlIsNotNull() {
            addCriterion("portraitURL is not null");
            return (Criteria) this;
        }

        public Criteria andPortraiturlEqualTo(String value) {
            addCriterion("portraitURL =", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlNotEqualTo(String value) {
            addCriterion("portraitURL <>", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlGreaterThan(String value) {
            addCriterion("portraitURL >", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlGreaterThanOrEqualTo(String value) {
            addCriterion("portraitURL >=", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlLessThan(String value) {
            addCriterion("portraitURL <", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlLessThanOrEqualTo(String value) {
            addCriterion("portraitURL <=", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlLike(String value) {
            addCriterion("portraitURL like", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlNotLike(String value) {
            addCriterion("portraitURL not like", value, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlIn(List<String> values) {
            addCriterion("portraitURL in", values, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlNotIn(List<String> values) {
            addCriterion("portraitURL not in", values, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlBetween(String value1, String value2) {
            addCriterion("portraitURL between", value1, value2, "portraiturl");
            return (Criteria) this;
        }

        public Criteria andPortraiturlNotBetween(String value1, String value2) {
            addCriterion("portraitURL not between", value1, value2, "portraiturl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}