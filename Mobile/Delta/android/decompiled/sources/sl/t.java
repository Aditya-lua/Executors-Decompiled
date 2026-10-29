package sl;

import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import kotlin.Metadata;
import kotlin.collections.p0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001b\u0010(\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001b\u0010+\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!R\u001b\u0010.\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R\u001b\u00100\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b/\u0010!¨\u00061"}, d2 = {"Lsl/t;", "", "<init>", "()V", "", "isAuthenticated", "", "m", "(Z)V", "", "destination", "success", "o", "(Ljava/lang/String;Z)V", "updateType", "p", "(Ljava/lang/String;)V", "codeName", "n", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "bucket", "group", "r", "(ILjava/lang/String;)V", "", "btid", "q", "(JILjava/lang/String;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "b", "Ljt/h;", "g", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "pgsAuthenticatedCounter", "c", "k", "pgsReplicatorCounter", "d", "l", "pgsStreakCounter", "e", "j", "pgsGrantAchievementCounter", "f", "i", "pgsExperimentStartupEvent", "h", "pgsExperimentEnrollmentEvent", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t f31178a = new t();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final jt.h pgsAuthenticatedCounter = jt.i.b(new Function0() { // from class: sl.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.s();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h pgsReplicatorCounter = jt.i.b(new Function0() { // from class: sl.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.w();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h pgsStreakCounter = jt.i.b(new Function0() { // from class: sl.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.x();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h pgsGrantAchievementCounter = jt.i.b(new Function0() { // from class: sl.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.v();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h pgsExperimentStartupEvent = jt.i.b(new Function0() { // from class: sl.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.u();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h pgsExperimentEnrollmentEvent = jt.i.b(new Function0() { // from class: sl.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.t();
        }
    });

    public static final TelemetryConfig s() {
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("pgs_authenticated_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 4, 1);
        aVar.a("PGS authenticated counter");
        return aVar.d();
    }

    public static final TelemetryConfig t() {
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("pgs_experiment_enrollment", q0.g(TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS));
        aVar.b(2026, 6, 24);
        aVar.a("PGS experiment enrollment with BTID");
        return aVar.d();
    }

    public static final TelemetryConfig u() {
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("pgs_experiment_startup", q0.g(TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS));
        aVar.b(2026, 6, 24);
        aVar.a("PGS experiment dice roll at startup");
        return aVar.d();
    }

    public static final TelemetryConfig v() {
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("pgs_grant_achievement_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 4, 15);
        aVar.a("PGS grant achievement counter");
        return aVar.d();
    }

    public static final TelemetryConfig w() {
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("pgs_replicator_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 4, 15);
        aVar.a("PGS replicator counter");
        return aVar.d();
    }

    public static final TelemetryConfig x() {
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("pgs_streak_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 4, 1);
        aVar.a("PGS streak counter");
        return aVar.d();
    }

    public final TelemetryConfig g() {
        return (TelemetryConfig) pgsAuthenticatedCounter.getValue();
    }

    public final TelemetryConfig h() {
        return (TelemetryConfig) pgsExperimentEnrollmentEvent.getValue();
    }

    public final TelemetryConfig i() {
        return (TelemetryConfig) pgsExperimentStartupEvent.getValue();
    }

    public final TelemetryConfig j() {
        return (TelemetryConfig) pgsGrantAchievementCounter.getValue();
    }

    public final TelemetryConfig k() {
        return (TelemetryConfig) pgsReplicatorCounter.getValue();
    }

    public final TelemetryConfig l() {
        return (TelemetryConfig) pgsStreakCounter.getValue();
    }

    public final void m(boolean isAuthenticated) {
        TelemetryConfig telemetryConfigG = g();
        sm.c cVar = sm.c.f31236a;
        sm.c.b bVar = new sm.c.b();
        bVar.c("authenticated", String.valueOf(isAuthenticated));
        sm.c.g(telemetryConfigG, bVar.l(), 0.0d, 4, null);
    }

    public final void n(@NotNull String destination, @NotNull String codeName, boolean success) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(codeName, "codeName");
        TelemetryConfig telemetryConfigJ = j();
        sm.c cVar = sm.c.f31236a;
        sm.c.b bVar = new sm.c.b();
        bVar.c("destination", destination);
        bVar.c("codeName", codeName);
        bVar.c("success", String.valueOf(success));
        sm.c.g(telemetryConfigJ, bVar.l(), 0.0d, 4, null);
    }

    public final void o(@NotNull String destination, boolean success) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        TelemetryConfig telemetryConfigK = k();
        sm.c cVar = sm.c.f31236a;
        sm.c.b bVar = new sm.c.b();
        bVar.c("destination", destination);
        bVar.c("success", String.valueOf(success));
        sm.c.g(telemetryConfigK, bVar.l(), 0.0d, 4, null);
    }

    public final void p(@NotNull String updateType) {
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        TelemetryConfig telemetryConfigL = l();
        sm.c cVar = sm.c.f31236a;
        sm.c.b bVar = new sm.c.b();
        bVar.c(Payload.TYPE, updateType);
        sm.c.g(telemetryConfigL, bVar.l(), 0.0d, 4, null);
    }

    public final void q(long btid, int bucket, @NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        TelemetryConfig telemetryConfigH = h();
        sm.c cVar = sm.c.f31236a;
        sm.c.b bVar = new sm.c.b();
        bVar.c("btid", String.valueOf(btid));
        bVar.c("bucket", String.valueOf(bucket));
        bVar.c("group", group);
        sm.c.h(telemetryConfigH, bVar.l());
    }

    public final void r(int bucket, @NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        TelemetryConfig telemetryConfigI = i();
        sm.c cVar = sm.c.f31236a;
        sm.c.b bVar = new sm.c.b();
        bVar.c("bucket", String.valueOf(bucket));
        bVar.c("group", group);
        sm.c.h(telemetryConfigI, bVar.l());
    }
}
