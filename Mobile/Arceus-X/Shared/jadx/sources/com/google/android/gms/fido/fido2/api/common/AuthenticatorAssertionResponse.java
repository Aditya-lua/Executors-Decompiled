package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1582b0;
import org.json.JSONException;
import org.json.JSONObject;
import p100eb.AbstractC4970m3;
import p100eb.AbstractC5017u2;
import p100eb.C4949j0;
import p100eb.C4955k0;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;
import p462u9.C11812c;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new C1582b0();

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AbstractC4970m3 f7624f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AbstractC4970m3 f7625g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AbstractC4970m3 f7626h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AbstractC4970m3 f7627i;

    /* JADX INFO: renamed from: j */
    public final AbstractC4970m3 f7628j;

    public AuthenticatorAssertionResponse(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, @NonNull byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = (byte[]) C8953m.m36047l(bArr);
        AbstractC4970m3 abstractC4970m3 = AbstractC4970m3.f19698b;
        AbstractC4970m3 abstractC4970m3M23673m = AbstractC4970m3.m23673m(bArr6, 0, bArr6.length);
        byte[] bArr7 = (byte[]) C8953m.m36047l(bArr2);
        AbstractC4970m3 abstractC4970m3M23673m2 = AbstractC4970m3.m23673m(bArr7, 0, bArr7.length);
        byte[] bArr8 = (byte[]) C8953m.m36047l(bArr3);
        AbstractC4970m3 abstractC4970m3M23673m3 = AbstractC4970m3.m23673m(bArr8, 0, bArr8.length);
        byte[] bArr9 = (byte[]) C8953m.m36047l(bArr4);
        AbstractC4970m3 abstractC4970m3M23673m4 = AbstractC4970m3.m23673m(bArr9, 0, bArr9.length);
        AbstractC4970m3 abstractC4970m3M23673m5 = bArr5 == null ? null : AbstractC4970m3.m23673m(bArr5, 0, bArr5.length);
        this.f7624f = (AbstractC4970m3) C8953m.m36047l(abstractC4970m3M23673m);
        this.f7625g = (AbstractC4970m3) C8953m.m36047l(abstractC4970m3M23673m2);
        this.f7626h = (AbstractC4970m3) C8953m.m36047l(abstractC4970m3M23673m3);
        this.f7627i = (AbstractC4970m3) C8953m.m36047l(abstractC4970m3M23673m4);
        this.f7628j = abstractC4970m3M23673m5;
    }

    @NonNull
    /* JADX INFO: renamed from: A3 */
    public final JSONObject m9272A3() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", C11812c.m44172b(m9274w3()));
            jSONObject.put("authenticatorData", C11812c.m44172b(m9273v3()));
            jSONObject.put("signature", C11812c.m44172b(m9276y3()));
            if (this.f7628j == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", C11812c.m44172b(m9277z3()));
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return C8947k.m36026b(this.f7624f, authenticatorAssertionResponse.f7624f) && C8947k.m36026b(this.f7625g, authenticatorAssertionResponse.f7625g) && C8947k.m36026b(this.f7626h, authenticatorAssertionResponse.f7626h) && C8947k.m36026b(this.f7627i, authenticatorAssertionResponse.f7627i) && C8947k.m36026b(this.f7628j, authenticatorAssertionResponse.f7628j);
    }

    public int hashCode() {
        return C8947k.m36027c(Integer.valueOf(C8947k.m36027c(this.f7624f)), Integer.valueOf(C8947k.m36027c(this.f7625g)), Integer.valueOf(C8947k.m36027c(this.f7626h)), Integer.valueOf(C8947k.m36027c(this.f7627i)), Integer.valueOf(C8947k.m36027c(this.f7628j)));
    }

    @NonNull
    public String toString() {
        C4949j0 c4949j0M23650a = C4955k0.m23650a(this);
        AbstractC5017u2 abstractC5017u2M23707d = AbstractC5017u2.m23707d();
        byte[] bArrM9275x3 = m9275x3();
        c4949j0M23650a.m23644b("keyHandle", abstractC5017u2M23707d.m23708e(bArrM9275x3, 0, bArrM9275x3.length));
        AbstractC5017u2 abstractC5017u2M23707d2 = AbstractC5017u2.m23707d();
        byte[] bArrM9274w3 = m9274w3();
        c4949j0M23650a.m23644b("clientDataJSON", abstractC5017u2M23707d2.m23708e(bArrM9274w3, 0, bArrM9274w3.length));
        AbstractC5017u2 abstractC5017u2M23707d3 = AbstractC5017u2.m23707d();
        byte[] bArrM9273v3 = m9273v3();
        c4949j0M23650a.m23644b("authenticatorData", abstractC5017u2M23707d3.m23708e(bArrM9273v3, 0, bArrM9273v3.length));
        AbstractC5017u2 abstractC5017u2M23707d4 = AbstractC5017u2.m23707d();
        byte[] bArrM9276y3 = m9276y3();
        c4949j0M23650a.m23644b("signature", abstractC5017u2M23707d4.m23708e(bArrM9276y3, 0, bArrM9276y3.length));
        byte[] bArrM9277z3 = m9277z3();
        if (bArrM9277z3 != null) {
            c4949j0M23650a.m23644b("userHandle", AbstractC5017u2.m23707d().m23708e(bArrM9277z3, 0, bArrM9277z3.length));
        }
        return c4949j0M23650a.toString();
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public byte[] m9273v3() {
        return this.f7626h.m23675p();
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public byte[] m9274w3() {
        return this.f7625g.m23675p();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38463g(parcel, 2, m9275x3(), false);
        C9718b.m38463g(parcel, 3, m9274w3(), false);
        C9718b.m38463g(parcel, 4, m9273v3(), false);
        C9718b.m38463g(parcel, 5, m9276y3(), false);
        C9718b.m38463g(parcel, 6, m9277z3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: x3 */
    public byte[] m9275x3() {
        return this.f7624f.m23675p();
    }

    @NonNull
    /* JADX INFO: renamed from: y3 */
    public byte[] m9276y3() {
        return this.f7627i.m23675p();
    }

    /* JADX INFO: renamed from: z3 */
    public byte[] m9277z3() {
        AbstractC4970m3 abstractC4970m3 = this.f7628j;
        if (abstractC4970m3 == null) {
            return null;
        }
        return abstractC4970m3.m23675p();
    }
}
