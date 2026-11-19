package a9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class j extends p9.a {

    @NonNull
    public static final Parcelable.Creator<j> CREATOR = new x();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final da.q f383n;

    public j(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, da.q qVar) {
        this.f375f = (String) o9.s.l(str);
        this.f376g = str2;
        this.f377h = str3;
        this.f378i = str4;
        this.f379j = uri;
        this.f380k = str5;
        this.f381l = str6;
        this.f382m = str7;
        this.f383n = qVar;
    }

    public String A3() {
        return this.f378i;
    }

    public String B3() {
        return this.f377h;
    }

    public String C3() {
        return this.f381l;
    }

    @NonNull
    public String D3() {
        return this.f375f;
    }

    public String E3() {
        return this.f380k;
    }

    @Deprecated
    public String F3() {
        return this.f382m;
    }

    public Uri G3() {
        return this.f379j;
    }

    public da.q H3() {
        return this.f383n;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return o9.q.b(this.f375f, jVar.f375f) && o9.q.b(this.f376g, jVar.f376g) && o9.q.b(this.f377h, jVar.f377h) && o9.q.b(this.f378i, jVar.f378i) && o9.q.b(this.f379j, jVar.f379j) && o9.q.b(this.f380k, jVar.f380k) && o9.q.b(this.f381l, jVar.f381l) && o9.q.b(this.f382m, jVar.f382m) && o9.q.b(this.f383n, jVar.f383n);
    }

    public int hashCode() {
        return o9.q.c(this.f375f, this.f376g, this.f377h, this.f378i, this.f379j, this.f380k, this.f381l, this.f382m, this.f383n);
    }

    public String m() {
        return this.f376g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, D3(), false);
        p9.c.v(parcel, 2, m(), false);
        p9.c.v(parcel, 3, B3(), false);
        p9.c.v(parcel, 4, A3(), false);
        p9.c.t(parcel, 5, G3(), i10, false);
        p9.c.v(parcel, 6, E3(), false);
        p9.c.v(parcel, 7, C3(), false);
        p9.c.v(parcel, 8, F3(), false);
        p9.c.t(parcel, 9, H3(), i10, false);
        p9.c.b(parcel, iA);
    }
}
