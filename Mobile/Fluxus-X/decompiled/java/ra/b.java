package ra;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.stats.PlayerStatsEntity;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    public static void a(PlayerStatsEntity playerStatsEntity, Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.k(parcel, 1, playerStatsEntity.y3());
        c.k(parcel, 2, playerStatsEntity.I());
        c.n(parcel, 3, playerStatsEntity.v1());
        c.n(parcel, 4, playerStatsEntity.P0());
        c.n(parcel, 5, playerStatsEntity.W1());
        c.k(parcel, 6, playerStatsEntity.K0());
        c.k(parcel, 7, playerStatsEntity.b0());
        c.f(parcel, 8, playerStatsEntity.A3(), false);
        c.k(parcel, 9, playerStatsEntity.M0());
        c.k(parcel, 10, playerStatsEntity.k3());
        c.k(parcel, 11, playerStatsEntity.f2());
        c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        float fS = 0.0f;
        float fS2 = 0.0f;
        float fS3 = 0.0f;
        float fS4 = 0.0f;
        float fS5 = 0.0f;
        float fS6 = 0.0f;
        float fS7 = 0.0f;
        Bundle bundleB = null;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    fS = p9.b.s(parcel, iU);
                    break;
                case 2:
                    fS2 = p9.b.s(parcel, iU);
                    break;
                case 3:
                    iW = p9.b.w(parcel, iU);
                    break;
                case 4:
                    iW2 = p9.b.w(parcel, iU);
                    break;
                case 5:
                    iW3 = p9.b.w(parcel, iU);
                    break;
                case 6:
                    fS3 = p9.b.s(parcel, iU);
                    break;
                case 7:
                    fS4 = p9.b.s(parcel, iU);
                    break;
                case 8:
                    bundleB = p9.b.b(parcel, iU);
                    break;
                case 9:
                    fS5 = p9.b.s(parcel, iU);
                    break;
                case 10:
                    fS6 = p9.b.s(parcel, iU);
                    break;
                case 11:
                    fS7 = p9.b.s(parcel, iU);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new PlayerStatsEntity(fS, fS2, iW, iW2, iW3, fS3, fS4, bundleB, fS5, fS6, fS7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayerStatsEntity[i10];
    }
}
