package p214ja;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.player.zze;
import p325o9.C9717a;

/* JADX INFO: renamed from: ja.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7124c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        boolean zM38441o3 = false;
        boolean zM38441o4 = false;
        boolean zM38441o5 = false;
        boolean zM38441o6 = false;
        boolean zM38441o7 = false;
        boolean zM38441o8 = false;
        boolean zM38441o9 = false;
        boolean zM38441o10 = false;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 2:
                    zM38441o2 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 3:
                    zM38441o3 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 4:
                    zM38441o4 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 5:
                    zM38441o5 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 6:
                    zM38441o6 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 7:
                    zM38441o7 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 8:
                    zM38441o8 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 9:
                    zM38441o9 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 10:
                    zM38441o10 = C9717a.m38441o(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zze(zM38441o, zM38441o2, zM38441o3, zM38441o4, zM38441o5, zM38441o6, zM38441o7, zM38441o8, zM38441o9, zM38441o10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zze[i10];
    }
}
