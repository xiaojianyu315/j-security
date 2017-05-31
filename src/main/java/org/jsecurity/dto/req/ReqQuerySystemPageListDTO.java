package org.jsecurity.dto.req;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.jsecurity.common.util.MyToStringStyle;

import java.io.Serializable;

/**
 * Created by xiaojianyu on 16/12/4.
 */
public class ReqQuerySystemPageListDTO extends ReqPageDTO implements Serializable {

    private static final long serialVersionUID = -8684964435556308913L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, MyToStringStyle.STYLE);
    }
}
