package or;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.util.List;
import java.util.Map;
import nn.ViewEnvironment;
import nn.b0;
import nn.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import qr.x5;

/* JADX INFO: renamed from: or.s, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012$\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R2\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u0010?\u001a\b\u0012\u0002\b\u0003\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R \u0010C\u001a\b\u0012\u0004\u0012\u00020\u00000@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010A\u001a\u0004\b&\u0010B¨\u0006D"}, d2 = {"Lor/s;", "Lnn/b;", "Lor/i;", "uiScreen", BuildConfig.FLAVOR, "Lkotlin/Pair;", BuildConfig.FLAVOR, "Lkotlin/Function1;", "Lqr/x5;", BuildConfig.FLAVOR, "componentNamesToActions", "Lkotlin/Function0;", "onCancelled", "cancelButtonName", BuildConfig.FLAVOR, "hideWhenTappedOutside", "<init>", "(Lor/i;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Z)V", "Landroid/view/ViewGroup;", "container", "k", "(Landroid/view/ViewGroup;)V", "Lbr/a;", "binding", "rendering", "l", "(Lbr/a;Lor/s;)V", "j", "()V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lor/i;", "b", "Ljava/util/List;", "c", "Lkotlin/jvm/functions/Function0;", "d", "Ljava/lang/String;", "e", "Z", "Lor/j;", "f", "Lor/j;", "i", "()Lor/j;", "setUiScreenGenerationResult", "(Lor/j;)V", "uiScreenGenerationResult", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "g", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "h", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "setBottomSheetBehavior", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "bottomSheetBehavior", "Lnn/b0;", "Lnn/b0;", "()Lnn/b0;", "viewFactory", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UiStepBottomSheet implements nn.b<UiStepBottomSheet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final UiComponentScreen uiScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Pair<String, Function1<x5, Unit>>> componentNamesToActions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Function0<Unit> onCancelled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String cancelButtonName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean hideWhenTappedOutside;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public j uiScreenGenerationResult;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public BottomSheetBehavior<?> bottomSheetBehavior;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0<UiStepBottomSheet> viewFactory;

    /* JADX INFO: renamed from: or.s$a */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"or/s$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", BuildConfig.FLAVOR, "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ br.a f28507a;
        public final /* synthetic */ BottomSheetBehavior<?> b;

        public a(br.a aVar, BottomSheetBehavior<?> bottomSheetBehavior) {
            this.f28507a = aVar;
            this.b = bottomSheetBehavior;
        }

        public static final void b(BottomSheetBehavior bottomSheetBehavior) {
            bottomSheetBehavior.X0(3);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = this.f28507a.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            xq.g.d(context);
            final BottomSheetBehavior<?> bottomSheetBehavior = this.b;
            view.postDelayed(new Runnable() { // from class: or.r
                @Override // java.lang.Runnable
                public final void run() {
                    UiStepBottomSheet.a.b(bottomSheetBehavior);
                }
            }, 100L);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    /* JADX INFO: renamed from: or.s$b */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ls5/a;", "BindingT", BuildConfig.FLAVOR, "RenderingT", "binding", "Lnn/k;", "a", "(Ls5/a;)Lnn/k;"}, k = 3, mv = {2, 2, 0})
    public static final class b extends p001kotlin.jvm.internal.m implements Function1<br.a, nn.k<UiStepBottomSheet>> {

        /* JADX INFO: renamed from: or.s$b$a */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Ls5/a;", "BindingT", BuildConfig.FLAVOR, "RenderingT", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "a", "(Ljava/lang/Object;Lnn/z;)V"}, k = 3, mv = {2, 2, 0})
        public static final class a<RenderingT> implements nn.k {
            public final /* synthetic */ s5.a b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UiStepBottomSheet f28509c;

            public a(s5.a aVar, UiStepBottomSheet uiStepBottomSheet) {
                this.b = aVar;
                this.f28509c = uiStepBottomSheet;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // nn.k
            public final void a(@NotNull RenderingT rendering, @NotNull ViewEnvironment viewEnvironment) {
                Intrinsics.checkNotNullParameter(rendering, "rendering");
                Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
                br.a aVar = (br.a) this.b;
                UiStepBottomSheet uiStepBottomSheet = this.f28509c;
                Intrinsics.checkNotNull(aVar);
                uiStepBottomSheet.l(aVar, (UiStepBottomSheet) rendering);
            }
        }

        public b() {
            super(1);
        }

        @Override // p001kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nn.k<UiStepBottomSheet> invoke(@NotNull br.a binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            return new a(binding, UiStepBottomSheet.this);
        }
    }

    /* JADX INFO: renamed from: or.s$c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, br.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f28510a = new c();

        public c() {
            super(3, br.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepBottomSheetBinding;", 0);
        }

        public final br.a d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return br.a.c(p8, viewGroup, z10);
        }

        @Override // pu.n
        public /* bridge */ /* synthetic */ br.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiStepBottomSheet(@NotNull UiComponentScreen uiScreen, @NotNull List<? extends Pair<String, ? extends Function1<? super x5, Unit>>> componentNamesToActions, @NotNull Function0<Unit> onCancelled, @Nullable String str, boolean z10) {
        Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
        Intrinsics.checkNotNullParameter(componentNamesToActions, "componentNamesToActions");
        Intrinsics.checkNotNullParameter(onCancelled, "onCancelled");
        this.uiScreen = uiScreen;
        this.componentNamesToActions = componentNamesToActions;
        this.onCancelled = onCancelled;
        this.cancelButtonName = str;
        this.hideWhenTappedOutside = z10;
        nn.k.Companion companion = nn.k.INSTANCE;
        this.viewFactory = new y(d0.b(UiStepBottomSheet.class), c.f28510a, new b());
    }

    public static final Unit m(UiStepBottomSheet uiStepBottomSheet) {
        uiStepBottomSheet.onCancelled.invoke();
        return Unit.f21506a;
    }

    public static final void n(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.X0(3);
    }

    public static final void o(Function1 function1, ComponentView componentView, View view) {
        function1.invoke(componentView.c());
    }

    public static final void p(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.X0(5);
    }

    public static final Unit q(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.X0(5);
        return Unit.f21506a;
    }

    public static final void r(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.X0(5);
    }

    @Override // nn.b
    @NotNull
    public b0<UiStepBottomSheet> a() {
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
        return Intrinsics.c(this.uiScreen, uiStepBottomSheet.uiScreen) && Intrinsics.c(this.componentNamesToActions, uiStepBottomSheet.componentNamesToActions) && Intrinsics.c(this.onCancelled, uiStepBottomSheet.onCancelled) && Intrinsics.c(this.cancelButtonName, uiStepBottomSheet.cancelButtonName) && this.hideWhenTappedOutside == uiStepBottomSheet.hideWhenTappedOutside;
    }

    @Nullable
    public final BottomSheetBehavior<?> h() {
        return this.bottomSheetBehavior;
    }

    public int hashCode() {
        int iHashCode = ((((this.uiScreen.hashCode() * 31) + this.componentNamesToActions.hashCode()) * 31) + this.onCancelled.hashCode()) * 31;
        String str = this.cancelButtonName;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.hideWhenTappedOutside);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final j getUiScreenGenerationResult() {
        return this.uiScreenGenerationResult;
    }

    public final void j() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.X0(5);
        }
        this.bottomSheetBehavior = null;
    }

    public final void k(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.bottomSheetBehavior != null) {
            return;
        }
        br.a aVarC = br.a.c(LayoutInflater.from(container.getContext()), container, false);
        Intrinsics.checkNotNullExpressionValue(aVarC, "inflate(...)");
        l(aVarC, this);
        container.removeAllViews();
        container.addView(aVarC.getRoot());
    }

    public final void l(@NotNull br.a binding, @NotNull final UiStepBottomSheet rendering) {
        View viewD;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        ViewGroup.LayoutParams layoutParams = binding.b.getLayoutParams();
        Intrinsics.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) layoutParams).f();
        Intrinsics.d(cVarF, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<*>");
        final BottomSheetBehavior<?> bottomSheetBehavior = (BottomSheetBehavior) cVarF;
        if (!kr.g.f()) {
            CoordinatorLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            kr.g.d(root, false, false, false, false, 14, null);
        }
        Function0 function0 = new Function0() { // from class: or.l
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiStepBottomSheet.m(this.f28493a);
            }
        };
        ConstraintLayout bottomSheet = binding.b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        kr.b.b(bottomSheetBehavior, function0, bottomSheet, binding.f4556d, binding.f4557e);
        this.bottomSheetBehavior = bottomSheetBehavior;
        if (binding.getRoot().isAttachedToWindow()) {
            Context context = binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            xq.g.d(context);
            binding.getRoot().postDelayed(new Runnable() { // from class: or.m
                @Override // java.lang.Runnable
                public final void run() {
                    UiStepBottomSheet.n(bottomSheetBehavior);
                }
            }, 100L);
        } else {
            binding.getRoot().addOnAttachStateChangeListener(new a(binding, bottomSheetBehavior));
        }
        Context context2 = binding.getRoot().getContext();
        v vVar = v.f28513a;
        Intrinsics.checkNotNull(context2);
        j jVarH = v.h(vVar, context2, this.uiScreen, false, true, false, 16, null);
        this.uiScreenGenerationResult = jVarH;
        binding.f4555c.addView(jVarH.getContentView());
        Map<String, ComponentView> mapA = jVarH.getViewBindings().a();
        for (Pair<String, Function1<x5, Unit>> pair : this.componentNamesToActions) {
            String strC = pair.c();
            final Function1<x5, Unit> function1D = pair.d();
            final ComponentView componentView = mapA.get(strC);
            if (componentView != null) {
                componentView.d().setOnClickListener(new View.OnClickListener() { // from class: or.n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UiStepBottomSheet.o(function1D, componentView, view);
                    }
                });
            }
        }
        ComponentView componentView2 = mapA.get(this.cancelButtonName);
        if (componentView2 != null && (viewD = componentView2.d()) != null) {
            viewD.setOnClickListener(new View.OnClickListener() { // from class: or.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UiStepBottomSheet.p(bottomSheetBehavior, view);
                }
            });
        }
        ConstraintLayout bottomSheet2 = binding.b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet2, "bottomSheet");
        nn.e.c(bottomSheet2, new Function0() { // from class: or.p
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiStepBottomSheet.q(bottomSheetBehavior);
            }
        });
        if (rendering.hideWhenTappedOutside) {
            binding.f4557e.setOnClickListener(new View.OnClickListener() { // from class: or.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UiStepBottomSheet.r(bottomSheetBehavior, view);
                }
            });
        } else {
            binding.f4557e.setOnClickListener(null);
        }
        NestedScrollView contentScrollView = binding.f4556d;
        Intrinsics.checkNotNullExpressionValue(contentScrollView, "contentScrollView");
        StepStyles.UiStepStyle styles = this.uiScreen.getStyles();
        FrameLayout contentContainer = binding.f4555c;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        yr.c.c(contentScrollView, styles, contentContainer, null, false, 12, null);
    }

    @NotNull
    public String toString() {
        return "UiStepBottomSheet(uiScreen=" + this.uiScreen + ", componentNamesToActions=" + this.componentNamesToActions + ", onCancelled=" + this.onCancelled + ", cancelButtonName=" + this.cancelButtonName + ", hideWhenTappedOutside=" + this.hideWhenTappedOutside + ")";
    }

    public /* synthetic */ UiStepBottomSheet(UiComponentScreen uiComponentScreen, List list, Function0 function0, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiComponentScreen, list, function0, str, (i10 & 16) != 0 ? true : z10);
    }
}
