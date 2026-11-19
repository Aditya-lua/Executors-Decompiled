package da;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class r extends y {

    @NonNull
    public static final Parcelable.Creator<r> CREATOR = new s0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final u f12106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final w f12107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final byte[] f12108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final List f12109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f12110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f12111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f12112l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f12113m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a0 f12114n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f12115o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f12116p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f12117q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ResultReceiver f12118r;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u f12119a;
        public w b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f12120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f12121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Double f12122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f12123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public k f12124g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f12125h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public a0 f12126i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public c f12127j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public d f12128k;

        @NonNull
        public r a() {
            u uVar = this.f12119a;
            w wVar = this.b;
            byte[] bArr = this.f12120c;
            List list = this.f12121d;
            Double d10 = this.f12122e;
            List list2 = this.f12123f;
            k kVar = this.f12124g;
            Integer num = this.f12125h;
            a0 a0Var = this.f12126i;
            c cVar = this.f12127j;
            return new r(uVar, wVar, bArr, list, d10, list2, kVar, num, a0Var, cVar == null ? null : cVar.toString(), this.f12128k, null, null);
        }

        @NonNull
        public a b(c cVar) {
            this.f12127j = cVar;
            return this;
        }

        @NonNull
        public a c(d dVar) {
            this.f12128k = dVar;
            return this;
        }

        @NonNull
        public a d(k kVar) {
            this.f12124g = kVar;
            return this;
        }

        @NonNull
        public a e(@NonNull byte[] bArr) {
            this.f12120c = (byte[]) o9.s.l(bArr);
            return this;
        }

        @NonNull
        public a f(List<s> list) {
            this.f12123f = list;
            return this;
        }

        @NonNull
        public a g(@NonNull List<t> list) {
            this.f12121d = (List) o9.s.l(list);
            return this;
        }

        @NonNull
        public a h(@NonNull u uVar) {
            this.f12119a = (u) o9.s.l(uVar);
            return this;
        }

        @NonNull
        public a i(Double d10) {
            this.f12122e = d10;
            return this;
        }

        @NonNull
        public a j(@NonNull w wVar) {
            this.b = (w) o9.s.l(wVar);
            return this;
        }
    }

    public r(@NonNull u uVar, @NonNull w wVar, @NonNull byte[] bArr, @NonNull List list, Double d10, List list2, k kVar, Integer num, a0 a0Var, String str, d dVar, String str2, ResultReceiver resultReceiver) {
        this.f12118r = resultReceiver;
        if (str2 != null) {
            try {
                r rVarM3 = M3(new JSONObject(str2));
                this.f12106f = rVarM3.f12106f;
                this.f12107g = rVarM3.f12107g;
                this.f12108h = rVarM3.f12108h;
                this.f12109i = rVarM3.f12109i;
                this.f12110j = rVarM3.f12110j;
                this.f12111k = rVarM3.f12111k;
                this.f12112l = rVarM3.f12112l;
                this.f12113m = rVarM3.f12113m;
                this.f12114n = rVarM3.f12114n;
                this.f12115o = rVarM3.f12115o;
                this.f12116p = rVarM3.f12116p;
                this.f12117q = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f12106f = (u) o9.s.l(uVar);
        this.f12107g = (w) o9.s.l(wVar);
        this.f12108h = (byte[]) o9.s.l(bArr);
        this.f12109i = (List) o9.s.l(list);
        this.f12110j = d10;
        this.f12111k = list2;
        this.f12112l = kVar;
        this.f12113m = num;
        this.f12114n = a0Var;
        if (str != null) {
            try {
                this.f12115o = c.a(str);
            } catch (c.a e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f12115o = null;
        }
        this.f12116p = dVar;
        this.f12117q = null;
    }

    @NonNull
    public static r M3(@NonNull JSONObject jSONObject) throws JSONException {
        fb.m0 m0VarC;
        a aVar = new a();
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        Parcelable.Creator<u> creator = u.CREATOR;
        aVar.h(new u(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null));
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        Parcelable.Creator<w> creator2 = w.CREATOR;
        aVar.j(new w(v9.c.a(jSONObject3.getString("id")), jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName")));
        aVar.e(v9.c.a(jSONObject.getString("challenge")));
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i10);
            try {
                m0VarC = fb.m0.d(new t(jSONObject4.getString(Payload.TYPE), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                m0VarC = fb.m0.c();
            }
            if (m0VarC.b()) {
                arrayList.add(m0VarC.a());
            }
        }
        aVar.g(arrayList);
        if (jSONObject.has("timeout")) {
            aVar.i(Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d));
        }
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(s.D3(jSONArray2.getJSONObject(i11)));
            }
            aVar.f(arrayList2);
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            Parcelable.Creator<k> creator3 = k.CREATOR;
            aVar.d(new k(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null));
        }
        if (jSONObject.has("extensions")) {
            aVar.c(d.C3(jSONObject.getJSONObject("extensions")));
        }
        if (jSONObject.has("attestation")) {
            try {
                aVar.b(c.a(jSONObject.getString("attestation")));
            } catch (c.a e10) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e10);
                aVar.b(c.NONE);
            }
        }
        return aVar.a();
    }

    public String A3() {
        c cVar = this.f12115o;
        if (cVar == null) {
            return null;
        }
        return cVar.toString();
    }

    public d B3() {
        return this.f12116p;
    }

    public k C3() {
        return this.f12112l;
    }

    @NonNull
    public byte[] D3() {
        return this.f12108h;
    }

    public List<s> E3() {
        return this.f12111k;
    }

    public String F3() {
        return this.f12117q;
    }

    @NonNull
    public List<t> G3() {
        return this.f12109i;
    }

    public Integer H3() {
        return this.f12113m;
    }

    @NonNull
    public u I3() {
        return this.f12106f;
    }

    public Double J3() {
        return this.f12110j;
    }

    public a0 K3() {
        return this.f12114n;
    }

    @NonNull
    public w L3() {
        return this.f12107g;
    }

    public boolean equals(@NonNull Object obj) {
        List list;
        List list2;
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return o9.q.b(this.f12106f, rVar.f12106f) && o9.q.b(this.f12107g, rVar.f12107g) && Arrays.equals(this.f12108h, rVar.f12108h) && o9.q.b(this.f12110j, rVar.f12110j) && this.f12109i.containsAll(rVar.f12109i) && rVar.f12109i.containsAll(this.f12109i) && (((list = this.f12111k) == null && rVar.f12111k == null) || (list != null && (list2 = rVar.f12111k) != null && list.containsAll(list2) && rVar.f12111k.containsAll(this.f12111k))) && o9.q.b(this.f12112l, rVar.f12112l) && o9.q.b(this.f12113m, rVar.f12113m) && o9.q.b(this.f12114n, rVar.f12114n) && o9.q.b(this.f12115o, rVar.f12115o) && o9.q.b(this.f12116p, rVar.f12116p) && o9.q.b(this.f12117q, rVar.f12117q);
    }

    public int hashCode() {
        return o9.q.c(this.f12106f, this.f12107g, Integer.valueOf(Arrays.hashCode(this.f12108h)), this.f12109i, this.f12110j, this.f12111k, this.f12112l, this.f12113m, this.f12114n, this.f12115o, this.f12116p, this.f12117q);
    }

    @NonNull
    public final String toString() {
        d dVar = this.f12116p;
        c cVar = this.f12115o;
        a0 a0Var = this.f12114n;
        k kVar = this.f12112l;
        List list = this.f12111k;
        List list2 = this.f12109i;
        byte[] bArr = this.f12108h;
        w wVar = this.f12107g;
        return "PublicKeyCredentialCreationOptions{\n rp=" + String.valueOf(this.f12106f) + ", \n user=" + String.valueOf(wVar) + ", \n challenge=" + v9.c.b(bArr) + ", \n parameters=" + String.valueOf(list2) + ", \n timeoutSeconds=" + this.f12110j + ", \n excludeList=" + String.valueOf(list) + ", \n authenticatorSelection=" + String.valueOf(kVar) + ", \n requestId=" + this.f12113m + ", \n tokenBinding=" + String.valueOf(a0Var) + ", \n attestationConveyancePreference=" + String.valueOf(cVar) + ", \n authenticationExtensions=" + String.valueOf(dVar) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 2, I3(), i10, false);
        p9.c.t(parcel, 3, L3(), i10, false);
        p9.c.g(parcel, 4, D3(), false);
        p9.c.z(parcel, 5, G3(), false);
        p9.c.j(parcel, 6, J3(), false);
        p9.c.z(parcel, 7, E3(), false);
        p9.c.t(parcel, 8, C3(), i10, false);
        p9.c.q(parcel, 9, H3(), false);
        p9.c.t(parcel, 10, K3(), i10, false);
        p9.c.v(parcel, 11, A3(), false);
        p9.c.t(parcel, 12, B3(), i10, false);
        p9.c.v(parcel, 13, F3(), false);
        p9.c.t(parcel, 14, this.f12118r, i10, false);
        p9.c.b(parcel, iA);
    }

    public r(@NonNull String str) {
        try {
            r rVarM3 = M3(new JSONObject(str));
            this.f12106f = rVarM3.f12106f;
            this.f12107g = rVarM3.f12107g;
            this.f12108h = rVarM3.f12108h;
            this.f12109i = rVarM3.f12109i;
            this.f12110j = rVarM3.f12110j;
            this.f12111k = rVarM3.f12111k;
            this.f12112l = rVarM3.f12112l;
            this.f12113m = rVarM3.f12113m;
            this.f12114n = rVarM3.f12114n;
            this.f12115o = rVarM3.f12115o;
            this.f12116p = rVarM3.f12116p;
            this.f12117q = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
