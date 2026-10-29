package com.withpersona.sdk2.inquiry.jpmynumber;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.JpMyNumberNfcScan;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 82\u00020\u0001:\u0001!Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b5\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b7\u0010\u001a¨\u00069"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;", "Landroid/os/Parcelable;", "", "readingNfcMessage", "errorModalTryAgainButtonText", "errorModalChipNotDetectedTitle", "errorModalChipNotDetectedText", "errorModalLostConnectionTitle", "errorModalLostConnectionText", "errorModalIncorrectIdDetailsTitle", "errorModalIncorrectIdDetailsText", "errorModalGenericErrorTitle", "errorModalGenericErrorText", "closeButtonAccessibilityLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getReadingNfcMessage", "b", "getErrorModalTryAgainButtonText", "c", "getErrorModalChipNotDetectedTitle", "d", "getErrorModalChipNotDetectedText", "e", "getErrorModalLostConnectionTitle", "f", "getErrorModalLostConnectionText", "g", "getErrorModalIncorrectIdDetailsTitle", "h", "getErrorModalIncorrectIdDetailsText", "i", "getErrorModalGenericErrorTitle", "j", "getErrorModalGenericErrorText", "k", "getCloseButtonAccessibilityLabel", "l", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class JpMyNumberNfcStrings implements Parcelable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final String readingNfcMessage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String errorModalTryAgainButtonText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final String errorModalChipNotDetectedTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String errorModalChipNotDetectedText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final String errorModalLostConnectionTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final String errorModalLostConnectionText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final String errorModalIncorrectIdDetailsTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    public final String errorModalIncorrectIdDetailsText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public final String errorModalGenericErrorTitle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    public final String errorModalGenericErrorText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    public final String closeButtonAccessibilityLabel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<JpMyNumberNfcStrings> CREATOR = new C3762b();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/JpMyNumberNfcScan$Attributes;)Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcStrings;", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final JpMyNumberNfcStrings m18927a(@Nullable JpMyNumberNfcScan.Attributes attributes) {
            return new JpMyNumberNfcStrings(attributes != null ? attributes.getReadingNfcMessage() : null, attributes != null ? attributes.getErrorModalTryAgainButtonText() : null, attributes != null ? attributes.getErrorModalChipNotDetectedTitle() : null, attributes != null ? attributes.getErrorModalChipNotDetectedText() : null, attributes != null ? attributes.getErrorModalLostConnectionTitle() : null, attributes != null ? attributes.getErrorModalLostConnectionText() : null, attributes != null ? attributes.getErrorModalIncorrectIdDetailsTitle() : null, attributes != null ? attributes.getErrorModalIncorrectIdDetailsText() : null, attributes != null ? attributes.getErrorModalGenericErrorTitle() : null, attributes != null ? attributes.getErrorModalGenericErrorText() : null, attributes != null ? attributes.getCloseButtonAccessibilityLabel() : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcStrings$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3762b implements Parcelable.Creator<JpMyNumberNfcStrings> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JpMyNumberNfcStrings createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JpMyNumberNfcStrings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final JpMyNumberNfcStrings[] newArray(int i10) {
            return new JpMyNumberNfcStrings[i10];
        }
    }

    public JpMyNumberNfcStrings(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.readingNfcMessage = str;
        this.errorModalTryAgainButtonText = str2;
        this.errorModalChipNotDetectedTitle = str3;
        this.errorModalChipNotDetectedText = str4;
        this.errorModalLostConnectionTitle = str5;
        this.errorModalLostConnectionText = str6;
        this.errorModalIncorrectIdDetailsTitle = str7;
        this.errorModalIncorrectIdDetailsText = str8;
        this.errorModalGenericErrorTitle = str9;
        this.errorModalGenericErrorText = str10;
        this.closeButtonAccessibilityLabel = str11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JpMyNumberNfcStrings)) {
            return false;
        }
        JpMyNumberNfcStrings jpMyNumberNfcStrings = (JpMyNumberNfcStrings) other;
        return Intrinsics.m31980c(this.readingNfcMessage, jpMyNumberNfcStrings.readingNfcMessage) && Intrinsics.m31980c(this.errorModalTryAgainButtonText, jpMyNumberNfcStrings.errorModalTryAgainButtonText) && Intrinsics.m31980c(this.errorModalChipNotDetectedTitle, jpMyNumberNfcStrings.errorModalChipNotDetectedTitle) && Intrinsics.m31980c(this.errorModalChipNotDetectedText, jpMyNumberNfcStrings.errorModalChipNotDetectedText) && Intrinsics.m31980c(this.errorModalLostConnectionTitle, jpMyNumberNfcStrings.errorModalLostConnectionTitle) && Intrinsics.m31980c(this.errorModalLostConnectionText, jpMyNumberNfcStrings.errorModalLostConnectionText) && Intrinsics.m31980c(this.errorModalIncorrectIdDetailsTitle, jpMyNumberNfcStrings.errorModalIncorrectIdDetailsTitle) && Intrinsics.m31980c(this.errorModalIncorrectIdDetailsText, jpMyNumberNfcStrings.errorModalIncorrectIdDetailsText) && Intrinsics.m31980c(this.errorModalGenericErrorTitle, jpMyNumberNfcStrings.errorModalGenericErrorTitle) && Intrinsics.m31980c(this.errorModalGenericErrorText, jpMyNumberNfcStrings.errorModalGenericErrorText) && Intrinsics.m31980c(this.closeButtonAccessibilityLabel, jpMyNumberNfcStrings.closeButtonAccessibilityLabel);
    }

    public int hashCode() {
        String str = this.readingNfcMessage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorModalTryAgainButtonText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorModalChipNotDetectedTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorModalChipNotDetectedText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.errorModalLostConnectionTitle;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.errorModalLostConnectionText;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.errorModalIncorrectIdDetailsTitle;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.errorModalIncorrectIdDetailsText;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.errorModalGenericErrorTitle;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.errorModalGenericErrorText;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.closeButtonAccessibilityLabel;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "JpMyNumberNfcStrings(readingNfcMessage=" + this.readingNfcMessage + ", errorModalTryAgainButtonText=" + this.errorModalTryAgainButtonText + ", errorModalChipNotDetectedTitle=" + this.errorModalChipNotDetectedTitle + ", errorModalChipNotDetectedText=" + this.errorModalChipNotDetectedText + ", errorModalLostConnectionTitle=" + this.errorModalLostConnectionTitle + ", errorModalLostConnectionText=" + this.errorModalLostConnectionText + ", errorModalIncorrectIdDetailsTitle=" + this.errorModalIncorrectIdDetailsTitle + ", errorModalIncorrectIdDetailsText=" + this.errorModalIncorrectIdDetailsText + ", errorModalGenericErrorTitle=" + this.errorModalGenericErrorTitle + ", errorModalGenericErrorText=" + this.errorModalGenericErrorText + ", closeButtonAccessibilityLabel=" + this.closeButtonAccessibilityLabel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
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
}
