package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import i9.c;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class CloudMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Intent f5759f;

    public CloudMessage(@NonNull Intent intent) {
        this.f5759f = intent;
    }

    @NonNull
    public Intent v3() {
        return this.f5759f;
    }

    public String w3() {
        String stringExtra = this.f5759f.getStringExtra("google.message_id");
        return stringExtra == null ? this.f5759f.getStringExtra("message_id") : stringExtra;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.t(parcel, 1, this.f5759f, i10, false);
        b.b(parcel, iA);
    }

    public final Integer x3() {
        if (this.f5759f.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f5759f.getIntExtra("google.product_id", 0));
        }
        return null;
    }
}
