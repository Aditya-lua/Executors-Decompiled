package backtraceio.library.models.metrics;

import java.util.concurrent.ConcurrentLinkedDeque;
import mg.c;

/* JADX INFO: loaded from: classes.dex */
public class SummedEventsPayload extends EventsPayload<SummedEvent> {

    @c("summed_events")
    private final ConcurrentLinkedDeque<SummedEvent> summedEvents;

    public SummedEventsPayload(ConcurrentLinkedDeque<SummedEvent> concurrentLinkedDeque, String str, String str2) {
        super(str, str2);
        this.summedEvents = concurrentLinkedDeque;
    }

    @Override // backtraceio.library.models.metrics.EventsPayload
    public ConcurrentLinkedDeque<SummedEvent> getEvents() {
        return this.summedEvents;
    }
}
