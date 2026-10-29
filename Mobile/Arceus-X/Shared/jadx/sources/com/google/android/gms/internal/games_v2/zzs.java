package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p125fb.C5511d2;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C5511d2();

    /* JADX INFO: renamed from: f */
    public final String f8059f;

    public zzs(String str) {
        this.f8059f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            return C8947k.m36026b(this.f8059f, ((zzs) obj).f8059f);
        }
        return false;
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f8059f);
    }

    public final String toString() {
        return C8947k.m36028d(this).m36029a("gameRunToken", this.f8059f).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f8059f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, str, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final String zza() {
        return this.f8059f;
    }
}
