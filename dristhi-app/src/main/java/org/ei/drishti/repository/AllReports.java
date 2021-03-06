package org.ei.drishti.repository;

import org.ei.drishti.domain.Report;
import org.ei.drishti.domain.ReportIndicator;
import org.ei.drishti.dto.Action;

import java.util.ArrayList;
import java.util.List;

public class AllReports {
    private ReportRepository repository;

    public AllReports(ReportRepository repository) {
        this.repository = repository;
    }

    public void handleAction(Action action) {
        repository.update(new Report(action.type(), action.get("annualTarget"), action.get("monthlySummaries")));
    }

    public List<Report> allFor(List<ReportIndicator> indicators) {
        List<String> indicatorList = new ArrayList<String>();
        for (ReportIndicator indicator : indicators) {
            indicatorList.add(indicator.value());
        }
        return repository.allFor(indicatorList.toArray(new String[indicatorList.size()]));
    }
}
