package nf;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends p9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f25506g = new a(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f25507h = new a(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f25508i = new a(3);
    public static final Parcelable.Creator<a> CREATOR = new b();

    public a(int i10) {
        this.f25509f = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, this.f25509f);
        p9.c.b(parcel, iA);
    }
}
