package qa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.stats.PlayerStatsEntity;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: qa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10485a implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static void m40294a(PlayerStatsEntity playerStatsEntity, Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38467k(parcel, 1, playerStatsEntity.mo9517t3());
        C9718b.m38467k(parcel, 2, playerStatsEntity.mo9509F());
        C9718b.m38470n(parcel, 3, playerStatsEntity.mo9518v1());
        C9718b.m38470n(parcel, 4, playerStatsEntity.mo9512O0());
        C9718b.m38470n(parcel, 5, playerStatsEntity.mo9513S1());
        C9718b.m38467k(parcel, 6, playerStatsEntity.mo9510J0());
        C9718b.m38467k(parcel, 7, playerStatsEntity.mo9514X());
        C9718b.m38462f(parcel, 8, playerStatsEntity.m9522v3(), false);
        C9718b.m38467k(parcel, 9, playerStatsEntity.mo9511L0());
        C9718b.m38467k(parcel, 10, playerStatsEntity.mo9516e3());
        C9718b.m38467k(parcel, 11, playerStatsEntity.mo9515c2());
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        float fM38445s = 0.0f;
        float fM38445s2 = 0.0f;
        float fM38445s3 = 0.0f;
        float fM38445s4 = 0.0f;
        float fM38445s5 = 0.0f;
        float fM38445s6 = 0.0f;
        float fM38445s7 = 0.0f;
        Bundle bundleM38428b = null;
        int iM38449w = 0;
        int iM38449w2 = 0;
        int iM38449w3 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    fM38445s = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 2:
                    fM38445s2 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 3:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 4:
                    iM38449w2 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 5:
                    iM38449w3 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 6:
                    fM38445s3 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 7:
                    fM38445s4 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 8:
                    bundleM38428b = C9717a.m38428b(parcel, iM38447u);
                    break;
                case 9:
                    fM38445s5 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 10:
                    fM38445s6 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 11:
                    fM38445s7 = C9717a.m38445s(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new PlayerStatsEntity(fM38445s, fM38445s2, iM38449w, iM38449w2, iM38449w3, fM38445s3, fM38445s4, bundleM38428b, fM38445s5, fM38445s6, fM38445s7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayerStatsEntity[i10];
    }
}
