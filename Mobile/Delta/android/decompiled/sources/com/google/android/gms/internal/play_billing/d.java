package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final void E1(int i10, String str, Bundle bundle, c cVar) {
        Parcel parcelR2 = r2();
        parcelR2.writeInt(25);
        parcelR2.writeString(str);
        i.b(parcelR2, bundle);
        i.c(parcelR2, cVar);
        t2(2101, parcelR2);
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final Bundle R0(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelR2 = r2();
        parcelR2.writeInt(9);
        parcelR2.writeString(str);
        parcelR2.writeString(str2);
        i.b(parcelR2, bundle);
        Parcel parcelS2 = s2(12, parcelR2);
        Bundle bundle2 = (Bundle) i.a(parcelS2, Bundle.CREATOR);
        parcelS2.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final int V(int i10, String str, String str2) {
        Parcel parcelR2 = r2();
        parcelR2.writeInt(i10);
        parcelR2.writeString(str);
        parcelR2.writeString(str2);
        Parcel parcelS2 = s2(1, parcelR2);
        int i11 = parcelS2.readInt();
        parcelS2.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final int W1(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelR2 = r2();
        parcelR2.writeInt(i10);
        parcelR2.writeString(str);
        parcelR2.writeString(str2);
        i.b(parcelR2, bundle);
        Parcel parcelS2 = s2(10, parcelR2);
        int i11 = parcelS2.readInt();
        parcelS2.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final Bundle a0(int i10, String str, String str2, String str3) {
        Parcel parcelR2 = r2();
        parcelR2.writeInt(3);
        parcelR2.writeString(str);
        parcelR2.writeString(str2);
        parcelR2.writeString(str3);
        Parcel parcelS2 = s2(4, parcelR2);
        Bundle bundle = (Bundle) i.a(parcelS2, Bundle.CREATOR);
        parcelS2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final Bundle a2(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelR2 = r2();
        parcelR2.writeInt(i10);
        parcelR2.writeString(str);
        parcelR2.writeString(str2);
        i.b(parcelR2, bundle);
        i.b(parcelR2, bundle2);
        Parcel parcelS2 = s2(901, parcelR2);
        Bundle bundle3 = (Bundle) i.a(parcelS2, Bundle.CREATOR);
        parcelS2.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final Bundle i1(int i10, String str, String str2, String str3, String str4) {
        Parcel parcelR2 = r2();
        parcelR2.writeInt(3);
        parcelR2.writeString(str);
        parcelR2.writeString(str2);
        parcelR2.writeString(str3);
        parcelR2.writeString(null);
        Parcel parcelS2 = s2(3, parcelR2);
        Bundle bundle = (Bundle) i.a(parcelS2, Bundle.CREATOR);
        parcelS2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final Bundle o0(int i10, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelR2 = r2();
        parcelR2.writeInt(i10);
        parcelR2.writeString(str);
        parcelR2.writeString(str2);
        parcelR2.writeString(str3);
        parcelR2.writeString(null);
        i.b(parcelR2, bundle);
        Parcel parcelS2 = s2(8, parcelR2);
        Bundle bundle2 = (Bundle) i.a(parcelS2, Bundle.CREATOR);
        parcelS2.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final Bundle o2(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelR2 = r2();
        parcelR2.writeInt(9);
        parcelR2.writeString(str);
        parcelR2.writeString(str2);
        i.b(parcelR2, bundle);
        Parcel parcelS2 = s2(902, parcelR2);
        Bundle bundle2 = (Bundle) i.a(parcelS2, Bundle.CREATOR);
        parcelS2.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final int u(int i10, String str, String str2) {
        Parcel parcelR2 = r2();
        parcelR2.writeInt(3);
        parcelR2.writeString(str);
        parcelR2.writeString(str2);
        Parcel parcelS2 = s2(5, parcelR2);
        int i11 = parcelS2.readInt();
        parcelS2.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final Bundle w0(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelR2 = r2();
        parcelR2.writeInt(i10);
        parcelR2.writeString(str);
        parcelR2.writeString(str2);
        parcelR2.writeString(str3);
        i.b(parcelR2, bundle);
        Parcel parcelS2 = s2(11, parcelR2);
        Bundle bundle2 = (Bundle) i.a(parcelS2, Bundle.CREATOR);
        parcelS2.recycle();
        return bundle2;
    }
}
