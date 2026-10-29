package backtraceio.library.models.metrics;

import com.google.gson.annotations.SerializedName;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: classes.dex */
public final class UniqueEventsPayload extends EventsPayload<UniqueEvent> {

    @SerializedName("unique_events")
    private final ConcurrentLinkedDeque<UniqueEvent> uniqueEvents;

    public UniqueEventsPayload(ConcurrentLinkedDeque<UniqueEvent> concurrentLinkedDeque, String str, String str2) {
        super(str, str2);
        this.uniqueEvents = concurrentLinkedDeque;
    }

    @Override // backtraceio.library.models.metrics.EventsPayload
    public ConcurrentLinkedDeque<UniqueEvent> getEvents() {
        return this.uniqueEvents;
    }
}
