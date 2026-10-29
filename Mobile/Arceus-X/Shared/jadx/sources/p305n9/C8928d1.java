package p305n9;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: n9.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8928d1 implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static void m35978a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, getServiceRequest.f7465f);
        C9718b.m38470n(parcel, 2, getServiceRequest.f7466g);
        C9718b.m38470n(parcel, 3, getServiceRequest.f7467h);
        C9718b.m38478v(parcel, 4, getServiceRequest.f7468i, false);
        C9718b.m38469m(parcel, 5, getServiceRequest.f7469j, false);
        C9718b.m38481y(parcel, 6, getServiceRequest.f7470k, i10, false);
        C9718b.m38462f(parcel, 7, getServiceRequest.f7471l, false);
        C9718b.m38476t(parcel, 8, getServiceRequest.f7472m, i10, false);
        C9718b.m38481y(parcel, 10, getServiceRequest.f7473n, i10, false);
        C9718b.m38481y(parcel, 11, getServiceRequest.f7474o, i10, false);
        C9718b.m38459c(parcel, 12, getServiceRequest.f7475p);
        C9718b.m38470n(parcel, 13, getServiceRequest.f7476q);
        C9718b.m38459c(parcel, 14, getServiceRequest.f7477r);
        C9718b.m38478v(parcel, 15, getServiceRequest.m9209v3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        Scope[] scopeArr = GetServiceRequest.f7463t;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f7464u;
        Feature[] featureArr2 = featureArr;
        String strM38434h = null;
        IBinder iBinderM38448v = null;
        Account account = null;
        String strM38434h2 = null;
        int iM38449w = 0;
        int iM38449w2 = 0;
        int iM38449w3 = 0;
        boolean zM38441o = false;
        int iM38449w4 = 0;
        boolean zM38441o2 = false;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 2:
                    iM38449w2 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 3:
                    iM38449w3 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 4:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 5:
                    iBinderM38448v = C9717a.m38448v(parcel, iM38447u);
                    break;
                case 6:
                    scopeArr = (Scope[]) C9717a.m38437k(parcel, iM38447u, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C9717a.m38428b(parcel, iM38447u);
                    break;
                case 8:
                    account = (Account) C9717a.m38433g(parcel, iM38447u, Account.CREATOR);
                    break;
                case 9:
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
                case 10:
                    featureArr = (Feature[]) C9717a.m38437k(parcel, iM38447u, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) C9717a.m38437k(parcel, iM38447u, Feature.CREATOR);
                    break;
                case 12:
                    zM38441o = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 13:
                    iM38449w4 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 14:
                    zM38441o2 = C9717a.m38441o(parcel, iM38447u);
                    break;
                case 15:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new GetServiceRequest(iM38449w, iM38449w2, iM38449w3, strM38434h, iBinderM38448v, scopeArr, bundle, account, featureArr, featureArr2, zM38441o, iM38449w4, zM38441o2, strM38434h2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}
