package backtraceio.library.events;

import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.BacktraceResult;

/* JADX INFO: loaded from: classes.dex */
public interface RequestHandler {
    BacktraceResult onRequest(BacktraceData backtraceData);
}
