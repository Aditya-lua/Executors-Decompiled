package p073da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.zza;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: da.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4505i implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static void m22468a(zza zzaVar, Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, zzaVar.mo9366B1());
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            if (C9717a.m38440n(iM38447u) != 1) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zza(iM38449w);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zza[i10];
    }
}
