package com.pj.employee.service;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component("healthIndicatorImpl")
public class HealthIndicatorImpl implements HealthIndicator
{
	@Override
	public Health getHealth(boolean includeDetails)
	{
		return Health.up().build();
	}

	@Override
	public Health health()
	{
		return Health.up().build();
	}
}
