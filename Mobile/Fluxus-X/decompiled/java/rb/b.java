package rb;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import l9.p;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p9.a implements p {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f30630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Intent f30632h;

    public b() {
        this(2, 0, null);
    }

    @Override // l9.p
    public final Status n() {
        return this.f30631g == 0 ? Status.f6108k : Status.f6112o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f30630f;
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, i11);
        p9.c.n(parcel, 2, this.f30631g);
        p9.c.t(parcel, 3, this.f30632h, i10, false);
        p9.c.b(parcel, iA);
    }

    public b(int i10, int i11, Intent intent) {
        this.f30630f = i10;
        this.f30631g = i11;
        this.f30632h = intent;
    }
}
