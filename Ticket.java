package com.item.entity;

import javax.persistence.Table;

/**
 * @ClassName: Ticket
 * @Description TODO
 * @Author: jff
 * @Date: 2019-06-11 08:57
 * @Version: 1.0
 **/
@Table(name = "ttms_ticket")
public class Ticket {
    private Integer ticket_id ;
    private Integer seat_id ;
    private Integer schedule_id ;
    private Integer ticket_price ;
    private String ticket_code ;        //取票码

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public Integer getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(Integer seat_id) {
        this.seat_id = seat_id;
    }

    public Integer getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(Integer schedule_id) {
        this.schedule_id = schedule_id;
    }

    public Integer getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(Integer ticket_price) {
        this.ticket_price = ticket_price;
    }

    public String getTicket_code() {
        return ticket_code;
    }

    public void setTicket_code(String ticket_code) {
        this.ticket_code = ticket_code;
    }
}
