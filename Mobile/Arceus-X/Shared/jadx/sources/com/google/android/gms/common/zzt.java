package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p213j9.AbstractBinderC7119x;
import p213j9.BinderC7120y;
import p213j9.C7096f0;
import p305n9.AbstractBinderC8952l1;
import p325o9.C9718b;
import p571y9.BinderC13134b;
import p571y9.InterfaceC13133a;

/* JADX INFO: loaded from: classes.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new C7096f0();

    /* JADX INFO: renamed from: f */
    public final String f7538f;

    /* JADX INFO: renamed from: g */
    public final AbstractBinderC7119x f7539g;

    /* JADX INFO: renamed from: h */
    public final boolean f7540h;

    /* JADX INFO: renamed from: i */
    public final boolean f7541i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zzt(String str, AbstractBinderC7119x abstractBinderC7119x, boolean z10, boolean z11) {
        this.f7538f = str;
        this.f7539g = abstractBinderC7119x;
        this.f7540h = z10;
        this.f7541i = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7538f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, str, false);
        AbstractBinderC7119x abstractBinderC7119x = this.f7539g;
        if (abstractBinderC7119x == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC7119x = null;
        }
        C9718b.m38469m(parcel, 2, abstractBinderC7119x, false);
        C9718b.m38459c(parcel, 3, this.f7540h);
        C9718b.m38459c(parcel, 4, this.f7541i);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public zzt(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f7538f = str;
        BinderC7120y binderC7120y = null;
        if (iBinder != null) {
            try {
                InterfaceC13133a interfaceC13133aZzd = AbstractBinderC8952l1.m36035s2(iBinder).zzd();
                byte[] bArr = interfaceC13133aZzd == null ? null : (byte[]) BinderC13134b.m48742t2(interfaceC13133aZzd);
                if (bArr != null) {
                    binderC7120y = new BinderC7120y(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f7539g = binderC7120y;
        this.f7540h = z10;
        this.f7541i = z11;
    }
}
