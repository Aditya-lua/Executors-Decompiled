package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f7176a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent != null) {
            return o(intent.getExtras(), "ProxyBillingActivity");
        }
        m("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int b(Bundle bundle, String str) {
        if (bundle == null) {
            m(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            l(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        m(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle c(Bundle bundle, String str, String str2, long j10) {
        bundle.putString("playBillingLibraryVersion", u7.a.f32091a);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j10);
        return bundle;
    }

    public static Bundle d(com.android.billingclient.api.d dVar, s7 s7Var) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", dVar.c());
        bundle.putString("DEBUG_MESSAGE", dVar.a());
        bundle.putInt("LOG_REASON", s7Var.zza());
        return bundle;
    }

    public static Bundle e(com.android.billingclient.api.d dVar, s7 s7Var, String str) {
        Bundle bundleD = d(dVar, s7Var);
        if (str != null) {
            bundleD.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleD;
    }

    public static Bundle f(com.android.billingclient.api.c cVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str, String str2, long j10, String str3, long j11) {
        Bundle bundle = new Bundle();
        c(bundle, u7.a.f32091a, str2, j10);
        bundle.putLong("billingClientTransactionId", j11);
        if (cVar.d() != 0) {
            bundle.putInt("prorationMode", cVar.d());
        }
        if (!TextUtils.isEmpty(cVar.g())) {
            bundle.putString("accountId", cVar.g());
        }
        if (!TextUtils.isEmpty(cVar.h())) {
            bundle.putString("obfuscatedProfileId", cVar.h());
        }
        if (cVar.v()) {
            bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(cVar.j())) {
            bundle.putString("oldSkuPurchaseToken", cVar.j());
        }
        cVar.i();
        if (!TextUtils.isEmpty(null)) {
            cVar.i();
            bundle.putString("oldSkuPurchaseId", null);
        }
        if (!TextUtils.isEmpty(cVar.k())) {
            bundle.putString("originalExternalTransactionId", cVar.k());
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("paymentsPurchaseParams", null);
        }
        if (z10 && z12) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z11 && z13) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        if (z14) {
            bundle.putBoolean("enableAlternativeBilling", true);
        } else {
            cVar.a();
        }
        cVar.e();
        cVar.c();
        cVar.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = cVar.m().iterator();
        while (it.hasNext()) {
            ((com.android.billingclient.api.c.b) it.next()).a();
        }
        if (!arrayList.isEmpty()) {
            t2 t2VarB = u2.B();
            t2VarB.o(arrayList);
            bundle.putByteArray("subscriptionProductReplacementParamsList", ((u2) t2VarB.i()).b());
        }
        return bundle;
    }

    public static Bundle g(String str, String str2, ArrayList arrayList, String str3, String str4, a aVar, long j10) {
        Bundle bundle = new Bundle();
        c(bundle, u7.a.f32091a, str2, j10);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(n0.m("subs", "inapp")));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>(n0.l("inapp")));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(n0.l("inapp")));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (aVar.f6979a) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            com.android.billingclient.api.f.b bVar = (com.android.billingclient.api.f.b) arrayList.get(i10);
            arrayList2.add(null);
            z10 |= !TextUtils.isEmpty(null);
            arrayList4.add(bVar.a());
            z11 |= !TextUtils.isEmpty(bVar.a());
            if (bVar.d().equals("first_party")) {
                x.c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                arrayList3.add(null);
            }
        }
        if (z10) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z11) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static com.android.billingclient.api.d h(Intent intent, String str) {
        if (intent != null) {
            com.android.billingclient.api.d.a aVarD = com.android.billingclient.api.d.d();
            aVarD.d(b(intent.getExtras(), str));
            aVarD.b(i(intent.getExtras(), str));
            return aVarD.a();
        }
        m("BillingHelper", "Got null intent!");
        com.android.billingclient.api.d.a aVarD2 = com.android.billingclient.api.d.d();
        aVarD2.d(6);
        aVarD2.b("An internal error occurred.");
        return aVarD2.a();
    }

    public static String i(Bundle bundle, String str) {
        if (bundle == null) {
            m(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            l(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        m(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String j(int i10) {
        return l.a(i10).toString();
    }

    public static List k(Bundle bundle, Set set) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            v7.k kVarP = p(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"), set);
            if (kVarP == null) {
                l("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(kVarP);
            return arrayList;
        }
        l("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
            v7.k kVarP2 = p(stringArrayList.get(i10), stringArrayList2.get(i10), set);
            if (kVarP2 != null) {
                arrayList.add(kVarP2);
            }
        }
        return arrayList;
    }

    public static void l(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i10 = 40000;
            while (!str2.isEmpty() && i10 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i10));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i10 -= iMin;
            }
        }
    }

    public static void m(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void n(String str, String str2, Throwable th2) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th2 == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static int o(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        m(str, "Unexpected null bundle received!");
        return 0;
    }

    public static v7.k p(String str, String str2, Set set) {
        v7.k kVar = null;
        if (str == null || str2 == null) {
            l("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            v7.k kVar2 = new v7.k(str, str2);
            try {
                set.isEmpty();
                return kVar2;
            } catch (JSONException e10) {
                e = e10;
                kVar = kVar2;
                m("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
                return kVar;
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }
}
