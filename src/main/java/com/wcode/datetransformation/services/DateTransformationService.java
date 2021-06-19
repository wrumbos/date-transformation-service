package com.wcode.datetransformation.services;

import com.wcode.datetransformation.models.DateTransformation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;

import static com.wcode.datetransformation.constant.DateTransformationConst.*;
import static com.wcode.datetransformation.utils.Utils.*;

@Service
@AllArgsConstructor
public class DateTransformationService {

    public Optional<DateTransformation> dateTransformation(DateTransformation request) throws Exception {

        System.out.println(request.toString());

        Date dateFormat = createTimeToDate(request.getTime(), FORMAT_DATE_HH_mm_ss);
        ZonedDateTime dateTimeZone = createZonedDateTimeWithSpecificTimeZone(dateFormat, request.getTimeZone());
        ZonedDateTime dateChangeTimeZone = changeTimeZone(dateTimeZone, TIME_ZONE_UTC);

        DateTimeFormatter formatterResponse = DateTimeFormatter.ofPattern(FORMAT_DATE_HH_mm_ss);
        String response = dateChangeTimeZone.format(formatterResponse);

        return Optional.ofNullable(new DateTransformation(response, TIME_ZONE_UTC));
    }
}
