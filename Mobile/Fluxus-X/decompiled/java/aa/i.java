package aa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import eb.o;

/* JADX INFO: loaded from: classes.dex */
public final class i extends eb.a implements IInterface {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final z9.a t2(z9.a aVar, String str, int i10, z9.a aVar2) {
        Parcel parcelS2 = s2();
        o.d(parcelS2, aVar);
        parcelS2.writeString(str);
        parcelS2.writeInt(i10);
        o.d(parcelS2, aVar2);
        Parcel parcelR2 = r2(2, parcelS2);
        z9.a aVarS2 = z9.a.AbstractBinderC0786a.s2(parcelR2.readStrongBinder());
        parcelR2.recycle();
        return aVarS2;
    }

    public final z9.a u2(z9.a aVar, String str, int i10, z9.a aVar2) {
        Parcel parcelS2 = s2();
        o.d(parcelS2, aVar);
        parcelS2.writeString(str);
        parcelS2.writeInt(i10);
        o.d(parcelS2, aVar2);
        Parcel parcelR2 = r2(3, parcelS2);
        z9.a aVarS2 = z9.a.AbstractBinderC0786a.s2(parcelR2.readStrongBinder());
        parcelR2.recycle();
        return aVarS2;
    }
}
