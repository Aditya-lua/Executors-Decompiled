package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import ca.C1584c0;
import com.google.android.gms.fido.common.Transport;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p100eb.AbstractC4923e4;
import p100eb.AbstractC4970m3;
import p100eb.AbstractC5017u2;
import p100eb.C4905b4;
import p100eb.C4917d4;
import p100eb.C4949j0;
import p100eb.C4955k0;
import p100eb.C5041y2;
import p100eb.C5042y3;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;
import p462u9.C11812c;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new C1584c0();

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AbstractC4970m3 f7629f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AbstractC4970m3 f7630g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AbstractC4970m3 f7631h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final String[] f7632i;

    public AuthenticatorAttestationResponse(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, @NonNull String[] strArr) {
        byte[] bArr4 = (byte[]) C8953m.m36047l(bArr);
        AbstractC4970m3 abstractC4970m3 = AbstractC4970m3.f19698b;
        AbstractC4970m3 abstractC4970m3M23673m = AbstractC4970m3.m23673m(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) C8953m.m36047l(bArr2);
        AbstractC4970m3 abstractC4970m3M23673m2 = AbstractC4970m3.m23673m(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) C8953m.m36047l(bArr3);
        AbstractC4970m3 abstractC4970m3M23673m3 = AbstractC4970m3.m23673m(bArr6, 0, bArr6.length);
        this.f7629f = (AbstractC4970m3) C8953m.m36047l(abstractC4970m3M23673m);
        this.f7630g = (AbstractC4970m3) C8953m.m36047l(abstractC4970m3M23673m2);
        this.f7631h = (AbstractC4970m3) C8953m.m36047l(abstractC4970m3M23673m3);
        this.f7632i = (String[]) C8953m.m36047l(strArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return C8947k.m36026b(this.f7629f, authenticatorAttestationResponse.f7629f) && C8947k.m36026b(this.f7630g, authenticatorAttestationResponse.f7630g) && C8947k.m36026b(this.f7631h, authenticatorAttestationResponse.f7631h);
    }

    public int hashCode() {
        return C8947k.m36027c(Integer.valueOf(C8947k.m36027c(this.f7629f)), Integer.valueOf(C8947k.m36027c(this.f7630g)), Integer.valueOf(C8947k.m36027c(this.f7631h)));
    }

    @NonNull
    public String toString() {
        C4949j0 c4949j0M23650a = C4955k0.m23650a(this);
        AbstractC5017u2 abstractC5017u2M23707d = AbstractC5017u2.m23707d();
        byte[] bArrM9280x3 = m9280x3();
        c4949j0M23650a.m23644b("keyHandle", abstractC5017u2M23707d.m23708e(bArrM9280x3, 0, bArrM9280x3.length));
        AbstractC5017u2 abstractC5017u2M23707d2 = AbstractC5017u2.m23707d();
        byte[] bArrM9279w3 = m9279w3();
        c4949j0M23650a.m23644b("clientDataJSON", abstractC5017u2M23707d2.m23708e(bArrM9279w3, 0, bArrM9279w3.length));
        AbstractC5017u2 abstractC5017u2M23707d3 = AbstractC5017u2.m23707d();
        byte[] bArrM9278v3 = m9278v3();
        c4949j0M23650a.m23644b("attestationObject", abstractC5017u2M23707d3.m23708e(bArrM9278v3, 0, bArrM9278v3.length));
        c4949j0M23650a.m23644b("transports", Arrays.toString(this.f7632i));
        return c4949j0M23650a.toString();
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public byte[] m9278v3() {
        return this.f7631h.m23675p();
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public byte[] m9279w3() {
        return this.f7630g.m23675p();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38463g(parcel, 2, m9280x3(), false);
        C9718b.m38463g(parcel, 3, m9279w3(), false);
        C9718b.m38463g(parcel, 4, m9278v3(), false);
        C9718b.m38479w(parcel, 5, m9281y3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: x3 */
    public byte[] m9280x3() {
        return this.f7629f.m23675p();
    }

    @NonNull
    /* JADX INFO: renamed from: y3 */
    public String[] m9281y3() {
        return this.f7632i;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0110  */
    /* JADX WARN: Code duplicated, block: B:41:0x0125 A[Catch: JSONException -> 0x0019, d4 -> 0x018e, TRY_LEAVE, TryCatch #5 {d4 -> 0x018e, blocks: (B:33:0x00f4, B:39:0x0113, B:41:0x0125, B:46:0x0139, B:49:0x015b, B:51:0x0171, B:53:0x0177, B:56:0x0191, B:57:0x0196, B:58:0x0197, B:59:0x019c, B:64:0x01a7, B:66:0x01b7, B:68:0x01c5, B:69:0x01d8, B:70:0x01dd, B:71:0x01de, B:72:0x01e3, B:77:0x0202, B:78:0x0207), top: B:110:0x00f4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x019d  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x0202 A[Catch: JSONException -> 0x0019, d4 -> 0x018e, TRY_ENTER, TryCatch #5 {d4 -> 0x018e, blocks: (B:33:0x00f4, B:39:0x0113, B:41:0x0125, B:46:0x0139, B:49:0x015b, B:51:0x0171, B:53:0x0177, B:56:0x0191, B:57:0x0196, B:58:0x0197, B:59:0x019c, B:64:0x01a7, B:66:0x01b7, B:68:0x01c5, B:69:0x01d8, B:70:0x01dd, B:71:0x01de, B:72:0x01e3, B:77:0x0202, B:78:0x0207), top: B:110:0x00f4, outer: #3 }] */
    @NonNull
    /* JADX INFO: renamed from: z3 */
    public final JSONObject m9282z3() {
        AbstractC4923e4 abstractC4923e4;
        byte[] bArrM23726a;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f7630g != null) {
                jSONObject.put("clientDataJSON", C11812c.m44172b(m9279w3()));
            }
            if (this.f7631h != null) {
                jSONObject.put("attestationObject", C11812c.m44172b(m9278v3()));
            }
            JSONArray jSONArray = new JSONArray();
            int i10 = 0;
            while (true) {
                String[] strArr = this.f7632i;
                if (i10 >= strArr.length) {
                    break;
                }
                if (strArr[i10].equals(Transport.HYBRID.toString())) {
                    jSONArray.put(i10, "hybrid");
                } else {
                    jSONArray.put(i10, this.f7632i[i10]);
                }
                i10++;
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    AbstractC4923e4 abstractC4923e5 = (AbstractC4923e4) AbstractC4923e4.m23582n(m9278v3()).m23587j().m23558q().get(AbstractC4923e4.m23581l("authData"));
                    if (abstractC4923e5 == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    AbstractC4970m3 abstractC4970m3M23718q = abstractC4923e5.m23585d().m23718q();
                    ByteBuffer byteBufferMo23648i = abstractC4970m3M23718q.mo23648i();
                    try {
                        byteBufferMo23648i.position(byteBufferMo23648i.position() + 32);
                        if ((byteBufferMo23648i.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        byteBufferMo23648i.position(byteBufferMo23648i.position() + 4);
                        byteBufferMo23648i.position(byteBufferMo23648i.position() + 16);
                        byteBufferMo23648i.position(byteBufferMo23648i.position() + byteBufferMo23648i.getShort());
                        try {
                            C4905b4 c4905b4M23587j = AbstractC4923e4.m23583o(abstractC4970m3M23718q.mo23646g(byteBufferMo23648i.position(), abstractC4970m3M23718q.mo23600d()).mo23647h()).m23587j();
                            AbstractC4923e4 abstractC4923e6 = (AbstractC4923e4) c4905b4M23587j.m23558q().get(AbstractC4923e4.m23580h(3L));
                            AbstractC4923e4 abstractC4923e7 = (AbstractC4923e4) c4905b4M23587j.m23558q().get(AbstractC4923e4.m23580h(1L));
                            if (abstractC4923e6 == null || abstractC4923e7 == null) {
                                throw new IllegalArgumentException("COSE key missing required fields");
                            }
                            try {
                                long jM23727q = abstractC4923e6.m23586e().m23727q();
                                long jM23727q2 = abstractC4923e7.m23586e().m23727q();
                                if (jM23727q2 == 1) {
                                    abstractC4923e4 = (AbstractC4923e4) c4905b4M23587j.m23558q().get(AbstractC4923e4.m23580h(-1L));
                                    if (abstractC4923e4 != null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    long jM23727q3 = abstractC4923e4.m23586e().m23727q();
                                    if (jM23727q2 != 2 && jM23727q3 == 1) {
                                        AbstractC4923e4 abstractC4923e8 = (AbstractC4923e4) c4905b4M23587j.m23558q().get(AbstractC4923e4.m23580h(-2L));
                                        AbstractC4923e4 abstractC4923e9 = (AbstractC4923e4) c4905b4M23587j.m23558q().get(AbstractC4923e4.m23580h(-3L));
                                        if (abstractC4923e8 == null || abstractC4923e9 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        AbstractC4970m3 abstractC4970m3M23718q2 = abstractC4923e8.m23585d().m23718q();
                                        AbstractC4970m3 abstractC4970m3M23718q3 = abstractC4923e9.m23585d().m23718q();
                                        if (abstractC4970m3M23718q2.mo23600d() != 32 || abstractC4970m3M23718q3.mo23600d() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        bArrM23726a = C5041y2.m23726a(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), abstractC4970m3M23718q2.m23675p(), abstractC4970m3M23718q3.m23675p());
                                    } else if (jM23727q2 == 1 || jM23727q3 != 6) {
                                        bArrM23726a = null;
                                    } else {
                                        AbstractC4923e4 abstractC4923e10 = (AbstractC4923e4) c4905b4M23587j.m23558q().get(AbstractC4923e4.m23580h(-2L));
                                        if (abstractC4923e10 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        AbstractC4970m3 abstractC4970m3M23718q4 = abstractC4923e10.m23585d().m23718q();
                                        if (abstractC4970m3M23718q4.mo23600d() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        bArrM23726a = C5041y2.m23726a(Base64.decode("MCowBQYDK2VwAyEA", 0), abstractC4970m3M23718q4.m23675p());
                                    }
                                } else if (jM23727q2 == 2) {
                                    jM23727q2 = 2;
                                    abstractC4923e4 = (AbstractC4923e4) c4905b4M23587j.m23558q().get(AbstractC4923e4.m23580h(-1L));
                                    if (abstractC4923e4 != null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    long jM23727q4 = abstractC4923e4.m23586e().m23727q();
                                    if (jM23727q2 != 2) {
                                        if (jM23727q2 == 1) {
                                            bArrM23726a = null;
                                        } else {
                                            bArrM23726a = null;
                                        }
                                    } else if (jM23727q2 == 1) {
                                        bArrM23726a = null;
                                    } else {
                                        bArrM23726a = null;
                                    }
                                } else {
                                    bArrM23726a = null;
                                }
                                jSONObject.put("authenticatorData", C11812c.m44172b(abstractC4970m3M23718q.m23675p()));
                                jSONObject.put("publicKeyAlgorithm", jM23727q);
                                if (bArrM23726a != null) {
                                    jSONObject.put("publicKey", C11812c.m44172b(bArrM23726a));
                                }
                                return jSONObject;
                            } catch (C4917d4 e10) {
                                throw new IllegalArgumentException("COSE key ill-formed", e10);
                            }
                        } catch (C4917d4 e11) {
                            e = e11;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        } catch (C5042y3 e12) {
                            e = e12;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e13) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e13);
                    }
                } catch (C4917d4 e14) {
                    throw new IllegalArgumentException("authData value has wrong type", e14);
                }
            } catch (C4917d4 e15) {
                e = e15;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (C5042y3 e16) {
                e = e16;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e17) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e17);
        }
    }
}
