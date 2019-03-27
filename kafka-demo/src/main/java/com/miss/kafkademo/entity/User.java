package com.miss.kafkademo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author miss
 * <p>
 * Created by miss on 2019/3/27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {


    private static final long serialVersionUID;

    static {
        serialVersionUID = -5890948902777537123L;
    }
}
