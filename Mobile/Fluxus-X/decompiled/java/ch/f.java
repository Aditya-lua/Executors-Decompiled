package ch;

import av.x;
import av.z;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.p0;
import p001kotlin.jvm.functions.Function0;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R(\u0010 \u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lch/f;", "Lhm/i;", "<init>", "()V", BuildConfig.FLAVOR, Payload.INSTANT, BuildConfig.FLAVOR, "a", "(Z)V", "Lhm/i$a;", "mode", "b", "(Lhm/i$a;Leu/b;)Ljava/lang/Object;", "d", "(Leu/b;)Ljava/lang/Object;", "Lch/f$a;", "h", "(Lhm/i$a;)Lch/f$a;", "installState", "f", "(Lch/f$a;)V", "Lav/x;", "Lav/x;", "installStartedOrCompleted", "Lch/c;", "c", "Lch/c;", "getBackgroundInstallScheduler$NativeShell_googleProdRelease", "()Lch/c;", "setBackgroundInstallScheduler$NativeShell_googleProdRelease", "(Lch/c;)V", "getBackgroundInstallScheduler$NativeShell_googleProdRelease$annotations", "backgroundInstallScheduler", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "Lzt/h;", "e", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "sdkInstallCounter", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements hm.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f5140a = new f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final x<Unit> installStartedOrCompleted = z.c(null, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static ch.c backgroundInstallScheduler = new ch.c(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final zt.h sdkInstallCounter = zt.i.a(new Function0() { // from class: ch.e
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.g();
        }
    });

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lch/f$a;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        ALREADY_INSTALLED,
        DEFER_INSTALL,
        START_INSTALLING,
        BACKGROUND_INSTALL;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ hu.a f5147f = hu.b.a(a());
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5148a;

        static {
            int[] iArr = new int[hm.i.a.values().length];
            try {
                iArr[hm.i.a.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hm.i.a.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5148a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.ads.GmaSdkInstaller", f = "GmaSdkInstaller.kt", l = {91, 92}, m = "awaitInstalled", v = 1)
    public static final class c extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f5149t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f5151v;

        public c(eu.b<? super c> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f5149t = obj;
            this.f5151v |= Integer.MIN_VALUE;
            return f.this.d(this);
        }
    }

    public static final TelemetryConfig g() {
        fn.c cVar = fn.c.f16193a;
        fn.c.a aVar = new fn.c.a("GmaSdkInstallState", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 6, 1);
        aVar.a("Counts the install state of the GMA SDK when install requested");
        return aVar.d();
    }

    @Override // hm.i
    public void a(boolean instant) {
        if (ai.h.k("gmasdk")) {
            q.h("GmaAdsInstaller", "GMA SDK already installed");
            f(a.ALREADY_INSTALLED);
            if (bi.h.a().j0()) {
                installStartedOrCompleted.s(Unit.f21506a);
                return;
            }
            return;
        }
        if (bi.h.a().r3() && !instant) {
            q.h("GmaAdsInstaller", "Defer GMA SDK install");
            f(a.DEFER_INSTALL);
            ai.h.l("gmasdk");
        } else {
            q.h("GmaAdsInstaller", "Installing GMA SDK");
            f(a.START_INSTALLING);
            if (bi.h.a().j0()) {
                installStartedOrCompleted.s(Unit.f21506a);
            }
            ai.h.m("gmasdk");
        }
    }

    @Override // hm.i
    @Nullable
    public Object b(@NotNull hm.i.a aVar, @NotNull eu.b<? super Unit> bVar) {
        if (ai.h.k("gmasdk")) {
            q.h("GmaAdsInstaller", "GMA SDK already installed");
            f(a.ALREADY_INSTALLED);
        } else {
            q.h("GmaAdsInstaller", "Triggered Gmasdk install: " + aVar);
            f(h(aVar));
            int i10 = b.f5148a[aVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zt.l();
                }
                Object objD = backgroundInstallScheduler.d(bVar);
                return objD == fu.c.e() ? objD : Unit.f21506a;
            }
            ai.h.l("gmasdk");
        }
        return Unit.f21506a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6.i("gmasdk", true, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object d(eu.b bVar) {
        c cVar;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f5151v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f5151v = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object obj = cVar.f5149t;
        Object objE = fu.c.e();
        int i11 = cVar.f5151v;
        if (i11 == 0) {
            o.b(obj);
            x<Unit> xVar = installStartedOrCompleted;
            cVar.f5151v = 1;
            if (xVar.y(cVar) != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            o.b(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
        }
        return Unit.f21506a;
        ai.h hVar = ai.h.f468a;
        cVar.f5151v = 2;
    }

    public final TelemetryConfig e() {
        return (TelemetryConfig) sdkInstallCounter.getValue();
    }

    public final void f(a installState) {
        TelemetryConfig telemetryConfigE = e();
        fn.c cVar = fn.c.f16193a;
        fn.c.b bVar = new fn.c.b();
        bVar.c("InstallState", installState.name());
        fn.c.g(telemetryConfigE, bVar.l(), 0.0d, 4, null);
    }

    public final a h(hm.i.a aVar) {
        int i10 = b.f5148a[aVar.ordinal()];
        if (i10 == 1) {
            return a.DEFER_INSTALL;
        }
        if (i10 == 2) {
            return a.BACKGROUND_INSTALL;
        }
        throw new zt.l();
    }
}
