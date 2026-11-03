package v7;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33387a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f33390e;

    public p(String str) {
        this.f33387a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString(Payload.TYPE);
        this.f33388c = strOptString;
        this.f33389d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f33390e = jSONObject.optString("serializedDocid");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return TextUtils.equals(this.f33387a, ((p) obj).f33387a);
        }
        return false;
    }

    public int hashCode() {
        return this.f33387a.hashCode();
    }

    @NonNull
    public String toString() {
        return "UnfetchedProduct{productId='" + this.b + "', productType='" + this.f33388c + "', statusCode=" + this.f33389d + "}";
    }
}
