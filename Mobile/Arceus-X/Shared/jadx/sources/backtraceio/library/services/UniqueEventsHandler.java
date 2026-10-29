package backtraceio.library.services;

import android.os.Message;
import backtraceio.library.common.BacktraceTimeHelper;
import backtraceio.library.interfaces.Api;
import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.UniqueEvent;
import backtraceio.library.models.metrics.UniqueEventsPayload;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: classes.dex */
public class UniqueEventsHandler extends BacktraceEventsHandler<UniqueEvent> {
    private static final transient String LOG_TAG = "UniqueEventsHandler";
    private static final String urlPrefix = "unique-events";

    public UniqueEventsHandler(BacktraceMetrics backtraceMetrics, Api api, BacktraceHandlerThread backtraceHandlerThread) {
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

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public /* bridge */ /* synthetic */ void send() {
        super.send();
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public void sendEvents(ConcurrentLinkedDeque<UniqueEvent> concurrentLinkedDeque) {
        this.api.sendEventsPayload(getEventsPayload());
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public void sendEventsPayload(EventsPayload<UniqueEvent> eventsPayload) {
        this.api.sendEventsPayload((UniqueEventsPayload) eventsPayload);
    }

    @Override // backtraceio.library.services.BacktraceEventsHandler
    public /* bridge */ /* synthetic */ void setMaximumNumberOfEvents(int i10) {
        super.setMaximumNumberOfEvents(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getEventsPayload()Lbacktraceio/library/models/metrics/EventsPayload; */
    @Override // backtraceio.library.services.BacktraceEventsHandler
    public UniqueEventsPayload getEventsPayload() {
        Map<String, String> mapCreateLocalAttributes = this.backtraceMetrics.createLocalAttributes(null);
        Iterator it = this.events.iterator();
        while (it.hasNext()) {
            ((UniqueEvent) it.next()).update(BacktraceTimeHelper.getTimestampSeconds(), mapCreateLocalAttributes);
        }
        return new UniqueEventsPayload(this.events, this.backtraceMetrics.getApplicationName(), this.backtraceMetrics.getApplicationVersion());
    }
}
