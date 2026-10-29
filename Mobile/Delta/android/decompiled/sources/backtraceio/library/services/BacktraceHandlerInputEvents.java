package backtraceio.library.services;

import backtraceio.library.events.EventsOnServerResponseEventListener;
import backtraceio.library.events.EventsRequestHandler;
import backtraceio.library.events.OnServerErrorEventListener;
import backtraceio.library.models.metrics.EventsPayload;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceHandlerInputEvents extends BacktraceHandlerInput {
    public EventsOnServerResponseEventListener eventsOnServerResponseEventListener;
    public EventsRequestHandler eventsRequestHandler;
    public EventsPayload payload;

    public BacktraceHandlerInputEvents(EventsPayload eventsPayload, EventsOnServerResponseEventListener eventsOnServerResponseEventListener, OnServerErrorEventListener onServerErrorEventListener, EventsRequestHandler eventsRequestHandler) {
        super(onServerErrorEventListener);
        this.payload = eventsPayload;
        this.eventsOnServerResponseEventListener = eventsOnServerResponseEventListener;
        this.eventsRequestHandler = eventsRequestHandler;
    }
}
