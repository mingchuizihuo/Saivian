package com.xiao.work.saivian.commonmodule.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class DictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictionaryExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameIsNull() {
            addCriterion("dictionary_name is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameIsNotNull() {
            addCriterion("dictionary_name is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameEqualTo(String value) {
            addCriterion("dictionary_name =", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameNotEqualTo(String value) {
            addCriterion("dictionary_name <>", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameGreaterThan(String value) {
            addCriterion("dictionary_name >", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_name >=", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameLessThan(String value) {
            addCriterion("dictionary_name <", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameLessThanOrEqualTo(String value) {
            addCriterion("dictionary_name <=", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameLike(String value) {
            addCriterion("dictionary_name like", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameNotLike(String value) {
            addCriterion("dictionary_name not like", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameIn(List<String> values) {
            addCriterion("dictionary_name in", values, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameNotIn(List<String> values) {
            addCriterion("dictionary_name not in", values, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameBetween(String value1, String value2) {
            addCriterion("dictionary_name between", value1, value2, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameNotBetween(String value1, String value2) {
            addCriterion("dictionary_name not between", value1, value2, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueIsNull() {
            addCriterion("dictionary_value is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueIsNotNull() {
            addCriterion("dictionary_value is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueEqualTo(String value) {
            addCriterion("dictionary_value =", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueNotEqualTo(String value) {
            addCriterion("dictionary_value <>", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueGreaterThan(String value) {
            addCriterion("dictionary_value >", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueGreaterThanOrEqualTo(String value) {
            addCriterion("dictionary_value >=", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueLessThan(String value) {
            addCriterion("dictionary_value <", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueLessThanOrEqualTo(String value) {
            addCriterion("dictionary_value <=", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueLike(String value) {
            addCriterion("dictionary_value like", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueNotLike(String value) {
            addCriterion("dictionary_value not like", value, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueIn(List<String> values) {
            addCriterion("dictionary_value in", values, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueNotIn(List<String> values) {
            addCriterion("dictionary_value not in", values, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueBetween(String value1, String value2) {
            addCriterion("dictionary_value between", value1, value2, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryValueNotBetween(String value1, String value2) {
            addCriterion("dictionary_value not between", value1, value2, "dictionaryValue");
            return (Criteria) this;
        }

        public Criteria andDictionaryLevelIsNull() {
            addCriterion("dictionary_level is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryLevelIsNotNull() {
            addCriterion("dictionary_level is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryLevelEqualTo(Byte value) {
            addCriterion("dictionary_level =", value, "dictionaryLevel");
            return (Criteria) this;
        }

        public Criteria andDictionaryLevelNotEqualTo(Byte value) {
            addCriterion("dictionary_level <>", value, "dictionaryLevel");
            return (Criteria) this;
        }

        public Criteria andDictionaryLevelGreaterThan(Byte value) {
            addCriterion("dictionary_level >", value, "dictionaryLevel");
            return (Criteria) this;
        }

        public Criteria andDictionaryLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("dictionary_level >=", value, "dictionaryLevel");
            return (Criteria) this;
        }

        public Criteria andDictionaryLevelLessThan(Byte value) {
            addCriterion("dictionary_level <", value, "dictionaryLevel");
            return (Criteria) this;
        }

        public Criteria andDictionaryLevelLessThanOrEqualTo(Byte value) {
            addCriterion("dictionary_level <=", value, "dictionaryLevel");
            return (Criteria) this;
        }

        public Criteria andDictionaryLevelIn(List<Byte> values) {
            addCriterion("dictionary_level in", values, "dictionaryLevel");
            return (Criteria) this;
        }

        public Criteria andDictionaryLevelNotIn(List<Byte> values) {
            addCriterion("dictionary_level not in", values, "dictionaryLevel");
            return (Criteria) this;
        }

        public Criteria andDictionaryLevelBetween(Byte value1, Byte value2) {
            addCriterion("dictionary_level between", value1, value2, "dictionaryLevel");
            return (Criteria) this;
        }

        public Criteria andDictionaryLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("dictionary_level not between", value1, value2, "dictionaryLevel");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Long value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Long value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Long value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Long value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Long value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Long value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Long> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Long> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Long value1, Long value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Long value1, Long value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidpathIsNull() {
            addCriterion("tidpath is null");
            return (Criteria) this;
        }

        public Criteria andTidpathIsNotNull() {
            addCriterion("tidpath is not null");
            return (Criteria) this;
        }

        public Criteria andTidpathEqualTo(String value) {
            addCriterion("tidpath =", value, "tidpath");
            return (Criteria) this;
        }

        public Criteria andTidpathNotEqualTo(String value) {
            addCriterion("tidpath <>", value, "tidpath");
            return (Criteria) this;
        }

        public Criteria andTidpathGreaterThan(String value) {
            addCriterion("tidpath >", value, "tidpath");
            return (Criteria) this;
        }

        public Criteria andTidpathGreaterThanOrEqualTo(String value) {
            addCriterion("tidpath >=", value, "tidpath");
            return (Criteria) this;
        }

        public Criteria andTidpathLessThan(String value) {
            addCriterion("tidpath <", value, "tidpath");
            return (Criteria) this;
        }

        public Criteria andTidpathLessThanOrEqualTo(String value) {
            addCriterion("tidpath <=", value, "tidpath");
            return (Criteria) this;
        }

        public Criteria andTidpathLike(String value) {
            addCriterion("tidpath like", value, "tidpath");
            return (Criteria) this;
        }

        public Criteria andTidpathNotLike(String value) {
            addCriterion("tidpath not like", value, "tidpath");
            return (Criteria) this;
        }

        public Criteria andTidpathIn(List<String> values) {
            addCriterion("tidpath in", values, "tidpath");
            return (Criteria) this;
        }

        public Criteria andTidpathNotIn(List<String> values) {
            addCriterion("tidpath not in", values, "tidpath");
            return (Criteria) this;
        }

        public Criteria andTidpathBetween(String value1, String value2) {
            addCriterion("tidpath between", value1, value2, "tidpath");
            return (Criteria) this;
        }

        public Criteria andTidpathNotBetween(String value1, String value2) {
            addCriterion("tidpath not between", value1, value2, "tidpath");
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