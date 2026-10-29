package p598z8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import p325o9.C9717a;

/* JADX INFO: renamed from: z8.k */
/* JADX INFO: loaded from: classes.dex */
public final class C13747k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        String strM38434h4 = null;
        Uri uri = null;
        String strM38434h5 = null;
        String strM38434h6 = null;
        String strM38434h7 = null;
        PublicKeyCredential publicKeyCredential = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 2:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 3:
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                    strM38434h4 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 5:
                    uri = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                    break;
                case 6:
                    strM38434h5 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 7:
                    strM38434h6 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 8:
                    strM38434h7 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 9:
                    publicKeyCredential = (PublicKeyCredential) C9717a.m38433g(parcel, iM38447u, PublicKeyCredential.CREATOR);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new SignInCredential(strM38434h, strM38434h2, strM38434h3, strM38434h4, uri, strM38434h5, strM38434h6, strM38434h7, publicKeyCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInCredential[i10];
    }
}
