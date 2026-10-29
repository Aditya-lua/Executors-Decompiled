package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0007\u0010·\u0001\u001a\u00020@J\u001b\u0010¸\u0001\u001a\u00030¹\u00012\b\u0010º\u0001\u001a\u00030»\u00012\u0007\u0010¼\u0001\u001a\u00020@R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u00105\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u00109\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010=\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0016\u0010?\u001a\u0004\u0018\u00010@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010C\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0013\u0010E\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bF\u0010BR\u0013\u0010G\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bH\u0010BR\u0013\u0010I\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bJ\u0010BR\u0016\u0010K\u001a\u0004\u0018\u00010@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010BR\u0016\u0010M\u001a\u0004\u0018\u00010@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010BR\u0013\u0010O\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bP\u0010BR\u0013\u0010Q\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bR\u0010BR\u0013\u0010S\u001a\u0004\u0018\u00010T8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0013\u0010W\u001a\u0004\u0018\u00010T8F¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0013\u0010Y\u001a\u0004\u0018\u00010T8F¢\u0006\u0006\u001a\u0004\bZ\u0010VR\u0013\u0010[\u001a\u0004\u0018\u00010T8F¢\u0006\u0006\u001a\u0004\b\\\u0010VR\u0013\u0010]\u001a\u0004\u0018\u00010T8F¢\u0006\u0006\u001a\u0004\b^\u0010VR\u0013\u0010_\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b`\u0010<R\u0013\u0010a\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\bb\u0010<R\u0013\u0010c\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\bd\u0010<R\u0013\u0010e\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\bf\u0010<R\u0013\u0010g\u001a\u0004\u0018\u00010h8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0013\u0010k\u001a\u0004\u0018\u00010h8F¢\u0006\u0006\u001a\u0004\bl\u0010jR\u0013\u0010m\u001a\u0004\u0018\u00010h8F¢\u0006\u0006\u001a\u0004\bn\u0010jR\u0013\u0010o\u001a\u0004\u0018\u00010h8F¢\u0006\u0006\u001a\u0004\bp\u0010jR\u0013\u0010q\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\br\u0010<R\u0013\u0010s\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\bt\u0010<R\u0013\u0010u\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\bv\u0010<R\u0013\u0010w\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\bx\u0010<R\u0013\u0010y\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\bz\u0010<R\u0013\u0010{\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b|\u0010<R\u0013\u0010}\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b~\u0010<R\u0014\u0010\u007f\u001a\u0004\u0018\u00010:8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010<R\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010:8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010<R\u0018\u0010\u0083\u0001\u001a\u0004\u0018\u00010@8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010BR\u0015\u0010\u0085\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010BR\u0015\u0010\u0087\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010BR\u0015\u0010\u0089\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010BR\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010BR\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010BR\u0015\u0010\u008f\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010BR\u0015\u0010\u0091\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010BR\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010BR\u0015\u0010\u0095\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010BR\u0015\u0010\u0097\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010BR\u0015\u0010\u0099\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010BR\u0015\u0010\u009b\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010BR\u0015\u0010\u009d\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010BR\u0015\u0010\u009f\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b \u0001\u0010BR\u0015\u0010¡\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010BR\u0015\u0010£\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010BR\u0015\u0010¥\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010BR\u0015\u0010§\u0001\u001a\u0004\u0018\u00010@8F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010BR\u0018\u0010©\u0001\u001a\u00030ª\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010\u00ad\u0001\u001a\u0004\u0018\u00010@8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u0010BR\u0015\u0010¯\u0001\u001a\u00030ª\u00018F¢\u0006\b\u001a\u0006\b°\u0001\u0010¬\u0001R\u0015\u0010±\u0001\u001a\u00030ª\u00018F¢\u0006\b\u001a\u0006\b²\u0001\u0010¬\u0001R\u0018\u0010³\u0001\u001a\u00030ª\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010¬\u0001R\u0015\u0010µ\u0001\u001a\u00030ª\u00018F¢\u0006\b\u001a\u0006\b¶\u0001\u0010¬\u0001¨\u0006½\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderRadiusStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderWidthStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBackgroundColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderColorStyle;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextStrokeColorStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextStrokeColorStyle;)V", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderRadiusStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderWidthStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBackgroundColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderColorStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextStrokeColorStyle;", "inputTextBoxMargins", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getInputTextBoxMargins", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "borderWidthValue", "", "getBorderWidthValue", "()Ljava/lang/Double;", "borderRadiusValue", "getBorderRadiusValue", "baseBorderColorValue", "", "getBaseBorderColorValue", "()Ljava/lang/Integer;", "focusedBorderColorValue", "getFocusedBorderColorValue", "disabledBorderColorValue", "getDisabledBorderColorValue", "errorBorderColorValue", "getErrorBorderColorValue", "activeOptionBackgroundColorValue", "getActiveOptionBackgroundColorValue", "baseBackgroundColorValue", "getBaseBackgroundColorValue", "focusedBackgroundColorValue", "getFocusedBackgroundColorValue", "disabledBackgroundColorValue", "getDisabledBackgroundColorValue", "errorBackgroundColorValue", "getErrorBackgroundColorValue", "baseFontFamilyValue", "", "getBaseFontFamilyValue", "()Ljava/lang/String;", "valueFontFamilyValue", "getValueFontFamilyValue", "placeholderFontFamilyValue", "getPlaceholderFontFamilyValue", "labelFontFamilyValue", "getLabelFontFamilyValue", "errorFontFamilyValue", "getErrorFontFamilyValue", "valueFontSizeValue", "getValueFontSizeValue", "placeholderFontSizeValue", "getPlaceholderFontSizeValue", "labelFontSizeValue", "getLabelFontSizeValue", "errorFontSizeValue", "getErrorFontSizeValue", "valueFontWeightValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "getValueFontWeightValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "placeholderFontWeightValue", "getPlaceholderFontWeightValue", "labelFontWeightValue", "getLabelFontWeightValue", "errorFontWeightValue", "getErrorFontWeightValue", "baseLetterSpacingValue", "getBaseLetterSpacingValue", "valueLetterSpacingValue", "getValueLetterSpacingValue", "placeholderLetterSpacingValue", "getPlaceholderLetterSpacingValue", "labelLetterSpacingValue", "getLabelLetterSpacingValue", "errorLetterSpacingValue", "getErrorLetterSpacingValue", "valueLineHeightValue", "getValueLineHeightValue", "placeholderLineHeightValue", "getPlaceholderLineHeightValue", "labelLineHeightValue", "getLabelLineHeightValue", "errorLineHeightValue", "getErrorLineHeightValue", "baseTextColor", "getBaseTextColor", "valueFocusedTextColor", "getValueFocusedTextColor", "valueDisabledTextColor", "getValueDisabledTextColor", "valueErrorTextColor", "getValueErrorTextColor", "placeholderBaseTextColor", "getPlaceholderBaseTextColor", "placeholderFocusedTextColor", "getPlaceholderFocusedTextColor", "placeholderDisabledTextColor", "getPlaceholderDisabledTextColor", "placeholderErrorTextColor", "getPlaceholderErrorTextColor", "labelBaseTextColor", "getLabelBaseTextColor", "labelFocusedTextColor", "getLabelFocusedTextColor", "labelDisabledTextColor", "getLabelDisabledTextColor", "labelErrorTextColor", "getLabelErrorTextColor", "errorBaseTextColor", "getErrorBaseTextColor", "errorFocusedTextColor", "getErrorFocusedTextColor", "errorDisabledTextColor", "getErrorDisabledTextColor", "errorErrorTextColor", "getErrorErrorTextColor", "baseMaskToggleColor", "getBaseMaskToggleColor", "focusedMaskToggleColor", "getFocusedMaskToggleColor", "disabledMaskToggleColor", "getDisabledMaskToggleColor", "textBasedStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTextBasedStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "headerCancelButtonColor", "getHeaderCancelButtonColor", "labelTextBasedStyle", "getLabelTextBasedStyle", "placeholderTextBasedStyle", "getPlaceholderTextBasedStyle", "errorTextStyle", "getErrorTextStyle", "focusedTextBasedStyle", "getFocusedTextBasedStyle", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final class InputTextBasedComponentStyle implements Parcelable, InputSelectBoxComponentStyle {

    @NotNull
    public static final Parcelable.Creator<InputTextBasedComponentStyle> CREATOR = new Creator();

    @Nullable
    private final AttributeStyles.InputTextBackgroundColorStyle backgroundColor;

    @Nullable
    private final AttributeStyles.InputTextBorderColorStyle borderColor;

    @Nullable
    private final AttributeStyles.InputTextBorderRadiusStyle borderRadius;

    @Nullable
    private final AttributeStyles.InputTextBorderWidthStyle borderWidth;

    @Nullable
    private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;

    @Nullable
    private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;

    @Nullable
    private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;

    @Nullable
    private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;

    @Nullable
    private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;

    @Nullable
    private final AttributeStyles.InputMarginStyle margin;

    @Nullable
    private final AttributeStyles.InputTextStrokeColorStyle strokeColor;

    @Nullable
    private final AttributeStyles.ComplexTextBasedTextColorStyle textColor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InputTextBasedComponentStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputTextBasedComponentStyle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputTextBasedComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.InputTextStrokeColorStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputTextBasedComponentStyle[] newArray(int i10) {
            return new InputTextBasedComponentStyle[i10];
        }
    }

    public InputTextBasedComponentStyle(@Nullable AttributeStyles.InputMarginStyle inputMarginStyle, @Nullable AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, @Nullable AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, @Nullable AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, @Nullable AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, @Nullable AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, @Nullable AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle, @Nullable AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle, @Nullable AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle, @Nullable AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle, @Nullable AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle, @Nullable AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle) {
        this.margin = inputMarginStyle;
        this.fontFamily = complexTextBasedFontFamilyStyle;
        this.fontSize = complexTextBasedFontSizeStyle;
        this.fontWeight = complexTextBasedFontWeightStyle;
        this.letterSpacing = complexTextBasedLetterSpacingStyle;
        this.lineHeight = complexTextBasedLineHeightStyle;
        this.textColor = complexTextBasedTextColorStyle;
        this.borderRadius = inputTextBorderRadiusStyle;
        this.borderWidth = inputTextBorderWidthStyle;
        this.backgroundColor = inputTextBackgroundColorStyle;
        this.borderColor = inputTextBorderColorStyle;
        this.strokeColor = inputTextStrokeColorStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final Integer getActiveOptionBackgroundColorValue() {
        StyleElements.ComplexElementColor option;
        StyleElements.ComplexElementColor option2;
        Integer active;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        if (inputTextBackgroundColorStyle != null && (option2 = inputTextBackgroundColorStyle.getOption()) != null && (active = option2.getActive()) != null) {
            return active;
        }
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle2 = this.backgroundColor;
        if (inputTextBackgroundColorStyle2 == null || (option = inputTextBackgroundColorStyle2.getOption()) == null) {
            return null;
        }
        return option.getBase();
    }

    @Nullable
    public final AttributeStyles.InputTextBackgroundColorStyle getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    @Nullable
    public Integer getBaseBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        if (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    @Nullable
    public Integer getBaseBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Nullable
    public final String getBaseFontFamilyValue() {
        StyleElements.FontName base;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (base = complexTextBasedFontFamilyStyle.getBase()) == null) {
            return null;
        }
        return base.getFontName();
    }

    @Nullable
    public final Double getBaseLetterSpacingValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        if (complexTextBasedLetterSpacingStyle == null || (base = complexTextBasedLetterSpacingStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Nullable
    public final Integer getBaseMaskToggleColor() {
        StyleElements.ComplexElementColor maskToggle;
        AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
        if (inputTextStrokeColorStyle == null || (maskToggle = inputTextStrokeColorStyle.getMaskToggle()) == null) {
            return null;
        }
        return maskToggle.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    @Nullable
    public Integer getBaseTextColor() {
        StyleElements.ComplexElementColor value;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null) {
            return null;
        }
        return value.getBase();
    }

    @Nullable
    public final AttributeStyles.InputTextBorderColorStyle getBorderColor() {
        return this.borderColor;
    }

    @Nullable
    public final AttributeStyles.InputTextBorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Nullable
    public final Double getBorderRadiusValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = this.borderRadius;
        if (inputTextBorderRadiusStyle == null || (base = inputTextBorderRadiusStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Nullable
    public final AttributeStyles.InputTextBorderWidthStyle getBorderWidth() {
        return this.borderWidth;
    }

    @Nullable
    public final Double getBorderWidthValue() {
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        StyleElements.Size top;
        AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = this.borderWidth;
        if (inputTextBorderWidthStyle == null || (base = inputTextBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (top = base2.getTop()) == null) {
            return null;
        }
        return top.getDp();
    }

    @Nullable
    public final Integer getDisabledBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        return (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBackgroundColorValue() : disabled;
    }

    @Nullable
    public final Integer getDisabledBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getDisabled();
    }

    @Nullable
    public final Integer getDisabledMaskToggleColor() {
        StyleElements.ComplexElementColor maskToggle;
        AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
        if (inputTextStrokeColorStyle == null || (maskToggle = inputTextStrokeColorStyle.getMaskToggle()) == null) {
            return null;
        }
        return maskToggle.getDisabled();
    }

    @Nullable
    public final Integer getErrorBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer errored;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        return (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null || (errored = base.getErrored()) == null) ? getBaseBackgroundColorValue() : errored;
    }

    @Nullable
    public final Integer getErrorBaseTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getBase();
    }

    @Nullable
    public final Integer getErrorBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getErrored();
    }

    @Nullable
    public final Integer getErrorDisabledTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getDisabled();
    }

    @Nullable
    public final Integer getErrorErrorTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getErrored();
    }

    @Nullable
    public final Integer getErrorFocusedTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getFocused();
    }

    @Nullable
    public final String getErrorFontFamilyValue() {
        StyleElements.FontName error;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (error = complexTextBasedFontFamilyStyle.getError()) == null) {
            return null;
        }
        return error.getFontName();
    }

    @Nullable
    public final Double getErrorFontSizeValue() {
        StyleElements.Measurement error;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null || (error = complexTextBasedFontSizeStyle.getError()) == null || (base = error.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    @Nullable
    public final StyleElements.FontWeight getErrorFontWeightValue() {
        StyleElements.FontWeightContainer error;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null || (error = complexTextBasedFontWeightStyle.getError()) == null) {
            return null;
        }
        return error.getBase();
    }

    @Nullable
    public final Double getErrorLetterSpacingValue() {
        StyleElements.Measurement error;
        StyleElements.Size base;
        Double dp2;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        return (complexTextBasedLetterSpacingStyle == null || (error = complexTextBasedLetterSpacingStyle.getError()) == null || (base = error.getBase()) == null || (dp2 = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp2;
    }

    @Nullable
    public final Double getErrorLineHeightValue() {
        StyleElements.Measurement error;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null || (error = complexTextBasedLineHeightStyle.getError()) == null || (base = error.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    @NotNull
    public TextBasedComponentStyle getErrorTextStyle() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        Integer base = null;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getError() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getError() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getError() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getError() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getError() : null);
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle != null && (error = complexTextBasedTextColorStyle.getError()) != null) {
            base = error.getBase();
        }
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    @Nullable
    public Integer getFocusedBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer focused;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        return (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null || (focused = base.getFocused()) == null) ? getBaseBackgroundColorValue() : focused;
    }

    @Nullable
    public final Integer getFocusedBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getFocused();
    }

    @Nullable
    public final Integer getFocusedMaskToggleColor() {
        StyleElements.ComplexElementColor maskToggle;
        AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
        if (inputTextStrokeColorStyle == null || (maskToggle = inputTextStrokeColorStyle.getMaskToggle()) == null) {
            return null;
        }
        return maskToggle.getFocused();
    }

    @NotNull
    public final TextBasedComponentStyle getFocusedTextBasedStyle() {
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getValue() : null), new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(getValueFocusedTextColor()))), null);
    }

    @Nullable
    public final AttributeStyles.ComplexTextBasedFontFamilyStyle getFontFamily() {
        return this.fontFamily;
    }

    @Nullable
    public final AttributeStyles.ComplexTextBasedFontSizeStyle getFontSize() {
        return this.fontSize;
    }

    @Nullable
    public final AttributeStyles.ComplexTextBasedFontWeightStyle getFontWeight() {
        return this.fontWeight;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    @Nullable
    public Integer getHeaderCancelButtonColor() {
        return getBaseTextColor();
    }

    @Nullable
    public final StyleElements.SizeSet getInputTextBoxMargins() {
        StyleElements.MeasurementSet base;
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        if (inputMarginStyle == null || (base = inputMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Nullable
    public final Integer getLabelBaseTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getBase();
    }

    @Nullable
    public final Integer getLabelDisabledTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getDisabled();
    }

    @Nullable
    public final Integer getLabelErrorTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getErrored();
    }

    @Nullable
    public final Integer getLabelFocusedTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getFocused();
    }

    @Nullable
    public final String getLabelFontFamilyValue() {
        StyleElements.FontName label;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (label = complexTextBasedFontFamilyStyle.getLabel()) == null) {
            return null;
        }
        return label.getFontName();
    }

    @Nullable
    public final Double getLabelFontSizeValue() {
        StyleElements.Measurement label;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null || (label = complexTextBasedFontSizeStyle.getLabel()) == null || (base = label.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    @Nullable
    public final StyleElements.FontWeight getLabelFontWeightValue() {
        StyleElements.FontWeightContainer label;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null || (label = complexTextBasedFontWeightStyle.getLabel()) == null) {
            return null;
        }
        return label.getBase();
    }

    @Nullable
    public final Double getLabelLetterSpacingValue() {
        StyleElements.Measurement label;
        StyleElements.Size base;
        Double dp2;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        return (complexTextBasedLetterSpacingStyle == null || (label = complexTextBasedLetterSpacingStyle.getLabel()) == null || (base = label.getBase()) == null || (dp2 = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp2;
    }

    @Nullable
    public final Double getLabelLineHeightValue() {
        StyleElements.Measurement label;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null || (label = complexTextBasedLineHeightStyle.getLabel()) == null || (base = label.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    @NotNull
    public final TextBasedComponentStyle getLabelTextBasedStyle() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        Integer base = null;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle != null && (label = complexTextBasedTextColorStyle.getLabel()) != null) {
            base = label.getBase();
        }
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    @Nullable
    public final AttributeStyles.ComplexTextBasedLetterSpacingStyle getLetterSpacing() {
        return this.letterSpacing;
    }

    @Nullable
    public final AttributeStyles.ComplexTextBasedLineHeightStyle getLineHeight() {
        return this.lineHeight;
    }

    @Nullable
    public final AttributeStyles.InputMarginStyle getMargin() {
        return this.margin;
    }

    @Nullable
    public final Integer getPlaceholderBaseTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getBase();
    }

    @Nullable
    public final Integer getPlaceholderDisabledTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getDisabled();
    }

    @Nullable
    public final Integer getPlaceholderErrorTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getErrored();
    }

    @Nullable
    public final Integer getPlaceholderFocusedTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getFocused();
    }

    @Nullable
    public final String getPlaceholderFontFamilyValue() {
        StyleElements.FontName placeholder;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (placeholder = complexTextBasedFontFamilyStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getFontName();
    }

    @Nullable
    public final Double getPlaceholderFontSizeValue() {
        StyleElements.Measurement placeholder;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null || (placeholder = complexTextBasedFontSizeStyle.getPlaceholder()) == null || (base = placeholder.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    @Nullable
    public final StyleElements.FontWeight getPlaceholderFontWeightValue() {
        StyleElements.FontWeightContainer placeholder;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null || (placeholder = complexTextBasedFontWeightStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getBase();
    }

    @Nullable
    public final Double getPlaceholderLetterSpacingValue() {
        StyleElements.Measurement placeholder;
        StyleElements.Size base;
        Double dp2;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        return (complexTextBasedLetterSpacingStyle == null || (placeholder = complexTextBasedLetterSpacingStyle.getPlaceholder()) == null || (base = placeholder.getBase()) == null || (dp2 = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp2;
    }

    @Nullable
    public final Double getPlaceholderLineHeightValue() {
        StyleElements.Measurement placeholder;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null || (placeholder = complexTextBasedLineHeightStyle.getPlaceholder()) == null || (base = placeholder.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    @NotNull
    public final TextBasedComponentStyle getPlaceholderTextBasedStyle() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        Integer base = null;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle != null && (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) != null) {
            base = placeholder.getBase();
        }
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    @Nullable
    public final AttributeStyles.InputTextStrokeColorStyle getStrokeColor() {
        return this.strokeColor;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    @NotNull
    public TextBasedComponentStyle getTextBasedStyle() {
        StyleElements.ComplexElementColor value;
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = new AttributeStyles.TextBasedMarginStyle(inputMarginStyle != null ? inputMarginStyle.getOption() : null);
        Integer base = null;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getBase() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getBase() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle != null && (value = complexTextBasedTextColorStyle.getValue()) != null) {
            base = value.getBase();
        }
        return new TextBasedComponentStyle(textBasedMarginStyle, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    @Nullable
    public final AttributeStyles.ComplexTextBasedTextColorStyle getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final Integer getValueDisabledTextColor() {
        StyleElements.ComplexElementColor value;
        Integer disabled;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        return (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null || (disabled = value.getDisabled()) == null) ? getBaseTextColor() : disabled;
    }

    @Nullable
    public final Integer getValueErrorTextColor() {
        StyleElements.ComplexElementColor value;
        Integer errored;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        return (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null || (errored = value.getErrored()) == null) ? getBaseTextColor() : errored;
    }

    @Nullable
    public final Integer getValueFocusedTextColor() {
        StyleElements.ComplexElementColor value;
        Integer focused;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        return (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null || (focused = value.getFocused()) == null) ? getBaseTextColor() : focused;
    }

    @Nullable
    public final String getValueFontFamilyValue() {
        StyleElements.FontName value;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (value = complexTextBasedFontFamilyStyle.getValue()) == null) {
            return null;
        }
        return value.getFontName();
    }

    @Nullable
    public final Double getValueFontSizeValue() {
        StyleElements.Measurement value;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null || (value = complexTextBasedFontSizeStyle.getValue()) == null || (base = value.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    @Nullable
    public final StyleElements.FontWeight getValueFontWeightValue() {
        StyleElements.FontWeightContainer value;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null || (value = complexTextBasedFontWeightStyle.getValue()) == null) {
            return null;
        }
        return value.getBase();
    }

    @Nullable
    public final Double getValueLetterSpacingValue() {
        StyleElements.Measurement value;
        StyleElements.Size base;
        Double dp2;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        return (complexTextBasedLetterSpacingStyle == null || (value = complexTextBasedLetterSpacingStyle.getValue()) == null || (base = value.getBase()) == null || (dp2 = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp2;
    }

    @Nullable
    public final Double getValueLineHeightValue() {
        StyleElements.Measurement value;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null || (value = complexTextBasedLineHeightStyle.getValue()) == null || (base = value.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        if (inputMarginStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputMarginStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            complexTextBasedFontFamilyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            complexTextBasedFontSizeStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            complexTextBasedFontWeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        if (complexTextBasedLetterSpacingStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            complexTextBasedLetterSpacingStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            complexTextBasedLineHeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            complexTextBasedTextColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = this.borderRadius;
        if (inputTextBorderRadiusStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputTextBorderRadiusStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = this.borderWidth;
        if (inputTextBorderWidthStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputTextBorderWidthStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        if (inputTextBackgroundColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputTextBackgroundColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputTextBorderColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
        if (inputTextStrokeColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputTextStrokeColorStyle.writeToParcel(dest, flags);
        }
    }
}
