package backtraceio.library.services;

import backtraceio.library.events.OnServerErrorEventListener;
import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.events.RequestHandler;
import backtraceio.library.models.BacktraceData;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceHandlerInputReport extends BacktraceHandlerInput {
    public BacktraceData data;
    RequestHandler requestHandler;
    OnServerResponseEventListener serverResponseEventListener;

    public BacktraceHandlerInputReport(BacktraceData backtraceData, OnServerResponseEventListener onServerResponseEventListener, OnServerErrorEventListener onServerErrorEventListener, RequestHandler requestHandler) {
        super(onServerErrorEventListener);
        this.data = backtraceData;
        this.serverResponseEventListener = onServerResponseEventListener;
        this.requestHandler = requestHandler;
    }
}
