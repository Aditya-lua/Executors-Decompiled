package backtraceio.library.common.serialization;

import kg.C7590f;
import kg.C7591g;
import kg.EnumC7587c;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceGsonBuilder implements CustomGsonBuilder {
    @Override // backtraceio.library.common.serialization.CustomGsonBuilder
    public C7590f buildGson() {
        return new C7591g().m31439g(EnumC7587c.f29047f).m31436d(StackTraceElement.class, new StackTraceElementTypeAdapter()).m31437e(new ThrowableTypeAdapterFactory()).m31435b();
    }
}
