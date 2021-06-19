package com.wcode.datetransformation.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Utils {

    public static ZonedDateTime changeTimeZone(ZonedDateTime zonedDateTime,
                                        String timeZone) throws Exception{
        return ZonedDateTime.ofInstant(zonedDateTime.toInstant(), ZoneId.of(timeZone));
    }

    public static ZonedDateTime createZonedDateTimeWithSpecificTimeZone(Date date, String timeZone) throws Exception{
        return ZonedDateTime.of(date.getYear(), date.getMonth() + 1, date.getDay(), date.getHours(), date.getMinutes(),
                date.getSeconds(), 0, ZoneId.of(timeZone));

    }

    public static Date createTimeToDate(String time, String timeFormat) throws Exception{
        DateFormat dateFormat = new SimpleDateFormat(timeFormat);
        return dateFormat.parse(time);
    }

}
