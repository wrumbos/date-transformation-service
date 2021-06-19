package com.wcode.datetransformation.controller;

import com.wcode.datetransformation.exception.ApiRequestException;
import com.wcode.datetransformation.models.DateTransformation;
import com.wcode.datetransformation.services.DateTransformationService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.wcode.datetransformation.constant.DateTransformationConst.ERROR_TRANSFOR_DATE;
import static com.wcode.datetransformation.constant.DateTransformationConst.LOG_TRANSFOR_DATE;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/date-transformation")
@AllArgsConstructor
public class DateTransformationController {

    private DateTransformationService dateTransformationService;

    private static final Logger logger = LoggerFactory.getLogger(DateTransformationController.class);

    @PostMapping("/UTC")
    public ResponseEntity dateTransformation(@RequestBody DateTransformation request) throws Exception {
        logger.info(LOG_TRANSFOR_DATE);
        return dateTransformationService.dateTransformation(request)
                .map(date -> ResponseEntity.ok(date))
                .orElseThrow(() -> new ApiRequestException(ERROR_TRANSFOR_DATE));
    }


}
