package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import ca.C1595i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p100eb.C4969m2;
import p100eb.C5041y2;
import p100eb.InterfaceC4957k2;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;
import p462u9.C11812c;

/* JADX INFO: loaded from: classes.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new C1595i();

    /* JADX INFO: renamed from: g */
    public static final byte[] f7744g = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: f */
    public final byte[][] f7745f;

    public zzak(byte[][] bArr) {
        C8953m.m36036a(bArr != null);
        C8953m.m36036a(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            C8953m.m36036a(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            C8953m.m36036a(bArr[i11] != null);
            int length = bArr[i11].length;
            C8953m.m36036a(length == 32 || length == 64);
            i10 += 2;
        }
        this.f7745f = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static zzak m9359a(JSONObject jSONObject, boolean z10) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z10) {
                    arrayList.add(m9362x3(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(m9363y3(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(C11812c.m44171a(next));
                    if (z10) {
                        arrayList.add(m9362x3(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(m9363y3(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new zzak((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static JSONObject m9360v3(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", C11812c.m44172b(bArr));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    /* JADX INFO: renamed from: w3 */
    public static byte[] m9361w3(byte[] bArr) {
        InterfaceC4957k2 interfaceC4957k2Zza = C4969m2.m23671a().zza();
        interfaceC4957k2Zza.mo23577a(f7744g);
        interfaceC4957k2Zza.mo23577a(bArr);
        return interfaceC4957k2Zza.zzc().mo23616d();
    }

    /* JADX INFO: renamed from: x3 */
    public static byte[] m9362x3(JSONObject jSONObject) throws JSONException {
        byte[] bArrM44171a = C11812c.m44171a(jSONObject.getString("first"));
        if (bArrM44171a.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrM44171a;
        }
        byte[] bArrM44171a2 = C11812c.m44171a(jSONObject.getString("second"));
        if (bArrM44171a2.length == 32) {
            return C5041y2.m23726a(bArrM44171a, bArrM44171a2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    /* JADX INFO: renamed from: y3 */
    public static byte[] m9363y3(JSONObject jSONObject) {
        byte[] bArrM9361w3 = m9361w3(C11812c.m44171a(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrM9361w3 : C5041y2.m23726a(bArrM9361w3, m9361w3(C11812c.m44171a(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzak) {
            return Arrays.deepEquals(this.f7745f, ((zzak) obj).f7745f);
        }
        return false;
    }

    public final int hashCode() {
        int iM36027c = 0;
        for (byte[] bArr : this.f7745f) {
            if (bArr != null) {
                iM36027c ^= C8947k.m36027c(bArr);
            }
        }
        return iM36027c;
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i10 = 0;
            JSONObject jSONObject2 = null;
            while (true) {
                byte[][] bArr = this.f7745f;
                if (i10 >= bArr.length) {
                    return "PrfExtension{" + jSONObject.toString() + "}";
                }
                if (bArr[i10] == null) {
                    jSONObject.put("eval", m9360v3(bArr[i10 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(C11812c.m44172b(this.f7745f[i10]), m9360v3(this.f7745f[i10 + 1]));
                }
                i10 += 2;
            }
        } catch (JSONException e10) {
            return "PrfExtension{Exception:" + e10.getMessage() + "}";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[][] bArr = this.f7745f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38464h(parcel, 1, bArr, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
