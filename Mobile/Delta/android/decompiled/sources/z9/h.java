package z9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import db.o;

/* JADX INFO: loaded from: classes.dex */
public final class h extends db.a implements IInterface {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final y9.a t2(y9.a aVar, String str, int i10) {
        Parcel parcelS2 = s2();
        o.d(parcelS2, aVar);
        parcelS2.writeString(str);
        parcelS2.writeInt(i10);
        Parcel parcelR2 = r2(2, parcelS2);
        y9.a aVarS2 = y9.a.AbstractBinderC0656a.s2(parcelR2.readStrongBinder());
        parcelR2.recycle();
        return aVarS2;
    }

    public final int u2(y9.a aVar, String str, boolean z10) {
        Parcel parcelS2 = s2();
        o.d(parcelS2, aVar);
        parcelS2.writeString(str);
        parcelS2.writeInt(z10 ? 1 : 0);
        Parcel parcelR2 = r2(3, parcelS2);
        int i10 = parcelR2.readInt();
        parcelR2.recycle();
        return i10;
    }

    public final y9.a v2(y9.a aVar, String str, int i10) {
        Parcel parcelS2 = s2();
        o.d(parcelS2, aVar);
        parcelS2.writeString(str);
        parcelS2.writeInt(i10);
        Parcel parcelR2 = r2(4, parcelS2);
        y9.a aVarS2 = y9.a.AbstractBinderC0656a.s2(parcelR2.readStrongBinder());
        parcelR2.recycle();
        return aVarS2;
    }

    public final int w2(y9.a aVar, String str, boolean z10) {
        Parcel parcelS2 = s2();
        o.d(parcelS2, aVar);
        parcelS2.writeString(str);
        parcelS2.writeInt(z10 ? 1 : 0);
        Parcel parcelR2 = r2(5, parcelS2);
        int i10 = parcelR2.readInt();
        parcelR2.recycle();
        return i10;
    }

    public final int x2() {
        Parcel parcelR2 = r2(6, s2());
        int i10 = parcelR2.readInt();
        parcelR2.recycle();
        return i10;
    }

    public final y9.a y2(y9.a aVar, String str, boolean z10, long j10) {
        Parcel parcelS2 = s2();
        o.d(parcelS2, aVar);
        parcelS2.writeString(str);
        parcelS2.writeInt(z10 ? 1 : 0);
        parcelS2.writeLong(j10);
        Parcel parcelR2 = r2(7, parcelS2);
        y9.a aVarS2 = y9.a.AbstractBinderC0656a.s2(parcelR2.readStrongBinder());
        parcelR2.recycle();
        return aVarS2;
    }

    public final y9.a z2(y9.a aVar, String str, int i10, y9.a aVar2) {
        Parcel parcelS2 = s2();
        o.d(parcelS2, aVar);
        parcelS2.writeString(str);
        parcelS2.writeInt(i10);
        o.d(parcelS2, aVar2);
        Parcel parcelR2 = r2(8, parcelS2);
        y9.a aVarS2 = y9.a.AbstractBinderC0656a.s2(parcelR2.readStrongBinder());
        parcelR2.recycle();
        return aVarS2;
    }
}
