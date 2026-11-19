package k9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f21218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f21219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f21220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public static final b f21215k = new b(0);

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new q();

    public b(int i10, int i11, PendingIntent pendingIntent, String str, Integer num) {
        this.f21216f = i10;
        this.f21217g = i11;
        this.f21218h = pendingIntent;
        this.f21219i = str;
        this.f21220j = num;
    }

    @NonNull
    public static String G3(int i10) {
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
                    case MlKitException.UNSUPPORTED /* 18 */:
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

    public Integer A3() {
        return this.f21220j;
    }

    public int B3() {
        return this.f21217g;
    }

    public String C3() {
        return this.f21219i;
    }

    public PendingIntent D3() {
        return this.f21218h;
    }

    public boolean E3() {
        return (this.f21217g == 0 || this.f21218h == null) ? false : true;
    }

    public boolean F3() {
        return this.f21217g == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21217g == bVar.f21217g && o9.q.b(this.f21218h, bVar.f21218h) && o9.q.b(this.f21219i, bVar.f21219i) && o9.q.b(this.f21220j, bVar.f21220j);
    }

    public int hashCode() {
        return o9.q.c(Integer.valueOf(this.f21217g), this.f21218h, this.f21219i, this.f21220j);
    }

    @NonNull
    public String toString() {
        o9.q.a aVarD = o9.q.d(this);
        aVarD.a("statusCode", G3(this.f21217g));
        aVarD.a("resolution", this.f21218h);
        aVarD.a("message", this.f21219i);
        aVarD.a("clientMethodKey", this.f21220j);
        return aVarD.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f21216f;
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, i11);
        p9.c.n(parcel, 2, B3());
        p9.c.t(parcel, 3, D3(), i10, false);
        p9.c.v(parcel, 4, C3(), false);
        p9.c.q(parcel, 5, A3(), false);
        p9.c.b(parcel, iA);
    }

    public b(int i10) {
        this(i10, null, null);
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str, null);
    }
}
