package ar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0371e;
import p016an.C0395x;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0365b;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p226jq.C7259g;
import p227jr.C7293c;
import p313nq.C9545a;
import p402r5.InterfaceC10784a;
import p526wq.C12519b;
import p526wq.C12524g;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: ar.p, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012$\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R2\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u0010?\u001a\b\u0012\u0002\b\u0003\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R \u0010C\u001a\b\u0012\u0004\u0012\u00020\u00000@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010A\u001a\u0004\b&\u0010B¨\u0006D"}, m31665d2 = {"Lar/p;", "Lan/b;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "componentNamesToActions", "Lkotlin/Function0;", "onCancelled", "cancelButtonName", "", "hideWhenTappedOutside", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Z)V", "Landroid/view/ViewGroup;", "container", "k", "(Landroid/view/ViewGroup;)V", "Lnq/a;", "binding", "rendering", "l", "(Lnq/a;Lar/p;)V", "j", "()V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "b", "Ljava/util/List;", "c", "Lkotlin/jvm/functions/Function0;", "d", "Ljava/lang/String;", "e", "Z", "Lar/g;", "f", "Lar/g;", "i", "()Lar/g;", "setUiScreenGenerationResult", "(Lar/g;)V", "uiScreenGenerationResult", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "g", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "h", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "setBottomSheetBehavior", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "bottomSheetBehavior", "Lan/a0;", "Lan/a0;", "()Lan/a0;", "viewFactory", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class UiStepBottomSheet implements InterfaceC0365b<UiStepBottomSheet> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final UiComponentScreen uiScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Pair<String, Function1<UiComponent, Unit>>> componentNamesToActions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function0<Unit> onCancelled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String cancelButtonName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    public final boolean hideWhenTappedOutside;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public C1152g uiScreenGenerationResult;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public BottomSheetBehavior<?> bottomSheetBehavior;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0364a0<UiStepBottomSheet> viewFactory;

    /* JADX INFO: renamed from: ar.p$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m31665d2 = {"ar/p$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C9545a f4909a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BottomSheetBehavior<?> f4910b;

        public a(C9545a c9545a, BottomSheetBehavior<?> bottomSheetBehavior) {
            this.f4909a = c9545a;
            this.f4910b = bottomSheetBehavior;
        }

        /* JADX INFO: renamed from: b */
        public static final void m6516b(BottomSheetBehavior bottomSheetBehavior) {
            bottomSheetBehavior.m12125X0(3);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = this.f4909a.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C7259g.m30270d(context);
            final BottomSheetBehavior<?> bottomSheetBehavior = this.f4910b;
            view.postDelayed(new Runnable() { // from class: ar.o
                @Override // java.lang.Runnable
                public final void run() {
                    UiStepBottomSheet.a.m6516b(bottomSheetBehavior);
                }
            }, 100L);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    /* JADX INFO: renamed from: ar.p$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m31665d2 = {"Lr5/a;", "BindingT", "", "RenderingT", "binding", "Lan/k;", "a", "(Lr5/a;)Lan/k;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class b extends AbstractC7746m implements Function1<C9545a, InterfaceC0382k<UiStepBottomSheet>> {

        /* JADX INFO: renamed from: ar.p$b$a */
        @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, m31665d2 = {"Lr5/a;", "BindingT", "", "RenderingT", "rendering", "Lan/y;", "viewEnvironment", "", "a", "(Ljava/lang/Object;Lan/y;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        public static final class a<RenderingT> implements InterfaceC0382k {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC10784a f4912b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ UiStepBottomSheet f4913c;

            public a(InterfaceC10784a interfaceC10784a, UiStepBottomSheet uiStepBottomSheet) {
                this.f4912b = interfaceC10784a;
                this.f4913c = uiStepBottomSheet;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: RenderingT */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p016an.InterfaceC0382k
            /* JADX INFO: renamed from: a */
            public final void mo1442a(@NotNull RenderingT rendering, @NotNull ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                C9545a c9545a = (C9545a) this.f4912b;
                UiStepBottomSheet uiStepBottomSheet = this.f4913c;
                Intrinsics.checkNotNull(c9545a);
                uiStepBottomSheet.m6514l(c9545a, (UiStepBottomSheet) rendering);
            }
        }

        public b() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0382k<UiStepBottomSheet> invoke(@NotNull C9545a binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            return new a(binding, UiStepBottomSheet.this);
        }
    }

    /* JADX INFO: renamed from: ar.p$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class c extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C9545a> {

        /* JADX INFO: renamed from: a */
        public static final c f4914a = new c();

        public c() {
            super(3, C9545a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepBottomSheetBinding;", 0);
        }

        /* JADX INFO: renamed from: d */
        public final C9545a m6518d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return C9545a.m37673c(p8, viewGroup, z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ C9545a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return m6518d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends kotlin.Pair<java.lang.String, ? extends kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent, kotlin.Unit>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public UiStepBottomSheet(@NotNull UiComponentScreen uiScreen, @NotNull List<? extends Pair<String, ? extends Function1<? super UiComponent, Unit>>> componentNamesToActions, @NotNull Function0<Unit> onCancelled, @Nullable String str, boolean z10) {
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(componentNamesToActions, "componentNamesToActions");
        Intrinsics.checkNotNullParameter(onCancelled, "onCancelled");
        this.uiScreen = uiScreen;
        this.componentNamesToActions = componentNamesToActions;
        this.onCancelled = onCancelled;
        this.cancelButtonName = str;
        this.hideWhenTappedOutside = z10;
        InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
        this.viewFactory = new C0395x(C7731d0.m32002b(UiStepBottomSheet.class), c.f4914a, new b());
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m6504m(UiStepBottomSheet uiStepBottomSheet) {
        uiStepBottomSheet.onCancelled.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m6505n(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.m12125X0(3);
    }

    /* JADX INFO: renamed from: o */
    public static final void m6506o(Function1 function1, ComponentView componentView, View view) {
        function1.invoke(componentView.m6490c());
    }

    /* JADX INFO: renamed from: p */
    public static final void m6507p(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.m12125X0(5);
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m6508q(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.m12125X0(5);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m6509r(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.m12125X0(5);
    }

    @Override // p016an.InterfaceC0365b
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC0364a0<UiStepBottomSheet> mo1380a() {
        return this.viewFactory;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiStepBottomSheet)) {
            return false;
        }
        UiStepBottomSheet uiStepBottomSheet = (UiStepBottomSheet) other;
        return Intrinsics.m31980c(this.uiScreen, uiStepBottomSheet.uiScreen) && Intrinsics.m31980c(this.componentNamesToActions, uiStepBottomSheet.componentNamesToActions) && Intrinsics.m31980c(this.onCancelled, uiStepBottomSheet.onCancelled) && Intrinsics.m31980c(this.cancelButtonName, uiStepBottomSheet.cancelButtonName) && this.hideWhenTappedOutside == uiStepBottomSheet.hideWhenTappedOutside;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final BottomSheetBehavior<?> m6510h() {
        return this.bottomSheetBehavior;
    }

    public int hashCode() {
        int iHashCode = ((((this.uiScreen.hashCode() * 31) + this.componentNamesToActions.hashCode()) * 31) + this.onCancelled.hashCode()) * 31;
        String str = this.cancelButtonName;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.hideWhenTappedOutside);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final C1152g getUiScreenGenerationResult() {
        return this.uiScreenGenerationResult;
    }

    /* JADX INFO: renamed from: j */
    public final void m6512j() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.m12125X0(5);
        }
        this.bottomSheetBehavior = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m6513k(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.bottomSheetBehavior != null) {
            return;
        }
        C9545a c9545aM37673c = C9545a.m37673c(LayoutInflater.from(container.getContext()), container, false);
        Intrinsics.checkNotNullExpressionValue(c9545aM37673c, "inflate(...)");
        m6514l(c9545aM37673c, this);
        container.removeAllViews();
        container.addView(c9545aM37673c.getRoot());
    }

    /* JADX INFO: renamed from: l */
    public final void m6514l(@NotNull C9545a binding, @NotNull final UiStepBottomSheet rendering) {
        View viewM6491d;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        ViewGroup.LayoutParams layoutParams = binding.f34497b.getLayoutParams();
        Intrinsics.m31981d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.AbstractC0524c abstractC0524cM2632f = ((CoordinatorLayout.C0527f) layoutParams).m2632f();
        Intrinsics.m31981d(abstractC0524cM2632f, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<*>");
        final BottomSheetBehavior<?> bottomSheetBehavior = (BottomSheetBehavior) abstractC0524cM2632f;
        if (!C12524g.m46875f()) {
            CoordinatorLayout coordinatorLayoutM37674b = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM37674b, "getRoot(...)");
            C12524g.m46873d(coordinatorLayoutM37674b, false, false, false, false, 14, null);
        }
        Function0 function0 = new Function0() { // from class: ar.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiStepBottomSheet.m6504m(this.f4893a);
            }
        };
        ConstraintLayout bottomSheet = binding.f34497b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        C12519b.m46866b(bottomSheetBehavior, function0, bottomSheet, binding.f34499d, binding.f34500e);
        this.bottomSheetBehavior = bottomSheetBehavior;
        if (binding.getRoot().isAttachedToWindow()) {
            Context context = binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C7259g.m30270d(context);
            binding.getRoot().postDelayed(new Runnable() { // from class: ar.j
                @Override // java.lang.Runnable
                public final void run() {
                    UiStepBottomSheet.m6505n(bottomSheetBehavior);
                }
            }, 100L);
        } else {
            binding.getRoot().addOnAttachStateChangeListener(new a(binding, bottomSheetBehavior));
        }
        Context context2 = binding.getRoot().getContext();
        C1164s c1164s = C1164s.f4917a;
        Intrinsics.checkNotNull(context2);
        C1152g c1152gM6522h = C1164s.m6522h(c1164s, context2, this.uiScreen, false, true, false, 16, null);
        this.uiScreenGenerationResult = c1152gM6522h;
        binding.f34498c.addView(c1152gM6522h.getContentView());
        Map<String, ComponentView> mapM6497a = c1152gM6522h.getViewBindings().m6497a();
        for (Pair<String, Function1<UiComponent, Unit>> pair : this.componentNamesToActions) {
            String strM31673c = pair.m31673c();
            final Function1<UiComponent, Unit> function1M31674d = pair.m31674d();
            final ComponentView componentView = mapM6497a.get(strM31673c);
            if (componentView != null) {
                componentView.m6491d().setOnClickListener(new View.OnClickListener() { // from class: ar.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UiStepBottomSheet.m6506o(function1M31674d, componentView, view);
                    }
                });
            }
        }
        ComponentView componentView2 = mapM6497a.get(this.cancelButtonName);
        if (componentView2 != null && (viewM6491d = componentView2.m6491d()) != null) {
            viewM6491d.setOnClickListener(new View.OnClickListener() { // from class: ar.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UiStepBottomSheet.m6507p(bottomSheetBehavior, view);
                }
            });
        }
        ConstraintLayout bottomSheet2 = binding.f34497b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet2, "bottomSheet");
        C0371e.m1407c(bottomSheet2, new Function0() { // from class: ar.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiStepBottomSheet.m6508q(bottomSheetBehavior);
            }
        });
        if (rendering.hideWhenTappedOutside) {
            binding.f34500e.setOnClickListener(new View.OnClickListener() { // from class: ar.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UiStepBottomSheet.m6509r(bottomSheetBehavior, view);
                }
            });
        } else {
            binding.f34500e.setOnClickListener(null);
        }
        NestedScrollView contentScrollView = binding.f34499d;
        Intrinsics.checkNotNullExpressionValue(contentScrollView, "contentScrollView");
        StepStyles.UiStepStyle styles = this.uiScreen.getStyles();
        FrameLayout contentContainer = binding.f34498c;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        C7293c.m30334c(contentScrollView, styles, contentContainer, null, false, 12, null);
    }

    @NotNull
    public String toString() {
        return "UiStepBottomSheet(uiScreen=" + this.uiScreen + ", componentNamesToActions=" + this.componentNamesToActions + ", onCancelled=" + this.onCancelled + ", cancelButtonName=" + this.cancelButtonName + ", hideWhenTappedOutside=" + this.hideWhenTappedOutside + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
      (r7v0 com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen)
      (r8v0 java.util.List)
      (r9v0 kotlin.jvm.functions.Function0)
      (r10v0 java.lang.String)
      (wrap boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r11v0 boolean))
     A[MD:(com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen, java.util.List<? extends kotlin.Pair<java.lang.String, ? extends kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent, kotlin.Unit>>>, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.String, boolean):void (m)] (LINE:11) call: ar.p.<init>(com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen, java.util.List, kotlin.jvm.functions.Function0, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ UiStepBottomSheet(UiComponentScreen uiComponentScreen, List list, Function0 function0, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiComponentScreen, list, function0, str, (i10 & 16) != 0 ? true : z10);
    }
}
