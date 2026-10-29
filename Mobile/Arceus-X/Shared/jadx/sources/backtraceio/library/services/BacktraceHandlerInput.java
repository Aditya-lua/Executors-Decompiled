package backtraceio.library.services;

import backtraceio.library.events.OnServerErrorEventListener;

/* JADX INFO: loaded from: classes.dex */
public abstract class BacktraceHandlerInput {
    public OnServerErrorEventListener serverErrorEventListener;

    public BacktraceHandlerInput(OnServerErrorEventListener onServerErrorEventListener) {
        this.serverErrorEventListener = onServerErrorEventListener;
    }
}
