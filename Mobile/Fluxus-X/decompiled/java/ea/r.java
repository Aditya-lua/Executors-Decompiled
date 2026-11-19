package ea;

import android.annotation.SuppressLint;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ParcelCreator"})
public final class r extends v implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ka.e f13278d;

    public r(DataHolder dataHolder, int i10, ka.e eVar) {
        super(dataHolder, i10);
        this.f13278d = eVar;
    }

    @Override // ea.d
    public final int C1() {
        return q(this.f13278d.L, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return p.A3(this, obj);
    }

    @Override // n9.e
    public final /* synthetic */ d freeze() {
        return new p(this);
    }

    public final int hashCode() {
        return p.a(this);
    }

    public final String toString() {
        return p.B3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        q.a(new p(this), parcel, i10);
    }

    public final boolean zza() {
        String str = this.f13278d.L;
        return k(str) && !l(str);
    }
}
