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
    public final zzs f6434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<ClientIdentity> f6435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    public static final List<ClientIdentity> f6432i = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final zzs f6433j = new zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new w();

    public zzj(zzs zzsVar, List<ClientIdentity> list, String str) {
        this.f6434f = zzsVar;
        this.f6435g = list;
        this.f6436h = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return k.b(this.f6434f, zzjVar.f6434f) && k.b(this.f6435g, zzjVar.f6435g) && k.b(this.f6436h, zzjVar.f6436h);
    }

    public final int hashCode() {
        return this.f6434f.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f6434f);
        String strValueOf2 = String.valueOf(this.f6435g);
        String str = this.f6436h;
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
        b.t(parcel, 1, this.f6434f, i10, false);
        b.z(parcel, 2, this.f6435g, false);
        b.v(parcel, 3, this.f6436h, false);
        b.b(parcel, iA);
    }
}
