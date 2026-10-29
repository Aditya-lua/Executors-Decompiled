package p227jr;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7776c0;
import mr.C8652d;
import org.jetbrains.annotations.NotNull;
import p226jq.C7265j;

/* JADX INFO: renamed from: jr.o */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "", "i", "(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)V", "", "bottomBorderWidth", "h", "(Lcom/google/android/material/textfield/TextInputLayout;I)V", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7311o {
    /* JADX INFO: renamed from: h */
    public static final void m30400h(TextInputLayout textInputLayout, int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(i10, textInputLayout.getBoxStrokeColor());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        int i11 = -i10;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        layerDrawable.setLayerInset(0, i11, i11, i11, marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        textInputLayout.setBackground(layerDrawable);
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [T, jr.h] */
    /* JADX INFO: renamed from: i */
    public static final void m30401i(@NotNull final TextInputLayout textInputLayout, @NotNull InputSelectComponentStyle styles) {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        final C7729c0 c7729c0 = new C7729c0();
        Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            final int iIntValue = baseBackgroundColorValue.intValue();
            Integer focusedBackgroundColorValue = styles.getFocusedBackgroundColorValue();
            final int iIntValue2 = focusedBackgroundColorValue != null ? focusedBackgroundColorValue.intValue() : iIntValue;
            Integer disabledBackgroundColorValue = styles.getDisabledBackgroundColorValue();
            final int iIntValue3 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : iIntValue;
            Integer errorBackgroundColorValue = styles.getErrorBackgroundColorValue();
            final int iIntValue4 = errorBackgroundColorValue != null ? errorBackgroundColorValue.intValue() : iIntValue;
            textInputLayout.setBoxBackgroundMode(2);
            C7296d0.m30346i(textInputLayout, textInputLayout.hasFocus(), iIntValue, iIntValue2, iIntValue3);
            c7729c0.f29425a = new Function1() { // from class: jr.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C7311o.m30406n(textInputLayout, iIntValue, iIntValue2, iIntValue3, ((Boolean) obj).booleanValue());
                }
            };
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: jr.i
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    C7311o.m30407o(textInputLayout, iIntValue4, iIntValue, iIntValue2, iIntValue3, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        Integer baseBorderColorValue = styles.getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            int iIntValue5 = baseBorderColorValue.intValue();
            Integer focusedBorderColorValue = styles.getFocusedBorderColorValue();
            int iIntValue6 = focusedBorderColorValue != null ? focusedBorderColorValue.intValue() : iIntValue5;
            Integer disabledBorderColorValue = styles.getDisabledBorderColorValue();
            textInputLayout.setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{iIntValue5, iIntValue6, disabledBorderColorValue != null ? disabledBorderColorValue.intValue() : iIntValue5}));
            Integer errorBorderColorValue = styles.getErrorBorderColorValue();
            if (errorBorderColorValue != null) {
                iIntValue5 = errorBorderColorValue.intValue();
            }
            textInputLayout.setBoxStrokeErrorColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{iIntValue5, iIntValue5, iIntValue5}));
        }
        Double topBorderWidthValue = styles.getTopBorderWidthValue();
        if (topBorderWidthValue != null) {
            double dDoubleValue = topBorderWidthValue.doubleValue();
            textInputLayout.setBoxStrokeWidth((int) Math.ceil(C7265j.m30285a(dDoubleValue)));
            textInputLayout.setBoxStrokeWidthFocused((int) Math.ceil(C7265j.m30285a(dDoubleValue)));
        }
        if (textInputLayout.getBoxStrokeWidth() == 0) {
            Double bottomBorderWidthValue = styles.getBottomBorderWidthValue();
            if ((bottomBorderWidthValue != null ? bottomBorderWidthValue.doubleValue() : 0.0d) > 0.0d) {
                Double bottomBorderWidthValue2 = styles.getBottomBorderWidthValue();
                m30400h(textInputLayout, (int) Math.ceil(bottomBorderWidthValue2 != null ? C7265j.m30285a(bottomBorderWidthValue2.doubleValue()) : 0.0d));
            }
        }
        Integer chevronColor = styles.getChevronColor();
        if (chevronColor != null) {
            int iIntValue7 = chevronColor.intValue();
            textInputLayout.setEndIconTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842908}, new int[]{R.attr.state_hovered}, new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{iIntValue7, iIntValue7, iIntValue7, iIntValue7, iIntValue7, iIntValue7}));
        }
        Double borderRadiusValue = styles.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            double dDoubleValue2 = borderRadiusValue.doubleValue();
            textInputLayout.m13132a0((float) C7265j.m30285a(dDoubleValue2), (float) C7265j.m30285a(dDoubleValue2), (float) C7265j.m30285a(dDoubleValue2), (float) C7265j.m30285a(dDoubleValue2));
        }
        StyleElements.SizeSet inputSelectBoxMargins = styles.getInputSelectBoxMargins();
        if (inputSelectBoxMargins != null) {
            C8652d.m34730c(textInputLayout, inputSelectBoxMargins);
        }
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            C7304h0.m30392l(editText, styles.getTextBasedStyle(), null, 2, null);
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            C8652d.m34730c(editText2, new StyleElements.SizeSet(new StyleElements.DPSize(0.0d), new StyleElements.DPSize(0.0d), new StyleElements.DPSize(0.0d), new StyleElements.DPSize(0.0d)));
        }
        Integer baseTextColor = styles.getBaseTextColor();
        if (baseTextColor != null) {
            int iIntValue8 = baseTextColor.intValue();
            Integer valueFocusedTextColor = styles.getValueFocusedTextColor();
            int iIntValue9 = valueFocusedTextColor != null ? valueFocusedTextColor.intValue() : iIntValue8;
            Integer valueDisabledTextColor = styles.getValueDisabledTextColor();
            int iIntValue10 = valueDisabledTextColor != null ? valueDisabledTextColor.intValue() : iIntValue8;
            Integer valueErrorTextColor = styles.getValueErrorTextColor();
            final int iIntValue11 = valueErrorTextColor != null ? valueErrorTextColor.intValue() : iIntValue8;
            final ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue8, iIntValue9, iIntValue10, iIntValue8});
            EditText editText3 = textInputLayout.getEditText();
            if (editText3 != null) {
                editText3.setTextColor(colorStateList);
            }
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: jr.j
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    C7311o.m30408p(textInputLayout, iIntValue11, colorStateList, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        Integer errorBaseTextColor = styles.getErrorBaseTextColor();
        if (errorBaseTextColor != null) {
            int iIntValue12 = errorBaseTextColor.intValue();
            Integer errorErrorTextColor = styles.getErrorErrorTextColor();
            int iIntValue13 = errorErrorTextColor != null ? errorErrorTextColor.intValue() : iIntValue12;
            Integer errorFocusedTextColor = styles.getErrorFocusedTextColor();
            int iIntValue14 = errorFocusedTextColor != null ? errorFocusedTextColor.intValue() : iIntValue12;
            Integer errorDisabledTextColor = styles.getErrorDisabledTextColor();
            if (errorDisabledTextColor != null) {
                iIntValue12 = errorDisabledTextColor.intValue();
            }
            textInputLayout.setErrorTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue13, iIntValue14, iIntValue12, iIntValue13}));
        }
        Integer labelBaseTextColor = styles.getLabelBaseTextColor();
        if (labelBaseTextColor != null) {
            int iIntValue15 = labelBaseTextColor.intValue();
            Integer labelFocusedTextColor = styles.getLabelFocusedTextColor();
            int iIntValue16 = labelFocusedTextColor != null ? labelFocusedTextColor.intValue() : iIntValue15;
            Integer labelDisabledTextColor = styles.getLabelDisabledTextColor();
            int iIntValue17 = labelDisabledTextColor != null ? labelDisabledTextColor.intValue() : iIntValue15;
            Integer labelErrorTextColor = styles.getLabelErrorTextColor();
            int iIntValue18 = labelErrorTextColor != null ? labelErrorTextColor.intValue() : iIntValue15;
            final ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue15, iIntValue16, iIntValue17, iIntValue15});
            final ColorStateList colorStateList3 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue18, iIntValue18, iIntValue18, iIntValue18});
            textInputLayout.setDefaultHintTextColor(colorStateList2);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: jr.k
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    C7311o.m30402j(textInputLayout, colorStateList3, colorStateList2, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        Integer placeholderBaseTextColor = styles.getPlaceholderBaseTextColor();
        if (placeholderBaseTextColor != null) {
            int iIntValue19 = placeholderBaseTextColor.intValue();
            Integer placeholderFocusedTextColor = styles.getPlaceholderFocusedTextColor();
            int iIntValue20 = placeholderFocusedTextColor != null ? placeholderFocusedTextColor.intValue() : iIntValue19;
            Integer placeholderErrorTextColor = styles.getPlaceholderErrorTextColor();
            int iIntValue21 = placeholderErrorTextColor != null ? placeholderErrorTextColor.intValue() : iIntValue19;
            Integer placeholderDisabledTextColor = styles.getPlaceholderDisabledTextColor();
            final ColorStateList colorStateList4 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue19, iIntValue20, placeholderDisabledTextColor != null ? placeholderDisabledTextColor.intValue() : iIntValue19, iIntValue19});
            final ColorStateList colorStateList5 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue21, iIntValue21, iIntValue21, iIntValue21});
            textInputLayout.setPlaceholderTextColor(colorStateList4);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: jr.l
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    C7311o.m30403k(textInputLayout, colorStateList5, colorStateList4, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        EditText editText4 = textInputLayout.getEditText();
        if (editText4 != null) {
            editText4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: jr.m
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    C7311o.m30404l(textInputLayout, c7729c0, view, z10);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m30402j(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !C7776c0.m32211t1(error)) {
            textInputLayout.setDefaultHintTextColor(colorStateList2);
        } else {
            textInputLayout.setDefaultHintTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m30403k(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !C7776c0.m32211t1(error)) {
            textInputLayout.setPlaceholderTextColor(colorStateList2);
        } else {
            textInputLayout.setPlaceholderTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m30404l(TextInputLayout textInputLayout, final C7729c0 c7729c0, View view, final boolean z10) {
        textInputLayout.post(new Runnable() { // from class: jr.n
            @Override // java.lang.Runnable
            public final void run() {
                C7311o.m30405m(c7729c0, z10);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static final void m30405m(C7729c0 c7729c0, boolean z10) {
        Function1 function1 = (Function1) c7729c0.f29425a;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m30406n(TextInputLayout textInputLayout, int i10, int i11, int i12, boolean z10) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !C7776c0.m32211t1(error)) {
            C7296d0.m30346i(textInputLayout, z10, i10, i11, i12);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m30407o(TextInputLayout textInputLayout, int i10, int i11, int i12, int i13, View view, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !C7776c0.m32211t1(error)) {
            C7296d0.m30346i(textInputLayout, textInputLayout.hasFocus(), i11, i12, i13);
        } else {
            textInputLayout.setBoxBackgroundColor(i10);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m30408p(TextInputLayout textInputLayout, int i10, ColorStateList colorStateList, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !C7776c0.m32211t1(error)) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.setTextColor(colorStateList);
                return;
            }
            return;
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setTextColor(i10);
        }
    }
}
