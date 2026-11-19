package da;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends p9.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new l1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f12004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y1 f12005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f12006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e2 f12007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h0 f12008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j0 f12009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a2 f12010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m0 f12011m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p f12012n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q0 f12013o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a1 f12014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f12015q;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f12016a;
        public b0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public y1 f12017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e2 f12018d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public h0 f12019e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public j0 f12020f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public a2 f12021g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public m0 f12022h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public p f12023i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public q0 f12024j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public a1 f12025k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public o0 f12026l;

        @NonNull
        public d a() {
            return new d(this.f12016a, this.f12017c, this.b, this.f12018d, this.f12019e, this.f12020f, this.f12021g, this.f12022h, this.f12023i, this.f12024j, this.f12025k, this.f12026l);
        }

        @NonNull
        public a b(o oVar) {
            this.f12016a = oVar;
            return this;
        }

        @NonNull
        public a c(p pVar) {
            this.f12023i = pVar;
            return this;
        }

        @NonNull
        public a d(b0 b0Var) {
            this.b = b0Var;
            return this;
        }

        public final a e(y1 y1Var) {
            this.f12017c = y1Var;
            return this;
        }

        public final a f(a2 a2Var) {
            this.f12021g = a2Var;
            return this;
        }

        public final a g(e2 e2Var) {
            this.f12018d = e2Var;
            return this;
        }

        public final a h(h0 h0Var) {
            this.f12019e = h0Var;
            return this;
        }

        public final a i(j0 j0Var) {
            this.f12020f = j0Var;
            return this;
        }

        public final a j(m0 m0Var) {
            this.f12022h = m0Var;
            return this;
        }

        public final a k(q0 q0Var) {
            this.f12024j = q0Var;
            return this;
        }

        public final a l(a1 a1Var) {
            this.f12025k = a1Var;
            return this;
        }
    }

    public d(o oVar, y1 y1Var, b0 b0Var, e2 e2Var, h0 h0Var, j0 j0Var, a2 a2Var, m0 m0Var, p pVar, q0 q0Var, a1 a1Var, o0 o0Var) {
        this.f12004f = oVar;
        this.f12006h = b0Var;
        this.f12005g = y1Var;
        this.f12007i = e2Var;
        this.f12008j = h0Var;
        this.f12009k = j0Var;
        this.f12010l = a2Var;
        this.f12011m = m0Var;
        this.f12012n = pVar;
        this.f12013o = q0Var;
        this.f12014p = a1Var;
        this.f12015q = o0Var;
    }

    @NonNull
    public static d C3(@NonNull JSONObject jSONObject) throws JSONException {
        a aVar = new a();
        if (jSONObject.has("fidoAppIdExtension")) {
            aVar.b(new o(jSONObject.getJSONObject("fidoAppIdExtension").getString("appid")));
        }
        if (jSONObject.has("appid")) {
            aVar.b(new o(jSONObject.getString("appid")));
        }
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                throw new JSONException("both prf and prfAlreadyHashed extensions found");
            }
            aVar.k(q0.a(jSONObject.getJSONObject("prf"), false));
        } else if (jSONObject.has("prfAlreadyHashed")) {
            aVar.k(q0.a(jSONObject.getJSONObject("prfAlreadyHashed"), true));
        }
        if (jSONObject.has("cableAuthenticationExtension")) {
            JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                arrayList.add(new w1(jSONObject2.getLong("version"), Base64.decode(jSONObject2.getString("clientEid"), 11), Base64.decode(jSONObject2.getString("authenticatorEid"), 11), Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
            }
            aVar.e(new y1(arrayList));
        }
        if (jSONObject.has("userVerificationMethodExtension")) {
            aVar.d(new b0(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")));
        }
        if (jSONObject.has("google_multiAssertionExtension")) {
            aVar.g(new e2(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")));
        }
        if (jSONObject.has("google_sessionIdExtension")) {
            aVar.h(new h0(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId")));
        }
        if (jSONObject.has("google_silentVerificationExtension")) {
            aVar.i(new j0(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")));
        }
        if (jSONObject.has("devicePublicKeyExtension")) {
            aVar.f(new a2(jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey")));
        }
        if (jSONObject.has("google_tunnelServerIdExtension")) {
            aVar.j(new m0(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")));
        }
        if (jSONObject.has("google_thirdPartyPaymentExtension")) {
            aVar.c(new p(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")));
        }
        if (jSONObject.has("txAuthSimple")) {
            aVar.l(new a1(jSONObject.getString("txAuthSimple")));
        }
        return aVar.a();
    }

    public o A3() {
        return this.f12004f;
    }

    public b0 B3() {
        return this.f12006h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return o9.q.b(this.f12004f, dVar.f12004f) && o9.q.b(this.f12005g, dVar.f12005g) && o9.q.b(this.f12006h, dVar.f12006h) && o9.q.b(this.f12007i, dVar.f12007i) && o9.q.b(this.f12008j, dVar.f12008j) && o9.q.b(this.f12009k, dVar.f12009k) && o9.q.b(this.f12010l, dVar.f12010l) && o9.q.b(this.f12011m, dVar.f12011m) && o9.q.b(this.f12012n, dVar.f12012n) && o9.q.b(this.f12013o, dVar.f12013o) && o9.q.b(this.f12014p, dVar.f12014p) && o9.q.b(this.f12015q, dVar.f12015q);
    }

    public int hashCode() {
        return o9.q.c(this.f12004f, this.f12005g, this.f12006h, this.f12007i, this.f12008j, this.f12009k, this.f12010l, this.f12011m, this.f12012n, this.f12013o, this.f12014p, this.f12015q);
    }

    @NonNull
    public final String toString() {
        a1 a1Var = this.f12014p;
        q0 q0Var = this.f12013o;
        p pVar = this.f12012n;
        m0 m0Var = this.f12011m;
        a2 a2Var = this.f12010l;
        j0 j0Var = this.f12009k;
        h0 h0Var = this.f12008j;
        e2 e2Var = this.f12007i;
        b0 b0Var = this.f12006h;
        y1 y1Var = this.f12005g;
        return "AuthenticationExtensions{\n fidoAppIdExtension=" + String.valueOf(this.f12004f) + ", \n cableAuthenticationExtension=" + String.valueOf(y1Var) + ", \n userVerificationMethodExtension=" + String.valueOf(b0Var) + ", \n googleMultiAssertionExtension=" + String.valueOf(e2Var) + ", \n googleSessionIdExtension=" + String.valueOf(h0Var) + ", \n googleSilentVerificationExtension=" + String.valueOf(j0Var) + ", \n devicePublicKeyExtension=" + String.valueOf(a2Var) + ", \n googleTunnelServerIdExtension=" + String.valueOf(m0Var) + ", \n googleThirdPartyPaymentExtension=" + String.valueOf(pVar) + ", \n prfExtension=" + String.valueOf(q0Var) + ", \n simpleTransactionAuthorizationExtension=" + String.valueOf(a1Var) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 2, A3(), i10, false);
        p9.c.t(parcel, 3, this.f12005g, i10, false);
        p9.c.t(parcel, 4, B3(), i10, false);
        p9.c.t(parcel, 5, this.f12007i, i10, false);
        p9.c.t(parcel, 6, this.f12008j, i10, false);
        p9.c.t(parcel, 7, this.f12009k, i10, false);
        p9.c.t(parcel, 8, this.f12010l, i10, false);
        p9.c.t(parcel, 9, this.f12011m, i10, false);
        p9.c.t(parcel, 10, this.f12012n, i10, false);
        p9.c.t(parcel, 11, this.f12013o, i10, false);
        p9.c.t(parcel, 12, this.f12014p, i10, false);
        p9.c.t(parcel, 13, this.f12015q, i10, false);
        p9.c.b(parcel, iA);
    }
}
