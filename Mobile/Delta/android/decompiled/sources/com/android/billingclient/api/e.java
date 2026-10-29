package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5116a;
    public final JSONObject b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f5124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f5125k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5126a;
        public final int b;

        public a(JSONObject jSONObject) {
            this.f5126a = jSONObject.getInt("commitmentPaymentsCount");
            this.b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5127a;
        public final long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f5129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f5130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f5131f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f5132g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Long f5133h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final a f5134i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final C0113e f5135j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final C0112b f5136k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f5137l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final c f5138m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final d f5139n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final i f5140o;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f5141a;
            public final C0111a b;

            /* JADX INFO: renamed from: com.android.billingclient.api.e$b$a$a, reason: collision with other inner class name */
            public static final class C0111a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f5142a;
                public final long b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f5143c;

                public C0111a(JSONObject jSONObject) {
                    this.f5142a = jSONObject.optString("formattedDiscountAmount");
                    this.b = jSONObject.optLong("discountAmountMicros");
                    this.f5143c = jSONObject.optString("discountAmountCurrencyCode");
                }
            }

            public a(JSONObject jSONObject) {
                this.f5141a = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountAmount");
                this.b = jSONObjectOptJSONObject != null ? new C0111a(jSONObjectOptJSONObject) : null;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.e$b$b, reason: collision with other inner class name */
        public static final class C0112b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f5144a;
            public final int b;

            public C0112b(JSONObject jSONObject) {
                this.f5144a = jSONObject.getInt("maximumQuantity");
                this.b = jSONObject.getInt("remainingQuantity");
            }
        }

        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f5145a;
            public final long b;

            public c(JSONObject jSONObject) {
                this.f5145a = jSONObject.getLong("preorderReleaseTimeMillis");
                this.b = jSONObject.getLong("preorderPresaleEndTimeMillis");
            }
        }

        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f5146a;
            public final String b;

            public d(JSONObject jSONObject) {
                this.f5146a = jSONObject.getString("rentalPeriod");
                String strOptString = jSONObject.optString("rentalExpirationPeriod");
                this.b = true == strOptString.isEmpty() ? null : strOptString;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.e$b$e, reason: collision with other inner class name */
        public static final class C0113e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Long f5147a;
            public final Long b;

            public C0113e(JSONObject jSONObject) {
                this.f5147a = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.b = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }
        }

        public b(JSONObject jSONObject) {
            this.f5127a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.f5128c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f5129d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.f5130e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f5131f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.f5132g = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f5132g.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f5133h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f5134i = jSONObjectOptJSONObject == null ? null : new a(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f5135j = jSONObjectOptJSONObject2 == null ? null : new C0113e(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f5136k = jSONObjectOptJSONObject3 == null ? null : new C0112b(jSONObjectOptJSONObject3);
            this.f5137l = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.f5138m = jSONObjectOptJSONObject4 == null ? null : new c(jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f5139n = jSONObjectOptJSONObject5 == null ? null : new d(jSONObjectOptJSONObject5);
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f5140o = jSONObjectOptJSONObject6 != null ? new i(jSONObjectOptJSONObject6) : null;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            new d(jSONArrayOptJSONArray2);
        }

        @NonNull
        public String a() {
            return this.f5127a;
        }

        public String b() {
            return this.f5129d;
        }

        public long c() {
            return this.b;
        }

        @NonNull
        public String d() {
            return this.f5128c;
        }

        public final i e() {
            return this.f5140o;
        }

        public final String f() {
            return this.f5137l;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5148a;
        public final long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f5150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f5152f;

        public c(JSONObject jSONObject) {
            this.f5150d = jSONObject.optString("billingPeriod");
            this.f5149c = jSONObject.optString("priceCurrencyCode");
            this.f5148a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.f5152f = jSONObject.optInt("recurrenceMode");
            this.f5151e = jSONObject.optInt("billingCycleCount");
        }

        @NonNull
        public String a() {
            return this.f5148a;
        }

        public long b() {
            return this.b;
        }

        @NonNull
        public String c() {
            return this.f5149c;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f5153a;

        public d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f5153a = arrayList;
        }

        @NonNull
        public List<c> a() {
            return this.f5153a;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.e$e, reason: collision with other inner class name */
    public static final class C0114e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5154a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f5156d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f5157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f5158f;

        public C0114e(JSONObject jSONObject) throws JSONException {
            this.f5154a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.b = true == strOptString.isEmpty() ? null : strOptString;
            this.f5155c = jSONObject.getString("offerIdToken");
            this.f5156d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f5158f = jSONObjectOptJSONObject != null ? new a(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString(Title.type);
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new c(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f5157e = arrayList;
        }

        public String a() {
            return this.b;
        }

        @NonNull
        public String b() {
            return this.f5155c;
        }

        @NonNull
        public d c() {
            return this.f5156d;
        }
    }

    public e(String str) {
        this.f5116a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f5117c = strOptString;
        String strOptString2 = jSONObject.optString(Payload.TYPE);
        this.f5118d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f5119e = jSONObject.optString(Title.type);
        this.f5120f = jSONObject.optString("name");
        this.f5121g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f5122h = jSONObject.optString("skuDetailsToken");
        this.f5123i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new C0114e(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f5124j = arrayList;
        } else {
            this.f5124j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f5125k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f5125k = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f5125k = arrayList2;
        }
    }

    @NonNull
    public String a() {
        return this.f5121g;
    }

    public b b() {
        List list = this.f5125k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) list.get(0);
    }

    public List<b> c() {
        return this.f5125k;
    }

    @NonNull
    public String d() {
        return this.f5117c;
    }

    @NonNull
    public String e() {
        return this.f5118d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return TextUtils.equals(this.f5116a, ((e) obj).f5116a);
        }
        return false;
    }

    public List<C0114e> f() {
        return this.f5124j;
    }

    @NonNull
    public final String g() {
        return this.b.optString("packageName");
    }

    public final String h() {
        return this.f5122h;
    }

    public int hashCode() {
        return this.f5116a.hashCode();
    }

    public final String i(String str) {
        List<b> list;
        if (!TextUtils.isEmpty(str) && (list = this.f5125k) != null && !list.isEmpty()) {
            for (b bVar : list) {
                if (!TextUtils.isEmpty(bVar.f()) && Objects.equals(bVar.b(), str)) {
                    return bVar.f();
                }
            }
        }
        return this.f5123i;
    }

    @NonNull
    public String toString() {
        List list = this.f5124j;
        return "ProductDetails{jsonString='" + this.f5116a + "', parsedJson=" + this.b.toString() + ", productId='" + this.f5117c + "', productType='" + this.f5118d + "', title='" + this.f5119e + "', productDetailsToken='" + this.f5122h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
