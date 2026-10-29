package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1749e {

    /* JADX INFO: renamed from: a */
    public final String f6679a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f6680b;

    /* JADX INFO: renamed from: c */
    public final String f6681c;

    /* JADX INFO: renamed from: d */
    public final String f6682d;

    /* JADX INFO: renamed from: e */
    public final String f6683e;

    /* JADX INFO: renamed from: f */
    public final String f6684f;

    /* JADX INFO: renamed from: g */
    public final String f6685g;

    /* JADX INFO: renamed from: h */
    public final String f6686h;

    /* JADX INFO: renamed from: i */
    public final String f6687i;

    /* JADX INFO: renamed from: j */
    public final List f6688j;

    /* JADX INFO: renamed from: k */
    public final List f6689k;

    /* JADX INFO: renamed from: com.android.billingclient.api.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f6690a;

        /* JADX INFO: renamed from: b */
        public final int f6691b;

        public a(JSONObject jSONObject) {
            this.f6690a = jSONObject.getInt("commitmentPaymentsCount");
            this.f6691b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f6692a;

        /* JADX INFO: renamed from: b */
        public final long f6693b;

        /* JADX INFO: renamed from: c */
        public final String f6694c;

        /* JADX INFO: renamed from: d */
        public final String f6695d;

        /* JADX INFO: renamed from: e */
        public final String f6696e;

        /* JADX INFO: renamed from: f */
        public final String f6697f;

        /* JADX INFO: renamed from: g */
        public final List f6698g;

        /* JADX INFO: renamed from: h */
        public final Long f6699h;

        /* JADX INFO: renamed from: i */
        public final a f6700i;

        /* JADX INFO: renamed from: j */
        public final e f6701j;

        /* JADX INFO: renamed from: k */
        public final C14106b f6702k;

        /* JADX INFO: renamed from: l */
        public final String f6703l;

        /* JADX INFO: renamed from: m */
        public final c f6704m;

        /* JADX INFO: renamed from: n */
        public final d f6705n;

        /* JADX INFO: renamed from: o */
        public final C1753i f6706o;

        /* JADX INFO: renamed from: com.android.billingclient.api.e$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final Integer f6707a;

            /* JADX INFO: renamed from: b */
            public final C14105a f6708b;

            /* JADX INFO: renamed from: com.android.billingclient.api.e$b$a$a, reason: collision with other inner class name */
            public static final class C14105a {

                /* JADX INFO: renamed from: a */
                public final String f6709a;

                /* JADX INFO: renamed from: b */
                public final long f6710b;

                /* JADX INFO: renamed from: c */
                public final String f6711c;

                public C14105a(JSONObject jSONObject) {
                    this.f6709a = jSONObject.optString("formattedDiscountAmount");
                    this.f6710b = jSONObject.optLong("discountAmountMicros");
                    this.f6711c = jSONObject.optString("discountAmountCurrencyCode");
                }
            }

            public a(JSONObject jSONObject) {
                this.f6707a = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountAmount");
                this.f6708b = jSONObjectOptJSONObject != null ? new C14105a(jSONObjectOptJSONObject) : null;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.e$b$b, reason: collision with other inner class name */
        public static final class C14106b {

            /* JADX INFO: renamed from: a */
            public final int f6712a;

            /* JADX INFO: renamed from: b */
            public final int f6713b;

            public C14106b(JSONObject jSONObject) {
                this.f6712a = jSONObject.getInt("maximumQuantity");
                this.f6713b = jSONObject.getInt("remainingQuantity");
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.e$b$c */
        public static final class c {

            /* JADX INFO: renamed from: a */
            public final long f6714a;

            /* JADX INFO: renamed from: b */
            public final long f6715b;

            public c(JSONObject jSONObject) {
                this.f6714a = jSONObject.getLong("preorderReleaseTimeMillis");
                this.f6715b = jSONObject.getLong("preorderPresaleEndTimeMillis");
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.e$b$d */
        public static final class d {

            /* JADX INFO: renamed from: a */
            public final String f6716a;

            /* JADX INFO: renamed from: b */
            public final String f6717b;

            public d(JSONObject jSONObject) {
                this.f6716a = jSONObject.getString("rentalPeriod");
                String strOptString = jSONObject.optString("rentalExpirationPeriod");
                this.f6717b = true == strOptString.isEmpty() ? null : strOptString;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.e$b$e */
        public static final class e {

            /* JADX INFO: renamed from: a */
            public final Long f6718a;

            /* JADX INFO: renamed from: b */
            public final Long f6719b;

            public e(JSONObject jSONObject) {
                this.f6718a = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.f6719b = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }
        }

        public b(JSONObject jSONObject) {
            this.f6692a = jSONObject.optString("formattedPrice");
            this.f6693b = jSONObject.optLong("priceAmountMicros");
            this.f6694c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f6695d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.f6696e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f6697f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.f6698g = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f6698g.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f6699h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f6700i = jSONObjectOptJSONObject == null ? null : new a(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f6701j = jSONObjectOptJSONObject2 == null ? null : new e(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f6702k = jSONObjectOptJSONObject3 == null ? null : new C14106b(jSONObjectOptJSONObject3);
            this.f6703l = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.f6704m = jSONObjectOptJSONObject4 == null ? null : new c(jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f6705n = jSONObjectOptJSONObject5 == null ? null : new d(jSONObjectOptJSONObject5);
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f6706o = jSONObjectOptJSONObject6 != null ? new C1753i(jSONObjectOptJSONObject6) : null;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            new d(jSONArrayOptJSONArray2);
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public String m8624a() {
            return this.f6692a;
        }

        /* JADX INFO: renamed from: b */
        public String m8625b() {
            return this.f6695d;
        }

        /* JADX INFO: renamed from: c */
        public long m8626c() {
            return this.f6693b;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public String m8627d() {
            return this.f6694c;
        }

        /* JADX INFO: renamed from: e */
        public final C1753i m8628e() {
            return this.f6706o;
        }

        /* JADX INFO: renamed from: f */
        public final String m8629f() {
            return this.f6703l;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.e$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final String f6720a;

        /* JADX INFO: renamed from: b */
        public final long f6721b;

        /* JADX INFO: renamed from: c */
        public final String f6722c;

        /* JADX INFO: renamed from: d */
        public final String f6723d;

        /* JADX INFO: renamed from: e */
        public final int f6724e;

        /* JADX INFO: renamed from: f */
        public final int f6725f;

        public c(JSONObject jSONObject) {
            this.f6723d = jSONObject.optString("billingPeriod");
            this.f6722c = jSONObject.optString("priceCurrencyCode");
            this.f6720a = jSONObject.optString("formattedPrice");
            this.f6721b = jSONObject.optLong("priceAmountMicros");
            this.f6725f = jSONObject.optInt("recurrenceMode");
            this.f6724e = jSONObject.optInt("billingCycleCount");
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public String m8630a() {
            return this.f6720a;
        }

        /* JADX INFO: renamed from: b */
        public long m8631b() {
            return this.f6721b;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public String m8632c() {
            return this.f6722c;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.e$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final List f6726a;

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
            this.f6726a = arrayList;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public List<c> m8633a() {
            return this.f6726a;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.e$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final String f6727a;

        /* JADX INFO: renamed from: b */
        public final String f6728b;

        /* JADX INFO: renamed from: c */
        public final String f6729c;

        /* JADX INFO: renamed from: d */
        public final d f6730d;

        /* JADX INFO: renamed from: e */
        public final List f6731e;

        /* JADX INFO: renamed from: f */
        public final a f6732f;

        public e(JSONObject jSONObject) throws JSONException {
            this.f6727a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f6728b = true == strOptString.isEmpty() ? null : strOptString;
            this.f6729c = jSONObject.getString("offerIdToken");
            this.f6730d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f6732f = jSONObjectOptJSONObject != null ? new a(jSONObjectOptJSONObject) : null;
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
            this.f6731e = arrayList;
        }

        /* JADX INFO: renamed from: a */
        public String m8634a() {
            return this.f6728b;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public String m8635b() {
            return this.f6729c;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public d m8636c() {
            return this.f6730d;
        }
    }

    public C1749e(String str) {
        this.f6679a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f6680b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f6681c = strOptString;
        String strOptString2 = jSONObject.optString(Payload.TYPE);
        this.f6682d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f6683e = jSONObject.optString(Title.type);
        this.f6684f = jSONObject.optString("name");
        this.f6685g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f6686h = jSONObject.optString("skuDetailsToken");
        this.f6687i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new e(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f6688j = arrayList;
        } else {
            this.f6688j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f6680b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f6680b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f6689k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f6689k = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f6689k = arrayList2;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m8615a() {
        return this.f6685g;
    }

    /* JADX INFO: renamed from: b */
    public b m8616b() {
        List list = this.f6689k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) list.get(0);
    }

    /* JADX INFO: renamed from: c */
    public List<b> m8617c() {
        return this.f6689k;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public String m8618d() {
        return this.f6681c;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public String m8619e() {
        return this.f6682d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1749e) {
            return TextUtils.equals(this.f6679a, ((C1749e) obj).f6679a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public List<e> m8620f() {
        return this.f6688j;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public final String m8621g() {
        return this.f6680b.optString("packageName");
    }

    /* JADX INFO: renamed from: h */
    public final String m8622h() {
        return this.f6686h;
    }

    public int hashCode() {
        return this.f6679a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final String m8623i(String str) {
        List<b> list;
        if (!TextUtils.isEmpty(str) && (list = this.f6689k) != null && !list.isEmpty()) {
            for (b bVar : list) {
                if (!TextUtils.isEmpty(bVar.m8629f()) && Objects.equals(bVar.m8625b(), str)) {
                    return bVar.m8629f();
                }
            }
        }
        return this.f6687i;
    }

    @NonNull
    public String toString() {
        List list = this.f6688j;
        return "ProductDetails{jsonString='" + this.f6679a + "', parsedJson=" + this.f6680b.toString() + ", productId='" + this.f6681c + "', productType='" + this.f6682d + "', title='" + this.f6683e + "', productDetailsToken='" + this.f6686h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
