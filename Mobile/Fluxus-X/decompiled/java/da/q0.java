package da;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import fb.k2;
import fb.m2;
import fb.y2;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends p9.a {
    public static final Parcelable.Creator<q0> CREATOR = new r0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f12104g = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f12105f;

    public q0(byte[][] bArr) {
        o9.s.a(bArr != null);
        o9.s.a(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            o9.s.a(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            o9.s.a(bArr[i11] != null);
            int length = bArr[i11].length;
            o9.s.a(length == 32 || length == 64);
            i10 += 2;
        }
        this.f12105f = bArr;
    }

    public static JSONObject A3(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", v9.c.b(bArr));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] B3(byte[] bArr) {
        k2 k2VarZza = m2.a().zza();
        k2VarZza.a(f12104g);
        k2VarZza.a(bArr);
        return k2VarZza.zzc().d();
    }

    public static byte[] C3(JSONObject jSONObject) throws JSONException {
        byte[] bArrA = v9.c.a(jSONObject.getString("first"));
        if (bArrA.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrA;
        }
        byte[] bArrA2 = v9.c.a(jSONObject.getString("second"));
        if (bArrA2.length == 32) {
            return y2.a(bArrA, bArrA2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] D3(JSONObject jSONObject) {
        byte[] bArrB3 = B3(v9.c.a(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrB3 : y2.a(bArrB3, B3(v9.c.a(jSONObject.getString("second"))));
    }

    public static q0 a(JSONObject jSONObject, boolean z10) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z10) {
                    arrayList.add(C3(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(D3(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(v9.c.a(next));
                    if (z10) {
                        arrayList.add(C3(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(D3(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new q0((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            return Arrays.deepEquals(this.f12105f, ((q0) obj).f12105f);
        }
        return false;
    }

    public final int hashCode() {
        int iC = 0;
        for (byte[] bArr : this.f12105f) {
            if (bArr != null) {
                iC ^= o9.q.c(bArr);
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
                byte[][] bArr = this.f12105f;
                if (i10 >= bArr.length) {
                    return "PrfExtension{" + jSONObject.toString() + "}";
                }
                if (bArr[i10] == null) {
                    jSONObject.put("eval", A3(bArr[i10 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(v9.c.b(this.f12105f[i10]), A3(this.f12105f[i10 + 1]));
                }
                i10 += 2;
            }
        } catch (JSONException e10) {
            return "PrfExtension{Exception:" + e10.getMessage() + "}";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[][] bArr = this.f12105f;
        int iA = p9.c.a(parcel);
        p9.c.h(parcel, 1, bArr, false);
        p9.c.b(parcel, iA);
    }
}
