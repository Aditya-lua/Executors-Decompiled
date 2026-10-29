package com.google.android.gms.internal.games_v2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fb.h2;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new h2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Intent f6340f;

    public zzx(Intent intent) {
        this.f6340f = intent;
    }

    public static zzx a(Intent intent) {
        return new zzx(intent);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzx) {
            return k.b(this.f6340f, ((zzx) obj).f6340f);
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.f6340f;
        if (intent != null) {
            return intent.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return k.d(this).a("resultData", this.f6340f).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Intent intent = this.f6340f;
        int iA = b.a(parcel);
        b.t(parcel, 1, intent, i10, false);
        b.b(parcel, iA);
    }
}
