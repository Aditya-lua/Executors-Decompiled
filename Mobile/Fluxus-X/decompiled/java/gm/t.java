package gm;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.p0;
import p001kotlin.collections.q0;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u001b\u0010)\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u001b\u0010,\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R\u001b\u0010/\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"R\u001b\u00101\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b0\u0010\"¨\u00062"}, d2 = {"Lgm/t;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "isAuthenticated", BuildConfig.FLAVOR, "localeCountry", BuildConfig.FLAVOR, "m", "(ZLjava/lang/String;)V", "destination", "success", "o", "(Ljava/lang/String;Z)V", "updateType", "p", "(Ljava/lang/String;)V", "codeName", "n", "(Ljava/lang/String;Ljava/lang/String;Z)V", BuildConfig.FLAVOR, "bucket", "group", "r", "(ILjava/lang/String;)V", BuildConfig.FLAVOR, "btid", "q", "(JILjava/lang/String;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "b", "Lzt/h;", "g", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "pgsAuthenticatedCounter", "c", "k", "pgsReplicatorCounter", "d", "l", "pgsStreakCounter", "e", "j", "pgsGrantAchievementCounter", "f", "i", "pgsExperimentStartupEvent", "h", "pgsExperimentEnrollmentEvent", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t f17799a = new t();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final zt.h pgsAuthenticatedCounter = zt.i.a(new Function0() { // from class: gm.n
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.s();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h pgsReplicatorCounter = zt.i.a(new Function0() { // from class: gm.o
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.w();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h pgsStreakCounter = zt.i.a(new Function0() { // from class: gm.p
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.x();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h pgsGrantAchievementCounter = zt.i.a(new Function0() { // from class: gm.q
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.v();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h pgsExperimentStartupEvent = zt.i.a(new Function0() { // from class: gm.r
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.u();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h pgsExperimentEnrollmentEvent = zt.i.a(new Function0() { // from class: gm.s
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.t();
        }
    });

    public static final TelemetryConfig s() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("pgs_authenticated_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 10, 14);
        aVar.a("PGS authenticated counter");
        return aVar.d();
    }

    public static final TelemetryConfig t() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("pgs_experiment_enrollment", q0.g(TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS));
        aVar.b(2026, 6, 24);
        aVar.a("PGS experiment enrollment with BTID");
        return aVar.d();
    }

    public static final TelemetryConfig u() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("pgs_experiment_startup", q0.g(TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS));
        aVar.b(2026, 6, 24);
        aVar.a("PGS experiment dice roll at startup");
        return aVar.d();
    }

    public static final TelemetryConfig v() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("pgs_grant_achievement_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 4, 15);
        aVar.a("PGS grant achievement counter");
        return aVar.d();
    }

    public static final TelemetryConfig w() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("pgs_replicator_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 4, 15);
        aVar.a("PGS replicator counter");
        return aVar.d();
    }

    public static final TelemetryConfig x() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("pgs_streak_counter", p0.c(TelemetryBackend.COUNTER));
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

    public final void m(boolean isAuthenticated, @NotNull String localeCountry) {
        Intrinsics.checkNotNullParameter(localeCountry, "localeCountry");
        TelemetryConfig telemetryConfigG = g();
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar = new fn.c.b();
        bVar.c("authenticated", String.valueOf(isAuthenticated));
        bVar.c("localeCountry", localeCountry);
        fn.c.g(telemetryConfigG, bVar.l(), 0.0d, 4, null);
    }

    public final void n(@NotNull String destination, @NotNull String codeName, boolean success) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(codeName, "codeName");
        TelemetryConfig telemetryConfigJ = j();
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar = new fn.c.b();
        bVar.c("destination", destination);
        bVar.c("codeName", codeName);
        bVar.c("success", String.valueOf(success));
        fn.c.g(telemetryConfigJ, bVar.l(), 0.0d, 4, null);
    }

    public final void o(@NotNull String destination, boolean success) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        TelemetryConfig telemetryConfigK = k();
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar = new fn.c.b();
        bVar.c("destination", destination);
        bVar.c("success", String.valueOf(success));
        fn.c.g(telemetryConfigK, bVar.l(), 0.0d, 4, null);
    }

    public final void p(@NotNull String updateType) {
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        TelemetryConfig telemetryConfigL = l();
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar = new fn.c.b();
        bVar.c(Payload.TYPE, updateType);
        fn.c.g(telemetryConfigL, bVar.l(), 0.0d, 4, null);
    }

    public final void q(long btid, int bucket, @NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        TelemetryConfig telemetryConfigH = h();
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar = new fn.c.b();
        bVar.c("btid", String.valueOf(btid));
        bVar.c("bucket", String.valueOf(bucket));
        bVar.c("group", group);
        fn.c.h(telemetryConfigH, bVar.l());
    }

    public final void r(int bucket, @NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        TelemetryConfig telemetryConfigI = i();
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar = new fn.c.b();
        bVar.c("bucket", String.valueOf(bucket));
        bVar.c("group", group);
        fn.c.h(telemetryConfigI, bVar.l());
    }
}
