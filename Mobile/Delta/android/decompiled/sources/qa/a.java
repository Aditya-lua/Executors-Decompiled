package qa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.stats.PlayerStatsEntity;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public static void a(PlayerStatsEntity playerStatsEntity, Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.k(parcel, 1, playerStatsEntity.t3());
        b.k(parcel, 2, playerStatsEntity.F());
        b.n(parcel, 3, playerStatsEntity.v1());
        b.n(parcel, 4, playerStatsEntity.O0());
        b.n(parcel, 5, playerStatsEntity.S1());
        b.k(parcel, 6, playerStatsEntity.J0());
        b.k(parcel, 7, playerStatsEntity.X());
        b.f(parcel, 8, playerStatsEntity.v3(), false);
        b.k(parcel, 9, playerStatsEntity.L0());
        b.k(parcel, 10, playerStatsEntity.e3());
        b.k(parcel, 11, playerStatsEntity.c2());
        b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
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
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    fS = o9.a.s(parcel, iU);
                    break;
                case 2:
                    fS2 = o9.a.s(parcel, iU);
                    break;
                case 3:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 4:
                    iW2 = o9.a.w(parcel, iU);
                    break;
                case 5:
                    iW3 = o9.a.w(parcel, iU);
                    break;
                case 6:
                    fS3 = o9.a.s(parcel, iU);
                    break;
                case 7:
                    fS4 = o9.a.s(parcel, iU);
                    break;
                case 8:
                    bundleB = o9.a.b(parcel, iU);
                    break;
                case 9:
                    fS5 = o9.a.s(parcel, iU);
                    break;
                case 10:
                    fS6 = o9.a.s(parcel, iU);
                    break;
                case 11:
                    fS7 = o9.a.s(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new PlayerStatsEntity(fS, fS2, iW, iW2, iW3, fS3, fS4, bundleB, fS5, fS6, fS7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayerStatsEntity[i10];
    }
}
