package com.withpersona.sdk2.inquiry.network.dto.p054ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonLinkComponentStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LinkButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LinkButton$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonLinkComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LinkButton$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonLinkComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LinkButton$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonLinkComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "Attributes", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class LinkButton implements Button {

    @NotNull
    public static final String type = "button_link";

    @Nullable
    private final Attributes attributes;

    @NotNull
    private final String name;

    @Nullable
    private final ButtonLinkComponentStyle styles;

    @NotNull
    public static final Parcelable.Creator<LinkButton> CREATOR = new Creator();

    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkButton> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkButton createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkButton(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonLinkComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkButton[] newArray(int i10) {
            return new LinkButton[i10];
        }
    }

    public LinkButton(@NotNull String name, @Nullable Attributes attributes, @Nullable ButtonLinkComponentStyle buttonLinkComponentStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = buttonLinkComponentStyle;
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
        ButtonLinkComponentStyle buttonLinkComponentStyle = this.styles;
        if (buttonLinkComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonLinkComponentStyle.writeToParcel(dest, flags);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle; */
    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Button
    @Nullable
    public ButtonLinkComponentStyle getStyles() {
        return this.styles;
    }

    /* JADX DEBUG: Method merged with bridge method: getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes; */
    /* JADX DEBUG: Method merged with bridge method: getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes; */
    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig
    @Nullable
    public Attributes getAttributes() {
        return this.attributes;
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001b\u001a\u00020\bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006!"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LinkButton$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", Text.type, "", "buttonType", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "autoSubmitCountdownText", "autoSubmitIntervalSeconds", "", "link", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "getText", "()Ljava/lang/String;", "getButtonType", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "getAutoSubmitCountdownText", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLink", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Attributes implements BaseButtonAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();

        @Nullable
        private final String autoSubmitCountdownText;

        @Nullable
        private final Integer autoSubmitIntervalSeconds;

        @Nullable
        private final Button.ButtonType buttonType;

        @Nullable
        private final JsonLogicBoolean disabled;

        @Nullable
        private final JsonLogicBoolean hidden;

        @NotNull
        private final String link;

        @NotNull
        private final String text;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : Button.ButtonType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i10) {
                return new Attributes[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Attributes(@NotNull String text, @Nullable Button.ButtonType buttonType, @Nullable String str, @Nullable Integer num, @NotNull String link, @Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(link, "link");
            this.text = text;
            this.buttonType = buttonType;
            this.autoSubmitCountdownText = str;
            this.autoSubmitIntervalSeconds = num;
            this.link = link;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes
        @Nullable
        public String getAutoSubmitCountdownText() {
            return this.autoSubmitCountdownText;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes
        @Nullable
        public Integer getAutoSubmitIntervalSeconds() {
            return this.autoSubmitIntervalSeconds;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes
        @Nullable
        public Button.ButtonType getButtonType() {
            return this.buttonType;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes
        @Nullable
        public JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes
        @Nullable
        public JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.BaseButtonAttributes
        @NotNull
        public String getText() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            Button.ButtonType buttonType = this.buttonType;
            if (buttonType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(buttonType.name());
            }
            dest.writeString(this.autoSubmitCountdownText);
            Integer num = this.autoSubmitIntervalSeconds;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeString(this.link);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
          (r2v0 java.lang.String)
          (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.Button$ButtonType)
          (r4v0 java.lang.String)
          (r5v0 java.lang.Integer)
          (r6v0 java.lang.String)
          (wrap com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r9v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean) : (r7v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean))
          (wrap com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r9v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean) : (r8v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean))
         A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.Button$ButtonType, java.lang.String, java.lang.Integer, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean):void (m)] (LINE:9) call: com.withpersona.sdk2.inquiry.network.dto.ui.components.LinkButton.Attributes.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.Button$ButtonType, java.lang.String, java.lang.Integer, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean):void type: THIS */
        public /* synthetic */ Attributes(String str, Button.ButtonType buttonType, String str2, Integer num, String str3, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, buttonType, str2, num, str3, (i10 & 32) != 0 ? null : jsonLogicBoolean, (i10 & 64) != 0 ? null : jsonLogicBoolean2);
        }
    }
}
