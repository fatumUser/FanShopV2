package com.example.project_2.repositories.stripeRepo;

import com.example.project_2.entitys.stripeEntitys.StripeChargeDto;
import org.springframework.data.repository.CrudRepository;

public interface StripeChargeDtoRepo extends CrudRepository<StripeChargeDto, Long> {

}
