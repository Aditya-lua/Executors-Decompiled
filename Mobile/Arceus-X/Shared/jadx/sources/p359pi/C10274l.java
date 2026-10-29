package p359pi;

import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryData;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import kotlin.Metadata;
import kotlin.collections.C7700p0;
import kotlin.collections.C7702q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7342i;
import p229jt.C7345l;
import p229jt.C7351r;
import p229jt.InterfaceC7341h;
import p578yj.C13198f;
import sm.C11416c;
import th.C11659h;

/* JADX INFO: renamed from: pi.l */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\bJ\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0015\u0010\u0010R!\u0010\u001c\u001a\u00020\u00168BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\u001aR!\u0010 \u001a\u00020\u00168BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001e\u0010\u001aR\u001b\u0010#\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001b\u0010&\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001b\u0010)\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001aR\u001b\u0010,\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001aR\u001b\u0010/\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0018\u001a\u0004\b.\u0010\u001aR\u001b\u00101\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b0\u0010\u001a¨\u00062"}, m31665d2 = {"Lpi/l;", "", "<init>", "()V", "", "classicActive", "", "t", "(Z)V", "Lyj/f$a;", "migration", "v", "(Lyj/f$a;)V", "", "error", "r", "(ZLjava/lang/Throwable;)V", "", "q", "(Z)Ljava/lang/String;", "u", "s", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "b", "Ljt/h;", "l", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "getSetSuccessConfig$annotations", "setSuccessConfig", "c", "i", "getSetFailureConfig$annotations", "setFailureConfig", "d", "m", "setSuccessCounterConfig", "e", "n", "setSuccessEventConfig", "f", "j", "setFailureCounterConfig", "g", "k", "setFailureEventConfig", "h", "o", "shortcutMigrationCounterConfig", "p", "shortcutMigrationEventConfig", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10274l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10274l f36889a = new C10274l();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h setSuccessConfig = C7342i.m30456b(new Function0() { // from class: pi.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10274l.m39448z();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h setFailureConfig = C7342i.m30456b(new Function0() { // from class: pi.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10274l.m39445w();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h setSuccessCounterConfig = C7342i.m30456b(new Function0() { // from class: pi.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10274l.m39433A();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h setSuccessEventConfig = C7342i.m30456b(new Function0() { // from class: pi.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10274l.m39434B();
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h setFailureCounterConfig = C7342i.m30456b(new Function0() { // from class: pi.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10274l.m39446x();
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h setFailureEventConfig = C7342i.m30456b(new Function0() { // from class: pi.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10274l.m39447y();
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h shortcutMigrationCounterConfig = C7342i.m30456b(new Function0() { // from class: pi.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10274l.m39435C();
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h shortcutMigrationEventConfig = C7342i.m30456b(new Function0() { // from class: pi.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C10274l.m39436D();
        }
    });

    /* JADX INFO: renamed from: A */
    public static final TelemetryConfig m39433A() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("SystemThemeClassicIconSetSuccessCounterAndroid", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 9, 4);
        aVar.mo42754a("Counter for successful Classic Theme launcher-icon swaps.");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: B */
    public static final TelemetryConfig m39434B() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("SystemThemeClassicIconSetSuccessAndroid", C7700p0.m31904c(TelemetryBackend.EVENT_INGEST));
        aVar.mo42755b(2026, 9, 4);
        aVar.mo42754a("Event for a successful Classic Theme launcher-icon swap (iconName: \"classic\" = swapped to the Classic icon, \"default\" = reverted).");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: C */
    public static final TelemetryConfig m39435C() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("SystemThemeClassicIconShortcutMigrationCounterAndroid", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 9, 18);
        aVar.mo42754a("Counter for pinned-shortcut migrations off the launcher aliases, attempted during a Classic Theme launcher-icon swap.");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: D */
    public static final TelemetryConfig m39436D() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("SystemThemeClassicIconShortcutMigrationAndroid", C7700p0.m31904c(TelemetryBackend.EVENT_INGEST));
        aVar.mo42755b(2026, 9, 18);
        aVar.mo42754a("Event for a pinned-shortcut migration off the launcher aliases during a Classic Theme launcher-icon swap (outcome: \"migrated\" or \"failed\", the number of shortcuts involved, and the failure reason). A failure means the icon swap was deferred to protect the shortcuts.");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: w */
    public static final TelemetryConfig m39445w() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("SystemThemeClassicIconSetFailureAndroid", C7702q0.m31911g(TelemetryBackend.COUNTER, TelemetryBackend.EVENT_INGEST));
        aVar.mo42756c(Integer.valueOf(C11659h.m43403a().mo43451G4()));
        aVar.mo42755b(2026, 8, 28);
        aVar.mo42754a("A Classic Theme launcher-icon swap failed; the event carries classicActive and the error class/message (the counter carries classicActive only).");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: x */
    public static final TelemetryConfig m39446x() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("SystemThemeClassicIconSetFailureCounterAndroid", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 9, 4);
        aVar.mo42754a("Counter for a failed Classic Theme launcher-icon swap.");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: y */
    public static final TelemetryConfig m39447y() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("SystemThemeClassicIconSetFailureAndroid", C7700p0.m31904c(TelemetryBackend.EVENT_INGEST));
        aVar.mo42755b(2026, 9, 4);
        aVar.mo42754a("Event for a failed Classic Theme launcher-icon swap, with error details.");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: z */
    public static final TelemetryConfig m39448z() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("SystemThemeClassicIconSetSuccessAndroid", C7702q0.m31911g(TelemetryBackend.COUNTER, TelemetryBackend.EVENT_INGEST));
        aVar.mo42756c(Integer.valueOf(C11659h.m43403a().mo43451G4()));
        aVar.mo42755b(2026, 8, 28);
        aVar.mo42754a("Successful Classic Theme launcher-icon swaps (classicActive: true = swapped to the Classic icon, false = reverted to default).");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: i */
    public final TelemetryConfig m39449i() {
        return (TelemetryConfig) setFailureConfig.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final TelemetryConfig m39450j() {
        return (TelemetryConfig) setFailureCounterConfig.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final TelemetryConfig m39451k() {
        return (TelemetryConfig) setFailureEventConfig.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final TelemetryConfig m39452l() {
        return (TelemetryConfig) setSuccessConfig.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final TelemetryConfig m39453m() {
        return (TelemetryConfig) setSuccessCounterConfig.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final TelemetryConfig m39454n() {
        return (TelemetryConfig) setSuccessEventConfig.getValue();
    }

    /* JADX INFO: renamed from: o */
    public final TelemetryConfig m39455o() {
        return (TelemetryConfig) shortcutMigrationCounterConfig.getValue();
    }

    /* JADX INFO: renamed from: p */
    public final TelemetryConfig m39456p() {
        return (TelemetryConfig) shortcutMigrationEventConfig.getValue();
    }

    /* JADX INFO: renamed from: q */
    public final String m39457q(boolean classicActive) {
        return classicActive ? "classic" : "default";
    }

    /* JADX INFO: renamed from: r */
    public final void m39458r(boolean classicActive, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!C11659h.m43403a().mo43730u0()) {
            m39459s(classicActive, error);
            return;
        }
        C11416c.m42770f(m39450j(), 0.0d, 2, null);
        TelemetryConfig telemetryConfigM39451k = m39451k();
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("iconName", f36889a.m39457q(classicActive));
        String name = error.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        bVar.mo42759c("errorClass", name);
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        bVar.mo42759c("errorMessage", message);
        bVar.mo42764h(TelemetryStandardizedField.ADD_OS_INFO);
        C11416c.m42772h(telemetryConfigM39451k, bVar.m42785l());
    }

    /* JADX INFO: renamed from: s */
    public final void m39459s(boolean classicActive, Throwable error) {
        TelemetryConfig telemetryConfigM39449i = m39449i();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42761e("classicActive", classicActive);
        TelemetryStandardizedField telemetryStandardizedField = TelemetryStandardizedField.ADD_OS_INFO;
        bVar.mo42764h(telemetryStandardizedField);
        C11416c.m42771g(telemetryConfigM39449i, bVar.m42785l(), 0.0d, 4, null);
        TelemetryConfig telemetryConfigM39449i2 = m39449i();
        C11416c.b bVar2 = new C11416c.b();
        bVar2.mo42761e("classicActive", classicActive);
        String name = error.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        bVar2.mo42759c("errorClass", name);
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        bVar2.mo42759c("errorMessage", message);
        bVar2.mo42764h(telemetryStandardizedField);
        C11416c.m42772h(telemetryConfigM39449i2, bVar2.m42785l());
    }

    /* JADX INFO: renamed from: t */
    public final void m39460t(boolean classicActive) {
        if (!C11659h.m43403a().mo43730u0()) {
            m39461u(classicActive);
            return;
        }
        C11416c.m42770f(m39453m(), 0.0d, 2, null);
        TelemetryConfig telemetryConfigM39454n = m39454n();
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("iconName", f36889a.m39457q(classicActive));
        bVar.mo42764h(TelemetryStandardizedField.ADD_OS_INFO);
        C11416c.m42772h(telemetryConfigM39454n, bVar.m42785l());
    }

    /* JADX INFO: renamed from: u */
    public final void m39461u(boolean classicActive) {
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42761e("classicActive", classicActive);
        bVar.mo42764h(TelemetryStandardizedField.ADD_OS_INFO);
        TelemetryData telemetryDataM42785l = bVar.m42785l();
        C11416c.m42771g(m39452l(), telemetryDataM42785l, 0.0d, 4, null);
        C11416c.m42772h(m39452l(), telemetryDataM42785l);
    }

    /* JADX INFO: renamed from: v */
    public final void m39462v(@NotNull C13198f.a migration) {
        C7351r c7351r;
        Intrinsics.checkNotNullParameter(migration, "migration");
        if (migration instanceof C13198f.a.c) {
            return;
        }
        if (migration instanceof C13198f.a.Migrated) {
            c7351r = new C7351r("migrated", Integer.valueOf(((C13198f.a.Migrated) migration).getCount()), null);
        } else {
            if (!(migration instanceof C13198f.a.Failed)) {
                throw new C7345l();
            }
            C13198f.a.Failed failed = (C13198f.a.Failed) migration;
            c7351r = new C7351r("failed", Integer.valueOf(failed.getCount()), failed.getReason());
        }
        String str = (String) c7351r.m30471a();
        int iIntValue = ((Number) c7351r.m30472b()).intValue();
        String str2 = (String) c7351r.m30473c();
        C11416c.m42770f(m39455o(), 0.0d, 2, null);
        TelemetryConfig telemetryConfigM39456p = m39456p();
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("outcome", str);
        bVar.mo42762f("shortcutCount", iIntValue);
        if (str2 != null) {
            bVar.mo42759c("failureReason", str2);
        }
        bVar.mo42764h(TelemetryStandardizedField.ADD_OS_INFO);
        C11416c.m42772h(telemetryConfigM39456p, bVar.m42785l());
    }
}
