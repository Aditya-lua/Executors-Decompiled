package com.google.android.gms.games.internal.p049v2.appshortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p243ka.C7520f;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new C7520f();

    /* JADX INFO: renamed from: f */
    public final List f7903f;

    /* JADX INFO: renamed from: g */
    public final List f7904g;

    /* JADX INFO: renamed from: h */
    public final List f7905h;

    /* JADX INFO: renamed from: i */
    public final List f7906i;

    public zzg(List list, List list2, List list3, List list4) {
        this.f7903f = list;
        this.f7904g = list2;
        this.f7905h = list3;
        this.f7906i = list4;
    }

    /* JADX INFO: renamed from: v3 */
    public final List m9451v3() {
        return this.f7905h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f7903f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38480x(parcel, 1, list, false);
        C9718b.m38482z(parcel, 2, this.f7904g, false);
        C9718b.m38480x(parcel, 3, this.f7905h, false);
        C9718b.m38480x(parcel, 4, this.f7906i, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final List zza() {
        return this.f7903f;
    }

    public final List zzb() {
        return this.f7904g;
    }

    public final List zzd() {
        return this.f7906i;
    }
}
