package org.jsecurity.common.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  base for MyToStringStyle
 */
public class MyToStringStyle extends org.apache.commons.lang.builder.ToStringStyle {
    private static final long serialVersionUID = 1L;

    public static final org.apache.commons.lang.builder.ToStringStyle STYLE=new MyToStringStyle();
    private static final DateFormat DATE_FORMAT= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * <p>Constructor.</p>
     *
     * <p>Use the static constant rather than instantiating.</p>
     */
    MyToStringStyle() {
        super();
        this.setUseShortClassName(true);
        this.setUseIdentityHashCode(false);
    }

    /**
     * <p>Ensure <code>Singleton</ode> after serialization.</p>
     * @return the singleton
     */
    private Object readResolve() {
        return STYLE;
    }

    @Override
    protected void appendDetail(StringBuffer buffer, String fieldName, Object value) {
        if (value instanceof Date) {
            value = DATE_FORMAT.format(value);
        }
        buffer.append(value);
    }

}

