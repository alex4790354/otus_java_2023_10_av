package ru.otus.dataprocessor;

import ru.otus.model.Measurement;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public class ProcessorAggregator implements Processor {

    @Override
    public Map<String, Double> process(List<Measurement> data) {
        // groups the output list by name, while summing the value fields
        // группирует выходящий список по name, при этом суммирует поля value
        return Collections.emptyMap();
    }
}
