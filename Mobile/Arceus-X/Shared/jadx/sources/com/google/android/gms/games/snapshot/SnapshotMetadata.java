package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import p290m9.InterfaceC8474e;

/* JADX INFO: loaded from: classes.dex */
public interface SnapshotMetadata extends InterfaceC8474e<SnapshotMetadata>, Parcelable {
    /* JADX INFO: renamed from: A0 */
    long mo9495A0();

    /* JADX INFO: renamed from: B2 */
    String mo9496B2();

    @NonNull
    /* JADX INFO: renamed from: C1 */
    String mo9497C1();

    /* JADX INFO: renamed from: Q2 */
    boolean mo9498Q2();

    /* JADX INFO: renamed from: S0 */
    Uri mo9499S0();

    /* JADX INFO: renamed from: V1 */
    long mo9500V1();

    @NonNull
    /* JADX INFO: renamed from: Z0 */
    Player mo9501Z0();

    /* JADX INFO: renamed from: f0 */
    long mo9502f0();

    @KeepName
    @Deprecated
    String getCoverImageUrl();

    @NonNull
    String getDescription();

    /* JADX INFO: renamed from: h3 */
    float mo9503h3();

    @NonNull
    /* JADX INFO: renamed from: q3 */
    String mo9504q3();

    @NonNull
    /* JADX INFO: renamed from: u3 */
    Game mo9505u3();

    @NonNull
    String zza();
}
