package mq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p000lifecycle.j0;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.s;
import androidx.p000lifecycle.t;
import gt.o;
import iu.k;
import iu.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu.i;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r5.a;
import xt.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B)\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u0010*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00028\u0001H$¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lmq/c;", "Lr5/a;", "T", "Rendering", "Lmq/a;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "inflateFn", "<init>", "(Lxt/n;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Llu/p0;", "g2", "(Llu/p0;)V", "rendering", "h2", "(Ljava/lang/Object;)V", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c<T extends r5.a, Rendering> extends mq.a<T> {

    @f(c = "com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment$collectAndRender$1", f = "BaseWorkflowFragment.kt", l = {33}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24967t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c<T, Rendering> f24968u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ lu.p0<Rendering> f24969v;

        /* JADX INFO: renamed from: mq.c$a$a, reason: collision with other inner class name */
        @f(c = "com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment$collectAndRender$1$1", f = "BaseWorkflowFragment.kt", l = {34}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class C0446a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f24970t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ lu.p0<Rendering> f24971u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ c<T, Rendering> f24972v;

            /* JADX INFO: renamed from: mq.c$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0447a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ c<T, Rendering> f24973a;

                public C0447a(c<T, Rendering> cVar) {
                    this.f24973a = cVar;
                }

                @Override // lu.i
                public final Object emit(Rendering rendering, lt.b<? super Unit> bVar) {
                    if (rendering == null) {
                        return Unit.f22938a;
                    }
                    this.f24973a.h2(rendering);
                    this.f24973a.a2();
                    return Unit.f22938a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0446a(lu.p0<? extends Rendering> p0Var, c<T, Rendering> cVar, lt.b<? super C0446a> bVar) {
                super(2, bVar);
                this.f24971u = p0Var;
                this.f24972v = cVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new C0446a(this.f24971u, this.f24972v, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((C0446a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f24970t;
                if (i10 == 0) {
                    o.b(obj);
                    lu.p0<Rendering> p0Var = this.f24971u;
                    C0447a c0447a = new C0447a(this.f24972v);
                    this.f24970t = 1;
                    if (p0Var.collect(c0447a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                throw new gt.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c<T, Rendering> cVar, lu.p0<? extends Rendering> p0Var, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f24968u = cVar;
            this.f24969v = p0Var;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new a(this.f24968u, this.f24969v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f24967t;
            if (i10 == 0) {
                o.b(obj);
                c<T, Rendering> cVar = this.f24968u;
                l.b bVar = l.b.STARTED;
                C0446a c0446a = new C0446a(this.f24969v, cVar, null);
                this.f24967t = 1;
                if (j0.b(cVar, bVar, c0446a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> inflateFn) {
        super(inflateFn);
        Intrinsics.checkNotNullParameter(inflateFn, "inflateFn");
    }

    @Override // androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        E1();
    }

    public final void g2(@NotNull lu.p0<? extends Rendering> p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        k.d(t.a(sVarK0), null, null, new a(this, p0Var, null), 3, null);
    }

    public abstract void h2(Rendering rendering);
}
