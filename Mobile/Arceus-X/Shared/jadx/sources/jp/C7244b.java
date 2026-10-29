package jp;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.AbstractC0968m;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0980s;
import com.squareup.workflow1.p052ui.WorkflowLayout;
import com.withpersona.sdk2.inquiry.internal.workflows.C3742e;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7690k0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0363a;
import p016an.InterfaceC0368c0;
import p016an.ViewEnvironment;
import p032bp.C1482d;
import p177hp.InterfaceC6492e1;
import p229jt.C7334d;
import p229jt.C7348o;
import p229jt.C7352s;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p341oq.AbstractC9842a;
import p344ot.C10047c;
import p498vq.C12247a;
import p498vq.C12248b;
import p610zo.C13989z;
import p615zt.InterfaceC14057n;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: jp.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0011\u001a\u00020\t\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0013\u001a\u00020\t\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0012R(\u0010\u001c\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010,\u001a\u0016\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, m31665d2 = {"Ljp/b;", "Loq/a;", "Lbp/d;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "PropsT", "StateT", "OutputT", "Lhp/e1;", "rendering", "k2", "(Lhp/e1;)V", "m2", "Lan/c0;", "j0", "Lan/c0;", "j2", "()Lan/c0;", "setViewRegistry", "(Lan/c0;)V", "getViewRegistry$annotations", "viewRegistry", "Lvq/a;", "k0", "Lvq/a;", "i2", "()Lvq/a;", "setSystemUiController", "(Lvq/a;)V", "systemUiController", "Lnu/c0;", "", "l0", "Lnu/c0;", "propsFlow", "m0", "Lhp/e1;", "lastRendering", "n0", "b", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7244b extends AbstractC9842a<C1482d> {

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public InterfaceC0368c0 viewRegistry;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public C12247a systemUiController;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<Object> propsFlow;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    @Nullable
    public InterfaceC6492e1<Object, Object, Object> lastRendering;

    /* JADX INFO: renamed from: jp.b$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C1482d> {

        /* JADX INFO: renamed from: a */
        public static final a f27974a = new a();

        public a() {
            super(3, C1482d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2FragmentWorkflowStepBinding;", 0);
        }

        /* JADX INFO: renamed from: d */
        public final C1482d m30216d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return C1482d.m7598c(p8, viewGroup, z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ C1482d invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return m30216d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: jp.b$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Ljp/b$b;", "", "<init>", "()V", "Ljp/b;", "a", "()Ljp/b;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: jp.b.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C7244b m30217a() {
            return new C7244b();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: jp.b$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment$initialize$1", m39664f = "WorkflowStepFragment.kt", m39665l = {65}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f27975t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC9566c0<PropsT> f27977v;

        /* JADX INFO: renamed from: jp.b$c$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9566c0<PropsT> f27978a;

            public a(InterfaceC9566c0<PropsT> interfaceC9566c0) {
                this.f27978a = interfaceC9566c0;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // nu.InterfaceC9577i
            public final Object emit(Object obj, InterfaceC9557b<? super Unit> interfaceC9557b) {
                Object objEmit;
                return (obj == null || (objEmit = this.f27978a.emit((PropsT) obj, interfaceC9557b)) != C10047c.m38805e()) ? Unit.f29331a : objEmit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC9566c0<PropsT> interfaceC9566c0, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f27977v = interfaceC9566c0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C7244b.this.new c(this.f27977v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f27975t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0 interfaceC9566c0 = C7244b.this.propsFlow;
                a aVar = new a(this.f27977v);
                this.f27975t = 1;
                if (interfaceC9566c0.collect(aVar, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            throw new C7334d();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [OutputT] */
    /* JADX INFO: renamed from: jp.b$d */
    @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, m31665d2 = {"<anonymous>", "", "OutputT", "it"}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment$initialize$contentView$1$1", m39664f = "WorkflowStepFragment.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class d<OutputT> extends AbstractC10351m implements Function2<OutputT, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f27979t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f27980u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC6492e1<PropsT, StateT, OutputT> f27981v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC6492e1<PropsT, StateT, OutputT> interfaceC6492e1, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f27981v = interfaceC6492e1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            d dVar = new d(this.f27981v, interfaceC9557b);
            dVar.f27980u = obj;
            return dVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.f27980u;
            C10047c.m38805e();
            if (this.f27979t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            this.f27981v.getHandler().invoke(obj2);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(OutputT outputt, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(outputt, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C7244b() {
        super(a.f27974a);
        this.propsFlow = C9596r0.m37859a(null);
    }

    /* JADX INFO: renamed from: l2 */
    public static final void m30211l2(C7244b c7244b) {
        c7244b.m4659a2();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.mo4667e1(view, savedInstanceState);
        m4597E1();
        InterfaceC6492e1<Object, Object, Object> interfaceC6492e1 = this.lastRendering;
        if (interfaceC6492e1 != null) {
            m30214k2(interfaceC6492e1);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i2 */
    public final C12247a m30212i2() {
        C12247a c12247a = this.systemUiController;
        if (c12247a != null) {
            return c12247a;
        }
        Intrinsics.m31998u("systemUiController");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j2 */
    public final InterfaceC0368c0 m30213j2() {
        InterfaceC0368c0 interfaceC0368c0 = this.viewRegistry;
        if (interfaceC0368c0 != null) {
            return interfaceC0368c0;
        }
        Intrinsics.m31998u("viewRegistry");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k2 */
    public final <PropsT, StateT, OutputT> void m30214k2(@NotNull InterfaceC6492e1<PropsT, StateT, OutputT> rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!m32423d2()) {
            this.lastRendering = rendering;
            return;
        }
        InterfaceC9566c0 interfaceC9566c0M37859a = C9596r0.m37859a(rendering.mo28240a());
        InterfaceC0980s interfaceC0980sM4680k0 = m4680k0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k0, "getViewLifecycleOwner(...)");
        AbstractC0968m abstractC0968mM4979a = C0982t.m4979a(interfaceC0980sM4680k0);
        AttributeSet attributeSet = null;
        Object[] objArr = 0;
        C7882k.m32780d(abstractC0968mM4979a, null, null, new c(interfaceC9566c0M37859a, null), 3, null);
        ComponentCallbacksC0929c componentCallbacksC0929cM4612K = m4612K();
        Intrinsics.m31981d(componentCallbacksC0929cM4612K, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment");
        C3742e c3742eM18840n2 = ((InquiryWorkflowFragment) componentCallbacksC0929cM4612K).m18840n2();
        if (!Intrinsics.m31980c(c3742eM18840n2.m18869e().mo4854f(), rendering.getName())) {
            c3742eM18840n2.m18871g();
        }
        c3742eM18840n2.m18869e().mo4863o(rendering.getName());
        Context contextM4609I1 = m4609I1();
        Intrinsics.checkNotNullExpressionValue(contextM4609I1, "requireContext(...)");
        WorkflowLayout workflowLayout = new WorkflowLayout(contextM4609I1, attributeSet, 2, objArr == true ? 1 : 0);
        AbstractC0966l abstractC0966lMo4656a = mo4656a();
        Intrinsics.checkNotNullExpressionValue(abstractC0966lMo4656a, "<get-lifecycle>(...)");
        WorkflowLayout.m16095b(workflowLayout, abstractC0966lMo4656a, C0363a.m1377a(rendering.mo28241c(), C0982t.m4979a(this), interfaceC9566c0M37859a, c3742eM18840n2.getSavedStateHandle(), C13989z.f48902a.m50571a(), new d(rendering, null)), null, new ViewEnvironment(C7690k0.m31798m(C7352s.m30477a(InterfaceC0368c0.INSTANCE, m30213j2()), C7352s.m30477a(C12248b.f43285b, m30212i2()))), 4, null);
        ((C1482d) m32421b2()).getRoot().removeAllViews();
        ((C1482d) m32421b2()).getRoot().addView(workflowLayout);
        ((C1482d) m32421b2()).getRoot().post(new Runnable() { // from class: jp.a
            @Override // java.lang.Runnable
            public final void run() {
                C7244b.m30211l2(this.f27968a);
            }
        });
    }

    /* JADX INFO: renamed from: m2 */
    public final <PropsT, StateT, OutputT> void m30215m2(@NotNull InterfaceC6492e1<PropsT, StateT, OutputT> rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        InterfaceC9566c0<Object> interfaceC9566c0 = this.propsFlow;
        PropsT propstMo28240a = rendering.mo28240a();
        Intrinsics.m31981d(propstMo28240a, "null cannot be cast to non-null type kotlin.Any");
        interfaceC9566c0.setValue(propstMo28240a);
    }
}
