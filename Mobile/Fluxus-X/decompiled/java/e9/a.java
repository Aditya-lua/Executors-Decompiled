package e9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class a extends p9.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f13239h;

    public a(int i10, int i11, Bundle bundle) {
        this.f13237f = i10;
        this.f13238g = i11;
        this.f13239h = bundle;
    }

    public int getType() {
        return this.f13238g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, this.f13237f);
        p9.c.n(parcel, 2, getType());
        p9.c.f(parcel, 3, this.f13239h, false);
        p9.c.b(parcel, iA);
    }
}
