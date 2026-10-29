package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.appindex.zzk;
import p271lf.C8134f;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new C8134f();

    /* JADX INFO: renamed from: f */
    public final int f11170f;

    /* JADX INFO: renamed from: g */
    public final Thing[] f11171g;

    /* JADX INFO: renamed from: h */
    public final String[] f11172h;

    /* JADX INFO: renamed from: i */
    public final String[] f11173i;

    /* JADX INFO: renamed from: j */
    public final zzk f11174j;

    /* JADX INFO: renamed from: k */
    public final String f11175k;

    /* JADX INFO: renamed from: l */
    public final String f11176l;

    public zzg(int i10, Thing[] thingArr, String[] strArr, String[] strArr2, zzk zzkVar, String str, String str2) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7) {
            i10 = 0;
        }
        this.f11170f = i10;
        this.f11171g = thingArr;
        this.f11172h = strArr;
        this.f11173i = strArr2;
        this.f11174j = zzkVar;
        this.f11175k = str;
        this.f11176l = str2;
    }

    /* JADX INFO: renamed from: v3 */
    public static zzg m14389v3() {
        return new zzg(4, null, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: w3 */
    public static zzg m14390w3(Thing... thingArr) {
        return new zzg(1, thingArr, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f11170f);
        C9718b.m38481y(parcel, 2, this.f11171g, i10, false);
        C9718b.m38479w(parcel, 3, this.f11172h, false);
        C9718b.m38479w(parcel, 5, this.f11173i, false);
        C9718b.m38476t(parcel, 6, this.f11174j, i10, false);
        C9718b.m38478v(parcel, 7, this.f11175k, false);
        C9718b.m38478v(parcel, 8, this.f11176l, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
