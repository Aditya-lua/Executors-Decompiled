package p486v7;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import org.json.JSONObject;

/* JADX INFO: renamed from: v7.p */
/* JADX INFO: loaded from: classes.dex */
public final class C12067p {

    /* JADX INFO: renamed from: a */
    public final String f42647a;

    /* JADX INFO: renamed from: b */
    public final String f42648b;

    /* JADX INFO: renamed from: c */
    public final String f42649c;

    /* JADX INFO: renamed from: d */
    public final int f42650d;

    /* JADX INFO: renamed from: e */
    public final String f42651e;

    public C12067p(String str) {
        this.f42647a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f42648b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString(Payload.TYPE);
        this.f42649c = strOptString;
        this.f42650d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f42651e = jSONObject.optString("serializedDocid");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12067p) {
            return TextUtils.equals(this.f42647a, ((C12067p) obj).f42647a);
        }
        return false;
    }

    public int hashCode() {
        return this.f42647a.hashCode();
    }

    @NonNull
    public String toString() {
        return "UnfetchedProduct{productId='" + this.f42648b + "', productType='" + this.f42649c + "', statusCode=" + this.f42650d + "}";
    }
}
