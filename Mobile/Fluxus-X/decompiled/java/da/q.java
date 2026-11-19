package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import fb.m3;
import fb.p4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class q extends p9.a {

    @NonNull
    public static final Parcelable.Creator<q> CREATOR = new t0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final String f12096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3 f12097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f12098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f12099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f12100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f12101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f12102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f12103n;

    public q(String str, @NonNull String str2, m3 m3Var, h hVar, g gVar, i iVar, e eVar, String str3, String str4) {
        boolean z10 = false;
        o9.s.b((hVar != null && gVar == null && iVar == null) || (hVar == null && gVar != null && iVar == null) || (hVar == null && gVar == null && iVar != null), "Must provide a response object.");
        if (iVar != null || (str != null && m3Var != null)) {
            z10 = true;
        }
        o9.s.b(z10, "Must provide id and rawId if not an error response.");
        this.f12095f = str;
        this.f12096g = str2;
        this.f12097h = m3Var;
        this.f12098i = hVar;
        this.f12099j = gVar;
        this.f12100k = iVar;
        this.f12101l = eVar;
        this.f12102m = str3;
        this.f12103n = null;
    }

    @NonNull
    public static q a(@NonNull byte[] bArr) {
        return (q) p9.d.a(bArr, CREATOR);
    }

    public String A3() {
        return this.f12102m;
    }

    public e B3() {
        return this.f12101l;
    }

    public String C3() {
        return this.f12095f;
    }

    public byte[] D3() {
        m3 m3Var = this.f12097h;
        if (m3Var == null) {
            return null;
        }
        return m3Var.n();
    }

    @NonNull
    public j E3() {
        h hVar = this.f12098i;
        if (hVar != null) {
            return hVar;
        }
        g gVar = this.f12099j;
        if (gVar != null) {
            return gVar;
        }
        i iVar = this.f12100k;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("No response set.");
    }

    @NonNull
    public String F3() {
        return this.f12096g;
    }

    @NonNull
    public String G3() {
        return H3().toString();
    }

    @NonNull
    public final JSONObject H3() {
        JSONObject jSONObjectD3;
        try {
            JSONObject jSONObject = new JSONObject();
            m3 m3Var = this.f12097h;
            if (m3Var != null && m3Var.n().length > 0) {
                jSONObject.put("rawId", v9.c.b(this.f12097h.n()));
            }
            String str = this.f12102m;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.f12096g;
            if (str2 != null && this.f12100k == null) {
                jSONObject.put(Payload.TYPE, str2);
            }
            String str3 = this.f12095f;
            if (str3 != null) {
                jSONObject.put("id", str3);
            }
            String str4 = Payload.RESPONSE;
            g gVar = this.f12099j;
            boolean z10 = true;
            if (gVar != null) {
                jSONObjectD3 = gVar.F3();
            } else {
                h hVar = this.f12098i;
                if (hVar != null) {
                    jSONObjectD3 = hVar.E3();
                } else {
                    i iVar = this.f12100k;
                    z10 = false;
                    if (iVar != null) {
                        jSONObjectD3 = iVar.D3();
                        str4 = "error";
                    } else {
                        jSONObjectD3 = null;
                    }
                }
            }
            if (jSONObjectD3 != null) {
                jSONObject.put(str4, jSONObjectD3);
            }
            e eVar = this.f12101l;
            if (eVar != null) {
                jSONObject.put("clientExtensionResults", eVar.C3());
                return jSONObject;
            }
            if (z10) {
                jSONObject.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return o9.q.b(this.f12095f, qVar.f12095f) && o9.q.b(this.f12096g, qVar.f12096g) && o9.q.b(this.f12097h, qVar.f12097h) && o9.q.b(this.f12098i, qVar.f12098i) && o9.q.b(this.f12099j, qVar.f12099j) && o9.q.b(this.f12100k, qVar.f12100k) && o9.q.b(this.f12101l, qVar.f12101l) && o9.q.b(this.f12102m, qVar.f12102m);
    }

    public int hashCode() {
        return o9.q.c(this.f12095f, this.f12096g, this.f12097h, this.f12099j, this.f12098i, this.f12100k, this.f12101l, this.f12102m);
    }

    @NonNull
    public final String toString() {
        m3 m3Var = this.f12097h;
        byte[] bArrN = m3Var == null ? null : m3Var.n();
        String str = this.f12096g;
        String str2 = this.f12095f;
        h hVar = this.f12098i;
        g gVar = this.f12099j;
        i iVar = this.f12100k;
        e eVar = this.f12101l;
        String str3 = this.f12102m;
        return "PublicKeyCredential{\n id='" + str2 + "', \n type='" + str + "', \n rawId=" + v9.c.b(bArrN) + ", \n registerResponse=" + String.valueOf(hVar) + ", \n signResponse=" + String.valueOf(gVar) + ", \n errorResponse=" + String.valueOf(iVar) + ", \n extensionsClientOutputs=" + String.valueOf(eVar) + ", \n authenticatorAttachment='" + str3 + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        if (p4.b()) {
            this.f12103n = H3().toString();
        }
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, C3(), false);
        p9.c.v(parcel, 2, F3(), false);
        p9.c.g(parcel, 3, D3(), false);
        p9.c.t(parcel, 4, this.f12098i, i10, false);
        p9.c.t(parcel, 5, this.f12099j, i10, false);
        p9.c.t(parcel, 6, this.f12100k, i10, false);
        p9.c.t(parcel, 7, B3(), i10, false);
        p9.c.v(parcel, 8, A3(), false);
        p9.c.v(parcel, 9, this.f12103n, false);
        p9.c.b(parcel, iA);
        this.f12103n = null;
    }

    public q(String str, @NonNull String str2, byte[] bArr, h hVar, g gVar, i iVar, e eVar, String str3, String str4) {
        this(str, str2, bArr == null ? null : m3.m(bArr, 0, bArr.length), hVar, gVar, iVar, eVar, str3, str4);
    }
}
