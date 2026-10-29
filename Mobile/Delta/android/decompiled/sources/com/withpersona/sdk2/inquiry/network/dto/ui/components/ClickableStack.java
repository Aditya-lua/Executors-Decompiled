package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001c\u001d\u001eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentContainerConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "children", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "getChildren", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ClickableStackComponentStyle", "Attributes", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final class ClickableStack implements UiComponentContainerConfig {

    @NotNull
    public static final String TYPE = "clickable_stack";

    @Nullable
    private final Attributes attributes;

    @NotNull
    private final String name;

    @Nullable
    private final ClickableStackComponentStyle styles;

    @NotNull
    public static final Parcelable.Creator<ClickableStack> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010b\u001a\u000205J\u0016\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u000205R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u00104\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u00108\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b9\u00107R\u0013\u0010:\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b;\u00107R\u0013\u0010<\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0013\u0010@\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\bA\u00107R\u0013\u0010B\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\bC\u00107R\u0013\u0010D\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\bE\u00107R\u0013\u0010F\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010J\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\bK\u0010?R\u0013\u0010L\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\bM\u0010?R\u0013\u0010N\u001a\u0004\u0018\u00010O8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010R\u001a\u00020S8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0013\u0010V\u001a\u0004\u0018\u00010W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0013\u0010Z\u001a\u0004\u0018\u00010W8F¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0013\u0010\\\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\b]\u0010IR\u0013\u0010^\u001a\u0004\u0018\u00010_8F¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006h"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "Landroid/os/Parcelable;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBackgroundColorStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderWidthStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderColorStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderRadiusStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackPaddingStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackMarginStyle;", "axis", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAxisStyle;", "childSizes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackChildSizesStyle;", "alignment", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAlignmentStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$StackJustifyStyle;", "gap", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackGapStyle;", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackWidthStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAxisStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackChildSizesStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAlignmentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$StackJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackGapStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackWidthStyle;)V", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBackgroundColorStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderWidthStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderColorStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderRadiusStyle;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackPaddingStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackMarginStyle;", "getAxis", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAxisStyle;", "getChildSizes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackChildSizesStyle;", "getAlignment", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAlignmentStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$StackJustifyStyle;", "getGap", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackGapStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackWidthStyle;", "baseBackgroundColorValue", "", "getBaseBackgroundColorValue", "()Ljava/lang/Integer;", "activeBackgroundColorValue", "getActiveBackgroundColorValue", "disabledBackgroundColorValue", "getDisabledBackgroundColorValue", "borderWidthValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getBorderWidthValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "baseBorderColorValue", "getBaseBorderColorValue", "activeBorderColorValue", "getActiveBorderColorValue", "disabledBorderColorValue", "getDisabledBorderColorValue", "borderRadiusValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "getBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "paddingValue", "getPaddingValue", "marginValue", "getMarginValue", "childSizesValue", "", "getChildSizesValue", "()[I", "axisValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "getAxisValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "alignmentValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getAlignmentValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "justifyValue", "getJustifyValue", "gapValue", "getGapValue", "widthValue", "", "getWidthValue", "()Ljava/lang/Double;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class ClickableStackComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ClickableStackComponentStyle> CREATOR = new Creator();

        @Nullable
        private final AttributeStyles.ClickableStackAlignmentStyle alignment;

        @Nullable
        private final AttributeStyles.ClickableStackAxisStyle axis;

        @Nullable
        private final AttributeStyles.ClickableStackBackgroundColorStyle backgroundColor;

        @Nullable
        private final AttributeStyles.ClickableStackBorderColorStyle borderColor;

        @Nullable
        private final AttributeStyles.ClickableStackBorderRadiusStyle borderRadius;

        @Nullable
        private final AttributeStyles.ClickableStackBorderWidthStyle borderWidth;

        @Nullable
        private final AttributeStyles.ClickableStackChildSizesStyle childSizes;

        @Nullable
        private final AttributeStyles.ClickableStackGapStyle gap;

        @Nullable
        private final AttributeStyles.StackJustifyStyle justify;

        @Nullable
        private final AttributeStyles.ClickableStackMarginStyle margin;

        @Nullable
        private final AttributeStyles.ClickableStackPaddingStyle padding;

        @Nullable
        private final AttributeStyles.ClickableStackWidthStyle width;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClickableStackComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClickableStackComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackAxisStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackChildSizesStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackAlignmentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.StackJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackGapStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.ClickableStackWidthStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackComponentStyle[] newArray(int i10) {
                return new ClickableStackComponentStyle[i10];
            }
        }

        public ClickableStackComponentStyle(@Nullable AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle, @Nullable AttributeStyles.ClickableStackBorderWidthStyle clickableStackBorderWidthStyle, @Nullable AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle, @Nullable AttributeStyles.ClickableStackBorderRadiusStyle clickableStackBorderRadiusStyle, @Nullable AttributeStyles.ClickableStackPaddingStyle clickableStackPaddingStyle, @Nullable AttributeStyles.ClickableStackMarginStyle clickableStackMarginStyle, @Nullable AttributeStyles.ClickableStackAxisStyle clickableStackAxisStyle, @Nullable AttributeStyles.ClickableStackChildSizesStyle clickableStackChildSizesStyle, @Nullable AttributeStyles.ClickableStackAlignmentStyle clickableStackAlignmentStyle, @Nullable AttributeStyles.StackJustifyStyle stackJustifyStyle, @Nullable AttributeStyles.ClickableStackGapStyle clickableStackGapStyle, @Nullable AttributeStyles.ClickableStackWidthStyle clickableStackWidthStyle) {
            this.backgroundColor = clickableStackBackgroundColorStyle;
            this.borderWidth = clickableStackBorderWidthStyle;
            this.borderColor = clickableStackBorderColorStyle;
            this.borderRadius = clickableStackBorderRadiusStyle;
            this.padding = clickableStackPaddingStyle;
            this.margin = clickableStackMarginStyle;
            this.axis = clickableStackAxisStyle;
            this.childSizes = clickableStackChildSizesStyle;
            this.alignment = clickableStackAlignmentStyle;
            this.justify = stackJustifyStyle;
            this.gap = clickableStackGapStyle;
            this.width = clickableStackWidthStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final Integer getActiveBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null || (base = clickableStackBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getActive();
        }

        @Nullable
        public final Integer getActiveBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null || (base = clickableStackBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getActive();
        }

        @Nullable
        public final AttributeStyles.ClickableStackAlignmentStyle getAlignment() {
            return this.alignment;
        }

        @Nullable
        public final StyleElements.PositionType getAlignmentValue() {
            StyleElements.Position base;
            AttributeStyles.ClickableStackAlignmentStyle clickableStackAlignmentStyle = this.alignment;
            if (clickableStackAlignmentStyle == null || (base = clickableStackAlignmentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.ClickableStackAxisStyle getAxis() {
            return this.axis;
        }

        @NotNull
        public final StyleElements.Axis getAxisValue() {
            StyleElements.AxisContainer base;
            StyleElements.Axis base2;
            AttributeStyles.ClickableStackAxisStyle clickableStackAxisStyle = this.axis;
            return (clickableStackAxisStyle == null || (base = clickableStackAxisStyle.getBase()) == null || (base2 = base.getBase()) == null) ? StyleElements.Axis.HORIZONTAL : base2;
        }

        @Nullable
        public final AttributeStyles.ClickableStackBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Nullable
        public final Integer getBaseBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null || (base = clickableStackBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final Integer getBaseBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null || (base = clickableStackBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.ClickableStackBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        @Nullable
        public final AttributeStyles.ClickableStackBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        @Nullable
        public final StyleElements.Size getBorderRadiusValue() {
            StyleElements.Measurement base;
            AttributeStyles.ClickableStackBorderRadiusStyle clickableStackBorderRadiusStyle = this.borderRadius;
            if (clickableStackBorderRadiusStyle == null || (base = clickableStackBorderRadiusStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.ClickableStackBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        @Nullable
        public final StyleElements.SizeSet getBorderWidthValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.ClickableStackBorderWidthStyle clickableStackBorderWidthStyle = this.borderWidth;
            if (clickableStackBorderWidthStyle == null || (base = clickableStackBorderWidthStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.ClickableStackChildSizesStyle getChildSizes() {
            return this.childSizes;
        }

        @Nullable
        public final int[] getChildSizesValue() {
            StyleElements.ChildSizes base;
            AttributeStyles.ClickableStackChildSizesStyle clickableStackChildSizesStyle = this.childSizes;
            if (clickableStackChildSizesStyle == null || (base = clickableStackChildSizesStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final Integer getDisabledBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null || (base = clickableStackBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getDisabled();
        }

        @Nullable
        public final Integer getDisabledBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null || (base = clickableStackBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getDisabled();
        }

        @Nullable
        public final AttributeStyles.ClickableStackGapStyle getGap() {
            return this.gap;
        }

        @Nullable
        public final StyleElements.Size getGapValue() {
            StyleElements.Measurement base;
            AttributeStyles.ClickableStackGapStyle clickableStackGapStyle = this.gap;
            if (clickableStackGapStyle == null || (base = clickableStackGapStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.StackJustifyStyle getJustify() {
            return this.justify;
        }

        @Nullable
        public final StyleElements.PositionType getJustifyValue() {
            StyleElements.Position base;
            AttributeStyles.StackJustifyStyle stackJustifyStyle = this.justify;
            if (stackJustifyStyle == null || (base = stackJustifyStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.ClickableStackMarginStyle getMargin() {
            return this.margin;
        }

        @Nullable
        public final StyleElements.SizeSet getMarginValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.ClickableStackMarginStyle clickableStackMarginStyle = this.margin;
            if (clickableStackMarginStyle == null || (base = clickableStackMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.ClickableStackPaddingStyle getPadding() {
            return this.padding;
        }

        @Nullable
        public final StyleElements.SizeSet getPaddingValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.ClickableStackPaddingStyle clickableStackPaddingStyle = this.padding;
            if (clickableStackPaddingStyle == null || (base = clickableStackPaddingStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.ClickableStackWidthStyle getWidth() {
            return this.width;
        }

        @Nullable
        public final Double getWidthValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ClickableStackWidthStyle clickableStackWidthStyle = this.width;
            if (clickableStackWidthStyle == null || (base = clickableStackWidthStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackBackgroundColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackBorderWidthStyle clickableStackBorderWidthStyle = this.borderWidth;
            if (clickableStackBorderWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackBorderWidthStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackBorderColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackBorderRadiusStyle clickableStackBorderRadiusStyle = this.borderRadius;
            if (clickableStackBorderRadiusStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackBorderRadiusStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackPaddingStyle clickableStackPaddingStyle = this.padding;
            if (clickableStackPaddingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackPaddingStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackMarginStyle clickableStackMarginStyle = this.margin;
            if (clickableStackMarginStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackMarginStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackAxisStyle clickableStackAxisStyle = this.axis;
            if (clickableStackAxisStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackAxisStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackChildSizesStyle clickableStackChildSizesStyle = this.childSizes;
            if (clickableStackChildSizesStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackChildSizesStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackAlignmentStyle clickableStackAlignmentStyle = this.alignment;
            if (clickableStackAlignmentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackAlignmentStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.StackJustifyStyle stackJustifyStyle = this.justify;
            if (stackJustifyStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stackJustifyStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackGapStyle clickableStackGapStyle = this.gap;
            if (clickableStackGapStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackGapStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackWidthStyle clickableStackWidthStyle = this.width;
            if (clickableStackWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackWidthStyle.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ClickableStack> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClickableStack createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ClickableStack(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ClickableStackComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClickableStack[] newArray(int i10) {
            return new ClickableStack[i10];
        }
    }

    public ClickableStack(@NotNull String name, @Nullable Attributes attributes, @Nullable ClickableStackComponentStyle clickableStackComponentStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = clickableStackComponentStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentContainerConfig
    @Nullable
    public List<UiComponentConfig> getChildren() {
        Attributes attributes = getAttributes();
        if (attributes != null) {
            return attributes.getChildren();
        }
        return null;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public final ClickableStackComponentStyle getStyles() {
        return this.styles;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        Attributes attributes = this.attributes;
        if (attributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            attributes.writeToParcel(dest, flags);
        }
        ClickableStackComponentStyle clickableStackComponentStyle = this.styles;
        if (clickableStackComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            clickableStackComponentStyle.writeToParcel(dest, flags);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    @Nullable
    public Attributes getAttributes() {
        return this.attributes;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "children", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "getChildren", "()Ljava/util/List;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();

        @Nullable
        private final List<UiComponentConfig> children;

        @Nullable
        private final JsonLogicBoolean disabled;

        @Nullable
        private final JsonLogicBoolean hidden;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i10 = parcel.readInt();
                    arrayList = new ArrayList(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        arrayList.add(parcel.readParcelable(Attributes.class.getClassLoader()));
                    }
                }
                return new Attributes(arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i10) {
                return new Attributes[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Attributes(@Nullable List<? extends UiComponentConfig> list, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2) {
            this.children = list;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final List<UiComponentConfig> getChildren() {
            return this.children;
        }

        @Nullable
        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        @Nullable
        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<UiComponentConfig> list = this.children;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<UiComponentConfig> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
            JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
            if (jsonLogicBoolean2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean2.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ Attributes(List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i10 & 2) != 0 ? null : jsonLogicBoolean, (i10 & 4) != 0 ? null : jsonLogicBoolean2);
        }
    }

    public /* synthetic */ ClickableStack(String str, Attributes attributes, ClickableStackComponentStyle clickableStackComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i10 & 4) != 0 ? null : clickableStackComponentStyle);
    }
}
