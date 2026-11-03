package sg;

import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import ek.q;
import iu.x;
import iu.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R(\u0010 \u001a\u00020\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lsg/f;", "Lrl/i;", "<init>", "()V", "", Payload.INSTANT, "", "a", "(Z)V", "Lrl/i$a;", "mode", "b", "(Lrl/i$a;Llt/b;)Ljava/lang/Object;", "d", "(Llt/b;)Ljava/lang/Object;", "Lsg/f$a;", "h", "(Lrl/i$a;)Lsg/f$a;", "installState", "f", "(Lsg/f$a;)V", "Liu/x;", "Liu/x;", "installStartedOrCompleted", "Lsg/c;", "c", "Lsg/c;", "getBackgroundInstallScheduler$NativeShell_googleProdRelease", "()Lsg/c;", "setBackgroundInstallScheduler$NativeShell_googleProdRelease", "(Lsg/c;)V", "getBackgroundInstallScheduler$NativeShell_googleProdRelease$annotations", "backgroundInstallScheduler", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "Lgt/h;", "e", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "sdkInstallCounter", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements rl.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f31198a = new f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final x<Unit> installStartedOrCompleted = z.c(null, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static sg.c backgroundInstallScheduler = new sg.c(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h sdkInstallCounter = gt.i.b(new Function0() { // from class: sg.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.g();
        }
    });

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lsg/f$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        ALREADY_INSTALLED,
        DEFER_INSTALL,
        START_INSTALLING,
        BACKGROUND_INSTALL;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ot.a f31205f = ot.b.a(a());
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31206a;

        static {
            int[] iArr = new int[rl.i.a.values().length];
            try {
                iArr[rl.i.a.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rl.i.a.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31206a = iArr;
        }
    }

    @nt.f(c = "com.roblox.client.ads.GmaSdkInstaller", f = "GmaSdkInstaller.kt", l = {91, 92}, m = "awaitInstalled", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f31207t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f31209v;

        public c(lt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31207t = obj;
            this.f31209v |= Integer.MIN_VALUE;
            return f.this.d(this);
        }
    }

    public static final TelemetryConfig g() {
        qm.c cVar = qm.c.f29983a;
        qm.c.a aVar = new qm.c.a("GmaSdkInstallState", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 6, 1);
        aVar.a("Counts the install state of the GMA SDK when install requested");
        return aVar.d();
    }

    @Override // rl.i
    public void a(boolean instant) {
        if (qh.g.j("gmasdk")) {
            q.h("GmaAdsInstaller", "GMA SDK already installed");
            f(a.ALREADY_INSTALLED);
            if (rh.h.a().h0()) {
                installStartedOrCompleted.v(Unit.f22938a);
                return;
            }
            return;
        }
        if (rh.h.a().o3() && !instant) {
            q.h("GmaAdsInstaller", "Defer GMA SDK install");
            f(a.DEFER_INSTALL);
            qh.g.k("gmasdk");
        } else {
            q.h("GmaAdsInstaller", "Installing GMA SDK");
            f(a.START_INSTALLING);
            if (rh.h.a().h0()) {
                installStartedOrCompleted.v(Unit.f22938a);
            }
            qh.g.l("gmasdk");
        }
    }

    @Override // rl.i
    @Nullable
    public Object b(@NotNull rl.i.a aVar, @NotNull lt.b<? super Unit> bVar) {
        if (qh.g.j("gmasdk")) {
            q.h("GmaAdsInstaller", "GMA SDK already installed");
            f(a.ALREADY_INSTALLED);
        } else {
            q.h("GmaAdsInstaller", "Triggered Gmasdk install: " + aVar);
            f(h(aVar));
            int i10 = b.f31206a[aVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new gt.l();
                }
                Object objD = backgroundInstallScheduler.d(bVar);
                return objD == mt.c.e() ? objD : Unit.f22938a;
            }
            qh.g.k("gmasdk");
        }
        return Unit.f22938a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6.h("gmasdk", true, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object d(lt.b r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof sg.f.c
            if (r0 == 0) goto L13
            r0 = r6
            sg.f$c r0 = (sg.f.c) r0
            int r1 = r0.f31209v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31209v = r1
            goto L18
        L13:
            sg.f$c r0 = new sg.f$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f31207t
            java.lang.Object r1 = mt.c.e()
            int r2 = r0.f31209v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            gt.o.b(r6)
            goto L53
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            gt.o.b(r6)
            goto L46
        L38:
            gt.o.b(r6)
            iu.x<kotlin.Unit> r6 = sg.f.installStartedOrCompleted
            r0.f31209v = r4
            java.lang.Object r6 = r6.n(r0)
            if (r6 != r1) goto L46
            goto L52
        L46:
            qh.g r6 = qh.g.f29870a
            r0.f31209v = r3
            java.lang.String r2 = "gmasdk"
            java.lang.Object r6 = r6.h(r2, r4, r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r6 = kotlin.Unit.f22938a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.f.d(lt.b):java.lang.Object");
    }

    public final TelemetryConfig e() {
        return (TelemetryConfig) sdkInstallCounter.getValue();
    }

    public final void f(a installState) {
        TelemetryConfig telemetryConfigE = e();
        qm.c cVar = qm.c.f29983a;
        qm.c.b bVar = new qm.c.b();
        bVar.c("InstallState", installState.name());
        qm.c.g(telemetryConfigE, bVar.l(), 0.0d, 4, null);
    }

    public final a h(rl.i.a aVar) {
        int i10 = b.f31206a[aVar.ordinal()];
        if (i10 == 1) {
            return a.DEFER_INSTALL;
        }
        if (i10 == 2) {
            return a.BACKGROUND_INSTALL;
        }
        throw new gt.l();
    }
}
