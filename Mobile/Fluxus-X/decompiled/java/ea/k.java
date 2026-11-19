package ea;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes.dex */
public interface k extends n9.e<k>, Parcelable {
    Uri E();

    Uri I1();

    boolean c();

    o c1();

    long d();

    long e0();

    d g2();

    @KeepName
    @Deprecated
    String getBannerImageLandscapeUrl();

    @KeepName
    @Deprecated
    String getBannerImagePortraitUrl();

    @KeepName
    @Deprecated
    String getHiResImageUrl();

    @KeepName
    @Deprecated
    String getIconImageUrl();

    String getTitle();

    Uri h();

    Uri h0();

    @NonNull
    String m();

    @NonNull
    String r3();

    @Deprecated
    long s0();

    m z0();

    String zza();

    String zzb();

    @NonNull
    String zzc();

    boolean zzd();

    @Deprecated
    int zze();

    boolean zzf();

    ka.b zzh();
}
