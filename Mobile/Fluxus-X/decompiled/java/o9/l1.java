package o9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends p9.a {
    public static final Parcelable.Creator<l1> CREATOR = new m1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f26995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k9.d[] f26996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f26998i;

    public l1() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.f(parcel, 1, this.f26995f, false);
        p9.c.y(parcel, 2, this.f26996g, i10, false);
        p9.c.n(parcel, 3, this.f26997h);
        p9.c.t(parcel, 4, this.f26998i, i10, false);
        p9.c.b(parcel, iA);
    }

    public l1(Bundle bundle, k9.d[] dVarArr, int i10, g gVar) {
        this.f26995f = bundle;
        this.f26996g = dVarArr;
        this.f26997h = i10;
        this.f26998i = gVar;
    }
}
