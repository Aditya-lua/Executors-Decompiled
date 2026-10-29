package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "Landroid/os/Parcelable;", "accessToken", "", "inquirySessionData", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "trackingEventsUrl", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getInquirySessionData", "()Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "getTrackingEventsUrl", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InquirySessionDataWrapper implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InquirySessionDataWrapper> CREATOR = new Creator();

    @NotNull
    private final String accessToken;

    @NotNull
    private final InquirySessionData inquirySessionData;

    @Nullable
    private final String trackingEventsUrl;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InquirySessionDataWrapper> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InquirySessionDataWrapper createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InquirySessionDataWrapper(parcel.readString(), InquirySessionData.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InquirySessionDataWrapper[] newArray(int i10) {
            return new InquirySessionDataWrapper[i10];
        }
    }

    public InquirySessionDataWrapper(@NotNull String accessToken, @NotNull InquirySessionData inquirySessionData, @Nullable String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(inquirySessionData, "inquirySessionData");
        this.accessToken = accessToken;
        this.inquirySessionData = inquirySessionData;
        this.trackingEventsUrl = str;
    }

    public static /* synthetic */ InquirySessionDataWrapper copy$default(InquirySessionDataWrapper inquirySessionDataWrapper, String str, InquirySessionData inquirySessionData, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inquirySessionDataWrapper.accessToken;
        }
        if ((i10 & 2) != 0) {
            inquirySessionData = inquirySessionDataWrapper.inquirySessionData;
        }
        if ((i10 & 4) != 0) {
            str2 = inquirySessionDataWrapper.trackingEventsUrl;
        }
        return inquirySessionDataWrapper.copy(str, inquirySessionData, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InquirySessionData getInquirySessionData() {
        return this.inquirySessionData;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrackingEventsUrl() {
        return this.trackingEventsUrl;
    }

    @NotNull
    public final InquirySessionDataWrapper copy(@NotNull String accessToken, @NotNull InquirySessionData inquirySessionData, @Nullable String trackingEventsUrl) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(inquirySessionData, "inquirySessionData");
        return new InquirySessionDataWrapper(accessToken, inquirySessionData, trackingEventsUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InquirySessionDataWrapper)) {
            return false;
        }
        InquirySessionDataWrapper inquirySessionDataWrapper = (InquirySessionDataWrapper) other;
        return Intrinsics.c(this.accessToken, inquirySessionDataWrapper.accessToken) && Intrinsics.c(this.inquirySessionData, inquirySessionDataWrapper.inquirySessionData) && Intrinsics.c(this.trackingEventsUrl, inquirySessionDataWrapper.trackingEventsUrl);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final InquirySessionData getInquirySessionData() {
        return this.inquirySessionData;
    }

    @Nullable
    public final String getTrackingEventsUrl() {
        return this.trackingEventsUrl;
    }

    public int hashCode() {
        int iHashCode = ((this.accessToken.hashCode() * 31) + this.inquirySessionData.hashCode()) * 31;
        String str = this.trackingEventsUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "InquirySessionDataWrapper(accessToken=" + this.accessToken + ", inquirySessionData=" + this.inquirySessionData + ", trackingEventsUrl=" + this.trackingEventsUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accessToken);
        this.inquirySessionData.writeToParcel(dest, flags);
        dest.writeString(this.trackingEventsUrl);
    }

    public /* synthetic */ InquirySessionDataWrapper(String str, InquirySessionData inquirySessionData, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, inquirySessionData, (i10 & 4) != 0 ? null : str2);
    }
}
