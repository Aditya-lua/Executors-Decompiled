package o9;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class o1 implements Parcelable.Creator {
    public static void a(h hVar, Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, hVar.f26965f);
        p9.c.n(parcel, 2, hVar.f26966g);
        p9.c.n(parcel, 3, hVar.f26967h);
        p9.c.v(parcel, 4, hVar.f26968i, false);
        p9.c.m(parcel, 5, hVar.f26969j, false);
        p9.c.y(parcel, 6, hVar.f26970k, i10, false);
        p9.c.f(parcel, 7, hVar.f26971l, false);
        p9.c.t(parcel, 8, hVar.f26972m, i10, false);
        p9.c.y(parcel, 10, hVar.f26973n, i10, false);
        p9.c.y(parcel, 11, hVar.f26974o, i10, false);
        p9.c.c(parcel, 12, hVar.f26975p);
        p9.c.n(parcel, 13, hVar.f26976q);
        p9.c.c(parcel, 14, hVar.f26977r);
        p9.c.v(parcel, 15, hVar.A3(), false);
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        Scope[] scopeArr = h.f26963t;
        Bundle bundle = new Bundle();
        k9.d[] dVarArr = h.f26964u;
        k9.d[] dVarArr2 = dVarArr;
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
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    iW = p9.b.w(parcel, iU);
                    break;
                case 2:
                    iW2 = p9.b.w(parcel, iU);
                    break;
                case 3:
                    iW3 = p9.b.w(parcel, iU);
                    break;
                case 4:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 5:
                    iBinderV = p9.b.v(parcel, iU);
                    break;
                case 6:
                    scopeArr = (Scope[]) p9.b.k(parcel, iU, Scope.CREATOR);
                    break;
                case 7:
                    bundle = p9.b.b(parcel, iU);
                    break;
                case 8:
                    account = (Account) p9.b.g(parcel, iU, Account.CREATOR);
                    break;
                case 9:
                default:
                    p9.b.C(parcel, iU);
                    break;
                case 10:
                    dVarArr = (k9.d[]) p9.b.k(parcel, iU, k9.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (k9.d[]) p9.b.k(parcel, iU, k9.d.CREATOR);
                    break;
                case 12:
                    zO = p9.b.o(parcel, iU);
                    break;
                case 13:
                    iW4 = p9.b.w(parcel, iU);
                    break;
                case 14:
                    zO2 = p9.b.o(parcel, iU);
                    break;
                case 15:
                    strH2 = p9.b.h(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new h(iW, iW2, iW3, strH, iBinderV, scopeArr, bundle, account, dVarArr, dVarArr2, zO, iW4, zO2, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
