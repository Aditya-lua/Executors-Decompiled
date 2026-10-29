package ak;

import android.content.Context;
import android.os.SystemClock;
import com.roblox.universalapp.logging.LoggingProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000f"}, d2 = {"Lak/r0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)V", "b", "c", "d", "Lku/p0;", "Lku/p0;", "workScope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r0 f634a = new r0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ku.p0 workScope = ku.q0.a(ku.g1.b());

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.startup.LibLoadParallelWorkManager$warmSharedPreferences$1", f = "LibLoadParallelWorkManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f635t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f636u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f636u = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(this.f636u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f635t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            gk.y yVarE = gk.y.e(this.f636u);
            yVarE.c("DeviceInstallPreferences");
            yVarE.c("prefs");
            LoggingProtocol.m("early_shared_prefs_end", null, 2, null);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r0 r0Var = f634a;
        r0Var.b();
        r0Var.c(context);
        r0Var.d(context);
    }

    public final void b() {
        if (th.h.a().q2()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            mk.c.INSTANCE.c().q();
            LoggingProtocol.l("early_asset_dir_setup_begin", Long.valueOf(jElapsedRealtime));
        }
    }

    public final void c(Context context) {
        if (th.h.a().Y0()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            rl.j.j().i(context);
            LoggingProtocol.l("early_play_integrity_begin", Long.valueOf(jElapsedRealtime));
        }
    }

    public final void d(Context context) {
        if (th.h.a().N4()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ku.k.d(workScope, null, null, new a(context, null), 3, null);
            LoggingProtocol.l("early_shared_prefs_begin", Long.valueOf(jElapsedRealtime));
        }
    }
}
