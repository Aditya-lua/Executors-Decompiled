package gb;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends p9.a {
    public static final Parcelable.Creator<k2> CREATOR = new l2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Intent f17641f;

    public k2(Intent intent) {
        this.f17641f = intent;
    }

    public static k2 a(Intent intent) {
        return new k2(intent);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k2) {
            return o9.q.b(this.f17641f, ((k2) obj).f17641f);
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.f17641f;
        if (intent != null) {
            return intent.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return o9.q.d(this).a("resultData", this.f17641f).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Intent intent = this.f17641f;
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, intent, i10, false);
        p9.c.b(parcel, iA);
    }
}
