package da;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.common.Transport;
import fb.b4;
import fb.d4;
import fb.e4;
import fb.m3;
import fb.u2;
import fb.y2;
import fb.y3;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h extends j {

    @NonNull
    public static final Parcelable.Creator<h> CREATOR = new s1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final m3 f12043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final m3 f12044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final m3 f12045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final String[] f12046i;

    public h(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, @NonNull String[] strArr) {
        byte[] bArr4 = (byte[]) o9.s.l(bArr);
        m3 m3Var = m3.b;
        m3 m3VarM = m3.m(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) o9.s.l(bArr2);
        m3 m3VarM2 = m3.m(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) o9.s.l(bArr3);
        m3 m3VarM3 = m3.m(bArr6, 0, bArr6.length);
        this.f12043f = (m3) o9.s.l(m3VarM);
        this.f12044g = (m3) o9.s.l(m3VarM2);
        this.f12045h = (m3) o9.s.l(m3VarM3);
        this.f12046i = (String[]) o9.s.l(strArr);
    }

    @NonNull
    public byte[] A3() {
        return this.f12045h.n();
    }

    @NonNull
    public byte[] B3() {
        return this.f12044g.n();
    }

    @NonNull
    @Deprecated
    public byte[] C3() {
        return this.f12043f.n();
    }

    @NonNull
    public String[] D3() {
        return this.f12046i;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0110  */
    /* JADX WARN: Code duplicated, block: B:41:0x0125 A[Catch: JSONException -> 0x0019, d4 -> 0x018e, TRY_LEAVE, TryCatch #3 {d4 -> 0x018e, blocks: (B:33:0x00f4, B:39:0x0113, B:41:0x0125, B:46:0x0139, B:49:0x015b, B:51:0x0171, B:53:0x0177, B:56:0x0191, B:57:0x0196, B:58:0x0197, B:59:0x019c, B:64:0x01a7, B:66:0x01b7, B:68:0x01c5, B:69:0x01d8, B:70:0x01dd, B:71:0x01de, B:72:0x01e3, B:77:0x0202, B:78:0x0207), top: B:107:0x00f4, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x019d  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x0202 A[Catch: JSONException -> 0x0019, d4 -> 0x018e, TRY_ENTER, TryCatch #3 {d4 -> 0x018e, blocks: (B:33:0x00f4, B:39:0x0113, B:41:0x0125, B:46:0x0139, B:49:0x015b, B:51:0x0171, B:53:0x0177, B:56:0x0191, B:57:0x0196, B:58:0x0197, B:59:0x019c, B:64:0x01a7, B:66:0x01b7, B:68:0x01c5, B:69:0x01d8, B:70:0x01dd, B:71:0x01de, B:72:0x01e3, B:77:0x0202, B:78:0x0207), top: B:107:0x00f4, outer: #5 }] */
    @NonNull
    public final JSONObject E3() {
        e4 e4Var;
        byte[] bArrA;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f12044g != null) {
                jSONObject.put("clientDataJSON", v9.c.b(B3()));
            }
            if (this.f12045h != null) {
                jSONObject.put("attestationObject", v9.c.b(A3()));
            }
            JSONArray jSONArray = new JSONArray();
            int i10 = 0;
            while (true) {
                String[] strArr = this.f12046i;
                if (i10 >= strArr.length) {
                    break;
                }
                if (strArr[i10].equals(Transport.HYBRID.toString())) {
                    jSONArray.put(i10, "hybrid");
                } else {
                    jSONArray.put(i10, this.f12046i[i10]);
                }
                i10++;
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    e4 e4Var2 = (e4) e4.o(A3()).k().q().get(e4.m("authData"));
                    if (e4Var2 == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    m3 m3VarQ = e4Var2.d().q();
                    ByteBuffer byteBufferI = m3VarQ.i();
                    try {
                        byteBufferI.position(byteBufferI.position() + 32);
                        if ((byteBufferI.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        byteBufferI.position(byteBufferI.position() + 4);
                        byteBufferI.position(byteBufferI.position() + 16);
                        byteBufferI.position(byteBufferI.position() + byteBufferI.getShort());
                        try {
                            b4 b4VarK = e4.p(m3VarQ.g(byteBufferI.position(), m3VarQ.d()).h()).k();
                            e4 e4Var3 = (e4) b4VarK.q().get(e4.h(3L));
                            e4 e4Var4 = (e4) b4VarK.q().get(e4.h(1L));
                            if (e4Var3 == null || e4Var4 == null) {
                                throw new IllegalArgumentException("COSE key missing required fields");
                            }
                            try {
                                long jQ = e4Var3.e().q();
                                long jQ2 = e4Var4.e().q();
                                if (jQ2 == 1) {
                                    e4Var = (e4) b4VarK.q().get(e4.h(-1L));
                                    if (e4Var != null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    long jQ3 = e4Var.e().q();
                                    if (jQ2 != 2 && jQ3 == 1) {
                                        e4 e4Var5 = (e4) b4VarK.q().get(e4.h(-2L));
                                        e4 e4Var6 = (e4) b4VarK.q().get(e4.h(-3L));
                                        if (e4Var5 == null || e4Var6 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        m3 m3VarQ2 = e4Var5.d().q();
                                        m3 m3VarQ3 = e4Var6.d().q();
                                        if (m3VarQ2.d() != 32 || m3VarQ3.d() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        bArrA = y2.a(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), m3VarQ2.n(), m3VarQ3.n());
                                    } else if (jQ2 == 1 || jQ3 != 6) {
                                        bArrA = null;
                                    } else {
                                        e4 e4Var7 = (e4) b4VarK.q().get(e4.h(-2L));
                                        if (e4Var7 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        m3 m3VarQ4 = e4Var7.d().q();
                                        if (m3VarQ4.d() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        bArrA = y2.a(Base64.decode("MCowBQYDK2VwAyEA", 0), m3VarQ4.n());
                                    }
                                } else if (jQ2 == 2) {
                                    jQ2 = 2;
                                    e4Var = (e4) b4VarK.q().get(e4.h(-1L));
                                    if (e4Var != null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    long jQ4 = e4Var.e().q();
                                    if (jQ2 != 2) {
                                        if (jQ2 == 1) {
                                            bArrA = null;
                                        } else {
                                            bArrA = null;
                                        }
                                    } else if (jQ2 == 1) {
                                        bArrA = null;
                                    } else {
                                        bArrA = null;
                                    }
                                } else {
                                    bArrA = null;
                                }
                                jSONObject.put("authenticatorData", v9.c.b(m3VarQ.n()));
                                jSONObject.put("publicKeyAlgorithm", jQ);
                                if (bArrA != null) {
                                    jSONObject.put("publicKey", v9.c.b(bArrA));
                                }
                                return jSONObject;
                            } catch (d4 e10) {
                                throw new IllegalArgumentException("COSE key ill-formed", e10);
                            }
                        } catch (d4 e11) {
                            e = e11;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        } catch (y3 e12) {
                            e = e12;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e13) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e13);
                    }
                } catch (d4 e14) {
                    throw new IllegalArgumentException("authData value has wrong type", e14);
                }
            } catch (d4 e15) {
                e = e15;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (y3 e16) {
                e = e16;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e17) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e17);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return o9.q.b(this.f12043f, hVar.f12043f) && o9.q.b(this.f12044g, hVar.f12044g) && o9.q.b(this.f12045h, hVar.f12045h);
    }

    public int hashCode() {
        return o9.q.c(Integer.valueOf(o9.q.c(this.f12043f)), Integer.valueOf(o9.q.c(this.f12044g)), Integer.valueOf(o9.q.c(this.f12045h)));
    }

    @NonNull
    public String toString() {
        fb.j0 j0VarA = fb.k0.a(this);
        u2 u2VarD = u2.d();
        byte[] bArrC3 = C3();
        j0VarA.b("keyHandle", u2VarD.e(bArrC3, 0, bArrC3.length));
        u2 u2VarD2 = u2.d();
        byte[] bArrB3 = B3();
        j0VarA.b("clientDataJSON", u2VarD2.e(bArrB3, 0, bArrB3.length));
        u2 u2VarD3 = u2.d();
        byte[] bArrA3 = A3();
        j0VarA.b("attestationObject", u2VarD3.e(bArrA3, 0, bArrA3.length));
        j0VarA.b("transports", Arrays.toString(this.f12046i));
        return j0VarA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.g(parcel, 2, C3(), false);
        p9.c.g(parcel, 3, B3(), false);
        p9.c.g(parcel, 4, A3(), false);
        p9.c.w(parcel, 5, D3(), false);
        p9.c.b(parcel, iA);
    }
}
