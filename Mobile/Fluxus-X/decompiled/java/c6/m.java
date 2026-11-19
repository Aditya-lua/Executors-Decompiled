package c6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import av.d2;
import av.l0;
import av.p0;
import av.q0;
import com.github.luben.zstd.BuildConfig;
import e6.n;
import g6.j0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import y5.w;
import zt.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016*$\b\u0002\u0010\u001b\"\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¨\u0006\u001c"}, d2 = {"Lc6/l;", "Lg6/j0;", "spec", "Lav/l0;", "dispatcher", "Lc6/i;", "listener", "Lav/d2;", "e", "(Lc6/l;Lg6/j0;Lav/l0;Lc6/i;)Lav/d2;", "Le6/n;", "trackers", BuildConfig.FLAVOR, "Ld6/e;", "d", "(Le6/n;)Ljava/util/List;", "Landroid/content/Context;", "context", "Lc6/g;", "a", "(Landroid/content/Context;)Lc6/g;", BuildConfig.FLAVOR, "Ljava/lang/String;", "TAG", "Lkotlin/Function1;", "Lc6/b;", BuildConfig.FLAVOR, "OnConstraintState", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f4864a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {69}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4865t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l f4866u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ j0 f4867v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ i f4868w;

        /* JADX INFO: renamed from: c6.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0097a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f4869a;
            public final /* synthetic */ j0 b;

            public C0097a(i iVar, j0 j0Var) {
                this.f4869a = iVar;
                this.b = j0Var;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(b bVar, eu.b<? super Unit> bVar2) {
                this.f4869a.c(this.b, bVar);
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, j0 j0Var, i iVar, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f4866u = lVar;
            this.f4867v = j0Var;
            this.f4868w = iVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f4866u, this.f4867v, this.f4868w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f4865t;
            if (i10 == 0) {
                o.b(obj);
                dv.h<b> hVarA = this.f4866u.a(this.f4867v);
                C0097a c0097a = new C0097a(this.f4868w, this.f4867v);
                this.f4865t = 1;
                if (hVarA.collect(c0097a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    static {
        String strI = w.i("WorkConstraintsTracker");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(...)");
        f4864a = strI;
    }

    @NotNull
    public static final g a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new g((ConnectivityManager) systemService, 0L, 2, null);
    }

    public static final List<d6.e> d(n nVar) {
        List<d6.e> listP = p.p(new d6.c(nVar.a()), new d6.d(nVar.getBatteryNotLowTracker()), new d6.j(nVar.e()));
        if (Build.VERSION.SDK_INT >= 28) {
            listP.add(a(nVar.getContext()));
            return listP;
        }
        e6.h<NetworkState> hVarD = nVar.d();
        Intrinsics.checkNotNull(hVarD);
        listP.addAll(p.n(new d6.f(hVarD), new d6.i(nVar.d()), new d6.h(nVar.d()), new d6.g(nVar.d())));
        return listP;
    }

    @NotNull
    public static final d2 e(@NotNull l lVar, @NotNull j0 spec, @NotNull l0 dispatcher, @NotNull i listener) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return av.k.d(q0.a(dispatcher), null, null, new a(lVar, spec, listener, null), 3, null);
    }
}
