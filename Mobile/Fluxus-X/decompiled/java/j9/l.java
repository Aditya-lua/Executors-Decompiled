package j9;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Messenger f20231a;

    public l(IBinder iBinder) {
        this.f20231a = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f20231a;
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
            return a().equals(((l) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final void f(Message message) throws RemoteException {
        Messenger messenger = this.f20231a;
        messenger.getClass();
        messenger.send(message);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f20231a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
