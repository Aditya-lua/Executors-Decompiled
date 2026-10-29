package com.google.android.gms.games.internal.v2.appshortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ka.g;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PersistableBundle f6192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f6193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f6194i;

    public zzi(String str, PersistableBundle persistableBundle, Boolean bool, Boolean bool2) {
        this.f6191f = str;
        this.f6192g = persistableBundle;
        this.f6193h = bool;
        this.f6194i = bool2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f6191f;
        int iA = b.a(parcel);
        b.v(parcel, 1, str, false);
        b.t(parcel, 2, this.f6192g, i10, false);
        b.e(parcel, 3, this.f6193h, false);
        b.e(parcel, 4, this.f6194i, false);
        b.b(parcel, iA);
    }

    public final String zza() {
        return this.f6191f;
    }
}
