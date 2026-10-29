package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.games.Player;
import p290m9.InterfaceC8474e;

/* JADX INFO: loaded from: classes.dex */
public interface Event extends InterfaceC8474e<Event>, Parcelable {
    @NonNull
    /* JADX INFO: renamed from: O1 */
    Player mo9426O1();

    @NonNull
    /* JADX INFO: renamed from: V0 */
    String mo9427V0();

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
    /* JADX INFO: renamed from: h */
    Uri mo9428h();

    @NonNull
    /* JADX INFO: renamed from: i3 */
    String mo9429i3();

    boolean isVisible();
}
