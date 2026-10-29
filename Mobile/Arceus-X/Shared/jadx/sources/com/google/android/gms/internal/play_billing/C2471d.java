package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2471d extends C2504g implements InterfaceC2493f {
    public C2471d(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2493f
    /* JADX INFO: renamed from: D1 */
    public final void mo11343D1(int i10, String str, Bundle bundle, InterfaceC2460c interfaceC2460c) {
        Parcel parcelM11415r2 = m11415r2();
        parcelM11415r2.writeInt(25);
        parcelM11415r2.writeString(str);
        C2526i.m11467b(parcelM11415r2, bundle);
        C2526i.m11468c(parcelM11415r2, interfaceC2460c);
        m11417t2(2101, parcelM11415r2);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2493f
    /* JADX INFO: renamed from: O0 */
    public final Bundle mo11344O0(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelM11415r2 = m11415r2();
        parcelM11415r2.writeInt(9);
        parcelM11415r2.writeString(str);
        parcelM11415r2.writeString(str2);
        C2526i.m11467b(parcelM11415r2, bundle);
        Parcel parcelM11416s2 = m11416s2(12, parcelM11415r2);
        Bundle bundle2 = (Bundle) C2526i.m11466a(parcelM11416s2, Bundle.CREATOR);
        parcelM11416s2.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2493f
    /* JADX INFO: renamed from: T */
    public final int mo11345T(int i10, String str, String str2) {
        Parcel parcelM11415r2 = m11415r2();
        parcelM11415r2.writeInt(i10);
        parcelM11415r2.writeString(str);
        parcelM11415r2.writeString(str2);
        Parcel parcelM11416s2 = m11416s2(1, parcelM11415r2);
        int i11 = parcelM11416s2.readInt();
        parcelM11416s2.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2493f
    /* JADX INFO: renamed from: W1 */
    public final int mo11346W1(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelM11415r2 = m11415r2();
        parcelM11415r2.writeInt(i10);
        parcelM11415r2.writeString(str);
        parcelM11415r2.writeString(str2);
        C2526i.m11467b(parcelM11415r2, bundle);
        Parcel parcelM11416s2 = m11416s2(10, parcelM11415r2);
        int i11 = parcelM11416s2.readInt();
        parcelM11416s2.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2493f
    /* JADX INFO: renamed from: Y */
    public final Bundle mo11347Y(int i10, String str, String str2, String str3) {
        Parcel parcelM11415r2 = m11415r2();
        parcelM11415r2.writeInt(3);
        parcelM11415r2.writeString(str);
        parcelM11415r2.writeString(str2);
        parcelM11415r2.writeString(str3);
        Parcel parcelM11416s2 = m11416s2(4, parcelM11415r2);
        Bundle bundle = (Bundle) C2526i.m11466a(parcelM11416s2, Bundle.CREATOR);
        parcelM11416s2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2493f
    /* JADX INFO: renamed from: a2 */
    public final Bundle mo11348a2(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelM11415r2 = m11415r2();
        parcelM11415r2.writeInt(i10);
        parcelM11415r2.writeString(str);
        parcelM11415r2.writeString(str2);
        C2526i.m11467b(parcelM11415r2, bundle);
        C2526i.m11467b(parcelM11415r2, bundle2);
        Parcel parcelM11416s2 = m11416s2(901, parcelM11415r2);
        Bundle bundle3 = (Bundle) C2526i.m11466a(parcelM11416s2, Bundle.CREATOR);
        parcelM11416s2.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2493f
    /* JADX INFO: renamed from: e1 */
    public final Bundle mo11349e1(int i10, String str, String str2, String str3, String str4) {
        Parcel parcelM11415r2 = m11415r2();
        parcelM11415r2.writeInt(3);
        parcelM11415r2.writeString(str);
        parcelM11415r2.writeString(str2);
        parcelM11415r2.writeString(str3);
        parcelM11415r2.writeString(null);
        Parcel parcelM11416s2 = m11416s2(3, parcelM11415r2);
        Bundle bundle = (Bundle) C2526i.m11466a(parcelM11416s2, Bundle.CREATOR);
        parcelM11416s2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2493f
    /* JADX INFO: renamed from: l0 */
    public final Bundle mo11350l0(int i10, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelM11415r2 = m11415r2();
        parcelM11415r2.writeInt(i10);
        parcelM11415r2.writeString(str);
        parcelM11415r2.writeString(str2);
        parcelM11415r2.writeString(str3);
        parcelM11415r2.writeString(null);
        C2526i.m11467b(parcelM11415r2, bundle);
        Parcel parcelM11416s2 = m11416s2(8, parcelM11415r2);
        Bundle bundle2 = (Bundle) C2526i.m11466a(parcelM11416s2, Bundle.CREATOR);
        parcelM11416s2.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2493f
    /* JADX INFO: renamed from: o2 */
    public final Bundle mo11351o2(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelM11415r2 = m11415r2();
        parcelM11415r2.writeInt(9);
        parcelM11415r2.writeString(str);
        parcelM11415r2.writeString(str2);
        C2526i.m11467b(parcelM11415r2, bundle);
        Parcel parcelM11416s2 = m11416s2(902, parcelM11415r2);
        Bundle bundle2 = (Bundle) C2526i.m11466a(parcelM11416s2, Bundle.CREATOR);
        parcelM11416s2.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2493f
    /* JADX INFO: renamed from: u */
    public final int mo11352u(int i10, String str, String str2) {
        Parcel parcelM11415r2 = m11415r2();
        parcelM11415r2.writeInt(3);
        parcelM11415r2.writeString(str);
        parcelM11415r2.writeString(str2);
        Parcel parcelM11416s2 = m11416s2(5, parcelM11415r2);
        int i11 = parcelM11416s2.readInt();
        parcelM11416s2.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2493f
    /* JADX INFO: renamed from: u0 */
    public final Bundle mo11353u0(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelM11415r2 = m11415r2();
        parcelM11415r2.writeInt(i10);
        parcelM11415r2.writeString(str);
        parcelM11415r2.writeString(str2);
        parcelM11415r2.writeString(str3);
        C2526i.m11467b(parcelM11415r2, bundle);
        Parcel parcelM11416s2 = m11416s2(11, parcelM11415r2);
        Bundle bundle2 = (Bundle) C2526i.m11466a(parcelM11416s2, Bundle.CREATOR);
        parcelM11416s2.recycle();
        return bundle2;
    }
}
