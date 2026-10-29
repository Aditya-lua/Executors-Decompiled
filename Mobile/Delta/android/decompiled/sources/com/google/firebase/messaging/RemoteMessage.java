package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new n0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f8717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, String> f8718g;

    public RemoteMessage(Bundle bundle) {
        this.f8717f = bundle;
    }

    @NonNull
    public Map<String, String> v3() {
        if (this.f8718g == null) {
            this.f8718g = d.a.a(this.f8717f);
        }
        return this.f8718g;
    }

    public final int w3(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        n0.c(this, parcel, i10);
    }

    public int x3() {
        String string = this.f8717f.getString("google.original_priority");
        if (string == null) {
            string = this.f8717f.getString("google.priority");
        }
        return w3(string);
    }

    public int y3() {
        String string = this.f8717f.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.f8717f.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.f8717f.getString("google.priority");
        }
        return w3(string);
    }
}
