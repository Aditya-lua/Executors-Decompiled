package eh;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.os.SystemClock;
import com.github.luben.zstd.BuildConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import java.util.function.BooleanSupplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010\"\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001b2\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010\u001fJ'\u0010(\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b*\u0010\u001fJ\u000f\u0010+\u001a\u00020\u001bH\u0002¢\u0006\u0004\b+\u0010\u001dJ\u0019\u0010.\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010,H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b0\u0010\u001fJ\u0017\u00101\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b1\u0010\u001fR\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010:\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u00106R\u0018\u0010=\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Leh/a0;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Leh/e0;", "l", "(Landroid/content/Context;)Leh/e0;", "Leh/t;", "E", "(Landroid/content/Context;)Leh/t;", BuildConfig.FLAVOR, "v", "()J", "Leh/g0;", "event", BuildConfig.FLAVOR, "s", "(Leh/g0;)V", "Leh/h0;", "u", "(Leh/h0;)V", BuildConfig.FLAVOR, "outcome", "t", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "r", "()Z", "w", "(Landroid/content/Context;)V", "applySharingFilter", "dmaConsented", "z", "(Landroid/content/Context;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "y", "consentRequired", "Leh/b0;", "cache", "A", "(Landroid/content/Context;ZLeh/b0;)V", "x", "F", "Ljava/util/function/BooleanSupplier;", "provider", "G", "(Ljava/util/function/BooleanSupplier;)V", "C", "B", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "b", "Lzt/h;", "p", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "outcomeCounter", "c", "q", "timeToDecisionCounter", "d", "Leh/e0;", "gate", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "trackingOptOutProvider", "f", "Ljava/lang/Boolean;", "buildInScopeOverride", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a0 f13472a = new a0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final zt.h outcomeCounter = zt.i.a(new Function0() { // from class: eh.u
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return a0.D();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h timeToDecisionCounter = zt.i.a(new Function0() { // from class: eh.v
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return a0.I();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static volatile e0 gate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static volatile Function0<Boolean> trackingOptOutProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static volatile Boolean buildInScopeOverride;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends p001kotlin.jvm.internal.k implements Function1<String, Unit> {
        public a(Object obj) {
            super(1, obj, a0.class, "logOutcome", "logOutcome(Ljava/lang/String;)V", 0);
        }

        public final void d(String p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            ((a0) this.receiver).t(p8);
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            d(str);
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends p001kotlin.jvm.internal.k implements Function0<Boolean> {
        public b(Object obj) {
            super(0, obj, a0.class, "readTrackingOptOut", "readTrackingOptOut()Z", 0);
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((a0) this.receiver).F());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c extends p001kotlin.jvm.internal.k implements Function1<FirebaseOutcomeEvent, Unit> {
        public c(Object obj) {
            super(1, obj, a0.class, "logEvent", "logEvent(Lcom/roblox/client/analytics/FirebaseOutcomeEvent;)V", 0);
        }

        public final void d(FirebaseOutcomeEvent p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            ((a0) this.receiver).s(p8);
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FirebaseOutcomeEvent firebaseOutcomeEvent) {
            d(firebaseOutcomeEvent);
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d extends p001kotlin.jvm.internal.k implements Function1<FirebaseTimeToDecisionEvent, Unit> {
        public d(Object obj) {
            super(1, obj, a0.class, "logTimeToDecision", "logTimeToDecision(Lcom/roblox/client/analytics/FirebaseTimeToDecisionEvent;)V", 0);
        }

        public final void d(FirebaseTimeToDecisionEvent p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            ((a0) this.receiver).u(p8);
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FirebaseTimeToDecisionEvent firebaseTimeToDecisionEvent) {
            d(firebaseTimeToDecisionEvent);
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e extends p001kotlin.jvm.internal.k implements Function0<Long> {
        public e(Object obj) {
            super(0, obj, a0.class, "msSinceProcessStart", "msSinceProcessStart()J", 0);
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(((a0) this.receiver).v());
        }
    }

    public static final void A(@NotNull Context context, boolean consentRequired, @NotNull b0 cache) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cache, "cache");
        if (r()) {
            try {
                f13472a.l(context).r(Boolean.valueOf(consentRequired), cache);
            } catch (Throwable th2) {
                ok.q.k("FirebaseConsent", "onEligibilityResolved failed: " + th2);
            }
        }
    }

    public static final void B(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (r()) {
            try {
                f13472a.l(context).s();
            } catch (Throwable th2) {
                ok.q.k("FirebaseConsent", "onSessionEnded failed: " + th2);
            }
        }
    }

    public static final void C(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (r()) {
            try {
                f13472a.l(context).t();
            } catch (Throwable th2) {
                ok.q.k("FirebaseConsent", "onTrackingOptOutChanged failed: " + th2);
            }
        }
    }

    public static final TelemetryConfig D() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("AndroidFirebaseConsentOutcome", p001kotlin.collections.p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 10, 27);
        aVar.a("Outcome of the Firebase Analytics sell or share gate");
        return aVar.d();
    }

    public static final void G(@Nullable final BooleanSupplier provider) {
        trackingOptOutProvider = provider != null ? new Function0() { // from class: eh.z
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(a0.H(provider));
            }
        } : null;
    }

    public static final boolean H(BooleanSupplier booleanSupplier) {
        return booleanSupplier.getAsBoolean();
    }

    public static final TelemetryConfig I() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("AndroidFirebaseConsentTimeToDecision", p001kotlin.collections.p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 10, 28);
        aVar.a("Time from process start to the first Firebase On or Off decision, bucketed");
        return aVar.d();
    }

    public static final boolean m() {
        return bi.h.a().p3();
    }

    public static final FirebaseColdStartInputs n(Context context) {
        return f13472a.E(context);
    }

    public static final boolean o() {
        return bi.h.a().H0();
    }

    public static final boolean r() {
        Boolean bool = buildInScopeOverride;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final void w(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (r()) {
            try {
                f13472a.l(context).n();
            } catch (Throwable th2) {
                ok.q.k("FirebaseConsent", "onAppStart failed: " + th2);
            }
        }
    }

    public static final void x(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (r()) {
            try {
                f13472a.l(context).o();
            } catch (Throwable th2) {
                ok.q.k("FirebaseConsent", "onAttributionBlocked failed: " + th2);
            }
        }
    }

    public static final void y(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (r()) {
            try {
                f13472a.l(context).p(Boolean.TRUE, null, "backstop");
            } catch (Throwable th2) {
                ok.q.k("FirebaseConsent", "onBackstopResolved failed: " + th2);
            }
        }
    }

    public static final void z(@NotNull Context context, @Nullable Boolean applySharingFilter, @Nullable Boolean dmaConsented) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (r()) {
            try {
                e0.q(f13472a.l(context), applySharingFilter, dmaConsented, null, 4, null);
            } catch (Throwable th2) {
                ok.q.k("FirebaseConsent", "onConsentResolved failed: " + th2);
            }
        }
    }

    public final FirebaseColdStartInputs E(Context context) {
        bi.i iVarA = bi.h.a();
        SharedPreferences sharedPreferences = context.getSharedPreferences("APPS_FLYER_SHARED_PREFS", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return eh.a.c(sharedPreferences, System.currentTimeMillis(), 2592000000L, iVarA.K1(), iVarA.L4());
    }

    public final boolean F() {
        Function0<Boolean> function0 = trackingOptOutProvider;
        if (function0 != null) {
            return function0.invoke().booleanValue();
        }
        return false;
    }

    public final e0 l(final Context context) {
        e0 e0Var;
        e0 e0Var2 = gate;
        if (e0Var2 != null) {
            return e0Var2;
        }
        synchronized (this) {
            e0Var = gate;
            if (e0Var == null) {
                Function0 function0 = new Function0() { // from class: eh.w
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(a0.m());
                    }
                };
                l0 l0Var = new l0(context);
                a0 a0Var = f13472a;
                e0 e0Var3 = new e0(function0, l0Var, new a(a0Var), new b(a0Var), new Function0() { // from class: eh.x
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return a0.n(context);
                    }
                }, new c(a0Var), new d(a0Var), new e(a0Var), new Function0() { // from class: eh.y
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(a0.o());
                    }
                });
                gate = e0Var3;
                e0Var = e0Var3;
            }
        }
        return e0Var;
    }

    public final TelemetryConfig p() {
        return (TelemetryConfig) outcomeCounter.getValue();
    }

    public final TelemetryConfig q() {
        return (TelemetryConfig) timeToDecisionCounter.getValue();
    }

    public final void s(FirebaseOutcomeEvent event) {
        Object objB;
        try {
            zt.n.Companion companion = zt.n.INSTANCE;
            TelemetryConfig telemetryConfigP = p();
            fn.c cVar = fn.c.f16193a;
            fn.c.b bVar = new fn.c.b();
            bVar.c("outcome", event.getOutcome());
            bVar.c("geo", event.getGeo());
            bVar.c("trigger", event.getTrigger());
            objB = zt.n.b(Boolean.valueOf(fn.c.g(telemetryConfigP, bVar.l(), 0.0d, 4, null)));
        } catch (Throwable th2) {
            zt.n.Companion companion2 = zt.n.INSTANCE;
            objB = zt.n.b(zt.o.a(th2));
        }
        Throwable thE = zt.n.e(objB);
        if (thE != null) {
            ok.q.k("FirebaseConsent", "counter failed for " + event.getOutcome() + ": " + thE);
        }
    }

    public final void t(String outcome) {
        Object objB;
        try {
            zt.n.Companion companion = zt.n.INSTANCE;
            TelemetryConfig telemetryConfigP = p();
            fn.c cVar = fn.c.f16193a;
            fn.c.b bVar = new fn.c.b();
            bVar.c("outcome", outcome);
            objB = zt.n.b(Boolean.valueOf(fn.c.g(telemetryConfigP, bVar.l(), 0.0d, 4, null)));
        } catch (Throwable th2) {
            zt.n.Companion companion2 = zt.n.INSTANCE;
            objB = zt.n.b(zt.o.a(th2));
        }
        Throwable thE = zt.n.e(objB);
        if (thE != null) {
            ok.q.k("FirebaseConsent", "counter failed for " + outcome + ": " + thE);
        }
    }

    public final void u(FirebaseTimeToDecisionEvent event) {
        Object objB;
        try {
            zt.n.Companion companion = zt.n.INSTANCE;
            TelemetryConfig telemetryConfigQ = q();
            fn.c cVar = fn.c.f16193a;
            fn.c.b bVar = new fn.c.b();
            bVar.c("bucket", event.getBucket());
            bVar.c("state", event.getState());
            bVar.c("trigger", event.getTrigger());
            objB = zt.n.b(Boolean.valueOf(fn.c.g(telemetryConfigQ, bVar.l(), 0.0d, 4, null)));
        } catch (Throwable th2) {
            zt.n.Companion companion2 = zt.n.INSTANCE;
            objB = zt.n.b(zt.o.a(th2));
        }
        Throwable thE = zt.n.e(objB);
        if (thE != null) {
            ok.q.k("FirebaseConsent", "time to decision counter failed: " + thE);
        }
    }

    public final long v() {
        return p001kotlin.ranges.d.d(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime(), 0L);
    }
}
