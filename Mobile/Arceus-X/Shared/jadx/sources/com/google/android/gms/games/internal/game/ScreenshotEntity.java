package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.zzg;
import p192ia.C6718c;
import p290m9.InterfaceC8474e;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class ScreenshotEntity extends zzg implements InterfaceC8474e, Parcelable {

    @NonNull
    public static final Parcelable.Creator<ScreenshotEntity> CREATOR = new C6718c();

    /* JADX INFO: renamed from: f */
    public final Uri f7862f;

    /* JADX INFO: renamed from: g */
    public final int f7863g;

    /* JADX INFO: renamed from: h */
    public final int f7864h;

    public ScreenshotEntity(@NonNull Uri uri, int i10, int i11) {
        this.f7862f = uri;
        this.f7863g = i10;
        this.f7864h = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScreenshotEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ScreenshotEntity screenshotEntity = (ScreenshotEntity) obj;
        return C8947k.m36026b(screenshotEntity.f7862f, this.f7862f) && C8947k.m36026b(Integer.valueOf(screenshotEntity.f7863g), Integer.valueOf(this.f7863g)) && C8947k.m36026b(Integer.valueOf(screenshotEntity.f7864h), Integer.valueOf(this.f7864h));
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f7862f, Integer.valueOf(this.f7863g), Integer.valueOf(this.f7864h));
    }

    @NonNull
    public final String toString() {
        return C8947k.m36028d(this).m36029a("Uri", this.f7862f).m36029a("Width", Integer.valueOf(this.f7863g)).m36029a("Height", Integer.valueOf(this.f7864h)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        Uri uri = this.f7862f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, uri, i10, false);
        C9718b.m38470n(parcel, 2, this.f7863g);
        C9718b.m38470n(parcel, 3, this.f7864h);
        C9718b.m38458b(parcel, iM38457a);
    }
}
