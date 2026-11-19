package c6;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import av.d2;
import av.p0;
import av.z0;
import com.github.luben.zstd.BuildConfig;
import cv.t;
import cv.v;
import cv.y;
import g6.j0;
import h6.u;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import y5.w;
import y5.x;
import zt.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lc6/g;", "Ld6/e;", "Landroid/net/ConnectivityManager;", "connManager", BuildConfig.FLAVOR, "timeoutMs", "<init>", "(Landroid/net/ConnectivityManager;J)V", "Ly5/d;", "constraints", "Ldv/h;", "Lc6/b;", "a", "(Ly5/d;)Ldv/h;", "Lg6/j0;", "workSpec", BuildConfig.FLAVOR, "b", "(Lg6/j0;)Z", "Landroid/net/ConnectivityManager;", "J", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements d6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ConnectivityManager connManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long timeoutMs;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcv/v;", "Lc6/b;", BuildConfig.FLAVOR, "<anonymous>", "(Lcv/v;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {191}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<v<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4841t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f4842u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ y5.d f4843v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ g f4844w;

        /* JADX INFO: renamed from: c6.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", f = "WorkConstraintsTracker.kt", l = {162}, m = "invokeSuspend")
        public static final class C0095a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f4845t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ g f4846u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ v<b> f4847v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0095a(g gVar, v<? super b> vVar, eu.b<? super C0095a> bVar) {
                super(2, bVar);
                this.f4846u = gVar;
                this.f4847v = vVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new C0095a(this.f4846u, this.f4847v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((C0095a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f4845t;
                if (i10 == 0) {
                    o.b(obj);
                    long j10 = this.f4846u.timeoutMs;
                    this.f4845t = 1;
                    if (z0.b(j10, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                w.e().a(m.f4864a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.f4846u.timeoutMs + " ms");
                this.f4847v.v(new b.ConstraintsNotMet(7));
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y5.d dVar, g gVar, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f4843v = dVar;
            this.f4844w = gVar;
        }

        public static final Unit r(d2 d2Var, v vVar, b bVar) {
            d2.a.a(d2Var, null, 1, null);
            vVar.v(bVar);
            return Unit.f21506a;
        }

        public static final Unit s(Function0 function0) {
            function0.invoke();
            return Unit.f21506a;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = new a(this.f4843v, this.f4844w, bVar);
            aVar.f4842u = obj;
            return aVar;
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f4841t;
            if (i10 == 0) {
                o.b(obj);
                final v vVar = (v) this.f4842u;
                NetworkRequest networkRequestD = this.f4843v.d();
                if (networkRequestD == null) {
                    networkRequestD = u.a(this.f4843v.getRequiredNetworkType());
                }
                if (networkRequestD == null) {
                    y.a.a(vVar.a(), null, 1, null);
                    return Unit.f21506a;
                }
                final d2 d2VarD = av.k.d(vVar, null, null, new C0095a(this.f4844w, vVar, null), 3, null);
                Function1<? super b, Unit> function1 = new Function1() { // from class: c6.e
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return g.a.r(d2VarD, vVar, (b) obj2);
                    }
                };
                final Function0<Unit> function0B = Build.VERSION.SDK_INT >= 30 ? k.f4853a.b(this.f4844w.connManager, networkRequestD, function1) : d.INSTANCE.b(this.f4844w.connManager, networkRequestD, function1);
                Function0 function0 = new Function0() { // from class: c6.f
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g.a.s(function0B);
                    }
                };
                this.f4841t = 1;
                if (t.a(vVar, function0, this) == objE) {
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

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v<? super b> vVar, eu.b<? super Unit> bVar) {
            return ((a) create(vVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public g(@NotNull ConnectivityManager connManager, long j10) {
        Intrinsics.checkNotNullParameter(connManager, "connManager");
        this.connManager = connManager;
        this.timeoutMs = j10;
    }

    @Override // d6.e
    @NotNull
    public dv.h<b> a(@NotNull y5.d constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return dv.j.d(new a(constraints, this, null));
    }

    @Override // d6.e
    public boolean b(@NotNull j0 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return (workSpec.constraints.d() == null && workSpec.constraints.getRequiredNetworkType() == x.NOT_REQUIRED) ? false : true;
    }

    public /* synthetic */ g(ConnectivityManager connectivityManager, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectivityManager, (i10 & 2) != 0 ? 1000L : j10);
    }
}
