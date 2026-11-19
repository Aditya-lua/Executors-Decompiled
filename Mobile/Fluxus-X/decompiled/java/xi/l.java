package xi;

import com.github.luben.zstd.BuildConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryData;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.p0;
import p001kotlin.collections.q0;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\bJ\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0015\u0010\u0010R!\u0010\u001c\u001a\u00020\u00168BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\u001aR!\u0010 \u001a\u00020\u00168BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001e\u0010\u001aR\u001b\u0010#\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001b\u0010&\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001b\u0010)\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001aR\u001b\u0010,\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001aR\u001b\u0010/\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0018\u001a\u0004\b.\u0010\u001aR\u001b\u00101\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b0\u0010\u001a¨\u00062"}, d2 = {"Lxi/l;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "classicActive", BuildConfig.FLAVOR, "t", "(Z)V", "Lgk/f$a;", "migration", "v", "(Lgk/f$a;)V", BuildConfig.FLAVOR, "error", "r", "(ZLjava/lang/Throwable;)V", BuildConfig.FLAVOR, "q", "(Z)Ljava/lang/String;", "u", "s", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "b", "Lzt/h;", "l", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "getSetSuccessConfig$annotations", "setSuccessConfig", "c", "i", "getSetFailureConfig$annotations", "setFailureConfig", "d", "m", "setSuccessCounterConfig", "e", "n", "setSuccessEventConfig", "f", "j", "setFailureCounterConfig", "g", "k", "setFailureEventConfig", "h", "o", "shortcutMigrationCounterConfig", "p", "shortcutMigrationEventConfig", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f36695a = new l();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final zt.h setSuccessConfig = zt.i.a(new Function0() { // from class: xi.d
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l.z();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h setFailureConfig = zt.i.a(new Function0() { // from class: xi.e
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l.w();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h setSuccessCounterConfig = zt.i.a(new Function0() { // from class: xi.f
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l.A();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h setSuccessEventConfig = zt.i.a(new Function0() { // from class: xi.g
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l.B();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h setFailureCounterConfig = zt.i.a(new Function0() { // from class: xi.h
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l.x();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h setFailureEventConfig = zt.i.a(new Function0() { // from class: xi.i
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l.y();
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h shortcutMigrationCounterConfig = zt.i.a(new Function0() { // from class: xi.j
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l.C();
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h shortcutMigrationEventConfig = zt.i.a(new Function0() { // from class: xi.k
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l.D();
        }
    });

    public static final TelemetryConfig A() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("SystemThemeClassicIconSetSuccessCounterAndroid", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 9, 4);
        aVar.a("Counter for successful Classic Theme launcher-icon swaps.");
        return aVar.d();
    }

    public static final TelemetryConfig B() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("SystemThemeClassicIconSetSuccessAndroid", p0.c(TelemetryBackend.EVENT_INGEST));
        aVar.b(2026, 9, 4);
        aVar.a("Event for a successful Classic Theme launcher-icon swap (iconName: \"classic\" = swapped to the Classic icon, \"default\" = reverted).");
        return aVar.d();
    }

    public static final TelemetryConfig C() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("SystemThemeClassicIconShortcutMigrationCounterAndroid", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 9, 18);
        aVar.a("Counter for pinned-shortcut migrations off the launcher aliases, attempted during a Classic Theme launcher-icon swap.");
        return aVar.d();
    }

    public static final TelemetryConfig D() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("SystemThemeClassicIconShortcutMigrationAndroid", p0.c(TelemetryBackend.EVENT_INGEST));
        aVar.b(2026, 9, 18);
        aVar.a("Event for a pinned-shortcut migration off the launcher aliases during a Classic Theme launcher-icon swap (outcome: \"migrated\" or \"failed\", the number of shortcuts involved, and the failure reason). A failure means the icon swap was deferred to protect the shortcuts.");
        return aVar.d();
    }

    public static final TelemetryConfig w() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("SystemThemeClassicIconSetFailureAndroid", q0.g(TelemetryBackend.COUNTER, TelemetryBackend.EVENT_INGEST));
        aVar.c(Integer.valueOf(bi.h.a().O4()));
        aVar.b(2026, 8, 28);
        aVar.a("A Classic Theme launcher-icon swap failed; the event carries classicActive and the error class/message (the counter carries classicActive only).");
        return aVar.d();
    }

    public static final TelemetryConfig x() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("SystemThemeClassicIconSetFailureCounterAndroid", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 9, 4);
        aVar.a("Counter for a failed Classic Theme launcher-icon swap.");
        return aVar.d();
    }

    public static final TelemetryConfig y() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("SystemThemeClassicIconSetFailureAndroid", p0.c(TelemetryBackend.EVENT_INGEST));
        aVar.b(2026, 9, 4);
        aVar.a("Event for a failed Classic Theme launcher-icon swap, with error details.");
        return aVar.d();
    }

    public static final TelemetryConfig z() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("SystemThemeClassicIconSetSuccessAndroid", q0.g(TelemetryBackend.COUNTER, TelemetryBackend.EVENT_INGEST));
        aVar.c(Integer.valueOf(bi.h.a().O4()));
        aVar.b(2026, 8, 28);
        aVar.a("Successful Classic Theme launcher-icon swaps (classicActive: true = swapped to the Classic icon, false = reverted to default).");
        return aVar.d();
    }

    public final TelemetryConfig i() {
        return (TelemetryConfig) setFailureConfig.getValue();
    }

    public final TelemetryConfig j() {
        return (TelemetryConfig) setFailureCounterConfig.getValue();
    }

    public final TelemetryConfig k() {
        return (TelemetryConfig) setFailureEventConfig.getValue();
    }

    public final TelemetryConfig l() {
        return (TelemetryConfig) setSuccessConfig.getValue();
    }

    public final TelemetryConfig m() {
        return (TelemetryConfig) setSuccessCounterConfig.getValue();
    }

    public final TelemetryConfig n() {
        return (TelemetryConfig) setSuccessEventConfig.getValue();
    }

    public final TelemetryConfig o() {
        return (TelemetryConfig) shortcutMigrationCounterConfig.getValue();
    }

    public final TelemetryConfig p() {
        return (TelemetryConfig) shortcutMigrationEventConfig.getValue();
    }

    public final String q(boolean classicActive) {
        return classicActive ? "classic" : "default";
    }

    public final void r(boolean classicActive, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!bi.h.a().y0()) {
            s(classicActive, error);
            return;
        }
        fn.c.f(j(), 0.0d, 2, null);
        TelemetryConfig telemetryConfigK = k();
        fn.c.b bVar = new fn.c.b();
        bVar.c("iconName", f36695a.q(classicActive));
        String name = error.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        bVar.c("errorClass", name);
        String message = error.getMessage();
        if (message == null) {
            message = BuildConfig.FLAVOR;
        }
        bVar.c("errorMessage", message);
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        fn.c.h(telemetryConfigK, bVar.l());
    }

    public final void s(boolean classicActive, Throwable error) {
        TelemetryConfig telemetryConfigI = i();
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar = new fn.c.b();
        bVar.e("classicActive", classicActive);
        TelemetryStandardizedField telemetryStandardizedField = TelemetryStandardizedField.ADD_OS_INFO;
        bVar.h(telemetryStandardizedField);
        fn.c.g(telemetryConfigI, bVar.l(), 0.0d, 4, null);
        TelemetryConfig telemetryConfigI2 = i();
        fn.c.b bVar2 = new fn.c.b();
        bVar2.e("classicActive", classicActive);
        String name = error.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        bVar2.c("errorClass", name);
        String message = error.getMessage();
        if (message == null) {
            message = BuildConfig.FLAVOR;
        }
        bVar2.c("errorMessage", message);
        bVar2.h(telemetryStandardizedField);
        fn.c.h(telemetryConfigI2, bVar2.l());
    }

    public final void t(boolean classicActive) {
        if (!bi.h.a().y0()) {
            u(classicActive);
            return;
        }
        fn.c.f(m(), 0.0d, 2, null);
        TelemetryConfig telemetryConfigN = n();
        fn.c.b bVar = new fn.c.b();
        bVar.c("iconName", f36695a.q(classicActive));
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        fn.c.h(telemetryConfigN, bVar.l());
    }

    public final void u(boolean classicActive) {
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar = new fn.c.b();
        bVar.e("classicActive", classicActive);
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        TelemetryData telemetryDataL = bVar.l();
        fn.c.g(l(), telemetryDataL, 0.0d, 4, null);
        fn.c.h(l(), telemetryDataL);
    }

    public final void v(@NotNull gk.f.a migration) {
        zt.r rVar;
        Intrinsics.checkNotNullParameter(migration, "migration");
        if (migration instanceof gk.f.a.c) {
            return;
        }
        if (migration instanceof gk.f.a.Migrated) {
            rVar = new zt.r("migrated", Integer.valueOf(((gk.f.a.Migrated) migration).getCount()), null);
        } else {
            if (!(migration instanceof gk.f.a.Failed)) {
                throw new zt.l();
            }
            gk.f.a.Failed failed = (gk.f.a.Failed) migration;
            rVar = new zt.r("failed", Integer.valueOf(failed.getCount()), failed.getReason());
        }
        String str = (String) rVar.a();
        int iIntValue = ((Number) rVar.b()).intValue();
        String str2 = (String) rVar.c();
        fn.c.f(o(), 0.0d, 2, null);
        TelemetryConfig telemetryConfigP = p();
        fn.c.b bVar = new fn.c.b();
        bVar.c("outcome", str);
        bVar.f("shortcutCount", iIntValue);
        if (str2 != null) {
            bVar.c("failureReason", str2);
        }
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        fn.c.h(telemetryConfigP, bVar.l());
    }
}
