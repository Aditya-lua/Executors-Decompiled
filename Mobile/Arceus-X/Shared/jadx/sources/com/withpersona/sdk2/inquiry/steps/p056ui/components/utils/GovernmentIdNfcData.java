package com.withpersona.sdk2.inquiry.steps.p056ui.components.utils;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p390qp.EnumC10687a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&¨\u0006'"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "dg1Uri", "dg2Uri", "sodUri", "Lqp/a;", "chipAuthenticationStatus", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Lqp/a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "f", "()Landroid/net/Uri;", "b", "g", "c", "i", "d", "Lqp/a;", "()Lqp/a;", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class GovernmentIdNfcData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GovernmentIdNfcData> CREATOR = new C4087a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final Uri dg1Uri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final Uri dg2Uri;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final Uri sodUri;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC10687a chipAuthenticationStatus;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4087a implements Parcelable.Creator<GovernmentIdNfcData> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdNfcData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GovernmentIdNfcData((Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), (Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), (Uri) parcel.readParcelable(GovernmentIdNfcData.class.getClassLoader()), EnumC10687a.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdNfcData[] newArray(int i10) {
            return new GovernmentIdNfcData[i10];
        }
    }

    public GovernmentIdNfcData(@Nullable Uri uri, @Nullable Uri uri2, @Nullable Uri uri3, @NotNull EnumC10687a chipAuthenticationStatus) {
        Intrinsics.checkNotNullParameter(chipAuthenticationStatus, "chipAuthenticationStatus");
        this.dg1Uri = uri;
        this.dg2Uri = uri2;
        this.sodUri = uri3;
        this.chipAuthenticationStatus = chipAuthenticationStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC10687a getChipAuthenticationStatus() {
        return this.chipAuthenticationStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdNfcData)) {
            return false;
        }
        GovernmentIdNfcData governmentIdNfcData = (GovernmentIdNfcData) other;
        return Intrinsics.m31980c(this.dg1Uri, governmentIdNfcData.dg1Uri) && Intrinsics.m31980c(this.dg2Uri, governmentIdNfcData.dg2Uri) && Intrinsics.m31980c(this.sodUri, governmentIdNfcData.sodUri) && this.chipAuthenticationStatus == governmentIdNfcData.chipAuthenticationStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Uri getDg1Uri() {
        return this.dg1Uri;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Uri getDg2Uri() {
        return this.dg2Uri;
    }

    public int hashCode() {
        Uri uri = this.dg1Uri;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        Uri uri2 = this.dg2Uri;
        int iHashCode2 = (iHashCode + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Uri uri3 = this.sodUri;
        return ((iHashCode2 + (uri3 != null ? uri3.hashCode() : 0)) * 31) + this.chipAuthenticationStatus.hashCode();
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Uri getSodUri() {
        return this.sodUri;
    }

    @NotNull
    public String toString() {
        return "GovernmentIdNfcData(dg1Uri=" + this.dg1Uri + ", dg2Uri=" + this.dg2Uri + ", sodUri=" + this.sodUri + ", chipAuthenticationStatus=" + this.chipAuthenticationStatus + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.dg1Uri, flags);
        dest.writeParcelable(this.dg2Uri, flags);
        dest.writeParcelable(this.sodUri, flags);
        dest.writeString(this.chipAuthenticationStatus.name());
    }
}
