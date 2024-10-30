package ru.shvyrkov.MySecondTestAppSpringBoot.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    @NotBlank
    private String uid;
    @NotBlank
    private String operationUid;
    private String systemName;
    private String systemTime;
    private String source;
    @Max(100000)
    @Min(1)
    private int communicationId;
    private int templateId;
    private int productCode;
    private int smsCode;
    private Instant timeOfReceipt;


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Request{");
        sb.append("uid='").append(uid).append('\'');
        sb.append(", operationUid='").append(operationUid).append('\'');
        sb.append(", systemName='").append(systemName).append('\'');
        sb.append(", systemTime='").append(systemTime).append('\'');
        sb.append(", source='").append(source).append('\'');
        sb.append(", communicationId=").append(communicationId);
        sb.append(", templateId=").append(templateId);
        sb.append(", productCode=").append(productCode);
        sb.append(", smsCode=").append(smsCode);
        sb.append(", timeOfReceipt=").append(timeOfReceipt);
        sb.append('}');
        return sb.toString();
    }
}
