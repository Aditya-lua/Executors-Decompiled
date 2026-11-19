package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends p9.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f8703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, String> f8704g;

    public n0(Bundle bundle) {
        this.f8703f = bundle;
    }

    @NonNull
    public Map<String, String> A3() {
        if (this.f8704g == null) {
            this.f8704g = d.a.a(this.f8703f);
        }
        return this.f8704g;
    }

    public final int B3(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public int C3() {
        String string = this.f8703f.getString("google.original_priority");
        if (string == null) {
            string = this.f8703f.getString("google.priority");
        }
        return B3(string);
    }

    public int D3() {
        String string = this.f8703f.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.f8703f.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.f8703f.getString("google.priority");
        }
        return B3(string);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        o0.c(this, parcel, i10);
    }
}
