package p166hb;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.internal.location.zzbc;
import p325o9.C9717a;

/* JADX INFO: renamed from: hb.q */
/* JADX INFO: loaded from: classes.dex */
public final class C6343q implements Parcelable.Creator<zzbc> {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 1;
        zzba zzbaVar = null;
        IBinder iBinderM38448v = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderM38448v2 = null;
        IBinder iBinderM38448v3 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 2:
                    zzbaVar = (zzba) C9717a.m38433g(parcel, iM38447u, zzba.CREATOR);
                    break;
                case 3:
                    iBinderM38448v = C9717a.m38448v(parcel, iM38447u);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C9717a.m38433g(parcel, iM38447u, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderM38448v2 = C9717a.m38448v(parcel, iM38447u);
                    break;
                case 6:
                    iBinderM38448v3 = C9717a.m38448v(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzbc(iM38449w, zzbaVar, iBinderM38448v, pendingIntent, iBinderM38448v2, iBinderM38448v3);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc[] newArray(int i10) {
        return new zzbc[i10];
    }
}
