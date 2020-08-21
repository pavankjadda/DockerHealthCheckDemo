package com.pj.employee.web;

import com.pj.employee.service.HealthIndicatorImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Provides API endpoints to check application health
 *
 * @author Pavan Jadda
 * @since 2.0.0
 */
@RestController
@RequestMapping("/api/v1/health")
public class HealthController
{
	private final HealthIndicatorImpl healthIndicator;

	public HealthController(HealthIndicatorImpl healthIndicator)
	{
		this.healthIndicator = healthIndicator;
	}

	/*
		Return health status UP or DOWN
	 */
	@GetMapping("/find/status")
	public String getHealth()
	{
		return healthIndicator.getHealth(false).getStatus().getCode();
	}
}
