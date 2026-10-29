package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p191i9.C6698i;

/* JADX INFO: loaded from: classes.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C6698i();

    /* JADX INFO: renamed from: a */
    public Messenger f7372a;

    public zzd(IBinder iBinder) {
        this.f7372a = new Messenger(iBinder);
    }

    /* JADX INFO: renamed from: a */
    public final IBinder m9135a() {
        Messenger messenger = this.f7372a;
        messenger.getClass();
        return messenger.getBinder();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m9135a().equals(((zzd) obj).m9135a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9136f(Message message) throws RemoteException {
        Messenger messenger = this.f7372a;
        messenger.getClass();
        messenger.send(message);
    }

    public final int hashCode() {
        return m9135a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f7372a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
