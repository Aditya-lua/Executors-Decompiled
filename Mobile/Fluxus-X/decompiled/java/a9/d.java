package a9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class d extends p9.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new p();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f357f;

    public static final class a {
        public /* synthetic */ a(o oVar) {
        }

        @NonNull
        public d a() {
            return new d(0);
        }
    }

    public d(int i10) {
        this.f357f = i10;
    }

    @NonNull
    public static a A3() {
        return new a(null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return o9.q.b(Integer.valueOf(this.f357f), Integer.valueOf(((d) obj).f357f));
        }
        return false;
    }

    public int hashCode() {
        return o9.q.c(Integer.valueOf(this.f357f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f357f;
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, i11);
        p9.c.b(parcel, iA);
    }
}
