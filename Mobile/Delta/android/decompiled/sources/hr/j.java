package hr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.p000lifecycle.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import cr.w1;
import java.util.List;
import jr.h0;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.y;
import kotlin.text.StringsKt;
import ku.a0;
import ku.n;
import ku.p0;
import ku.z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001f\u0010#\u001a\r\u0012\t\u0012\u00070\u001f¢\u0006\u0002\b 0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010,*\u0004\b-\u0010.¨\u00060"}, d2 = {"Lhr/j;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcr/w1;", "component", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "", "onItemsSelectedListener", "t", "(Lcr/w1;Lkotlin/jvm/functions/Function1;)V", "", "l", "()Z", "Lkotlin/Function0;", "callback", "p", "(Lkotlin/jvm/functions/Function0;)V", "visible", "hasTitle", "q", "(ZZ)V", "r", "()V", "a", "Landroid/view/ViewGroup;", "Ljt/h;", "Lgr/a;", "Lkotlin/jvm/internal/EnhancedNullability;", "b", "Ljt/h;", "lazyBinding", "c", "Z", "setup", "", "d", "Lkotlin/jvm/functions/Function1;", "bottomSheetStateChangeListener", "n", "()Lgr/a;", "getBinding$delegate", "(Lhr/j;)Ljava/lang/Object;", "binding", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final jt.h<gr.a> lazyBinding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean setup;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> bottomSheetStateChangeListener;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19763t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f19764u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f19766w;

        /* JADX INFO: renamed from: hr.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1", f = "InputSelectBottomSheetController.kt", l = {296, 198}, m = "invokeSuspend")
        public static final class C0351a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f19767t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f19768u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f19769v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ a0 f19770w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ j f19771x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f19772y;

            /* JADX INFO: renamed from: hr.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0352a implements Function1<WindowInsetsCompat, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ y f19773a;
                public final /* synthetic */ n<Unit> b;

                /* JADX WARN: Multi-variable type inference failed */
                public C0352a(y yVar, n<? super Unit> nVar) {
                    this.f19773a = yVar;
                    this.b = nVar;
                }

                public final void a(WindowInsetsCompat insets) {
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    if (this.f19773a.f22568a) {
                        return;
                    }
                    Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
                    Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                    if (insets2.bottom > 0) {
                        this.f19773a.f22568a = true;
                        n<Unit> nVar = this.b;
                        jt.n.Companion companion = jt.n.INSTANCE;
                        nVar.resumeWith(jt.n.b(Unit.f22483a));
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WindowInsetsCompat windowInsetsCompat) {
                    a(windowInsetsCompat);
                    return Unit.f22483a;
                }
            }

            /* JADX INFO: renamed from: hr.j$a$a$b */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
            @pt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1$2", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
            public static final class b extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f19774t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Function0<Unit> f19775u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Function0<Unit> function0, nt.b<? super b> bVar) {
                    super(2, bVar);
                    this.f19775u = function0;
                }

                @Override // pt.a
                public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                    return new b(this.f19775u, bVar);
                }

                @Override // pt.a
                public final Object invokeSuspend(Object obj) {
                    ot.c.e();
                    if (this.f19774t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    this.f19775u.invoke();
                    return Unit.f22483a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                    return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0351a(a0 a0Var, j jVar, Function0<Unit> function0, nt.b<? super C0351a> bVar) {
                super(2, bVar);
                this.f19770w = a0Var;
                this.f19771x = jVar;
                this.f19772y = function0;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new C0351a(this.f19770w, this.f19771x, this.f19772y, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
            
                if (ku.i.g(r8, r1, r7) == r0) goto L17;
             */
            @Override // pt.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = ot.c.e()
                    int r1 = r7.f19769v
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    jt.o.b(r8)
                    goto L7b
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    java.lang.Object r1 = r7.f19767t
                    hr.j r1 = (hr.j) r1
                    jt.o.b(r8)
                    goto L65
                L23:
                    jt.o.b(r8)
                    hr.j r8 = r7.f19771x
                    r7.f19767t = r8
                    r1 = 0
                    r7.f19768u = r1
                    r7.f19769v = r4
                    ku.p r1 = new ku.p
                    nt.b r5 = ot.b.c(r7)
                    r1.<init>(r5, r4)
                    r1.H()
                    kotlin.jvm.internal.y r5 = new kotlin.jvm.internal.y
                    r5.<init>()
                    gr.a r8 = hr.j.j(r8)
                    android.widget.FrameLayout r8 = r8.getRoot()
                    java.lang.String r6 = "getRoot(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
                    hr.j$a$a$a r6 = new hr.j$a$a$a
                    r6.<init>(r5, r1)
                    wq.g.g(r8, r6)
                    java.lang.Object r8 = r1.A()
                    java.lang.Object r1 = ot.c.e()
                    if (r8 != r1) goto L62
                    pt.h.c(r7)
                L62:
                    if (r8 != r0) goto L65
                    goto L7a
                L65:
                    ku.n2 r8 = ku.g1.c()
                    hr.j$a$a$b r1 = new hr.j$a$a$b
                    kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r7.f19772y
                    r1.<init>(r5, r3)
                    r7.f19767t = r3
                    r7.f19769v = r2
                    java.lang.Object r8 = ku.i.g(r8, r1, r7)
                    if (r8 != r0) goto L7b
                L7a:
                    return r0
                L7b:
                    ku.a0 r8 = r7.f19770w
                    ku.d2.a.a(r8, r3, r4, r3)
                    kotlin.Unit r8 = kotlin.Unit.f22483a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: hr.j.a.C0351a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((C0351a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2", f = "InputSelectBottomSheetController.kt", l = {213, 216}, m = "invokeSuspend")
        public static final class b extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f19776t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ j f19777u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ a0 f19778v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f19779w;

            /* JADX INFO: renamed from: hr.j$a$b$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
            @pt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2$1", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
            public static final class C0353a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f19780t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Function0<Unit> f19781u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0353a(Function0<Unit> function0, nt.b<? super C0353a> bVar) {
                    super(2, bVar);
                    this.f19781u = function0;
                }

                @Override // pt.a
                public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                    return new C0353a(this.f19781u, bVar);
                }

                @Override // pt.a
                public final Object invokeSuspend(Object obj) {
                    ot.c.e();
                    if (this.f19780t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    this.f19781u.invoke();
                    return Unit.f22483a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                    return ((C0353a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(j jVar, a0 a0Var, Function0<Unit> function0, nt.b<? super b> bVar) {
                super(2, bVar);
                this.f19777u = jVar;
                this.f19778v = a0Var;
                this.f19779w = function0;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new b(this.f19777u, this.f19778v, this.f19779w, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
            
                if (ku.i.g(r8, r1, r7) == r0) goto L21;
             */
            @Override // pt.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = ot.c.e()
                    int r1 = r7.f19776t
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    jt.o.b(r8)
                    goto L4c
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    jt.o.b(r8)
                L1e:
                    hr.j r8 = r7.f19777u
                    gr.a r8 = hr.j.j(r8)
                    android.widget.FrameLayout r8 = r8.getRoot()
                    androidx.core.view.WindowInsetsCompat r8 = androidx.core.view.o0.F(r8)
                    if (r8 == 0) goto L54
                    int r1 = androidx.core.view.WindowInsetsCompat.Type.ime()
                    boolean r8 = r8.isVisible(r1)
                    if (r8 != r4) goto L54
                    ku.n2 r8 = ku.g1.c()
                    hr.j$a$b$a r1 = new hr.j$a$b$a
                    kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r7.f19779w
                    r1.<init>(r5, r3)
                    r7.f19776t = r2
                    java.lang.Object r8 = ku.i.g(r8, r1, r7)
                    if (r8 != r0) goto L4c
                    goto L5e
                L4c:
                    ku.a0 r8 = r7.f19778v
                    ku.d2.a.a(r8, r3, r4, r3)
                    kotlin.Unit r8 = kotlin.Unit.f22483a
                    return r8
                L54:
                    r7.f19776t = r4
                    r5 = 100
                    java.lang.Object r8 = ku.z0.b(r5, r7)
                    if (r8 != r0) goto L1e
                L5e:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: hr.j.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3", f = "InputSelectBottomSheetController.kt", l = {223, 224}, m = "invokeSuspend")
        public static final class c extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f19782t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a0 f19783u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f19784v;

            /* JADX INFO: renamed from: hr.j$a$c$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
            @pt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3$1", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
            public static final class C0354a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f19785t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Function0<Unit> f19786u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0354a(Function0<Unit> function0, nt.b<? super C0354a> bVar) {
                    super(2, bVar);
                    this.f19786u = function0;
                }

                @Override // pt.a
                public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                    return new C0354a(this.f19786u, bVar);
                }

                @Override // pt.a
                public final Object invokeSuspend(Object obj) {
                    ot.c.e();
                    if (this.f19785t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    this.f19786u.invoke();
                    return Unit.f22483a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                    return ((C0354a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a0 a0Var, Function0<Unit> function0, nt.b<? super c> bVar) {
                super(2, bVar);
                this.f19783u = a0Var;
                this.f19784v = function0;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new c(this.f19783u, this.f19784v, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
            
                if (ku.i.g(r8, r1, r7) == r0) goto L15;
             */
            @Override // pt.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = ot.c.e()
                    int r1 = r7.f19782t
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L1f
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    jt.o.b(r8)
                    goto L41
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    jt.o.b(r8)
                    goto L2d
                L1f:
                    jt.o.b(r8)
                    r7.f19782t = r4
                    r5 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r8 = ku.z0.b(r5, r7)
                    if (r8 != r0) goto L2d
                    goto L40
                L2d:
                    ku.n2 r8 = ku.g1.c()
                    hr.j$a$c$a r1 = new hr.j$a$c$a
                    kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r7.f19784v
                    r1.<init>(r5, r3)
                    r7.f19782t = r2
                    java.lang.Object r8 = ku.i.g(r8, r1, r7)
                    if (r8 != r0) goto L41
                L40:
                    return r0
                L41:
                    ku.a0 r8 = r7.f19783u
                    ku.d2.a.a(r8, r3, r4, r3)
                    kotlin.Unit r8 = kotlin.Unit.f22483a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: hr.j.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f19766w = function0;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            a aVar = j.this.new a(this.f19766w, bVar);
            aVar.f19764u = obj;
            return aVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            p0 p0Var = (p0) this.f19764u;
            ot.c.e();
            if (this.f19763t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            a0 a0VarB = z2.b(null, 1, null);
            ku.k.d(p0Var, a0VarB, null, new C0351a(a0VarB, j.this, this.f19766w, null), 2, null);
            ku.k.d(p0Var, a0VarB, null, new b(j.this, a0VarB, this.f19766w, null), 2, null);
            ku.k.d(p0Var, a0VarB, null, new c(a0VarB, this.f19766w, null), 2, null);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"hr/j$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends BottomSheetBehavior.g {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            Function1 function1 = j.this.bottomSheetStateChangeListener;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(newState));
            }
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"hr/j$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f19788a;

        public c(m mVar) {
            this.f19788a = mVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s8) {
            this.f19788a.J(String.valueOf(s8));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s8, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s8, int start, int before, int count) {
        }
    }

    public j(@NotNull ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
        this.lazyBinding = jt.i.b(new Function0() { // from class: hr.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.o(this.f19749a);
            }
        });
    }

    public static final void m(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.X0(5);
    }

    public static final gr.a o(j jVar) {
        return gr.a.c(LayoutInflater.from(jVar.contentView.getContext()), jVar.contentView, true);
    }

    public static final Unit s() {
        return Unit.f22483a;
    }

    public static final Unit u(w1 w1Var, c0 c0Var, j jVar, Option selectedItem) {
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        if (!w1Var.getCanSelectMultipleValues()) {
            Function1 function1 = (Function1) c0Var.f22552a;
            if (function1 != null) {
                function1.invoke(kotlin.collections.o.d(selectedItem));
            }
            c0Var.f22552a = null;
            jVar.l();
        }
        return Unit.f22483a;
    }

    public static final void v(boolean z10, j jVar, final BottomSheetBehavior bottomSheetBehavior) {
        if (z10) {
            jVar.p(new Function0() { // from class: hr.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.w(bottomSheetBehavior);
                }
            });
        } else {
            bottomSheetBehavior.X0(3);
        }
    }

    public static final Unit w(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.X0(3);
        return Unit.f22483a;
    }

    public static final Unit x(c0 c0Var, m mVar, j jVar, int i10) {
        if (i10 == 5) {
            Function1 function1 = (Function1) c0Var.f22552a;
            if (function1 != null) {
                function1.invoke(CollectionsKt.M0(mVar.F()));
            }
            c0Var.f22552a = null;
            Context context = jVar.contentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            jq.g.d(context);
        }
        return Unit.f22483a;
    }

    public static final void y(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.X0(5);
    }

    public static final void z(j jVar, View view) {
        jVar.l();
    }

    public final boolean l() {
        if (!this.lazyBinding.isInitialized()) {
            return false;
        }
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(n().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        jq.g.d(context);
        this.contentView.postDelayed(new Runnable() { // from class: hr.b
            @Override // java.lang.Runnable
            public final void run() {
                j.m(bottomSheetBehaviorQ0);
            }
        }, 100L);
        return bottomSheetBehaviorQ0.v0() != 5;
    }

    public final gr.a n() {
        return this.lazyBinding.getValue();
    }

    public final void p(Function0<Unit> callback) {
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNull(context);
        j.b bVarA = jq.g.a(context);
        if (bVarA == null) {
            return;
        }
        ku.k.d(t.a(bVarA), null, null, new a(callback, null), 3, null);
    }

    public final void q(boolean visible, boolean hasTitle) {
        if (visible) {
            n().f18382j.setVisibility(8);
            n().f18380h.setVisibility(0);
            n().f18379g.requestFocus();
            Context context = n().f18379g.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            jq.g.j(context);
            return;
        }
        Context context2 = n().f18379g.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        jq.g.d(context2);
        n().f18380h.setVisibility(8);
        n().f18382j.setVisibility(0);
        n().f18379g.setText("");
    }

    public final void r() {
        if (this.setup) {
            return;
        }
        this.setup = true;
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(n().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        bottomSheetBehaviorQ0.Z0(true);
        Function0 function0 = new Function0() { // from class: hr.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.s();
            }
        };
        FrameLayout bottomSheet = n().b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        wq.b.b(bottomSheetBehaviorQ0, function0, bottomSheet, n().f18375c, n().f18381i);
        bottomSheetBehaviorQ0.c0(new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(@NotNull final w1 component, @NotNull Function1<? super List<Option>, Unit> onItemsSelectedListener) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(onItemsSelectedListener, "onItemsSelectedListener");
        r();
        final c0 c0Var = new c0();
        c0Var.f22552a = onItemsSelectedListener;
        String label = component.getLabel();
        final boolean z10 = label == null || StringsKt.p0(label);
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(n().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        Context context = n().f18378f.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final m mVar = new m(context, component.g(), component.getF21571a(), component.getCanSelectMultipleValues(), component.getLeadingImageTemplate(), component.m(), new Function1() { // from class: hr.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.u(component, c0Var, this, (Option) obj);
            }
        });
        this.bottomSheetStateChangeListener = new Function1() { // from class: hr.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.x(c0Var, mVar, this, ((Integer) obj).intValue());
            }
        };
        q(z10, !z10);
        n().f18382j.setText(component.getLabel());
        n().f18378f.setAdapter(mVar);
        n().f18381i.setOnClickListener(new View.OnClickListener() { // from class: hr.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.y(bottomSheetBehaviorQ0, view);
            }
        });
        InputSelectBoxComponentStyle styles = component.getF21571a();
        if (styles != null) {
            TextView textviewInputSelectSheetTitle = n().f18382j;
            Intrinsics.checkNotNullExpressionValue(textviewInputSelectSheetTitle, "textviewInputSelectSheetTitle");
            h0.l(textviewInputSelectSheetTitle, styles.getTextBasedStyle(), null, 2, null);
            Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
            if (baseBackgroundColorValue != null) {
                int iIntValue = baseBackgroundColorValue.intValue();
                n().f18375c.setBackgroundColor(iIntValue);
                n().f18378f.setBackgroundColor(iIntValue);
            }
            Integer baseBorderColorValue = styles.getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                n().f18376d.setBackgroundColor(baseBorderColorValue.intValue());
            }
            Integer headerCancelButtonColor = styles.getHeaderCancelButtonColor();
            if (headerCancelButtonColor != null) {
                int iIntValue2 = headerCancelButtonColor.intValue();
                n().f18377e.setImageTintList(ColorStateList.valueOf(iIntValue2));
                n().f18380h.setEndIconTintList(ColorStateList.valueOf(iIntValue2));
            }
            Integer baseTextColor = styles.getBaseTextColor();
            if (baseTextColor != null) {
                int iIntValue3 = baseTextColor.intValue();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(androidx.core.graphics.c.l(iIntValue3, 128));
                Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
                n().f18379g.setHintTextColor(colorStateListValueOf);
                n().f18379g.setTextColor(iIntValue3);
            }
        }
        n().f18378f.setLayoutManager(new LinearLayoutManager(n().getRoot().getContext()));
        n().f18378f.setHasFixedSize(true);
        n().f18379g.addTextChangedListener(new c(mVar));
        n().f18377e.setOnClickListener(new View.OnClickListener() { // from class: hr.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.z(this.f19756a, view);
            }
        });
        n().f18379g.setText("");
        n().b.setTranslationY(0.0f);
        this.contentView.postDelayed(new Runnable() { // from class: hr.g
            @Override // java.lang.Runnable
            public final void run() {
                j.v(z10, this, bottomSheetBehaviorQ0);
            }
        }, 100L);
    }
}
