package tg;

import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import ku.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ltg/d;", "Ltl/d;", "<init>", "()V", "", Payload.INSTANT, "", "a", "(Z)V", "c", "(Lnt/b;)Ljava/lang/Object;", "Ltg/d$a;", "installState", "e", "(Ltg/d$a;)V", "Lku/x;", "b", "Lku/x;", "installStartedOrCompleted", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "Ljt/h;", "d", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "sdkInstallCounter", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements tl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f31750a = new d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ku.x<Unit> installStartedOrCompleted = z.c(null, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final jt.h sdkInstallCounter = jt.i.b(new Function0() { // from class: tg.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.f();
        }
    });

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ltg/d$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        ALREADY_INSTALLED,
        DEFER_INSTALL,
        START_INSTALLING;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ qt.a f31755e = qt.b.a(a());
    }

    @pt.f(c = "com.roblox.client.ads.GmaSdkInstaller", f = "GmaSdkInstaller.kt", l = {57, 58}, m = "awaitInstalled", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f31756t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f31758v;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31756t = obj;
            this.f31758v |= Integer.MIN_VALUE;
            return d.this.c(this);
        }
    }

    public static final TelemetryConfig f() {
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("GmaSdkInstallState", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 6, 1);
        aVar.a("Counts the install state of the GMA SDK when install requested");
        return aVar.d();
    }

    @Override // tl.d
    public void a(boolean instant) {
        if (sh.g.j("gmasdk")) {
            gk.p.h("GmaAdsInstaller", "GMA SDK already installed");
            e(a.ALREADY_INSTALLED);
            if (th.h.a().c0()) {
                installStartedOrCompleted.s(Unit.f22483a);
                return;
            }
            return;
        }
        if (th.h.a().e3() && !instant) {
            gk.p.h("GmaAdsInstaller", "Defer GMA SDK install");
            e(a.DEFER_INSTALL);
            sh.g.k("gmasdk");
        } else {
            gk.p.h("GmaAdsInstaller", "Installing GMA SDK");
            e(a.START_INSTALLING);
            if (th.h.a().c0()) {
                installStartedOrCompleted.s(Unit.f22483a);
            }
            sh.g.l("gmasdk");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6.h("gmasdk", true, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object c(nt.b r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof tg.d.b
            if (r0 == 0) goto L13
            r0 = r6
            tg.d$b r0 = (tg.d.b) r0
            int r1 = r0.f31758v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31758v = r1
            goto L18
        L13:
            tg.d$b r0 = new tg.d$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f31756t
            java.lang.Object r1 = ot.c.e()
            int r2 = r0.f31758v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jt.o.b(r6)
            goto L53
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            jt.o.b(r6)
            goto L46
        L38:
            jt.o.b(r6)
            ku.x<kotlin.Unit> r6 = tg.d.installStartedOrCompleted
            r0.f31758v = r4
            java.lang.Object r6 = r6.B(r0)
            if (r6 != r1) goto L46
            goto L52
        L46:
            sh.g r6 = sh.g.f31123a
            r0.f31758v = r3
            java.lang.String r2 = "gmasdk"
            java.lang.Object r6 = r6.h(r2, r4, r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r6 = kotlin.Unit.f22483a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.d.c(nt.b):java.lang.Object");
    }

    public final TelemetryConfig d() {
        return (TelemetryConfig) sdkInstallCounter.getValue();
    }

    public final void e(a installState) {
        TelemetryConfig telemetryConfigD = d();
        sm.c cVar = sm.c.f31236a;
        sm.c.b bVar = new sm.c.b();
        bVar.c("InstallState", installState.name());
        sm.c.g(telemetryConfigD, bVar.l(), 0.0d, 4, null);
    }
}
