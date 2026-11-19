package vr;

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
import androidx.core.view.o0;
import androidx.p000lifecycle.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import av.a0;
import av.d2;
import av.g1;
import av.n;
import av.n2;
import av.p;
import av.p0;
import av.z0;
import av.z2;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.c0;
import p001kotlin.jvm.internal.y;
import p001kotlin.text.StringsKt;
import qr.Option;
import qr.i2;
import yr.h0;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001f\u0010#\u001a\r\u0012\t\u0012\u00070\u001f¢\u0006\u0002\b 0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010,*\u0004\b-\u0010.¨\u00060"}, d2 = {"Lvr/j;", BuildConfig.FLAVOR, "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lqr/i2;", "component", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lqr/l4;", BuildConfig.FLAVOR, "onItemsSelectedListener", "t", "(Lqr/i2;Lkotlin/jvm/functions/Function1;)V", BuildConfig.FLAVOR, "l", "()Z", "Lkotlin/Function0;", "callback", "p", "(Lkotlin/jvm/functions/Function0;)V", "visible", "hasTitle", "q", "(ZZ)V", "r", "()V", "a", "Landroid/view/ViewGroup;", "Lzt/h;", "Lur/a;", "Lkotlin/jvm/internal/EnhancedNullability;", "b", "Lzt/h;", "lazyBinding", "c", "Z", "setup", BuildConfig.FLAVOR, "d", "Lkotlin/jvm/functions/Function1;", "bottomSheetStateChangeListener", "n", "()Lur/a;", "getBinding$delegate", "(Lvr/j;)Ljava/lang/Object;", "binding", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final zt.h<ur.a> lazyBinding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean setup;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> bottomSheetStateChangeListener;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35380t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f35381u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f35383w;

        /* JADX INFO: renamed from: vr.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1", f = "InputSelectBottomSheetController.kt", l = {296, 198}, m = "invokeSuspend")
        public static final class C0722a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f35384t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f35385u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f35386v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ a0 f35387w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ j f35388x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f35389y;

            /* JADX INFO: renamed from: vr.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0723a implements Function1<WindowInsetsCompat, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ y f35390a;
                public final /* synthetic */ n<Unit> b;

                /* JADX WARN: Multi-variable type inference failed */
                public C0723a(y yVar, n<? super Unit> nVar) {
                    this.f35390a = yVar;
                    this.b = nVar;
                }

                public final void a(WindowInsetsCompat insets) {
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    if (this.f35390a.f21591a) {
                        return;
                    }
                    Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
                    Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                    if (insets2.bottom > 0) {
                        this.f35390a.f21591a = true;
                        n<Unit> nVar = this.b;
                        zt.n.Companion companion = zt.n.INSTANCE;
                        nVar.resumeWith(zt.n.b(Unit.f21506a));
                    }
                }

                @Override // p001kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WindowInsetsCompat windowInsetsCompat) {
                    a(windowInsetsCompat);
                    return Unit.f21506a;
                }
            }

            /* JADX INFO: renamed from: vr.j$a$a$b */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
            @gu.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1$2", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
            public static final class b extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f35391t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Function0<Unit> f35392u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Function0<Unit> function0, eu.b<? super b> bVar) {
                    super(2, bVar);
                    this.f35392u = function0;
                }

                @Override // gu.a
                public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                    return new b(this.f35392u, bVar);
                }

                @Override // p001kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                    return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    fu.c.e();
                    if (this.f35391t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    this.f35392u.invoke();
                    return Unit.f21506a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0722a(a0 a0Var, j jVar, Function0<Unit> function0, eu.b<? super C0722a> bVar) {
                super(2, bVar);
                this.f35387w = a0Var;
                this.f35388x = jVar;
                this.f35389y = function0;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new C0722a(this.f35387w, this.f35388x, this.f35389y, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((C0722a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
            
                if (av.i.g(r8, r1, r7) == r0) goto L17;
             */
            @Override // gu.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f35386v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        o.b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj);
                    }
                    d2.a.a(this.f35387w, null, 1, null);
                    return Unit.f21506a;
                }
                o.b(obj);
                j jVar = this.f35388x;
                this.f35384t = jVar;
                this.f35385u = 0;
                this.f35386v = 1;
                p pVar = new p(fu.b.c(this), 1);
                pVar.G();
                y yVar = new y();
                FrameLayout root = jVar.n().getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                kr.g.g(root, new C0723a(yVar, pVar));
                Object objY = pVar.y();
                if (objY == fu.c.e()) {
                    gu.h.c(this);
                }
                if (objY != objE) {
                }
                return objE;
                n2 n2VarC = g1.c();
                b bVar = new b(this.f35389y, null);
                this.f35384t = null;
                this.f35386v = 2;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2", f = "InputSelectBottomSheetController.kt", l = {213, 216}, m = "invokeSuspend")
        public static final class b extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f35393t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ j f35394u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ a0 f35395v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f35396w;

            /* JADX INFO: renamed from: vr.j$a$b$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
            @gu.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$2$1", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
            public static final class C0724a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f35397t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Function0<Unit> f35398u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0724a(Function0<Unit> function0, eu.b<? super C0724a> bVar) {
                    super(2, bVar);
                    this.f35398u = function0;
                }

                @Override // gu.a
                public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                    return new C0724a(this.f35398u, bVar);
                }

                @Override // p001kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                    return ((C0724a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    fu.c.e();
                    if (this.f35397t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    this.f35398u.invoke();
                    return Unit.f21506a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(j jVar, a0 a0Var, Function0<Unit> function0, eu.b<? super b> bVar) {
                super(2, bVar);
                this.f35394u = jVar;
                this.f35395v = a0Var;
                this.f35396w = function0;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new b(this.f35394u, this.f35395v, this.f35396w, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
            
                if (av.i.g(r8, r1, r7) == r0) goto L21;
             */
            @Override // gu.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f35393t;
                if (i10 == 0 || i10 == 1) {
                    o.b(obj);
                    do {
                        WindowInsetsCompat windowInsetsCompatF = o0.F(this.f35394u.n().getRoot());
                        if (windowInsetsCompatF == null || !windowInsetsCompatF.isVisible(WindowInsetsCompat.Type.ime())) {
                            this.f35393t = 1;
                        } else {
                            n2 n2VarC = g1.c();
                            C0724a c0724a = new C0724a(this.f35396w, null);
                            this.f35393t = 2;
                        }
                    } while (z0.b(100L, this) != objE);
                    return objE;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                d2.a.a(this.f35395v, null, 1, null);
                return Unit.f21506a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3", f = "InputSelectBottomSheetController.kt", l = {223, 224}, m = "invokeSuspend")
        public static final class c extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f35399t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a0 f35400u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f35401v;

            /* JADX INFO: renamed from: vr.j$a$c$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
            @gu.f(c = "com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$3$1", f = "InputSelectBottomSheetController.kt", l = {}, m = "invokeSuspend")
            public static final class C0725a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public int f35402t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Function0<Unit> f35403u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0725a(Function0<Unit> function0, eu.b<? super C0725a> bVar) {
                    super(2, bVar);
                    this.f35403u = function0;
                }

                @Override // gu.a
                public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                    return new C0725a(this.f35403u, bVar);
                }

                @Override // p001kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                    return ((C0725a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    fu.c.e();
                    if (this.f35402t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    this.f35403u.invoke();
                    return Unit.f21506a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a0 a0Var, Function0<Unit> function0, eu.b<? super c> bVar) {
                super(2, bVar);
                this.f35400u = a0Var;
                this.f35401v = function0;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new c(this.f35400u, this.f35401v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
            
                if (av.i.g(r8, r1, r7) == r0) goto L15;
             */
            @Override // gu.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f35399t;
                if (i10 == 0) {
                    o.b(obj);
                    this.f35399t = 1;
                    if (z0.b(1000L, this) != objE) {
                    }
                    return objE;
                }
                if (i10 == 1) {
                    o.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                d2.a.a(this.f35400u, null, 1, null);
                return Unit.f21506a;
                n2 n2VarC = g1.c();
                C0725a c0725a = new C0725a(this.f35401v, null);
                this.f35399t = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f35383w = function0;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = j.this.new a(this.f35383w, bVar);
            aVar.f35381u = obj;
            return aVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            p0 p0Var = (p0) this.f35381u;
            fu.c.e();
            if (this.f35380t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            a0 a0VarB = z2.b(null, 1, null);
            av.k.d(p0Var, a0VarB, null, new C0722a(a0VarB, j.this, this.f35383w, null), 2, null);
            av.k.d(p0Var, a0VarB, null, new b(j.this, a0VarB, this.f35383w, null), 2, null);
            av.k.d(p0Var, a0VarB, null, new c(a0VarB, this.f35383w, null), 2, null);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"vr/j$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", BuildConfig.FLAVOR, "newState", BuildConfig.FLAVOR, "c", "(Landroid/view/View;I)V", BuildConfig.FLAVOR, "slideOffset", "b", "(Landroid/view/View;F)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"vr/j$c", "Landroid/text/TextWatcher;", BuildConfig.FLAVOR, "s", BuildConfig.FLAVOR, "start", "count", "after", BuildConfig.FLAVOR, "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f35405a;

        public c(m mVar) {
            this.f35405a = mVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s8) {
            this.f35405a.J(String.valueOf(s8));
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
        this.lazyBinding = zt.i.a(new Function0() { // from class: vr.a
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.o(this.f35366a);
            }
        });
    }

    public static final void m(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.X0(5);
    }

    public static final ur.a o(j jVar) {
        return ur.a.c(LayoutInflater.from(jVar.contentView.getContext()), jVar.contentView, true);
    }

    public static final Unit s() {
        return Unit.f21506a;
    }

    public static final Unit u(i2 i2Var, c0 c0Var, j jVar, Option selectedItem) {
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        if (!i2Var.getCanSelectMultipleValues()) {
            Function1 function1 = (Function1) c0Var.f21575a;
            if (function1 != null) {
                function1.invoke(p001kotlin.collections.o.d(selectedItem));
            }
            c0Var.f21575a = null;
            jVar.l();
        }
        return Unit.f21506a;
    }

    public static final void v(boolean z10, j jVar, final BottomSheetBehavior bottomSheetBehavior) {
        if (z10) {
            jVar.p(new Function0() { // from class: vr.i
                @Override // p001kotlin.jvm.functions.Function0
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
        return Unit.f21506a;
    }

    public static final Unit x(c0 c0Var, m mVar, j jVar, int i10) {
        if (i10 == 5) {
            Function1 function1 = (Function1) c0Var.f21575a;
            if (function1 != null) {
                function1.invoke(CollectionsKt.M0(mVar.F()));
            }
            c0Var.f21575a = null;
            Context context = jVar.contentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            xq.g.d(context);
        }
        return Unit.f21506a;
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
        xq.g.d(context);
        this.contentView.postDelayed(new Runnable() { // from class: vr.b
            @Override // java.lang.Runnable
            public final void run() {
                j.m(bottomSheetBehaviorQ0);
            }
        }, 100L);
        return bottomSheetBehaviorQ0.v0() != 5;
    }

    public final ur.a n() {
        return this.lazyBinding.getValue();
    }

    public final void p(Function0<Unit> callback) {
        Context context = this.contentView.getContext();
        Intrinsics.checkNotNull(context);
        j.b bVarA = xq.g.a(context);
        if (bVarA == null) {
            return;
        }
        av.k.d(t.a(bVarA), null, null, new a(callback, null), 3, null);
    }

    public final void q(boolean visible, boolean hasTitle) {
        if (visible) {
            n().f33851j.setVisibility(8);
            n().f33849h.setVisibility(0);
            n().f33848g.requestFocus();
            Context context = n().f33848g.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            xq.g.j(context);
            return;
        }
        Context context2 = n().f33848g.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        xq.g.d(context2);
        n().f33849h.setVisibility(8);
        n().f33851j.setVisibility(0);
        n().f33848g.setText(BuildConfig.FLAVOR);
    }

    public final void r() {
        if (this.setup) {
            return;
        }
        this.setup = true;
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(n().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        bottomSheetBehaviorQ0.Z0(true);
        Function0 function0 = new Function0() { // from class: vr.h
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.s();
            }
        };
        FrameLayout bottomSheet = n().b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        kr.b.b(bottomSheetBehaviorQ0, function0, bottomSheet, n().f33844c, n().f33850i);
        bottomSheetBehaviorQ0.c0(new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(@NotNull final i2 component, @NotNull Function1<? super List<Option>, Unit> onItemsSelectedListener) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(onItemsSelectedListener, "onItemsSelectedListener");
        r();
        final c0 c0Var = new c0();
        c0Var.f21575a = onItemsSelectedListener;
        String label = component.getLabel();
        final boolean z10 = label == null || StringsKt.p0(label);
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(n().b);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        Context context = n().f33847f.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final m mVar = new m(context, component.g(), component.getF35957a(), component.getCanSelectMultipleValues(), component.getLeadingImageTemplate(), component.l(), new Function1() { // from class: vr.c
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.u(component, c0Var, this, (Option) obj);
            }
        });
        this.bottomSheetStateChangeListener = new Function1() { // from class: vr.d
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.x(c0Var, mVar, this, ((Integer) obj).intValue());
            }
        };
        q(z10, !z10);
        n().f33851j.setText(component.getLabel());
        n().f33847f.setAdapter(mVar);
        n().f33850i.setOnClickListener(new View.OnClickListener() { // from class: vr.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.y(bottomSheetBehaviorQ0, view);
            }
        });
        InputSelectBoxComponentStyle styles = component.getF35957a();
        if (styles != null) {
            TextView textviewInputSelectSheetTitle = n().f33851j;
            Intrinsics.checkNotNullExpressionValue(textviewInputSelectSheetTitle, "textviewInputSelectSheetTitle");
            h0.l(textviewInputSelectSheetTitle, styles.getTextBasedStyle(), null, 2, null);
            Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
            if (baseBackgroundColorValue != null) {
                int iIntValue = baseBackgroundColorValue.intValue();
                n().f33844c.setBackgroundColor(iIntValue);
                n().f33847f.setBackgroundColor(iIntValue);
            }
            Integer baseBorderColorValue = styles.getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                n().f33845d.setBackgroundColor(baseBorderColorValue.intValue());
            }
            Integer headerCancelButtonColor = styles.getHeaderCancelButtonColor();
            if (headerCancelButtonColor != null) {
                int iIntValue2 = headerCancelButtonColor.intValue();
                n().f33846e.setImageTintList(ColorStateList.valueOf(iIntValue2));
                n().f33849h.setEndIconTintList(ColorStateList.valueOf(iIntValue2));
            }
            Integer baseTextColor = styles.getBaseTextColor();
            if (baseTextColor != null) {
                int iIntValue3 = baseTextColor.intValue();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(androidx.core.graphics.c.l(iIntValue3, Barcode.FORMAT_ITF));
                Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
                n().f33848g.setHintTextColor(colorStateListValueOf);
                n().f33848g.setTextColor(iIntValue3);
            }
        }
        n().f33847f.setLayoutManager(new LinearLayoutManager(n().getRoot().getContext()));
        n().f33847f.setHasFixedSize(true);
        n().f33848g.addTextChangedListener(new c(mVar));
        n().f33846e.setOnClickListener(new View.OnClickListener() { // from class: vr.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.z(this.f35373a, view);
            }
        });
        n().f33848g.setText(BuildConfig.FLAVOR);
        n().b.setTranslationY(0.0f);
        this.contentView.postDelayed(new Runnable() { // from class: vr.g
            @Override // java.lang.Runnable
            public final void run() {
                j.v(z10, this, bottomSheetBehaviorQ0);
            }
        }, 100L);
    }
}
