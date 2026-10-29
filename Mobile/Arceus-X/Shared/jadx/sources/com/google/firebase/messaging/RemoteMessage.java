package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C3011n0();

    /* JADX INFO: renamed from: f */
    public Bundle f11207f;

    /* JADX INFO: renamed from: g */
    public Map<String, String> f11208g;

    public RemoteMessage(Bundle bundle) {
        this.f11207f = bundle;
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public Map<String, String> m14448v3() {
        if (this.f11208g == null) {
            this.f11208g = C2985d.a.m14508a(this.f11207f);
        }
        return this.f11208g;
    }

    /* JADX INFO: renamed from: w3 */
    public final int m14449w3(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        C3011n0.m14630c(this, parcel, i10);
    }

    /* JADX INFO: renamed from: x3 */
    public int m14450x3() {
        String string = this.f11207f.getString("google.original_priority");
        if (string == null) {
            string = this.f11207f.getString("google.priority");
        }
        return m14449w3(string);
    }

    /* JADX INFO: renamed from: y3 */
    public int m14451y3() {
        String string = this.f11207f.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.f11207f.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.f11207f.getString("google.priority");
        }
        return m14449w3(string);
    }
}
