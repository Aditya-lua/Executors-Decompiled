package xp;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.s;
import androidx.p000lifecycle.t;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import dv.c0;
import dv.i;
import dv.r0;
import f4.q;
import gu.f;
import gu.m;
import nn.ViewEnvironment;
import nn.d0;
import nn.h0;
import np.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.k0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.k;
import pu.n;
import vp.e1;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0011\u001a\u00020\t\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0013\u001a\u00020\t\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0012R(\u0010\u001c\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010,\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lxp/b;", "Lcr/a;", "Lpp/d;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", BuildConfig.FLAVOR, "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "PropsT", "StateT", "OutputT", "Lvp/e1;", "rendering", "k2", "(Lvp/e1;)V", "m2", "Lnn/d0;", "j0", "Lnn/d0;", "j2", "()Lnn/d0;", "setViewRegistry", "(Lnn/d0;)V", "getViewRegistry$annotations", "viewRegistry", "Ljr/a;", "k0", "Ljr/a;", "i2", "()Ljr/a;", "setSystemUiController", "(Ljr/a;)V", "systemUiController", "Ldv/c0;", BuildConfig.FLAVOR, "l0", "Ldv/c0;", "propsFlow", "m0", "Lvp/e1;", "lastRendering", "n0", "b", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends cr.a<pp.d> {

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public d0 viewRegistry;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public jr.a systemUiController;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<Object> propsFlow;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public e1<Object, Object, Object> lastRendering;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements n<LayoutInflater, ViewGroup, Boolean, pp.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36947a = new a();

        public a() {
            super(3, pp.d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2FragmentWorkflowStepBinding;", 0);
        }

        public final pp.d d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return pp.d.c(p8, viewGroup, z10);
        }

        @Override // pu.n
        public /* bridge */ /* synthetic */ pp.d invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: xp.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxp/b$b;", BuildConfig.FLAVOR, "<init>", "()V", "Lxp/b;", "a", "()Lxp/b;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final b a() {
            return new b();
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment$initialize$1", f = "WorkflowStepFragment.kt", l = {65}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36948t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c0<PropsT> f36950v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c0<PropsT> f36951a;

            public a(c0<PropsT> c0Var) {
                this.f36951a = c0Var;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // dv.i
            public final Object emit(Object obj, eu.b<? super Unit> bVar) {
                Object objEmit;
                return (obj == null || (objEmit = this.f36951a.emit((PropsT) obj, bVar)) != fu.c.e()) ? Unit.f21506a : objEmit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c0<PropsT> c0Var, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f36950v = c0Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return b.this.new c(this.f36950v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f36948t;
            if (i10 == 0) {
                o.b(obj);
                c0 c0Var = b.this.propsFlow;
                a aVar = new a(this.f36950v);
                this.f36948t = 1;
                if (c0Var.collect(aVar, this) == objE) {
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

    /* JADX INFO: Add missing generic type declarations: [OutputT] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "OutputT", "it"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment$initialize$contentView$1$1", f = "WorkflowStepFragment.kt", l = {}, m = "invokeSuspend")
    public static final class d<OutputT> extends m implements Function2<OutputT, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36952t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f36953u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ e1<PropsT, StateT, OutputT> f36954v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e1<PropsT, StateT, OutputT> e1Var, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f36954v = e1Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            d dVar = new d(this.f36954v, bVar);
            dVar.f36953u = obj;
            return dVar;
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.f36953u;
            fu.c.e();
            if (this.f36952t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f36954v.getHandler().invoke(obj2);
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(OutputT outputt, eu.b<? super Unit> bVar) {
            return ((d) create(outputt, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public b() {
        super(a.f36947a);
        this.propsFlow = r0.a(null);
    }

    public static final void l2(b bVar) {
        bVar.a2();
    }

    @Override // f4.q
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        E1();
        e1<Object, Object, Object> e1Var = this.lastRendering;
        if (e1Var != null) {
            k2(e1Var);
        }
    }

    @NotNull
    public final jr.a i2() {
        jr.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    @NotNull
    public final d0 j2() {
        d0 d0Var = this.viewRegistry;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.u("viewRegistry");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <PropsT, StateT, OutputT> void k2(@NotNull e1<PropsT, StateT, OutputT> rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!d2()) {
            this.lastRendering = rendering;
            return;
        }
        c0 c0VarA = r0.a(rendering.a());
        s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        androidx.p000lifecycle.m mVarA = t.a(sVarK0);
        AttributeSet attributeSet = null;
        Object[] objArr = 0;
        av.k.d(mVarA, null, null, new c(c0VarA, null), 3, null);
        q qVarJ = J();
        Intrinsics.d(qVarJ, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment");
        yp.i iVarN2 = ((yp.d) qVarJ).n2();
        if (!Intrinsics.c(iVarN2.e().f(), rendering.getName())) {
            iVarN2.g();
        }
        iVarN2.e().o(rendering.getName());
        Context contextI1 = I1();
        Intrinsics.checkNotNullExpressionValue(contextI1, "requireContext(...)");
        h0 h0Var = new h0(contextI1, attributeSet, 2, objArr == true ? 1 : 0);
        l lVarA = a();
        Intrinsics.checkNotNullExpressionValue(lVarA, "<get-lifecycle>(...)");
        h0.b(h0Var, lVarA, nn.a.a(rendering.c(), t.a(this), c0VarA, iVarN2.getSavedStateHandle(), b0.f26280a.a(), new d(rendering, null)), null, new ViewEnvironment(k0.m(zt.s.a(d0.INSTANCE, j2()), zt.s.a(jr.b.b, i2()))), 4, null);
        ((pp.d) b2()).getRoot().removeAllViews();
        ((pp.d) b2()).getRoot().addView(h0Var);
        ((pp.d) b2()).getRoot().post(new Runnable() { // from class: xp.a
            @Override // java.lang.Runnable
            public final void run() {
                b.l2(this.f36941a);
            }
        });
    }

    public final <PropsT, StateT, OutputT> void m2(@NotNull e1<PropsT, StateT, OutputT> rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        c0<Object> c0Var = this.propsFlow;
        PropsT propstA = rendering.a();
        Intrinsics.d(propstA, "null cannot be cast to non-null type kotlin.Any");
        c0Var.setValue(propstA);
    }
}
