package com.reevoo.taglib;

import javax.servlet.jsp.JspException;
import java.io.IOException;


/**
 * Tag for adding a series product badge, using the parent SKU.
 * <p/>
 * Usage:
 * <p/>
 * <reevoo:productSeriesBadge sku="167823"/>  // will use the default.trkref set in the configuration properties file.
 * <reevoo:productSeriesBadge trkref="REV" sku="167823"/>
 * <reevoo:productSeriesBadge trkref="REV" sku="167823" variantName="undecorated"/>
 */
public class ReevooProductSeriesBadge extends AbstractBadgeTag {


    public void doTag() throws JspException {
        super.doTag();
        try {
            getJspContext().getOut().write(String.format("<a class=\"reevoomark%s\" href=\"%s/partner/%s/series:%s\">%s</a>",
                    getVariantName(), getBaseUrl(), trkref, sku, jspBody));
        } catch (IOException e) {
            throw new JspException(e);
        }
    }

}