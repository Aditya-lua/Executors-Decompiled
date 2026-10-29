package com.google.android.gms.games.internal.p049v2.appshortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p243ka.C7521g;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new C7521g();

    /* JADX INFO: renamed from: f */
    public final String f7907f;

    /* JADX INFO: renamed from: g */
    public final PersistableBundle f7908g;

    /* JADX INFO: renamed from: h */
    public final Boolean f7909h;

    /* JADX INFO: renamed from: i */
    public final Boolean f7910i;

    public zzi(String str, PersistableBundle persistableBundle, Boolean bool, Boolean bool2) {
        this.f7907f = str;
        this.f7908g = persistableBundle;
        this.f7909h = bool;
        this.f7910i = bool2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7907f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, str, false);
        C9718b.m38476t(parcel, 2, this.f7908g, i10, false);
        C9718b.m38461e(parcel, 3, this.f7909h, false);
        C9718b.m38461e(parcel, 4, this.f7910i, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final String zza() {
        return this.f7907f;
    }
}
