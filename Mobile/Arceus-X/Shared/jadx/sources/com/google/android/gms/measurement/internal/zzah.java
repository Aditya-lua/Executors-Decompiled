package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8953m;
import p306nb.C9102h;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new C9102h();

    /* JADX INFO: renamed from: f */
    public String f9489f;

    /* JADX INFO: renamed from: g */
    public String f9490g;

    /* JADX INFO: renamed from: h */
    public zzpl f9491h;

    /* JADX INFO: renamed from: i */
    public long f9492i;

    /* JADX INFO: renamed from: j */
    public boolean f9493j;

    /* JADX INFO: renamed from: k */
    public String f9494k;

    /* JADX INFO: renamed from: l */
    public final zzbg f9495l;

    /* JADX INFO: renamed from: m */
    public long f9496m;

    /* JADX INFO: renamed from: n */
    public zzbg f9497n;

    /* JADX INFO: renamed from: o */
    public final long f9498o;

    /* JADX INFO: renamed from: p */
    public final zzbg f9499p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zzah(zzah zzahVar) {
        C8953m.m36047l(zzahVar);
        this.f9489f = zzahVar.f9489f;
        this.f9490g = zzahVar.f9490g;
        this.f9491h = zzahVar.f9491h;
        this.f9492i = zzahVar.f9492i;
        this.f9493j = zzahVar.f9493j;
        this.f9494k = zzahVar.f9494k;
        this.f9495l = zzahVar.f9495l;
        this.f9496m = zzahVar.f9496m;
        this.f9497n = zzahVar.f9497n;
        this.f9498o = zzahVar.f9498o;
        this.f9499p = zzahVar.f9499p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 2, this.f9489f, false);
        C9718b.m38478v(parcel, 3, this.f9490g, false);
        C9718b.m38476t(parcel, 4, this.f9491h, i10, false);
        C9718b.m38474r(parcel, 5, this.f9492i);
        C9718b.m38459c(parcel, 6, this.f9493j);
        C9718b.m38478v(parcel, 7, this.f9494k, false);
        C9718b.m38476t(parcel, 8, this.f9495l, i10, false);
        C9718b.m38474r(parcel, 9, this.f9496m);
        C9718b.m38476t(parcel, 10, this.f9497n, i10, false);
        C9718b.m38474r(parcel, 11, this.f9498o);
        C9718b.m38476t(parcel, 12, this.f9499p, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j10, boolean z10, String str3, zzbg zzbgVar, long j11, zzbg zzbgVar2, long j12, zzbg zzbgVar3) {
        this.f9489f = str;
        this.f9490g = str2;
        this.f9491h = zzplVar;
        this.f9492i = j10;
        this.f9493j = z10;
        this.f9494k = str3;
        this.f9495l = zzbgVar;
        this.f9496m = j11;
        this.f9497n = zzbgVar2;
        this.f9498o = j12;
        this.f9499p = zzbgVar3;
    }
}
