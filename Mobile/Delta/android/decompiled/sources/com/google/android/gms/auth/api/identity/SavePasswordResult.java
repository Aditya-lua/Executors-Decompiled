package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import n9.m;
import z8.j;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SavePasswordResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PendingIntent f5601f;

    public SavePasswordResult(@NonNull PendingIntent pendingIntent) {
        this.f5601f = (PendingIntent) m.l(pendingIntent);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SavePasswordResult) {
            return k.b(this.f5601f, ((SavePasswordResult) obj).f5601f);
        }
        return false;
    }

    public int hashCode() {
        return k.c(this.f5601f);
    }

    @NonNull
    public PendingIntent v3() {
        return this.f5601f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 1, v3(), i10, false);
        o9.b.b(parcel, iA);
    }
}
