package ka;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n9.d implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f21286d;

    public d(DataHolder dataHolder, int i10, e eVar) {
        super(dataHolder, i10);
        this.f21286d = eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return MostRecentGameInfoEntity.A3(this, obj);
    }

    public final int hashCode() {
        return MostRecentGameInfoEntity.a(this);
    }

    public final String toString() {
        return MostRecentGameInfoEntity.B3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        c.a(new MostRecentGameInfoEntity(this), parcel, i10);
    }

    @Override // ka.b
    public final String zza() {
        return j(this.f21286d.f21305t);
    }

    @Override // ka.b
    public final String zzb() {
        return j(this.f21286d.f21306u);
    }

    @Override // ka.b
    public final long zzc() {
        return i(this.f21286d.f21307v);
    }

    @Override // ka.b
    public final Uri zzd() {
        return n(this.f21286d.f21308w);
    }

    @Override // ka.b
    public final Uri zze() {
        return n(this.f21286d.f21309x);
    }

    @Override // ka.b
    public final Uri zzf() {
        return n(this.f21286d.f21310y);
    }
}
