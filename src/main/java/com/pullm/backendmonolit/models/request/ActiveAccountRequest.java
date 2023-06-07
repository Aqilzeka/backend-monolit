package com.pullm.backendmonolit.models.request;

import com.pullm.backendmonolit.validations.PhoneNumber;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActiveAccountRequest {

  @PhoneNumber
  @NotNull(message = "Phone number cannot be null")
  @NotEmpty(message = "Phone number cannot be empty")
  private String phoneNumber;

  @NotNull(message = "OTP cannot be null")
//  @Min(value = 4, message = "OTP cannot be less than 4 characters")
//  @Max(value = 5, message = "OTP cannot be greater than 5 characters")
  private Integer otp;
}