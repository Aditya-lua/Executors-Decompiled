package ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends p9.a {
    public static final Parcelable.Creator<i0> CREATOR = new j0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0 f27457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f27458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f27459i;

    public i0(i0 i0Var, long j10) {
        o9.s.l(i0Var);
        this.f27456f = i0Var.f27456f;
        this.f27457g = i0Var.f27457g;
        this.f27458h = i0Var.f27458h;
        this.f27459i = j10;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f27457g);
        String str = this.f27458h;
        int length = String.valueOf(str).length();
        String str2 = this.f27456f;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        j0.a(this, parcel, i10);
    }

    public i0(String str, g0 g0Var, String str2, long j10) {
        this.f27456f = str;
        this.f27457g = g0Var;
        this.f27458h = str2;
        this.f27459i = j10;
    }
}
