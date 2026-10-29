package pi;

import android.util.Log;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import kotlin.Metadata;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010!\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001b\u0010$\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u001b\u0010'\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001aR\u001b\u0010*\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001aR\u001b\u0010-\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b,\u0010\u001aR\u001b\u0010/\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b.\u0010\u001a¨\u00060"}, d2 = {"Lpi/v;", "", "<init>", "()V", "", "name", "", "B", "(Ljava/lang/String;)V", "", "error", "y", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "A", "z", "(Ljava/lang/Throwable;)V", "outcome", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;", "backend", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "i", "(Ljava/lang/String;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;)Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "t", "b", "Ljt/h;", "r", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "successCounter", "c", "s", "successEvent", "d", "l", "failureCounter", "e", "m", "failureEvent", "f", "p", "recoverySuccessCounter", "g", "q", "recoverySuccessEvent", "h", "n", "recoveryFailureCounter", "o", "recoveryFailureEvent", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v f28650a = new v();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final jt.h successCounter = jt.i.b(new Function0() { // from class: pi.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v.C();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h successEvent = jt.i.b(new Function0() { // from class: pi.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v.D();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h failureCounter = jt.i.b(new Function0() { // from class: pi.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v.j();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h failureEvent = jt.i.b(new Function0() { // from class: pi.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v.k();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h recoverySuccessCounter = jt.i.b(new Function0() { // from class: pi.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v.w();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h recoverySuccessEvent = jt.i.b(new Function0() { // from class: pi.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v.x();
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h recoveryFailureCounter = jt.i.b(new Function0() { // from class: pi.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v.u();
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h recoveryFailureEvent = jt.i.b(new Function0() { // from class: pi.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v.v();
        }
    });

    public static final TelemetryConfig C() {
        return f28650a.i("SuccessCounter", TelemetryBackend.COUNTER);
    }

    public static final TelemetryConfig D() {
        return f28650a.i("Success", TelemetryBackend.EVENT_INGEST);
    }

    public static final TelemetryConfig j() {
        return f28650a.i("FailureCounter", TelemetryBackend.COUNTER);
    }

    public static final TelemetryConfig k() {
        return f28650a.i("Failure", TelemetryBackend.EVENT_INGEST);
    }

    public static final TelemetryConfig u() {
        return f28650a.t("FailureCounter", TelemetryBackend.COUNTER);
    }

    public static final TelemetryConfig v() {
        return f28650a.t("Failure", TelemetryBackend.EVENT_INGEST);
    }

    public static final TelemetryConfig w() {
        return f28650a.t("SuccessCounter", TelemetryBackend.COUNTER);
    }

    public static final TelemetryConfig x() {
        return f28650a.t("Success", TelemetryBackend.EVENT_INGEST);
    }

    public final void A() {
        sm.c.f(p(), 0.0d, 2, null);
        TelemetryConfig telemetryConfigQ = q();
        sm.c.b bVar = new sm.c.b();
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        sm.c.h(telemetryConfigQ, bVar.l());
    }

    public final void B(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        sm.c.f(r(), 0.0d, 2, null);
        TelemetryConfig telemetryConfigS = s();
        sm.c.b bVar = new sm.c.b();
        bVar.c("iconName", name);
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        sm.c.h(telemetryConfigS, bVar.l());
    }

    public final TelemetryConfig i(String outcome, TelemetryBackend backend) {
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("SystemThemeAppIconSet" + outcome + "Android", p0.c(backend));
        aVar.b(2026, 10, 6);
        aVar.a("App icon request outcome; iconName is the logical name (empty for default).");
        return aVar.d();
    }

    public final TelemetryConfig l() {
        return (TelemetryConfig) failureCounter.getValue();
    }

    public final TelemetryConfig m() {
        return (TelemetryConfig) failureEvent.getValue();
    }

    public final TelemetryConfig n() {
        return (TelemetryConfig) recoveryFailureCounter.getValue();
    }

    public final TelemetryConfig o() {
        return (TelemetryConfig) recoveryFailureEvent.getValue();
    }

    public final TelemetryConfig p() {
        return (TelemetryConfig) recoverySuccessCounter.getValue();
    }

    public final TelemetryConfig q() {
        return (TelemetryConfig) recoverySuccessEvent.getValue();
    }

    public final TelemetryConfig r() {
        return (TelemetryConfig) successCounter.getValue();
    }

    public final TelemetryConfig s() {
        return (TelemetryConfig) successEvent.getValue();
    }

    public final TelemetryConfig t(String outcome, TelemetryBackend backend) {
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("SystemThemeAppIconRecovery" + outcome + "Android", p0.c(backend));
        aVar.b(2026, 10, 8);
        aVar.a("Outcome of restoring the default launcher alias when no alias is enabled.");
        return aVar.d();
    }

    public final void y(@NotNull String name, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(error, "error");
        Log.w("LauncherIconManager", "App icon '" + name + "' failed", error);
        sm.c.f(l(), 0.0d, 2, null);
        TelemetryConfig telemetryConfigM = m();
        sm.c.b bVar = new sm.c.b();
        bVar.c("iconName", name);
        String name2 = error.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        bVar.c("errorClass", name2);
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        bVar.c("errorMessage", message);
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        sm.c.h(telemetryConfigM, bVar.l());
    }

    public final void z(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Log.w("LauncherIconManager", "Could not restore launcher entry", error);
        sm.c.f(n(), 0.0d, 2, null);
        TelemetryConfig telemetryConfigO = o();
        sm.c.b bVar = new sm.c.b();
        String name = error.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        bVar.c("errorClass", name);
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        bVar.c("errorMessage", message);
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        sm.c.h(telemetryConfigO, bVar.l());
    }
}
