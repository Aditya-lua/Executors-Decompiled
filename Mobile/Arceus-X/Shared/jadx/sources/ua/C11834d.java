package ua;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ua.d */
/* JADX INFO: loaded from: classes.dex */
public final class C11834d extends C11831a implements InterfaceC11836f {
    public C11834d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // ua.InterfaceC11836f
    /* JADX INFO: renamed from: B */
    public final boolean mo44221B(boolean z10) {
        Parcel parcelM44217r2 = m44217r2();
        C11833c.m44219a(parcelM44217r2, true);
        Parcel parcelM44218s2 = m44218s2(2, parcelM44217r2);
        boolean zM44220b = C11833c.m44220b(parcelM44218s2);
        parcelM44218s2.recycle();
        return zM44220b;
    }

    @Override // ua.InterfaceC11836f
    public final String zzc() {
        Parcel parcelM44218s2 = m44218s2(1, m44217r2());
        String string = parcelM44218s2.readString();
        parcelM44218s2.recycle();
        return string;
    }
}
