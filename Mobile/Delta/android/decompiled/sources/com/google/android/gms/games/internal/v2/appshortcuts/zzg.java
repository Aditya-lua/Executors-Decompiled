package com.google.android.gms.games.internal.v2.appshortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import ka.f;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f6187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f6188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f6189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f6190i;

    public zzg(List list, List list2, List list3, List list4) {
        this.f6187f = list;
        this.f6188g = list2;
        this.f6189h = list3;
        this.f6190i = list4;
    }

    public final List v3() {
        return this.f6189h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f6187f;
        int iA = b.a(parcel);
        b.x(parcel, 1, list, false);
        b.z(parcel, 2, this.f6188g, false);
        b.x(parcel, 3, this.f6189h, false);
        b.x(parcel, 4, this.f6190i, false);
        b.b(parcel, iA);
    }

    public final List zza() {
        return this.f6187f;
    }

    public final List zzb() {
        return this.f6188g;
    }

    public final List zzd() {
        return this.f6190i;
    }
}
