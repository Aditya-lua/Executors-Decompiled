package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$InputDateComponentStyle;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$Attributes;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$InputDateComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$Attributes;)V", "getName", "()Ljava/lang/String;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$InputDateComponentStyle;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$Attributes;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "InputDateComponentStyle", "Attributes", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final class InputDate implements UiComponentConfig {

    @NotNull
    public static final String type = "input_date";

    @Nullable
    private final Attributes attributes;

    @NotNull
    private final String name;

    @Nullable
    private final InputDateComponentStyle styles;

    @NotNull
    public static final Parcelable.Creator<InputDate> CREATOR = new Creator();

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "prefill", "", "label", "placeholderMonth", "placeholderDay", "placeholderYear", "textMonths", "", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "getPrefill", "()Ljava/lang/String;", "getLabel", "getPlaceholderMonth", "getPlaceholderDay", "getPlaceholderYear", "getTextMonths", "()Ljava/util/List;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();

        @Nullable
        private final JsonLogicBoolean disabled;

        @Nullable
        private final JsonLogicBoolean hidden;

        @Nullable
        private final String label;

        @Nullable
        private final String placeholderDay;

        @Nullable
        private final String placeholderMonth;

        @Nullable
        private final String placeholderYear;

        @Nullable
        private final String prefill;

        @Nullable
        private final List<String> textMonths;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Attributes(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i10) {
                return new Attributes[i10];
            }
        }

        public Attributes() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        @Nullable
        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        @Nullable
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        public final String getPlaceholderDay() {
            return this.placeholderDay;
        }

        @Nullable
        public final String getPlaceholderMonth() {
            return this.placeholderMonth;
        }

        @Nullable
        public final String getPlaceholderYear() {
            return this.placeholderYear;
        }

        @Nullable
        public final String getPrefill() {
            return this.prefill;
        }

        @Nullable
        public final List<String> getTextMonths() {
            return this.textMonths;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.prefill);
            dest.writeString(this.label);
            dest.writeString(this.placeholderMonth);
            dest.writeString(this.placeholderDay);
            dest.writeString(this.placeholderYear);
            dest.writeStringList(this.textMonths);
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

        public Attributes(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable List<String> list, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2) {
            this.prefill = str;
            this.label = str2;
            this.placeholderMonth = str3;
            this.placeholderDay = str4;
            this.placeholderYear = str5;
            this.textMonths = list;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        public /* synthetic */ Attributes(String str, String str2, String str3, String str4, String str5, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : list, (i10 & 64) != 0 ? null : jsonLogicBoolean, (i10 & 128) != 0 ? null : jsonLogicBoolean2);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InputDate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputDate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputDate(parcel.readString(), parcel.readInt() == 0 ? null : InputDateComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Attributes.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputDate[] newArray(int i10) {
            return new InputDate[i10];
        }
    }

    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010@\u001a\u00020AJ\u0016\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020AR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u00108\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006G"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$InputDateComponentStyle;", "Landroid/os/Parcelable;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectTextColorStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderRadiusStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderWidthStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBackgroundColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderColorStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectStrokeColorStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectStrokeColorStyle;)V", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectTextColorStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderRadiusStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderWidthStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBackgroundColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderColorStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectStrokeColorStyle;", "inputTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "getInputTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "inputSelectStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "getInputSelectStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class InputDateComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputDateComponentStyle> CREATOR = new Creator();

        @Nullable
        private final AttributeStyles.DateSelectBackgroundColorStyle backgroundColor;

        @Nullable
        private final AttributeStyles.DateSelectBorderColorStyle borderColor;

        @Nullable
        private final AttributeStyles.DateSelectBorderRadiusStyle borderRadius;

        @Nullable
        private final AttributeStyles.DateSelectBorderWidthStyle borderWidth;

        @Nullable
        private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;

        @Nullable
        private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;

        @Nullable
        private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;

        @Nullable
        private final AttributeStyles.TextBasedJustifyStyle justify;

        @Nullable
        private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;

        @Nullable
        private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;

        @Nullable
        private final AttributeStyles.InputMarginStyle margin;

        @Nullable
        private final AttributeStyles.DateSelectStrokeColorStyle strokeColor;

        @Nullable
        private final AttributeStyles.DateSelectTextColorStyle textColor;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputDateComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputDateComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputDateComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.DateSelectBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.DateSelectStrokeColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputDateComponentStyle[] newArray(int i10) {
                return new InputDateComponentStyle[i10];
            }
        }

        public InputDateComponentStyle(@Nullable AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, @Nullable AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, @Nullable AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, @Nullable AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, @Nullable AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, @Nullable AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle, @Nullable AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle, @Nullable AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle, @Nullable AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle, @Nullable AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle, @Nullable AttributeStyles.InputMarginStyle inputMarginStyle, @Nullable AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle, @Nullable AttributeStyles.DateSelectStrokeColorStyle dateSelectStrokeColorStyle) {
            this.fontFamily = complexTextBasedFontFamilyStyle;
            this.fontSize = complexTextBasedFontSizeStyle;
            this.fontWeight = complexTextBasedFontWeightStyle;
            this.letterSpacing = complexTextBasedLetterSpacingStyle;
            this.lineHeight = complexTextBasedLineHeightStyle;
            this.textColor = dateSelectTextColorStyle;
            this.borderRadius = dateSelectBorderRadiusStyle;
            this.borderWidth = dateSelectBorderWidthStyle;
            this.backgroundColor = dateSelectBackgroundColorStyle;
            this.borderColor = dateSelectBorderColorStyle;
            this.margin = inputMarginStyle;
            this.justify = textBasedJustifyStyle;
            this.strokeColor = dateSelectStrokeColorStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final AttributeStyles.DateSelectBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Nullable
        public final AttributeStyles.DateSelectBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        @Nullable
        public final AttributeStyles.DateSelectBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        @Nullable
        public final AttributeStyles.DateSelectBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
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

        @NotNull
        public final InputSelectComponentStyle getInputSelectStyle() {
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            StyleElements.FontName base = complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getBase() : null;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle2 = this.fontFamily;
            StyleElements.FontName label = complexTextBasedFontFamilyStyle2 != null ? complexTextBasedFontFamilyStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle3 = this.fontFamily;
            AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = new AttributeStyles.InputSelectTextFontFamilyStyle(base, label, complexTextBasedFontFamilyStyle3 != null ? complexTextBasedFontFamilyStyle3.getError() : null);
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            StyleElements.Measurement value = complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getValue() : null;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle2 = this.fontSize;
            StyleElements.Measurement label2 = complexTextBasedFontSizeStyle2 != null ? complexTextBasedFontSizeStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle3 = this.fontSize;
            AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = new AttributeStyles.InputSelectTextFontSizeStyle(value, label2, complexTextBasedFontSizeStyle3 != null ? complexTextBasedFontSizeStyle3.getError() : null);
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            StyleElements.FontWeightContainer value2 = complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getValue() : null;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle2 = this.fontWeight;
            StyleElements.FontWeightContainer label3 = complexTextBasedFontWeightStyle2 != null ? complexTextBasedFontWeightStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle3 = this.fontWeight;
            AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = new AttributeStyles.InputSelectTextFontWeightStyle(value2, label3, complexTextBasedFontWeightStyle3 != null ? complexTextBasedFontWeightStyle3.getError() : null);
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            StyleElements.Measurement base2 = complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getBase() : null;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle2 = this.letterSpacing;
            StyleElements.Measurement label4 = complexTextBasedLetterSpacingStyle2 != null ? complexTextBasedLetterSpacingStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle3 = this.letterSpacing;
            AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = new AttributeStyles.InputSelectTextLetterSpacingStyle(base2, label4, complexTextBasedLetterSpacingStyle3 != null ? complexTextBasedLetterSpacingStyle3.getError() : null);
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            StyleElements.Measurement value3 = complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getValue() : null;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle2 = this.lineHeight;
            StyleElements.Measurement label5 = complexTextBasedLineHeightStyle2 != null ? complexTextBasedLineHeightStyle2.getLabel() : null;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle3 = this.lineHeight;
            AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = new AttributeStyles.InputSelectTextLineHeightStyle(value3, label5, complexTextBasedLineHeightStyle3 != null ? complexTextBasedLineHeightStyle3.getError() : null);
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle = this.textColor;
            StyleElements.ComplexElementColor value4 = dateSelectTextColorStyle != null ? dateSelectTextColorStyle.getValue() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle2 = this.textColor;
            StyleElements.ComplexElementColor placeholder = dateSelectTextColorStyle2 != null ? dateSelectTextColorStyle2.getPlaceholder() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle3 = this.textColor;
            StyleElements.ComplexElementColor label6 = dateSelectTextColorStyle3 != null ? dateSelectTextColorStyle3.getLabel() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle4 = this.textColor;
            AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = new AttributeStyles.InputSelectTextColorStyle(value4, placeholder, label6, dateSelectTextColorStyle4 != null ? dateSelectTextColorStyle4.getError() : null);
            AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle = this.borderRadius;
            AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle = new AttributeStyles.InputSelectBorderRadiusStyle(dateSelectBorderRadiusStyle != null ? dateSelectBorderRadiusStyle.getBase() : null);
            AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle = this.borderWidth;
            AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = new AttributeStyles.InputSelectBorderWidthStyle(dateSelectBorderWidthStyle != null ? dateSelectBorderWidthStyle.getBase() : null);
            AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle = this.backgroundColor;
            AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = new AttributeStyles.InputSelectBackgroundColorStyle(dateSelectBackgroundColorStyle != null ? dateSelectBackgroundColorStyle.getBase() : null);
            AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle = this.borderColor;
            AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = new AttributeStyles.InputSelectBorderColorStyle(dateSelectBorderColorStyle != null ? dateSelectBorderColorStyle.getBase() : null);
            AttributeStyles.DateSelectStrokeColorStyle dateSelectStrokeColorStyle = this.strokeColor;
            return new InputSelectComponentStyle(inputMarginStyle, textBasedJustifyStyle, inputSelectTextFontFamilyStyle, inputSelectTextFontSizeStyle, inputSelectTextFontWeightStyle, inputSelectTextLetterSpacingStyle, inputSelectTextLineHeightStyle, inputSelectTextColorStyle, inputSelectBorderRadiusStyle, inputSelectBorderWidthStyle, inputSelectBackgroundColorStyle, inputSelectBorderColorStyle, new AttributeStyles.InputSelectStrokeColorStyle(dateSelectStrokeColorStyle != null ? dateSelectStrokeColorStyle.getChevron() : null, null));
        }

        @NotNull
        public final InputTextBasedComponentStyle getInputTextStyle() {
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle = this.textColor;
            StyleElements.ComplexElementColor value = dateSelectTextColorStyle != null ? dateSelectTextColorStyle.getValue() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle2 = this.textColor;
            StyleElements.ComplexElementColor value2 = dateSelectTextColorStyle2 != null ? dateSelectTextColorStyle2.getValue() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle3 = this.textColor;
            StyleElements.ComplexElementColor placeholder = dateSelectTextColorStyle3 != null ? dateSelectTextColorStyle3.getPlaceholder() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle4 = this.textColor;
            StyleElements.ComplexElementColor label = dateSelectTextColorStyle4 != null ? dateSelectTextColorStyle4.getLabel() : null;
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle5 = this.textColor;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = new AttributeStyles.ComplexTextBasedTextColorStyle(value, value2, placeholder, label, dateSelectTextColorStyle5 != null ? dateSelectTextColorStyle5.getError() : null);
            AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle = this.borderRadius;
            AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = new AttributeStyles.InputTextBorderRadiusStyle(dateSelectBorderRadiusStyle != null ? dateSelectBorderRadiusStyle.getBase() : null);
            AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle = this.borderWidth;
            AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = new AttributeStyles.InputTextBorderWidthStyle(dateSelectBorderWidthStyle != null ? dateSelectBorderWidthStyle.getBase() : null);
            AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle = this.backgroundColor;
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = new AttributeStyles.InputTextBackgroundColorStyle(dateSelectBackgroundColorStyle != null ? dateSelectBackgroundColorStyle.getBase() : null, null);
            AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle = this.borderColor;
            return new InputTextBasedComponentStyle(null, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, complexTextBasedTextColorStyle, inputTextBorderRadiusStyle, inputTextBorderWidthStyle, inputTextBackgroundColorStyle, new AttributeStyles.InputTextBorderColorStyle(dateSelectBorderColorStyle != null ? dateSelectBorderColorStyle.getBase() : null), null);
        }

        @Nullable
        public final AttributeStyles.TextBasedJustifyStyle getJustify() {
            return this.justify;
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
        public final AttributeStyles.DateSelectStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        @Nullable
        public final AttributeStyles.DateSelectTextColorStyle getTextColor() {
            return this.textColor;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
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
            AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle = this.textColor;
            if (dateSelectTextColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dateSelectTextColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle = this.borderRadius;
            if (dateSelectBorderRadiusStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dateSelectBorderRadiusStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle = this.borderWidth;
            if (dateSelectBorderWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dateSelectBorderWidthStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle = this.backgroundColor;
            if (dateSelectBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dateSelectBackgroundColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle = this.borderColor;
            if (dateSelectBorderColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dateSelectBorderColorStyle.writeToParcel(dest, flags);
            }
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
            AttributeStyles.DateSelectStrokeColorStyle dateSelectStrokeColorStyle = this.strokeColor;
            if (dateSelectStrokeColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dateSelectStrokeColorStyle.writeToParcel(dest, flags);
            }
        }
    }

    public InputDate(@NotNull String name, @Nullable InputDateComponentStyle inputDateComponentStyle, @Nullable Attributes attributes) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.styles = inputDateComponentStyle;
        this.attributes = attributes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public final InputDateComponentStyle getStyles() {
        return this.styles;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        InputDateComponentStyle inputDateComponentStyle = this.styles;
        if (inputDateComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputDateComponentStyle.writeToParcel(dest, flags);
        }
        Attributes attributes = this.attributes;
        if (attributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            attributes.writeToParcel(dest, flags);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    @Nullable
    public Attributes getAttributes() {
        return this.attributes;
    }
}
