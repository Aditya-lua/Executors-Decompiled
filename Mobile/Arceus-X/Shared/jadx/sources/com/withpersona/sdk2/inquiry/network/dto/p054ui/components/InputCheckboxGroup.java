package com.withpersona.sdk2.inquiry.network.dto.p054ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$InputCheckboxComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$InputCheckboxComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$InputCheckboxComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Attributes", "InputCheckboxComponentStyle", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class InputCheckboxGroup implements UiComponentConfig {

    @NotNull
    public static final String type = "input_checkbox_group";

    @Nullable
    private final Attributes attributes;

    @NotNull
    private final String name;

    @Nullable
    private final InputCheckbox.InputCheckboxComponentStyle styles;

    @NotNull
    public static final Parcelable.Creator<InputCheckboxGroup> CREATOR = new Creator();

    @Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "prefill", "", "", "label", "options", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "getPrefill", "()Ljava/util/List;", "getLabel", "()Ljava/lang/String;", "getOptions", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();

        @Nullable
        private final JsonLogicBoolean disabled;

        @Nullable
        private final JsonLogicBoolean hidden;

        @Nullable
        private final String label;

        @NotNull
        private final List<OptionWithDescription> options;

        @Nullable
        private final List<String> prefill;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(OptionWithDescription.CREATOR.createFromParcel(parcel));
                }
                return new Attributes(arrayListCreateStringArrayList, string, arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i10) {
                return new Attributes[i10];
            }
        }

        public Attributes(@Nullable List<String> list, @Nullable String str, @NotNull List<OptionWithDescription> options, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2) {
            Intrinsics.checkNotNullParameter(options, "options");
            this.prefill = list;
            this.label = str;
            this.options = options;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
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

        @NotNull
        public final List<OptionWithDescription> getOptions() {
            return this.options;
        }

        @Nullable
        public final List<String> getPrefill() {
            return this.prefill;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.prefill);
            dest.writeString(this.label);
            List<OptionWithDescription> list = this.options;
            dest.writeInt(list.size());
            Iterator<OptionWithDescription> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
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
    }

    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Creator implements Parcelable.Creator<InputCheckboxGroup> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputCheckboxGroup createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputCheckboxGroup(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputCheckbox.InputCheckboxComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputCheckboxGroup[] newArray(int i10) {
            return new InputCheckboxGroup[i10];
        }
    }

    @Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010(\u001a\u00020)J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020)R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0011\u0010&\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b'\u0010#¨\u0006/"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$InputCheckboxComponentStyle;", "Landroid/os/Parcelable;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontFamilyStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontSizeStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontWeightStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLineHeightStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxTextColorStyle;", "textColorHighlight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;)V", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontFamilyStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontSizeStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontWeightStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLineHeightStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxTextColorStyle;", "getTextColorHighlight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "textBasedStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTextBasedStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "descriptionTextStyle", "getDescriptionTextStyle", "errorTextStyle", "getErrorTextStyle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class InputCheckboxComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputCheckboxComponentStyle> CREATOR = new Creator();

        @Nullable
        private final AttributeStyles.InputCheckboxFontFamilyStyle fontFamily;

        @Nullable
        private final AttributeStyles.InputCheckboxFontSizeStyle fontSize;

        @Nullable
        private final AttributeStyles.InputCheckboxFontWeightStyle fontWeight;

        @Nullable
        private final AttributeStyles.InputCheckboxLetterSpacingStyle letterSpacing;

        @Nullable
        private final AttributeStyles.InputCheckboxLineHeightStyle lineHeight;

        @Nullable
        private final AttributeStyles.InputCheckboxTextColorStyle textColor;

        @Nullable
        private final AttributeStyles.TextBasedTextColorStyle textColorHighlight;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<InputCheckboxComponentStyle> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputCheckboxComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxComponentStyle[] newArray(int i10) {
                return new InputCheckboxComponentStyle[i10];
            }
        }

        public InputCheckboxComponentStyle(@Nullable AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle, @Nullable AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle, @Nullable AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle, @Nullable AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle, @Nullable AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle, @Nullable AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle, @Nullable AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle) {
            this.fontFamily = inputCheckboxFontFamilyStyle;
            this.fontSize = inputCheckboxFontSizeStyle;
            this.fontWeight = inputCheckboxFontWeightStyle;
            this.letterSpacing = inputCheckboxLetterSpacingStyle;
            this.lineHeight = inputCheckboxLineHeightStyle;
            this.textColor = inputCheckboxTextColorStyle;
            this.textColorHighlight = textBasedTextColorStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        public final TextBasedComponentStyle getDescriptionTextStyle() {
            AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getDescription() : null);
            AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getDescription() : null);
            AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getDescription() : null);
            AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getDescription() : null);
            AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getDescription() : null);
            AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getDescription() : null), null);
        }

        @NotNull
        public final TextBasedComponentStyle getErrorTextStyle() {
            AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getError() : null);
            AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getError() : null);
            AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getError() : null);
            AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getError() : null);
            AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getError() : null);
            AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getError() : null), null);
        }

        @Nullable
        public final AttributeStyles.InputCheckboxFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        @Nullable
        public final AttributeStyles.InputCheckboxFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        @Nullable
        public final AttributeStyles.InputCheckboxFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        @Nullable
        public final AttributeStyles.InputCheckboxLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        @Nullable
        public final AttributeStyles.InputCheckboxLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        @NotNull
        public final TextBasedComponentStyle getTextBasedStyle() {
            AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getBase() : null);
            AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getBase() : null);
            AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getBase() : null);
            AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getBase() : null);
            AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getBase() : null);
            AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getBase() : null), this.textColorHighlight);
        }

        @Nullable
        public final AttributeStyles.InputCheckboxTextColorStyle getTextColor() {
            return this.textColor;
        }

        @Nullable
        public final AttributeStyles.TextBasedTextColorStyle getTextColorHighlight() {
            return this.textColorHighlight;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
            if (inputCheckboxFontFamilyStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputCheckboxFontFamilyStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
            if (inputCheckboxFontSizeStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputCheckboxFontSizeStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
            if (inputCheckboxFontWeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputCheckboxFontWeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
            if (inputCheckboxLetterSpacingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputCheckboxLetterSpacingStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
            if (inputCheckboxLineHeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputCheckboxLineHeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
            if (inputCheckboxTextColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputCheckboxTextColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColorHighlight;
            if (textBasedTextColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                textBasedTextColorStyle.writeToParcel(dest, flags);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputCheckboxGroup(@NotNull String name, @Nullable Attributes attributes, @Nullable InputCheckbox.InputCheckboxComponentStyle inputCheckboxComponentStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = inputCheckboxComponentStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig
    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public final InputCheckbox.InputCheckboxComponentStyle getStyles() {
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
        InputCheckbox.InputCheckboxComponentStyle inputCheckboxComponentStyle = this.styles;
        if (inputCheckboxComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputCheckboxComponentStyle.writeToParcel(dest, flags);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes; */
    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig
    @Nullable
    public Attributes getAttributes() {
        return this.attributes;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 java.lang.String)
      (r2v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup$Attributes)
      (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox$InputCheckboxComponentStyle:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox$InputCheckboxComponentStyle) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox$InputCheckboxComponentStyle))
     A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup$Attributes, com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox$InputCheckboxComponentStyle):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup$Attributes, com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox$InputCheckboxComponentStyle):void type: THIS */
    public /* synthetic */ InputCheckboxGroup(String str, Attributes attributes, InputCheckbox.InputCheckboxComponentStyle inputCheckboxComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i10 & 4) != 0 ? null : inputCheckboxComponentStyle);
    }
}
