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
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0007\u0010\u0083\u0001\u001a\u00020JJ\u001b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020JR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0014\u0010?\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010<R\u0013\u0010A\u001a\u0004\u0018\u00010B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010E\u001a\u0004\u0018\u00010B8F¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0013\u0010G\u001a\u0004\u0018\u00010B8F¢\u0006\u0006\u001a\u0004\bH\u0010DR\u0013\u0010I\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0016\u0010M\u001a\u0004\u0018\u00010J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010LR\u0016\u0010O\u001a\u0004\u0018\u00010J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010LR\u0013\u0010Q\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bR\u0010LR\u0013\u0010S\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bT\u0010LR\u0013\u0010U\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bV\u0010LR\u0016\u0010W\u001a\u0004\u0018\u00010J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010LR\u0016\u0010Y\u001a\u0004\u0018\u00010J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010LR\u0013\u0010[\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\b\\\u0010LR\u0013\u0010]\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\b^\u0010LR\u0013\u0010_\u001a\u0004\u0018\u00010`8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0016\u0010c\u001a\u0004\u0018\u00010J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010LR\u0013\u0010e\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bf\u0010LR\u0013\u0010g\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bh\u0010LR\u0013\u0010i\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bj\u0010LR\u0013\u0010k\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bl\u0010LR\u0013\u0010m\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bn\u0010LR\u0013\u0010o\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bp\u0010LR\u0013\u0010q\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\br\u0010LR\u0013\u0010s\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bt\u0010LR\u0013\u0010u\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bv\u0010LR\u0013\u0010w\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bx\u0010LR\u0013\u0010y\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bz\u0010LR\u0013\u0010{\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\b|\u0010LR\u0013\u0010}\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\b~\u0010LR\u0014\u0010\u007f\u001a\u0004\u0018\u00010J8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010LR\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010J8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010L¨\u0006\u0089\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontFamilyStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontWeightStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLetterSpacingStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLineHeightStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextColorStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderRadiusStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderWidthStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBackgroundColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderColorStyle;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectStrokeColorStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectStrokeColorStyle;)V", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontFamilyStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontWeightStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLetterSpacingStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLineHeightStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextColorStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderRadiusStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderWidthStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBackgroundColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderColorStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectStrokeColorStyle;", "textBasedStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTextBasedStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "labelStyle", "getLabelStyle", "errorTextStyle", "getErrorTextStyle", "topBorderWidthValue", "", "getTopBorderWidthValue", "()Ljava/lang/Double;", "bottomBorderWidthValue", "getBottomBorderWidthValue", "borderRadiusValue", "getBorderRadiusValue", "chevronColor", "", "getChevronColor", "()Ljava/lang/Integer;", "headerCancelButtonColor", "getHeaderCancelButtonColor", "baseBorderColorValue", "getBaseBorderColorValue", "focusedBorderColorValue", "getFocusedBorderColorValue", "disabledBorderColorValue", "getDisabledBorderColorValue", "errorBorderColorValue", "getErrorBorderColorValue", "baseBackgroundColorValue", "getBaseBackgroundColorValue", "focusedBackgroundColorValue", "getFocusedBackgroundColorValue", "disabledBackgroundColorValue", "getDisabledBackgroundColorValue", "errorBackgroundColorValue", "getErrorBackgroundColorValue", "inputSelectBoxMargins", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getInputSelectBoxMargins", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "baseTextColor", "getBaseTextColor", "valueFocusedTextColor", "getValueFocusedTextColor", "valueDisabledTextColor", "getValueDisabledTextColor", "valueErrorTextColor", "getValueErrorTextColor", "labelBaseTextColor", "getLabelBaseTextColor", "labelFocusedTextColor", "getLabelFocusedTextColor", "labelDisabledTextColor", "getLabelDisabledTextColor", "labelErrorTextColor", "getLabelErrorTextColor", "placeholderBaseTextColor", "getPlaceholderBaseTextColor", "placeholderFocusedTextColor", "getPlaceholderFocusedTextColor", "placeholderDisabledTextColor", "getPlaceholderDisabledTextColor", "placeholderErrorTextColor", "getPlaceholderErrorTextColor", "errorBaseTextColor", "getErrorBaseTextColor", "errorFocusedTextColor", "getErrorFocusedTextColor", "errorDisabledTextColor", "getErrorDisabledTextColor", "errorErrorTextColor", "getErrorErrorTextColor", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final class InputSelectComponentStyle implements Parcelable, InputSelectBoxComponentStyle {

    @NotNull
    public static final Parcelable.Creator<InputSelectComponentStyle> CREATOR = new Creator();

    @Nullable
    private final AttributeStyles.InputSelectBackgroundColorStyle backgroundColor;

    @Nullable
    private final AttributeStyles.InputSelectBorderColorStyle borderColor;

    @Nullable
    private final AttributeStyles.InputSelectBorderRadiusStyle borderRadius;

    @Nullable
    private final AttributeStyles.InputSelectBorderWidthStyle borderWidth;

    @Nullable
    private final AttributeStyles.InputSelectTextFontFamilyStyle fontFamily;

    @Nullable
    private final AttributeStyles.InputSelectTextFontSizeStyle fontSize;

    @Nullable
    private final AttributeStyles.InputSelectTextFontWeightStyle fontWeight;

    @Nullable
    private final AttributeStyles.TextBasedJustifyStyle justify;

    @Nullable
    private final AttributeStyles.InputSelectTextLetterSpacingStyle letterSpacing;

    @Nullable
    private final AttributeStyles.InputSelectTextLineHeightStyle lineHeight;

    @Nullable
    private final AttributeStyles.InputMarginStyle margin;

    @Nullable
    private final AttributeStyles.InputSelectStrokeColorStyle strokeColor;

    @Nullable
    private final AttributeStyles.InputSelectTextColorStyle textColor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InputSelectComponentStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputSelectComponentStyle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputSelectComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.InputSelectStrokeColorStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputSelectComponentStyle[] newArray(int i10) {
            return new InputSelectComponentStyle[i10];
        }
    }

    public InputSelectComponentStyle(@Nullable AttributeStyles.InputMarginStyle inputMarginStyle, @Nullable AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle, @Nullable AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle, @Nullable AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle, @Nullable AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle, @Nullable AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle, @Nullable AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle, @Nullable AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle, @Nullable AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle, @Nullable AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle, @Nullable AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle, @Nullable AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle, @Nullable AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle) {
        this.margin = inputMarginStyle;
        this.justify = textBasedJustifyStyle;
        this.fontFamily = inputSelectTextFontFamilyStyle;
        this.fontSize = inputSelectTextFontSizeStyle;
        this.fontWeight = inputSelectTextFontWeightStyle;
        this.letterSpacing = inputSelectTextLetterSpacingStyle;
        this.lineHeight = inputSelectTextLineHeightStyle;
        this.textColor = inputSelectTextColorStyle;
        this.borderRadius = inputSelectBorderRadiusStyle;
        this.borderWidth = inputSelectBorderWidthStyle;
        this.backgroundColor = inputSelectBackgroundColorStyle;
        this.borderColor = inputSelectBorderColorStyle;
        this.strokeColor = inputSelectStrokeColorStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final AttributeStyles.InputSelectBackgroundColorStyle getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    @Nullable
    public Integer getBaseBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = this.backgroundColor;
        if (inputSelectBackgroundColorStyle == null || (base = inputSelectBackgroundColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    @Nullable
    public Integer getBaseBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
        if (inputSelectBorderColorStyle == null || (base = inputSelectBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    @Nullable
    public Integer getBaseTextColor() {
        StyleElements.ComplexElementColor value;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (value = inputSelectTextColorStyle.getValue()) == null) {
            return null;
        }
        return value.getBase();
    }

    @Nullable
    public final AttributeStyles.InputSelectBorderColorStyle getBorderColor() {
        return this.borderColor;
    }

    @Nullable
    public final AttributeStyles.InputSelectBorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Nullable
    public final Double getBorderRadiusValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle = this.borderRadius;
        if (inputSelectBorderRadiusStyle == null || (base = inputSelectBorderRadiusStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Nullable
    public final AttributeStyles.InputSelectBorderWidthStyle getBorderWidth() {
        return this.borderWidth;
    }

    @Nullable
    public final Double getBottomBorderWidthValue() {
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        StyleElements.Size bottom;
        AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = this.borderWidth;
        if (inputSelectBorderWidthStyle == null || (base = inputSelectBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (bottom = base2.getBottom()) == null) {
            return null;
        }
        return bottom.getDp();
    }

    @Nullable
    public final Integer getChevronColor() {
        StyleElements.SimpleElementColor chevron;
        StyleElements.SimpleElementColorValue base;
        AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle = this.strokeColor;
        if (inputSelectStrokeColorStyle == null || (chevron = inputSelectStrokeColorStyle.getChevron()) == null || (base = chevron.getBase()) == null) {
            return null;
        }
        return base.getValue();
    }

    @Nullable
    public final Integer getDisabledBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = this.backgroundColor;
        return (inputSelectBackgroundColorStyle == null || (base = inputSelectBackgroundColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBackgroundColorValue() : disabled;
    }

    @Nullable
    public final Integer getDisabledBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
        if (inputSelectBorderColorStyle == null || (base = inputSelectBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getDisabled();
    }

    @Nullable
    public final Integer getErrorBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer errored;
        AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = this.backgroundColor;
        return (inputSelectBackgroundColorStyle == null || (base = inputSelectBackgroundColorStyle.getBase()) == null || (errored = base.getErrored()) == null) ? getBaseBackgroundColorValue() : errored;
    }

    @Nullable
    public final Integer getErrorBaseTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (error = inputSelectTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getBase();
    }

    @Nullable
    public final Integer getErrorBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
        if (inputSelectBorderColorStyle == null || (base = inputSelectBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getErrored();
    }

    @Nullable
    public final Integer getErrorDisabledTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (error = inputSelectTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getDisabled();
    }

    @Nullable
    public final Integer getErrorErrorTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (error = inputSelectTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getErrored();
    }

    @Nullable
    public final Integer getErrorFocusedTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (error = inputSelectTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getFocused();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    @NotNull
    public TextBasedComponentStyle getErrorTextStyle() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
        Integer base = null;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputSelectTextFontFamilyStyle != null ? inputSelectTextFontFamilyStyle.getError() : null);
        AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputSelectTextFontSizeStyle != null ? inputSelectTextFontSizeStyle.getError() : null);
        AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputSelectTextFontWeightStyle != null ? inputSelectTextFontWeightStyle.getError() : null);
        AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputSelectTextLetterSpacingStyle != null ? inputSelectTextLetterSpacingStyle.getError() : null);
        AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputSelectTextLineHeightStyle != null ? inputSelectTextLineHeightStyle.getError() : null);
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle != null && (error = inputSelectTextColorStyle.getError()) != null) {
            base = error.getBase();
        }
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    @Nullable
    public Integer getFocusedBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer focused;
        AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = this.backgroundColor;
        return (inputSelectBackgroundColorStyle == null || (base = inputSelectBackgroundColorStyle.getBase()) == null || (focused = base.getFocused()) == null) ? getBaseBackgroundColorValue() : focused;
    }

    @Nullable
    public final Integer getFocusedBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
        if (inputSelectBorderColorStyle == null || (base = inputSelectBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getFocused();
    }

    @Nullable
    public final AttributeStyles.InputSelectTextFontFamilyStyle getFontFamily() {
        return this.fontFamily;
    }

    @Nullable
    public final AttributeStyles.InputSelectTextFontSizeStyle getFontSize() {
        return this.fontSize;
    }

    @Nullable
    public final AttributeStyles.InputSelectTextFontWeightStyle getFontWeight() {
        return this.fontWeight;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    @Nullable
    public Integer getHeaderCancelButtonColor() {
        StyleElements.SimpleElementColor headerCancelButton;
        StyleElements.SimpleElementColorValue base;
        AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle = this.strokeColor;
        if (inputSelectStrokeColorStyle == null || (headerCancelButton = inputSelectStrokeColorStyle.getHeaderCancelButton()) == null || (base = headerCancelButton.getBase()) == null) {
            return null;
        }
        return base.getValue();
    }

    @Nullable
    public final StyleElements.SizeSet getInputSelectBoxMargins() {
        StyleElements.MeasurementSet base;
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        if (inputMarginStyle == null || (base = inputMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Nullable
    public final AttributeStyles.TextBasedJustifyStyle getJustify() {
        return this.justify;
    }

    @Nullable
    public final Integer getLabelBaseTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (label = inputSelectTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getBase();
    }

    @Nullable
    public final Integer getLabelDisabledTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (label = inputSelectTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getDisabled();
    }

    @Nullable
    public final Integer getLabelErrorTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (label = inputSelectTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getErrored();
    }

    @Nullable
    public final Integer getLabelFocusedTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (label = inputSelectTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getFocused();
    }

    @NotNull
    public final TextBasedComponentStyle getLabelStyle() {
        StyleElements.FontName base;
        StyleElements.Measurement base2;
        StyleElements.ComplexElementColor label;
        AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
        Integer base3 = null;
        if (inputSelectTextFontFamilyStyle == null || (base = inputSelectTextFontFamilyStyle.getLabel()) == null) {
            AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle2 = this.fontFamily;
            base = inputSelectTextFontFamilyStyle2 != null ? inputSelectTextFontFamilyStyle2.getBase() : null;
        }
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(base);
        AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputSelectTextFontSizeStyle != null ? inputSelectTextFontSizeStyle.getLabel() : null);
        AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputSelectTextFontWeightStyle != null ? inputSelectTextFontWeightStyle.getLabel() : null);
        AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
        if (inputSelectTextLetterSpacingStyle == null || (base2 = inputSelectTextLetterSpacingStyle.getLabel()) == null) {
            AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle2 = this.letterSpacing;
            base2 = inputSelectTextLetterSpacingStyle2 != null ? inputSelectTextLetterSpacingStyle2.getBase() : null;
        }
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(base2);
        AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputSelectTextLineHeightStyle != null ? inputSelectTextLineHeightStyle.getLabel() : null);
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle != null && (label = inputSelectTextColorStyle.getLabel()) != null) {
            base3 = label.getBase();
        }
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base3))), null);
    }

    @Nullable
    public final AttributeStyles.InputSelectTextLetterSpacingStyle getLetterSpacing() {
        return this.letterSpacing;
    }

    @Nullable
    public final AttributeStyles.InputSelectTextLineHeightStyle getLineHeight() {
        return this.lineHeight;
    }

    @Nullable
    public final AttributeStyles.InputMarginStyle getMargin() {
        return this.margin;
    }

    @Nullable
    public final Integer getPlaceholderBaseTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (placeholder = inputSelectTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getBase();
    }

    @Nullable
    public final Integer getPlaceholderDisabledTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (placeholder = inputSelectTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getDisabled();
    }

    @Nullable
    public final Integer getPlaceholderErrorTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (placeholder = inputSelectTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getErrored();
    }

    @Nullable
    public final Integer getPlaceholderFocusedTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (placeholder = inputSelectTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getFocused();
    }

    @Nullable
    public final AttributeStyles.InputSelectStrokeColorStyle getStrokeColor() {
        return this.strokeColor;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    @NotNull
    public TextBasedComponentStyle getTextBasedStyle() {
        StyleElements.ComplexElementColor value;
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = new AttributeStyles.TextBasedMarginStyle(inputMarginStyle != null ? inputMarginStyle.getOption() : null);
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
        AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputSelectTextFontFamilyStyle != null ? inputSelectTextFontFamilyStyle.getBase() : null);
        AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputSelectTextFontSizeStyle != null ? inputSelectTextFontSizeStyle.getBase() : null);
        AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputSelectTextFontWeightStyle != null ? inputSelectTextFontWeightStyle.getBase() : null);
        AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputSelectTextLetterSpacingStyle != null ? inputSelectTextLetterSpacingStyle.getBase() : null);
        AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputSelectTextLineHeightStyle != null ? inputSelectTextLineHeightStyle.getBase() : null);
        Integer base = null;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle != null && (value = inputSelectTextColorStyle.getValue()) != null) {
            base = value.getBase();
        }
        return new TextBasedComponentStyle(textBasedMarginStyle, textBasedJustifyStyle, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    @Nullable
    public final AttributeStyles.InputSelectTextColorStyle getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final Double getTopBorderWidthValue() {
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        StyleElements.Size top;
        AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = this.borderWidth;
        if (inputSelectBorderWidthStyle == null || (base = inputSelectBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (top = base2.getTop()) == null) {
            return null;
        }
        return top.getDp();
    }

    @Nullable
    public final Integer getValueDisabledTextColor() {
        StyleElements.ComplexElementColor value;
        Integer disabled;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        return (inputSelectTextColorStyle == null || (value = inputSelectTextColorStyle.getValue()) == null || (disabled = value.getDisabled()) == null) ? getBaseTextColor() : disabled;
    }

    @Nullable
    public final Integer getValueErrorTextColor() {
        StyleElements.ComplexElementColor value;
        Integer errored;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        return (inputSelectTextColorStyle == null || (value = inputSelectTextColorStyle.getValue()) == null || (errored = value.getErrored()) == null) ? getBaseTextColor() : errored;
    }

    @Nullable
    public final Integer getValueFocusedTextColor() {
        StyleElements.ComplexElementColor value;
        Integer focused;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        return (inputSelectTextColorStyle == null || (value = inputSelectTextColorStyle.getValue()) == null || (focused = value.getFocused()) == null) ? getBaseTextColor() : focused;
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
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
        if (textBasedJustifyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedJustifyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
        if (inputSelectTextFontFamilyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectTextFontFamilyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
        if (inputSelectTextFontSizeStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectTextFontSizeStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
        if (inputSelectTextFontWeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectTextFontWeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
        if (inputSelectTextLetterSpacingStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectTextLetterSpacingStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
        if (inputSelectTextLineHeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectTextLineHeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectTextColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle = this.borderRadius;
        if (inputSelectBorderRadiusStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectBorderRadiusStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = this.borderWidth;
        if (inputSelectBorderWidthStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectBorderWidthStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = this.backgroundColor;
        if (inputSelectBackgroundColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectBackgroundColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
        if (inputSelectBorderColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectBorderColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle = this.strokeColor;
        if (inputSelectStrokeColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectStrokeColorStyle.writeToParcel(dest, flags);
        }
    }
}
