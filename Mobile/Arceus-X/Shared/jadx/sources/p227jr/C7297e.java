package p227jr;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.p055ui.ButtonWithLoadingIndicator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import mr.C8652d;
import org.jetbrains.annotations.NotNull;
import p226jq.C7265j;
import p229jt.C7345l;
import p526wq.C12543z;

/* JADX INFO: renamed from: jr.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u000b\u001a\u00020\u0005*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0003*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;", "styles", "", "shouldSkipSettingMargin", "", "f", "(Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;Z)V", "Landroid/widget/Button;", "isLoading", "shouldStyleWidthAndHeight", "e", "(Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZZ)V", "isEnabled", "Landroid/graphics/drawable/GradientDrawable;", "b", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZ)Landroid/graphics/drawable/GradientDrawable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;)Z", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7297e {

    /* JADX INFO: renamed from: jr.e$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28151a;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28151a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final GradientDrawable m30358b(BaseButtonComponentStyle baseButtonComponentStyle, boolean z10, boolean z11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Double borderWidthValue = baseButtonComponentStyle.getBorderWidthValue();
        int iM30285a = borderWidthValue != null ? (int) C7265j.m30285a(borderWidthValue.doubleValue()) : 0;
        Integer baseBorderColorValue = baseButtonComponentStyle.getBaseBorderColorValue();
        int iIntValue = baseBorderColorValue != null ? baseBorderColorValue.intValue() : 0;
        Integer activeTextColorValue = baseButtonComponentStyle.getActiveTextColorValue();
        int iIntValue2 = activeTextColorValue != null ? activeTextColorValue.intValue() : iIntValue;
        Integer disabledTextColorValue = baseButtonComponentStyle.getDisabledTextColorValue();
        gradientDrawable.setStroke(iM30285a, new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue2, disabledTextColorValue != null ? disabledTextColorValue.intValue() : iIntValue, iIntValue}));
        Double borderRadiusValue = baseButtonComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            float fM30285a = (float) C7265j.m30285a(borderRadiusValue.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            Intrinsics.m31981d(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{fM30285a, fM30285a, fM30285a, fM30285a, fM30285a, fM30285a, fM30285a, fM30285a});
        }
        Integer baseBackgroundColorValue = baseButtonComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            Integer activeBackgroundColorValue = baseButtonComponentStyle.getActiveBackgroundColorValue();
            int iIntValue3 = activeBackgroundColorValue != null ? activeBackgroundColorValue.intValue() : baseBackgroundColorValue.intValue();
            Integer disabledBackgroundColorValue = baseButtonComponentStyle.getDisabledBackgroundColorValue();
            int iIntValue4 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : baseBackgroundColorValue.intValue();
            new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue3, iIntValue4, baseBackgroundColorValue.intValue()});
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue3, iIntValue4, baseBackgroundColorValue.intValue()}));
        }
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m30359c(StyleElements.SizeSet sizeSet) {
        return m30360d(sizeSet.getTop()) && m30360d(sizeSet.getBottom()) && m30360d(sizeSet.getLeft()) && m30360d(sizeSet.getRight());
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m30360d(StyleElements.Size size) {
        if (size == null) {
            return true;
        }
        if (size instanceof StyleElements.Size.PercentSize) {
            return ((StyleElements.Size.PercentSize) size).getPercent() == 0.0d;
        }
        if (!(size instanceof StyleElements.DPSize)) {
            return size.getDp() == null || Intrinsics.m31978a(size.getDp(), 0.0d);
        }
        StyleElements.DPSize dPSize = (StyleElements.DPSize) size;
        return dPSize.getDp() == null || dPSize.getDp().doubleValue() == 0.0d;
    }

    /* JADX INFO: renamed from: e */
    public static final void m30361e(@NotNull final Button button, @NotNull final BaseButtonComponentStyle styles, final boolean z10, final boolean z11, final boolean z12) {
        Intrinsics.checkNotNullParameter(button, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        if (button.isLaidOut()) {
            m30363g(styles, button, z10, z12, z11);
        } else {
            C12543z.m46890b(button, new Function0() { // from class: jr.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C7297e.m30366j(styles, button, z10, z12, z11);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m30362f(@NotNull ButtonWithLoadingIndicator buttonWithLoadingIndicator, @NotNull BaseButtonComponentStyle styles, boolean z10) {
        Intrinsics.checkNotNullParameter(buttonWithLoadingIndicator, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        m30364h(buttonWithLoadingIndicator.getButton(), styles, false, false, z10, 6, null);
        Integer activeTextColorValue = styles.getActiveTextColorValue();
        if (activeTextColorValue != null) {
            buttonWithLoadingIndicator.getProgressBar().setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{activeTextColorValue.intValue()}));
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m30363g(BaseButtonComponentStyle baseButtonComponentStyle, Button button, boolean z10, boolean z11, boolean z12) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Integer baseTextColorValue = baseButtonComponentStyle.getBaseTextColorValue();
        if (baseTextColorValue != null) {
            int iIntValue = baseTextColorValue.intValue();
            Integer activeTextColorValue = baseButtonComponentStyle.getActiveTextColorValue();
            int iIntValue2 = activeTextColorValue != null ? activeTextColorValue.intValue() : iIntValue;
            Integer disabledTextColorValue = baseButtonComponentStyle.getDisabledTextColorValue();
            ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue2, disabledTextColorValue != null ? disabledTextColorValue.intValue() : iIntValue, iIntValue});
            button.setTextColor(colorStateList);
            MaterialButton materialButton = button instanceof MaterialButton ? (MaterialButton) button : null;
            if (materialButton != null) {
                materialButton.setIconTint(colorStateList);
            }
        }
        Double fontSizeValue = baseButtonComponentStyle.getFontSizeValue();
        if (fontSizeValue != null) {
            button.setTextSize((float) fontSizeValue.doubleValue());
        }
        Double letterSpacingValue = baseButtonComponentStyle.getLetterSpacingValue();
        if (letterSpacingValue != null) {
            button.setLetterSpacing((float) (letterSpacingValue.doubleValue() / ((double) button.getTextSize())));
        }
        String fontNameValue = baseButtonComponentStyle.getFontNameValue();
        StyleElements.FontWeight fontWeightValue = baseButtonComponentStyle.getFontWeightValue();
        if (fontWeightValue == null) {
            fontWeightValue = StyleElements.FontWeight.NORMAL;
        }
        C7304h0.m30389i(button, fontNameValue, fontWeightValue, null, 4, null);
        Double lineHeightValue = baseButtonComponentStyle.getLineHeightValue();
        if (lineHeightValue != null) {
            double dDoubleValue = lineHeightValue.doubleValue();
            if (Build.VERSION.SDK_INT >= 28) {
                button.setLineHeight((int) C7265j.m30285a(dDoubleValue));
            }
        }
        button.setBackground(m30358b(baseButtonComponentStyle, button.isEnabled(), z10));
        button.setBackgroundTintList(null);
        float f10 = 0.0f;
        button.setElevation(0.0f);
        button.setStateListAnimator(null);
        button.setAllCaps(false);
        Object parent = button.getParent();
        View view = parent instanceof ButtonWithLoadingIndicator ? (View) parent : button;
        StyleElements.SizeSet marginValue = baseButtonComponentStyle.getMarginValue();
        if (marginValue != null && (!z11 || !m30359c(marginValue))) {
            C8652d.m34730c(button, marginValue);
            if (view instanceof ButtonWithLoadingIndicator) {
                ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) view;
                ProgressBar progressBar = buttonWithLoadingIndicator.getProgressBar();
                StyleElements.Size left = marginValue.getLeft();
                int paddingLeft = (left == null || (dp5 = left.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingLeft() : (int) C7265j.m30285a(dp5.doubleValue());
                StyleElements.Size top = marginValue.getTop();
                int paddingTop = (top == null || (dp4 = top.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingTop() : (int) C7265j.m30285a(dp4.doubleValue());
                StyleElements.Size right = marginValue.getRight();
                int paddingRight = (right == null || (dp3 = right.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingRight() : (int) C7265j.m30285a(dp3.doubleValue());
                StyleElements.Size bottom = marginValue.getBottom();
                progressBar.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp2 = bottom.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingBottom() : (int) C7265j.m30285a(dp2.doubleValue()));
            }
        }
        StyleElements.SizeSet paddingValue = baseButtonComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            C8652d.m34732e(button, paddingValue);
        }
        int measuredWidth = view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Double widthValue = baseButtonComponentStyle.getWidthValue();
        if (widthValue != null) {
            double dDoubleValue2 = widthValue.doubleValue();
            if (z12) {
                layoutParams.width = C7764d.m32081f((int) C7265j.m30285a(dDoubleValue2), measuredWidth);
            }
        }
        Double heightValue = baseButtonComponentStyle.getHeightValue();
        if (heightValue != null) {
            double dDoubleValue3 = heightValue.doubleValue();
            if (z12) {
                layoutParams.height = (int) C7265j.m30285a(dDoubleValue3);
            }
        }
        if (view instanceof ButtonWithLoadingIndicator) {
            int i10 = layoutParams.height;
            ViewGroup.LayoutParams layoutParams2 = button.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i11 = i10 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            ViewGroup.LayoutParams layoutParams3 = button.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            layoutParams.height = i11 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
        }
        StyleElements.PositionType justificationValue = baseButtonComponentStyle.getJustificationValue();
        if (justificationValue != null && (layoutParams instanceof ConstraintLayout.C0513b)) {
            ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) layoutParams;
            int i12 = a.f28151a[justificationValue.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = 0.5f;
                } else {
                    if (i12 != 3) {
                        throw new C7345l();
                    }
                    f10 = 1.0f;
                }
            }
            c0513b.f1962G = f10;
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m30364h(Button button, BaseButtonComponentStyle baseButtonComponentStyle, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        if ((i10 & 8) != 0) {
            z12 = false;
        }
        m30361e(button, baseButtonComponentStyle, z10, z11, z12);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m30365i(ButtonWithLoadingIndicator buttonWithLoadingIndicator, BaseButtonComponentStyle baseButtonComponentStyle, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        m30362f(buttonWithLoadingIndicator, baseButtonComponentStyle, z10);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m30366j(BaseButtonComponentStyle baseButtonComponentStyle, Button button, boolean z10, boolean z11, boolean z12) {
        m30363g(baseButtonComponentStyle, button, z10, z11, z12);
        return Unit.f29331a;
    }
}
