package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.AbstractBinderC8111n;
import lb.AbstractBinderC8114q;
import lb.InterfaceC8112o;
import lb.InterfaceC8115r;
import p166hb.C6329c;
import p166hb.C6343q;
import p166hb.InterfaceC6330d;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new C6343q();

    /* JADX INFO: renamed from: f */
    public final int f8073f;

    /* JADX INFO: renamed from: g */
    public final zzba f8074g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC8115r f8075h;

    /* JADX INFO: renamed from: i */
    public final PendingIntent f8076i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC8112o f8077j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC6330d f8078k;

    public zzbc(int i10, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f8073f = i10;
        this.f8074g = zzbaVar;
        InterfaceC6330d c6329c = null;
        this.f8075h = iBinder == null ? null : AbstractBinderC8114q.m33326s2(iBinder);
        this.f8076i = pendingIntent;
        this.f8077j = iBinder2 == null ? null : AbstractBinderC8111n.m33325s2(iBinder2);
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            c6329c = iInterfaceQueryLocalInterface instanceof InterfaceC6330d ? (InterfaceC6330d) iInterfaceQueryLocalInterface : new C6329c(iBinder3);
        }
        this.f8078k = c6329c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, lb.r] */
    /* JADX INFO: renamed from: a */
    public static zzbc m9571a(InterfaceC8115r interfaceC8115r, InterfaceC6330d interfaceC6330d) {
        if (interfaceC6330d == null) {
            interfaceC6330d = null;
        }
        return new zzbc(2, null, interfaceC8115r, null, null, interfaceC6330d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, lb.o] */
    /* JADX INFO: renamed from: v3 */
    public static zzbc m9572v3(InterfaceC8112o interfaceC8112o, InterfaceC6330d interfaceC6330d) {
        if (interfaceC6330d == null) {
            interfaceC6330d = null;
        }
        return new zzbc(2, null, null, null, interfaceC8112o, interfaceC6330d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f8073f);
        C9718b.m38476t(parcel, 2, this.f8074g, i10, false);
        InterfaceC8115r interfaceC8115r = this.f8075h;
        C9718b.m38469m(parcel, 3, interfaceC8115r == null ? null : interfaceC8115r.asBinder(), false);
        C9718b.m38476t(parcel, 4, this.f8076i, i10, false);
        InterfaceC8112o interfaceC8112o = this.f8077j;
        C9718b.m38469m(parcel, 5, interfaceC8112o == null ? null : interfaceC8112o.asBinder(), false);
        InterfaceC6330d interfaceC6330d = this.f8078k;
        C9718b.m38469m(parcel, 6, interfaceC6330d != null ? interfaceC6330d.asBinder() : null, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
