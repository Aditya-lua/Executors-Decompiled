package ga;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import ea.k;
import n9.e;

/* JADX INFO: loaded from: classes.dex */
public interface a extends e<a>, Parcelable {
    @NonNull
    k Q1();

    @NonNull
    String V0();

    @NonNull
    String getDescription();

    @NonNull
    @KeepName
    @Deprecated
    String getIconImageUrl();

    @NonNull
    String getName();

    long getValue();

    @NonNull
    Uri h();

    boolean isVisible();

    @NonNull
    String p3();
}
