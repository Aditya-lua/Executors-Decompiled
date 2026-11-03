package ma;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.games.Player;
import m9.e;

/* JADX INFO: loaded from: classes.dex */
public interface b extends e<b> {
    Player L();

    @NonNull
    String N2();

    @NonNull
    Uri V2();

    @NonNull
    String a0();

    @NonNull
    Uri e3();

    @NonNull
    String f1();

    @NonNull
    @KeepName
    @Deprecated
    String getScoreHolderHiResImageUrl();

    @NonNull
    @KeepName
    @Deprecated
    String getScoreHolderIconImageUrl();

    long h2();

    long k2();

    long l2();

    @NonNull
    String v1();
}
