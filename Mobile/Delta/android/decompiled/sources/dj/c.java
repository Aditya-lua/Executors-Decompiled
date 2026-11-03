package dj;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14848a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f14850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14851e;

    public c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f14848a = jSONObject.getString("providerProductId");
            this.b = jSONObject.getString("providerProductType");
            this.f14849c = jSONObject.getString("chargeRequestId");
            this.f14850d = e(jSONObject.optString("offerId", null));
            this.f14851e = !this.f14848a.isEmpty() && (this.b.equalsIgnoreCase("subs") || this.b.equalsIgnoreCase("inapp")) && !this.f14849c.isEmpty();
        } catch (Exception unused) {
            this.f14851e = false;
            this.f14850d = Collections.EMPTY_LIST;
        }
    }

    public String a() {
        return this.f14849c;
    }

    public boolean b() {
        return this.f14851e;
    }

    public boolean c() {
        return this.b.equals("subs");
    }

    public List<String> d() {
        return this.f14850d;
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
        return this.f14848a;
    }

    public String g() {
        return this.b;
    }

    @NonNull
    public String toString() {
        return "{ providerProductId: " + this.f14848a + ", providerProductType: " + this.b + ", chargeRequestId: " + this.f14849c + ", offerIds: " + this.f14850d + " }";
    }
}
