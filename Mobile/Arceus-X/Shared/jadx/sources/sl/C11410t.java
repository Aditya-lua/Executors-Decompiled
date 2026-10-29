package sl;

import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import kotlin.Metadata;
import kotlin.collections.C7700p0;
import kotlin.collections.C7702q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import sm.C11416c;

/* JADX INFO: renamed from: sl.t */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u001b\u0010)\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u001b\u0010,\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R\u001b\u0010/\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"R\u001b\u00101\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b0\u0010\"¨\u00062"}, m31665d2 = {"Lsl/t;", "", "<init>", "()V", "", "isAuthenticated", "", "localeCountry", "", "m", "(ZLjava/lang/String;)V", "destination", "success", "o", "(Ljava/lang/String;Z)V", "updateType", "p", "(Ljava/lang/String;)V", "codeName", "n", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "bucket", "group", "r", "(ILjava/lang/String;)V", "", "btid", "q", "(JILjava/lang/String;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "b", "Ljt/h;", "g", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "pgsAuthenticatedCounter", "c", "k", "pgsReplicatorCounter", "d", "l", "pgsStreakCounter", "e", "j", "pgsGrantAchievementCounter", "f", "i", "pgsExperimentStartupEvent", "h", "pgsExperimentEnrollmentEvent", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11410t {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11410t f40318a = new C11410t();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h pgsAuthenticatedCounter = C7342i.m30456b(new Function0() { // from class: sl.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C11410t.m42728s();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h pgsReplicatorCounter = C7342i.m30456b(new Function0() { // from class: sl.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C11410t.m42732w();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h pgsStreakCounter = C7342i.m30456b(new Function0() { // from class: sl.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C11410t.m42733x();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h pgsGrantAchievementCounter = C7342i.m30456b(new Function0() { // from class: sl.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C11410t.m42731v();
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h pgsExperimentStartupEvent = C7342i.m30456b(new Function0() { // from class: sl.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C11410t.m42730u();
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h pgsExperimentEnrollmentEvent = C7342i.m30456b(new Function0() { // from class: sl.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C11410t.m42729t();
        }
    });

    /* JADX INFO: renamed from: s */
    public static final TelemetryConfig m42728s() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("pgs_authenticated_counter", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 10, 14);
        aVar.mo42754a("PGS authenticated counter");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: t */
    public static final TelemetryConfig m42729t() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("pgs_experiment_enrollment", C7702q0.m31911g(TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS));
        aVar.mo42755b(2026, 6, 24);
        aVar.mo42754a("PGS experiment enrollment with BTID");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: u */
    public static final TelemetryConfig m42730u() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("pgs_experiment_startup", C7702q0.m31911g(TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS));
        aVar.mo42755b(2026, 6, 24);
        aVar.mo42754a("PGS experiment dice roll at startup");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: v */
    public static final TelemetryConfig m42731v() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("pgs_grant_achievement_counter", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 4, 15);
        aVar.mo42754a("PGS grant achievement counter");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: w */
    public static final TelemetryConfig m42732w() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("pgs_replicator_counter", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 4, 15);
        aVar.mo42754a("PGS replicator counter");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: x */
    public static final TelemetryConfig m42733x() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("pgs_streak_counter", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 4, 1);
        aVar.mo42754a("PGS streak counter");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: g */
    public final TelemetryConfig m42734g() {
        return (TelemetryConfig) pgsAuthenticatedCounter.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final TelemetryConfig m42735h() {
        return (TelemetryConfig) pgsExperimentEnrollmentEvent.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final TelemetryConfig m42736i() {
        return (TelemetryConfig) pgsExperimentStartupEvent.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final TelemetryConfig m42737j() {
        return (TelemetryConfig) pgsGrantAchievementCounter.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final TelemetryConfig m42738k() {
        return (TelemetryConfig) pgsReplicatorCounter.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final TelemetryConfig m42739l() {
        return (TelemetryConfig) pgsStreakCounter.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m42740m(boolean isAuthenticated, @NotNull String localeCountry) {
        Intrinsics.checkNotNullParameter(localeCountry, "localeCountry");
        TelemetryConfig telemetryConfigM42734g = m42734g();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("authenticated", String.valueOf(isAuthenticated));
        bVar.mo42759c("localeCountry", localeCountry);
        C11416c.m42771g(telemetryConfigM42734g, bVar.m42785l(), 0.0d, 4, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m42741n(@NotNull String destination, @NotNull String codeName, boolean success) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(codeName, "codeName");
        TelemetryConfig telemetryConfigM42737j = m42737j();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("destination", destination);
        bVar.mo42759c("codeName", codeName);
        bVar.mo42759c("success", String.valueOf(success));
        C11416c.m42771g(telemetryConfigM42737j, bVar.m42785l(), 0.0d, 4, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m42742o(@NotNull String destination, boolean success) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        TelemetryConfig telemetryConfigM42738k = m42738k();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("destination", destination);
        bVar.mo42759c("success", String.valueOf(success));
        C11416c.m42771g(telemetryConfigM42738k, bVar.m42785l(), 0.0d, 4, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m42743p(@NotNull String updateType) {
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        TelemetryConfig telemetryConfigM42739l = m42739l();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c(Payload.TYPE, updateType);
        C11416c.m42771g(telemetryConfigM42739l, bVar.m42785l(), 0.0d, 4, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m42744q(long btid, int bucket, @NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        TelemetryConfig telemetryConfigM42735h = m42735h();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("btid", String.valueOf(btid));
        bVar.mo42759c("bucket", String.valueOf(bucket));
        bVar.mo42759c("group", group);
        C11416c.m42772h(telemetryConfigM42735h, bVar.m42785l());
    }

    /* JADX INFO: renamed from: r */
    public final void m42745r(int bucket, @NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        TelemetryConfig telemetryConfigM42736i = m42736i();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("bucket", String.valueOf(bucket));
        bVar.mo42759c("group", group);
        C11416c.m42772h(telemetryConfigM42736i, bVar.m42785l());
    }
}
