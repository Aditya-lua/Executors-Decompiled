package y9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.drive.DriveId;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class a extends p9.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ParcelFileDescriptor f37706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f37708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DriveId f37709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f37710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f37711k;

    public a(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, @NonNull DriveId driveId, boolean z10, String str) {
        this.f37706f = parcelFileDescriptor;
        this.f37707g = i10;
        this.f37708h = i11;
        this.f37709i = driveId;
        this.f37710j = z10;
        this.f37711k = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        ParcelFileDescriptor parcelFileDescriptor = this.f37706f;
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 2, parcelFileDescriptor, i10, false);
        p9.c.n(parcel, 3, this.f37707g);
        p9.c.n(parcel, 4, this.f37708h);
        p9.c.t(parcel, 5, this.f37709i, i10, false);
        p9.c.c(parcel, 7, this.f37710j);
        p9.c.v(parcel, 8, this.f37711k, false);
        p9.c.b(parcel, iA);
    }
}
