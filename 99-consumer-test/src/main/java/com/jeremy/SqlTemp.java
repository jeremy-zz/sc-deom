package com.jeremy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author jeremy.li
 * @date 2021/1/12
 * @description
 */
@Data
@AllArgsConstructor
public class SqlTemp {

    private String oldValue;
    private String newValue;

}
