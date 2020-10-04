package org.loikov.generator.dummyreport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TopicListener {

    private final static Logger LOG = LoggerFactory.getLogger(TopicListener.class);

    private ReportGenerationService completionService;

    public TopicListener(ReportGenerationService completionService) {
        this.completionService = completionService;
    }

    @KafkaListener(topics = "task-generation-dummy-report", containerFactory = "kafkaListenerContainerFactory")
    public void listen(ReportGeneration message) {
        LOG.info("Message received " + message);
        completionService.notifyReportCompleted(message.getKey());
        System.out.println("Message received " + message);

    }

}
