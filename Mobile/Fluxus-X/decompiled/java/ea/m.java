package ea;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class m extends ha.p {

    @NonNull
    public static final Parcelable.Creator<m> CREATOR = new c0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f13270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f13271i;

    public m(long j10, long j11, @NonNull l lVar, @NonNull l lVar2) {
        o9.s.p(j10 != -1);
        o9.s.l(lVar);
        o9.s.l(lVar2);
        this.f13268f = j10;
        this.f13269g = j11;
        this.f13270h = lVar;
        this.f13271i = lVar2;
    }

    @NonNull
    public l A3() {
        return this.f13270h;
    }

    public long B3() {
        return this.f13268f;
    }

    public long C3() {
        return this.f13269g;
    }

    @NonNull
    public l D3() {
        return this.f13271i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        m mVar = (m) obj;
        return o9.q.b(Long.valueOf(this.f13268f), Long.valueOf(mVar.f13268f)) && o9.q.b(Long.valueOf(this.f13269g), Long.valueOf(mVar.f13269g)) && o9.q.b(this.f13270h, mVar.f13270h) && o9.q.b(this.f13271i, mVar.f13271i);
    }

    public int hashCode() {
        return o9.q.c(Long.valueOf(this.f13268f), Long.valueOf(this.f13269g), this.f13270h, this.f13271i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.r(parcel, 1, B3());
        p9.c.r(parcel, 2, C3());
        p9.c.t(parcel, 3, A3(), i10, false);
        p9.c.t(parcel, 4, D3(), i10, false);
        p9.c.b(parcel, iA);
    }
}
