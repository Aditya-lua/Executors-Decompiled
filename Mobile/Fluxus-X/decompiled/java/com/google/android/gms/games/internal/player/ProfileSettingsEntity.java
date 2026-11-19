package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.api.Status;
import ea.g0;
import ha.p;
import ka.a;
import ka.h;
import ka.i;
import o9.q;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public class ProfileSettingsEntity extends p implements g0 {

    @NonNull
    public static final Parcelable.Creator<ProfileSettingsEntity> CREATOR = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Status f6279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final StockProfileImageEntity f6284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f6286m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6287n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6288o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f6290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f6292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f6293t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Boolean f6294u;

    public ProfileSettingsEntity(Status status, String str, boolean z10, boolean z11, boolean z12, StockProfileImageEntity stockProfileImageEntity, boolean z13, boolean z14, int i10, boolean z15, boolean z16, int i11, int i12, boolean z17, i iVar, Boolean bool) {
        this.f6279f = status;
        this.f6280g = str;
        this.f6281h = z10;
        this.f6282i = z11;
        this.f6283j = z12;
        this.f6284k = stockProfileImageEntity;
        this.f6285l = z13;
        this.f6286m = z14;
        this.f6287n = i10;
        this.f6288o = z15;
        this.f6289p = z16;
        this.f6290q = i11;
        this.f6291r = i12;
        this.f6292s = z17;
        this.f6293t = iVar;
        this.f6294u = bool;
    }

    @Override // ea.g0
    public final boolean c() {
        return this.f6286m;
    }

    @Override // ea.g0
    public final boolean d() {
        return this.f6289p;
    }

    @Override // ea.g0
    public final int e() {
        return this.f6287n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        g0 g0Var = (g0) obj;
        return q.b(this.f6280g, g0Var.zzc()) && q.b(Boolean.valueOf(this.f6281h), Boolean.valueOf(g0Var.zze())) && q.b(Boolean.valueOf(this.f6282i), Boolean.valueOf(g0Var.zza())) && q.b(Boolean.valueOf(this.f6283j), Boolean.valueOf(g0Var.zzb())) && q.b(this.f6279f, g0Var.n()) && q.b(this.f6284k, g0Var.zzd()) && q.b(Boolean.valueOf(this.f6285l), Boolean.valueOf(g0Var.zzf())) && q.b(Boolean.valueOf(this.f6286m), Boolean.valueOf(g0Var.c())) && this.f6287n == g0Var.e() && this.f6288o == g0Var.zzh() && this.f6289p == g0Var.d() && this.f6290q == g0Var.g() && this.f6291r == g0Var.f() && this.f6292s == g0Var.w() && q.b(this.f6294u, g0Var.zzo()) && q.b(this.f6293t, g0Var.zzn());
    }

    @Override // ea.g0
    public final int f() {
        return this.f6291r;
    }

    @Override // ea.g0
    public final int g() {
        return this.f6290q;
    }

    public final int hashCode() {
        return q.c(this.f6280g, Boolean.valueOf(this.f6281h), Boolean.valueOf(this.f6282i), Boolean.valueOf(this.f6283j), this.f6279f, this.f6284k, Boolean.valueOf(this.f6285l), Boolean.valueOf(this.f6286m), Integer.valueOf(this.f6287n), Boolean.valueOf(this.f6288o), Boolean.valueOf(this.f6289p), Integer.valueOf(this.f6290q), Integer.valueOf(this.f6291r), Boolean.valueOf(this.f6292s), this.f6293t, this.f6294u);
    }

    @Override // l9.p
    @NonNull
    public final Status n() {
        return this.f6279f;
    }

    @NonNull
    public final String toString() {
        return q.d(this).a("GamerTag", this.f6280g).a("IsGamerTagExplicitlySet", Boolean.valueOf(this.f6281h)).a("IsProfileVisible", Boolean.valueOf(this.f6282i)).a("IsVisibilityExplicitlySet", Boolean.valueOf(this.f6283j)).a("Status", this.f6279f).a("StockProfileImage", this.f6284k).a("IsProfileDiscoverable", Boolean.valueOf(this.f6285l)).a("AutoSignIn", Boolean.valueOf(this.f6286m)).a("httpErrorCode", Integer.valueOf(this.f6287n)).a("IsSettingsChangesProhibited", Boolean.valueOf(this.f6288o)).a("AllowFriendInvites", Boolean.valueOf(this.f6289p)).a("ProfileVisibility", Integer.valueOf(this.f6290q)).a("global_friends_list_visibility", Integer.valueOf(this.f6291r)).a("always_auto_sign_in", Boolean.valueOf(this.f6292s)).a("profileless_recall_summary", this.f6293t).a("games_streaks_enabled", this.f6294u).toString();
    }

    @Override // ea.g0
    public final boolean w() {
        return this.f6292s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.t(parcel, 1, this.f6279f, i10, false);
        c.v(parcel, 2, this.f6280g, false);
        c.c(parcel, 3, this.f6281h);
        c.c(parcel, 4, this.f6282i);
        c.c(parcel, 5, this.f6283j);
        c.t(parcel, 6, this.f6284k, i10, false);
        c.c(parcel, 7, this.f6285l);
        c.c(parcel, 8, this.f6286m);
        c.n(parcel, 9, this.f6287n);
        c.c(parcel, 10, this.f6288o);
        c.c(parcel, 11, this.f6289p);
        c.n(parcel, 12, this.f6290q);
        c.n(parcel, 13, this.f6291r);
        c.c(parcel, 14, this.f6292s);
        c.t(parcel, 15, this.f6293t, i10, false);
        c.e(parcel, 16, this.f6294u, false);
        c.b(parcel, iA);
    }

    @Override // ea.g0
    public final boolean zza() {
        return this.f6282i;
    }

    @Override // ea.g0
    public final boolean zzb() {
        return this.f6283j;
    }

    @Override // ea.g0
    @NonNull
    public final String zzc() {
        return this.f6280g;
    }

    @Override // ea.g0
    @NonNull
    public final a zzd() {
        return this.f6284k;
    }

    @Override // ea.g0
    public final boolean zze() {
        return this.f6281h;
    }

    @Override // ea.g0
    public final boolean zzf() {
        return this.f6285l;
    }

    @Override // ea.g0
    public final boolean zzh() {
        return this.f6288o;
    }

    @Override // ea.g0
    public final i zzn() {
        return this.f6293t;
    }

    @Override // ea.g0
    public final Boolean zzo() {
        return this.f6294u;
    }
}
