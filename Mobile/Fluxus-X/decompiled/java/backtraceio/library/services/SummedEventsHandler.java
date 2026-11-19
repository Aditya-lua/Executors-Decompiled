package backtraceio.library.services;

import android.os.Message;
import backtraceio.library.interfaces.Api;
import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.SummedEvent;
import backtraceio.library.models.metrics.SummedEventsPayload;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: classes.dex */
public class SummedEventsHandler extends BacktraceEventsHandler<SummedEvent> {
    private static final transient String LOG_TAG = "SummedEventsHandler";
    private static final String urlPrefix = "summed-events";

    public SummedEventsHandler(BacktraceMetrics backtraceMetrics, Api api, BacktraceHandlerThread backtraceHandlerThread) {
        super(backtraceMetrics, api, backtraceHandlerThread, urlPrefix);
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public /* bridge */ /* synthetic */ int getMaximumNumberOfEvents() {
        return super.getMaximumNumberOfEvents();
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler, android.os.Handler
    public /* bridge */ /* synthetic */ void handleMessage(Message message) {
        super.handleMessage(message);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // backtraceio.library.services.BacktraceEventsHandler
    public void onMaximumAttemptsReached(ConcurrentLinkedDeque<SummedEvent> concurrentLinkedDeque) {
        if (this.events.size() + concurrentLinkedDeque.size() < getMaximumNumberOfEvents()) {
            Iterator<SummedEvent> it = concurrentLinkedDeque.iterator();
            while (it.hasNext()) {
                this.events.addFirst(it.next());
            }
        }
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public /* bridge */ /* synthetic */ void send() {
        super.send();
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public void sendEvents(ConcurrentLinkedDeque<SummedEvent> concurrentLinkedDeque) {
        this.api.sendEventsPayload(getEventsPayload());
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public void sendEventsPayload(EventsPayload<SummedEvent> eventsPayload) {
        this.api.sendEventsPayload((SummedEventsPayload) eventsPayload);
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public /* bridge */ /* synthetic */ void setMaximumNumberOfEvents(int i10) {
        super.setMaximumNumberOfEvents(i10);
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public SummedEventsPayload getEventsPayload() {
        Map<String, String> mapCreateLocalAttributes = this.backtraceMetrics.createLocalAttributes(null);
        Iterator it = this.events.iterator();
        while (it.hasNext()) {
            ((SummedEvent) it.next()).addAttributes(mapCreateLocalAttributes);
        }
        SummedEventsPayload summedEventsPayload = new SummedEventsPayload(new ConcurrentLinkedDeque(this.events), this.backtraceMetrics.getApplicationName(), this.backtraceMetrics.getApplicationVersion());
        this.events.clear();
        return summedEventsPayload;
    }
}
