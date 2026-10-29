package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.C1747c;
import com.android.billingclient.api.C1748d;
import com.android.billingclient.api.C1750f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import p461u7.C11809a;
import p486v7.C12052k;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2571m0 {

    /* JADX INFO: renamed from: a */
    public static final int f9152a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static int m11553a(Intent intent, String str) {
        if (intent != null) {
            return m11567o(intent.getExtras(), "ProxyBillingActivity");
        }
        m11565m("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m11554b(Bundle bundle, String str) {
        if (bundle == null) {
            m11565m(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m11564l(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        m11565m(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    /* JADX INFO: renamed from: c */
    public static Bundle m11555c(Bundle bundle, String str, String str2, long j10) {
        bundle.putString("playBillingLibraryVersion", C11809a.f41567a);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j10);
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public static Bundle m11556d(C1748d c1748d, EnumC2644s7 enumC2644s7) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", c1748d.m8610c());
        bundle.putString("DEBUG_MESSAGE", c1748d.m8608a());
        bundle.putInt("LOG_REASON", enumC2644s7.zza());
        return bundle;
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m11557e(C1748d c1748d, EnumC2644s7 enumC2644s7, String str) {
        Bundle bundleM11556d = m11556d(c1748d, enumC2644s7);
        if (str != null) {
            bundleM11556d.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleM11556d;
    }

    /* JADX INFO: renamed from: f */
    public static Bundle m11558f(C1747c c1747c, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str, String str2, long j10, String str3, long j11) {
        Bundle bundle = new Bundle();
        m11555c(bundle, C11809a.f41567a, str2, j10);
        bundle.putLong("billingClientTransactionId", j11);
        if (c1747c.m8569d() != 0) {
            bundle.putInt("prorationMode", c1747c.m8569d());
        }
        if (!TextUtils.isEmpty(c1747c.m8572g())) {
            bundle.putString("accountId", c1747c.m8572g());
        }
        if (!TextUtils.isEmpty(c1747c.m8573h())) {
            bundle.putString("obfuscatedProfileId", c1747c.m8573h());
        }
        if (c1747c.m8579v()) {
            bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(c1747c.m8575j())) {
            bundle.putString("oldSkuPurchaseToken", c1747c.m8575j());
        }
        c1747c.m8574i();
        if (!TextUtils.isEmpty(null)) {
            c1747c.m8574i();
            bundle.putString("oldSkuPurchaseId", null);
        }
        if (!TextUtils.isEmpty(c1747c.m8576k())) {
            bundle.putString("originalExternalTransactionId", c1747c.m8576k());
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
            c1747c.m8567a();
        }
        c1747c.m8570e();
        c1747c.m8568c();
        c1747c.m8567a();
        ArrayList arrayList = new ArrayList();
        Iterator it = c1747c.m8578m().iterator();
        while (it.hasNext()) {
            ((C1747c.b) it.next()).m8586a();
        }
        if (!arrayList.isEmpty()) {
            C2650t2 c2650t2M11765B = C2661u2.m11765B();
            c2650t2M11765B.m11736o(arrayList);
            bundle.putByteArray("subscriptionProductReplacementParamsList", ((C2661u2) c2650t2M11765B.m11645i()).m11331b());
        }
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public static Bundle m11559g(String str, String str2, ArrayList arrayList, String str3, String str4, C2438a c2438a, long j10) {
        Bundle bundle = new Bundle();
        m11555c(bundle, C11809a.f41567a, str2, j10);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(AbstractC2582n0.m11601m("subs", "inapp")));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>(AbstractC2582n0.m11600l("inapp")));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(AbstractC2582n0.m11600l("inapp")));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (c2438a.f8895a) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C1750f.b bVar = (C1750f.b) arrayList.get(i10);
            arrayList2.add(null);
            z10 |= !TextUtils.isEmpty(null);
            arrayList4.add(bVar.m8644a());
            z11 |= !TextUtils.isEmpty(bVar.m8644a());
            if (bVar.m8646d().equals("first_party")) {
                C2691x.m11817c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
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

    /* JADX INFO: renamed from: h */
    public static C1748d m11560h(Intent intent, String str) {
        if (intent != null) {
            C1748d.a aVarM8604d = C1748d.m8604d();
            aVarM8604d.m8614d(m11554b(intent.getExtras(), str));
            aVarM8604d.m8612b(m11561i(intent.getExtras(), str));
            return aVarM8604d.m8611a();
        }
        m11565m("BillingHelper", "Got null intent!");
        C1748d.a aVarM8604d2 = C1748d.m8604d();
        aVarM8604d2.m8614d(6);
        aVarM8604d2.m8612b("An internal error occurred.");
        return aVarM8604d2.m8611a();
    }

    /* JADX INFO: renamed from: i */
    public static String m11561i(Bundle bundle, String str) {
        if (bundle == null) {
            m11565m(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m11564l(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        m11565m(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    /* JADX INFO: renamed from: j */
    public static String m11562j(int i10) {
        return EnumC2559l.m11533a(i10).toString();
    }

    /* JADX INFO: renamed from: k */
    public static List m11563k(Bundle bundle, Set set) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            C12052k c12052kM11568p = m11568p(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"), set);
            if (c12052kM11568p == null) {
                m11564l("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(c12052kM11568p);
            return arrayList;
        }
        m11564l("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
            C12052k c12052kM11568p2 = m11568p(stringArrayList.get(i10), stringArrayList2.get(i10), set);
            if (c12052kM11568p2 != null) {
                arrayList.add(c12052kM11568p2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static void m11564l(String str, String str2) {
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

    /* JADX INFO: renamed from: m */
    public static void m11565m(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m11566n(String str, String str2, Throwable th2) {
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

    /* JADX INFO: renamed from: o */
    public static int m11567o(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        m11565m(str, "Unexpected null bundle received!");
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public static C12052k m11568p(String str, String str2, Set set) {
        C12052k c12052k = null;
        if (str == null || str2 == null) {
            m11564l("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            C12052k c12052k2 = new C12052k(str, str2);
            try {
                set.isEmpty();
                return c12052k2;
            } catch (JSONException e10) {
                e = e10;
                c12052k = c12052k2;
                m11565m("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
                return c12052k;
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }
}
