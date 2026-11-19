package qa;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import ea.k;

/* JADX INFO: loaded from: classes.dex */
public interface c extends n9.e<c>, Parcelable {
    long A0();

    @NonNull
    String D1();

    String F2();

    Uri T0();

    boolean U2();

    long Y1();

    @NonNull
    k Z0();

    @KeepName
    @Deprecated
    String getCoverImageUrl();

    @NonNull
    String getDescription();

    long i0();

    float o3();

    @NonNull
    String v3();

    @NonNull
    ea.e z3();

    @NonNull
    String zza();
}
