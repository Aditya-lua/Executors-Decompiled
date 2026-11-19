package nf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import wa.f0;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends p9.a {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Thing[] f25511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f25512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String[] f25513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f0 f25514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f25515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f25516l;

    public g(int i10, Thing[] thingArr, String[] strArr, String[] strArr2, f0 f0Var, String str, String str2) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7) {
            i10 = 0;
        }
        this.f25510f = i10;
        this.f25511g = thingArr;
        this.f25512h = strArr;
        this.f25513i = strArr2;
        this.f25514j = f0Var;
        this.f25515k = str;
        this.f25516l = str2;
    }

    public static g A3() {
        return new g(4, null, null, null, null, null, null);
    }

    public static g B3(Thing... thingArr) {
        return new g(1, thingArr, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, this.f25510f);
        p9.c.y(parcel, 2, this.f25511g, i10, false);
        p9.c.w(parcel, 3, this.f25512h, false);
        p9.c.w(parcel, 5, this.f25513i, false);
        p9.c.t(parcel, 6, this.f25514j, i10, false);
        p9.c.v(parcel, 7, this.f25515k, false);
        p9.c.v(parcel, 8, this.f25516l, false);
        p9.c.b(parcel, iA);
    }
}
