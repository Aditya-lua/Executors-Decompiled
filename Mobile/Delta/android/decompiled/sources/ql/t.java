package ql;

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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u001b\u0010)\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u001b\u0010,\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R\u001b\u0010/\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"R\u001b\u00101\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b0\u0010\"¨\u00062"}, d2 = {"Lql/t;", "", "<init>", "()V", "", "isAuthenticated", "", "localeCountry", "", "m", "(ZLjava/lang/String;)V", "destination", "success", "o", "(Ljava/lang/String;Z)V", "updateType", "p", "(Ljava/lang/String;)V", "codeName", "n", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "bucket", "group", "r", "(ILjava/lang/String;)V", "", "btid", "q", "(JILjava/lang/String;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "b", "Lgt/h;", "g", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "pgsAuthenticatedCounter", "c", "k", "pgsReplicatorCounter", "d", "l", "pgsStreakCounter", "e", "j", "pgsGrantAchievementCounter", "f", "i", "pgsExperimentStartupEvent", "h", "pgsExperimentEnrollmentEvent", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t f29925a = new t();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final gt.h pgsAuthenticatedCounter = gt.i.b(new Function0() { // from class: ql.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.s();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h pgsReplicatorCounter = gt.i.b(new Function0() { // from class: ql.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.w();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h pgsStreakCounter = gt.i.b(new Function0() { // from class: ql.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.x();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h pgsGrantAchievementCounter = gt.i.b(new Function0() { // from class: ql.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.v();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h pgsExperimentStartupEvent = gt.i.b(new Function0() { // from class: ql.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.u();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h pgsExperimentEnrollmentEvent = gt.i.b(new Function0() { // from class: ql.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return t.t();
        }
    });

    public static final TelemetryConfig s() {
        qm.c cVar = qm.c.f29983a;
        qm.c.a aVar = new qm.c.a("pgs_authenticated_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 10, 14);
        aVar.a("PGS authenticated counter");
        return aVar.d();
    }

    public static final TelemetryConfig t() {
        qm.c cVar = qm.c.f29983a;
        qm.c.a aVar = new qm.c.a("pgs_experiment_enrollment", q0.g(TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS));
        aVar.b(2026, 6, 24);
        aVar.a("PGS experiment enrollment with BTID");
        return aVar.d();
    }

    public static final TelemetryConfig u() {
        qm.c cVar = qm.c.f29983a;
        qm.c.a aVar = new qm.c.a("pgs_experiment_startup", q0.g(TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS));
        aVar.b(2026, 6, 24);
        aVar.a("PGS experiment dice roll at startup");
        return aVar.d();
    }

    public static final TelemetryConfig v() {
        qm.c cVar = qm.c.f29983a;
        qm.c.a aVar = new qm.c.a("pgs_grant_achievement_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 4, 15);
        aVar.a("PGS grant achievement counter");
        return aVar.d();
    }

    public static final TelemetryConfig w() {
        qm.c cVar = qm.c.f29983a;
        qm.c.a aVar = new qm.c.a("pgs_replicator_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 4, 15);
        aVar.a("PGS replicator counter");
        return aVar.d();
    }

    public static final TelemetryConfig x() {
        qm.c cVar = qm.c.f29983a;
        qm.c.a aVar = new qm.c.a("pgs_streak_counter", p0.c(TelemetryBackend.COUNTER));
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
        qm.c cVar = qm.c.f29983a;
        qm.c.b bVar = new qm.c.b();
        bVar.c("authenticated", String.valueOf(isAuthenticated));
        bVar.c("localeCountry", localeCountry);
        qm.c.g(telemetryConfigG, bVar.l(), 0.0d, 4, null);
    }

    public final void n(@NotNull String destination, @NotNull String codeName, boolean success) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(codeName, "codeName");
        TelemetryConfig telemetryConfigJ = j();
        qm.c cVar = qm.c.f29983a;
        qm.c.b bVar = new qm.c.b();
        bVar.c("destination", destination);
        bVar.c("codeName", codeName);
        bVar.c("success", String.valueOf(success));
        qm.c.g(telemetryConfigJ, bVar.l(), 0.0d, 4, null);
    }

    public final void o(@NotNull String destination, boolean success) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        TelemetryConfig telemetryConfigK = k();
        qm.c cVar = qm.c.f29983a;
        qm.c.b bVar = new qm.c.b();
        bVar.c("destination", destination);
        bVar.c("success", String.valueOf(success));
        qm.c.g(telemetryConfigK, bVar.l(), 0.0d, 4, null);
    }

    public final void p(@NotNull String updateType) {
        Intrinsics.checkNotNullParameter(updateType, "updateType");
        TelemetryConfig telemetryConfigL = l();
        qm.c cVar = qm.c.f29983a;
        qm.c.b bVar = new qm.c.b();
        bVar.c(Payload.TYPE, updateType);
        qm.c.g(telemetryConfigL, bVar.l(), 0.0d, 4, null);
    }

    public final void q(long btid, int bucket, @NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        TelemetryConfig telemetryConfigH = h();
        qm.c cVar = qm.c.f29983a;
        qm.c.b bVar = new qm.c.b();
        bVar.c("btid", String.valueOf(btid));
        bVar.c("bucket", String.valueOf(bucket));
        bVar.c("group", group);
        qm.c.h(telemetryConfigH, bVar.l());
    }

    public final void r(int bucket, @NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        TelemetryConfig telemetryConfigI = i();
        qm.c cVar = qm.c.f29983a;
        qm.c.b bVar = new qm.c.b();
        bVar.c("bucket", String.valueOf(bucket));
        bVar.c("group", group);
        qm.c.h(telemetryConfigI, bVar.l());
    }
}
