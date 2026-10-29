package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.BinderC8108k;
import lb.InterfaceC8109l;
import p166hb.C6329c;
import p166hb.C6350x;
import p166hb.InterfaceC6330d;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C6350x();

    /* JADX INFO: renamed from: f */
    public final int f8084f;

    /* JADX INFO: renamed from: g */
    public final zzj f8085g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC8109l f8086h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC6330d f8087i;

    public zzl(int i10, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        this.f8084f = i10;
        this.f8085g = zzjVar;
        InterfaceC6330d c6329c = null;
        this.f8086h = iBinder == null ? null : BinderC8108k.m33324s2(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            c6329c = iInterfaceQueryLocalInterface instanceof InterfaceC6330d ? (InterfaceC6330d) iInterfaceQueryLocalInterface : new C6329c(iBinder2);
        }
        this.f8087i = c6329c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f8084f);
        C9718b.m38476t(parcel, 2, this.f8085g, i10, false);
        InterfaceC8109l interfaceC8109l = this.f8086h;
        C9718b.m38469m(parcel, 3, interfaceC8109l == null ? null : interfaceC8109l.asBinder(), false);
        InterfaceC6330d interfaceC6330d = this.f8087i;
        C9718b.m38469m(parcel, 4, interfaceC6330d != null ? interfaceC6330d.asBinder() : null, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
