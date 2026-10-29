package jr;

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
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u000b\u001a\u00020\u0005*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0003*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;", "styles", "", "shouldSkipSettingMargin", "", "f", "(Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;Z)V", "Landroid/widget/Button;", "isLoading", "shouldStyleWidthAndHeight", "e", "(Landroid/widget/Button;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZZ)V", "isEnabled", "Landroid/graphics/drawable/GradientDrawable;", "b", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;ZZ)Landroid/graphics/drawable/GradientDrawable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "c", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;)Z", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21732a;

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
            f21732a = iArr;
        }
    }

    public static final GradientDrawable b(BaseButtonComponentStyle baseButtonComponentStyle, boolean z10, boolean z11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Double borderWidthValue = baseButtonComponentStyle.getBorderWidthValue();
        int iA = borderWidthValue != null ? (int) jq.j.a(borderWidthValue.doubleValue()) : 0;
        Integer baseBorderColorValue = baseButtonComponentStyle.getBaseBorderColorValue();
        int iIntValue = baseBorderColorValue != null ? baseBorderColorValue.intValue() : 0;
        Integer activeTextColorValue = baseButtonComponentStyle.getActiveTextColorValue();
        int iIntValue2 = activeTextColorValue != null ? activeTextColorValue.intValue() : iIntValue;
        Integer disabledTextColorValue = baseButtonComponentStyle.getDisabledTextColorValue();
        gradientDrawable.setStroke(iA, new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue2, disabledTextColorValue != null ? disabledTextColorValue.intValue() : iIntValue, iIntValue}));
        Double borderRadiusValue = baseButtonComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            float fA = (float) jq.j.a(borderRadiusValue.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            Intrinsics.d(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{fA, fA, fA, fA, fA, fA, fA, fA});
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

    public static final boolean c(StyleElements.SizeSet sizeSet) {
        return d(sizeSet.getTop()) && d(sizeSet.getBottom()) && d(sizeSet.getLeft()) && d(sizeSet.getRight());
    }

    public static final boolean d(StyleElements.Size size) {
        if (size == null) {
            return true;
        }
        if (size instanceof StyleElements.Size.PercentSize) {
            return ((StyleElements.Size.PercentSize) size).getPercent() == 0.0d;
        }
        if (!(size instanceof StyleElements.DPSize)) {
            return size.getDp() == null || Intrinsics.a(size.getDp(), 0.0d);
        }
        StyleElements.DPSize dPSize = (StyleElements.DPSize) size;
        return dPSize.getDp() == null || dPSize.getDp().doubleValue() == 0.0d;
    }

    public static final void e(@NotNull final Button button, @NotNull final BaseButtonComponentStyle styles, final boolean z10, final boolean z11, final boolean z12) {
        Intrinsics.checkNotNullParameter(button, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        if (button.isLaidOut()) {
            g(styles, button, z10, z12, z11);
        } else {
            wq.z.b(button, new Function0() { // from class: jr.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.j(styles, button, z10, z12, z11);
                }
            });
        }
    }

    public static final void f(@NotNull ButtonWithLoadingIndicator buttonWithLoadingIndicator, @NotNull BaseButtonComponentStyle styles, boolean z10) {
        Intrinsics.checkNotNullParameter(buttonWithLoadingIndicator, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        h(buttonWithLoadingIndicator.getButton(), styles, false, false, z10, 6, null);
        Integer activeTextColorValue = styles.getActiveTextColorValue();
        if (activeTextColorValue != null) {
            buttonWithLoadingIndicator.getProgressBar().setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{activeTextColorValue.intValue()}));
        }
    }

    public static final void g(BaseButtonComponentStyle baseButtonComponentStyle, Button button, boolean z10, boolean z11, boolean z12) {
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
        h0.i(button, fontNameValue, fontWeightValue, null, 4, null);
        Double lineHeightValue = baseButtonComponentStyle.getLineHeightValue();
        if (lineHeightValue != null) {
            double dDoubleValue = lineHeightValue.doubleValue();
            if (Build.VERSION.SDK_INT >= 28) {
                button.setLineHeight((int) jq.j.a(dDoubleValue));
            }
        }
        button.setBackground(b(baseButtonComponentStyle, button.isEnabled(), z10));
        button.setBackgroundTintList(null);
        float f10 = 0.0f;
        button.setElevation(0.0f);
        button.setStateListAnimator(null);
        button.setAllCaps(false);
        Object parent = button.getParent();
        View view = parent instanceof ButtonWithLoadingIndicator ? (View) parent : button;
        StyleElements.SizeSet marginValue = baseButtonComponentStyle.getMarginValue();
        if (marginValue != null && (!z11 || !c(marginValue))) {
            mr.d.c(button, marginValue);
            if (view instanceof ButtonWithLoadingIndicator) {
                ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) view;
                ProgressBar progressBar = buttonWithLoadingIndicator.getProgressBar();
                StyleElements.Size left = marginValue.getLeft();
                int paddingLeft = (left == null || (dp5 = left.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingLeft() : (int) jq.j.a(dp5.doubleValue());
                StyleElements.Size top = marginValue.getTop();
                int paddingTop = (top == null || (dp4 = top.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingTop() : (int) jq.j.a(dp4.doubleValue());
                StyleElements.Size right = marginValue.getRight();
                int paddingRight = (right == null || (dp3 = right.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingRight() : (int) jq.j.a(dp3.doubleValue());
                StyleElements.Size bottom = marginValue.getBottom();
                progressBar.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp2 = bottom.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingBottom() : (int) jq.j.a(dp2.doubleValue()));
            }
        }
        StyleElements.SizeSet paddingValue = baseButtonComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            mr.d.e(button, paddingValue);
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
                layoutParams.width = kotlin.ranges.d.f((int) jq.j.a(dDoubleValue2), measuredWidth);
            }
        }
        Double heightValue = baseButtonComponentStyle.getHeightValue();
        if (heightValue != null) {
            double dDoubleValue3 = heightValue.doubleValue();
            if (z12) {
                layoutParams.height = (int) jq.j.a(dDoubleValue3);
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
        if (justificationValue != null && (layoutParams instanceof ConstraintLayout.b)) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            int i12 = a.f21732a[justificationValue.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = 0.5f;
                } else {
                    if (i12 != 3) {
                        throw new jt.l();
                    }
                    f10 = 1.0f;
                }
            }
            bVar.G = f10;
        }
        view.setLayoutParams(layoutParams);
    }

    public static /* synthetic */ void h(Button button, BaseButtonComponentStyle baseButtonComponentStyle, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        if ((i10 & 8) != 0) {
            z12 = false;
        }
        e(button, baseButtonComponentStyle, z10, z11, z12);
    }

    public static /* synthetic */ void i(ButtonWithLoadingIndicator buttonWithLoadingIndicator, BaseButtonComponentStyle baseButtonComponentStyle, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        f(buttonWithLoadingIndicator, baseButtonComponentStyle, z10);
    }

    public static final Unit j(BaseButtonComponentStyle baseButtonComponentStyle, Button button, boolean z10, boolean z11, boolean z12) {
        g(baseButtonComponentStyle, button, z10, z11, z12);
        return Unit.f22483a;
    }
}
