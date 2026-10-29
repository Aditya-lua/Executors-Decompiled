package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p213j9.C7110o;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: f */
    public final int f7374f;

    /* JADX INFO: renamed from: g */
    public final int f7375g;

    /* JADX INFO: renamed from: h */
    public final PendingIntent f7376h;

    /* JADX INFO: renamed from: i */
    public final String f7377i;

    /* JADX INFO: renamed from: j */
    public final Integer f7378j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public static final ConnectionResult f7373k = new ConnectionResult(0);

    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C7110o();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str, Integer num) {
        this.f7374f = i10;
        this.f7375g = i11;
        this.f7376h = pendingIntent;
        this.f7377i = str;
        this.f7378j = num;
    }

    @NonNull
    /* JADX INFO: renamed from: B3 */
    public static String m9137B3(int i10) {
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

    /* JADX INFO: renamed from: A3 */
    public boolean m9138A3() {
        return this.f7375g == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f7375g == connectionResult.f7375g && C8947k.m36026b(this.f7376h, connectionResult.f7376h) && C8947k.m36026b(this.f7377i, connectionResult.f7377i) && C8947k.m36026b(this.f7378j, connectionResult.f7378j);
    }

    public int hashCode() {
        return C8947k.m36027c(Integer.valueOf(this.f7375g), this.f7376h, this.f7377i, this.f7378j);
    }

    @NonNull
    public String toString() {
        C8947k.a aVarM36028d = C8947k.m36028d(this);
        aVarM36028d.m36029a("statusCode", m9137B3(this.f7375g));
        aVarM36028d.m36029a("resolution", this.f7376h);
        aVarM36028d.m36029a("message", this.f7377i);
        aVarM36028d.m36029a("clientMethodKey", this.f7378j);
        return aVarM36028d.toString();
    }

    /* JADX INFO: renamed from: v3 */
    public Integer m9139v3() {
        return this.f7378j;
    }

    /* JADX INFO: renamed from: w3 */
    public int m9140w3() {
        return this.f7375g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f7374f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, i11);
        C9718b.m38470n(parcel, 2, m9140w3());
        C9718b.m38476t(parcel, 3, m9142y3(), i10, false);
        C9718b.m38478v(parcel, 4, m9141x3(), false);
        C9718b.m38473q(parcel, 5, m9139v3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public String m9141x3() {
        return this.f7377i;
    }

    /* JADX INFO: renamed from: y3 */
    public PendingIntent m9142y3() {
        return this.f7376h;
    }

    /* JADX INFO: renamed from: z3 */
    public boolean m9143z3() {
        return (this.f7375g == 0 || this.f7376h == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
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
