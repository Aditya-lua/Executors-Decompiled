package p165ha;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.experience.ExperienceEventEntity;
import p325o9.C9717a;

/* JADX INFO: renamed from: ha.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6326a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        int iM38449w2 = 0;
        long jM38451y = 0;
        long jM38451y2 = 0;
        long jM38451y3 = 0;
        String strM38434h = null;
        GameEntity gameEntity = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        String strM38434h4 = null;
        Uri uri = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 2:
                    gameEntity = (GameEntity) C9717a.m38433g(parcel, iM38447u, GameEntity.CREATOR);
                    break;
                case 3:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 4:
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 5:
                    strM38434h4 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 6:
                    uri = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                    break;
                case 7:
                    jM38451y = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 8:
                    jM38451y2 = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 9:
                    jM38451y3 = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 10:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 11:
                    iM38449w2 = C9717a.m38449w(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new ExperienceEventEntity(strM38434h, gameEntity, strM38434h2, strM38434h3, strM38434h4, uri, jM38451y, jM38451y2, jM38451y3, iM38449w, iM38449w2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ExperienceEventEntity[i10];
    }
}
