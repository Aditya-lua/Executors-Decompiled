package ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends p9.a implements Iterable<String> {
    public static final Parcelable.Creator<g0> CREATOR = new h0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f27344f;

    public g0(Bundle bundle) {
        this.f27344f = bundle;
    }

    public final Long A3(String str) {
        return Long.valueOf(this.f27344f.getLong(str));
    }

    public final Double B3(String str) {
        return Double.valueOf(this.f27344f.getDouble("value"));
    }

    public final String C3(String str) {
        return this.f27344f.getString(str);
    }

    public final Bundle D3() {
        return new Bundle(this.f27344f);
    }

    public final /* synthetic */ Bundle E3() {
        return this.f27344f;
    }

    public final Object a(String str) {
        return this.f27344f.get(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new f0(this);
    }

    public final String toString() {
        return this.f27344f.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.f(parcel, 2, D3(), false);
        p9.c.b(parcel, iA);
    }

    public final int zze() {
        return this.f27344f.size();
    }
}
