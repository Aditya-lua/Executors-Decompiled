package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.InterfaceC11874i;
import p495vm.C12232b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0004\u0005\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Included;", "", "Companion", "Unknown", "Font", "Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font;", "Lcom/withpersona/sdk2/inquiry/network/dto/Included$Unknown;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface Included {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Included$Companion;", "", "<init>", "()V", "Lum/h$e;", "createAdapter", "()Lum/h$e;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final AbstractC11873h.e createAdapter() {
            C12232b c12232bM45368e = C12232b.m45364b(Included.class, Payload.TYPE).m45366c(Unknown.INSTANCE).m45368e(Font.class, "theme-variable/font").m45368e(InquirySessionData.class, "inquiry-session").m45368e(InquiryTemplateVersion.class, "inquiry-template-version");
            Intrinsics.checkNotNullExpressionValue(c12232bM45368e, "withSubtype(...)");
            return c12232bM45368e;
        }
    }

    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font;", "Lcom/withpersona/sdk2/inquiry/network/dto/Included;", "Landroid/os/Parcelable;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;)V", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "FontAttributes", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Font implements Included, Parcelable {

        @NotNull
        public static final Parcelable.Creator<Font> CREATOR = new Creator();

        @NotNull
        private final FontAttributes attributes;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<Font> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Font createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Font(FontAttributes.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Font[] newArray(int i10) {
                return new Font[i10];
            }
        }

        @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;", "Landroid/os/Parcelable;", "fontFamilyName", "", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle;", "url", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle;Ljava/lang/String;)V", "getFontFamilyName", "()Ljava/lang/String;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "getFontStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle;", "getUrl", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        @InterfaceC11874i(generateAdapter = true)
        public static final class FontAttributes implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<FontAttributes> CREATOR = new Creator();

            @Nullable
            private final String fontFamilyName;

            @Nullable
            private final StyleElements.FontStyle fontStyle;

            @Nullable
            private final StyleElements.FontWeight fontWeight;

            @Nullable
            private final String url;

            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class Creator implements Parcelable.Creator<FontAttributes> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FontAttributes createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FontAttributes(parcel.readString(), parcel.readInt() == 0 ? null : StyleElements.FontWeight.valueOf(parcel.readString()), parcel.readInt() != 0 ? StyleElements.FontStyle.valueOf(parcel.readString()) : null, parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FontAttributes[] newArray(int i10) {
                    return new FontAttributes[i10];
                }
            }

            public FontAttributes(@Nullable String str, @Nullable StyleElements.FontWeight fontWeight, @Nullable StyleElements.FontStyle fontStyle, @Nullable String str2) {
                this.fontFamilyName = str;
                this.fontWeight = fontWeight;
                this.fontStyle = fontStyle;
                this.url = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Nullable
            public final String getFontFamilyName() {
                return this.fontFamilyName;
            }

            @Nullable
            public final StyleElements.FontStyle getFontStyle() {
                return this.fontStyle;
            }

            @Nullable
            public final StyleElements.FontWeight getFontWeight() {
                return this.fontWeight;
            }

            @Nullable
            public final String getUrl() {
                return this.url;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.fontFamilyName);
                StyleElements.FontWeight fontWeight = this.fontWeight;
                if (fontWeight == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(fontWeight.name());
                }
                StyleElements.FontStyle fontStyle = this.fontStyle;
                if (fontStyle == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(fontStyle.name());
                }
                dest.writeString(this.url);
            }
        }

        public Font(@NotNull FontAttributes attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.attributes = attributes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        public final FontAttributes getAttributes() {
            return this.attributes;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.attributes.writeToParcel(dest, flags);
        }
    }

    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Included$Unknown;", "Lcom/withpersona/sdk2/inquiry/network/dto/Included;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Unknown implements Included {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return 1167921231;
        }

        @NotNull
        public String toString() {
            return "Unknown";
        }
    }
}
