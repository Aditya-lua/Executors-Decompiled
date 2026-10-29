package yj;

import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import jt.h;
import jt.i;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lyj/b;", "", "<init>", "()V", "", PinShortcutHandler.EXTRA_PLACE_ID, "", "d", "(J)V", "e", "", "h", "(J)Ljava/lang/String;", "g", "Lyj/b$a;", "action", "f", "(JLyj/b$a;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "b", "Ljt/h;", "c", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "config", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f35891a = new b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final h config = i.b(new Function0() { // from class: yj.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.b();
        }
    });

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lyj/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        PIN_SHORTCUT_REQUESTED,
        PIN_SHORTCUT_SUCCESSFUL;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ qt.a f35894d = qt.b.a(a());
    }

    public static final TelemetryConfig b() {
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("androidPinnedShortcutAction", q0.g(TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS));
        aVar.b(2026, 8, 7);
        aVar.a("Tracks Android app shortcut pin request and success actions");
        aVar.c(Integer.valueOf(th.h.a().T1()));
        return aVar.d();
    }

    public final TelemetryConfig c() {
        return (TelemetryConfig) config.getValue();
    }

    public final void d(long placeId) {
        f(placeId, a.PIN_SHORTCUT_REQUESTED);
    }

    public final void e(long placeId) {
        f(placeId, a.PIN_SHORTCUT_SUCCESSFUL);
    }

    public final void f(long placeId, a action) {
        sm.c cVar = sm.c.f31236a;
        sm.c.b bVar = new sm.c.b();
        bVar.c("shortcutId", th.h.a().Q0() ? f35891a.g(placeId) : f35891a.h(placeId));
        bVar.c("shortcutAction", action.name());
        sm.c.h(c(), bVar.l());
    }

    @NotNull
    public final String g(long placeId) {
        return "experience_edp_" + placeId;
    }

    @NotNull
    public final String h(long placeId) {
        return "experience_" + placeId;
    }
}
