package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y1 extends p9.a {
    public static final Parcelable.Creator<y1> CREATOR = new z1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final List f12157f;

    public y1(@NonNull List list) {
        this.f12157f = (List) o9.s.l(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return this.f12157f.containsAll(y1Var.f12157f) && y1Var.f12157f.containsAll(this.f12157f);
    }

    public final int hashCode() {
        return o9.q.c(new HashSet(this.f12157f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f12157f;
        int iA = p9.c.a(parcel);
        p9.c.z(parcel, 1, list, false);
        p9.c.b(parcel, iA);
    }
}
