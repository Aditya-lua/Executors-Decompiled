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
    public final List f6260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f6261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f6262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f6263i;

    public zzg(List list, List list2, List list3, List list4) {
        this.f6260f = list;
        this.f6261g = list2;
        this.f6262h = list3;
        this.f6263i = list4;
    }

    public final List v3() {
        return this.f6262h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f6260f;
        int iA = b.a(parcel);
        b.x(parcel, 1, list, false);
        b.z(parcel, 2, this.f6261g, false);
        b.x(parcel, 3, this.f6262h, false);
        b.x(parcel, 4, this.f6263i, false);
        b.b(parcel, iA);
    }

    public final List zza() {
        return this.f6260f;
    }

    public final List zzb() {
        return this.f6261g;
    }

    public final List zzd() {
        return this.f6263i;
    }
}
