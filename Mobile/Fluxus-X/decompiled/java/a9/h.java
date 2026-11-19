package a9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class h extends p9.a {

    @NonNull
    public static final Parcelable.Creator<h> CREATOR = new w();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PendingIntent f374f;

    public h(@NonNull PendingIntent pendingIntent) {
        this.f374f = (PendingIntent) o9.s.l(pendingIntent);
    }

    @NonNull
    public PendingIntent A3() {
        return this.f374f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return o9.q.b(this.f374f, ((h) obj).f374f);
        }
        return false;
    }

    public int hashCode() {
        return o9.q.c(this.f374f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, A3(), i10, false);
        p9.c.b(parcel, iA);
    }
}
