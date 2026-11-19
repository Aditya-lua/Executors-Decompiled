package gb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ha.p {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f17614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f17615g;

    public e(Bundle bundle, IBinder iBinder) {
        this.f17614f = bundle;
        this.f17615g = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f17614f;
        int iA = p9.c.a(parcel);
        p9.c.f(parcel, 1, bundle, false);
        p9.c.m(parcel, 2, this.f17615g, false);
        p9.c.b(parcel, iA);
    }

    public e(d dVar) {
        this.f17614f = dVar.a();
        this.f17615g = dVar.f17606a;
    }
}
