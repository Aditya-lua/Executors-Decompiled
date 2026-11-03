package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.zzg;
import da.v;
import ja.d;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public class ProfileSettingsEntity extends zzg implements v {

    @NonNull
    public static final Parcelable.Creator<ProfileSettingsEntity> CREATOR = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Status f6228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final StockProfileImageEntity f6233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f6235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6237o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f6239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f6241s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zzh f6242t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Boolean f6243u;

    public ProfileSettingsEntity(Status status, String str, boolean z10, boolean z11, boolean z12, StockProfileImageEntity stockProfileImageEntity, boolean z13, boolean z14, int i10, boolean z15, boolean z16, int i11, int i12, boolean z17, zzh zzhVar, Boolean bool) {
        this.f6228f = status;
        this.f6229g = str;
        this.f6230h = z10;
        this.f6231i = z11;
        this.f6232j = z12;
        this.f6233k = stockProfileImageEntity;
        this.f6234l = z13;
        this.f6235m = z14;
        this.f6236n = i10;
        this.f6237o = z15;
        this.f6238p = z16;
        this.f6239q = i11;
        this.f6240r = i12;
        this.f6241s = z17;
        this.f6242t = zzhVar;
        this.f6243u = bool;
    }

    @Override // da.v
    public final boolean c() {
        return this.f6235m;
    }

    @Override // da.v
    public final boolean d() {
        return this.f6238p;
    }

    @Override // da.v
    public final int e() {
        return this.f6236n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        v vVar = (v) obj;
        return k.b(this.f6229g, vVar.zzc()) && k.b(Boolean.valueOf(this.f6230h), Boolean.valueOf(vVar.zze())) && k.b(Boolean.valueOf(this.f6231i), Boolean.valueOf(vVar.zza())) && k.b(Boolean.valueOf(this.f6232j), Boolean.valueOf(vVar.zzb())) && k.b(this.f6228f, vVar.m()) && k.b(this.f6233k, vVar.zzd()) && k.b(Boolean.valueOf(this.f6234l), Boolean.valueOf(vVar.zzf())) && k.b(Boolean.valueOf(this.f6235m), Boolean.valueOf(vVar.c())) && this.f6236n == vVar.e() && this.f6237o == vVar.zzh() && this.f6238p == vVar.d() && this.f6239q == vVar.g() && this.f6240r == vVar.f() && this.f6241s == vVar.u() && k.b(this.f6243u, vVar.zzo()) && k.b(this.f6242t, vVar.zzn());
    }

    @Override // da.v
    public final int f() {
        return this.f6240r;
    }

    @Override // da.v
    public final int g() {
        return this.f6239q;
    }

    public final int hashCode() {
        return k.c(this.f6229g, Boolean.valueOf(this.f6230h), Boolean.valueOf(this.f6231i), Boolean.valueOf(this.f6232j), this.f6228f, this.f6233k, Boolean.valueOf(this.f6234l), Boolean.valueOf(this.f6235m), Integer.valueOf(this.f6236n), Boolean.valueOf(this.f6237o), Boolean.valueOf(this.f6238p), Integer.valueOf(this.f6239q), Integer.valueOf(this.f6240r), Boolean.valueOf(this.f6241s), this.f6242t, this.f6243u);
    }

    @Override // k9.n
    @NonNull
    public final Status m() {
        return this.f6228f;
    }

    @NonNull
    public final String toString() {
        return k.d(this).a("GamerTag", this.f6229g).a("IsGamerTagExplicitlySet", Boolean.valueOf(this.f6230h)).a("IsProfileVisible", Boolean.valueOf(this.f6231i)).a("IsVisibilityExplicitlySet", Boolean.valueOf(this.f6232j)).a("Status", this.f6228f).a("StockProfileImage", this.f6233k).a("IsProfileDiscoverable", Boolean.valueOf(this.f6234l)).a("AutoSignIn", Boolean.valueOf(this.f6235m)).a("httpErrorCode", Integer.valueOf(this.f6236n)).a("IsSettingsChangesProhibited", Boolean.valueOf(this.f6237o)).a("AllowFriendInvites", Boolean.valueOf(this.f6238p)).a("ProfileVisibility", Integer.valueOf(this.f6239q)).a("global_friends_list_visibility", Integer.valueOf(this.f6240r)).a("always_auto_sign_in", Boolean.valueOf(this.f6241s)).a("profileless_recall_summary", this.f6242t).a("games_streaks_enabled", this.f6243u).toString();
    }

    @Override // da.v
    public final boolean u() {
        return this.f6241s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.t(parcel, 1, this.f6228f, i10, false);
        b.v(parcel, 2, this.f6229g, false);
        b.c(parcel, 3, this.f6230h);
        b.c(parcel, 4, this.f6231i);
        b.c(parcel, 5, this.f6232j);
        b.t(parcel, 6, this.f6233k, i10, false);
        b.c(parcel, 7, this.f6234l);
        b.c(parcel, 8, this.f6235m);
        b.n(parcel, 9, this.f6236n);
        b.c(parcel, 10, this.f6237o);
        b.c(parcel, 11, this.f6238p);
        b.n(parcel, 12, this.f6239q);
        b.n(parcel, 13, this.f6240r);
        b.c(parcel, 14, this.f6241s);
        b.t(parcel, 15, this.f6242t, i10, false);
        b.e(parcel, 16, this.f6243u, false);
        b.b(parcel, iA);
    }

    @Override // da.v
    public final boolean zza() {
        return this.f6231i;
    }

    @Override // da.v
    public final boolean zzb() {
        return this.f6232j;
    }

    @Override // da.v
    @NonNull
    public final String zzc() {
        return this.f6229g;
    }

    @Override // da.v
    @NonNull
    public final StockProfileImage zzd() {
        return this.f6233k;
    }

    @Override // da.v
    public final boolean zze() {
        return this.f6230h;
    }

    @Override // da.v
    public final boolean zzf() {
        return this.f6234l;
    }

    @Override // da.v
    public final boolean zzh() {
        return this.f6237o;
    }

    @Override // da.v
    public final zzh zzn() {
        return this.f6242t;
    }

    @Override // da.v
    public final Boolean zzo() {
        return this.f6243u;
    }
}
