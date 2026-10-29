package backtraceio.library.interfaces;

import backtraceio.library.events.EventsOnServerResponseEventListener;
import backtraceio.library.events.EventsRequestHandler;
import backtraceio.library.models.BacktraceMetricsSettings;
import backtraceio.library.models.metrics.SummedEvent;
import backtraceio.library.models.metrics.UniqueEvent;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: classes.dex */
public interface Metrics {
    boolean addSummedEvent(String str);

    boolean addSummedEvent(String str, Map<String, Object> map);

    boolean addUniqueEvent(String str);

    boolean addUniqueEvent(String str, Map<String, Object> map);

    int count();

    void enable();

    void enable(BacktraceMetricsSettings backtraceMetricsSettings);

    void enable(BacktraceMetricsSettings backtraceMetricsSettings, String str);

    void enable(String str);

    ConcurrentLinkedDeque<SummedEvent> getSummedEvents();

    ConcurrentLinkedDeque<UniqueEvent> getUniqueEvents();

    void send();

    void sendStartupEvent();

    void setMaximumNumberOfEvents(int i10);

    void setSummedEventsOnServerResponse(EventsOnServerResponseEventListener eventsOnServerResponseEventListener);

    void setSummedEventsRequestHandler(EventsRequestHandler eventsRequestHandler);

    void setUniqueEventsOnServerResponse(EventsOnServerResponseEventListener eventsOnServerResponseEventListener);

    void setUniqueEventsRequestHandler(EventsRequestHandler eventsRequestHandler);
}
