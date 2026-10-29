package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.games.internal.zzg;
import p073da.C4516t;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerLevelInfo extends zzg {

    @NonNull
    public static final Parcelable.Creator<PlayerLevelInfo> CREATOR = new C4516t();

    /* JADX INFO: renamed from: f */
    public final long f7811f;

    /* JADX INFO: renamed from: g */
    public final long f7812g;

    /* JADX INFO: renamed from: h */
    public final PlayerLevel f7813h;

    /* JADX INFO: renamed from: i */
    public final PlayerLevel f7814i;

    public PlayerLevelInfo(long j10, long j11, @NonNull PlayerLevel playerLevel, @NonNull PlayerLevel playerLevel2) {
        C8953m.m36051p(j10 != -1);
        C8953m.m36047l(playerLevel);
        C8953m.m36047l(playerLevel2);
        this.f7811f = j10;
        this.f7812g = j11;
        this.f7813h = playerLevel;
        this.f7814i = playerLevel2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevelInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PlayerLevelInfo playerLevelInfo = (PlayerLevelInfo) obj;
        return C8947k.m36026b(Long.valueOf(this.f7811f), Long.valueOf(playerLevelInfo.f7811f)) && C8947k.m36026b(Long.valueOf(this.f7812g), Long.valueOf(playerLevelInfo.f7812g)) && C8947k.m36026b(this.f7813h, playerLevelInfo.f7813h) && C8947k.m36026b(this.f7814i, playerLevelInfo.f7814i);
    }

    public int hashCode() {
        return C8947k.m36027c(Long.valueOf(this.f7811f), Long.valueOf(this.f7812g), this.f7813h, this.f7814i);
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public PlayerLevel m9409v3() {
        return this.f7813h;
    }

    /* JADX INFO: renamed from: w3 */
    public long m9410w3() {
        return this.f7811f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38474r(parcel, 1, m9410w3());
        C9718b.m38474r(parcel, 2, m9411x3());
        C9718b.m38476t(parcel, 3, m9409v3(), i10, false);
        C9718b.m38476t(parcel, 4, m9412y3(), i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public long m9411x3() {
        return this.f7812g;
    }

    @NonNull
    /* JADX INFO: renamed from: y3 */
    public PlayerLevel m9412y3() {
        return this.f7814i;
    }
}
