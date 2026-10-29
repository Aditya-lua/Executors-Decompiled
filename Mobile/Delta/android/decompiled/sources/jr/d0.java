package jr;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "styles", "", "k", "(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V", "", "hasFocus", "", "baseBackgroundColor", "focusedColor", "disabledColor", "i", "(Lcom/google/android/material/textfield/TextInputLayout;ZIII)V", "color", "j", "(Lcom/google/android/material/textfield/TextInputLayout;I)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d0 {
    public static final void i(@NotNull TextInputLayout textInputLayout, boolean z10, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        if (z10) {
            textInputLayout.setBoxBackgroundColor(i11);
        } else if (textInputLayout.isEnabled()) {
            textInputLayout.setBoxBackgroundColor(i10);
        } else {
            textInputLayout.setBoxBackgroundColor(i12);
        }
    }

    public static final void j(TextInputLayout textInputLayout, int i10) {
        EditText editText;
        Drawable textCursorDrawable;
        if (Build.VERSION.SDK_INT < 29 || (editText = textInputLayout.getEditText()) == null || (textCursorDrawable = editText.getTextCursorDrawable()) == null) {
            return;
        }
        t.a();
        textCursorDrawable.setColorFilter(s.a(i10, BlendMode.SRC_ATOP));
    }

    /* JADX WARN: Type inference failed for: r0v59, types: [T, jr.w] */
    public static final void k(@NotNull final TextInputLayout textInputLayout, @NotNull InputTextBasedComponentStyle styles) {
        Integer focusedBackgroundColorValue;
        Double valueLineHeightValue;
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        Integer baseBorderColorValue = styles.getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            int iIntValue = baseBorderColorValue.intValue();
            Integer focusedBorderColorValue = styles.getFocusedBorderColorValue();
            int iIntValue2 = focusedBorderColorValue != null ? focusedBorderColorValue.intValue() : iIntValue;
            Integer disabledBorderColorValue = styles.getDisabledBorderColorValue();
            textInputLayout.setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{iIntValue, iIntValue2, disabledBorderColorValue != null ? disabledBorderColorValue.intValue() : iIntValue}));
            Integer errorBorderColorValue = styles.getErrorBorderColorValue();
            if (errorBorderColorValue != null) {
                iIntValue = errorBorderColorValue.intValue();
            }
            textInputLayout.setBoxStrokeErrorColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{iIntValue, iIntValue, iIntValue}));
        }
        final kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            final int iIntValue3 = baseBackgroundColorValue.intValue();
            Integer focusedBackgroundColorValue2 = styles.getFocusedBackgroundColorValue();
            final int iIntValue4 = focusedBackgroundColorValue2 != null ? focusedBackgroundColorValue2.intValue() : iIntValue3;
            Integer disabledBackgroundColorValue = styles.getDisabledBackgroundColorValue();
            final int iIntValue5 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : iIntValue3;
            Integer errorBackgroundColorValue = styles.getErrorBackgroundColorValue();
            final int iIntValue6 = errorBackgroundColorValue != null ? errorBackgroundColorValue.intValue() : iIntValue3;
            textInputLayout.setBoxBackgroundMode(2);
            i(textInputLayout, textInputLayout.hasFocus(), iIntValue3, iIntValue4, iIntValue5);
            c0Var.f22552a = new Function1() { // from class: jr.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.q(textInputLayout, iIntValue3, iIntValue4, iIntValue5, ((Boolean) obj).booleanValue());
                }
            };
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: jr.x
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    d0.r(textInputLayout, iIntValue6, iIntValue3, iIntValue4, iIntValue5, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        Double borderWidthValue = styles.getBorderWidthValue();
        if (borderWidthValue != null) {
            double dDoubleValue = borderWidthValue.doubleValue();
            textInputLayout.setBoxStrokeWidth((int) Math.ceil(jq.j.a(dDoubleValue)));
            textInputLayout.setBoxStrokeWidthFocused((int) Math.ceil(jq.j.a(dDoubleValue)));
        }
        Double borderRadiusValue = styles.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            double dDoubleValue2 = borderRadiusValue.doubleValue();
            textInputLayout.a0((float) jq.j.a(dDoubleValue2), (float) jq.j.a(dDoubleValue2), (float) jq.j.a(dDoubleValue2), (float) jq.j.a(dDoubleValue2));
        }
        Double valueFontSizeValue = styles.getValueFontSizeValue();
        if (valueFontSizeValue != null) {
            double dDoubleValue3 = valueFontSizeValue.doubleValue();
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.setTextSize((float) dDoubleValue3);
            }
        }
        Double valueLetterSpacingValue = styles.getValueLetterSpacingValue();
        if (valueLetterSpacingValue != null) {
            double dDoubleValue4 = valueLetterSpacingValue.doubleValue();
            EditText editText2 = textInputLayout.getEditText();
            double textSize = dDoubleValue4 / ((double) (editText2 != null ? editText2.getTextSize() : 12.0f));
            EditText editText3 = textInputLayout.getEditText();
            if (editText3 != null) {
                editText3.setLetterSpacing((float) textSize);
            }
        }
        EditText editText4 = textInputLayout.getEditText();
        if (editText4 != null) {
            String baseFontFamilyValue = styles.getBaseFontFamilyValue();
            StyleElements.FontWeight valueFontWeightValue = styles.getValueFontWeightValue();
            if (valueFontWeightValue == null) {
                valueFontWeightValue = StyleElements.FontWeight.NORMAL;
            }
            h0.h(editText4, baseFontFamilyValue, valueFontWeightValue, new Function1() { // from class: jr.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.s(textInputLayout, (Typeface) obj);
                }
            });
        }
        EditText editText5 = textInputLayout.getEditText();
        textInputLayout.setTypeface(editText5 != null ? editText5.getTypeface() : null);
        EditText editText6 = textInputLayout.getEditText();
        if (editText6 != null) {
            String valueFontFamilyValue = styles.getValueFontFamilyValue();
            StyleElements.FontWeight valueFontWeightValue2 = styles.getValueFontWeightValue();
            if (valueFontWeightValue2 == null) {
                valueFontWeightValue2 = StyleElements.FontWeight.NORMAL;
            }
            h0.i(editText6, valueFontFamilyValue, valueFontWeightValue2, null, 4, null);
        }
        if (Build.VERSION.SDK_INT >= 28 && (valueLineHeightValue = styles.getValueLineHeightValue()) != null) {
            double dDoubleValue5 = valueLineHeightValue.doubleValue();
            EditText editText7 = textInputLayout.getEditText();
            if (editText7 != null) {
                editText7.setLineHeight((int) jq.j.a(dDoubleValue5));
            }
        }
        Integer baseTextColor = styles.getBaseTextColor();
        if (baseTextColor != null) {
            int iIntValue7 = baseTextColor.intValue();
            Integer valueFocusedTextColor = styles.getValueFocusedTextColor();
            final int iIntValue8 = valueFocusedTextColor != null ? valueFocusedTextColor.intValue() : iIntValue7;
            Integer valueDisabledTextColor = styles.getValueDisabledTextColor();
            int iIntValue9 = valueDisabledTextColor != null ? valueDisabledTextColor.intValue() : iIntValue7;
            Integer valueErrorTextColor = styles.getValueErrorTextColor();
            final int iIntValue10 = valueErrorTextColor != null ? valueErrorTextColor.intValue() : iIntValue7;
            final ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue7, iIntValue8, iIntValue9, iIntValue7});
            EditText editText8 = textInputLayout.getEditText();
            if (editText8 != null) {
                editText8.setTextColor(colorStateList);
            }
            j(textInputLayout, iIntValue8);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: jr.z
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    d0.l(textInputLayout, iIntValue10, colorStateList, iIntValue8, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        Integer errorBaseTextColor = styles.getErrorBaseTextColor();
        if (errorBaseTextColor != null) {
            int iIntValue11 = errorBaseTextColor.intValue();
            Integer errorErrorTextColor = styles.getErrorErrorTextColor();
            int iIntValue12 = errorErrorTextColor != null ? errorErrorTextColor.intValue() : iIntValue11;
            Integer errorFocusedTextColor = styles.getErrorFocusedTextColor();
            int iIntValue13 = errorFocusedTextColor != null ? errorFocusedTextColor.intValue() : iIntValue11;
            Integer errorDisabledTextColor = styles.getErrorDisabledTextColor();
            if (errorDisabledTextColor != null) {
                iIntValue11 = errorDisabledTextColor.intValue();
            }
            textInputLayout.setErrorTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue12, iIntValue13, iIntValue11, iIntValue12}));
        }
        Integer labelBaseTextColor = styles.getLabelBaseTextColor();
        if (labelBaseTextColor != null) {
            int iIntValue14 = labelBaseTextColor.intValue();
            Integer labelFocusedTextColor = styles.getLabelFocusedTextColor();
            int iIntValue15 = labelFocusedTextColor != null ? labelFocusedTextColor.intValue() : iIntValue14;
            Integer labelDisabledTextColor = styles.getLabelDisabledTextColor();
            int iIntValue16 = labelDisabledTextColor != null ? labelDisabledTextColor.intValue() : iIntValue14;
            Integer labelErrorTextColor = styles.getLabelErrorTextColor();
            int iIntValue17 = labelErrorTextColor != null ? labelErrorTextColor.intValue() : iIntValue14;
            final ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue14, iIntValue15, iIntValue16, iIntValue14});
            final ColorStateList colorStateList3 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue17, iIntValue17, iIntValue17, iIntValue17});
            textInputLayout.setDefaultHintTextColor(colorStateList2);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: jr.a0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    d0.m(textInputLayout, colorStateList3, colorStateList2, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        EditText editText9 = textInputLayout.getEditText();
        MaterialAutoCompleteTextView materialAutoCompleteTextView = editText9 instanceof MaterialAutoCompleteTextView ? (MaterialAutoCompleteTextView) editText9 : null;
        if (materialAutoCompleteTextView != null && (focusedBackgroundColorValue = styles.getFocusedBackgroundColorValue()) != null) {
            materialAutoCompleteTextView.setDropDownBackgroundDrawable(new ColorDrawable(focusedBackgroundColorValue.intValue()));
        }
        StyleElements.SizeSet inputTextBoxMargins = styles.getInputTextBoxMargins();
        if (inputTextBoxMargins != null) {
            mr.d.c(textInputLayout, inputTextBoxMargins);
        }
        Integer placeholderBaseTextColor = styles.getPlaceholderBaseTextColor();
        if (placeholderBaseTextColor != null) {
            int iIntValue18 = placeholderBaseTextColor.intValue();
            Integer placeholderFocusedTextColor = styles.getPlaceholderFocusedTextColor();
            int iIntValue19 = placeholderFocusedTextColor != null ? placeholderFocusedTextColor.intValue() : iIntValue18;
            Integer placeholderErrorTextColor = styles.getPlaceholderErrorTextColor();
            int iIntValue20 = placeholderErrorTextColor != null ? placeholderErrorTextColor.intValue() : iIntValue18;
            Integer placeholderDisabledTextColor = styles.getPlaceholderDisabledTextColor();
            final ColorStateList colorStateList4 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue18, iIntValue19, placeholderDisabledTextColor != null ? placeholderDisabledTextColor.intValue() : iIntValue18, iIntValue18});
            final ColorStateList colorStateList5 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue20, iIntValue20, iIntValue20, iIntValue20});
            textInputLayout.setPlaceholderTextColor(colorStateList4);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: jr.b0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    d0.n(textInputLayout, colorStateList5, colorStateList4, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        EditText editText10 = textInputLayout.getEditText();
        if (editText10 != null) {
            editText10.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: jr.c0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    d0.o(textInputLayout, c0Var, view, z10);
                }
            });
        }
        Integer baseMaskToggleColor = styles.getBaseMaskToggleColor();
        if (baseMaskToggleColor != null) {
            int iIntValue21 = baseMaskToggleColor.intValue();
            Integer focusedMaskToggleColor = styles.getFocusedMaskToggleColor();
            int iIntValue22 = focusedMaskToggleColor != null ? focusedMaskToggleColor.intValue() : iIntValue21;
            Integer disabledMaskToggleColor = styles.getDisabledMaskToggleColor();
            textInputLayout.setEndIconTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue21, iIntValue22, disabledMaskToggleColor != null ? disabledMaskToggleColor.intValue() : iIntValue21, iIntValue21}));
        }
    }

    public static final void l(TextInputLayout textInputLayout, int i10, ColorStateList colorStateList, int i11, View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.setTextColor(colorStateList);
            }
            j(textInputLayout, i11);
            return;
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setTextColor(i10);
        }
        j(textInputLayout, i10);
    }

    public static final void m(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            textInputLayout.setDefaultHintTextColor(colorStateList2);
        } else {
            textInputLayout.setDefaultHintTextColor(colorStateList);
        }
    }

    public static final void n(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            textInputLayout.setPlaceholderTextColor(colorStateList2);
        } else {
            textInputLayout.setPlaceholderTextColor(colorStateList);
        }
    }

    public static final void o(TextInputLayout textInputLayout, final kotlin.jvm.internal.c0 c0Var, View view, final boolean z10) {
        textInputLayout.post(new Runnable() { // from class: jr.v
            @Override // java.lang.Runnable
            public final void run() {
                d0.p(c0Var, z10);
            }
        });
    }

    public static final void p(kotlin.jvm.internal.c0 c0Var, boolean z10) {
        Function1 function1 = (Function1) c0Var.f22552a;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z10));
        }
    }

    public static final Unit q(TextInputLayout textInputLayout, int i10, int i11, int i12, boolean z10) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            i(textInputLayout, z10, i10, i11, i12);
        }
        return Unit.f22483a;
    }

    public static final void r(TextInputLayout textInputLayout, int i10, int i11, int i12, int i13, View view, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            i(textInputLayout, textInputLayout.hasFocus(), i11, i12, i13);
        } else {
            textInputLayout.setBoxBackgroundColor(i10);
        }
    }

    public static final Unit s(TextInputLayout textInputLayout, Typeface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        textInputLayout.setTypeface(it);
        return Unit.f22483a;
    }
}
