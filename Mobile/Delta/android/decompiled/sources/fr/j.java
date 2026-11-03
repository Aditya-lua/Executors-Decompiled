package fr;

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
import ar.w1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import gt.o;
import hr.h0;
import iu.a0;
import iu.n;
import iu.p0;
import iu.z2;
import java.util.List;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001f\u0010#\u001a\r\u0012\t\u0012\u00070\u001f¢\u0006\u0002\b 0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010,*\u0004\b-\u0010.¨\u00060"}, d2 = {"Lfr/j;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lar/w1;", "component", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "", "onItemsSelectedListener", "t", "(Lar/w1;Lkotlin/jvm/functions/Function1;)V", "", "l", "()Z", "Lkotlin/Function0;", "callback", "p", "(Lkotlin/jvm/functions/Function0;)V", "visible", "hasTitle", "q", "(ZZ)V", "r", "()V", "a", "Landroid/view/ViewGroup;", "Lgt/h;", "Ler/a;", "Lkotlin/jvm/internal/EnhancedNullability;", "b", "Lgt/h;", "lazyBinding", "c", "Z", "setup", "", "d", "Lkotlin/jvm/functions/Function1;", "bottomSheetStateChangeListener", "n", "()Ler/a;", "getBinding$delegate", "(Lfr/j;)Ljava/lang/Object;", "binding", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final gt.h<er.a> lazyBinding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean setup;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> bottomSheetStateChangeListener;

    @nt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f17738t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f17739u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f17741w;

        /* JADX INFO: renamed from: fr.j$a$a, reason: collision with other inner class name */
        @nt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1", f = "InputSelectBottomSheetController.kt", l = {296, 198}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class C0316a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f17742t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f17743u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f17744v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ a0 f17745w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ j f17746x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f17747y;

            /* JADX INFO: renamed from: fr.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0317a implements Function1<WindowInsetsCompat, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ y f17748a;
                public final /* synthetic */ n<Unit> b;

                /* JADX WARN: Multi-variable type inference failed */
                public C0317a(y yVar, n<? super Unit> nVar) {
                    this.f17748a = yVar;
                    this.b = nVar;
                }

                public final void a(WindowInsetsCompat insets) {
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    if (this.f17748a.f23023a) {
                        return;
                    }
                    Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
                    Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                    if (insets2.bottom > 0) {
                        this.f17748a.f23023a = true;
                        n<Unit> nVar = this.b;
                        gt.n.Companion companion = gt.n.INSTANCE;
                        nVar.resumeWith(gt.n.b(Unit.f22938a));
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WindowInsetsCompat windowInsetsCompat) {
                    a(windowInsetsCompat);
                    return Unit.f22938a;
                }
            }

            /* JADX INFO: renamed from: fr.j$a$a$b */
            @nt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1$2", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
            public static final class b extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f17749t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Function0<Unit> f17750u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Function0<Unit> function0, lt.b<? super b> bVar) {
                    super(2, bVar);
                    this.f17750u = function0;
                }

                @Override // nt.a
                public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                    return new b(this.f17750u, bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                    return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    mt.c.e();
                    if (this.f17749t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    this.f17750u.invoke();
                    return Unit.f22938a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0316a(a0 a0Var, j jVar, Function0<Unit> function0, lt.b<? super C0316a> bVar) {
                super(2, bVar);
                this.f17745w = a0Var;
                this.f17746x = jVar;
                this.f17747y = function0;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new C0316a(this.f17745w, this.f17746x, this.f17747y, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((C0316a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
            
                if (iu.i.g(r8, r1, r7) == r0) goto L17;
             */
            @Override // nt.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = mt.c.e()
                    int r1 = r7.f17744v
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    gt.o.b(r8)
                    goto L7b
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    java.lang.Object r1 = r7.f17742t
                    fr.j r1 = (fr.j) r1
                    gt.o.b(r8)
                    goto L65
                L23:
                    gt.o.b(r8)
                    fr.j r8 = r7.f17746x
                    r7.f17742t = r8
                    r1 = 0
                    r7.f17743u = r1
                    r7.f17744v = r4
                    iu.p r1 = new iu.p
                    lt.b r5 = mt.b.c(r7)
                    r1.<init>(r5, r4)
                    r1.H()
                    kotlin.jvm.internal.y r5 = new kotlin.jvm.internal.y
                    r5.<init>()
                    er.a r8 = fr.j.j(r8)
                    android.widget.FrameLayout r8 = r8.getRoot()
                    java.lang.String r6 = "getRoot(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
                    fr.j$a$a$a r6 = new fr.j$a$a$a
                    r6.<init>(r5, r1)
                    uq.g.g(r8, r6)
                    java.lang.Object r8 = r1.A()
                    java.lang.Object r1 = mt.c.e()
                    if (r8 != r1) goto L62
                    nt.h.c(r7)
                L62:
                    if (r8 != r0) goto L65
                    goto L7a
                L65:
                    iu.n2 r8 = iu.g1.c()
                    fr.j$a$a$b r1 = new fr.j$a$a$b
                    kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r7.f17747y
                    r1.<init>(r5, r3)
                    r7.f17742t = r3
                    r7.f17744v = r2
                    java.lang.Object r8 = iu.i.g(r8, r1, r7)
                    if (r8 != r0) goto L7b
                L7a:
                    return r0
                L7b:
                    iu.a0 r8 = r7.f17745w
                    iu.d2.a.a(r8, r3, r4, r3)
                    kotlin.Unit r8 = kotlin.Unit.f22938a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.j.a.C0316a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @nt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2", f = "InputSelectBottomSheetController.kt", l = {213, 216}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class b extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f17751t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ j f17752u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ a0 f17753v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f17754w;

            /* JADX INFO: renamed from: fr.j$a$b$a, reason: collision with other inner class name */
            @nt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2$1", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
            public static final class C0318a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f17755t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Function0<Unit> f17756u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0318a(Function0<Unit> function0, lt.b<? super C0318a> bVar) {
                    super(2, bVar);
                    this.f17756u = function0;
                }

                @Override // nt.a
                public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                    return new C0318a(this.f17756u, bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                    return ((C0318a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    mt.c.e();
                    if (this.f17755t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    this.f17756u.invoke();
                    return Unit.f22938a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(j jVar, a0 a0Var, Function0<Unit> function0, lt.b<? super b> bVar) {
                super(2, bVar);
                this.f17752u = jVar;
                this.f17753v = a0Var;
                this.f17754w = function0;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new b(this.f17752u, this.f17753v, this.f17754w, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
            
                if (iu.i.g(r8, r1, r7) == r0) goto L21;
             */
            @Override // nt.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = mt.c.e()
                    int r1 = r7.f17751t
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    gt.o.b(r8)
                    goto L4c
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    gt.o.b(r8)
                L1e:
                    fr.j r8 = r7.f17752u
                    er.a r8 = fr.j.j(r8)
                    android.widget.FrameLayout r8 = r8.getRoot()
                    androidx.core.view.WindowInsetsCompat r8 = androidx.core.view.o0.F(r8)
                    if (r8 == 0) goto L54
                    int r1 = androidx.core.view.WindowInsetsCompat.Type.ime()
                    boolean r8 = r8.isVisible(r1)
                    if (r8 != r4) goto L54
                    iu.n2 r8 = iu.g1.c()
                    fr.j$a$b$a r1 = new fr.j$a$b$a
                    kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r7.f17754w
                    r1.<init>(r5, r3)
                    r7.f17751t = r2
                    java.lang.Object r8 = iu.i.g(r8, r1, r7)
                    if (r8 != r0) goto L4c
                    goto L5e
                L4c:
                    iu.a0 r8 = r7.f17753v
                    iu.d2.a.a(r8, r3, r4, r3)
                    kotlin.Unit r8 = kotlin.Unit.f22938a
                    return r8
                L54:
                    r7.f17751t = r4
                    r5 = 100
                    java.lang.Object r8 = iu.z0.b(r5, r7)
                    if (r8 != r0) goto L1e
                L5e:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.j.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @nt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3", f = "InputSelectBottomSheetController.kt", l = {223, 224}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class c extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f17757t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a0 f17758u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f17759v;

            /* JADX INFO: renamed from: fr.j$a$c$a, reason: collision with other inner class name */
            @nt.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3$1", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
            public static final class C0319a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f17760t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Function0<Unit> f17761u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0319a(Function0<Unit> function0, lt.b<? super C0319a> bVar) {
                    super(2, bVar);
                    this.f17761u = function0;
                }

                @Override // nt.a
                public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                    return new C0319a(this.f17761u, bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                    return ((C0319a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    mt.c.e();
                    if (this.f17760t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    this.f17761u.invoke();
                    return Unit.f22938a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a0 a0Var, Function0<Unit> function0, lt.b<? super c> bVar) {
                super(2, bVar);
                this.f17758u = a0Var;
                this.f17759v = function0;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new c(this.f17758u, this.f17759v, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
            
                if (iu.i.g(r8, r1, r7) == r0) goto L15;
             */
            @Override // nt.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = mt.c.e()
                    int r1 = r7.f17757t
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L1f
                    if (r1 == r4) goto L1b
                    if (r1 != r2) goto L13
                    gt.o.b(r8)
                    goto L41
                L13:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1b:
                    gt.o.b(r8)
                    goto L2d
                L1f:
                    gt.o.b(r8)
                    r7.f17757t = r4
                    r5 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r8 = iu.z0.b(r5, r7)
                    if (r8 != r0) goto L2d
                    goto L40
                L2d:
                    iu.n2 r8 = iu.g1.c()
                    fr.j$a$c$a r1 = new fr.j$a$c$a
                    kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r7.f17759v
                    r1.<init>(r5, r3)
                    r7.f17757t = r2
                    java.lang.Object r8 = iu.i.g(r8, r1, r7)
                    if (r8 != r0) goto L41
                L40:
                    return r0
                L41:
                    iu.a0 r8 = r7.f17758u
                    iu.d2.a.a(r8, r3, r4, r3)
                    kotlin.Unit r8 = kotlin.Unit.f22938a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.j.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f17741w = function0;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            a aVar = j.this.new a(this.f17741w, bVar);
            aVar.f17739u = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            p0 p0Var = (p0) this.f17739u;
            mt.c.e();
            if (this.f17738t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            a0 a0VarB = z2.b(null, 1, null);
            iu.k.d(p0Var, a0VarB, null, new C0316a(a0VarB, j.this, this.f17741w, null), 2, null);
            iu.k.d(p0Var, a0VarB, null, new b(j.this, a0VarB, this.f17741w, null), 2, null);
            iu.k.d(p0Var, a0VarB, null, new c(a0VarB, this.f17741w, null), 2, null);
            return Unit.f22938a;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"fr/j$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"fr/j$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f17763a;

        public c(m mVar) {
            this.f17763a = mVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s8) {
            this.f17763a.J(String.valueOf(s8));
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
        this.lazyBinding = gt.i.b(new Function0() { // from class: fr.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.o(this.f17724a);
            }
        });
    }

    public static final void m(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.X0(5);
    }

    public static final er.a o(j jVar) {
        return er.a.c(LayoutInflater.from(jVar.contentView.getContext()), jVar.contentView, true);
    }

    public static final Unit s() {
        return Unit.f22938a;
    }

    public static final Unit u(w1 w1Var, c0 c0Var, j jVar, Option selectedItem) {
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        if (!w1Var.getCanSelectMultipleValues()) {
            Function1 function1 = (Function1) c0Var.f23007a;
            if (function1 != null) {
                function1.invoke(kotlin.collections.o.d(selectedItem));
            }
            c0Var.f23007a = null;
            jVar.l();
        }
        return Unit.f22938a;
    }

    public static final void v(boolean z10, j jVar, final BottomSheetBehavior bottomSheetBehavior) {
        if (z10) {
            jVar.p(new Function0() { // from class: fr.i
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
        return Unit.f22938a;
    }

    public static final Unit x(c0 c0Var, m mVar, j jVar, int i10) {
        if (i10 == 5) {
            Function1 function1 = (Function1) c0Var.f23007a;
            if (function1 != null) {
                function1.invoke(CollectionsKt.M0(mVar.F()));
            }
            c0Var.f23007a = null;
            Context context = jVar.contentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            hq.g.d(context);
        }
        return Unit.f22938a;
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
        hq.g.d(context);
        this.contentView.postDelayed(new Runnable() { // from class: fr.b
            @Override // java.lang.Runnable
            public final void run() {
                j.m(bottomSheetBehaviorQ0);
            }
        }, 100L);
        return bottomSheetBehaviorQ0.v0() != 5;
    }

    public final er.a n() {
        return this.lazyBinding.getValue();
    }

    public final void p(Function0<Unit> callback) {
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNull(context);
        j.b bVarA = hq.g.a(context);
        if (bVarA == null) {
            return;
        }
        iu.k.d(t.a(bVarA), null, null, new a(callback, null), 3, null);
    }

    public final void q(boolean visible, boolean hasTitle) {
        if (visible) {
            n().f16280j.setVisibility(8);
            n().f16278h.setVisibility(0);
            n().f16277g.requestFocus();
            Context context = n().f16277g.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            hq.g.j(context);
            return;
        }
        Context context2 = n().f16277g.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        hq.g.d(context2);
        n().f16278h.setVisibility(8);
        n().f16280j.setVisibility(0);
        n().f16277g.setText("");
    }

    public final void r() {
        if (this.setup) {
            return;
        }
        this.setup = true;
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(n().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        bottomSheetBehaviorQ0.Z0(true);
        Function0 function0 = new Function0() { // from class: fr.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.s();
            }
        };
        FrameLayout bottomSheet = n().b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        uq.b.b(bottomSheetBehaviorQ0, function0, bottomSheet, n().f16273c, n().f16279i);
        bottomSheetBehaviorQ0.c0(new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(@NotNull final w1 component, @NotNull Function1<? super List<Option>, Unit> onItemsSelectedListener) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(onItemsSelectedListener, "onItemsSelectedListener");
        r();
        final c0 c0Var = new c0();
        c0Var.f23007a = onItemsSelectedListener;
        String label = component.getLabel();
        final boolean z10 = label == null || StringsKt.p0(label);
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(n().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        Context context = n().f16276f.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final m mVar = new m(context, component.g(), component.getF19579a(), component.getCanSelectMultipleValues(), component.getLeadingImageTemplate(), component.m(), new Function1() { // from class: fr.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.u(component, c0Var, this, (Option) obj);
            }
        });
        this.bottomSheetStateChangeListener = new Function1() { // from class: fr.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.x(c0Var, mVar, this, ((Integer) obj).intValue());
            }
        };
        q(z10, !z10);
        n().f16280j.setText(component.getLabel());
        n().f16276f.setAdapter(mVar);
        n().f16279i.setOnClickListener(new View.OnClickListener() { // from class: fr.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.y(bottomSheetBehaviorQ0, view);
            }
        });
        InputSelectBoxComponentStyle styles = component.getF19579a();
        if (styles != null) {
            TextView textviewInputSelectSheetTitle = n().f16280j;
            Intrinsics.checkNotNullExpressionValue(textviewInputSelectSheetTitle, "textviewInputSelectSheetTitle");
            h0.l(textviewInputSelectSheetTitle, styles.getTextBasedStyle(), null, 2, null);
            Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
            if (baseBackgroundColorValue != null) {
                int iIntValue = baseBackgroundColorValue.intValue();
                n().f16273c.setBackgroundColor(iIntValue);
                n().f16276f.setBackgroundColor(iIntValue);
            }
            Integer baseBorderColorValue = styles.getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                n().f16274d.setBackgroundColor(baseBorderColorValue.intValue());
            }
            Integer headerCancelButtonColor = styles.getHeaderCancelButtonColor();
            if (headerCancelButtonColor != null) {
                int iIntValue2 = headerCancelButtonColor.intValue();
                n().f16275e.setImageTintList(ColorStateList.valueOf(iIntValue2));
                n().f16278h.setEndIconTintList(ColorStateList.valueOf(iIntValue2));
            }
            Integer baseTextColor = styles.getBaseTextColor();
            if (baseTextColor != null) {
                int iIntValue3 = baseTextColor.intValue();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(androidx.core.graphics.c.l(iIntValue3, 128));
                Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
                n().f16277g.setHintTextColor(colorStateListValueOf);
                n().f16277g.setTextColor(iIntValue3);
            }
        }
        n().f16276f.setLayoutManager(new LinearLayoutManager(n().getRoot().getContext()));
        n().f16276f.setHasFixedSize(true);
        n().f16277g.addTextChangedListener(new c(mVar));
        n().f16275e.setOnClickListener(new View.OnClickListener() { // from class: fr.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.z(this.f17731a, view);
            }
        });
        n().f16277g.setText("");
        n().b.setTranslationY(0.0f);
        this.contentView.postDelayed(new Runnable() { // from class: fr.g
            @Override // java.lang.Runnable
            public final void run() {
                j.v(z10, this, bottomSheetBehaviorQ0);
            }
        }, 100L);
    }
}
