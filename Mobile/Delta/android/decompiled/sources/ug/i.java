package ug;

import android.content.Context;
import iu.g1;
import iu.p0;
import iu.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yj.s0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lug/i;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f32849a = new i();

    @nt.f(c = "com.roblox.client.analytics.BacktraceInitializer$initEarlyIfEnabled$1", f = "BacktraceInitializer.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32850t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f32851u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ BacktraceInitValues f32852v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, BacktraceInitValues backtraceInitValues, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f32851u = context;
            this.f32852v = backtraceInitValues;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new a(this.f32851u, this.f32852v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f32850t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            try {
                e.h().k(this.f32851u, this.f32852v);
            } catch (Throwable th2) {
                ek.q.k("rbx.backtrace", "Early Backtrace init failed due to " + th2);
            }
            return Unit.f22938a;
        }
    }

    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (s0.c(context)) {
            iu.k.d(q0.a(g1.a()), null, null, new a(context, g.c(context), null), 3, null);
        }
    }
}
