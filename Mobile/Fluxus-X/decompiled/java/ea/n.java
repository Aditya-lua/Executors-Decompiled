package ea;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.PlayerEntity;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ParcelCreator"})
public final class n extends v implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ka.e f13272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f13273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ka.d f13274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f0 f13275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f13276h;

    public n(@NonNull DataHolder dataHolder, int i10, @NonNull String str) {
        super(dataHolder, i10);
        ka.e eVar = new ka.e(null);
        this.f13272d = eVar;
        this.f13274f = new ka.d(dataHolder, i10, eVar);
        this.f13275g = new f0(dataHolder, i10, eVar);
        this.f13276h = new r(dataHolder, i10, eVar);
        if (l(eVar.f21296k) || i(eVar.f21296k) == -1) {
            this.f13273e = null;
            return;
        }
        int iG = g(eVar.f21297l);
        int iG2 = g(eVar.f21300o);
        l lVar = new l(iG, i(eVar.f21298m), i(eVar.f21299n));
        this.f13273e = new m(i(eVar.f21296k), i(eVar.f21302q), lVar, iG != iG2 ? new l(iG2, i(eVar.f21299n), i(eVar.f21301p)) : lVar);
    }

    @Override // ea.k
    @NonNull
    public final Uri E() {
        return n(this.f13272d.f21291f);
    }

    @Override // ea.k
    @NonNull
    public final Uri I1() {
        return n(this.f13272d.C);
    }

    @Override // ea.k
    public final boolean c() {
        String str = this.f13272d.M;
        return k(str) && a(str);
    }

    @Override // ea.k
    public final o c1() {
        f0 f0Var = this.f13275g;
        if (f0Var.c0() == -1 && f0Var.zza() == null && f0Var.zzb() == null) {
            return null;
        }
        return f0Var;
    }

    @Override // ea.k
    public final long d() {
        String str = this.f13272d.G;
        if (!k(str) || l(str)) {
            return -1L;
        }
        return i(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ea.k
    public final long e0() {
        return i(this.f13272d.f21293h);
    }

    public final boolean equals(Object obj) {
        return PlayerEntity.E3(this, obj);
    }

    @Override // ea.k
    public final d g2() {
        r rVar = this.f13276h;
        if (rVar.zza()) {
            return rVar;
        }
        return null;
    }

    @Override // ea.k
    @NonNull
    public String getBannerImageLandscapeUrl() {
        return j(this.f13272d.D);
    }

    @Override // ea.k
    @NonNull
    public String getBannerImagePortraitUrl() {
        return j(this.f13272d.F);
    }

    @Override // ea.k
    @NonNull
    public String getHiResImageUrl() {
        return j(this.f13272d.f21292g);
    }

    @Override // ea.k
    @NonNull
    public String getIconImageUrl() {
        return j(this.f13272d.f21290e);
    }

    @Override // ea.k
    @NonNull
    public final String getTitle() {
        return j(this.f13272d.f21303r);
    }

    @Override // ea.k
    @NonNull
    public final Uri h() {
        return n(this.f13272d.f21289d);
    }

    @Override // ea.k
    @NonNull
    public final Uri h0() {
        return n(this.f13272d.E);
    }

    public final int hashCode() {
        return PlayerEntity.D3(this);
    }

    @Override // ea.k
    @NonNull
    public final String m() {
        return j(this.f13272d.f21288c);
    }

    @Override // ea.k
    @NonNull
    public final String r3() {
        return j(this.f13272d.f21287a);
    }

    @Override // ea.k
    public final long s0() {
        String str = this.f13272d.f21295j;
        if (!k(str) || l(str)) {
            return -1L;
        }
        return i(str);
    }

    @NonNull
    public final String toString() {
        return PlayerEntity.F3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        new PlayerEntity(this).writeToParcel(parcel, i10);
    }

    @Override // ea.k
    @NonNull
    public final m z0() {
        return this.f13273e;
    }

    @Override // ea.k
    public final String zza() {
        return p(this.f13272d.b, null);
    }

    @Override // ea.k
    @NonNull
    public final String zzb() {
        return j(this.f13272d.A);
    }

    @Override // ea.k
    @NonNull
    public final String zzc() {
        return j(this.f13272d.B);
    }

    @Override // ea.k
    public final boolean zzd() {
        return a(this.f13272d.f21311z);
    }

    @Override // ea.k
    public final int zze() {
        return g(this.f13272d.f21294i);
    }

    @Override // ea.k
    public final boolean zzf() {
        return a(this.f13272d.f21304s);
    }

    @Override // ea.k
    public final ka.b zzh() {
        if (l(this.f13272d.f21305t)) {
            return null;
        }
        return this.f13274f;
    }
}
