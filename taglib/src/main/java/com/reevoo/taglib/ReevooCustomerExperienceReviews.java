package com.reevoo.taglib;

/**
 * Tag for adding embeddable customer experience reviews.
 *
 * Usage:
 *
 *      <reevoo:customerExperienceReviews/> // will use the default.trkref set in the configuration properties file.
 *      <reevoo:customerExperienceReviews trkref="CYS"/>
 *
 */
public class ReevooCustomerExperienceReviews extends AbstractReevooMarkClientTag {

    @Override
    protected String getContent() {
        return client.obtainReevooMarkData(trkref, null, buildUrl("customer.experience.reviews.url"), customParams("customer.experience.reviews.custom"));
    }

}


