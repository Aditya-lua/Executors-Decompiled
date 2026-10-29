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
    String O2();

    @NonNull
    Uri W2();

    @NonNull
    String b0();

    @NonNull
    Uri c3();

    @NonNull
    @KeepName
    @Deprecated
    String getScoreHolderHiResImageUrl();

    @NonNull
    @KeepName
    @Deprecated
    String getScoreHolderIconImageUrl();

    long h2();

    @NonNull
    String i1();

    long k2();

    long l2();

    @NonNull
    String x1();
}
