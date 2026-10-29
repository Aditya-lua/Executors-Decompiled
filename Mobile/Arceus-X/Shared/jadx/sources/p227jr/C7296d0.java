package p227jr;

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
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
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

/* JADX INFO: renamed from: jr.d0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "styles", "", "k", "(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V", "", "hasFocus", "", "baseBackgroundColor", "focusedColor", "disabledColor", "i", "(Lcom/google/android/material/textfield/TextInputLayout;ZIII)V", "color", "j", "(Lcom/google/android/material/textfield/TextInputLayout;I)V", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7296d0 {
    /* JADX INFO: renamed from: i */
    public static final void m30346i(@NotNull TextInputLayout textInputLayout, boolean z10, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        if (z10) {
            textInputLayout.setBoxBackgroundColor(i11);
        } else if (textInputLayout.isEnabled()) {
            textInputLayout.setBoxBackgroundColor(i10);
        } else {
            textInputLayout.setBoxBackgroundColor(i12);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m30347j(TextInputLayout textInputLayout, int i10) {
        EditText editText;
        Drawable textCursorDrawable;
        if (Build.VERSION.SDK_INT < 29 || (editText = textInputLayout.getEditText()) == null || (textCursorDrawable = editText.getTextCursorDrawable()) == null) {
            return;
        }
        C7316t.m30421a();
        textCursorDrawable.setColorFilter(C7315s.m30420a(i10, BlendMode.SRC_ATOP));
    }

    /* JADX WARN: Type inference failed for: r0v59, types: [T, jr.w] */
    /* JADX INFO: renamed from: k */
    public static final void m30348k(@NotNull final TextInputLayout textInputLayout, @NotNull InputTextBasedComponentStyle styles) {
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
        final C7729c0 c7729c0 = new C7729c0();
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
            m30346i(textInputLayout, textInputLayout.hasFocus(), iIntValue3, iIntValue4, iIntValue5);
            c7729c0.f29425a = new Function1() { // from class: jr.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C7296d0.m30354q(textInputLayout, iIntValue3, iIntValue4, iIntValue5, ((Boolean) obj).booleanValue());
                }
            };
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: jr.x
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    C7296d0.m30355r(textInputLayout, iIntValue6, iIntValue3, iIntValue4, iIntValue5, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        Double borderWidthValue = styles.getBorderWidthValue();
        if (borderWidthValue != null) {
            double dDoubleValue = borderWidthValue.doubleValue();
            textInputLayout.setBoxStrokeWidth((int) Math.ceil(C7265j.m30285a(dDoubleValue)));
            textInputLayout.setBoxStrokeWidthFocused((int) Math.ceil(C7265j.m30285a(dDoubleValue)));
        }
        Double borderRadiusValue = styles.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            double dDoubleValue2 = borderRadiusValue.doubleValue();
            textInputLayout.m13132a0((float) C7265j.m30285a(dDoubleValue2), (float) C7265j.m30285a(dDoubleValue2), (float) C7265j.m30285a(dDoubleValue2), (float) C7265j.m30285a(dDoubleValue2));
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
            C7304h0.m30388h(editText4, baseFontFamilyValue, valueFontWeightValue, new Function1() { // from class: jr.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C7296d0.m30356s(textInputLayout, (Typeface) obj);
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
            C7304h0.m30389i(editText6, valueFontFamilyValue, valueFontWeightValue2, null, 4, null);
        }
        if (Build.VERSION.SDK_INT >= 28 && (valueLineHeightValue = styles.getValueLineHeightValue()) != null) {
            double dDoubleValue5 = valueLineHeightValue.doubleValue();
            EditText editText7 = textInputLayout.getEditText();
            if (editText7 != null) {
                editText7.setLineHeight((int) C7265j.m30285a(dDoubleValue5));
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
            m30347j(textInputLayout, iIntValue8);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: jr.z
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    C7296d0.m30349l(textInputLayout, iIntValue10, colorStateList, iIntValue8, view, i10, i11, i12, i13, i14, i15, i16, i17);
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
                    C7296d0.m30350m(textInputLayout, colorStateList3, colorStateList2, view, i10, i11, i12, i13, i14, i15, i16, i17);
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
            C8652d.m34730c(textInputLayout, inputTextBoxMargins);
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
                    C7296d0.m30351n(textInputLayout, colorStateList5, colorStateList4, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        EditText editText10 = textInputLayout.getEditText();
        if (editText10 != null) {
            editText10.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: jr.c0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    C7296d0.m30352o(textInputLayout, c7729c0, view, z10);
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

    /* JADX INFO: renamed from: l */
    public static final void m30349l(TextInputLayout textInputLayout, int i10, ColorStateList colorStateList, int i11, View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !C7776c0.m32211t1(error)) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.setTextColor(colorStateList);
            }
            m30347j(textInputLayout, i11);
            return;
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setTextColor(i10);
        }
        m30347j(textInputLayout, i10);
    }

    /* JADX INFO: renamed from: m */
    public static final void m30350m(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !C7776c0.m32211t1(error)) {
            textInputLayout.setDefaultHintTextColor(colorStateList2);
        } else {
            textInputLayout.setDefaultHintTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m30351n(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !C7776c0.m32211t1(error)) {
            textInputLayout.setPlaceholderTextColor(colorStateList2);
        } else {
            textInputLayout.setPlaceholderTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m30352o(TextInputLayout textInputLayout, final C7729c0 c7729c0, View view, final boolean z10) {
        textInputLayout.post(new Runnable() { // from class: jr.v
            @Override // java.lang.Runnable
            public final void run() {
                C7296d0.m30353p(c7729c0, z10);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static final void m30353p(C7729c0 c7729c0, boolean z10) {
        Function1 function1 = (Function1) c7729c0.f29425a;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m30354q(TextInputLayout textInputLayout, int i10, int i11, int i12, boolean z10) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !C7776c0.m32211t1(error)) {
            m30346i(textInputLayout, z10, i10, i11, i12);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m30355r(TextInputLayout textInputLayout, int i10, int i11, int i12, int i13, View view, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !C7776c0.m32211t1(error)) {
            m30346i(textInputLayout, textInputLayout.hasFocus(), i11, i12, i13);
        } else {
            textInputLayout.setBoxBackgroundColor(i10);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m30356s(TextInputLayout textInputLayout, Typeface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        textInputLayout.setTypeface(it);
        return Unit.f29331a;
    }
}
