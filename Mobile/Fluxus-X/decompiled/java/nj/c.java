package nj;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25664a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f25666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25667e;

    public c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f25664a = jSONObject.getString("providerProductId");
            this.b = jSONObject.getString("providerProductType");
            this.f25665c = jSONObject.getString("chargeRequestId");
            this.f25666d = e(jSONObject.optString("offerId", null));
            this.f25667e = !this.f25664a.isEmpty() && (this.b.equalsIgnoreCase("subs") || this.b.equalsIgnoreCase("inapp")) && !this.f25665c.isEmpty();
        } catch (Exception unused) {
            this.f25667e = false;
            this.f25666d = Collections.EMPTY_LIST;
        }
    }

    public String a() {
        return this.f25665c;
    }

    public boolean b() {
        return this.f25667e;
    }

    public boolean c() {
        return this.b.equals("subs");
    }

    public List<String> d() {
        return this.f25666d;
    }

    public final List<String> e(String str) {
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

    public String f() {
        return this.f25664a;
    }

    public String g() {
        return this.b;
    }

    @NonNull
    public String toString() {
        return "{ providerProductId: " + this.f25664a + ", providerProductType: " + this.b + ", chargeRequestId: " + this.f25665c + ", offerIds: " + this.f25666d + " }";
    }
}
