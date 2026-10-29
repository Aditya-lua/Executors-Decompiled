package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j9.o;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f5691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f5693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public static final ConnectionResult f5688k = new ConnectionResult(0);

    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new o();

    public ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str, Integer num) {
        this.f5689f = i10;
        this.f5690g = i11;
        this.f5691h = pendingIntent;
        this.f5692i = str;
        this.f5693j = num;
    }

    @NonNull
    public static String B3(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return Payload.RESPONSE_DEVELOPER_ERROR;
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return Payload.RESPONSE_TIMEOUT;
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i10);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public boolean A3() {
        return this.f5690g == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f5690g == connectionResult.f5690g && k.b(this.f5691h, connectionResult.f5691h) && k.b(this.f5692i, connectionResult.f5692i) && k.b(this.f5693j, connectionResult.f5693j);
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f5690g), this.f5691h, this.f5692i, this.f5693j);
    }

    @NonNull
    public String toString() {
        k.a aVarD = k.d(this);
        aVarD.a("statusCode", B3(this.f5690g));
        aVarD.a("resolution", this.f5691h);
        aVarD.a("message", this.f5692i);
        aVarD.a("clientMethodKey", this.f5693j);
        return aVarD.toString();
    }

    public Integer v3() {
        return this.f5693j;
    }

    public int w3() {
        return this.f5690g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f5689f;
        int iA = b.a(parcel);
        b.n(parcel, 1, i11);
        b.n(parcel, 2, w3());
        b.t(parcel, 3, y3(), i10, false);
        b.v(parcel, 4, x3(), false);
        b.q(parcel, 5, v3(), false);
        b.b(parcel, iA);
    }

    public String x3() {
        return this.f5692i;
    }

    public PendingIntent y3() {
        return this.f5691h;
    }

    public boolean z3() {
        return (this.f5690g == 0 || this.f5691h == null) ? false : true;
    }

    public ConnectionResult(int i10) {
        this(i10, null, null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str, null);
    }
}
