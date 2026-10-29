package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.games.Player;
import m9.e;

/* JADX INFO: loaded from: classes.dex */
public interface Event extends e<Event>, Parcelable {
    @NonNull
    Player O1();

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

    @NonNull
    String i3();

    boolean isVisible();
}
