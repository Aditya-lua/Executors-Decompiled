package backtraceio.library.common.serialization;

import lg.c;
import lg.f;
import lg.g;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceGsonBuilder implements CustomGsonBuilder {
    @Override // backtraceio.library.common.serialization.CustomGsonBuilder
    public f buildGson() {
        return new g().g(c.f22083f).d(StackTraceElement.class, new StackTraceElementTypeAdapter()).e(new ThrowableTypeAdapterFactory()).b();
    }
}
