package com.withpersona.sdk2.inquiry.network.dto.p054ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.LocalImageComponentStyle;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p471um.AbstractC11873h;
import p471um.C11888w;
import p471um.InterfaceC11874i;
import p495vm.C12231a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Attributes", "Image", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class LocalImage implements UiComponentConfig {

    @NotNull
    public static final String type = "image_local";

    @Nullable
    private final Attributes attributes;

    @NotNull
    private final String name;

    @Nullable
    private final LocalImageComponentStyle styles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<LocalImage> CREATOR = new Creator();

    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Companion;", "", "<init>", "()V", "Lum/h$e;", "createAdapter", "()Lum/h$e;", "", Payload.TYPE, "Ljava/lang/String;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC11873h createAdapter$lambda$0(Type type, Set set, C11888w c11888w) {
            if (Intrinsics.m31980c(type, Image.class)) {
                return C12231a.m45360a(Image.class).m45363d(null).nullSafe();
            }
            return null;
        }

        @NotNull
        public final AbstractC11873h.e createAdapter() {
            return new AbstractC11873h.e() { // from class: com.withpersona.sdk2.inquiry.network.dto.ui.components.a
                @Override // p471um.AbstractC11873h.e
                public final AbstractC11873h create(Type type, Set set, C11888w c11888w) {
                    return LocalImage.Companion.createAdapter$lambda$0(type, set, c11888w);
                }
            };
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalImage> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalImage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocalImage(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LocalImageComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalImage[] newArray(int i10) {
            return new LocalImage[i10];
        }
    }

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\"\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Image;", "", "<init>", "(Ljava/lang/String;I)V", "START_HERO", "DOCUMENT_START_HERO", "ANIMATED_CHECK", "FAILED", "ID_FRONT_FAILED", "ID_BACK_FAILED", "FAILURE_DEFAULT_ICON", "SELFIE_FAILED", "DOCUMENT_FAILED", "PASSPORT_NFC_START_HERO", "PASSPORT_NFC_SCAN_HERO", "PASSPORT_NFC_SCAN_READY_HERO", "PASSPORT_NFC_CHECK", "GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED", "GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED", "GOVERNMENT_ID_NFC_SCAN_FRONT_OPENED", "GOVERNMENT_ID_NFC_SCAN_BACK_OPENED", "GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE", "GOVERNMENT_ID_NFC_SCAN_ID_CARD", "GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT", "CREATE_PERSONA_CTA_CARD_ICON", "OPTION_CHECK_ICON", "OPTION_CHEVRON_ICON", "OPTION_FLAG_ICON", "OPTION_GLOBE_ICON", "OPTION_HOME_ICON", "OPTION_ID_DOCUMENT_ICON", "OPTION_ID_ICON", "OPTION_PHONE_ICON", "OPTION_USER_ICON", "REUSABLE_PERSONA_LOGO", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = false)
    public enum Image {
        START_HERO,
        DOCUMENT_START_HERO,
        ANIMATED_CHECK,
        FAILED,
        ID_FRONT_FAILED,
        ID_BACK_FAILED,
        FAILURE_DEFAULT_ICON,
        SELFIE_FAILED,
        DOCUMENT_FAILED,
        PASSPORT_NFC_START_HERO,
        PASSPORT_NFC_SCAN_HERO,
        PASSPORT_NFC_SCAN_READY_HERO,
        PASSPORT_NFC_CHECK,
        GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED,
        GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED,
        GOVERNMENT_ID_NFC_SCAN_FRONT_OPENED,
        GOVERNMENT_ID_NFC_SCAN_BACK_OPENED,
        GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE,
        GOVERNMENT_ID_NFC_SCAN_ID_CARD,
        GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT,
        CREATE_PERSONA_CTA_CARD_ICON,
        OPTION_CHECK_ICON,
        OPTION_CHEVRON_ICON,
        OPTION_FLAG_ICON,
        OPTION_GLOBE_ICON,
        OPTION_HOME_ICON,
        OPTION_ID_DOCUMENT_ICON,
        OPTION_ID_ICON,
        OPTION_PHONE_ICON,
        OPTION_USER_ICON,
        REUSABLE_PERSONA_LOGO;

        private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

        @NotNull
        public static InterfaceC10707a<Image> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LocalImage(@NotNull String name, @Nullable Attributes attributes, @Nullable LocalImageComponentStyle localImageComponentStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = localImageComponentStyle;
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
    public final LocalImageComponentStyle getStyles() {
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
        LocalImageComponentStyle localImageComponentStyle = this.styles;
        if (localImageComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            localImageComponentStyle.writeToParcel(dest, flags);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes; */
    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig
    @Nullable
    public Attributes getAttributes() {
        return this.attributes;
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "imageKey", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Image;", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Image;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "getImageKey", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Image;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();

        @Nullable
        private final JsonLogicBoolean hidden;

        @Nullable
        private final Image imageKey;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Attributes(parcel.readInt() == 0 ? null : Image.valueOf(parcel.readString()), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
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
        public Attributes(@Nullable Image image, @Nullable JsonLogicBoolean jsonLogicBoolean) {
            this.imageKey = image;
            this.hidden = jsonLogicBoolean;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        @Nullable
        public final Image getImageKey() {
            return this.imageKey;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Image image = this.imageKey;
            if (image == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(image.name());
            }
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (r1v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage$Image)
          (wrap com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean) : (r2v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean))
         A[MD:(com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage$Image, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean):void (m)] (LINE:4) call: com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage.Attributes.<init>(com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage$Image, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean):void type: THIS */
        public /* synthetic */ Attributes(Image image, JsonLogicBoolean jsonLogicBoolean, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(image, (i10 & 2) != 0 ? null : jsonLogicBoolean);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 java.lang.String)
      (r2v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage$Attributes)
      (wrap com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle) : (r3v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle))
     A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage$Attributes, com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage.<init>(java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage$Attributes, com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle):void type: THIS */
    public /* synthetic */ LocalImage(String str, Attributes attributes, LocalImageComponentStyle localImageComponentStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i10 & 4) != 0 ? null : localImageComponentStyle);
    }
}
