package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010.\u001a\u00020\u001dJ\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010 \u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0013\u0010\"\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0013\u0010$\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010(\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010,\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\b-\u0010+¨\u00064"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "Landroid/os/Parcelable;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageStrokeColorStyle;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageFillColorStyle;", "height", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageHeightStyle;", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageWidthStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageJustifyStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageMarginStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageStrokeColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageFillColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageMarginStyle;)V", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageStrokeColorStyle;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageFillColorStyle;", "getHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageHeightStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageWidthStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageJustifyStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageMarginStyle;", "strokeColorValue", "", "getStrokeColorValue", "()Ljava/lang/Integer;", "fillColorValue", "getFillColorValue", "backgroundColorValue", "getBackgroundColorValue", "marginValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getMarginValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "widthValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "getWidthValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "heightValue", "getHeightValue", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final class LocalImageComponentStyle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LocalImageComponentStyle> CREATOR = new Creator();

    @Nullable
    private final AttributeStyles.LocalImageFillColorStyle fillColor;

    @Nullable
    private final AttributeStyles.LocalImageHeightStyle height;

    @Nullable
    private final AttributeStyles.LocalImageJustifyStyle justify;

    @Nullable
    private final AttributeStyles.LocalImageMarginStyle margin;

    @Nullable
    private final AttributeStyles.LocalImageStrokeColorStyle strokeColor;

    @Nullable
    private final AttributeStyles.LocalImageWidthStyle width;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalImageComponentStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalImageComponentStyle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocalImageComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.LocalImageStrokeColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.LocalImageFillColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.LocalImageHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.LocalImageWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.LocalImageJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.LocalImageMarginStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalImageComponentStyle[] newArray(int i10) {
            return new LocalImageComponentStyle[i10];
        }
    }

    public LocalImageComponentStyle() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final Integer getBackgroundColorValue() {
        StyleElements.SimpleElementColor background;
        StyleElements.SimpleElementColorValue base;
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle = this.fillColor;
        if (localImageFillColorStyle == null || (background = localImageFillColorStyle.getBackground()) == null || (base = background.getBase()) == null) {
            return null;
        }
        return base.getValue();
    }

    @Nullable
    public final AttributeStyles.LocalImageFillColorStyle getFillColor() {
        return this.fillColor;
    }

    @Nullable
    public final Integer getFillColorValue() {
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle = this.fillColor;
        if (localImageFillColorStyle == null || (base = localImageFillColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    @Nullable
    public final AttributeStyles.LocalImageHeightStyle getHeight() {
        return this.height;
    }

    @Nullable
    public final StyleElements.Size getHeightValue() {
        StyleElements.Measurement base;
        AttributeStyles.LocalImageHeightStyle localImageHeightStyle = this.height;
        if (localImageHeightStyle == null || (base = localImageHeightStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Nullable
    public final AttributeStyles.LocalImageJustifyStyle getJustify() {
        return this.justify;
    }

    @Nullable
    public final AttributeStyles.LocalImageMarginStyle getMargin() {
        return this.margin;
    }

    @Nullable
    public final StyleElements.SizeSet getMarginValue() {
        StyleElements.MeasurementSet base;
        AttributeStyles.LocalImageMarginStyle localImageMarginStyle = this.margin;
        if (localImageMarginStyle == null || (base = localImageMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Nullable
    public final AttributeStyles.LocalImageStrokeColorStyle getStrokeColor() {
        return this.strokeColor;
    }

    @Nullable
    public final Integer getStrokeColorValue() {
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle = this.strokeColor;
        if (localImageStrokeColorStyle == null || (base = localImageStrokeColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    @Nullable
    public final AttributeStyles.LocalImageWidthStyle getWidth() {
        return this.width;
    }

    @Nullable
    public final StyleElements.Size getWidthValue() {
        StyleElements.Measurement base;
        AttributeStyles.LocalImageWidthStyle localImageWidthStyle = this.width;
        if (localImageWidthStyle == null || (base = localImageWidthStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle = this.strokeColor;
        if (localImageStrokeColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            localImageStrokeColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle = this.fillColor;
        if (localImageFillColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            localImageFillColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.LocalImageHeightStyle localImageHeightStyle = this.height;
        if (localImageHeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            localImageHeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.LocalImageWidthStyle localImageWidthStyle = this.width;
        if (localImageWidthStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            localImageWidthStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle = this.justify;
        if (localImageJustifyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            localImageJustifyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.LocalImageMarginStyle localImageMarginStyle = this.margin;
        if (localImageMarginStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            localImageMarginStyle.writeToParcel(dest, flags);
        }
    }

    public LocalImageComponentStyle(@Nullable AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle, @Nullable AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle, @Nullable AttributeStyles.LocalImageHeightStyle localImageHeightStyle, @Nullable AttributeStyles.LocalImageWidthStyle localImageWidthStyle, @Nullable AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle, @Nullable AttributeStyles.LocalImageMarginStyle localImageMarginStyle) {
        this.strokeColor = localImageStrokeColorStyle;
        this.fillColor = localImageFillColorStyle;
        this.height = localImageHeightStyle;
        this.width = localImageWidthStyle;
        this.justify = localImageJustifyStyle;
        this.margin = localImageMarginStyle;
    }

    public /* synthetic */ LocalImageComponentStyle(AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle, AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle, AttributeStyles.LocalImageHeightStyle localImageHeightStyle, AttributeStyles.LocalImageWidthStyle localImageWidthStyle, AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle, AttributeStyles.LocalImageMarginStyle localImageMarginStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : localImageStrokeColorStyle, (i10 & 2) != 0 ? null : localImageFillColorStyle, (i10 & 4) != 0 ? null : localImageHeightStyle, (i10 & 8) != 0 ? null : localImageWidthStyle, (i10 & 16) != 0 ? null : localImageJustifyStyle, (i10 & 32) != 0 ? null : localImageMarginStyle);
    }
}
