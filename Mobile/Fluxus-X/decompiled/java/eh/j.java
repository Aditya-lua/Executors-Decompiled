package eh;

import android.content.Context;
import av.g1;
import com.github.luben.zstd.BuildConfig;
import ik.w0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Leh/j;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "a", "(Landroid/content/Context;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f13544a = new j();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.analytics.BacktraceInitializer$initEarlyIfEnabled$1", f = "BacktraceInitializer.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13545t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f13546u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ BacktraceInitValues f13547v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, BacktraceInitValues backtraceInitValues, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f13546u = context;
            this.f13547v = backtraceInitValues;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f13546u, this.f13547v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f13545t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            try {
                f.h().k(this.f13546u, this.f13547v);
            } catch (Throwable th2) {
                ok.q.k("rbx.backtrace", "Early Backtrace init failed due to " + th2);
            }
            return Unit.f21506a;
        }
    }

    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (w0.i(context)) {
            av.k.d(av.q0.a(g1.a()), null, null, new a(context, h.c(context), null), 3, null);
        }
    }
}
