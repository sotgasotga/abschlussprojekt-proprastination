package mops.model.classes.webclasses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class WebDistributorApplicant {

    private String username;
    private String id;
    private String type;
    private boolean checked;
    private boolean collapsed;
    private String fullName;
    private List<WebDistributorApplication> webDistributorApplications;
    private String distributorHours;
}
