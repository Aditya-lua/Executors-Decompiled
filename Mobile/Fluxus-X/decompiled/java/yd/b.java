package yd;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public abstract class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new f();

    public abstract PendingIntent a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(a(), 0);
        parcel.writeInt(zzb() ? 1 : 0);
    }

    public abstract boolean zzb();
}
