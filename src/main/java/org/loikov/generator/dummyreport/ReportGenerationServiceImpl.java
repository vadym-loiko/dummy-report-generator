package org.loikov.generator.dummyreport;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ReportGenerationServiceImpl implements ReportGenerationService {

    private KafkaTemplate<String, ReportGenerationResponse> kafkaTemplate;

    public ReportGenerationServiceImpl(KafkaTemplate<String, ReportGenerationResponse> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void notifyReportCompleted(String reportName) {
        kafkaTemplate.send("report-generation-completed", new ReportGenerationResponse(reportName));
    }

}
