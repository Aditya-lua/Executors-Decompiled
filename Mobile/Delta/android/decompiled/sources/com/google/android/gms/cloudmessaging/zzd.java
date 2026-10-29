package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import i9.i;

/* JADX INFO: loaded from: classes.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Messenger f5687a;

    public zzd(IBinder iBinder) {
        this.f5687a = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f5687a;
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
            return a().equals(((zzd) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final void f(Message message) throws RemoteException {
        Messenger messenger = this.f5687a;
        messenger.getClass();
        messenger.send(message);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f5687a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
