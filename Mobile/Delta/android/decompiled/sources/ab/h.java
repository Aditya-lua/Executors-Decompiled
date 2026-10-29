package ab;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.StoreBytesData;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a implements IInterface {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    public final void t2(j jVar, DeleteBytesRequest deleteBytesRequest) {
        Parcel parcelR2 = r2();
        e.c(parcelR2, jVar);
        e.b(parcelR2, deleteBytesRequest);
        s2(13, parcelR2);
    }

    public final void u2(l lVar) {
        Parcel parcelR2 = r2();
        e.c(parcelR2, lVar);
        s2(11, parcelR2);
    }

    public final void v2(n nVar, RetrieveBytesRequest retrieveBytesRequest) {
        Parcel parcelR2 = r2();
        e.c(parcelR2, nVar);
        e.b(parcelR2, retrieveBytesRequest);
        s2(12, parcelR2);
    }

    public final void w2(p pVar, StoreBytesData storeBytesData) {
        Parcel parcelR2 = r2();
        e.c(parcelR2, pVar);
        e.b(parcelR2, storeBytesData);
        s2(10, parcelR2);
    }
}
