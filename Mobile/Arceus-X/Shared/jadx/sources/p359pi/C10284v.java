package p359pi;

import android.util.Log;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import kotlin.Metadata;
import kotlin.collections.C7700p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import sm.C11416c;

/* JADX INFO: renamed from: pi.v */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010!\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001b\u0010$\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u001b\u0010'\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001aR\u001b\u0010*\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001aR\u001b\u0010-\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b,\u0010\u001aR\u001b\u0010/\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b.\u0010\u001a¨\u00060"}, m31665d2 = {"Lpi/v;", "", "<init>", "()V", "", "name", "", "B", "(Ljava/lang/String;)V", "", "error", "y", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "A", "z", "(Ljava/lang/Throwable;)V", "outcome", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;", "backend", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "i", "(Ljava/lang/String;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;)Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "t", "b", "Ljt/h;", "r", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "successCounter", "c", "s", "successEvent", "d", "l", "failureCounter", "e", "m", "failureEvent", "f", "p", "recoverySuccessCounter", "g", "q", "recoverySuccessEvent", "h", "n", "recoveryFailureCounter", "o", "recoveryFailureEvent", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10284v {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10284v f36910a = new C10284v();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h successCounter = C7342i.m30456b(new Function0() { // from class: pi.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10284v.m39475C();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h successEvent = C7342i.m30456b(new Function0() { // from class: pi.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10284v.m39476D();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h failureCounter = C7342i.m30456b(new Function0() { // from class: pi.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10284v.m39485j();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h failureEvent = C7342i.m30456b(new Function0() { // from class: pi.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10284v.m39486k();
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h recoverySuccessCounter = C7342i.m30456b(new Function0() { // from class: pi.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10284v.m39489w();
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h recoverySuccessEvent = C7342i.m30456b(new Function0() { // from class: pi.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10284v.m39490x();
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h recoveryFailureCounter = C7342i.m30456b(new Function0() { // from class: pi.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10284v.m39487u();
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h recoveryFailureEvent = C7342i.m30456b(new Function0() { // from class: pi.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10284v.m39488v();
        }
    });

    /* JADX INFO: renamed from: C */
    public static final TelemetryConfig m39475C() {
        return f36910a.m39493i("SuccessCounter", TelemetryBackend.COUNTER);
    }

    /* JADX INFO: renamed from: D */
    public static final TelemetryConfig m39476D() {
        return f36910a.m39493i("Success", TelemetryBackend.EVENT_INGEST);
    }

    /* JADX INFO: renamed from: j */
    public static final TelemetryConfig m39485j() {
        return f36910a.m39493i("FailureCounter", TelemetryBackend.COUNTER);
    }

    /* JADX INFO: renamed from: k */
    public static final TelemetryConfig m39486k() {
        return f36910a.m39493i("Failure", TelemetryBackend.EVENT_INGEST);
    }

    /* JADX INFO: renamed from: u */
    public static final TelemetryConfig m39487u() {
        return f36910a.m39502t("FailureCounter", TelemetryBackend.COUNTER);
    }

    /* JADX INFO: renamed from: v */
    public static final TelemetryConfig m39488v() {
        return f36910a.m39502t("Failure", TelemetryBackend.EVENT_INGEST);
    }

    /* JADX INFO: renamed from: w */
    public static final TelemetryConfig m39489w() {
        return f36910a.m39502t("SuccessCounter", TelemetryBackend.COUNTER);
    }

    /* JADX INFO: renamed from: x */
    public static final TelemetryConfig m39490x() {
        return f36910a.m39502t("Success", TelemetryBackend.EVENT_INGEST);
    }

    /* JADX INFO: renamed from: A */
    public final void m39491A() {
        C11416c.m42770f(m39498p(), 0.0d, 2, null);
        TelemetryConfig telemetryConfigM39499q = m39499q();
        C11416c.b bVar = new C11416c.b();
        bVar.mo42764h(TelemetryStandardizedField.ADD_OS_INFO);
        C11416c.m42772h(telemetryConfigM39499q, bVar.m42785l());
    }

    /* JADX INFO: renamed from: B */
    public final void m39492B(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        C11416c.m42770f(m39500r(), 0.0d, 2, null);
        TelemetryConfig telemetryConfigM39501s = m39501s();
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("iconName", name);
        bVar.mo42764h(TelemetryStandardizedField.ADD_OS_INFO);
        C11416c.m42772h(telemetryConfigM39501s, bVar.m42785l());
    }

    /* JADX INFO: renamed from: i */
    public final TelemetryConfig m39493i(String outcome, TelemetryBackend backend) {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("SystemThemeAppIconSet" + outcome + "Android", C7700p0.m31904c(backend));
        aVar.mo42755b(2026, 10, 6);
        aVar.mo42754a("App icon request outcome; iconName is the logical name (empty for default).");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: l */
    public final TelemetryConfig m39494l() {
        return (TelemetryConfig) failureCounter.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final TelemetryConfig m39495m() {
        return (TelemetryConfig) failureEvent.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final TelemetryConfig m39496n() {
        return (TelemetryConfig) recoveryFailureCounter.getValue();
    }

    /* JADX INFO: renamed from: o */
    public final TelemetryConfig m39497o() {
        return (TelemetryConfig) recoveryFailureEvent.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final TelemetryConfig m39498p() {
        return (TelemetryConfig) recoverySuccessCounter.getValue();
    }

    /* JADX INFO: renamed from: q */
    public final TelemetryConfig m39499q() {
        return (TelemetryConfig) recoverySuccessEvent.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final TelemetryConfig m39500r() {
        return (TelemetryConfig) successCounter.getValue();
    }

    /* JADX INFO: renamed from: s */
    public final TelemetryConfig m39501s() {
        return (TelemetryConfig) successEvent.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final TelemetryConfig m39502t(String outcome, TelemetryBackend backend) {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("SystemThemeAppIconRecovery" + outcome + "Android", C7700p0.m31904c(backend));
        aVar.mo42755b(2026, 10, 8);
        aVar.mo42754a("Outcome of restoring the default launcher alias when no alias is enabled.");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: y */
    public final void m39503y(@NotNull String name, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(error, "error");
        Log.w("LauncherIconManager", "App icon '" + name + "' failed", error);
        C11416c.m42770f(m39494l(), 0.0d, 2, null);
        TelemetryConfig telemetryConfigM39495m = m39495m();
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("iconName", name);
        String name2 = error.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        bVar.mo42759c("errorClass", name2);
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        bVar.mo42759c("errorMessage", message);
        bVar.mo42764h(TelemetryStandardizedField.ADD_OS_INFO);
        C11416c.m42772h(telemetryConfigM39495m, bVar.m42785l());
    }

    /* JADX INFO: renamed from: z */
    public final void m39504z(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Log.w("LauncherIconManager", "Could not restore launcher entry", error);
        C11416c.m42770f(m39496n(), 0.0d, 2, null);
        TelemetryConfig telemetryConfigM39497o = m39497o();
        C11416c.b bVar = new C11416c.b();
        String name = error.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        bVar.mo42759c("errorClass", name);
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        bVar.mo42759c("errorMessage", message);
        bVar.mo42764h(TelemetryStandardizedField.ADD_OS_INFO);
        C11416c.m42772h(telemetryConfigM39497o, bVar.m42785l());
    }
}
