package com.example.project_2.repositories.stripeRepo;

import com.example.project_2.entitys.stripeEntitys.StripeTokenDto;
import org.springframework.data.repository.CrudRepository;

public interface StripeTokenDtoRepo extends CrudRepository<StripeTokenDto, Long> {

}
