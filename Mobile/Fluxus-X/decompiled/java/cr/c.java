package cr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p000lifecycle.j0;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.s;
import androidx.p000lifecycle.t;
import av.k;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import dv.i;
import gu.f;
import gu.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import pu.n;
import s5.a;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B)\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u0010*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00028\u0001H$¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcr/c;", "Ls5/a;", "T", "Rendering", "Lcr/a;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", BuildConfig.FLAVOR, "inflateFn", "<init>", "(Lpu/n;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", BuildConfig.FLAVOR, "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ldv/p0;", "g2", "(Ldv/p0;)V", "rendering", "h2", "(Ljava/lang/Object;)V", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c<T extends s5.a, Rendering> extends cr.a<T> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment$collectAndRender$1", f = "BaseWorkflowFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11519t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c<T, Rendering> f11520u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ dv.p0<Rendering> f11521v;

        /* JADX INFO: renamed from: cr.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment$collectAndRender$1$1", f = "BaseWorkflowFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class C0203a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11522t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ dv.p0<Rendering> f11523u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ c<T, Rendering> f11524v;

            /* JADX INFO: renamed from: cr.c$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0204a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ c<T, Rendering> f11525a;

                public C0204a(c<T, Rendering> cVar) {
                    this.f11525a = cVar;
                }

                @Override // dv.i
                public final Object emit(Rendering rendering, eu.b<? super Unit> bVar) {
                    if (rendering == null) {
                        return Unit.f21506a;
                    }
                    this.f11525a.h2(rendering);
                    this.f11525a.a2();
                    return Unit.f21506a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0203a(dv.p0<? extends Rendering> p0Var, c<T, Rendering> cVar, eu.b<? super C0203a> bVar) {
                super(2, bVar);
                this.f11523u = p0Var;
                this.f11524v = cVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new C0203a(this.f11523u, this.f11524v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((C0203a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f11522t;
                if (i10 == 0) {
                    o.b(obj);
                    dv.p0<Rendering> p0Var = this.f11523u;
                    C0204a c0204a = new C0204a(this.f11524v);
                    this.f11522t = 1;
                    if (p0Var.collect(c0204a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                throw new zt.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c<T, Rendering> cVar, dv.p0<? extends Rendering> p0Var, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f11520u = cVar;
            this.f11521v = p0Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f11520u, this.f11521v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f11519t;
            if (i10 == 0) {
                o.b(obj);
                c<T, Rendering> cVar = this.f11520u;
                l.b bVar = l.b.STARTED;
                C0203a c0203a = new C0203a(this.f11521v, cVar, null);
                this.f11519t = 1;
                if (j0.b(cVar, bVar, c0203a, this) == objE) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> inflateFn) {
        super(inflateFn);
        Intrinsics.checkNotNullParameter(inflateFn, "inflateFn");
    }

    @Override // f4.q
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        E1();
    }

    public final void g2(@NotNull dv.p0<? extends Rendering> p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        k.d(t.a(sVarK0), null, null, new a(this, p0Var, null), 3, null);
    }

    public abstract void h2(Rendering rendering);
}
