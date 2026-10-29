package p486v7;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.AbstractC2637s0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: v7.k */
/* JADX INFO: loaded from: classes.dex */
public class C12052k {

    /* JADX INFO: renamed from: a */
    public final String f42623a;

    /* JADX INFO: renamed from: b */
    public final String f42624b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f42625c;

    public C12052k(@NonNull String str, @NonNull String str2) {
        this.f42623a = str;
        this.f42624b = str2;
        this.f42625c = new JSONObject(str);
        AbstractC2637s0.m11707k();
    }

    /* JADX INFO: renamed from: a */
    public C12014a m44880a() {
        JSONObject jSONObject = this.f42625c;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new C12014a(strOptString, strOptString2);
    }

    /* JADX INFO: renamed from: b */
    public String m44881b() {
        String strOptString = this.f42625c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public String m44882c() {
        return this.f42623a;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public String m44883d() {
        return this.f42625c.optString("packageName");
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public List<String> m44884e() {
        return m44889j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12052k)) {
            return false;
        }
        C12052k c12052k = (C12052k) obj;
        return TextUtils.equals(this.f42623a, c12052k.m44882c()) && TextUtils.equals(this.f42624b, c12052k.m44887h());
    }

    /* JADX INFO: renamed from: f */
    public int m44885f() {
        return this.f42625c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public String m44886g() {
        JSONObject jSONObject = this.f42625c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public String m44887h() {
        return this.f42624b;
    }

    public int hashCode() {
        return this.f42623a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public boolean m44888i() {
        return this.f42625c.optBoolean("acknowledged", true);
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m44889j() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f42625c;
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
        return "Purchase. Json: ".concat(String.valueOf(this.f42623a));
    }
}
