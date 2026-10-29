package tg;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7700p0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p229jt.C7342i;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p256ku.C7945z;
import p256ku.InterfaceC7937x;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;
import sh.C11382g;
import sm.C11416c;
import th.C11659h;
import tl.InterfaceC11687i;

/* JADX INFO: renamed from: tg.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m31665d2 = {"Ltg/d;", "Ltl/i;", "<init>", "()V", "", Payload.INSTANT, "", "a", "(Z)V", "c", "(Lnt/b;)Ljava/lang/Object;", "Ltg/d$a;", "installState", "e", "(Ltg/d$a;)V", "Lku/x;", "b", "Lku/x;", "installStartedOrCompleted", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "Ljt/h;", "d", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "sdkInstallCounter", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11645d implements InterfaceC11687i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11645d f41073a = new C11645d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7937x<Unit> installStartedOrCompleted = C7945z.m32935c(null, 1, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h sdkInstallCounter = C7342i.m30456b(new Function0() { // from class: tg.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C11645d.m43329f();
        }
    });

    /* JADX INFO: renamed from: tg.d$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Ltg/d$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum a {
        ALREADY_INSTALLED,
        DEFER_INSTALL,
        START_INSTALLING;


        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ InterfaceC10707a f41080e = C10708b.m40805a(m43334a());
    }

    /* JADX INFO: renamed from: tg.d$b */
    @InterfaceC10344f(m39663c = "com.roblox.client.ads.GmaSdkInstaller", m39664f = "GmaSdkInstaller.kt", m39665l = {57, 58}, m39666m = "awaitInstalled", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f41081t;

        /* JADX INFO: renamed from: v */
        public int f41083v;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f41081t = obj;
            this.f41083v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C11645d.this.m43331c(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final TelemetryConfig m43329f() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("GmaSdkInstallState", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 6, 1);
        aVar.mo42754a("Counts the install state of the GMA SDK when install requested");
        return aVar.m42774d();
    }

    @Override // tl.InterfaceC11687i
    /* JADX INFO: renamed from: a */
    public void mo43330a(boolean instant) {
        if (C11382g.m42684j("gmasdk")) {
            C6124q.m27063h("GmaAdsInstaller", "GMA SDK already installed");
            m43333e(a.ALREADY_INSTALLED);
            if (C11659h.m43403a().mo43632g0()) {
                installStartedOrCompleted.mo32930s(Unit.f29331a);
                return;
            }
            return;
        }
        if (C11659h.m43403a().mo43663k3() && !instant) {
            C6124q.m27063h("GmaAdsInstaller", "Defer GMA SDK install");
            m43333e(a.DEFER_INSTALL);
            C11382g.m42685k("gmasdk");
        } else {
            C6124q.m27063h("GmaAdsInstaller", "Installing GMA SDK");
            m43333e(a.START_INSTALLING);
            if (C11659h.m43403a().mo43632g0()) {
                installStartedOrCompleted.mo32930s(Unit.f29331a);
            }
            C11382g.m42686l("gmasdk");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6.m42693h("gmasdk", true, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object m43331c(InterfaceC9557b interfaceC9557b) {
        b bVar;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f41083v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f41083v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object obj = bVar.f41081t;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f41083v;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            InterfaceC7937x<Unit> interfaceC7937x = installStartedOrCompleted;
            bVar.f41083v = 1;
            if (interfaceC7937x.mo32927B(bVar) != objM38805e) {
            }
            return objM38805e;
        }
        if (i11 == 1) {
            C7348o.m30470b(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
        }
        return Unit.f29331a;
        C11382g c11382g = C11382g.f40243a;
        bVar.f41083v = 2;
    }

    /* JADX INFO: renamed from: d */
    public final TelemetryConfig m43332d() {
        return (TelemetryConfig) sdkInstallCounter.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m43333e(a installState) {
        TelemetryConfig telemetryConfigM43332d = m43332d();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c("InstallState", installState.name());
        C11416c.m42771g(telemetryConfigM43332d, bVar.m42785l(), 0.0d, 4, null);
    }
}
