package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lb.C8118u;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: renamed from: f */
    public final List<Location> f9458f;

    /* JADX INFO: renamed from: g */
    public static final List<Location> f9457g = Collections.EMPTY_LIST;

    @NonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new C8118u();

    public LocationResult(List<Location> list) {
        this.f9458f = list;
    }

    public boolean equals(@NonNull Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f9458f.size() != this.f9458f.size()) {
            return false;
        }
        Iterator<Location> it = locationResult.f9458f.iterator();
        Iterator<Location> it2 = this.f9458f.iterator();
        while (it.hasNext()) {
            if (it2.next().getTime() != it.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator<Location> it = this.f9458f.iterator();
        int i10 = 17;
        while (it.hasNext()) {
            long time = it.next().getTime();
            i10 = (i10 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i10;
    }

    @NonNull
    public String toString() {
        String strValueOf = String.valueOf(this.f9458f);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 27);
        sb2.append("LocationResult[locations: ");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public List<Location> m11866v3() {
        return this.f9458f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38482z(parcel, 1, m11866v3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
