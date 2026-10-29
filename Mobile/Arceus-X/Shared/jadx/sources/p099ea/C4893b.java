package p099ea;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementEntity;
import p325o9.C9717a;

/* JADX INFO: renamed from: ea.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4893b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        Uri uri = null;
        String strM38434h4 = null;
        Uri uri2 = null;
        String strM38434h5 = null;
        String strM38434h6 = null;
        PlayerEntity playerEntity = null;
        String strM38434h7 = null;
        String strM38434h8 = null;
        float fM38445s = -1.0f;
        long jM38451y = 0;
        long jM38451y2 = 0;
        int iM38449w = 0;
        int iM38449w2 = 0;
        int iM38449w3 = 0;
        int iM38449w4 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 2:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 3:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 5:
                    uri = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                    break;
                case 6:
                    strM38434h4 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 7:
                    uri2 = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                    break;
                case 8:
                    strM38434h5 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 9:
                    iM38449w2 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 10:
                    strM38434h6 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 11:
                    playerEntity = (PlayerEntity) C9717a.m38433g(parcel, iM38447u, PlayerEntity.CREATOR);
                    break;
                case 12:
                    iM38449w3 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 13:
                    iM38449w4 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 14:
                    strM38434h7 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 15:
                    jM38451y = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 16:
                    jM38451y2 = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 17:
                    fM38445s = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 18:
                    strM38434h8 = C9717a.m38434h(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new AchievementEntity(strM38434h, iM38449w, strM38434h2, strM38434h3, uri, strM38434h4, uri2, strM38434h5, iM38449w2, strM38434h6, playerEntity, iM38449w3, iM38449w4, strM38434h7, jM38451y, jM38451y2, fM38445s, strM38434h8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AchievementEntity[i10];
    }
}
