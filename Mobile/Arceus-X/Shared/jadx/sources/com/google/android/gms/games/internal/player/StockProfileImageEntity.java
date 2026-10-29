package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.zzg;
import p214ja.C7127f;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class StockProfileImageEntity extends zzg implements StockProfileImage {

    @NonNull
    public static final Parcelable.Creator<StockProfileImageEntity> CREATOR = new C7127f();

    /* JADX INFO: renamed from: f */
    public final String f7887f;

    /* JADX INFO: renamed from: g */
    public final Uri f7888g;

    /* JADX INFO: renamed from: h */
    public final String f7889h;

    public StockProfileImageEntity(@NonNull String str, @NonNull Uri uri, @NonNull String str2) {
        this.f7887f = str;
        this.f7888g = uri;
        this.f7889h = str2;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    @NonNull
    /* JADX INFO: renamed from: E0 */
    public String mo9449E0() {
        return this.f7887f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StockProfileImage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        StockProfileImage stockProfileImage = (StockProfileImage) obj;
        return C8947k.m36026b(this.f7887f, stockProfileImage.mo9449E0()) && C8947k.m36026b(this.f7888g, stockProfileImage.zza()) && C8947k.m36026b(this.f7889h, stockProfileImage.zzb());
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f7887f, this.f7888g);
    }

    @NonNull
    public final String toString() {
        return C8947k.m36028d(this).m36029a("ImageId", this.f7887f).m36029a("ImageUri", this.f7888g).m36029a("A11yLabel", this.f7889h).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, mo9449E0(), false);
        C9718b.m38476t(parcel, 2, this.f7888g, i10, false);
        C9718b.m38478v(parcel, 3, this.f7889h, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    @NonNull
    public final Uri zza() {
        return this.f7888g;
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    @NonNull
    public final String zzb() {
        return this.f7889h;
    }
}
