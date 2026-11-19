package ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p extends p9.a {
    public static final Parcelable.Creator<p> CREATOR = new q();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f27663f;

    public p(Bundle bundle) {
        this.f27663f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f27663f;
        int iA = p9.c.a(parcel);
        p9.c.f(parcel, 1, bundle, false);
        p9.c.b(parcel, iA);
    }
}
