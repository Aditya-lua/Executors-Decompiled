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
    public final String f5189a;
    public final JSONObject b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f5197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f5198k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5199a;
        public final int b;

        public a(JSONObject jSONObject) {
            this.f5199a = jSONObject.getInt("commitmentPaymentsCount");
            this.b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5200a;
        public final long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f5202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f5203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f5204f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f5205g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Long f5206h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final a f5207i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final C0117e f5208j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final C0116b f5209k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f5210l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final c f5211m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final d f5212n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final i f5213o;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f5214a;
            public final C0115a b;

            /* JADX INFO: renamed from: com.android.billingclient.api.e$b$a$a, reason: collision with other inner class name */
            public static final class C0115a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f5215a;
                public final long b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f5216c;

                public C0115a(JSONObject jSONObject) {
                    this.f5215a = jSONObject.optString("formattedDiscountAmount");
                    this.b = jSONObject.optLong("discountAmountMicros");
                    this.f5216c = jSONObject.optString("discountAmountCurrencyCode");
                }
            }

            public a(JSONObject jSONObject) {
                this.f5214a = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountAmount");
                this.b = jSONObjectOptJSONObject != null ? new C0115a(jSONObjectOptJSONObject) : null;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.e$b$b, reason: collision with other inner class name */
        public static final class C0116b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f5217a;
            public final int b;

            public C0116b(JSONObject jSONObject) {
                this.f5217a = jSONObject.getInt("maximumQuantity");
                this.b = jSONObject.getInt("remainingQuantity");
            }
        }

        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f5218a;
            public final long b;

            public c(JSONObject jSONObject) {
                this.f5218a = jSONObject.getLong("preorderReleaseTimeMillis");
                this.b = jSONObject.getLong("preorderPresaleEndTimeMillis");
            }
        }

        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f5219a;
            public final String b;

            public d(JSONObject jSONObject) {
                this.f5219a = jSONObject.getString("rentalPeriod");
                String strOptString = jSONObject.optString("rentalExpirationPeriod");
                this.b = true == strOptString.isEmpty() ? null : strOptString;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.e$b$e, reason: collision with other inner class name */
        public static final class C0117e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Long f5220a;
            public final Long b;

            public C0117e(JSONObject jSONObject) {
                this.f5220a = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.b = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }
        }

        public b(JSONObject jSONObject) {
            this.f5200a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.f5201c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f5202d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.f5203e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f5204f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.f5205g = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f5205g.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f5206h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f5207i = jSONObjectOptJSONObject == null ? null : new a(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f5208j = jSONObjectOptJSONObject2 == null ? null : new C0117e(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f5209k = jSONObjectOptJSONObject3 == null ? null : new C0116b(jSONObjectOptJSONObject3);
            this.f5210l = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.f5211m = jSONObjectOptJSONObject4 == null ? null : new c(jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f5212n = jSONObjectOptJSONObject5 == null ? null : new d(jSONObjectOptJSONObject5);
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f5213o = jSONObjectOptJSONObject6 != null ? new i(jSONObjectOptJSONObject6) : null;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            new d(jSONArrayOptJSONArray2);
        }

        @NonNull
        public String a() {
            return this.f5200a;
        }

        public String b() {
            return this.f5202d;
        }

        public long c() {
            return this.b;
        }

        @NonNull
        public String d() {
            return this.f5201c;
        }

        public final i e() {
            return this.f5213o;
        }

        public final String f() {
            return this.f5210l;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5221a;
        public final long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f5223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f5225f;

        public c(JSONObject jSONObject) {
            this.f5223d = jSONObject.optString("billingPeriod");
            this.f5222c = jSONObject.optString("priceCurrencyCode");
            this.f5221a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.f5225f = jSONObject.optInt("recurrenceMode");
            this.f5224e = jSONObject.optInt("billingCycleCount");
        }

        @NonNull
        public String a() {
            return this.f5221a;
        }

        public long b() {
            return this.b;
        }

        @NonNull
        public String c() {
            return this.f5222c;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f5226a;

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
            this.f5226a = arrayList;
        }

        @NonNull
        public List<c> a() {
            return this.f5226a;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.e$e, reason: collision with other inner class name */
    public static final class C0118e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5227a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f5229d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f5230e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f5231f;

        public C0118e(JSONObject jSONObject) throws JSONException {
            this.f5227a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.b = true == strOptString.isEmpty() ? null : strOptString;
            this.f5228c = jSONObject.getString("offerIdToken");
            this.f5229d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f5231f = jSONObjectOptJSONObject != null ? new a(jSONObjectOptJSONObject) : null;
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
            this.f5230e = arrayList;
        }

        public String a() {
            return this.b;
        }

        @NonNull
        public String b() {
            return this.f5228c;
        }

        @NonNull
        public d c() {
            return this.f5229d;
        }
    }

    public e(String str) {
        this.f5189a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f5190c = strOptString;
        String strOptString2 = jSONObject.optString(Payload.TYPE);
        this.f5191d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f5192e = jSONObject.optString(Title.type);
        this.f5193f = jSONObject.optString("name");
        this.f5194g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f5195h = jSONObject.optString("skuDetailsToken");
        this.f5196i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new C0118e(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f5197j = arrayList;
        } else {
            this.f5197j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f5198k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f5198k = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f5198k = arrayList2;
        }
    }

    @NonNull
    public String a() {
        return this.f5194g;
    }

    public b b() {
        List list = this.f5198k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) list.get(0);
    }

    public List<b> c() {
        return this.f5198k;
    }

    @NonNull
    public String d() {
        return this.f5190c;
    }

    @NonNull
    public String e() {
        return this.f5191d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return TextUtils.equals(this.f5189a, ((e) obj).f5189a);
        }
        return false;
    }

    public List<C0118e> f() {
        return this.f5197j;
    }

    @NonNull
    public final String g() {
        return this.b.optString("packageName");
    }

    public final String h() {
        return this.f5195h;
    }

    public int hashCode() {
        return this.f5189a.hashCode();
    }

    public final String i(String str) {
        List<b> list;
        if (!TextUtils.isEmpty(str) && (list = this.f5198k) != null && !list.isEmpty()) {
            for (b bVar : list) {
                if (!TextUtils.isEmpty(bVar.f()) && Objects.equals(bVar.b(), str)) {
                    return bVar.f();
                }
            }
        }
        return this.f5196i;
    }

    @NonNull
    public String toString() {
        List list = this.f5197j;
        return "ProductDetails{jsonString='" + this.f5189a + "', parsedJson=" + this.b.toString() + ", productId='" + this.f5190c + "', productType='" + this.f5191d + "', title='" + this.f5192e + "', productDetailsToken='" + this.f5195h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
