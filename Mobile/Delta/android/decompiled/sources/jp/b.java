package jp;

import an.ViewEnvironment;
import an.c0;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.s;
import androidx.p000lifecycle.t;
import com.squareup.workflow1.ui.WorkflowLayout;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import com.withpersona.sdk2.inquiry.internal.workflows.e;
import hp.e1;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import ku.p0;
import nu.i;
import nu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import pt.m;
import zo.z;
import zt.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0011\u001a\u00020\t\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0013\u001a\u00020\t\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0012R(\u0010\u001c\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010,\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Ljp/b;", "Loq/a;", "Lbp/d;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "PropsT", "StateT", "OutputT", "Lhp/e1;", "rendering", "k2", "(Lhp/e1;)V", "m2", "Lan/c0;", "j0", "Lan/c0;", "j2", "()Lan/c0;", "setViewRegistry", "(Lan/c0;)V", "getViewRegistry$annotations", "viewRegistry", "Lvq/a;", "k0", "Lvq/a;", "i2", "()Lvq/a;", "setSystemUiController", "(Lvq/a;)V", "systemUiController", "Lnu/c0;", "", "l0", "Lnu/c0;", "propsFlow", "m0", "Lhp/e1;", "lastRendering", "n0", "b", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends oq.a<bp.d> {

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public c0 viewRegistry;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public vq.a systemUiController;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nu.c0<Object> propsFlow;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public e1<Object, Object, Object> lastRendering;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements n<LayoutInflater, ViewGroup, Boolean, bp.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21580a = new a();

        public a() {
            super(3, bp.d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2FragmentWorkflowStepBinding;", 0);
        }

        public final bp.d d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return bp.d.c(p8, viewGroup, z10);
        }

        @Override // zt.n
        public /* bridge */ /* synthetic */ bp.d invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: jp.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljp/b$b;", "", "<init>", "()V", "Ljp/b;", "a", "()Ljp/b;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment$initialize$1", f = "WorkflowStepFragment.kt", l = {65}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21581t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ nu.c0<PropsT> f21583v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ nu.c0<PropsT> f21584a;

            public a(nu.c0<PropsT> c0Var) {
                this.f21584a = c0Var;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // nu.i
            public final Object emit(Object obj, nt.b<? super Unit> bVar) {
                Object objEmit;
                return (obj == null || (objEmit = this.f21584a.emit((PropsT) obj, bVar)) != ot.c.e()) ? Unit.f22483a : objEmit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(nu.c0<PropsT> c0Var, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f21583v = c0Var;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return b.this.new c(this.f21583v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f21581t;
            if (i10 == 0) {
                o.b(obj);
                nu.c0 c0Var = b.this.propsFlow;
                a aVar = new a(this.f21583v);
                this.f21581t = 1;
                if (c0Var.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            throw new jt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [OutputT] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "OutputT", "it"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment$initialize$contentView$1$1", f = "WorkflowStepFragment.kt", l = {}, m = "invokeSuspend")
    public static final class d<OutputT> extends m implements Function2<OutputT, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f21585t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f21586u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ e1<PropsT, StateT, OutputT> f21587v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e1<PropsT, StateT, OutputT> e1Var, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f21587v = e1Var;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            d dVar = new d(this.f21587v, bVar);
            dVar.f21586u = obj;
            return dVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.f21586u;
            ot.c.e();
            if (this.f21585t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f21587v.getHandler().invoke(obj2);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(OutputT outputt, nt.b<? super Unit> bVar) {
            return ((d) create(outputt, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public b() {
        super(a.f21580a);
        this.propsFlow = r0.a(null);
    }

    public static final void l2(b bVar) {
        bVar.a2();
    }

    @Override // androidx.fragment.app.c
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
    public final vq.a i2() {
        vq.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    @NotNull
    public final c0 j2() {
        c0 c0Var = this.viewRegistry;
        if (c0Var != null) {
            return c0Var;
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
        nu.c0 c0VarA = r0.a(rendering.a());
        s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        androidx.p000lifecycle.m mVarA = t.a(sVarK0);
        AttributeSet attributeSet = null;
        Object[] objArr = 0;
        ku.k.d(mVarA, null, null, new c(c0VarA, null), 3, null);
        androidx.fragment.app.c cVarK = K();
        Intrinsics.d(cVarK, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment");
        e eVarN2 = ((InquiryWorkflowFragment) cVarK).n2();
        if (!Intrinsics.c(eVarN2.e().f(), rendering.getName())) {
            eVarN2.g();
        }
        eVarN2.e().o(rendering.getName());
        Context contextI1 = I1();
        Intrinsics.checkNotNullExpressionValue(contextI1, "requireContext(...)");
        WorkflowLayout workflowLayout = new WorkflowLayout(contextI1, attributeSet, 2, objArr == true ? 1 : 0);
        l lVarA = a();
        Intrinsics.checkNotNullExpressionValue(lVarA, "<get-lifecycle>(...)");
        WorkflowLayout.b(workflowLayout, lVarA, an.a.a(rendering.c(), t.a(this), c0VarA, eVarN2.getSavedStateHandle(), z.f37997a.a(), new d(rendering, null)), null, new ViewEnvironment(k0.m(jt.s.a(c0.INSTANCE, j2()), jt.s.a(vq.b.b, i2()))), 4, null);
        ((bp.d) b2()).getRoot().removeAllViews();
        ((bp.d) b2()).getRoot().addView(workflowLayout);
        ((bp.d) b2()).getRoot().post(new Runnable() { // from class: jp.a
            @Override // java.lang.Runnable
            public final void run() {
                b.l2(this.f21574a);
            }
        });
    }

    public final <PropsT, StateT, OutputT> void m2(@NotNull e1<PropsT, StateT, OutputT> rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        nu.c0<Object> c0Var = this.propsFlow;
        PropsT propstA = rendering.a();
        Intrinsics.d(propstA, "null cannot be cast to non-null type kotlin.Any");
        c0Var.setValue(propstA);
    }
}
