package fj;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16652a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f16654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16655e;

    public c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f16652a = jSONObject.getString("providerProductId");
            this.b = jSONObject.getString("providerProductType");
            this.f16653c = jSONObject.getString("chargeRequestId");
            this.f16654d = e(jSONObject.optString("offerId", null));
            this.f16655e = !this.f16652a.isEmpty() && (this.b.equalsIgnoreCase("subs") || this.b.equalsIgnoreCase("inapp")) && !this.f16653c.isEmpty();
        } catch (Exception unused) {
            this.f16655e = false;
            this.f16654d = Collections.EMPTY_LIST;
        }
    }

    public String a() {
        return this.f16653c;
    }

    public boolean b() {
        return this.f16655e;
    }

    public boolean c() {
        return this.b.equals("subs");
    }

    public List<String> d() {
        return this.f16654d;
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
        return this.f16652a;
    }

    public String g() {
        return this.b;
    }

    @NonNull
    public String toString() {
        return "{ providerProductId: " + this.f16652a + ", providerProductType: " + this.b + ", chargeRequestId: " + this.f16653c + ", offerIds: " + this.f16654d + " }";
    }
}
