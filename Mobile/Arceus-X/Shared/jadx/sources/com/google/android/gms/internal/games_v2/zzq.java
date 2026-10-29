package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p125fb.C5507c2;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C5507c2();

    /* JADX INFO: renamed from: f */
    public final int f8057f;

    /* JADX INFO: renamed from: g */
    public final zzx f8058g;

    public zzq(int i10, zzx zzxVar) {
        this.f8057f = i10;
        this.f8058g = zzxVar;
    }

    /* JADX INFO: renamed from: v3 */
    public static zzq m9568v3(int i10) {
        return new zzq(i10, null);
    }

    /* JADX INFO: renamed from: w3 */
    public static zzq m9569w3(int i10, zzx zzxVar) {
        return new zzq(i10, zzxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.f8057f == zzqVar.f8057f && C8947k.m36026b(this.f8058g, zzqVar.f8058g);
    }

    public final int hashCode() {
        return C8947k.m36027c(Integer.valueOf(this.f8057f), this.f8058g);
    }

    public final String toString() {
        return C8947k.m36028d(this).m36029a("signInType", Integer.valueOf(this.f8057f)).m36029a("previousStepResolutionResult", this.f8058g).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f8057f);
        C9718b.m38476t(parcel, 2, this.f8058g, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final int zzc() {
        return this.f8057f;
    }

    public final boolean zzd() {
        return this.f8058g == null;
    }
}
