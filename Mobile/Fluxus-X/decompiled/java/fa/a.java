package fa;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import ea.k;
import n9.e;

/* JADX INFO: loaded from: classes.dex */
public interface a extends e<a>, Parcelable {
    Uri G2();

    @NonNull
    String I0();

    Uri K();

    String L1();

    int M2();

    String Z1();

    long g1();

    @NonNull
    String getDescription();

    @NonNull
    String getName();

    @KeepName
    @Deprecated
    String getRevealedImageUrl();

    int getState();

    int getType();

    @KeepName
    @Deprecated
    String getUnlockedImageUrl();

    int p1();

    long r2();

    @NonNull
    String zza();

    k zzb();

    float zzc();
}
