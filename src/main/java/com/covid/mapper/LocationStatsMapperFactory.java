package com.covid.mapper;

import java.util.Optional;

import org.apache.commons.csv.CSVRecord;

import com.covid.model.DailyReportsLocationStats;
import com.covid.model.LocationStats;

public class LocationStatsMapperFactory {

	private LocationStatsMapperFactory() {

	}

	public static Optional<LocationStats> mapToLocationStats(Object record) {
		if (record instanceof CSVRecord) {
			return CSVLocationStatsMapper.mapToLocationStats((CSVRecord) record);
		}

		return Optional.empty();
	}

	public static Optional<DailyReportsLocationStats> mapToDailyReportsLocationStats(Object record) {
		if (record instanceof CSVRecord) {
			return CSVLocationStatsMapper.mapToDailyReportsLocationStats((CSVRecord) record);
		}

		return Optional.empty();
	}
}
