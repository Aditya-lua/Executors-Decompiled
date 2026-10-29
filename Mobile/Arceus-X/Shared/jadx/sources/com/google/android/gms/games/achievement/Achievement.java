package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.games.Player;
import p290m9.InterfaceC8474e;

/* JADX INFO: loaded from: classes.dex */
public interface Achievement extends InterfaceC8474e<Achievement>, Parcelable {
    /* JADX INFO: renamed from: C2 */
    Uri mo9414C2();

    /* JADX INFO: renamed from: H */
    Uri mo9415H();

    @NonNull
    /* JADX INFO: renamed from: H0 */
    String mo9416H0();

    /* JADX INFO: renamed from: J1 */
    String mo9417J1();

    /* JADX INFO: renamed from: J2 */
    int mo9418J2();

    /* JADX INFO: renamed from: W1 */
    String mo9419W1();

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

    /* JADX INFO: renamed from: i1 */
    long mo9420i1();

    /* JADX INFO: renamed from: n2 */
    long mo9421n2();

    /* JADX INFO: renamed from: q1 */
    int mo9422q1();

    @NonNull
    String zza();

    Player zzb();

    float zzc();
}
