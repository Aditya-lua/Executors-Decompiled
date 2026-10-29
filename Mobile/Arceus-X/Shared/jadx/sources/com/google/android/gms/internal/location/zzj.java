package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.zzs;
import java.util.Collections;
import java.util.List;
import p166hb.C6349w;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: f */
    public final zzs f8081f;

    /* JADX INFO: renamed from: g */
    public final List<ClientIdentity> f8082g;

    /* JADX INFO: renamed from: h */
    public final String f8083h;

    /* JADX INFO: renamed from: i */
    @VisibleForTesting
    public static final List<ClientIdentity> f8079i = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: j */
    public static final zzs f8080j = new zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new C6349w();

    public zzj(zzs zzsVar, List<ClientIdentity> list, String str) {
        this.f8081f = zzsVar;
        this.f8082g = list;
        this.f8083h = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return C8947k.m36026b(this.f8081f, zzjVar.f8081f) && C8947k.m36026b(this.f8082g, zzjVar.f8082g) && C8947k.m36026b(this.f8083h, zzjVar.f8083h);
    }

    public final int hashCode() {
        return this.f8081f.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8081f);
        String strValueOf2 = String.valueOf(this.f8082g);
        String str = this.f8083h;
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
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, this.f8081f, i10, false);
        C9718b.m38482z(parcel, 2, this.f8082g, false);
        C9718b.m38478v(parcel, 3, this.f8083h, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
