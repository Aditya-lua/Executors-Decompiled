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
    public final String f5632a;
    public final JSONObject b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f5640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f5641k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5642a;
        public final int b;

        public a(JSONObject jSONObject) {
            this.f5642a = jSONObject.getInt("commitmentPaymentsCount");
            this.b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5643a;
        public final long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f5645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f5646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f5647f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f5648g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Long f5649h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final a f5650i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final C0117e f5651j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final C0116b f5652k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f5653l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final c f5654m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final d f5655n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final i f5656o;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f5657a;
            public final C0115a b;

            /* JADX INFO: renamed from: com.android.billingclient.api.e$b$a$a, reason: collision with other inner class name */
            public static final class C0115a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f5658a;
                public final long b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f5659c;

                public C0115a(JSONObject jSONObject) {
                    this.f5658a = jSONObject.optString("formattedDiscountAmount");
                    this.b = jSONObject.optLong("discountAmountMicros");
                    this.f5659c = jSONObject.optString("discountAmountCurrencyCode");
                }
            }

            public a(JSONObject jSONObject) {
                this.f5657a = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountAmount");
                this.b = jSONObjectOptJSONObject != null ? new C0115a(jSONObjectOptJSONObject) : null;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.e$b$b, reason: collision with other inner class name */
        public static final class C0116b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f5660a;
            public final int b;

            public C0116b(JSONObject jSONObject) {
                this.f5660a = jSONObject.getInt("maximumQuantity");
                this.b = jSONObject.getInt("remainingQuantity");
            }
        }

        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f5661a;
            public final long b;

            public c(JSONObject jSONObject) {
                this.f5661a = jSONObject.getLong("preorderReleaseTimeMillis");
                this.b = jSONObject.getLong("preorderPresaleEndTimeMillis");
            }
        }

        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f5662a;
            public final String b;

            public d(JSONObject jSONObject) {
                this.f5662a = jSONObject.getString("rentalPeriod");
                String strOptString = jSONObject.optString("rentalExpirationPeriod");
                this.b = true == strOptString.isEmpty() ? null : strOptString;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.e$b$e, reason: collision with other inner class name */
        public static final class C0117e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Long f5663a;
            public final Long b;

            public C0117e(JSONObject jSONObject) {
                this.f5663a = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.b = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }
        }

        public b(JSONObject jSONObject) {
            this.f5643a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.f5644c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f5645d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.f5646e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f5647f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.f5648g = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f5648g.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f5649h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f5650i = jSONObjectOptJSONObject == null ? null : new a(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f5651j = jSONObjectOptJSONObject2 == null ? null : new C0117e(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f5652k = jSONObjectOptJSONObject3 == null ? null : new C0116b(jSONObjectOptJSONObject3);
            this.f5653l = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.f5654m = jSONObjectOptJSONObject4 == null ? null : new c(jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f5655n = jSONObjectOptJSONObject5 == null ? null : new d(jSONObjectOptJSONObject5);
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f5656o = jSONObjectOptJSONObject6 != null ? new i(jSONObjectOptJSONObject6) : null;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            new d(jSONArrayOptJSONArray2);
        }

        @NonNull
        public String a() {
            return this.f5643a;
        }

        public String b() {
            return this.f5645d;
        }

        public long c() {
            return this.b;
        }

        @NonNull
        public String d() {
            return this.f5644c;
        }

        public final i e() {
            return this.f5656o;
        }

        public final String f() {
            return this.f5653l;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5664a;
        public final long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f5666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f5668f;

        public c(JSONObject jSONObject) {
            this.f5666d = jSONObject.optString("billingPeriod");
            this.f5665c = jSONObject.optString("priceCurrencyCode");
            this.f5664a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.f5668f = jSONObject.optInt("recurrenceMode");
            this.f5667e = jSONObject.optInt("billingCycleCount");
        }

        @NonNull
        public String a() {
            return this.f5664a;
        }

        public long b() {
            return this.b;
        }

        @NonNull
        public String c() {
            return this.f5665c;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f5669a;

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
            this.f5669a = arrayList;
        }

        @NonNull
        public List<c> a() {
            return this.f5669a;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.e$e, reason: collision with other inner class name */
    public static final class C0118e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5670a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f5672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f5673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f5674f;

        public C0118e(JSONObject jSONObject) throws JSONException {
            this.f5670a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.b = true == strOptString.isEmpty() ? null : strOptString;
            this.f5671c = jSONObject.getString("offerIdToken");
            this.f5672d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f5674f = jSONObjectOptJSONObject != null ? new a(jSONObjectOptJSONObject) : null;
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
            this.f5673e = arrayList;
        }

        public String a() {
            return this.b;
        }

        @NonNull
        public String b() {
            return this.f5671c;
        }

        @NonNull
        public d c() {
            return this.f5672d;
        }
    }

    public e(String str) {
        this.f5632a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f5633c = strOptString;
        String strOptString2 = jSONObject.optString(Payload.TYPE);
        this.f5634d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f5635e = jSONObject.optString(Title.type);
        this.f5636f = jSONObject.optString("name");
        this.f5637g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f5638h = jSONObject.optString("skuDetailsToken");
        this.f5639i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new C0118e(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f5640j = arrayList;
        } else {
            this.f5640j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f5641k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f5641k = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f5641k = arrayList2;
        }
    }

    @NonNull
    public String a() {
        return this.f5637g;
    }

    public b b() {
        List list = this.f5641k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) list.get(0);
    }

    public List<b> c() {
        return this.f5641k;
    }

    @NonNull
    public String d() {
        return this.f5633c;
    }

    @NonNull
    public String e() {
        return this.f5634d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return TextUtils.equals(this.f5632a, ((e) obj).f5632a);
        }
        return false;
    }

    public List<C0118e> f() {
        return this.f5640j;
    }

    @NonNull
    public final String g() {
        return this.b.optString("packageName");
    }

    public final String h() {
        return this.f5638h;
    }

    public int hashCode() {
        return this.f5632a.hashCode();
    }

    public final String i(String str) {
        List<b> list;
        if (!TextUtils.isEmpty(str) && (list = this.f5641k) != null && !list.isEmpty()) {
            for (b bVar : list) {
                if (!TextUtils.isEmpty(bVar.f()) && Objects.equals(bVar.b(), str)) {
                    return bVar.f();
                }
            }
        }
        return this.f5639i;
    }

    @NonNull
    public String toString() {
        List list = this.f5640j;
        return "ProductDetails{jsonString='" + this.f5632a + "', parsedJson=" + this.b.toString() + ", productId='" + this.f5633c + "', productType='" + this.f5634d + "', title='" + this.f5635e + "', productDetailsToken='" + this.f5638h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
