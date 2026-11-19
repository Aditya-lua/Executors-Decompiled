package o9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class e extends p9.a {

    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new a0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f26936g;

    public e(int i10, String str) {
        this.f26935f = i10;
        this.f26936g = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f26935f == this.f26935f && q.b(eVar.f26936g, this.f26936g);
    }

    public final int hashCode() {
        return this.f26935f;
    }

    @NonNull
    public final String toString() {
        return this.f26935f + ":" + this.f26936g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f26935f;
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, i11);
        p9.c.v(parcel, 2, this.f26936g, false);
        p9.c.b(parcel, iA);
    }
}
