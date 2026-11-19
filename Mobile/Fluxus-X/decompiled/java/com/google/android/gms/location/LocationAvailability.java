package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import mb.s;
import mb.z;
import o9.q;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new s();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public int f7366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public int f7367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z[] f7370j;

    public LocationAvailability(int i10, int i11, int i12, long j10, z[] zVarArr) {
        this.f7369i = i10;
        this.f7366f = i11;
        this.f7367g = i12;
        this.f7368h = j10;
        this.f7370j = zVarArr;
    }

    public boolean A3() {
        return this.f7369i < 1000;
    }

    public boolean equals(@NonNull Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f7366f == locationAvailability.f7366f && this.f7367g == locationAvailability.f7367g && this.f7368h == locationAvailability.f7368h && this.f7369i == locationAvailability.f7369i && Arrays.equals(this.f7370j, locationAvailability.f7370j)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return q.c(Integer.valueOf(this.f7369i), Integer.valueOf(this.f7366f), Integer.valueOf(this.f7367g), Long.valueOf(this.f7368h), this.f7370j);
    }

    @NonNull
    public String toString() {
        boolean zA3 = A3();
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("LocationAvailability[isLocationAvailable: ");
        sb2.append(zA3);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, this.f7366f);
        c.n(parcel, 2, this.f7367g);
        c.r(parcel, 3, this.f7368h);
        c.n(parcel, 4, this.f7369i);
        c.y(parcel, 5, this.f7370j, i10, false);
        c.b(parcel, iA);
    }
}
