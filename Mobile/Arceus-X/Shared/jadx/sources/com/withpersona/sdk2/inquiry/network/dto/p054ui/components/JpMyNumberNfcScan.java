package com.withpersona.sdk2.inquiry.network.dto.p054ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "JpMyNumberNfcScanStyles", "Attributes", "TransitionComponents", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class JpMyNumberNfcScan implements UiComponentConfig {

    @NotNull
    public static final String type = "jp_my_number_nfc_scan";

    @Nullable
    private final Attributes attributes;

    @NotNull
    private final String name;

    @Nullable
    private final JpMyNumberNfcScanStyles styles;

    @NotNull
    public static final Parcelable.Creator<JpMyNumberNfcScan> CREATOR = new Creator();

    @Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0097\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010;\u001a\u00020<J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020<R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u001b\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#¨\u0006B"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "name", "", "operation", "passwords", "", "nonce", "hashAlgorithm", "preferVendorMocks", "", "transitionComponents", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", "buttonText", "enableNfcPrompt", "readingNfcMessage", "errorModalTryAgainButtonText", "errorModalChipNotDetectedTitle", "errorModalChipNotDetectedText", "errorModalLostConnectionTitle", "errorModalLostConnectionText", "errorModalIncorrectIdDetailsTitle", "errorModalIncorrectIdDetailsText", "errorModalGenericErrorTitle", "errorModalGenericErrorText", "closeButtonAccessibilityLabel", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "getName", "()Ljava/lang/String;", "getOperation", "getPasswords", "()Ljava/util/List;", "getNonce", "getHashAlgorithm", "getPreferVendorMocks", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTransitionComponents", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", "getButtonText", "getEnableNfcPrompt", "getReadingNfcMessage", "getErrorModalTryAgainButtonText", "getErrorModalChipNotDetectedTitle", "getErrorModalChipNotDetectedText", "getErrorModalLostConnectionTitle", "getErrorModalLostConnectionText", "getErrorModalIncorrectIdDetailsTitle", "getErrorModalIncorrectIdDetailsText", "getErrorModalGenericErrorTitle", "getErrorModalGenericErrorText", "getCloseButtonAccessibilityLabel", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();

        @Nullable
        private final String buttonText;

        @Nullable
        private final String closeButtonAccessibilityLabel;

        @Nullable
        private final JsonLogicBoolean disabled;

        @Nullable
        private final String enableNfcPrompt;

        @Nullable
        private final String errorModalChipNotDetectedText;

        @Nullable
        private final String errorModalChipNotDetectedTitle;

        @Nullable
        private final String errorModalGenericErrorText;

        @Nullable
        private final String errorModalGenericErrorTitle;

        @Nullable
        private final String errorModalIncorrectIdDetailsText;

        @Nullable
        private final String errorModalIncorrectIdDetailsTitle;

        @Nullable
        private final String errorModalLostConnectionText;

        @Nullable
        private final String errorModalLostConnectionTitle;

        @Nullable
        private final String errorModalTryAgainButtonText;

        @Nullable
        private final String hashAlgorithm;

        @Nullable
        private final JsonLogicBoolean hidden;

        @Nullable
        private final String name;

        @Nullable
        private final String nonce;

        @Nullable
        private final String operation;

        @Nullable
        private final List<String> passwords;

        @Nullable
        private final Boolean preferVendorMocks;

        @Nullable
        private final String readingNfcMessage;

        @Nullable
        private final TransitionComponents transitionComponents;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                JsonLogicBoolean jsonLogicBooleanCreateFromParcel = parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel);
                JsonLogicBoolean jsonLogicBooleanCreateFromParcel2 = parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                String string2 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Attributes(jsonLogicBooleanCreateFromParcel, jsonLogicBooleanCreateFromParcel2, string, string2, arrayListCreateStringArrayList, string3, string4, boolValueOf, parcel.readInt() != 0 ? TransitionComponents.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
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
        public Attributes() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final String getButtonText() {
            return this.buttonText;
        }

        @Nullable
        public final String getCloseButtonAccessibilityLabel() {
            return this.closeButtonAccessibilityLabel;
        }

        @Nullable
        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        @Nullable
        public final String getEnableNfcPrompt() {
            return this.enableNfcPrompt;
        }

        @Nullable
        public final String getErrorModalChipNotDetectedText() {
            return this.errorModalChipNotDetectedText;
        }

        @Nullable
        public final String getErrorModalChipNotDetectedTitle() {
            return this.errorModalChipNotDetectedTitle;
        }

        @Nullable
        public final String getErrorModalGenericErrorText() {
            return this.errorModalGenericErrorText;
        }

        @Nullable
        public final String getErrorModalGenericErrorTitle() {
            return this.errorModalGenericErrorTitle;
        }

        @Nullable
        public final String getErrorModalIncorrectIdDetailsText() {
            return this.errorModalIncorrectIdDetailsText;
        }

        @Nullable
        public final String getErrorModalIncorrectIdDetailsTitle() {
            return this.errorModalIncorrectIdDetailsTitle;
        }

        @Nullable
        public final String getErrorModalLostConnectionText() {
            return this.errorModalLostConnectionText;
        }

        @Nullable
        public final String getErrorModalLostConnectionTitle() {
            return this.errorModalLostConnectionTitle;
        }

        @Nullable
        public final String getErrorModalTryAgainButtonText() {
            return this.errorModalTryAgainButtonText;
        }

        @Nullable
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        @Nullable
        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getNonce() {
            return this.nonce;
        }

        @Nullable
        public final String getOperation() {
            return this.operation;
        }

        @Nullable
        public final List<String> getPasswords() {
            return this.passwords;
        }

        @Nullable
        public final Boolean getPreferVendorMocks() {
            return this.preferVendorMocks;
        }

        @Nullable
        public final String getReadingNfcMessage() {
            return this.readingNfcMessage;
        }

        @Nullable
        public final TransitionComponents getTransitionComponents() {
            return this.transitionComponents;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
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
            dest.writeString(this.name);
            dest.writeString(this.operation);
            dest.writeStringList(this.passwords);
            dest.writeString(this.nonce);
            dest.writeString(this.hashAlgorithm);
            Boolean bool = this.preferVendorMocks;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            TransitionComponents transitionComponents = this.transitionComponents;
            if (transitionComponents == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                transitionComponents.writeToParcel(dest, flags);
            }
            dest.writeString(this.buttonText);
            dest.writeString(this.enableNfcPrompt);
            dest.writeString(this.readingNfcMessage);
            dest.writeString(this.errorModalTryAgainButtonText);
            dest.writeString(this.errorModalChipNotDetectedTitle);
            dest.writeString(this.errorModalChipNotDetectedText);
            dest.writeString(this.errorModalLostConnectionTitle);
            dest.writeString(this.errorModalLostConnectionText);
            dest.writeString(this.errorModalIncorrectIdDetailsTitle);
            dest.writeString(this.errorModalIncorrectIdDetailsText);
            dest.writeString(this.errorModalGenericErrorTitle);
            dest.writeString(this.errorModalGenericErrorText);
            dest.writeString(this.closeButtonAccessibilityLabel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Attributes(@Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable TransitionComponents transitionComponents, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17) {
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
            this.name = str;
            this.operation = str2;
            this.passwords = list;
            this.nonce = str3;
            this.hashAlgorithm = str4;
            this.preferVendorMocks = bool;
            this.transitionComponents = transitionComponents;
            this.buttonText = str5;
            this.enableNfcPrompt = str6;
            this.readingNfcMessage = str7;
            this.errorModalTryAgainButtonText = str8;
            this.errorModalChipNotDetectedTitle = str9;
            this.errorModalChipNotDetectedText = str10;
            this.errorModalLostConnectionTitle = str11;
            this.errorModalLostConnectionText = str12;
            this.errorModalIncorrectIdDetailsTitle = str13;
            this.errorModalIncorrectIdDetailsText = str14;
            this.errorModalGenericErrorTitle = str15;
            this.errorModalGenericErrorText = str16;
            this.closeButtonAccessibilityLabel = str17;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f5: CONSTRUCTOR 
          (wrap com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean:?: TERNARY null = ((wrap int:0x0002: ARITH (r46v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean) : (r24v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean))
          (wrap com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean:?: TERNARY null = ((wrap int:0x000a: ARITH (r46v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean) : (r25v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0012: ARITH (r46v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001a: ARITH (r46v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
          (wrap java.util.List:?: TERNARY null = ((wrap int:0x0022: ARITH (r46v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r28v0 java.util.List))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x002a: ARITH (r46v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0032: ARITH (r46v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
          (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x003a: ARITH (r46v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r31v0 java.lang.Boolean))
          (wrap com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan$TransitionComponents:?: TERNARY null = ((wrap int:0x0042: ARITH (r46v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan$TransitionComponents) : (r32v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan$TransitionComponents))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x004a: ARITH (r46v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0052: ARITH (r46v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x005a: ARITH (r46v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0062: ARITH (r46v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x006a: ARITH (r46v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0072: ARITH (r46v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x007d: ARITH (r46v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0088: ARITH (r46v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0093: ARITH (r46v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x009e: ARITH (r46v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x00a9: ARITH (r46v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x00b4: ARITH (r46v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x00bf: ARITH (r46v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
         A[MD:(com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.Boolean, com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan$TransitionComponents, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:25) call: com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan.Attributes.<init>(com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.Boolean, com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan$TransitionComponents, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Attributes(JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str, String str2, List list, String str3, String str4, Boolean bool, TransitionComponents transitionComponents, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : jsonLogicBoolean, (i10 & 2) != 0 ? null : jsonLogicBoolean2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : bool, (i10 & 256) != 0 ? null : transitionComponents, (i10 & 512) != 0 ? null : str5, (i10 & 1024) != 0 ? null : str6, (i10 & 2048) != 0 ? null : str7, (i10 & 4096) != 0 ? null : str8, (i10 & 8192) != 0 ? null : str9, (i10 & 16384) != 0 ? null : str10, (i10 & 32768) != 0 ? null : str11, (i10 & 65536) != 0 ? null : str12, (i10 & 131072) != 0 ? null : str13, (i10 & 262144) != 0 ? null : str14, (i10 & 524288) != 0 ? null : str15, (i10 & 1048576) != 0 ? null : str16, (i10 & 2097152) != 0 ? null : str17);
        }
    }

    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Creator implements Parcelable.Creator<JpMyNumberNfcScan> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JpMyNumberNfcScan createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JpMyNumberNfcScan(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JpMyNumberNfcScanStyles.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JpMyNumberNfcScan[] newArray(int i10) {
            return new JpMyNumberNfcScan[i10];
        }
    }

    @Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010<\u001a\u000201J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u000201R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0013\u0010&\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0013\u0010(\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0013\u0010*\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b+\u0010#R\u0013\u0010,\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001fR\u0013\u0010.\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001fR\u0013\u00100\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u00104\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b5\u00103R\u0013\u00106\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b7\u00103R\u0013\u00108\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b9\u00103R\u0013\u0010:\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b;\u00103¨\u0006B"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$JpMyNumberNfcScanStyles;", "Landroid/os/Parcelable;", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanButtonStyles;", "buttonSecondaryStyle", "titleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanTextStyles;", "textStyle", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanStrokeColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanBackgroundColorStyle;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanFillColorStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanButtonStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanButtonStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanTextStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanTextStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanStrokeColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanFillColorStyle;)V", "getButtonPrimaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanButtonStyles;", "getButtonSecondaryStyle", "getTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanTextStyles;", "getTextStyle", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanStrokeColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanBackgroundColorStyle;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$JpMyNumberNfcScanFillColorStyle;", "scanButtonStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "getScanButtonStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "scanTitleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getScanTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "scanTextStyle", "getScanTextStyle", "errorLabelStyle", "getErrorLabelStyle", "errorModalTitleStyle", "getErrorModalTitleStyle", "errorModalTextStyle", "getErrorModalTextStyle", "errorModalPrimaryButtonStyle", "getErrorModalPrimaryButtonStyle", "errorModalSecondaryButtonStyle", "getErrorModalSecondaryButtonStyle", "errorModalBackgroundColor", "", "getErrorModalBackgroundColor", "()Ljava/lang/Integer;", "errorModalCloseButtonColor", "getErrorModalCloseButtonColor", "illustrationStrokeColor", "getIllustrationStrokeColor", "illustrationFillColor", "getIllustrationFillColor", "illustrationBackgroundColor", "getIllustrationBackgroundColor", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class JpMyNumberNfcScanStyles implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<JpMyNumberNfcScanStyles> CREATOR = new Creator();

        @Nullable
        private final AttributeStyles.JpMyNumberNfcScanBackgroundColorStyle backgroundColor;

        @Nullable
        private final AttributeStyles.JpMyNumberNfcScanButtonStyles buttonPrimaryStyle;

        @Nullable
        private final AttributeStyles.JpMyNumberNfcScanButtonStyles buttonSecondaryStyle;

        @Nullable
        private final AttributeStyles.JpMyNumberNfcScanFillColorStyle fillColor;

        @Nullable
        private final AttributeStyles.JpMyNumberNfcScanStrokeColorStyle strokeColor;

        @Nullable
        private final AttributeStyles.JpMyNumberNfcScanTextStyles textStyle;

        @Nullable
        private final AttributeStyles.JpMyNumberNfcScanTextStyles titleStyle;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<JpMyNumberNfcScanStyles> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final JpMyNumberNfcScanStyles createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JpMyNumberNfcScanStyles(parcel.readInt() == 0 ? null : AttributeStyles.JpMyNumberNfcScanButtonStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.JpMyNumberNfcScanButtonStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.JpMyNumberNfcScanTextStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.JpMyNumberNfcScanTextStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.JpMyNumberNfcScanStrokeColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.JpMyNumberNfcScanBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.JpMyNumberNfcScanFillColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final JpMyNumberNfcScanStyles[] newArray(int i10) {
                return new JpMyNumberNfcScanStyles[i10];
            }
        }

        public JpMyNumberNfcScanStyles(@Nullable AttributeStyles.JpMyNumberNfcScanButtonStyles jpMyNumberNfcScanButtonStyles, @Nullable AttributeStyles.JpMyNumberNfcScanButtonStyles jpMyNumberNfcScanButtonStyles2, @Nullable AttributeStyles.JpMyNumberNfcScanTextStyles jpMyNumberNfcScanTextStyles, @Nullable AttributeStyles.JpMyNumberNfcScanTextStyles jpMyNumberNfcScanTextStyles2, @Nullable AttributeStyles.JpMyNumberNfcScanStrokeColorStyle jpMyNumberNfcScanStrokeColorStyle, @Nullable AttributeStyles.JpMyNumberNfcScanBackgroundColorStyle jpMyNumberNfcScanBackgroundColorStyle, @Nullable AttributeStyles.JpMyNumberNfcScanFillColorStyle jpMyNumberNfcScanFillColorStyle) {
            this.buttonPrimaryStyle = jpMyNumberNfcScanButtonStyles;
            this.buttonSecondaryStyle = jpMyNumberNfcScanButtonStyles2;
            this.titleStyle = jpMyNumberNfcScanTextStyles;
            this.textStyle = jpMyNumberNfcScanTextStyles2;
            this.strokeColor = jpMyNumberNfcScanStrokeColorStyle;
            this.backgroundColor = jpMyNumberNfcScanBackgroundColorStyle;
            this.fillColor = jpMyNumberNfcScanFillColorStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final AttributeStyles.JpMyNumberNfcScanBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Nullable
        public final AttributeStyles.JpMyNumberNfcScanButtonStyles getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Nullable
        public final AttributeStyles.JpMyNumberNfcScanButtonStyles getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Nullable
        public final TextBasedComponentStyle getErrorLabelStyle() {
            AttributeStyles.JpMyNumberNfcScanTextStylesContainer errorLabel;
            AttributeStyles.JpMyNumberNfcScanTextStyles jpMyNumberNfcScanTextStyles = this.textStyle;
            if (jpMyNumberNfcScanTextStyles == null || (errorLabel = jpMyNumberNfcScanTextStyles.getErrorLabel()) == null) {
                return null;
            }
            return errorLabel.getBase();
        }

        @Nullable
        public final Integer getErrorModalBackgroundColor() {
            StyleElements.SimpleElementColor errorModal;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.JpMyNumberNfcScanBackgroundColorStyle jpMyNumberNfcScanBackgroundColorStyle = this.backgroundColor;
            if (jpMyNumberNfcScanBackgroundColorStyle == null || (errorModal = jpMyNumberNfcScanBackgroundColorStyle.getErrorModal()) == null || (base = errorModal.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Integer getErrorModalCloseButtonColor() {
            StyleElements.SimpleElementColor errorModalCloseButton;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.JpMyNumberNfcScanStrokeColorStyle jpMyNumberNfcScanStrokeColorStyle = this.strokeColor;
            if (jpMyNumberNfcScanStrokeColorStyle == null || (errorModalCloseButton = jpMyNumberNfcScanStrokeColorStyle.getErrorModalCloseButton()) == null || (base = errorModalCloseButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final ButtonSubmitComponentStyle getErrorModalPrimaryButtonStyle() {
            AttributeStyles.JpMyNumberNfcScanButtonStylesContainer errorModal;
            AttributeStyles.JpMyNumberNfcScanButtonStyles jpMyNumberNfcScanButtonStyles = this.buttonPrimaryStyle;
            if (jpMyNumberNfcScanButtonStyles == null || (errorModal = jpMyNumberNfcScanButtonStyles.getErrorModal()) == null) {
                return null;
            }
            return errorModal.getBase();
        }

        @Nullable
        public final ButtonSubmitComponentStyle getErrorModalSecondaryButtonStyle() {
            AttributeStyles.JpMyNumberNfcScanButtonStylesContainer errorModal;
            AttributeStyles.JpMyNumberNfcScanButtonStyles jpMyNumberNfcScanButtonStyles = this.buttonSecondaryStyle;
            if (jpMyNumberNfcScanButtonStyles == null || (errorModal = jpMyNumberNfcScanButtonStyles.getErrorModal()) == null) {
                return null;
            }
            return errorModal.getBase();
        }

        @Nullable
        public final TextBasedComponentStyle getErrorModalTextStyle() {
            AttributeStyles.JpMyNumberNfcScanTextStylesContainer errorModal;
            AttributeStyles.JpMyNumberNfcScanTextStyles jpMyNumberNfcScanTextStyles = this.textStyle;
            if (jpMyNumberNfcScanTextStyles == null || (errorModal = jpMyNumberNfcScanTextStyles.getErrorModal()) == null) {
                return null;
            }
            return errorModal.getBase();
        }

        @Nullable
        public final TextBasedComponentStyle getErrorModalTitleStyle() {
            AttributeStyles.JpMyNumberNfcScanTextStylesContainer errorModal;
            AttributeStyles.JpMyNumberNfcScanTextStyles jpMyNumberNfcScanTextStyles = this.titleStyle;
            if (jpMyNumberNfcScanTextStyles == null || (errorModal = jpMyNumberNfcScanTextStyles.getErrorModal()) == null) {
                return null;
            }
            return errorModal.getBase();
        }

        @Nullable
        public final AttributeStyles.JpMyNumberNfcScanFillColorStyle getFillColor() {
            return this.fillColor;
        }

        @Nullable
        public final Integer getIllustrationBackgroundColor() {
            StyleElements.ComplexElementColor background;
            AttributeStyles.JpMyNumberNfcScanFillColorStyle jpMyNumberNfcScanFillColorStyle = this.fillColor;
            if (jpMyNumberNfcScanFillColorStyle == null || (background = jpMyNumberNfcScanFillColorStyle.getBackground()) == null) {
                return null;
            }
            return background.getBase();
        }

        @Nullable
        public final Integer getIllustrationFillColor() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.JpMyNumberNfcScanFillColorStyle jpMyNumberNfcScanFillColorStyle = this.fillColor;
            if (jpMyNumberNfcScanFillColorStyle == null || (base = jpMyNumberNfcScanFillColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final Integer getIllustrationStrokeColor() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.JpMyNumberNfcScanStrokeColorStyle jpMyNumberNfcScanStrokeColorStyle = this.strokeColor;
            if (jpMyNumberNfcScanStrokeColorStyle == null || (base = jpMyNumberNfcScanStrokeColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final ButtonSubmitComponentStyle getScanButtonStyle() {
            AttributeStyles.JpMyNumberNfcScanButtonStylesContainer base;
            AttributeStyles.JpMyNumberNfcScanButtonStyles jpMyNumberNfcScanButtonStyles = this.buttonPrimaryStyle;
            if (jpMyNumberNfcScanButtonStyles == null || (base = jpMyNumberNfcScanButtonStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final TextBasedComponentStyle getScanTextStyle() {
            AttributeStyles.JpMyNumberNfcScanTextStylesContainer base;
            AttributeStyles.JpMyNumberNfcScanTextStyles jpMyNumberNfcScanTextStyles = this.textStyle;
            if (jpMyNumberNfcScanTextStyles == null || (base = jpMyNumberNfcScanTextStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final TextBasedComponentStyle getScanTitleStyle() {
            AttributeStyles.JpMyNumberNfcScanTextStylesContainer base;
            AttributeStyles.JpMyNumberNfcScanTextStyles jpMyNumberNfcScanTextStyles = this.titleStyle;
            if (jpMyNumberNfcScanTextStyles == null || (base = jpMyNumberNfcScanTextStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.JpMyNumberNfcScanStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        @Nullable
        public final AttributeStyles.JpMyNumberNfcScanTextStyles getTextStyle() {
            return this.textStyle;
        }

        @Nullable
        public final AttributeStyles.JpMyNumberNfcScanTextStyles getTitleStyle() {
            return this.titleStyle;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AttributeStyles.JpMyNumberNfcScanButtonStyles jpMyNumberNfcScanButtonStyles = this.buttonPrimaryStyle;
            if (jpMyNumberNfcScanButtonStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jpMyNumberNfcScanButtonStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.JpMyNumberNfcScanButtonStyles jpMyNumberNfcScanButtonStyles2 = this.buttonSecondaryStyle;
            if (jpMyNumberNfcScanButtonStyles2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jpMyNumberNfcScanButtonStyles2.writeToParcel(dest, flags);
            }
            AttributeStyles.JpMyNumberNfcScanTextStyles jpMyNumberNfcScanTextStyles = this.titleStyle;
            if (jpMyNumberNfcScanTextStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jpMyNumberNfcScanTextStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.JpMyNumberNfcScanTextStyles jpMyNumberNfcScanTextStyles2 = this.textStyle;
            if (jpMyNumberNfcScanTextStyles2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jpMyNumberNfcScanTextStyles2.writeToParcel(dest, flags);
            }
            AttributeStyles.JpMyNumberNfcScanStrokeColorStyle jpMyNumberNfcScanStrokeColorStyle = this.strokeColor;
            if (jpMyNumberNfcScanStrokeColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jpMyNumberNfcScanStrokeColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.JpMyNumberNfcScanBackgroundColorStyle jpMyNumberNfcScanBackgroundColorStyle = this.backgroundColor;
            if (jpMyNumberNfcScanBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jpMyNumberNfcScanBackgroundColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.JpMyNumberNfcScanFillColorStyle jpMyNumberNfcScanFillColorStyle = this.fillColor;
            if (jpMyNumberNfcScanFillColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jpMyNumberNfcScanFillColorStyle.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006#"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$TransitionComponents;", "Landroid/os/Parcelable;", "mnSignForAuthError", "", "mnSignError", "mnReadWithVerNumberBError", "mnReadError", "dlReadError", "mnDlReadError", "mnDlCombinedReadError", "resReadError", "chipLocked", "success", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMnSignForAuthError", "()Ljava/lang/String;", "getMnSignError", "getMnReadWithVerNumberBError", "getMnReadError", "getDlReadError", "getMnDlReadError", "getMnDlCombinedReadError", "getResReadError", "getChipLocked", "getSuccess", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class TransitionComponents implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TransitionComponents> CREATOR = new Creator();

        @Nullable
        private final String chipLocked;

        @Nullable
        private final String dlReadError;

        @Nullable
        private final String error;

        @Nullable
        private final String mnDlCombinedReadError;

        @Nullable
        private final String mnDlReadError;

        @Nullable
        private final String mnReadError;

        @Nullable
        private final String mnReadWithVerNumberBError;

        @Nullable
        private final String mnSignError;

        @Nullable
        private final String mnSignForAuthError;

        @Nullable
        private final String resReadError;

        @Nullable
        private final String success;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<TransitionComponents> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransitionComponents createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransitionComponents(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransitionComponents[] newArray(int i10) {
                return new TransitionComponents[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public TransitionComponents() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final String getChipLocked() {
            return this.chipLocked;
        }

        @Nullable
        public final String getDlReadError() {
            return this.dlReadError;
        }

        @Nullable
        public final String getError() {
            return this.error;
        }

        @Nullable
        public final String getMnDlCombinedReadError() {
            return this.mnDlCombinedReadError;
        }

        @Nullable
        public final String getMnDlReadError() {
            return this.mnDlReadError;
        }

        @Nullable
        public final String getMnReadError() {
            return this.mnReadError;
        }

        @Nullable
        public final String getMnReadWithVerNumberBError() {
            return this.mnReadWithVerNumberBError;
        }

        @Nullable
        public final String getMnSignError() {
            return this.mnSignError;
        }

        @Nullable
        public final String getMnSignForAuthError() {
            return this.mnSignForAuthError;
        }

        @Nullable
        public final String getResReadError() {
            return this.resReadError;
        }

        @Nullable
        public final String getSuccess() {
            return this.success;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.mnSignForAuthError);
            dest.writeString(this.mnSignError);
            dest.writeString(this.mnReadWithVerNumberBError);
            dest.writeString(this.mnReadError);
            dest.writeString(this.dlReadError);
            dest.writeString(this.mnDlReadError);
            dest.writeString(this.mnDlCombinedReadError);
            dest.writeString(this.resReadError);
            dest.writeString(this.chipLocked);
            dest.writeString(this.success);
            dest.writeString(this.error);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public TransitionComponents(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
            this.mnSignForAuthError = str;
            this.mnSignError = str2;
            this.mnReadWithVerNumberBError = str3;
            this.mnReadError = str4;
            this.dlReadError = str5;
            this.mnDlReadError = str6;
            this.mnDlCombinedReadError = str7;
            this.resReadError = str8;
            this.chipLocked = str9;
            this.success = str10;
            this.error = str11;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0046: CONSTRUCTOR 
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000b: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0015: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001a: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x001f: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0024: ARITH (r13v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0029: ARITH (r13v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x002e: ARITH (r13v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0033: ARITH (r13v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
         A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:14) call: com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan.TransitionComponents.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ TransitionComponents(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? null : str11);
        }
    }

    public JpMyNumberNfcScan(@NotNull String name, @Nullable Attributes attributes, @Nullable JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = jpMyNumberNfcScanStyles;
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
    public final JpMyNumberNfcScanStyles getStyles() {
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
        JpMyNumberNfcScanStyles jpMyNumberNfcScanStyles = this.styles;
        if (jpMyNumberNfcScanStyles == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            jpMyNumberNfcScanStyles.writeToParcel(dest, flags);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes; */
    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig
    @Nullable
    public Attributes getAttributes() {
        return this.attributes;
    }
}
