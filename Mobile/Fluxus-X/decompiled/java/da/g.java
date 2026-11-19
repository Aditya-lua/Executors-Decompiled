package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import fb.m3;
import fb.u2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g extends j {

    @NonNull
    public static final Parcelable.Creator<g> CREATOR = new r1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final m3 f12038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final m3 f12039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final m3 f12040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final m3 f12041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m3 f12042j;

    public g(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, @NonNull byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = (byte[]) o9.s.l(bArr);
        m3 m3Var = m3.b;
        m3 m3VarM = m3.m(bArr6, 0, bArr6.length);
        byte[] bArr7 = (byte[]) o9.s.l(bArr2);
        m3 m3VarM2 = m3.m(bArr7, 0, bArr7.length);
        byte[] bArr8 = (byte[]) o9.s.l(bArr3);
        m3 m3VarM3 = m3.m(bArr8, 0, bArr8.length);
        byte[] bArr9 = (byte[]) o9.s.l(bArr4);
        m3 m3VarM4 = m3.m(bArr9, 0, bArr9.length);
        m3 m3VarM5 = bArr5 == null ? null : m3.m(bArr5, 0, bArr5.length);
        this.f12038f = (m3) o9.s.l(m3VarM);
        this.f12039g = (m3) o9.s.l(m3VarM2);
        this.f12040h = (m3) o9.s.l(m3VarM3);
        this.f12041i = (m3) o9.s.l(m3VarM4);
        this.f12042j = m3VarM5;
    }

    @NonNull
    public byte[] A3() {
        return this.f12040h.n();
    }

    @NonNull
    public byte[] B3() {
        return this.f12039g.n();
    }

    @NonNull
    @Deprecated
    public byte[] C3() {
        return this.f12038f.n();
    }

    @NonNull
    public byte[] D3() {
        return this.f12041i.n();
    }

    public byte[] E3() {
        m3 m3Var = this.f12042j;
        if (m3Var == null) {
            return null;
        }
        return m3Var.n();
    }

    @NonNull
    public final JSONObject F3() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", v9.c.b(B3()));
            jSONObject.put("authenticatorData", v9.c.b(A3()));
            jSONObject.put("signature", v9.c.b(D3()));
            if (this.f12042j == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", v9.c.b(E3()));
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return o9.q.b(this.f12038f, gVar.f12038f) && o9.q.b(this.f12039g, gVar.f12039g) && o9.q.b(this.f12040h, gVar.f12040h) && o9.q.b(this.f12041i, gVar.f12041i) && o9.q.b(this.f12042j, gVar.f12042j);
    }

    public int hashCode() {
        return o9.q.c(Integer.valueOf(o9.q.c(this.f12038f)), Integer.valueOf(o9.q.c(this.f12039g)), Integer.valueOf(o9.q.c(this.f12040h)), Integer.valueOf(o9.q.c(this.f12041i)), Integer.valueOf(o9.q.c(this.f12042j)));
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
        j0VarA.b("authenticatorData", u2VarD3.e(bArrA3, 0, bArrA3.length));
        u2 u2VarD4 = u2.d();
        byte[] bArrD3 = D3();
        j0VarA.b("signature", u2VarD4.e(bArrD3, 0, bArrD3.length));
        byte[] bArrE3 = E3();
        if (bArrE3 != null) {
            j0VarA.b("userHandle", u2.d().e(bArrE3, 0, bArrE3.length));
        }
        return j0VarA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.g(parcel, 2, C3(), false);
        p9.c.g(parcel, 3, B3(), false);
        p9.c.g(parcel, 4, A3(), false);
        p9.c.g(parcel, 5, D3(), false);
        p9.c.g(parcel, 6, E3(), false);
        p9.c.b(parcel, iA);
    }
}
