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
    public final Status f6155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final StockProfileImageEntity f6160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f6162m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6163n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6164o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6165p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f6166q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f6168s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zzh f6169t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Boolean f6170u;

    public ProfileSettingsEntity(Status status, String str, boolean z10, boolean z11, boolean z12, StockProfileImageEntity stockProfileImageEntity, boolean z13, boolean z14, int i10, boolean z15, boolean z16, int i11, int i12, boolean z17, zzh zzhVar, Boolean bool) {
        this.f6155f = status;
        this.f6156g = str;
        this.f6157h = z10;
        this.f6158i = z11;
        this.f6159j = z12;
        this.f6160k = stockProfileImageEntity;
        this.f6161l = z13;
        this.f6162m = z14;
        this.f6163n = i10;
        this.f6164o = z15;
        this.f6165p = z16;
        this.f6166q = i11;
        this.f6167r = i12;
        this.f6168s = z17;
        this.f6169t = zzhVar;
        this.f6170u = bool;
    }

    @Override // da.v
    public final boolean c() {
        return this.f6162m;
    }

    @Override // da.v
    public final boolean d() {
        return this.f6165p;
    }

    @Override // da.v
    public final int e() {
        return this.f6163n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        v vVar = (v) obj;
        return k.b(this.f6156g, vVar.zzc()) && k.b(Boolean.valueOf(this.f6157h), Boolean.valueOf(vVar.zze())) && k.b(Boolean.valueOf(this.f6158i), Boolean.valueOf(vVar.zza())) && k.b(Boolean.valueOf(this.f6159j), Boolean.valueOf(vVar.zzb())) && k.b(this.f6155f, vVar.m()) && k.b(this.f6160k, vVar.zzd()) && k.b(Boolean.valueOf(this.f6161l), Boolean.valueOf(vVar.zzf())) && k.b(Boolean.valueOf(this.f6162m), Boolean.valueOf(vVar.c())) && this.f6163n == vVar.e() && this.f6164o == vVar.zzh() && this.f6165p == vVar.d() && this.f6166q == vVar.g() && this.f6167r == vVar.f() && this.f6168s == vVar.u() && k.b(this.f6170u, vVar.zzo()) && k.b(this.f6169t, vVar.zzn());
    }

    @Override // da.v
    public final int f() {
        return this.f6167r;
    }

    @Override // da.v
    public final int g() {
        return this.f6166q;
    }

    public final int hashCode() {
        return k.c(this.f6156g, Boolean.valueOf(this.f6157h), Boolean.valueOf(this.f6158i), Boolean.valueOf(this.f6159j), this.f6155f, this.f6160k, Boolean.valueOf(this.f6161l), Boolean.valueOf(this.f6162m), Integer.valueOf(this.f6163n), Boolean.valueOf(this.f6164o), Boolean.valueOf(this.f6165p), Integer.valueOf(this.f6166q), Integer.valueOf(this.f6167r), Boolean.valueOf(this.f6168s), this.f6169t, this.f6170u);
    }

    @Override // k9.n
    @NonNull
    public final Status m() {
        return this.f6155f;
    }

    @NonNull
    public final String toString() {
        return k.d(this).a("GamerTag", this.f6156g).a("IsGamerTagExplicitlySet", Boolean.valueOf(this.f6157h)).a("IsProfileVisible", Boolean.valueOf(this.f6158i)).a("IsVisibilityExplicitlySet", Boolean.valueOf(this.f6159j)).a("Status", this.f6155f).a("StockProfileImage", this.f6160k).a("IsProfileDiscoverable", Boolean.valueOf(this.f6161l)).a("AutoSignIn", Boolean.valueOf(this.f6162m)).a("httpErrorCode", Integer.valueOf(this.f6163n)).a("IsSettingsChangesProhibited", Boolean.valueOf(this.f6164o)).a("AllowFriendInvites", Boolean.valueOf(this.f6165p)).a("ProfileVisibility", Integer.valueOf(this.f6166q)).a("global_friends_list_visibility", Integer.valueOf(this.f6167r)).a("always_auto_sign_in", Boolean.valueOf(this.f6168s)).a("profileless_recall_summary", this.f6169t).a("games_streaks_enabled", this.f6170u).toString();
    }

    @Override // da.v
    public final boolean u() {
        return this.f6168s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.t(parcel, 1, this.f6155f, i10, false);
        b.v(parcel, 2, this.f6156g, false);
        b.c(parcel, 3, this.f6157h);
        b.c(parcel, 4, this.f6158i);
        b.c(parcel, 5, this.f6159j);
        b.t(parcel, 6, this.f6160k, i10, false);
        b.c(parcel, 7, this.f6161l);
        b.c(parcel, 8, this.f6162m);
        b.n(parcel, 9, this.f6163n);
        b.c(parcel, 10, this.f6164o);
        b.c(parcel, 11, this.f6165p);
        b.n(parcel, 12, this.f6166q);
        b.n(parcel, 13, this.f6167r);
        b.c(parcel, 14, this.f6168s);
        b.t(parcel, 15, this.f6169t, i10, false);
        b.e(parcel, 16, this.f6170u, false);
        b.b(parcel, iA);
    }

    @Override // da.v
    public final boolean zza() {
        return this.f6158i;
    }

    @Override // da.v
    public final boolean zzb() {
        return this.f6159j;
    }

    @Override // da.v
    @NonNull
    public final String zzc() {
        return this.f6156g;
    }

    @Override // da.v
    @NonNull
    public final StockProfileImage zzd() {
        return this.f6160k;
    }

    @Override // da.v
    public final boolean zze() {
        return this.f6157h;
    }

    @Override // da.v
    public final boolean zzf() {
        return this.f6161l;
    }

    @Override // da.v
    public final boolean zzh() {
        return this.f6164o;
    }

    @Override // da.v
    public final zzh zzn() {
        return this.f6169t;
    }

    @Override // da.v
    public final Boolean zzo() {
        return this.f6170u;
    }
}
