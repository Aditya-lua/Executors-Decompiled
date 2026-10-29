package ja;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.player.zze;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        boolean zO5 = false;
        boolean zO6 = false;
        boolean zO7 = false;
        boolean zO8 = false;
        boolean zO9 = false;
        boolean zO10 = false;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 2:
                    zO2 = o9.a.o(parcel, iU);
                    break;
                case 3:
                    zO3 = o9.a.o(parcel, iU);
                    break;
                case 4:
                    zO4 = o9.a.o(parcel, iU);
                    break;
                case 5:
                    zO5 = o9.a.o(parcel, iU);
                    break;
                case 6:
                    zO6 = o9.a.o(parcel, iU);
                    break;
                case 7:
                    zO7 = o9.a.o(parcel, iU);
                    break;
                case 8:
                    zO8 = o9.a.o(parcel, iU);
                    break;
                case 9:
                    zO9 = o9.a.o(parcel, iU);
                    break;
                case 10:
                    zO10 = o9.a.o(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new zze(zO, zO2, zO3, zO4, zO5, zO6, zO7, zO8, zO9, zO10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zze[i10];
    }
}
