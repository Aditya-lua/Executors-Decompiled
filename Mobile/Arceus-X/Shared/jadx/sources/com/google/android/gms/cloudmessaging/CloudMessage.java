package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p191i9.C6688c;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class CloudMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new C6688c();

    /* JADX INFO: renamed from: f */
    @NonNull
    public final Intent f7371f;

    public CloudMessage(@NonNull Intent intent) {
        this.f7371f = intent;
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public Intent m9132v3() {
        return this.f7371f;
    }

    /* JADX INFO: renamed from: w3 */
    public String m9133w3() {
        String stringExtra = this.f7371f.getStringExtra("google.message_id");
        return stringExtra == null ? this.f7371f.getStringExtra("message_id") : stringExtra;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, this.f7371f, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public final Integer m9134x3() {
        if (this.f7371f.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f7371f.getIntExtra("google.product_id", 0));
        }
        return null;
    }
}
