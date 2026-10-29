package com.withpersona.sdk2.inquiry.inline_inquiry;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"com/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent$MiscInquiryEvent$VideoCaptureFallback", "", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class InquiryEvent$MiscInquiryEvent$VideoCaptureFallback implements InquiryEvent {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final InquiryEvent$MiscInquiryEvent$VideoCaptureFallback f14296a = new InquiryEvent$MiscInquiryEvent$VideoCaptureFallback();

    @NotNull
    public static final Parcelable.Creator<InquiryEvent$MiscInquiryEvent$VideoCaptureFallback> CREATOR = new C3598a();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent$MiscInquiryEvent$VideoCaptureFallback$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3598a implements Parcelable.Creator<InquiryEvent$MiscInquiryEvent$VideoCaptureFallback> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InquiryEvent$MiscInquiryEvent$VideoCaptureFallback createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return InquiryEvent$MiscInquiryEvent$VideoCaptureFallback.f14296a;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InquiryEvent$MiscInquiryEvent$VideoCaptureFallback[] newArray(int i10) {
            return new InquiryEvent$MiscInquiryEvent$VideoCaptureFallback[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        return this == other || (other instanceof InquiryEvent$MiscInquiryEvent$VideoCaptureFallback);
    }

    public int hashCode() {
        return -1537901850;
    }

    @NotNull
    public String toString() {
        return "VideoCaptureFallback";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
