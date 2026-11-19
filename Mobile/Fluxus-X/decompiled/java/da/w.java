package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import fb.m3;

/* JADX INFO: loaded from: classes.dex */
public class w extends p9.a {

    @NonNull
    public static final Parcelable.Creator<w> CREATOR = new y0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final m3 f12140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final String f12141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f12142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final String f12143i;

    public w(m3 m3Var, String str, String str2, String str3) {
        this.f12140f = (m3) o9.s.l(m3Var);
        this.f12141g = (String) o9.s.l(str);
        this.f12142h = str2;
        this.f12143i = (String) o9.s.l(str3);
    }

    public String A3() {
        return this.f12142h;
    }

    @NonNull
    public byte[] B3() {
        return this.f12140f.n();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return o9.q.b(this.f12140f, wVar.f12140f) && o9.q.b(this.f12141g, wVar.f12141g) && o9.q.b(this.f12142h, wVar.f12142h) && o9.q.b(this.f12143i, wVar.f12143i);
    }

    @NonNull
    public String getName() {
        return this.f12141g;
    }

    public int hashCode() {
        return o9.q.c(this.f12140f, this.f12141g, this.f12142h, this.f12143i);
    }

    @NonNull
    public String m() {
        return this.f12143i;
    }

    @NonNull
    public final String toString() {
        return "PublicKeyCredentialUserEntity{\n id=" + v9.c.b(this.f12140f.n()) + ", \n name='" + this.f12141g + "', \n icon='" + this.f12142h + "', \n displayName='" + this.f12143i + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.g(parcel, 2, B3(), false);
        p9.c.v(parcel, 3, getName(), false);
        p9.c.v(parcel, 4, A3(), false);
        p9.c.v(parcel, 5, m(), false);
        p9.c.b(parcel, iA);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w(@NonNull byte[] bArr, @NonNull String str, String str2, @NonNull String str3) {
        byte[] bArr2 = (byte[]) o9.s.l(bArr);
        m3 m3Var = m3.b;
        this(m3.m(bArr2, 0, bArr2.length), str, str2, str3);
    }
}
