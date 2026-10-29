package backtraceio.library.events;

import backtraceio.library.models.BacktraceData;

/* JADX INFO: loaded from: classes.dex */
public interface OnBeforeSendEventListener {
    BacktraceData onEvent(BacktraceData backtraceData);
}
