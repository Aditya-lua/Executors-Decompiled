package com.withpersona.sdk2.inquiry.types.collected_data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;", "Landroid/os/Parcelable;", "Ljava/util/Date;", "dateOfBirth", "expirationDate", "<init>", "(Ljava/util/Date;Ljava/util/Date;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Date;", "getDateOfBirth", "()Ljava/util/Date;", "b", "getExpirationDate", "inquiry-types_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class CollectedGovernmentIdDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CollectedGovernmentIdDetails> CREATOR = new C4119a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final Date dateOfBirth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final Date expirationDate;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.types.collected_data.CollectedGovernmentIdDetails$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4119a implements Parcelable.Creator<CollectedGovernmentIdDetails> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CollectedGovernmentIdDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CollectedGovernmentIdDetails((Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CollectedGovernmentIdDetails[] newArray(int i10) {
            return new CollectedGovernmentIdDetails[i10];
        }
    }

    public CollectedGovernmentIdDetails(@Nullable Date date, @Nullable Date date2) {
        this.dateOfBirth = date;
        this.expirationDate = date2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectedGovernmentIdDetails)) {
            return false;
        }
        CollectedGovernmentIdDetails collectedGovernmentIdDetails = (CollectedGovernmentIdDetails) other;
        return Intrinsics.m31980c(this.dateOfBirth, collectedGovernmentIdDetails.dateOfBirth) && Intrinsics.m31980c(this.expirationDate, collectedGovernmentIdDetails.expirationDate);
    }

    public int hashCode() {
        Date date = this.dateOfBirth;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.expirationDate;
        return iHashCode + (date2 != null ? date2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CollectedGovernmentIdDetails(dateOfBirth=" + this.dateOfBirth + ", expirationDate=" + this.expirationDate + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.dateOfBirth);
        dest.writeSerializable(this.expirationDate);
    }
}
