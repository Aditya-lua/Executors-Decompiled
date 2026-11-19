package ea;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p extends ha.p implements d {
    public static final Parcelable.Creator<p> CREATOR = new q();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13277f;

    public p(int i10) {
        this.f13277f = i10;
    }

    public static boolean A3(d dVar, Object obj) {
        if (obj instanceof d) {
            return obj == dVar || ((d) obj).C1() == dVar.C1();
        }
        return false;
    }

    public static String B3(d dVar) {
        o9.q.a aVarD = o9.q.d(dVar);
        aVarD.a("FriendsListVisibilityStatus", Integer.valueOf(dVar.C1()));
        return aVarD.toString();
    }

    public static int a(d dVar) {
        return o9.q.c(Integer.valueOf(dVar.C1()));
    }

    @Override // ea.d
    public final int C1() {
        return this.f13277f;
    }

    public final boolean equals(Object obj) {
        return A3(this, obj);
    }

    @Override // n9.e
    public final /* bridge */ /* synthetic */ d freeze() {
        return this;
    }

    public final int hashCode() {
        return a(this);
    }

    public final String toString() {
        return B3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        q.a(this, parcel, i10);
    }

    public p(d dVar) {
        this.f13277f = dVar.C1();
    }
}
