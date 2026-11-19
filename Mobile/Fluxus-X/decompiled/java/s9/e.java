package s9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class e extends p9.a {

    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PendingIntent f31250f;

    public e(PendingIntent pendingIntent) {
        this.f31250f = pendingIntent;
    }

    public PendingIntent A3() {
        return this.f31250f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, A3(), i10, false);
        p9.c.b(parcel, iA);
    }
}
