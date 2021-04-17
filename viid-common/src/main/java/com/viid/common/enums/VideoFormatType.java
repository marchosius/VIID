/*
 * Copyright (c) 2020 qian.he Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.viid.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * VideoFormatType
 * 视频格式
 *
 * @author qian.he
 * @version 0.1.0
 * @date 2021/4/13
 * @since 0.1.0
 **/

@Getter
public enum VideoFormatType {

    /**
     * 序号	消息中取值	说明
     * 1	Mpg	MPG
     * 2	Mov	MOV
     * 3	Avi	AVI
     * 4	Rm	RM
     * 5	Rmvb	RMVB
     * 6	Flv	FLV
     * 7	Vob	VOB
     * 8	M2ts	M2TS
     * 9	Mp4	MP4
     * 10	Es	ES
     * 11	Ps	PS
     * 12	Ts	TS文件
     * 13	Other	其他
     */

    MPG("Mpg", "MPG"),
    MOV("Mov", "MOV"),
    AVI("Avi", "AVI"),
    RM("Rm", "RM"),
    RMVB("Rmvb", "RMVB"),
    FLV("Flv", "FLV"),
    VOB("Vob", "VOB"),
    M2TS("M2ts", "M2TS"),
    MP4("Mp4", "MP4"),
    ES("Es", "ES"),
    PS("Ps", "PS"),
    TS("Ts", "TS文件"),
    OTHER("Other", "其他");


    @JsonValue
    @EnumValue
    private final String code;

    private final String desc;

    VideoFormatType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
