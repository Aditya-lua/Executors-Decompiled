package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.zzg;
import ja.e;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzh extends zzg {
    public static final Parcelable.Creator<zzh> CREATOR = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6258f;

    public zzh(String str) {
        this.f6258f = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return k.b(this.f6258f, ((zzh) obj).f6258f);
    }

    public final int hashCode() {
        return k.c(this.f6258f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6258f;
        int iA = b.a(parcel);
        b.v(parcel, 1, str, false);
        b.b(parcel, iA);
    }
}
