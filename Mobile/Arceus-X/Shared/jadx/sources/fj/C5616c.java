package fj;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: fj.c */
/* JADX INFO: loaded from: classes2.dex */
public class C5616c {

    /* JADX INFO: renamed from: a */
    public String f21524a;

    /* JADX INFO: renamed from: b */
    public String f21525b;

    /* JADX INFO: renamed from: c */
    public String f21526c;

    /* JADX INFO: renamed from: d */
    public List<String> f21527d;

    /* JADX INFO: renamed from: e */
    public boolean f21528e;

    public C5616c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f21524a = jSONObject.getString("providerProductId");
            this.f21525b = jSONObject.getString("providerProductType");
            this.f21526c = jSONObject.getString("chargeRequestId");
            this.f21527d = m25443e(jSONObject.optString("offerId", null));
            this.f21528e = !this.f21524a.isEmpty() && (this.f21525b.equalsIgnoreCase("subs") || this.f21525b.equalsIgnoreCase("inapp")) && !this.f21526c.isEmpty();
        } catch (Exception unused) {
            this.f21528e = false;
            this.f21527d = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m25439a() {
        return this.f21526c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m25440b() {
        return this.f21528e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m25441c() {
        return this.f21525b.equals("subs");
    }

    /* JADX INFO: renamed from: d */
    public List<String> m25442d() {
        return this.f21527d;
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m25443e(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String[] strArrSplit = str.split(",");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            String strTrim = str2.trim();
            if (!strTrim.isEmpty()) {
                arrayList.add(strTrim);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public String m25444f() {
        return this.f21524a;
    }

    /* JADX INFO: renamed from: g */
    public String m25445g() {
        return this.f21525b;
    }

    @NonNull
    public String toString() {
        return "{ providerProductId: " + this.f21524a + ", providerProductType: " + this.f21525b + ", chargeRequestId: " + this.f21526c + ", offerIds: " + this.f21527d + " }";
    }
}
