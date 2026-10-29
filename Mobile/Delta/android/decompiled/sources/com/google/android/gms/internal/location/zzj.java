package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.zzs;
import hb.w;
import java.util.Collections;
import java.util.List;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzs f6361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<ClientIdentity> f6362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    public static final List<ClientIdentity> f6359i = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final zzs f6360j = new zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new w();

    public zzj(zzs zzsVar, List<ClientIdentity> list, String str) {
        this.f6361f = zzsVar;
        this.f6362g = list;
        this.f6363h = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return k.b(this.f6361f, zzjVar.f6361f) && k.b(this.f6362g, zzjVar.f6362g) && k.b(this.f6363h, zzjVar.f6363h);
    }

    public final int hashCode() {
        return this.f6361f.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f6361f);
        String strValueOf2 = String.valueOf(this.f6362g);
        String str = this.f6363h;
        int length = strValueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + strValueOf2.length() + String.valueOf(str).length());
        sb2.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb2.append(strValueOf);
        sb2.append(", clients=");
        sb2.append(strValueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.t(parcel, 1, this.f6361f, i10, false);
        b.z(parcel, 2, this.f6362g, false);
        b.v(parcel, 3, this.f6363h, false);
        b.b(parcel, iA);
    }
}
