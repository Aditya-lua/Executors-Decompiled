package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import ca.C1580a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p100eb.AbstractC4970m3;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C1580a0();

    /* JADX INFO: renamed from: f */
    public final boolean f7749f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4970m3 f7750g;

    public zzh(boolean z10, AbstractC4970m3 abstractC4970m3) {
        this.f7749f = z10;
        this.f7750g = abstractC4970m3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.f7749f == zzhVar.f7749f && C8947k.m36026b(this.f7750g, zzhVar.f7750g);
    }

    public final int hashCode() {
        return C8947k.m36027c(Boolean.valueOf(this.f7749f), this.f7750g);
    }

    public final String toString() {
        return "AuthenticationExtensionsPrfOutputs{" + m9364v3().toString() + "}";
    }

    /* JADX INFO: renamed from: v3 */
    public final JSONObject m9364v3() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f7749f) {
                jSONObject.put("enabled", true);
            }
            byte[] bArrM9365w3 = m9365w3();
            if (bArrM9365w3 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrM9365w3, 32), 11));
                if (bArrM9365w3.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrM9365w3, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e10);
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final byte[] m9365w3() {
        AbstractC4970m3 abstractC4970m3 = this.f7750g;
        if (abstractC4970m3 == null) {
            return null;
        }
        return abstractC4970m3.m23675p();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        boolean z10 = this.f7749f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38459c(parcel, 1, z10);
        C9718b.m38463g(parcel, 2, m9365w3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
