package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.games.internal.zzg;
import da.s;
import n9.k;
import n9.m;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerLevel extends zzg {

    @NonNull
    public static final Parcelable.Creator<PlayerLevel> CREATOR = new s();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6167h;

    public PlayerLevel(int i10, long j10, long j11) {
        m.q(j10 >= 0, "Min XP must be positive!");
        m.q(j11 > j10, "Max XP must be more than min XP!");
        this.f6165f = i10;
        this.f6166g = j10;
        this.f6167h = j11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevel)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PlayerLevel playerLevel = (PlayerLevel) obj;
        return k.b(Integer.valueOf(playerLevel.v3()), Integer.valueOf(v3())) && k.b(Long.valueOf(playerLevel.x3()), Long.valueOf(x3())) && k.b(Long.valueOf(playerLevel.w3()), Long.valueOf(w3()));
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f6165f), Long.valueOf(this.f6166g), Long.valueOf(this.f6167h));
    }

    @NonNull
    public String toString() {
        return k.d(this).a("LevelNumber", Integer.valueOf(v3())).a("MinXp", Long.valueOf(x3())).a("MaxXp", Long.valueOf(w3())).toString();
    }

    public int v3() {
        return this.f6165f;
    }

    public long w3() {
        return this.f6167h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, v3());
        b.r(parcel, 2, x3());
        b.r(parcel, 3, w3());
        b.b(parcel, iA);
    }

    public long x3() {
        return this.f6166g;
    }
}
