package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import ca.i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.k2;
import eb.m2;
import eb.y2;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import n9.k;
import n9.m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f6041g = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f6042f;

    public zzak(byte[][] bArr) {
        m.a(bArr != null);
        m.a(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            m.a(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            m.a(bArr[i11] != null);
            int length = bArr[i11].length;
            m.a(length == 32 || length == 64);
            i10 += 2;
        }
        this.f6042f = bArr;
    }

    public static zzak a(JSONObject jSONObject, boolean z10) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z10) {
                    arrayList.add(x3(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(y3(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(u9.c.a(next));
                    if (z10) {
                        arrayList.add(x3(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(y3(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new zzak((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject v3(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", u9.c.b(bArr));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] w3(byte[] bArr) {
        k2 k2VarZza = m2.a().zza();
        k2VarZza.a(f6041g);
        k2VarZza.a(bArr);
        return k2VarZza.zzc().d();
    }

    public static byte[] x3(JSONObject jSONObject) throws JSONException {
        byte[] bArrA = u9.c.a(jSONObject.getString("first"));
        if (bArrA.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrA;
        }
        byte[] bArrA2 = u9.c.a(jSONObject.getString("second"));
        if (bArrA2.length == 32) {
            return y2.a(bArrA, bArrA2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] y3(JSONObject jSONObject) {
        byte[] bArrW3 = w3(u9.c.a(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrW3 : y2.a(bArrW3, w3(u9.c.a(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzak) {
            return Arrays.deepEquals(this.f6042f, ((zzak) obj).f6042f);
        }
        return false;
    }

    public final int hashCode() {
        int iC = 0;
        for (byte[] bArr : this.f6042f) {
            if (bArr != null) {
                iC ^= k.c(bArr);
            }
        }
        return iC;
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i10 = 0;
            JSONObject jSONObject2 = null;
            while (true) {
                byte[][] bArr = this.f6042f;
                if (i10 >= bArr.length) {
                    return "PrfExtension{" + jSONObject.toString() + "}";
                }
                if (bArr[i10] == null) {
                    jSONObject.put("eval", v3(bArr[i10 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(u9.c.b(this.f6042f[i10]), v3(this.f6042f[i10 + 1]));
                }
                i10 += 2;
            }
        } catch (JSONException e10) {
            return "PrfExtension{Exception:" + e10.getMessage() + "}";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[][] bArr = this.f6042f;
        int iA = o9.b.a(parcel);
        o9.b.h(parcel, 1, bArr, false);
        o9.b.b(parcel, iA);
    }
}
