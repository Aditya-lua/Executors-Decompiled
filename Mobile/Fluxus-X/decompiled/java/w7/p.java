package w7;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35636a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f35639e;

    public p(String str) {
        this.f35636a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString(Payload.TYPE);
        this.f35637c = strOptString;
        this.f35638d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f35639e = jSONObject.optString("serializedDocid");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return TextUtils.equals(this.f35636a, ((p) obj).f35636a);
        }
        return false;
    }

    public int hashCode() {
        return this.f35636a.hashCode();
    }

    @NonNull
    public String toString() {
        return "UnfetchedProduct{productId='" + this.b + "', productType='" + this.f35637c + "', statusCode=" + this.f35638d + "}";
    }
}
