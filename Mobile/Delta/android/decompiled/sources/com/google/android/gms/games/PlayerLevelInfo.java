package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.games.internal.zzg;
import da.t;
import n9.k;
import n9.m;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerLevelInfo extends zzg {

    @NonNull
    public static final Parcelable.Creator<PlayerLevelInfo> CREATOR = new t();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PlayerLevel f6097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PlayerLevel f6098i;

    public PlayerLevelInfo(long j10, long j11, @NonNull PlayerLevel playerLevel, @NonNull PlayerLevel playerLevel2) {
        m.p(j10 != -1);
        m.l(playerLevel);
        m.l(playerLevel2);
        this.f6095f = j10;
        this.f6096g = j11;
        this.f6097h = playerLevel;
        this.f6098i = playerLevel2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevelInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PlayerLevelInfo playerLevelInfo = (PlayerLevelInfo) obj;
        return k.b(Long.valueOf(this.f6095f), Long.valueOf(playerLevelInfo.f6095f)) && k.b(Long.valueOf(this.f6096g), Long.valueOf(playerLevelInfo.f6096g)) && k.b(this.f6097h, playerLevelInfo.f6097h) && k.b(this.f6098i, playerLevelInfo.f6098i);
    }

    public int hashCode() {
        return k.c(Long.valueOf(this.f6095f), Long.valueOf(this.f6096g), this.f6097h, this.f6098i);
    }

    @NonNull
    public PlayerLevel v3() {
        return this.f6097h;
    }

    public long w3() {
        return this.f6095f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.r(parcel, 1, w3());
        b.r(parcel, 2, x3());
        b.t(parcel, 3, v3(), i10, false);
        b.t(parcel, 4, y3(), i10, false);
        b.b(parcel, iA);
    }

    public long x3() {
        return this.f6096g;
    }

    @NonNull
    public PlayerLevel y3() {
        return this.f6098i;
    }
}
