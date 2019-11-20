package com.eshopper.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor

public class CustomerOrderDTO {
    private List<OrderDTO> orderDTOS = new ArrayList<>();

    public CustomerOrderDTO()
    {
        orderDTOS = new ArrayList<>();
    }
}
