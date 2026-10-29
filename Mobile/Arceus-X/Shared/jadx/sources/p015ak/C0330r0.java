package p015ak;

import android.content.Context;
import android.os.SystemClock;
import com.roblox.universalapp.logging.LoggingProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mk.C8569c;
import org.jetbrains.annotations.NotNull;
import p151gk.C6133z;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p416rl.C10902j;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import th.C11659h;

/* JADX INFO: renamed from: ak.r0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000f"}, m31665d2 = {"Lak/r0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)V", "b", "c", "d", "Lku/p0;", "Lku/p0;", "workScope", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C0330r0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0330r0 f834a = new C0330r0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7906p0 workScope = C7910q0.m32885a(C7864g1.m32644b());

    /* JADX INFO: renamed from: ak.r0$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.startup.LibLoadParallelWorkManager$warmSharedPreferences$1", m39664f = "LibLoadParallelWorkManager.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f836t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Context f837u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f837u = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f837u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f836t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C6133z c6133zM27106e = C6133z.m27106e(this.f837u);
            c6133zM27106e.m27107c("DeviceInstallPreferences");
            c6133zM27106e.m27107c("prefs");
            LoggingProtocol.m16000m("early_shared_prefs_end", null, 2, null);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m1326a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C0330r0 c0330r0 = f834a;
        c0330r0.m1327b();
        c0330r0.m1328c(context);
        c0330r0.m1329d(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m1327b() {
        if (C11659h.m43403a().mo43739v2()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C8569c.INSTANCE.m34528c().m34519q();
            LoggingProtocol.m15999l("early_asset_dir_setup_begin", Long.valueOf(jElapsedRealtime));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1328c(Context context) {
        if (C11659h.m43403a().mo43602c1()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C10902j.m41464j().m41469i(context);
            LoggingProtocol.m15999l("early_play_integrity_begin", Long.valueOf(jElapsedRealtime));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1329d(Context context) {
        if (C11659h.m43403a().mo43540T4()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C7882k.m32780d(workScope, null, null, new a(context, null), 3, null);
            LoggingProtocol.m15999l("early_shared_prefs_begin", Long.valueOf(jElapsedRealtime));
        }
    }
}
