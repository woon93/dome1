package com.wrong.demo1.PO;

import java.util.ArrayList;
import java.util.List;

public class SysInfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysInfoPOExample() {
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

        public Criteria andNormidIsNull() {
            addCriterion("normID is null");
            return (Criteria) this;
        }

        public Criteria andNormidIsNotNull() {
            addCriterion("normID is not null");
            return (Criteria) this;
        }

        public Criteria andNormidEqualTo(String value) {
            addCriterion("normID =", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidNotEqualTo(String value) {
            addCriterion("normID <>", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidGreaterThan(String value) {
            addCriterion("normID >", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidGreaterThanOrEqualTo(String value) {
            addCriterion("normID >=", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidLessThan(String value) {
            addCriterion("normID <", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidLessThanOrEqualTo(String value) {
            addCriterion("normID <=", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidLike(String value) {
            addCriterion("normID like", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidNotLike(String value) {
            addCriterion("normID not like", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidIn(List<String> values) {
            addCriterion("normID in", values, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidNotIn(List<String> values) {
            addCriterion("normID not in", values, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidBetween(String value1, String value2) {
            addCriterion("normID between", value1, value2, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidNotBetween(String value1, String value2) {
            addCriterion("normID not between", value1, value2, "normid");
            return (Criteria) this;
        }

        public Criteria andClazidIsNull() {
            addCriterion("clazID is null");
            return (Criteria) this;
        }

        public Criteria andClazidIsNotNull() {
            addCriterion("clazID is not null");
            return (Criteria) this;
        }

        public Criteria andClazidEqualTo(String value) {
            addCriterion("clazID =", value, "clazid");
            return (Criteria) this;
        }

        public Criteria andClazidNotEqualTo(String value) {
            addCriterion("clazID <>", value, "clazid");
            return (Criteria) this;
        }

        public Criteria andClazidGreaterThan(String value) {
            addCriterion("clazID >", value, "clazid");
            return (Criteria) this;
        }

        public Criteria andClazidGreaterThanOrEqualTo(String value) {
            addCriterion("clazID >=", value, "clazid");
            return (Criteria) this;
        }

        public Criteria andClazidLessThan(String value) {
            addCriterion("clazID <", value, "clazid");
            return (Criteria) this;
        }

        public Criteria andClazidLessThanOrEqualTo(String value) {
            addCriterion("clazID <=", value, "clazid");
            return (Criteria) this;
        }

        public Criteria andClazidLike(String value) {
            addCriterion("clazID like", value, "clazid");
            return (Criteria) this;
        }

        public Criteria andClazidNotLike(String value) {
            addCriterion("clazID not like", value, "clazid");
            return (Criteria) this;
        }

        public Criteria andClazidIn(List<String> values) {
            addCriterion("clazID in", values, "clazid");
            return (Criteria) this;
        }

        public Criteria andClazidNotIn(List<String> values) {
            addCriterion("clazID not in", values, "clazid");
            return (Criteria) this;
        }

        public Criteria andClazidBetween(String value1, String value2) {
            addCriterion("clazID between", value1, value2, "clazid");
            return (Criteria) this;
        }

        public Criteria andClazidNotBetween(String value1, String value2) {
            addCriterion("clazID not between", value1, value2, "clazid");
            return (Criteria) this;
        }

        public Criteria andClazCommentIsNull() {
            addCriterion("claz_comment is null");
            return (Criteria) this;
        }

        public Criteria andClazCommentIsNotNull() {
            addCriterion("claz_comment is not null");
            return (Criteria) this;
        }

        public Criteria andClazCommentEqualTo(String value) {
            addCriterion("claz_comment =", value, "clazComment");
            return (Criteria) this;
        }

        public Criteria andClazCommentNotEqualTo(String value) {
            addCriterion("claz_comment <>", value, "clazComment");
            return (Criteria) this;
        }

        public Criteria andClazCommentGreaterThan(String value) {
            addCriterion("claz_comment >", value, "clazComment");
            return (Criteria) this;
        }

        public Criteria andClazCommentGreaterThanOrEqualTo(String value) {
            addCriterion("claz_comment >=", value, "clazComment");
            return (Criteria) this;
        }

        public Criteria andClazCommentLessThan(String value) {
            addCriterion("claz_comment <", value, "clazComment");
            return (Criteria) this;
        }

        public Criteria andClazCommentLessThanOrEqualTo(String value) {
            addCriterion("claz_comment <=", value, "clazComment");
            return (Criteria) this;
        }

        public Criteria andClazCommentLike(String value) {
            addCriterion("claz_comment like", value, "clazComment");
            return (Criteria) this;
        }

        public Criteria andClazCommentNotLike(String value) {
            addCriterion("claz_comment not like", value, "clazComment");
            return (Criteria) this;
        }

        public Criteria andClazCommentIn(List<String> values) {
            addCriterion("claz_comment in", values, "clazComment");
            return (Criteria) this;
        }

        public Criteria andClazCommentNotIn(List<String> values) {
            addCriterion("claz_comment not in", values, "clazComment");
            return (Criteria) this;
        }

        public Criteria andClazCommentBetween(String value1, String value2) {
            addCriterion("claz_comment between", value1, value2, "clazComment");
            return (Criteria) this;
        }

        public Criteria andClazCommentNotBetween(String value1, String value2) {
            addCriterion("claz_comment not between", value1, value2, "clazComment");
            return (Criteria) this;
        }

        public Criteria andNorm1IsNull() {
            addCriterion("norm1 is null");
            return (Criteria) this;
        }

        public Criteria andNorm1IsNotNull() {
            addCriterion("norm1 is not null");
            return (Criteria) this;
        }

        public Criteria andNorm1EqualTo(String value) {
            addCriterion("norm1 =", value, "norm1");
            return (Criteria) this;
        }

        public Criteria andNorm1NotEqualTo(String value) {
            addCriterion("norm1 <>", value, "norm1");
            return (Criteria) this;
        }

        public Criteria andNorm1GreaterThan(String value) {
            addCriterion("norm1 >", value, "norm1");
            return (Criteria) this;
        }

        public Criteria andNorm1GreaterThanOrEqualTo(String value) {
            addCriterion("norm1 >=", value, "norm1");
            return (Criteria) this;
        }

        public Criteria andNorm1LessThan(String value) {
            addCriterion("norm1 <", value, "norm1");
            return (Criteria) this;
        }

        public Criteria andNorm1LessThanOrEqualTo(String value) {
            addCriterion("norm1 <=", value, "norm1");
            return (Criteria) this;
        }

        public Criteria andNorm1Like(String value) {
            addCriterion("norm1 like", value, "norm1");
            return (Criteria) this;
        }

        public Criteria andNorm1NotLike(String value) {
            addCriterion("norm1 not like", value, "norm1");
            return (Criteria) this;
        }

        public Criteria andNorm1In(List<String> values) {
            addCriterion("norm1 in", values, "norm1");
            return (Criteria) this;
        }

        public Criteria andNorm1NotIn(List<String> values) {
            addCriterion("norm1 not in", values, "norm1");
            return (Criteria) this;
        }

        public Criteria andNorm1Between(String value1, String value2) {
            addCriterion("norm1 between", value1, value2, "norm1");
            return (Criteria) this;
        }

        public Criteria andNorm1NotBetween(String value1, String value2) {
            addCriterion("norm1 not between", value1, value2, "norm1");
            return (Criteria) this;
        }

        public Criteria andComment1IsNull() {
            addCriterion("comment1 is null");
            return (Criteria) this;
        }

        public Criteria andComment1IsNotNull() {
            addCriterion("comment1 is not null");
            return (Criteria) this;
        }

        public Criteria andComment1EqualTo(String value) {
            addCriterion("comment1 =", value, "comment1");
            return (Criteria) this;
        }

        public Criteria andComment1NotEqualTo(String value) {
            addCriterion("comment1 <>", value, "comment1");
            return (Criteria) this;
        }

        public Criteria andComment1GreaterThan(String value) {
            addCriterion("comment1 >", value, "comment1");
            return (Criteria) this;
        }

        public Criteria andComment1GreaterThanOrEqualTo(String value) {
            addCriterion("comment1 >=", value, "comment1");
            return (Criteria) this;
        }

        public Criteria andComment1LessThan(String value) {
            addCriterion("comment1 <", value, "comment1");
            return (Criteria) this;
        }

        public Criteria andComment1LessThanOrEqualTo(String value) {
            addCriterion("comment1 <=", value, "comment1");
            return (Criteria) this;
        }

        public Criteria andComment1Like(String value) {
            addCriterion("comment1 like", value, "comment1");
            return (Criteria) this;
        }

        public Criteria andComment1NotLike(String value) {
            addCriterion("comment1 not like", value, "comment1");
            return (Criteria) this;
        }

        public Criteria andComment1In(List<String> values) {
            addCriterion("comment1 in", values, "comment1");
            return (Criteria) this;
        }

        public Criteria andComment1NotIn(List<String> values) {
            addCriterion("comment1 not in", values, "comment1");
            return (Criteria) this;
        }

        public Criteria andComment1Between(String value1, String value2) {
            addCriterion("comment1 between", value1, value2, "comment1");
            return (Criteria) this;
        }

        public Criteria andComment1NotBetween(String value1, String value2) {
            addCriterion("comment1 not between", value1, value2, "comment1");
            return (Criteria) this;
        }

        public Criteria andNorm2IsNull() {
            addCriterion("norm2 is null");
            return (Criteria) this;
        }

        public Criteria andNorm2IsNotNull() {
            addCriterion("norm2 is not null");
            return (Criteria) this;
        }

        public Criteria andNorm2EqualTo(String value) {
            addCriterion("norm2 =", value, "norm2");
            return (Criteria) this;
        }

        public Criteria andNorm2NotEqualTo(String value) {
            addCriterion("norm2 <>", value, "norm2");
            return (Criteria) this;
        }

        public Criteria andNorm2GreaterThan(String value) {
            addCriterion("norm2 >", value, "norm2");
            return (Criteria) this;
        }

        public Criteria andNorm2GreaterThanOrEqualTo(String value) {
            addCriterion("norm2 >=", value, "norm2");
            return (Criteria) this;
        }

        public Criteria andNorm2LessThan(String value) {
            addCriterion("norm2 <", value, "norm2");
            return (Criteria) this;
        }

        public Criteria andNorm2LessThanOrEqualTo(String value) {
            addCriterion("norm2 <=", value, "norm2");
            return (Criteria) this;
        }

        public Criteria andNorm2Like(String value) {
            addCriterion("norm2 like", value, "norm2");
            return (Criteria) this;
        }

        public Criteria andNorm2NotLike(String value) {
            addCriterion("norm2 not like", value, "norm2");
            return (Criteria) this;
        }

        public Criteria andNorm2In(List<String> values) {
            addCriterion("norm2 in", values, "norm2");
            return (Criteria) this;
        }

        public Criteria andNorm2NotIn(List<String> values) {
            addCriterion("norm2 not in", values, "norm2");
            return (Criteria) this;
        }

        public Criteria andNorm2Between(String value1, String value2) {
            addCriterion("norm2 between", value1, value2, "norm2");
            return (Criteria) this;
        }

        public Criteria andNorm2NotBetween(String value1, String value2) {
            addCriterion("norm2 not between", value1, value2, "norm2");
            return (Criteria) this;
        }

        public Criteria andComment2IsNull() {
            addCriterion("comment2 is null");
            return (Criteria) this;
        }

        public Criteria andComment2IsNotNull() {
            addCriterion("comment2 is not null");
            return (Criteria) this;
        }

        public Criteria andComment2EqualTo(String value) {
            addCriterion("comment2 =", value, "comment2");
            return (Criteria) this;
        }

        public Criteria andComment2NotEqualTo(String value) {
            addCriterion("comment2 <>", value, "comment2");
            return (Criteria) this;
        }

        public Criteria andComment2GreaterThan(String value) {
            addCriterion("comment2 >", value, "comment2");
            return (Criteria) this;
        }

        public Criteria andComment2GreaterThanOrEqualTo(String value) {
            addCriterion("comment2 >=", value, "comment2");
            return (Criteria) this;
        }

        public Criteria andComment2LessThan(String value) {
            addCriterion("comment2 <", value, "comment2");
            return (Criteria) this;
        }

        public Criteria andComment2LessThanOrEqualTo(String value) {
            addCriterion("comment2 <=", value, "comment2");
            return (Criteria) this;
        }

        public Criteria andComment2Like(String value) {
            addCriterion("comment2 like", value, "comment2");
            return (Criteria) this;
        }

        public Criteria andComment2NotLike(String value) {
            addCriterion("comment2 not like", value, "comment2");
            return (Criteria) this;
        }

        public Criteria andComment2In(List<String> values) {
            addCriterion("comment2 in", values, "comment2");
            return (Criteria) this;
        }

        public Criteria andComment2NotIn(List<String> values) {
            addCriterion("comment2 not in", values, "comment2");
            return (Criteria) this;
        }

        public Criteria andComment2Between(String value1, String value2) {
            addCriterion("comment2 between", value1, value2, "comment2");
            return (Criteria) this;
        }

        public Criteria andComment2NotBetween(String value1, String value2) {
            addCriterion("comment2 not between", value1, value2, "comment2");
            return (Criteria) this;
        }

        public Criteria andNorm3IsNull() {
            addCriterion("norm3 is null");
            return (Criteria) this;
        }

        public Criteria andNorm3IsNotNull() {
            addCriterion("norm3 is not null");
            return (Criteria) this;
        }

        public Criteria andNorm3EqualTo(String value) {
            addCriterion("norm3 =", value, "norm3");
            return (Criteria) this;
        }

        public Criteria andNorm3NotEqualTo(String value) {
            addCriterion("norm3 <>", value, "norm3");
            return (Criteria) this;
        }

        public Criteria andNorm3GreaterThan(String value) {
            addCriterion("norm3 >", value, "norm3");
            return (Criteria) this;
        }

        public Criteria andNorm3GreaterThanOrEqualTo(String value) {
            addCriterion("norm3 >=", value, "norm3");
            return (Criteria) this;
        }

        public Criteria andNorm3LessThan(String value) {
            addCriterion("norm3 <", value, "norm3");
            return (Criteria) this;
        }

        public Criteria andNorm3LessThanOrEqualTo(String value) {
            addCriterion("norm3 <=", value, "norm3");
            return (Criteria) this;
        }

        public Criteria andNorm3Like(String value) {
            addCriterion("norm3 like", value, "norm3");
            return (Criteria) this;
        }

        public Criteria andNorm3NotLike(String value) {
            addCriterion("norm3 not like", value, "norm3");
            return (Criteria) this;
        }

        public Criteria andNorm3In(List<String> values) {
            addCriterion("norm3 in", values, "norm3");
            return (Criteria) this;
        }

        public Criteria andNorm3NotIn(List<String> values) {
            addCriterion("norm3 not in", values, "norm3");
            return (Criteria) this;
        }

        public Criteria andNorm3Between(String value1, String value2) {
            addCriterion("norm3 between", value1, value2, "norm3");
            return (Criteria) this;
        }

        public Criteria andNorm3NotBetween(String value1, String value2) {
            addCriterion("norm3 not between", value1, value2, "norm3");
            return (Criteria) this;
        }

        public Criteria andComment3IsNull() {
            addCriterion("comment3 is null");
            return (Criteria) this;
        }

        public Criteria andComment3IsNotNull() {
            addCriterion("comment3 is not null");
            return (Criteria) this;
        }

        public Criteria andComment3EqualTo(String value) {
            addCriterion("comment3 =", value, "comment3");
            return (Criteria) this;
        }

        public Criteria andComment3NotEqualTo(String value) {
            addCriterion("comment3 <>", value, "comment3");
            return (Criteria) this;
        }

        public Criteria andComment3GreaterThan(String value) {
            addCriterion("comment3 >", value, "comment3");
            return (Criteria) this;
        }

        public Criteria andComment3GreaterThanOrEqualTo(String value) {
            addCriterion("comment3 >=", value, "comment3");
            return (Criteria) this;
        }

        public Criteria andComment3LessThan(String value) {
            addCriterion("comment3 <", value, "comment3");
            return (Criteria) this;
        }

        public Criteria andComment3LessThanOrEqualTo(String value) {
            addCriterion("comment3 <=", value, "comment3");
            return (Criteria) this;
        }

        public Criteria andComment3Like(String value) {
            addCriterion("comment3 like", value, "comment3");
            return (Criteria) this;
        }

        public Criteria andComment3NotLike(String value) {
            addCriterion("comment3 not like", value, "comment3");
            return (Criteria) this;
        }

        public Criteria andComment3In(List<String> values) {
            addCriterion("comment3 in", values, "comment3");
            return (Criteria) this;
        }

        public Criteria andComment3NotIn(List<String> values) {
            addCriterion("comment3 not in", values, "comment3");
            return (Criteria) this;
        }

        public Criteria andComment3Between(String value1, String value2) {
            addCriterion("comment3 between", value1, value2, "comment3");
            return (Criteria) this;
        }

        public Criteria andComment3NotBetween(String value1, String value2) {
            addCriterion("comment3 not between", value1, value2, "comment3");
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