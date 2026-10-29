package n9;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 1, getServiceRequest.f5776f);
        o9.b.n(parcel, 2, getServiceRequest.f5777g);
        o9.b.n(parcel, 3, getServiceRequest.f5778h);
        o9.b.v(parcel, 4, getServiceRequest.f5779i, false);
        o9.b.m(parcel, 5, getServiceRequest.f5780j, false);
        o9.b.y(parcel, 6, getServiceRequest.f5781k, i10, false);
        o9.b.f(parcel, 7, getServiceRequest.f5782l, false);
        o9.b.t(parcel, 8, getServiceRequest.f5783m, i10, false);
        o9.b.y(parcel, 10, getServiceRequest.f5784n, i10, false);
        o9.b.y(parcel, 11, getServiceRequest.f5785o, i10, false);
        o9.b.c(parcel, 12, getServiceRequest.f5786p);
        o9.b.n(parcel, 13, getServiceRequest.f5787q);
        o9.b.c(parcel, 14, getServiceRequest.f5788r);
        o9.b.v(parcel, 15, getServiceRequest.v3(), false);
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        Scope[] scopeArr = GetServiceRequest.f5774t;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f5775u;
        Feature[] featureArr2 = featureArr;
        String strH = null;
        IBinder iBinderV = null;
        Account account = null;
        String strH2 = null;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        boolean zO = false;
        int iW4 = 0;
        boolean zO2 = false;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 2:
                    iW2 = o9.a.w(parcel, iU);
                    break;
                case 3:
                    iW3 = o9.a.w(parcel, iU);
                    break;
                case 4:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 5:
                    iBinderV = o9.a.v(parcel, iU);
                    break;
                case 6:
                    scopeArr = (Scope[]) o9.a.k(parcel, iU, Scope.CREATOR);
                    break;
                case 7:
                    bundle = o9.a.b(parcel, iU);
                    break;
                case 8:
                    account = (Account) o9.a.g(parcel, iU, Account.CREATOR);
                    break;
                case 9:
                default:
                    o9.a.C(parcel, iU);
                    break;
                case 10:
                    featureArr = (Feature[]) o9.a.k(parcel, iU, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) o9.a.k(parcel, iU, Feature.CREATOR);
                    break;
                case 12:
                    zO = o9.a.o(parcel, iU);
                    break;
                case 13:
                    iW4 = o9.a.w(parcel, iU);
                    break;
                case 14:
                    zO2 = o9.a.o(parcel, iU);
                    break;
                case 15:
                    strH2 = o9.a.h(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new GetServiceRequest(iW, iW2, iW3, strH, iBinderV, scopeArr, bundle, account, featureArr, featureArr2, zO, iW4, zO2, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}
