package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.games.internal.zzg;
import p073da.C4515s;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerLevel extends zzg {

    @NonNull
    public static final Parcelable.Creator<PlayerLevel> CREATOR = new C4515s();

    /* JADX INFO: renamed from: f */
    public final int f7808f;

    /* JADX INFO: renamed from: g */
    public final long f7809g;

    /* JADX INFO: renamed from: h */
    public final long f7810h;

    public PlayerLevel(int i10, long j10, long j11) {
        C8953m.m36052q(j10 >= 0, "Min XP must be positive!");
        C8953m.m36052q(j11 > j10, "Max XP must be more than min XP!");
        this.f7808f = i10;
        this.f7809g = j10;
        this.f7810h = j11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevel)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PlayerLevel playerLevel = (PlayerLevel) obj;
        return C8947k.m36026b(Integer.valueOf(playerLevel.m9406v3()), Integer.valueOf(m9406v3())) && C8947k.m36026b(Long.valueOf(playerLevel.m9408x3()), Long.valueOf(m9408x3())) && C8947k.m36026b(Long.valueOf(playerLevel.m9407w3()), Long.valueOf(m9407w3()));
    }

    public int hashCode() {
        return C8947k.m36027c(Integer.valueOf(this.f7808f), Long.valueOf(this.f7809g), Long.valueOf(this.f7810h));
    }

    @NonNull
    public String toString() {
        return C8947k.m36028d(this).m36029a("LevelNumber", Integer.valueOf(m9406v3())).m36029a("MinXp", Long.valueOf(m9408x3())).m36029a("MaxXp", Long.valueOf(m9407w3())).toString();
    }

    /* JADX INFO: renamed from: v3 */
    public int m9406v3() {
        return this.f7808f;
    }

    /* JADX INFO: renamed from: w3 */
    public long m9407w3() {
        return this.f7810h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, m9406v3());
        C9718b.m38474r(parcel, 2, m9408x3());
        C9718b.m38474r(parcel, 3, m9407w3());
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public long m9408x3() {
        return this.f7809g;
    }
}
