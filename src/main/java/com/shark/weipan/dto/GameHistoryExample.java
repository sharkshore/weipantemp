package com.shark.weipan.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameHistoryExample() {
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
            addCriterion("game_id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("game_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("game_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("game_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("game_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("game_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("game_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("game_id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("game_id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("game_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("game_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("game_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("game_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdIsNull() {
            addCriterion("goods_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdIsNotNull() {
            addCriterion("goods_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdEqualTo(Integer value) {
            addCriterion("goods_detail_id =", value, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdNotEqualTo(Integer value) {
            addCriterion("goods_detail_id <>", value, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdGreaterThan(Integer value) {
            addCriterion("goods_detail_id >", value, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_detail_id >=", value, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdLessThan(Integer value) {
            addCriterion("goods_detail_id <", value, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_detail_id <=", value, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdIn(List<Integer> values) {
            addCriterion("goods_detail_id in", values, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdNotIn(List<Integer> values) {
            addCriterion("goods_detail_id not in", values, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_detail_id between", value1, value2, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_detail_id not between", value1, value2, "goodsDetailId");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("game_direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("game_direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(Integer value) {
            addCriterion("game_direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(Integer value) {
            addCriterion("game_direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(Integer value) {
            addCriterion("game_direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(Integer value) {
            addCriterion("game_direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("game_direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<Integer> values) {
            addCriterion("game_direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<Integer> values) {
            addCriterion("game_direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(Integer value1, Integer value2) {
            addCriterion("game_direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("game_direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("game_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("game_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("game_begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("game_begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("game_begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("game_begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("game_begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("game_begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("game_begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("game_begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("game_begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("game_begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("game_end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("game_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("game_end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("game_end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("game_end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("game_end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("game_end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("game_end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("game_end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("game_end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("game_end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("game_end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyIsNull() {
            addCriterion("begin_money is null");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyIsNotNull() {
            addCriterion("begin_money is not null");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyEqualTo(Integer value) {
            addCriterion("begin_money =", value, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyNotEqualTo(Integer value) {
            addCriterion("begin_money <>", value, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyGreaterThan(Integer value) {
            addCriterion("begin_money >", value, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("begin_money >=", value, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyLessThan(Integer value) {
            addCriterion("begin_money <", value, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("begin_money <=", value, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyIn(List<Integer> values) {
            addCriterion("begin_money in", values, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyNotIn(List<Integer> values) {
            addCriterion("begin_money not in", values, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyBetween(Integer value1, Integer value2) {
            addCriterion("begin_money between", value1, value2, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andBeginMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("begin_money not between", value1, value2, "beginMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyIsNull() {
            addCriterion("end_money is null");
            return (Criteria) this;
        }

        public Criteria andEndMoneyIsNotNull() {
            addCriterion("end_money is not null");
            return (Criteria) this;
        }

        public Criteria andEndMoneyEqualTo(Integer value) {
            addCriterion("end_money =", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyNotEqualTo(Integer value) {
            addCriterion("end_money <>", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyGreaterThan(Integer value) {
            addCriterion("end_money >", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_money >=", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyLessThan(Integer value) {
            addCriterion("end_money <", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("end_money <=", value, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyIn(List<Integer> values) {
            addCriterion("end_money in", values, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyNotIn(List<Integer> values) {
            addCriterion("end_money not in", values, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyBetween(Integer value1, Integer value2) {
            addCriterion("end_money between", value1, value2, "endMoney");
            return (Criteria) this;
        }

        public Criteria andEndMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("end_money not between", value1, value2, "endMoney");
            return (Criteria) this;
        }

        public Criteria andTicketCostIsNull() {
            addCriterion("game_ticket_cost is null");
            return (Criteria) this;
        }

        public Criteria andTicketCostIsNotNull() {
            addCriterion("game_ticket_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTicketCostEqualTo(Integer value) {
            addCriterion("game_ticket_cost =", value, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostNotEqualTo(Integer value) {
            addCriterion("game_ticket_cost <>", value, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostGreaterThan(Integer value) {
            addCriterion("game_ticket_cost >", value, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_ticket_cost >=", value, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostLessThan(Integer value) {
            addCriterion("game_ticket_cost <", value, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostLessThanOrEqualTo(Integer value) {
            addCriterion("game_ticket_cost <=", value, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostIn(List<Integer> values) {
            addCriterion("game_ticket_cost in", values, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostNotIn(List<Integer> values) {
            addCriterion("game_ticket_cost not in", values, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostBetween(Integer value1, Integer value2) {
            addCriterion("game_ticket_cost between", value1, value2, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostNotBetween(Integer value1, Integer value2) {
            addCriterion("game_ticket_cost not between", value1, value2, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andResultTypeIsNull() {
            addCriterion("result_type is null");
            return (Criteria) this;
        }

        public Criteria andResultTypeIsNotNull() {
            addCriterion("result_type is not null");
            return (Criteria) this;
        }

        public Criteria andResultTypeEqualTo(Integer value) {
            addCriterion("result_type =", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotEqualTo(Integer value) {
            addCriterion("result_type <>", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeGreaterThan(Integer value) {
            addCriterion("result_type >", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_type >=", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeLessThan(Integer value) {
            addCriterion("result_type <", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeLessThanOrEqualTo(Integer value) {
            addCriterion("result_type <=", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeIn(List<Integer> values) {
            addCriterion("result_type in", values, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotIn(List<Integer> values) {
            addCriterion("result_type not in", values, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeBetween(Integer value1, Integer value2) {
            addCriterion("result_type between", value1, value2, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("result_type not between", value1, value2, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultGetMoneyIsNull() {
            addCriterion("result_get_money is null");
            return (Criteria) this;
        }

        public Criteria andResultGetMoneyIsNotNull() {
            addCriterion("result_get_money is not null");
            return (Criteria) this;
        }

        public Criteria andResultGetMoneyEqualTo(Integer value) {
            addCriterion("result_get_money =", value, "resultGetMoney");
            return (Criteria) this;
        }

        public Criteria andResultGetMoneyNotEqualTo(Integer value) {
            addCriterion("result_get_money <>", value, "resultGetMoney");
            return (Criteria) this;
        }

        public Criteria andResultGetMoneyGreaterThan(Integer value) {
            addCriterion("result_get_money >", value, "resultGetMoney");
            return (Criteria) this;
        }

        public Criteria andResultGetMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_get_money >=", value, "resultGetMoney");
            return (Criteria) this;
        }

        public Criteria andResultGetMoneyLessThan(Integer value) {
            addCriterion("result_get_money <", value, "resultGetMoney");
            return (Criteria) this;
        }

        public Criteria andResultGetMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("result_get_money <=", value, "resultGetMoney");
            return (Criteria) this;
        }

        public Criteria andResultGetMoneyIn(List<Integer> values) {
            addCriterion("result_get_money in", values, "resultGetMoney");
            return (Criteria) this;
        }

        public Criteria andResultGetMoneyNotIn(List<Integer> values) {
            addCriterion("result_get_money not in", values, "resultGetMoney");
            return (Criteria) this;
        }

        public Criteria andResultGetMoneyBetween(Integer value1, Integer value2) {
            addCriterion("result_get_money between", value1, value2, "resultGetMoney");
            return (Criteria) this;
        }

        public Criteria andResultGetMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("result_get_money not between", value1, value2, "resultGetMoney");
            return (Criteria) this;
        }

        public Criteria andExtraMoneyIsNull() {
            addCriterion("extra_money is null");
            return (Criteria) this;
        }

        public Criteria andExtraMoneyIsNotNull() {
            addCriterion("extra_money is not null");
            return (Criteria) this;
        }

        public Criteria andExtraMoneyEqualTo(Integer value) {
            addCriterion("extra_money =", value, "extraMoney");
            return (Criteria) this;
        }

        public Criteria andExtraMoneyNotEqualTo(Integer value) {
            addCriterion("extra_money <>", value, "extraMoney");
            return (Criteria) this;
        }

        public Criteria andExtraMoneyGreaterThan(Integer value) {
            addCriterion("extra_money >", value, "extraMoney");
            return (Criteria) this;
        }

        public Criteria andExtraMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("extra_money >=", value, "extraMoney");
            return (Criteria) this;
        }

        public Criteria andExtraMoneyLessThan(Integer value) {
            addCriterion("extra_money <", value, "extraMoney");
            return (Criteria) this;
        }

        public Criteria andExtraMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("extra_money <=", value, "extraMoney");
            return (Criteria) this;
        }

        public Criteria andExtraMoneyIn(List<Integer> values) {
            addCriterion("extra_money in", values, "extraMoney");
            return (Criteria) this;
        }

        public Criteria andExtraMoneyNotIn(List<Integer> values) {
            addCriterion("extra_money not in", values, "extraMoney");
            return (Criteria) this;
        }

        public Criteria andExtraMoneyBetween(Integer value1, Integer value2) {
            addCriterion("extra_money between", value1, value2, "extraMoney");
            return (Criteria) this;
        }

        public Criteria andExtraMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("extra_money not between", value1, value2, "extraMoney");
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