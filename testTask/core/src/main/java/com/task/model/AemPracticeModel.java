package com.task.model;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AemPracticeModel {

    @ValueMapValue
    private String imagePath;

    @ValueMapValue
    private boolean isBackgroundImage;

    @ValueMapValue
    private String title;

    @Inject
    private List<NavigationItem> navigationItems;

    public String getImagePath() {
        return imagePath;
    }

    public boolean isBackgroundImage(){
        return isBackgroundImage;
    }

    public List<NavigationItem> getNavigationItems() {
        return navigationItems;
    }

    public String getTitle() {
        return title;
    }
}
