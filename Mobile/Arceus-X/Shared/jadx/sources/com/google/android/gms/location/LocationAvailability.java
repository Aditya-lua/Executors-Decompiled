package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import lb.C8116s;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C8116s();

    /* JADX INFO: renamed from: f */
    @Deprecated
    public int f9443f;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public int f9444g;

    /* JADX INFO: renamed from: h */
    public long f9445h;

    /* JADX INFO: renamed from: i */
    public int f9446i;

    /* JADX INFO: renamed from: j */
    public zzbo[] f9447j;

    public LocationAvailability(int i10, int i11, int i12, long j10, zzbo[] zzboVarArr) {
        this.f9446i = i10;
        this.f9443f = i11;
        this.f9444g = i12;
        this.f9445h = j10;
        this.f9447j = zzboVarArr;
    }

    public boolean equals(@NonNull Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f9443f == locationAvailability.f9443f && this.f9444g == locationAvailability.f9444g && this.f9445h == locationAvailability.f9445h && this.f9446i == locationAvailability.f9446i && Arrays.equals(this.f9447j, locationAvailability.f9447j)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C8947k.m36027c(Integer.valueOf(this.f9446i), Integer.valueOf(this.f9443f), Integer.valueOf(this.f9444g), Long.valueOf(this.f9445h), this.f9447j);
    }

    @NonNull
    public String toString() {
        boolean zM11864v3 = m11864v3();
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("LocationAvailability[isLocationAvailable: ");
        sb2.append(zM11864v3);
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m11864v3() {
        return this.f9446i < 1000;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f9443f);
        C9718b.m38470n(parcel, 2, this.f9444g);
        C9718b.m38474r(parcel, 3, this.f9445h);
        C9718b.m38470n(parcel, 4, this.f9446i);
        C9718b.m38481y(parcel, 5, this.f9447j, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
