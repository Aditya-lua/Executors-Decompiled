package p084dr;

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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.HelpBottomSheetComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p055ui.dotsIndicator.Pi2DotsTabIndicator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7702q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0371e;
import p227jr.C7293c;
import p227jr.C7297e;
import p227jr.C7304h0;
import p227jr.EnumC7298e0;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p313nq.C9548d;
import p526wq.C12519b;
import p526wq.C12524g;

/* JADX INFO: renamed from: dr.n */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JS\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001f\u001a\r\u0012\t\u0012\u00070\u001b¢\u0006\u0002\b\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010*\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00128\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b'\u0010!\"\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b+\u0010,*\u0004\b-\u0010.¨\u00060"}, m31665d2 = {"Ldr/n;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Ldr/o;", "viewModel", "Lkotlin/Function0;", "", "onDismissed", "onLaunchAction", "onSecondaryLaunchAction", "x", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ldr/o;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "onClose", "", "n", "(Lkotlin/jvm/functions/Function0;)Z", "F", "()V", "u", "a", "Landroid/view/ViewGroup;", "Ljt/h;", "Lnq/d;", "Lkotlin/jvm/internal/EnhancedNullability;", "b", "Ljt/h;", "lazyBinding", "c", "Z", "setup", "d", "Lkotlin/jvm/functions/Function0;", "currentOnDismissed", "value", "e", "t", "(Z)V", "isShowing", "r", "()Lnq/d;", "getBinding$delegate", "(Ldr/n;)Ljava/lang/Object;", "binding", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4674n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<C9548d> lazyBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean setup;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public Function0<Unit> currentOnDismissed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isShowing;

    /* JADX INFO: renamed from: dr.n$a */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"dr/n$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends BottomSheetBehavior.AbstractC2756g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0<Unit> f19148a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BottomSheetBehavior<FrameLayout> f19149b;

        public a(Function0<Unit> function0, BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
            this.f19148a = function0;
            this.f19149b = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: b */
        public void mo12170b(View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: c */
        public void mo12171c(View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (newState == 5) {
                this.f19148a.invoke();
                this.f19149b.m12108F0(this);
            }
        }
    }

    public C4674n(@NotNull ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
        this.lazyBinding = C7342i.m30456b(new Function0() { // from class: dr.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4674n.m22946s(this.f19133a);
            }
        });
        this.currentOnDismissed = new Function0() { // from class: dr.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4674n.m22945q();
            }
        };
    }

    /* JADX INFO: renamed from: A */
    public static final void m22924A(C4674n c4674n) {
        BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(c4674n.m22953r().f34514d);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        bottomSheetBehaviorM12102q0.m12125X0(3);
    }

    /* JADX INFO: renamed from: B */
    public static final void m22925B(C4674n c4674n, final Function0 function0, View view) {
        c4674n.m22952n(new Function0() { // from class: dr.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4674n.m22926C(function0);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m22926C(Function0 function0) {
        function0.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: D */
    public static final void m22927D(C4674n c4674n, final Function0 function0, View view) {
        c4674n.m22952n(new Function0() { // from class: dr.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4674n.m22928E(function0);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m22928E(Function0 function0) {
        function0.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m22929G(C9548d c9548d) {
        BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(c9548d.f34514d);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        bottomSheetBehaviorM12102q0.m12125X0(5);
        FrameLayout frameLayoutM37682b = c9548d.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutM37682b, "getRoot(...)");
        C0371e.m1407c(frameLayoutM37682b, null);
        return Unit.f29331a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: dr.n */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m22943o(C4674n c4674n, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = new Function0() { // from class: dr.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4674n.m22944p();
                }
            };
        }
        return c4674n.m22952n(function0);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m22944p() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m22945q() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s */
    public static final C9548d m22946s(C4674n c4674n) {
        return C9548d.m37681c(LayoutInflater.from(c4674n.contentView.getContext()), c4674n.contentView, true);
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m22947v(C4674n c4674n) {
        c4674n.m22954t(false);
        c4674n.currentOnDismissed.invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m22948w(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.m12125X0(5);
    }

    /* JADX INFO: renamed from: y */
    public static final void m22949y(C4674n c4674n, View view) {
        m22943o(c4674n, null, 1, null);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m22950z(C4674n c4674n, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Space bottomInset = c4674n.m22953r().f34513c;
        Intrinsics.checkNotNullExpressionValue(bottomInset, "bottomInset");
        ViewGroup.LayoutParams layoutParams = bottomInset.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = insetsIgnoringVisibility.bottom;
        bottomInset.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F */
    public final void m22951F() {
        final C9548d c9548dM22953r = m22953r();
        if (c9548dM22953r == null) {
            return;
        }
        if (this.isShowing) {
            FrameLayout frameLayoutM37682b = c9548dM22953r.getRoot();
            Intrinsics.checkNotNullExpressionValue(frameLayoutM37682b, "getRoot(...)");
            C0371e.m1407c(frameLayoutM37682b, new Function0() { // from class: dr.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4674n.m22929G(c9548dM22953r);
                }
            });
        } else {
            FrameLayout frameLayoutM37682b2 = c9548dM22953r.getRoot();
            Intrinsics.checkNotNullExpressionValue(frameLayoutM37682b2, "getRoot(...)");
            C0371e.m1407c(frameLayoutM37682b2, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m22952n(@Nullable Function0<Unit> onClose) {
        if (!this.lazyBinding.isInitialized()) {
            return false;
        }
        BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(m22953r().f34514d);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        if (onClose != null) {
            bottomSheetBehaviorM12102q0.m12131c0(new a(onClose, bottomSheetBehaviorM12102q0));
        }
        if (bottomSheetBehaviorM12102q0.m12159v0() == 5) {
            return false;
        }
        bottomSheetBehaviorM12102q0.m12125X0(5);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final C9548d m22953r() {
        return this.lazyBinding.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final void m22954t(boolean z10) {
        this.isShowing = z10;
        m22951F();
    }

    /* JADX INFO: renamed from: u */
    public final void m22955u() {
        if (this.setup) {
            return;
        }
        this.setup = true;
        final BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(m22953r().f34514d);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        bottomSheetBehaviorM12102q0.m12127Z0(true);
        Function0 function0 = new Function0() { // from class: dr.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4674n.m22947v(this.f19131a);
            }
        };
        FrameLayout bottomSheet = m22953r().f34514d;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        C12519b.m46866b(bottomSheetBehaviorM12102q0, function0, bottomSheet, m22953r().f34515e, m22953r().f34520j);
        m22953r().f34520j.setOnClickListener(new View.OnClickListener() { // from class: dr.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4674n.m22948w(bottomSheetBehaviorM12102q0, view);
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: jr.c.c(android.view.ViewGroup, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle, android.view.View, android.graphics.Rect, boolean, int, java.lang.Object):void */
    /* JADX DEBUG: Class process forced to load method for inline: jr.e.h(android.widget.Button, com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle, boolean, boolean, boolean, int, java.lang.Object):void */
    /* JADX INFO: renamed from: x */
    public final void m22956x(@Nullable StepStyles.UiStepStyle styles, @NotNull HelpBottomSheetViewModel viewModel, @NotNull Function0<Unit> onDismissed, @Nullable final Function0<Unit> onLaunchAction, @Nullable final Function0<Unit> onSecondaryLaunchAction) {
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
        m22955u();
        m22954t(true);
        if (onLaunchAction != null) {
            m22953r().f34512b.setOnClickListener(new View.OnClickListener() { // from class: dr.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C4674n.m22925B(this.f19134a, onLaunchAction, view);
                }
            });
        }
        if (onSecondaryLaunchAction != null) {
            m22953r().f34519i.setOnClickListener(new View.OnClickListener() { // from class: dr.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C4674n.m22927D(this.f19136a, onSecondaryLaunchAction, view);
                }
            });
        }
        C4678r c4678r = new C4678r(viewModel.getComponentStyle());
        c4678r.m22967G(viewModel.m22961e());
        m22953r().f34522l.setAdapter(c4678r);
        Pi2DotsTabIndicator dotsIndicator = m22953r().f34517g;
        Intrinsics.checkNotNullExpressionValue(dotsIndicator, "dotsIndicator");
        if (c4678r.mo5473e() > 1) {
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
        ViewPager2 viewPager = m22953r().f34522l;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        dotsIndicator.m20501n(viewPager);
        String strM22962f = viewModel.getTitle();
        if (strM22962f != null) {
            m22953r().f34521k.setText(strM22962f);
        }
        if (styles != null && (titleStyle = styles.getTitleStyle()) != null && (base = titleStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            TextView title = m22953r().f34521k;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C7304h0.m30391k(title, base2, C7702q0.m31911g(EnumC7298e0.Margin, EnumC7298e0.LineHeight));
        }
        if (onLaunchAction != null) {
            String strM22957a = viewModel.getButtonText();
            if (strM22957a != null) {
                m22953r().f34512b.setText(strM22957a);
            }
            HelpBottomSheetComponentStyle helpBottomSheetComponentStyleM22958b = viewModel.getComponentStyle();
            if (helpBottomSheetComponentStyleM22958b != null && (launchButtonStyle = helpBottomSheetComponentStyleM22958b.getLaunchButtonStyle()) != null) {
                MaterialButton actionButton = m22953r().f34512b;
                Intrinsics.checkNotNullExpressionValue(actionButton, "actionButton");
                C7297e.m30364h(actionButton, launchButtonStyle, false, false, true, 6, null);
            }
            m22953r().f34512b.setVisibility(0);
        } else {
            m22953r().f34512b.setVisibility(8);
        }
        if (onSecondaryLaunchAction == null || viewModel.getSecondaryButtonActionComponentName() == null) {
            m22953r().f34519i.setVisibility(8);
        } else {
            String strM22960d = viewModel.getSecondaryButtonText();
            if (strM22960d != null) {
                m22953r().f34519i.setText(strM22960d);
            }
            HelpBottomSheetComponentStyle helpBottomSheetComponentStyleM22958b2 = viewModel.getComponentStyle();
            if (helpBottomSheetComponentStyleM22958b2 != null && (secondaryButtonStyle = helpBottomSheetComponentStyleM22958b2.getSecondaryButtonStyle()) != null) {
                MaterialButton secondaryActionButton = m22953r().f34519i;
                Intrinsics.checkNotNullExpressionValue(secondaryActionButton, "secondaryActionButton");
                C7297e.m30364h(secondaryActionButton, secondaryButtonStyle, false, false, true, 6, null);
            }
            m22953r().f34519i.setVisibility(0);
        }
        m22953r().f34516f.setOnClickListener(new View.OnClickListener() { // from class: dr.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4674n.m22949y(this.f19138a, view);
            }
        });
        LinearLayout bottomSheetContent = m22953r().f34515e;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        C7293c.m30334c(bottomSheetContent, styles, null, null, true, 6, null);
        Space bottomInset = m22953r().f34513c;
        Intrinsics.checkNotNullExpressionValue(bottomInset, "bottomInset");
        C12524g.m46876g(bottomInset, new Function1() { // from class: dr.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4674n.m22950z(this.f19139a, (WindowInsetsCompat) obj);
            }
        });
        m22953r().getRoot().postDelayed(new Runnable() { // from class: dr.k
            @Override // java.lang.Runnable
            public final void run() {
                C4674n.m22924A(this.f19140a);
            }
        }, 100L);
    }
}
