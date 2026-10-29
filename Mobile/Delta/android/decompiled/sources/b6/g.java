package b6;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import f6.j0;
import g6.u;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.p0;
import ku.z0;
import mu.t;
import mu.v;
import mu.y;
import org.jetbrains.annotations.NotNull;
import x5.w;
import x5.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0015"}, d2 = {"Lb6/g;", "Lc6/e;", "Landroid/net/ConnectivityManager;", "connManager", "", "timeoutMs", "<init>", "(Landroid/net/ConnectivityManager;J)V", "Lx5/d;", "constraints", "Lnu/h;", "Lb6/b;", "b", "(Lx5/d;)Lnu/h;", "Lf6/j0;", "workSpec", "", "a", "(Lf6/j0;)Z", "Landroid/net/ConnectivityManager;", "J", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements c6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ConnectivityManager connManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long timeoutMs;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/v;", "Lb6/b;", "", "<anonymous>", "(Lmu/v;)V"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {191}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<v<? super b>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f3958t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f3959u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ x5.d f3960v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ g f3961w;

        /* JADX INFO: renamed from: b6.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
        @pt.f(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", f = "WorkConstraintsTracker.kt", l = {162}, m = "invokeSuspend")
        public static final class C0074a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f3962t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ g f3963u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ v<b> f3964v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0074a(g gVar, v<? super b> vVar, nt.b<? super C0074a> bVar) {
                super(2, bVar);
                this.f3963u = gVar;
                this.f3964v = vVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new C0074a(this.f3963u, this.f3964v, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f3962t;
                if (i10 == 0) {
                    o.b(obj);
                    long j10 = this.f3963u.timeoutMs;
                    this.f3962t = 1;
                    if (z0.b(j10, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                w.e().a(m.f3981a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.f3963u.timeoutMs + " ms");
                this.f3964v.w(new b.ConstraintsNotMet(7));
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((C0074a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x5.d dVar, g gVar, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f3960v = dVar;
            this.f3961w = gVar;
        }

        public static final Unit t(d2 d2Var, v vVar, b bVar) {
            d2.a.a(d2Var, null, 1, null);
            vVar.w(bVar);
            return Unit.f22483a;
        }

        public static final Unit u(Function0 function0) {
            function0.invoke();
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            a aVar = new a(this.f3960v, this.f3961w, bVar);
            aVar.f3959u = obj;
            return aVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f3958t;
            if (i10 == 0) {
                o.b(obj);
                final v vVar = (v) this.f3959u;
                NetworkRequest networkRequestD = this.f3960v.d();
                if (networkRequestD == null) {
                    networkRequestD = u.a(this.f3960v.getRequiredNetworkType());
                }
                if (networkRequestD == null) {
                    y.a.a(vVar.a(), null, 1, null);
                    return Unit.f22483a;
                }
                final d2 d2VarD = ku.k.d(vVar, null, null, new C0074a(this.f3961w, vVar, null), 3, null);
                Function1<? super b, Unit> function1 = new Function1() { // from class: b6.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return g.a.t(d2VarD, vVar, (b) obj2);
                    }
                };
                final Function0<Unit> function0B = Build.VERSION.SDK_INT >= 30 ? k.f3970a.b(this.f3961w.connManager, networkRequestD, function1) : d.INSTANCE.b(this.f3961w.connManager, networkRequestD, function1);
                Function0 function0 = new Function0() { // from class: b6.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g.a.u(function0B);
                    }
                };
                this.f3958t = 1;
                if (t.a(vVar, function0, this) == objE) {
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
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v<? super b> vVar, nt.b<? super Unit> bVar) {
            return ((a) create(vVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public g(@NotNull ConnectivityManager connManager, long j10) {
        Intrinsics.checkNotNullParameter(connManager, "connManager");
        this.connManager = connManager;
        this.timeoutMs = j10;
    }

    @Override // c6.e
    public boolean a(@NotNull j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return (workSpec.constraints.d() == null && workSpec.constraints.getRequiredNetworkType() == x.NOT_REQUIRED) ? false : true;
    }

    @Override // c6.e
    @NotNull
    public nu.h<b> b(@NotNull x5.d constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return nu.j.d(new a(constraints, this, null));
    }

    public /* synthetic */ g(ConnectivityManager connectivityManager, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectivityManager, (i10 & 2) != 0 ? 1000L : j10);
    }
}
