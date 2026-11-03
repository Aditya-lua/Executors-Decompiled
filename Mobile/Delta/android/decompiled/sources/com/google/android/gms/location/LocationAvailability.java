package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import lb.s;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new s();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public int f7440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public int f7441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public zzbo[] f7444j;

    public LocationAvailability(int i10, int i11, int i12, long j10, zzbo[] zzboVarArr) {
        this.f7443i = i10;
        this.f7440f = i11;
        this.f7441g = i12;
        this.f7442h = j10;
        this.f7444j = zzboVarArr;
    }

    public boolean equals(@NonNull Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f7440f == locationAvailability.f7440f && this.f7441g == locationAvailability.f7441g && this.f7442h == locationAvailability.f7442h && this.f7443i == locationAvailability.f7443i && Arrays.equals(this.f7444j, locationAvailability.f7444j)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f7443i), Integer.valueOf(this.f7440f), Integer.valueOf(this.f7441g), Long.valueOf(this.f7442h), this.f7444j);
    }

    @NonNull
    public String toString() {
        boolean zV3 = v3();
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("LocationAvailability[isLocationAvailable: ");
        sb2.append(zV3);
        sb2.append("]");
        return sb2.toString();
    }

    public boolean v3() {
        return this.f7443i < 1000;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, this.f7440f);
        b.n(parcel, 2, this.f7441g);
        b.r(parcel, 3, this.f7442h);
        b.n(parcel, 4, this.f7443i);
        b.y(parcel, 5, this.f7444j, i10, false);
        b.b(parcel, iA);
    }
}
