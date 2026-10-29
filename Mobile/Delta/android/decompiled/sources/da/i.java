package da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.zza;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    public static void a(zza zzaVar, Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 1, zzaVar.B1());
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            if (o9.a.n(iU) != 1) {
                o9.a.C(parcel, iU);
            } else {
                iW = o9.a.w(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zza(iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zza[i10];
    }
}
