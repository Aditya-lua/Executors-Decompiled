package p578yj;

import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import sm.C11416c;
import th.C11659h;

/* JADX INFO: renamed from: yj.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m31665d2 = {"Lyj/b;", "", "<init>", "()V", "", PinShortcutHandler.EXTRA_PLACE_ID, "", "d", "(J)V", "e", "", "h", "(J)Ljava/lang/String;", "g", "Lyj/b$a;", "action", "f", "(JLyj/b$a;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "b", "Ljt/h;", "c", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "config", "a", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13194b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C13194b f46462a = new C13194b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h config = C7342i.m30456b(new Function0() { // from class: yj.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C13194b.m48806b();
        }
    });

    /* JADX INFO: renamed from: yj.b$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31665d2 = {"Lyj/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum a {
        PIN_SHORTCUT_REQUESTED,
        PIN_SHORTCUT_SUCCESSFUL;


        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ InterfaceC10707a f46467d = C10708b.m40805a(m48813a());
    }

    /* JADX INFO: renamed from: b */
    public static final TelemetryConfig m48806b() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("androidPinnedShortcutAction", C7702q0.m31911g(TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS));
        aVar.mo42755b(2026, 8, 7);
        aVar.mo42754a("Tracks Android app shortcut pin request and success actions");
        aVar.mo42756c(Integer.valueOf(C11659h.m43403a().mo43579Z1()));
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: c */
    public final TelemetryConfig m48807c() {
        return (TelemetryConfig) config.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m48808d(long placeId) {
        m48810f(placeId, a.PIN_SHORTCUT_REQUESTED);
    }

    /* JADX INFO: renamed from: e */
    public final void m48809e(long placeId) {
        m48810f(placeId, a.PIN_SHORTCUT_SUCCESSFUL);
    }

    /* JADX INFO: renamed from: f */
    public final void m48810f(long placeId, a action) {
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("shortcutId", C11659h.m43403a().mo43543U0() ? f46462a.m48811g(placeId) : f46462a.m48812h(placeId));
        bVar.mo42759c("shortcutAction", action.name());
        C11416c.m42772h(m48807c(), bVar.m42785l());
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m48811g(long placeId) {
        return "experience_edp_" + placeId;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m48812h(long placeId) {
        return "experience_" + placeId;
    }
}
