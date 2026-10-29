package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.zzg;
import p073da.InterfaceC4518v;
import p214ja.C7125d;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public class ProfileSettingsEntity extends zzg implements InterfaceC4518v {

    @NonNull
    public static final Parcelable.Creator<ProfileSettingsEntity> CREATOR = new C7125d();

    /* JADX INFO: renamed from: f */
    public final Status f7871f;

    /* JADX INFO: renamed from: g */
    public final String f7872g;

    /* JADX INFO: renamed from: h */
    public final boolean f7873h;

    /* JADX INFO: renamed from: i */
    public final boolean f7874i;

    /* JADX INFO: renamed from: j */
    public final boolean f7875j;

    /* JADX INFO: renamed from: k */
    public final StockProfileImageEntity f7876k;

    /* JADX INFO: renamed from: l */
    public final boolean f7877l;

    /* JADX INFO: renamed from: m */
    public final boolean f7878m;

    /* JADX INFO: renamed from: n */
    public final int f7879n;

    /* JADX INFO: renamed from: o */
    public final boolean f7880o;

    /* JADX INFO: renamed from: p */
    public final boolean f7881p;

    /* JADX INFO: renamed from: q */
    public final int f7882q;

    /* JADX INFO: renamed from: r */
    public final int f7883r;

    /* JADX INFO: renamed from: s */
    public final boolean f7884s;

    /* JADX INFO: renamed from: t */
    public final zzh f7885t;

    /* JADX INFO: renamed from: u */
    public final Boolean f7886u;

    public ProfileSettingsEntity(Status status, String str, boolean z10, boolean z11, boolean z12, StockProfileImageEntity stockProfileImageEntity, boolean z13, boolean z14, int i10, boolean z15, boolean z16, int i11, int i12, boolean z17, zzh zzhVar, Boolean bool) {
        this.f7871f = status;
        this.f7872g = str;
        this.f7873h = z10;
        this.f7874i = z11;
        this.f7875j = z12;
        this.f7876k = stockProfileImageEntity;
        this.f7877l = z13;
        this.f7878m = z14;
        this.f7879n = i10;
        this.f7880o = z15;
        this.f7881p = z16;
        this.f7882q = i11;
        this.f7883r = i12;
        this.f7884s = z17;
        this.f7885t = zzhVar;
        this.f7886u = bool;
    }

    @Override // p073da.InterfaceC4518v
    /* JADX INFO: renamed from: c */
    public final boolean mo9443c() {
        return this.f7878m;
    }

    @Override // p073da.InterfaceC4518v
    /* JADX INFO: renamed from: d */
    public final boolean mo9444d() {
        return this.f7881p;
    }

    @Override // p073da.InterfaceC4518v
    /* JADX INFO: renamed from: e */
    public final int mo9445e() {
        return this.f7879n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC4518v)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        InterfaceC4518v interfaceC4518v = (InterfaceC4518v) obj;
        return C8947k.m36026b(this.f7872g, interfaceC4518v.zzc()) && C8947k.m36026b(Boolean.valueOf(this.f7873h), Boolean.valueOf(interfaceC4518v.zze())) && C8947k.m36026b(Boolean.valueOf(this.f7874i), Boolean.valueOf(interfaceC4518v.zza())) && C8947k.m36026b(Boolean.valueOf(this.f7875j), Boolean.valueOf(interfaceC4518v.zzb())) && C8947k.m36026b(this.f7871f, interfaceC4518v.mo8183m()) && C8947k.m36026b(this.f7876k, interfaceC4518v.zzd()) && C8947k.m36026b(Boolean.valueOf(this.f7877l), Boolean.valueOf(interfaceC4518v.zzf())) && C8947k.m36026b(Boolean.valueOf(this.f7878m), Boolean.valueOf(interfaceC4518v.mo9443c())) && this.f7879n == interfaceC4518v.mo9445e() && this.f7880o == interfaceC4518v.zzh() && this.f7881p == interfaceC4518v.mo9444d() && this.f7882q == interfaceC4518v.mo9447g() && this.f7883r == interfaceC4518v.mo9446f() && this.f7884s == interfaceC4518v.mo9448u() && C8947k.m36026b(this.f7886u, interfaceC4518v.zzo()) && C8947k.m36026b(this.f7885t, interfaceC4518v.zzn());
    }

    @Override // p073da.InterfaceC4518v
    /* JADX INFO: renamed from: f */
    public final int mo9446f() {
        return this.f7883r;
    }

    @Override // p073da.InterfaceC4518v
    /* JADX INFO: renamed from: g */
    public final int mo9447g() {
        return this.f7882q;
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f7872g, Boolean.valueOf(this.f7873h), Boolean.valueOf(this.f7874i), Boolean.valueOf(this.f7875j), this.f7871f, this.f7876k, Boolean.valueOf(this.f7877l), Boolean.valueOf(this.f7878m), Integer.valueOf(this.f7879n), Boolean.valueOf(this.f7880o), Boolean.valueOf(this.f7881p), Integer.valueOf(this.f7882q), Integer.valueOf(this.f7883r), Boolean.valueOf(this.f7884s), this.f7885t, this.f7886u);
    }

    @Override // p242k9.InterfaceC7504n
    @NonNull
    /* JADX INFO: renamed from: m */
    public final Status mo8183m() {
        return this.f7871f;
    }

    @NonNull
    public final String toString() {
        return C8947k.m36028d(this).m36029a("GamerTag", this.f7872g).m36029a("IsGamerTagExplicitlySet", Boolean.valueOf(this.f7873h)).m36029a("IsProfileVisible", Boolean.valueOf(this.f7874i)).m36029a("IsVisibilityExplicitlySet", Boolean.valueOf(this.f7875j)).m36029a("Status", this.f7871f).m36029a("StockProfileImage", this.f7876k).m36029a("IsProfileDiscoverable", Boolean.valueOf(this.f7877l)).m36029a("AutoSignIn", Boolean.valueOf(this.f7878m)).m36029a("httpErrorCode", Integer.valueOf(this.f7879n)).m36029a("IsSettingsChangesProhibited", Boolean.valueOf(this.f7880o)).m36029a("AllowFriendInvites", Boolean.valueOf(this.f7881p)).m36029a("ProfileVisibility", Integer.valueOf(this.f7882q)).m36029a("global_friends_list_visibility", Integer.valueOf(this.f7883r)).m36029a("always_auto_sign_in", Boolean.valueOf(this.f7884s)).m36029a("profileless_recall_summary", this.f7885t).m36029a("games_streaks_enabled", this.f7886u).toString();
    }

    @Override // p073da.InterfaceC4518v
    /* JADX INFO: renamed from: u */
    public final boolean mo9448u() {
        return this.f7884s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, this.f7871f, i10, false);
        C9718b.m38478v(parcel, 2, this.f7872g, false);
        C9718b.m38459c(parcel, 3, this.f7873h);
        C9718b.m38459c(parcel, 4, this.f7874i);
        C9718b.m38459c(parcel, 5, this.f7875j);
        C9718b.m38476t(parcel, 6, this.f7876k, i10, false);
        C9718b.m38459c(parcel, 7, this.f7877l);
        C9718b.m38459c(parcel, 8, this.f7878m);
        C9718b.m38470n(parcel, 9, this.f7879n);
        C9718b.m38459c(parcel, 10, this.f7880o);
        C9718b.m38459c(parcel, 11, this.f7881p);
        C9718b.m38470n(parcel, 12, this.f7882q);
        C9718b.m38470n(parcel, 13, this.f7883r);
        C9718b.m38459c(parcel, 14, this.f7884s);
        C9718b.m38476t(parcel, 15, this.f7885t, i10, false);
        C9718b.m38461e(parcel, 16, this.f7886u, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // p073da.InterfaceC4518v
    public final boolean zza() {
        return this.f7874i;
    }

    @Override // p073da.InterfaceC4518v
    public final boolean zzb() {
        return this.f7875j;
    }

    @Override // p073da.InterfaceC4518v
    @NonNull
    public final String zzc() {
        return this.f7872g;
    }

    @Override // p073da.InterfaceC4518v
    @NonNull
    public final StockProfileImage zzd() {
        return this.f7876k;
    }

    @Override // p073da.InterfaceC4518v
    public final boolean zze() {
        return this.f7873h;
    }

    @Override // p073da.InterfaceC4518v
    public final boolean zzf() {
        return this.f7877l;
    }

    @Override // p073da.InterfaceC4518v
    public final boolean zzh() {
        return this.f7880o;
    }

    @Override // p073da.InterfaceC4518v
    public final zzh zzn() {
        return this.f7885t;
    }

    @Override // p073da.InterfaceC4518v
    public final Boolean zzo() {
        return this.f7886u;
    }
}
