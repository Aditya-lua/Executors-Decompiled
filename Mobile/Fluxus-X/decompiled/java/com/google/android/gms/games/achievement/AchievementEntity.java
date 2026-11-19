package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.PlayerEntity;
import ea.k;
import fa.a;
import fa.d;
import ha.p;
import o9.c;
import o9.q;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class AchievementEntity extends p implements a {

    @NonNull
    public static final Parcelable.Creator<AchievementEntity> CREATOR = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f6232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Uri f6234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f6237o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PlayerEntity f6238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f6239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f6241s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f6242t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f6243u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f6244v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f6245w;

    public AchievementEntity(@NonNull a aVar) {
        String strI0 = aVar.I0();
        this.f6228f = strI0;
        this.f6229g = aVar.getType();
        this.f6230h = aVar.getName();
        String description = aVar.getDescription();
        this.f6231i = description;
        this.f6232j = aVar.K();
        this.f6233k = aVar.getUnlockedImageUrl();
        this.f6234l = aVar.G2();
        this.f6235m = aVar.getRevealedImageUrl();
        k kVarZzb = aVar.zzb();
        if (kVarZzb != null) {
            this.f6238p = new PlayerEntity(kVarZzb);
        } else {
            this.f6238p = null;
        }
        this.f6239q = aVar.getState();
        this.f6242t = aVar.g1();
        this.f6243u = aVar.r2();
        this.f6244v = aVar.zzc();
        this.f6245w = aVar.zza();
        if (aVar.getType() == 1) {
            this.f6236n = aVar.p1();
            this.f6237o = aVar.L1();
            this.f6240r = aVar.M2();
            this.f6241s = aVar.Z1();
        } else {
            this.f6236n = 0;
            this.f6237o = null;
            this.f6240r = 0;
            this.f6241s = null;
        }
        c.a(strI0);
        c.a(description);
    }

    public static boolean A3(a aVar, Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        a aVar2 = (a) obj;
        if (aVar2.getType() != aVar.getType()) {
            return false;
        }
        return (aVar.getType() != 1 || (aVar2.M2() == aVar.M2() && aVar2.p1() == aVar.p1())) && aVar2.r2() == aVar.r2() && aVar2.getState() == aVar.getState() && aVar2.g1() == aVar.g1() && q.b(aVar2.I0(), aVar.I0()) && q.b(aVar2.zza(), aVar.zza()) && q.b(aVar2.getName(), aVar.getName()) && q.b(aVar2.getDescription(), aVar.getDescription()) && q.b(aVar2.zzb(), aVar.zzb()) && aVar2.zzc() == aVar.zzc();
    }

    public static String B3(a aVar) {
        q.a aVarA = q.d(aVar).a("Id", aVar.I0()).a("Game Id", aVar.zza()).a("Type", Integer.valueOf(aVar.getType())).a("Name", aVar.getName()).a("Description", aVar.getDescription()).a("Player", aVar.zzb()).a("State", Integer.valueOf(aVar.getState())).a("Rarity Percent", Float.valueOf(aVar.zzc()));
        if (aVar.getType() == 1) {
            aVarA.a("CurrentSteps", Integer.valueOf(aVar.M2()));
            aVarA.a("TotalSteps", Integer.valueOf(aVar.p1()));
        }
        return aVarA.toString();
    }

    public static int a(a aVar) {
        int iM2;
        int iP1;
        if (aVar.getType() == 1) {
            iM2 = aVar.M2();
            iP1 = aVar.p1();
        } else {
            iM2 = 0;
            iP1 = 0;
        }
        return q.c(aVar.I0(), aVar.zza(), aVar.getName(), Integer.valueOf(aVar.getType()), aVar.getDescription(), Long.valueOf(aVar.r2()), Integer.valueOf(aVar.getState()), Long.valueOf(aVar.g1()), aVar.zzb(), Integer.valueOf(iM2), Integer.valueOf(iP1));
    }

    @Override // fa.a
    public Uri G2() {
        return this.f6234l;
    }

    @Override // fa.a
    @NonNull
    public String I0() {
        return this.f6228f;
    }

    @Override // fa.a
    public Uri K() {
        return this.f6232j;
    }

    @Override // fa.a
    public String L1() {
        c.b(getType() == 1);
        return this.f6237o;
    }

    @Override // fa.a
    public int M2() {
        c.b(getType() == 1);
        return this.f6240r;
    }

    @Override // fa.a
    public String Z1() {
        c.b(getType() == 1);
        return this.f6241s;
    }

    public boolean equals(Object obj) {
        return A3(this, obj);
    }

    @Override // fa.a
    public long g1() {
        return this.f6242t;
    }

    @Override // fa.a
    @NonNull
    public String getDescription() {
        return this.f6231i;
    }

    @Override // fa.a
    @NonNull
    public String getName() {
        return this.f6230h;
    }

    @Override // fa.a
    public String getRevealedImageUrl() {
        return this.f6235m;
    }

    @Override // fa.a
    public int getState() {
        return this.f6239q;
    }

    @Override // fa.a
    public int getType() {
        return this.f6229g;
    }

    @Override // fa.a
    public String getUnlockedImageUrl() {
        return this.f6233k;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // fa.a
    public int p1() {
        c.b(getType() == 1);
        return this.f6236n;
    }

    @Override // fa.a
    public long r2() {
        return this.f6243u;
    }

    @NonNull
    public String toString() {
        return B3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, I0(), false);
        p9.c.n(parcel, 2, getType());
        p9.c.v(parcel, 3, getName(), false);
        p9.c.v(parcel, 4, getDescription(), false);
        p9.c.t(parcel, 5, K(), i10, false);
        p9.c.v(parcel, 6, getUnlockedImageUrl(), false);
        p9.c.t(parcel, 7, G2(), i10, false);
        p9.c.v(parcel, 8, getRevealedImageUrl(), false);
        p9.c.n(parcel, 9, this.f6236n);
        p9.c.v(parcel, 10, this.f6237o, false);
        p9.c.t(parcel, 11, this.f6238p, i10, false);
        p9.c.n(parcel, 12, getState());
        p9.c.n(parcel, 13, this.f6240r);
        p9.c.v(parcel, 14, this.f6241s, false);
        p9.c.r(parcel, 15, g1());
        p9.c.r(parcel, 16, r2());
        p9.c.k(parcel, 17, this.f6244v);
        p9.c.v(parcel, 18, this.f6245w, false);
        p9.c.b(parcel, iA);
    }

    @Override // fa.a
    @NonNull
    public final String zza() {
        return this.f6245w;
    }

    @Override // fa.a
    public final k zzb() {
        return this.f6238p;
    }

    @Override // fa.a
    public final float zzc() {
        return this.f6244v;
    }

    public AchievementEntity(String str, int i10, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i11, String str6, PlayerEntity playerEntity, int i12, int i13, String str7, long j10, long j11, float f10, String str8) {
        this.f6228f = str;
        this.f6229g = i10;
        this.f6230h = str2;
        this.f6231i = str3;
        this.f6232j = uri;
        this.f6233k = str4;
        this.f6234l = uri2;
        this.f6235m = str5;
        this.f6236n = i11;
        this.f6237o = str6;
        this.f6238p = playerEntity;
        this.f6239q = i12;
        this.f6240r = i13;
        this.f6241s = str7;
        this.f6242t = j10;
        this.f6243u = j11;
        this.f6244v = f10;
        this.f6245w = str8;
    }
}
