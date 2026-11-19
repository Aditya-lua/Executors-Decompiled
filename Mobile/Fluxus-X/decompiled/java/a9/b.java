package a9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class b extends p9.a {

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PendingIntent f356f;

    public b(@NonNull PendingIntent pendingIntent) {
        this.f356f = (PendingIntent) o9.s.l(pendingIntent);
    }

    @NonNull
    public PendingIntent A3() {
        return this.f356f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, A3(), i10, false);
        p9.c.b(parcel, iA);
    }
}
