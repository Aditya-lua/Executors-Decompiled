package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.zzg;
import p214ja.C7126e;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzh extends zzg {
    public static final Parcelable.Creator<zzh> CREATOR = new C7126e();

    /* JADX INFO: renamed from: f */
    public final String f7901f;

    public zzh(String str) {
        this.f7901f = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return C8947k.m36026b(this.f7901f, ((zzh) obj).f7901f);
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f7901f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7901f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, str, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
