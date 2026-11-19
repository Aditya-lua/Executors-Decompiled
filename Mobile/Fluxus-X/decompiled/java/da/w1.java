package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import fb.m3;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends p9.a {
    public static final Parcelable.Creator<w1> CREATOR = new x1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final m3 f12145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final m3 f12146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final m3 f12147i;

    public w1(long j10, @NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3) {
        byte[] bArr4 = (byte[]) o9.s.l(bArr);
        m3 m3Var = m3.b;
        m3 m3VarM = m3.m(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) o9.s.l(bArr2);
        m3 m3VarM2 = m3.m(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) o9.s.l(bArr3);
        m3 m3VarM3 = m3.m(bArr6, 0, bArr6.length);
        this.f12144f = j10;
        this.f12145g = (m3) o9.s.l(m3VarM);
        this.f12146h = (m3) o9.s.l(m3VarM2);
        this.f12147i = (m3) o9.s.l(m3VarM3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return this.f12144f == w1Var.f12144f && o9.q.b(this.f12145g, w1Var.f12145g) && o9.q.b(this.f12146h, w1Var.f12146h) && o9.q.b(this.f12147i, w1Var.f12147i);
    }

    public final int hashCode() {
        return o9.q.c(Long.valueOf(this.f12144f), this.f12145g, this.f12146h, this.f12147i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f12144f;
        int iA = p9.c.a(parcel);
        p9.c.r(parcel, 1, j10);
        p9.c.g(parcel, 2, this.f12145g.n(), false);
        p9.c.g(parcel, 3, this.f12146h.n(), false);
        p9.c.g(parcel, 4, this.f12147i.n(), false);
        p9.c.b(parcel, iA);
    }
}
