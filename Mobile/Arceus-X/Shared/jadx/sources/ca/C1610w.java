package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.zzf;
import com.google.android.gms.fido.fido2.api.common.zzh;
import p325o9.C9717a;

/* JADX INFO: renamed from: ca.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1610w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        UvmEntries uvmEntries = null;
        zzf zzfVar = null;
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
        zzh zzhVar = null;
        String strM38434h = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                uvmEntries = (UvmEntries) C9717a.m38433g(parcel, iM38447u, UvmEntries.CREATOR);
            } else if (iM38440n == 2) {
                zzfVar = (zzf) C9717a.m38433g(parcel, iM38447u, zzf.CREATOR);
            } else if (iM38440n == 3) {
                authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) C9717a.m38433g(parcel, iM38447u, AuthenticationExtensionsCredPropsOutputs.CREATOR);
            } else if (iM38440n == 4) {
                zzhVar = (zzh) C9717a.m38433g(parcel, iM38447u, zzh.CREATOR);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar, strM38434h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticationExtensionsClientOutputs[i10];
    }
}
