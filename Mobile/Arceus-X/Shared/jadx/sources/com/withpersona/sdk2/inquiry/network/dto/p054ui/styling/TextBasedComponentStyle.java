package com.withpersona.sdk2.inquiry.network.dto.p054ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010E\u001a\u000204J\u0016\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u000204R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u0010/\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00103\u001a\u0004\u0018\u0001048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0016\u00107\u001a\u0004\u0018\u0001048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0016\u00109\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00102R\u0016\u0010;\u001a\u0004\u0018\u00010<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0016\u0010?\u001a\u0004\u0018\u00010@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0016\u0010C\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u00102¨\u0006K"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;", "Landroid/os/Parcelable;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontFamilyStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontSizeStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontWeightStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLetterSpacingStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLineHeightStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "textColorHighlight", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;)V", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontFamilyStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontSizeStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontWeightStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLetterSpacingStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLineHeightStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "getTextColorHighlight", "marginValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getMarginValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "justificationValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getJustificationValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "fontSizeValue", "", "getFontSizeValue", "()Ljava/lang/Double;", "textColorValue", "", "getTextColorValue", "()Ljava/lang/Integer;", "textColorHighlightValue", "getTextColorHighlightValue", "letterSpacingValue", "getLetterSpacingValue", "fontNameValue", "", "getFontNameValue", "()Ljava/lang/String;", "fontWeightValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "getFontWeightValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "lineHeightValue", "getLineHeightValue", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class TextBasedComponentStyle implements TextViewStyle, Parcelable {

    @NotNull
    public static final Parcelable.Creator<TextBasedComponentStyle> CREATOR = new Creator();

    @Nullable
    private final AttributeStyles.TextBasedFontFamilyStyle fontFamily;

    @Nullable
    private final AttributeStyles.TextBasedFontSizeStyle fontSize;

    @Nullable
    private final AttributeStyles.TextBasedFontWeightStyle fontWeight;

    @Nullable
    private final AttributeStyles.TextBasedJustifyStyle justify;

    @Nullable
    private final AttributeStyles.TextBasedLetterSpacingStyle letterSpacing;

    @Nullable
    private final AttributeStyles.TextBasedLineHeightStyle lineHeight;

    @Nullable
    private final AttributeStyles.TextBasedMarginStyle margin;

    @Nullable
    private final AttributeStyles.TextBasedTextColorStyle textColor;

    @Nullable
    private final AttributeStyles.TextBasedTextColorStyle textColorHighlight;

    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Creator implements Parcelable.Creator<TextBasedComponentStyle> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextBasedComponentStyle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TextBasedComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.TextBasedMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextBasedComponentStyle[] newArray(int i10) {
            return new TextBasedComponentStyle[i10];
        }
    }

    public TextBasedComponentStyle(@Nullable AttributeStyles.TextBasedMarginStyle textBasedMarginStyle, @Nullable AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle, @Nullable AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle, @Nullable AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle, @Nullable AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle, @Nullable AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle, @Nullable AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle, @Nullable AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle, @Nullable AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle2) {
        this.margin = textBasedMarginStyle;
        this.justify = textBasedJustifyStyle;
        this.fontFamily = textBasedFontFamilyStyle;
        this.fontSize = textBasedFontSizeStyle;
        this.fontWeight = textBasedFontWeightStyle;
        this.letterSpacing = textBasedLetterSpacingStyle;
        this.lineHeight = textBasedLineHeightStyle;
        this.textColor = textBasedTextColorStyle;
        this.textColorHighlight = textBasedTextColorStyle2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final AttributeStyles.TextBasedFontFamilyStyle getFontFamily() {
        return this.fontFamily;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextViewStyle
    @Nullable
    public String getFontNameValue() {
        StyleElements.FontName base;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = this.fontFamily;
        if (textBasedFontFamilyStyle == null || (base = textBasedFontFamilyStyle.getBase()) == null) {
            return null;
        }
        return base.getFontName();
    }

    @Nullable
    public final AttributeStyles.TextBasedFontSizeStyle getFontSize() {
        return this.fontSize;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextViewStyle
    @Nullable
    public Double getFontSizeValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = this.fontSize;
        if (textBasedFontSizeStyle == null || (base = textBasedFontSizeStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Nullable
    public final AttributeStyles.TextBasedFontWeightStyle getFontWeight() {
        return this.fontWeight;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextViewStyle
    @Nullable
    public StyleElements.FontWeight getFontWeightValue() {
        StyleElements.FontWeightContainer base;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = this.fontWeight;
        if (textBasedFontWeightStyle == null || (base = textBasedFontWeightStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextViewStyle
    @Nullable
    public StyleElements.PositionType getJustificationValue() {
        StyleElements.Position base;
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
        if (textBasedJustifyStyle == null || (base = textBasedJustifyStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Nullable
    public final AttributeStyles.TextBasedJustifyStyle getJustify() {
        return this.justify;
    }

    @Nullable
    public final AttributeStyles.TextBasedLetterSpacingStyle getLetterSpacing() {
        return this.letterSpacing;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextViewStyle
    @Nullable
    public Double getLetterSpacingValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = this.letterSpacing;
        if (textBasedLetterSpacingStyle == null || (base = textBasedLetterSpacingStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Nullable
    public final AttributeStyles.TextBasedLineHeightStyle getLineHeight() {
        return this.lineHeight;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextViewStyle
    @Nullable
    public Double getLineHeightValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = this.lineHeight;
        if (textBasedLineHeightStyle == null || (base = textBasedLineHeightStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Nullable
    public final AttributeStyles.TextBasedMarginStyle getMargin() {
        return this.margin;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextViewStyle
    @Nullable
    public StyleElements.SizeSet getMarginValue() {
        StyleElements.MeasurementSet base;
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = this.margin;
        if (textBasedMarginStyle == null || (base = textBasedMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Nullable
    public final AttributeStyles.TextBasedTextColorStyle getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final AttributeStyles.TextBasedTextColorStyle getTextColorHighlight() {
        return this.textColorHighlight;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextViewStyle
    @Nullable
    public Integer getTextColorHighlightValue() {
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColorHighlight;
        if (textBasedTextColorStyle == null || (base = textBasedTextColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextViewStyle
    @Nullable
    public Integer getTextColorValue() {
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColor;
        if (textBasedTextColorStyle == null || (base = textBasedTextColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = this.margin;
        if (textBasedMarginStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedMarginStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
        if (textBasedJustifyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedJustifyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = this.fontFamily;
        if (textBasedFontFamilyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedFontFamilyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = this.fontSize;
        if (textBasedFontSizeStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedFontSizeStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = this.fontWeight;
        if (textBasedFontWeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedFontWeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = this.letterSpacing;
        if (textBasedLetterSpacingStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedLetterSpacingStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = this.lineHeight;
        if (textBasedLineHeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedLineHeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColor;
        if (textBasedTextColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedTextColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle2 = this.textColorHighlight;
        if (textBasedTextColorStyle2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedTextColorStyle2.writeToParcel(dest, flags);
        }
    }
}
