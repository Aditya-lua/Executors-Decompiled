package p073da;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import p325o9.C9717a;

/* JADX INFO: renamed from: da.l */
/* JADX INFO: loaded from: classes.dex */
public class C4508l implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public GameEntity mo22469a(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        int iM38449w = 0;
        int iM38449w2 = 0;
        int iM38449w3 = 0;
        boolean zM38441o3 = false;
        boolean zM38441o4 = false;
        boolean zM38441o5 = false;
        boolean zM38441o6 = false;
        boolean zM38441o7 = false;
        boolean zM38441o8 = false;
        boolean zM38441o9 = false;
        String strM38434h = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        String strM38434h4 = null;
        String strM38434h5 = null;
        String strM38434h6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        String strM38434h7 = null;
        String strM38434h8 = null;
        String strM38434h9 = null;
        String strM38434h10 = null;
        String strM38434h11 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n != 28) {
                switch (iM38440n) {
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
                        strM38434h5 = C9717a.m38434h(parcel, iM38447u);
                        break;
                    case 6:
                        strM38434h6 = C9717a.m38434h(parcel, iM38447u);
                        break;
                    case 7:
                        uri = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                        break;
                    case 8:
                        uri2 = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                        break;
                    case 9:
                        uri3 = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                        break;
                    case 10:
                        zM38441o = C9717a.m38441o(parcel, iM38447u);
                        break;
                    case 11:
                        zM38441o2 = C9717a.m38441o(parcel, iM38447u);
                        break;
                    case 12:
                        strM38434h7 = C9717a.m38434h(parcel, iM38447u);
                        break;
                    case 13:
                        iM38449w = C9717a.m38449w(parcel, iM38447u);
                        break;
                    case 14:
                        iM38449w2 = C9717a.m38449w(parcel, iM38447u);
                        break;
                    case 15:
                        iM38449w3 = C9717a.m38449w(parcel, iM38447u);
                        break;
                    case 16:
                        zM38441o3 = C9717a.m38441o(parcel, iM38447u);
                        break;
                    case 17:
                        zM38441o4 = C9717a.m38441o(parcel, iM38447u);
                        break;
                    case 18:
                        strM38434h8 = C9717a.m38434h(parcel, iM38447u);
                        break;
                    case 19:
                        strM38434h9 = C9717a.m38434h(parcel, iM38447u);
                        break;
                    case 20:
                        strM38434h10 = C9717a.m38434h(parcel, iM38447u);
                        break;
                    case 21:
                        zM38441o5 = C9717a.m38441o(parcel, iM38447u);
                        break;
                    case 22:
                        zM38441o6 = C9717a.m38441o(parcel, iM38447u);
                        break;
                    case 23:
                        zM38441o7 = C9717a.m38441o(parcel, iM38447u);
                        break;
                    case 24:
                        strM38434h11 = C9717a.m38434h(parcel, iM38447u);
                        break;
                    case 25:
                        zM38441o8 = C9717a.m38441o(parcel, iM38447u);
                        break;
                    default:
                        C9717a.m38423C(parcel, iM38447u);
                        break;
                }
            } else {
                zM38441o9 = C9717a.m38441o(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new GameEntity(strM38434h, strM38434h2, strM38434h3, strM38434h4, strM38434h5, strM38434h6, uri, uri2, uri3, zM38441o, zM38441o2, strM38434h7, iM38449w, iM38449w2, iM38449w3, zM38441o3, zM38441o4, strM38434h8, strM38434h9, strM38434h10, zM38441o5, zM38441o6, zM38441o7, strM38434h11, zM38441o8, zM38441o9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GameEntity[i10];
    }
}
