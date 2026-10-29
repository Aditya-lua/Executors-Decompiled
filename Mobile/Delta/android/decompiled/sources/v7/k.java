package v7;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32804a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f32805c;

    public k(@NonNull String str, @NonNull String str2) {
        this.f32804a = str;
        this.b = str2;
        this.f32805c = new JSONObject(str);
        com.google.android.gms.internal.play_billing.s0.k();
    }

    public a a() {
        JSONObject jSONObject = this.f32805c;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new a(strOptString, strOptString2);
    }

    public String b() {
        String strOptString = this.f32805c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public String c() {
        return this.f32804a;
    }

    @NonNull
    public String d() {
        return this.f32805c.optString("packageName");
    }

    @NonNull
    public List<String> e() {
        return j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return TextUtils.equals(this.f32804a, kVar.c()) && TextUtils.equals(this.b, kVar.h());
    }

    public int f() {
        return this.f32805c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    @NonNull
    public String g() {
        JSONObject jSONObject = this.f32805c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    @NonNull
    public String h() {
        return this.b;
    }

    public int hashCode() {
        return this.f32804a.hashCode();
    }

    public boolean i() {
        return this.f32805c.optBoolean("acknowledged", true);
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f32805c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    @NonNull
    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f32804a));
    }
}
