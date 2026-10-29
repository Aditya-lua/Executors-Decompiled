package b6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import d6.n;
import f6.j0;
import java.util.List;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.l0;
import ku.p0;
import ku.q0;
import org.jetbrains.annotations.NotNull;
import x5.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016*$\b\u0002\u0010\u001b\"\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¨\u0006\u001c"}, d2 = {"Lb6/l;", "Lf6/j0;", "spec", "Lku/l0;", "dispatcher", "Lb6/i;", "listener", "Lku/d2;", "e", "(Lb6/l;Lf6/j0;Lku/l0;Lb6/i;)Lku/d2;", "Ld6/n;", "trackers", "", "Lc6/e;", "d", "(Ld6/n;)Ljava/util/List;", "Landroid/content/Context;", "context", "Lb6/g;", "a", "(Landroid/content/Context;)Lb6/g;", "", "Ljava/lang/String;", "TAG", "Lkotlin/Function1;", "Lb6/b;", "", "OnConstraintState", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f3981a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {69}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f3982t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l f3983u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ j0 f3984v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ i f3985w;

        /* JADX INFO: renamed from: b6.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0076a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f3986a;
            public final /* synthetic */ j0 b;

            public C0076a(i iVar, j0 j0Var) {
                this.f3986a = iVar;
                this.b = j0Var;
            }

            @Override // nu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(b bVar, nt.b<? super Unit> bVar2) {
                this.f3986a.e(this.b, bVar);
                return Unit.f22483a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, j0 j0Var, i iVar, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f3983u = lVar;
            this.f3984v = j0Var;
            this.f3985w = iVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(this.f3983u, this.f3984v, this.f3985w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f3982t;
            if (i10 == 0) {
                o.b(obj);
                nu.h<b> hVarA = this.f3983u.a(this.f3984v);
                C0076a c0076a = new C0076a(this.f3985w, this.f3984v);
                this.f3982t = 1;
                if (hVarA.collect(c0076a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    static {
        String strI = w.i("WorkConstraintsTracker");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(...)");
        f3981a = strI;
    }

    @NotNull
    public static final g a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new g((ConnectivityManager) systemService, 0L, 2, null);
    }

    public static final List<c6.e> d(n nVar) {
        List<c6.e> listP = p.p(new c6.c(nVar.a()), new c6.d(nVar.getBatteryNotLowTracker()), new c6.j(nVar.e()));
        if (Build.VERSION.SDK_INT >= 28) {
            listP.add(a(nVar.getContext()));
            return listP;
        }
        d6.h<NetworkState> hVarD = nVar.d();
        Intrinsics.checkNotNull(hVarD);
        listP.addAll(p.n(new c6.f(hVarD), new c6.i(nVar.d()), new c6.h(nVar.d()), new c6.g(nVar.d())));
        return listP;
    }

    @NotNull
    public static final d2 e(@NotNull l lVar, @NotNull j0 spec, @NotNull l0 dispatcher, @NotNull i listener) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return ku.k.d(q0.a(dispatcher), null, null, new a(lVar, spec, listener, null), 3, null);
    }
}
