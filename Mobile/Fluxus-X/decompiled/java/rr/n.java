package rr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.q0;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import yr.e0;
import yr.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JS\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001f\u001a\r\u0012\t\u0012\u00070\u001b¢\u0006\u0002\b\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010*\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00128\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b'\u0010!\"\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010,*\u0004\b-\u0010.¨\u00060"}, d2 = {"Lrr/n;", BuildConfig.FLAVOR, "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Lrr/o;", "viewModel", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onDismissed", "onLaunchAction", "onSecondaryLaunchAction", "x", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lrr/o;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "onClose", BuildConfig.FLAVOR, "n", "(Lkotlin/jvm/functions/Function0;)Z", "F", "()V", "u", "a", "Landroid/view/ViewGroup;", "Lzt/h;", "Lbr/d;", "Lkotlin/jvm/internal/EnhancedNullability;", "b", "Lzt/h;", "lazyBinding", "c", "Z", "setup", "d", "Lkotlin/jvm/functions/Function0;", "currentOnDismissed", "value", "e", "t", "(Z)V", "isShowing", "r", "()Lbr/d;", "getBinding$delegate", "(Lrr/n;)Ljava/lang/Object;", "binding", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final zt.h<br.d> lazyBinding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean setup;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> currentOnDismissed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isShowing;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"rr/n$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", BuildConfig.FLAVOR, "newState", BuildConfig.FLAVOR, "c", "(Landroid/view/View;I)V", BuildConfig.FLAVOR, "slideOffset", "b", "(Landroid/view/View;F)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends BottomSheetBehavior.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30936a;
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> b;

        public a(Function0<Unit> function0, BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
            this.f30936a = function0;
            this.b = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (newState == 5) {
                this.f30936a.invoke();
                this.b.F0(this);
            }
        }
    }

    public n(@NotNull ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
        this.lazyBinding = zt.i.a(new Function0() { // from class: rr.e
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.s(this.f30924a);
            }
        });
        this.currentOnDismissed = new Function0() { // from class: rr.f
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.q();
            }
        };
    }

    public static final void A(n nVar) {
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(nVar.r().f4568d);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        bottomSheetBehaviorQ0.X0(3);
    }

    public static final void B(n nVar, final Function0 function0, View view) {
        nVar.n(new Function0() { // from class: rr.m
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.C(function0);
            }
        });
    }

    public static final Unit C(Function0 function0) {
        function0.invoke();
        return Unit.f21506a;
    }

    public static final void D(n nVar, final Function0 function0, View view) {
        nVar.n(new Function0() { // from class: rr.b
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.E(function0);
            }
        });
    }

    public static final Unit E(Function0 function0) {
        function0.invoke();
        return Unit.f21506a;
    }

    public static final Unit G(br.d dVar) {
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(dVar.f4568d);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        bottomSheetBehaviorQ0.X0(5);
        FrameLayout frameLayoutB = dVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutB, "getRoot(...)");
        nn.e.c(frameLayoutB, null);
        return Unit.f21506a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean o(n nVar, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = new Function0() { // from class: rr.a
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.p();
                }
            };
        }
        return nVar.n(function0);
    }

    public static final Unit p() {
        return Unit.f21506a;
    }

    public static final Unit q() {
        return Unit.f21506a;
    }

    public static final br.d s(n nVar) {
        return br.d.c(LayoutInflater.from(nVar.contentView.getContext()), nVar.contentView, true);
    }

    public static final Unit v(n nVar) {
        nVar.t(false);
        nVar.currentOnDismissed.invoke();
        return Unit.f21506a;
    }

    public static final void w(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.X0(5);
    }

    public static final void y(n nVar, View view) {
        o(nVar, null, 1, null);
    }

    public static final Unit z(n nVar, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Space bottomInset = nVar.r().f4567c;
        Intrinsics.checkNotNullExpressionValue(bottomInset, "bottomInset");
        ViewGroup.LayoutParams layoutParams = bottomInset.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = insetsIgnoringVisibility.bottom;
        bottomInset.setLayoutParams(layoutParams);
        return Unit.f21506a;
    }

    public final void F() {
        final br.d dVarR = r();
        if (dVarR == null) {
            return;
        }
        if (this.isShowing) {
            FrameLayout frameLayoutB = dVarR.getRoot();
            Intrinsics.checkNotNullExpressionValue(frameLayoutB, "getRoot(...)");
            nn.e.c(frameLayoutB, new Function0() { // from class: rr.l
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.G(dVarR);
                }
            });
        } else {
            FrameLayout frameLayoutB2 = dVarR.getRoot();
            Intrinsics.checkNotNullExpressionValue(frameLayoutB2, "getRoot(...)");
            nn.e.c(frameLayoutB2, null);
        }
    }

    public final boolean n(@Nullable Function0<Unit> onClose) {
        if (!this.lazyBinding.isInitialized()) {
            return false;
        }
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(r().f4568d);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        if (onClose != null) {
            bottomSheetBehaviorQ0.c0(new a(onClose, bottomSheetBehaviorQ0));
        }
        if (bottomSheetBehaviorQ0.v0() == 5) {
            return false;
        }
        bottomSheetBehaviorQ0.X0(5);
        return true;
    }

    public final br.d r() {
        return this.lazyBinding.getValue();
    }

    public final void t(boolean z10) {
        this.isShowing = z10;
        F();
    }

    public final void u() {
        if (this.setup) {
            return;
        }
        this.setup = true;
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(r().f4568d);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        bottomSheetBehaviorQ0.Z0(true);
        Function0 function0 = new Function0() { // from class: rr.c
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.v(this.f30922a);
            }
        };
        FrameLayout bottomSheet = r().f4568d;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        kr.b.b(bottomSheetBehaviorQ0, function0, bottomSheet, r().f4569e, r().f4574j);
        r().f4574j.setOnClickListener(new View.OnClickListener() { // from class: rr.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.w(bottomSheetBehaviorQ0, view);
            }
        });
    }

    public final void x(@Nullable StepStyles.UiStepStyle styles, @NotNull HelpBottomSheetViewModel viewModel, @NotNull Function0<Unit> onDismissed, @Nullable final Function0<Unit> onLaunchAction, @Nullable final Function0<Unit> onSecondaryLaunchAction) {
        ButtonSubmitComponentStyle secondaryButtonStyle;
        ButtonSubmitComponentStyle launchButtonStyle;
        StepStyles.UiStepTitleComponentStyle titleStyle;
        StepStyles.StepTextBasedComponentStyleContainer base;
        TextBasedComponentStyle base2;
        Integer fillColorValue;
        Integer strokeColorValue;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        this.currentOnDismissed = onDismissed;
        u();
        t(true);
        if (onLaunchAction != null) {
            r().b.setOnClickListener(new View.OnClickListener() { // from class: rr.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n.B(this.f30925a, onLaunchAction, view);
                }
            });
        }
        if (onSecondaryLaunchAction != null) {
            r().f4573i.setOnClickListener(new View.OnClickListener() { // from class: rr.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n.D(this.f30926a, onSecondaryLaunchAction, view);
                }
            });
        }
        r rVar = new r(viewModel.getComponentStyle());
        rVar.G(viewModel.e());
        r().f4576l.setAdapter(rVar);
        Pi2DotsTabIndicator dotsIndicator = r().f4571g;
        Intrinsics.checkNotNullExpressionValue(dotsIndicator, "dotsIndicator");
        if (rVar.e() > 1) {
            dotsIndicator.setVisibility(0);
        } else {
            dotsIndicator.setVisibility(8);
        }
        if (styles != null && (strokeColorValue = styles.getStrokeColorValue()) != null) {
            dotsIndicator.setSelectedDotColor(strokeColorValue.intValue());
        }
        if (styles != null && (fillColorValue = styles.getFillColorValue()) != null) {
            dotsIndicator.setDotsColor(fillColorValue.intValue());
        }
        ViewPager2 viewPager = r().f4576l;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        dotsIndicator.n(viewPager);
        String strF = viewModel.getTitle();
        if (strF != null) {
            r().f4575k.setText(strF);
        }
        if (styles != null && (titleStyle = styles.getTitleStyle()) != null && (base = titleStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            TextView title = r().f4575k;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            h0.k(title, base2, q0.g(e0.Margin, e0.LineHeight));
        }
        if (onLaunchAction != null) {
            String strA = viewModel.getButtonText();
            if (strA != null) {
                r().b.setText(strA);
            }
            HelpBottomSheetComponentStyle helpBottomSheetComponentStyleB = viewModel.getComponentStyle();
            if (helpBottomSheetComponentStyleB != null && (launchButtonStyle = helpBottomSheetComponentStyleB.getLaunchButtonStyle()) != null) {
                MaterialButton actionButton = r().b;
                Intrinsics.checkNotNullExpressionValue(actionButton, "actionButton");
                yr.e.h(actionButton, launchButtonStyle, false, false, true, 6, null);
            }
            r().b.setVisibility(0);
        } else {
            r().b.setVisibility(8);
        }
        if (onSecondaryLaunchAction == null || viewModel.getSecondaryButtonActionComponentName() == null) {
            r().f4573i.setVisibility(8);
        } else {
            String strD = viewModel.getSecondaryButtonText();
            if (strD != null) {
                r().f4573i.setText(strD);
            }
            HelpBottomSheetComponentStyle helpBottomSheetComponentStyleB2 = viewModel.getComponentStyle();
            if (helpBottomSheetComponentStyleB2 != null && (secondaryButtonStyle = helpBottomSheetComponentStyleB2.getSecondaryButtonStyle()) != null) {
                MaterialButton secondaryActionButton = r().f4573i;
                Intrinsics.checkNotNullExpressionValue(secondaryActionButton, "secondaryActionButton");
                yr.e.h(secondaryActionButton, secondaryButtonStyle, false, false, true, 6, null);
            }
            r().f4573i.setVisibility(0);
        }
        r().f4570f.setOnClickListener(new View.OnClickListener() { // from class: rr.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.y(this.f30927a, view);
            }
        });
        LinearLayout bottomSheetContent = r().f4569e;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        yr.c.c(bottomSheetContent, styles, null, null, true, 6, null);
        Space bottomInset = r().f4567c;
        Intrinsics.checkNotNullExpressionValue(bottomInset, "bottomInset");
        kr.g.g(bottomInset, new Function1() { // from class: rr.j
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.z(this.f30928a, (WindowInsetsCompat) obj);
            }
        });
        r().getRoot().postDelayed(new Runnable() { // from class: rr.k
            @Override // java.lang.Runnable
            public final void run() {
                n.A(this.f30929a);
            }
        }, 100L);
    }
}
