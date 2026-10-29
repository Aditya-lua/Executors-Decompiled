package mo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import er.C5192a;
import er.C5199h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lr.C8243c;
import no.C9527c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0371e;
import p226jq.C7265j;
import p227jr.C7293c;
import p227jr.C7297e;
import p227jr.C7301g;
import p227jr.C7304h0;
import p497vp.C12243f;
import p526wq.C12519b;
import p526wq.C12524g;

/* JADX INFO: renamed from: mo.h */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m31665d2 = {"Lmo/h;", "", "Landroid/view/ViewGroup;", "contentView", "<init>", "(Landroid/view/ViewGroup;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lmo/a;", "viewModel", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "assetConfig", "", "l", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lmo/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;)V", "o", "()V", "h", "a", "Landroid/view/ViewGroup;", "Lno/c;", "b", "Lno/c;", "binding", "", "value", "c", "Z", "g", "(Z)V", "isShowing", "d", "setup", "Landroid/view/View;", "e", "Landroid/view/View;", "currentAssetIllustrationView", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8606h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ViewGroup contentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public C9527c binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isShowing;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean setup;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public View currentAssetIllustrationView;

    /* JADX INFO: renamed from: mo.h$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31586a;

        static {
            int[] iArr = new int[IdConfig.EnumC3514b.values().length];
            try {
                iArr[IdConfig.EnumC3514b.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.EnumC3514b.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdConfig.EnumC3514b.BarcodePdf417.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31586a = iArr;
        }
    }

    public C8606h(@NotNull ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.contentView = contentView;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m34641i(C8606h c8606h) {
        c8606h.m34647g(false);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m34642j(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.m12125X0(5);
    }

    /* JADX INFO: renamed from: k */
    public static final void m34643k(BottomSheetBehavior bottomSheetBehavior, View view) {
        bottomSheetBehavior.m12125X0(5);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m34644m(C9527c c9527c, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Space bottomInset = c9527c.f34354b;
        Intrinsics.checkNotNullExpressionValue(bottomInset, "bottomInset");
        ViewGroup.LayoutParams layoutParams = bottomInset.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = insetsIgnoringVisibility.bottom;
        bottomInset.setLayoutParams(layoutParams);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m34645n(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.m12125X0(3);
        bottomSheetBehavior.m12127Z0(true);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m34646p(C9527c c9527c) {
        BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(c9527c.f34355c);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        bottomSheetBehaviorM12102q0.m12125X0(5);
        FrameLayout root = c9527c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C0371e.m1407c(root, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g */
    public final void m34647g(boolean z10) {
        this.isShowing = z10;
        m34650o();
    }

    /* JADX INFO: renamed from: h */
    public final void m34648h() {
        C9527c c9527c = this.binding;
        if (c9527c == null || this.setup) {
            return;
        }
        this.setup = true;
        final BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(c9527c.f34355c);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        Function0 function0 = new Function0() { // from class: mo.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8606h.m34641i(this.f31578a);
            }
        };
        FrameLayout bottomSheet = c9527c.f34355c;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        C12519b.m46866b(bottomSheetBehaviorM12102q0, function0, bottomSheet, c9527c.f34356d, c9527c.f34362j);
        c9527c.f34362j.setOnClickListener(new View.OnClickListener() { // from class: mo.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8606h.m34642j(bottomSheetBehaviorM12102q0, view);
            }
        });
        c9527c.f34358f.setOnClickListener(new View.OnClickListener() { // from class: mo.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8606h.m34643k(bottomSheetBehaviorM12102q0, view);
            }
        });
        bottomSheetBehaviorM12102q0.m12127Z0(true);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0145  */
    /* JADX INFO: renamed from: l */
    public final void m34649l(@Nullable StepStyles.GovernmentIdStepStyle styles, @NotNull BottomSheetCaptureTipsViewModel viewModel, @Nullable NextStep.GovernmentId.AssetConfig.CapturePage assetConfig) {
        RemoteImage idFrontHelpModalPictograph;
        int i10;
        StyleElements.SizeSet modalPaddingValue;
        Double dp2;
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle;
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle;
        StepStyles.StepTextBasedComponentStyleContainer base5;
        TextBasedComponentStyle base6;
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle2;
        StepStyles.StepTextBasedComponentStyleContainer base7;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        final C9527c c9527cM37618c = this.binding;
        if (c9527cM37618c == null) {
            c9527cM37618c = C9527c.m37618c(LayoutInflater.from(this.contentView.getContext()), this.contentView, true);
            Intrinsics.checkNotNullExpressionValue(c9527cM37618c, "inflate(...)");
        }
        this.binding = c9527cM37618c;
        m34648h();
        m34647g(true);
        TextView title = c9527cM37618c.f34364l;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        C5199h.m24129e(title, viewModel.getTitle());
        TextView prompt = c9527cM37618c.f34361i;
        Intrinsics.checkNotNullExpressionValue(prompt, "prompt");
        C5199h.m24129e(prompt, viewModel.getPrompt());
        c9527cM37618c.f34358f.setText(viewModel.getButtonText());
        LinearLayout tipsContainer = c9527cM37618c.f34363k;
        Intrinsics.checkNotNullExpressionValue(tipsContainer, "tipsContainer");
        C5192a.m24093e(tipsContainer, viewModel.getTips(), (styles == null || (textStyle2 = styles.getTextStyle()) == null || (base7 = textStyle2.getBase()) == null) ? null : base7.getBase());
        final BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(c9527cM37618c.f34355c);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        if (styles != null && (titleStyle = styles.getTitleStyle()) != null && (base5 = titleStyle.getBase()) != null && (base6 = base5.getBase()) != null) {
            TextView title2 = c9527cM37618c.f34364l;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            C7304h0.m30392l(title2, base6, null, 2, null);
        }
        if (styles != null && (textStyle = styles.getTextStyle()) != null && (base3 = textStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            TextView prompt2 = c9527cM37618c.f34361i;
            Intrinsics.checkNotNullExpressionValue(prompt2, "prompt");
            C7304h0.m30392l(prompt2, base4, null, 2, null);
        }
        if (styles != null && (buttonPrimaryStyle = styles.getButtonPrimaryStyle()) != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            PersonaMaterialButton continueButton = c9527cM37618c.f34358f;
            Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
            C7297e.m30364h(continueButton, base2, false, false, false, 14, null);
        }
        LinearLayout bottomSheetContent = c9527cM37618c.f34356d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetContent, "bottomSheetContent");
        C7293c.m30334c(bottomSheetContent, styles, null, null, false, 14, null);
        if (styles != null && (modalPaddingValue = styles.getModalPaddingValue()) != null) {
            PersonaMaterialButton continueButton2 = c9527cM37618c.f34358f;
            Intrinsics.checkNotNullExpressionValue(continueButton2, "continueButton");
            ViewGroup.LayoutParams layoutParams = continueButton2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            StyleElements.Size top = modalPaddingValue.getTop();
            if (top != null && (dp2 = top.getDp()) != null) {
                marginLayoutParams.topMargin = (int) C7265j.m30285a(dp2.doubleValue());
            }
            continueButton2.setLayoutParams(marginLayoutParams);
        }
        IdConfig.EnumC3514b side = viewModel.getSide();
        int[] iArr = a.f31586a;
        int i11 = iArr[side.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (assetConfig != null) {
                        idFrontHelpModalPictograph = assetConfig.getIdFrontHelpModalPictograph();
                    } else {
                        idFrontHelpModalPictograph = null;
                    }
                } else if (assetConfig != null) {
                    idFrontHelpModalPictograph = assetConfig.getBarcodeHelpModalPictograph();
                } else {
                    idFrontHelpModalPictograph = null;
                }
            } else if (assetConfig != null) {
                idFrontHelpModalPictograph = assetConfig.getIdBackHelpModalPictograph();
            } else {
                idFrontHelpModalPictograph = null;
            }
        } else if (assetConfig != null) {
            idFrontHelpModalPictograph = assetConfig.getIdFrontHelpModalPictograph();
        } else {
            idFrontHelpModalPictograph = null;
        }
        if (idFrontHelpModalPictograph == null) {
            int i12 = iArr[viewModel.getSide().ordinal()];
            if (i12 == 1) {
                i10 = C12243f.f43205c;
            } else if (i12 != 2) {
                i10 = i12 != 3 ? C12243f.f43205c : C12243f.f43204b;
            } else {
                i10 = C12243f.f43203a;
            }
            c9527cM37618c.f34359g.setAnimation(i10);
            int i13 = iArr[viewModel.getSide().ordinal()];
            if (i13 == 2) {
                ThemeableLottieAnimationView illustration = c9527cM37618c.f34359g;
                Intrinsics.checkNotNullExpressionValue(illustration, "illustration");
                C7301g.m30380m(illustration, styles != null ? styles.getCaptureHintIconStrokeColor() : null, styles != null ? styles.getCaptureHintIconFillColor() : null, null, null, new String[]{"#000000", "#190051"}, new String[]{"#AA84FF"}, null, new String[0], 68, null);
            } else if (i13 != 3) {
                ThemeableLottieAnimationView illustration2 = c9527cM37618c.f34359g;
                Intrinsics.checkNotNullExpressionValue(illustration2, "illustration");
                C7301g.m30380m(illustration2, styles != null ? styles.getCaptureHintIconStrokeColor() : null, styles != null ? styles.getCaptureHintIconFillColor() : null, null, null, new String[]{"#000000"}, new String[]{"#8751FF"}, null, new String[0], 68, null);
            } else {
                ThemeableLottieAnimationView illustration3 = c9527cM37618c.f34359g;
                Intrinsics.checkNotNullExpressionValue(illustration3, "illustration");
                C7301g.m30380m(illustration3, styles != null ? styles.getCaptureHintIconStrokeColor() : null, styles != null ? styles.getCaptureHintIconFillColor() : null, null, null, new String[]{"#190051"}, new String[]{"#AA84FF", "#AA85FF"}, null, new String[0], 68, null);
            }
        } else if (this.currentAssetIllustrationView == null) {
            ConstraintLayout illustrationContainer = c9527cM37618c.f34360h;
            Intrinsics.checkNotNullExpressionValue(illustrationContainer, "illustrationContainer");
            this.currentAssetIllustrationView = C8243c.m33618f(idFrontHelpModalPictograph, illustrationContainer, false, 2, null);
            c9527cM37618c.f34359g.setVisibility(8);
        }
        Space bottomInset = c9527cM37618c.f34354b;
        Intrinsics.checkNotNullExpressionValue(bottomInset, "bottomInset");
        C12524g.m46876g(bottomInset, new Function1() { // from class: mo.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8606h.m34644m(c9527cM37618c, (WindowInsetsCompat) obj);
            }
        });
        c9527cM37618c.getRoot().postDelayed(new Runnable() { // from class: mo.c
            @Override // java.lang.Runnable
            public final void run() {
                C8606h.m34645n(bottomSheetBehaviorM12102q0);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: o */
    public final void m34650o() {
        final C9527c c9527c = this.binding;
        if (c9527c == null) {
            return;
        }
        if (this.isShowing) {
            FrameLayout root = c9527c.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            C0371e.m1407c(root, new Function0() { // from class: mo.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C8606h.m34646p(c9527c);
                }
            });
        } else {
            FrameLayout root2 = c9527c.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            C0371e.m1407c(root2, null);
        }
    }
}
