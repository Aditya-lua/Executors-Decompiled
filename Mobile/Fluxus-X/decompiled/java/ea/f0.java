package ea;

import android.annotation.SuppressLint;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ParcelCreator"})
public final class f0 extends v implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ka.e f13264d;

    public f0(DataHolder dataHolder, int i10, ka.e eVar) {
        super(dataHolder, i10);
        this.f13264d = eVar;
    }

    @Override // ea.o
    public final int c0() {
        return q(this.f13264d.H, -1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return d0.A3(this, obj);
    }

    @Override // n9.e
    public final /* synthetic */ o freeze() {
        return new d0(this);
    }

    public final int hashCode() {
        return d0.a(this);
    }

    public final String toString() {
        return d0.B3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        e0.a(new d0(this), parcel, i10);
    }

    @Override // ea.o
    public final String zza() {
        return p(this.f13264d.I, null);
    }

    @Override // ea.o
    public final String zzb() {
        return p(this.f13264d.J, null);
    }

    @Override // ea.o
    public final String zzc() {
        return p(this.f13264d.K, null);
    }
}
