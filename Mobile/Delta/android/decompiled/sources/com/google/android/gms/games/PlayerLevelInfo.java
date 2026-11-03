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
    public final long f6168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PlayerLevel f6170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PlayerLevel f6171i;

    public PlayerLevelInfo(long j10, long j11, @NonNull PlayerLevel playerLevel, @NonNull PlayerLevel playerLevel2) {
        m.p(j10 != -1);
        m.l(playerLevel);
        m.l(playerLevel2);
        this.f6168f = j10;
        this.f6169g = j11;
        this.f6170h = playerLevel;
        this.f6171i = playerLevel2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevelInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PlayerLevelInfo playerLevelInfo = (PlayerLevelInfo) obj;
        return k.b(Long.valueOf(this.f6168f), Long.valueOf(playerLevelInfo.f6168f)) && k.b(Long.valueOf(this.f6169g), Long.valueOf(playerLevelInfo.f6169g)) && k.b(this.f6170h, playerLevelInfo.f6170h) && k.b(this.f6171i, playerLevelInfo.f6171i);
    }

    public int hashCode() {
        return k.c(Long.valueOf(this.f6168f), Long.valueOf(this.f6169g), this.f6170h, this.f6171i);
    }

    @NonNull
    public PlayerLevel v3() {
        return this.f6170h;
    }

    public long w3() {
        return this.f6168f;
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
        return this.f6169g;
    }

    @NonNull
    public PlayerLevel y3() {
        return this.f6171i;
    }
}
