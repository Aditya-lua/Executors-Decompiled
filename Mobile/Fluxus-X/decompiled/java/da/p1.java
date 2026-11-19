package da;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import fb.m3;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends p9.a {
    public static final Parcelable.Creator<p1> CREATOR = new q1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3 f12094g;

    public p1(boolean z10, m3 m3Var) {
        this.f12093f = z10;
        this.f12094g = m3Var;
    }

    public final JSONObject A3() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f12093f) {
                jSONObject.put("enabled", true);
            }
            byte[] bArrB3 = B3();
            if (bArrB3 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrB3, 32), 11));
                if (bArrB3.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrB3, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e10);
        }
    }

    public final byte[] B3() {
        m3 m3Var = this.f12094g;
        if (m3Var == null) {
            return null;
        }
        return m3Var.n();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.f12093f == p1Var.f12093f && o9.q.b(this.f12094g, p1Var.f12094g);
    }

    public final int hashCode() {
        return o9.q.c(Boolean.valueOf(this.f12093f), this.f12094g);
    }

    public final String toString() {
        return "AuthenticationExtensionsPrfOutputs{" + A3().toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        boolean z10 = this.f12093f;
        int iA = p9.c.a(parcel);
        p9.c.c(parcel, 1, z10);
        p9.c.g(parcel, 2, B3(), false);
        p9.c.b(parcel, iA);
    }
}
