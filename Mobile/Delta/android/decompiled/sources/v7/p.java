package v7;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32819a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f32822e;

    public p(String str) {
        this.f32819a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString(Payload.TYPE);
        this.f32820c = strOptString;
        this.f32821d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f32822e = jSONObject.optString("serializedDocid");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return TextUtils.equals(this.f32819a, ((p) obj).f32819a);
        }
        return false;
    }

    public int hashCode() {
        return this.f32819a.hashCode();
    }

    @NonNull
    public String toString() {
        return "UnfetchedProduct{productId='" + this.b + "', productType='" + this.f32820c + "', statusCode=" + this.f32821d + "}";
    }
}
