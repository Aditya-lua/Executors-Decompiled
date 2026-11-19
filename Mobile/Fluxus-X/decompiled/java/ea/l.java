package ea;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class l extends ha.p {

    @NonNull
    public static final Parcelable.Creator<l> CREATOR = new b0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13267h;

    public l(int i10, long j10, long j11) {
        o9.s.q(j10 >= 0, "Min XP must be positive!");
        o9.s.q(j11 > j10, "Max XP must be more than min XP!");
        this.f13265f = i10;
        this.f13266g = j10;
        this.f13267h = j11;
    }

    public int A3() {
        return this.f13265f;
    }

    public long B3() {
        return this.f13267h;
    }

    public long C3() {
        return this.f13266g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        l lVar = (l) obj;
        return o9.q.b(Integer.valueOf(lVar.A3()), Integer.valueOf(A3())) && o9.q.b(Long.valueOf(lVar.C3()), Long.valueOf(C3())) && o9.q.b(Long.valueOf(lVar.B3()), Long.valueOf(B3()));
    }

    public int hashCode() {
        return o9.q.c(Integer.valueOf(this.f13265f), Long.valueOf(this.f13266g), Long.valueOf(this.f13267h));
    }

    @NonNull
    public String toString() {
        return o9.q.d(this).a("LevelNumber", Integer.valueOf(A3())).a("MinXp", Long.valueOf(C3())).a("MaxXp", Long.valueOf(B3())).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, A3());
        p9.c.r(parcel, 2, C3());
        p9.c.r(parcel, 3, B3());
        p9.c.b(parcel, iA);
    }
}
