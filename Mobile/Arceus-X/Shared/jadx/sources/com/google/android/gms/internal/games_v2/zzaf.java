package com.google.android.gms.internal.games_v2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.zzg;
import p125fb.C5508d;
import p125fb.C5512e;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf extends zzg {
    public static final Parcelable.Creator<zzaf> CREATOR = new C5512e();

    /* JADX INFO: renamed from: f */
    public final Bundle f8055f;

    /* JADX INFO: renamed from: g */
    public final IBinder f8056g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zzaf(Bundle bundle, IBinder iBinder) {
        this.f8055f = bundle;
        this.f8056g = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f8055f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38462f(parcel, 1, bundle, false);
        C9718b.m38469m(parcel, 2, this.f8056g, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public zzaf(C5508d c5508d) {
        this.f8055f = c5508d.m25170a();
        this.f8056g = c5508d.f21277a;
    }
}
