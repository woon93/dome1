package com.wrong.demo1.PO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class databankPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public databankPOExample() {
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

        public Criteria andResourceurlIsNull() {
            addCriterion("resourceURL is null");
            return (Criteria) this;
        }

        public Criteria andResourceurlIsNotNull() {
            addCriterion("resourceURL is not null");
            return (Criteria) this;
        }

        public Criteria andResourceurlEqualTo(String value) {
            addCriterion("resourceURL =", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlNotEqualTo(String value) {
            addCriterion("resourceURL <>", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlGreaterThan(String value) {
            addCriterion("resourceURL >", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlGreaterThanOrEqualTo(String value) {
            addCriterion("resourceURL >=", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlLessThan(String value) {
            addCriterion("resourceURL <", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlLessThanOrEqualTo(String value) {
            addCriterion("resourceURL <=", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlLike(String value) {
            addCriterion("resourceURL like", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlNotLike(String value) {
            addCriterion("resourceURL not like", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlIn(List<String> values) {
            addCriterion("resourceURL in", values, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlNotIn(List<String> values) {
            addCriterion("resourceURL not in", values, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlBetween(String value1, String value2) {
            addCriterion("resourceURL between", value1, value2, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlNotBetween(String value1, String value2) {
            addCriterion("resourceURL not between", value1, value2, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andLimitIsNull() {
            addCriterion("limit is null");
            return (Criteria) this;
        }

        public Criteria andLimitIsNotNull() {
            addCriterion("limit is not null");
            return (Criteria) this;
        }

        public Criteria andLimitEqualTo(Integer value) {
            addCriterion("limit =", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotEqualTo(Integer value) {
            addCriterion("limit <>", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThan(Integer value) {
            addCriterion("limit >", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit >=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThan(Integer value) {
            addCriterion("limit <", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThanOrEqualTo(Integer value) {
            addCriterion("limit <=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitIn(List<Integer> values) {
            addCriterion("limit in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotIn(List<Integer> values) {
            addCriterion("limit not in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitBetween(Integer value1, Integer value2) {
            addCriterion("limit between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("limit not between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andCreateUrzidIsNull() {
            addCriterion("create_urzID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUrzidIsNotNull() {
            addCriterion("create_urzID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUrzidEqualTo(String value) {
            addCriterion("create_urzID =", value, "createUrzid");
            return (Criteria) this;
        }

        public Criteria andCreateUrzidNotEqualTo(String value) {
            addCriterion("create_urzID <>", value, "createUrzid");
            return (Criteria) this;
        }

        public Criteria andCreateUrzidGreaterThan(String value) {
            addCriterion("create_urzID >", value, "createUrzid");
            return (Criteria) this;
        }

        public Criteria andCreateUrzidGreaterThanOrEqualTo(String value) {
            addCriterion("create_urzID >=", value, "createUrzid");
            return (Criteria) this;
        }

        public Criteria andCreateUrzidLessThan(String value) {
            addCriterion("create_urzID <", value, "createUrzid");
            return (Criteria) this;
        }

        public Criteria andCreateUrzidLessThanOrEqualTo(String value) {
            addCriterion("create_urzID <=", value, "createUrzid");
            return (Criteria) this;
        }

        public Criteria andCreateUrzidLike(String value) {
            addCriterion("create_urzID like", value, "createUrzid");
            return (Criteria) this;
        }

        public Criteria andCreateUrzidNotLike(String value) {
            addCriterion("create_urzID not like", value, "createUrzid");
            return (Criteria) this;
        }

        public Criteria andCreateUrzidIn(List<String> values) {
            addCriterion("create_urzID in", values, "createUrzid");
            return (Criteria) this;
        }

        public Criteria andCreateUrzidNotIn(List<String> values) {
            addCriterion("create_urzID not in", values, "createUrzid");
            return (Criteria) this;
        }

        public Criteria andCreateUrzidBetween(String value1, String value2) {
            addCriterion("create_urzID between", value1, value2, "createUrzid");
            return (Criteria) this;
        }

        public Criteria andCreateUrzidNotBetween(String value1, String value2) {
            addCriterion("create_urzID not between", value1, value2, "createUrzid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUrzidIsNull() {
            addCriterion("update_urzID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUrzidIsNotNull() {
            addCriterion("update_urzID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUrzidEqualTo(String value) {
            addCriterion("update_urzID =", value, "updateUrzid");
            return (Criteria) this;
        }

        public Criteria andUpdateUrzidNotEqualTo(String value) {
            addCriterion("update_urzID <>", value, "updateUrzid");
            return (Criteria) this;
        }

        public Criteria andUpdateUrzidGreaterThan(String value) {
            addCriterion("update_urzID >", value, "updateUrzid");
            return (Criteria) this;
        }

        public Criteria andUpdateUrzidGreaterThanOrEqualTo(String value) {
            addCriterion("update_urzID >=", value, "updateUrzid");
            return (Criteria) this;
        }

        public Criteria andUpdateUrzidLessThan(String value) {
            addCriterion("update_urzID <", value, "updateUrzid");
            return (Criteria) this;
        }

        public Criteria andUpdateUrzidLessThanOrEqualTo(String value) {
            addCriterion("update_urzID <=", value, "updateUrzid");
            return (Criteria) this;
        }

        public Criteria andUpdateUrzidLike(String value) {
            addCriterion("update_urzID like", value, "updateUrzid");
            return (Criteria) this;
        }

        public Criteria andUpdateUrzidNotLike(String value) {
            addCriterion("update_urzID not like", value, "updateUrzid");
            return (Criteria) this;
        }

        public Criteria andUpdateUrzidIn(List<String> values) {
            addCriterion("update_urzID in", values, "updateUrzid");
            return (Criteria) this;
        }

        public Criteria andUpdateUrzidNotIn(List<String> values) {
            addCriterion("update_urzID not in", values, "updateUrzid");
            return (Criteria) this;
        }

        public Criteria andUpdateUrzidBetween(String value1, String value2) {
            addCriterion("update_urzID between", value1, value2, "updateUrzid");
            return (Criteria) this;
        }

        public Criteria andUpdateUrzidNotBetween(String value1, String value2) {
            addCriterion("update_urzID not between", value1, value2, "updateUrzid");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNull() {
            addCriterion("delFlag is null");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNotNull() {
            addCriterion("delFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDelflagEqualTo(String value) {
            addCriterion("delFlag =", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotEqualTo(String value) {
            addCriterion("delFlag <>", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThan(String value) {
            addCriterion("delFlag >", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThanOrEqualTo(String value) {
            addCriterion("delFlag >=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThan(String value) {
            addCriterion("delFlag <", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThanOrEqualTo(String value) {
            addCriterion("delFlag <=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLike(String value) {
            addCriterion("delFlag like", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotLike(String value) {
            addCriterion("delFlag not like", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagIn(List<String> values) {
            addCriterion("delFlag in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotIn(List<String> values) {
            addCriterion("delFlag not in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagBetween(String value1, String value2) {
            addCriterion("delFlag between", value1, value2, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotBetween(String value1, String value2) {
            addCriterion("delFlag not between", value1, value2, "delflag");
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