package com.roblox.client.purchase;

import androidx.annotation.NonNull;
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.engine.jni.autovalue.PreparePaymentParams;
import ei.j;
import ei.l;
import gk.p;
import gk.q;
import gk.s;
import hj.ValidatePurchaseResponsePayload;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import th.h;
import vi.g;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ei.f f9204a;
    public g b = g.b();

    /* JADX INFO: renamed from: com.roblox.client.purchase.a$a, reason: collision with other inner class name */
    public class C0144a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f9205a;
        public final /* synthetic */ String b;

        public C0144a(f fVar, String str) {
            this.f9205a = fVar;
            this.b = str;
        }

        @Override // ei.l
        public void a(j jVar) {
            e eVar;
            ValidatePurchaseResponsePayload validatePurchaseResponsePayload;
            JSONException e10;
            String strA = jVar.a();
            ValidatePurchaseResponsePayload validatePurchaseResponsePayload2 = null;
            if (strA != null) {
                p.h("rbx.purchaseflow", "response Str " + strA);
                p.h("rbx.purchaseflow", "response Code " + jVar.b());
                try {
                    JSONObject jSONObject = new JSONObject(new JSONObject(strA).optString("providerPayload"));
                    long jOptLong = jSONObject.optLong("user_id");
                    String strOptString = jSONObject.optString("checkout_session_id");
                    validatePurchaseResponsePayload = new ValidatePurchaseResponsePayload(Long.valueOf(jOptLong), strOptString, null);
                    try {
                        p.h("rbx.purchaseflow", "Created validatePurchaseResponsePayload, userId: " + jOptLong + ", checkoutSessionId: " + strOptString);
                    } catch (JSONException e11) {
                        e10 = e11;
                        p.e("rbx.purchaseflow", "parsing response string failed: " + strA + ", error: " + e10);
                        if (h.a().D0()) {
                            a.this.b.z();
                        }
                    }
                } catch (JSONException e12) {
                    validatePurchaseResponsePayload = null;
                    e10 = e12;
                }
                validatePurchaseResponsePayload2 = validatePurchaseResponsePayload;
            }
            int iB = jVar.b();
            if (iB == 200) {
                p.h("rbx.purchaseflow", "Validation successful");
                eVar = e.OK;
                a.this.b.B();
            } else if (iB == 429) {
                p.e("rbx.purchaseflow", "Service has been rate limited to user.");
                a.this.b.G();
                try {
                    int i10 = new JSONObject(strA).getJSONArray("errors").getJSONObject(0).getInt("code");
                    eVar = (i10 == 7 || i10 == 6) ? e.LIMIT_UNDER_13 : e.LIMIT;
                } catch (JSONException unused) {
                }
            } else if (iB == 500) {
                p.e("rbx.purchaseflow", "Server Error");
                eVar = e.UNKNOWN_ERROR;
                a.this.b.H();
            } else if (iB == 503) {
                p.e("rbx.purchaseflow", "Service has been turned off. Header response will include Retry-After in seconds.");
                eVar = e.RETRY;
                a.this.b.I();
            } else if (iB == 400) {
                p.e("rbx.purchaseflow", "Service has thrown an uknown exception.");
                eVar = e.UNKNOWN_ERROR;
                a.this.b.C();
            } else if (iB == 401) {
                p.e("rbx.purchaseflow", "Unauthorized to make request. Auth cookie is needed.");
                eVar = e.ERROR;
                a.this.b.D();
            } else if (iB == 403) {
                p.e("rbx.purchaseflow", "Unauthorized to make request. XSRF token is needed.");
                eVar = e.ERROR;
                a.this.b.E();
            } else if (iB != 404) {
                p.e("rbx.purchaseflow", "Validation unknown error");
                eVar = e.UNKNOWN_ERROR;
                a.this.b.J();
            } else {
                p.e("rbx.purchaseflow", "{validateModel} is invalid.");
                eVar = e.ERROR;
                a.this.b.F();
            }
            f fVar = this.f9205a;
            if (fVar != null) {
                fVar.a(eVar, this.b, validatePurchaseResponsePayload2);
            }
        }

        @Override // ei.l
        public void b(j jVar) {
        }
    }

    public class b implements vi.h.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f9207a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f9209d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f9210e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f f9211f;

        public b(String str, String str2, String str3, String str4, boolean z10, f fVar) {
            this.f9207a = str;
            this.b = str2;
            this.f9208c = str3;
            this.f9209d = str4;
            this.f9210e = z10;
            this.f9211f = fVar;
        }

        @Override // vi.h.d
        public void a(boolean z10, int i10) {
            if (z10) {
                a.this.b(this.f9207a, this.b, this.f9208c, this.f9209d, this.f9210e, this.f9211f);
                return;
            }
            f fVar = this.f9211f;
            if (fVar != null) {
                fVar.a(e.ERROR_CHECKING_BALANCE, this.b, null);
            }
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9213a;

        static {
            int[] iArr = new int[d.values().length];
            f9213a = iArr;
            try {
                iArr[d.ValidationFailure_ExceedPurchaseLimit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9213a[d.ValidationFailure_UserUnder13ExceedPurchaseLimit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum d {
        ValidationFailure_AgeValidation,
        ValidationFailure_DesktopPurchase,
        ValidationFailure_FraudCheck,
        ValidationFailure_ExceedPurchaseLimit,
        ValidationFailure_ParentalControl,
        ValidationFailure_MobileAppPurchase,
        ValidationFailure_UserUnder13ExceedPurchaseLimit,
        ValidationFailure_ProviderEligibility,
        ValidationFailure_ProductEligibility,
        ValidationFailure_SmartReroute,
        ValidationFailure_Unknown
    }

    public enum e {
        OK,
        ERROR,
        RETRY,
        LIMIT,
        LIMIT_UNDER_13,
        ERROR_CHECKING_BALANCE,
        UNKNOWN_ERROR
    }

    public interface f {
        void a(e eVar, String str, ValidatePurchaseResponsePayload validatePurchaseResponsePayload);
    }

    public a(@NonNull ei.f fVar) {
        this.f9204a = fVar;
    }

    public void b(String str, String str2, String str3, String str4, boolean z10, f fVar) {
        ValidatePurchaseResponsePayload validatePurchaseResponsePayload = null;
        if (!h.a().B1() || !s.g()) {
            this.f9204a.b(str, str4 != null ? new gi.b(str2, str3, str4) : new gi.b(str2, str3), null, new C0144a(fVar, str2)).b();
            this.b.A();
            return;
        }
        PreparePaymentParams.Builder isInApp = PreparePaymentParams.builder().setProductId(str2).setCurrencyCode(str3).setPaymentSessionId(str4).setPaymentMethod(s.k() ? "VngGooglePlayStore" : BuildConfig.STORE_TYPE).setIsInApp(z10);
        this.b.A();
        HashMap<String, String> mapNativeBeginPaymentsProtocolPurchaseV2 = IAPPurchaseManager.nativeBeginPaymentsProtocolPurchaseV2(isInApp.build());
        p.h("rbx.purchaseflow", "parsing response payload: " + mapNativeBeginPaymentsProtocolPurchaseV2);
        Integer numA = q.a(mapNativeBeginPaymentsProtocolPurchaseV2, "response_code");
        Long lB = q.b(mapNativeBeginPaymentsProtocolPurchaseV2, "user_id");
        String str5 = mapNativeBeginPaymentsProtocolPurchaseV2.get("checkout_session_id");
        if (numA == null || lB == null) {
            p.k("rbx.purchaseflow", "parsing response payload failed: " + mapNativeBeginPaymentsProtocolPurchaseV2);
            this.b.z();
        } else {
            validatePurchaseResponsePayload = new ValidatePurchaseResponsePayload(lB, str5, null);
        }
        e eVarF = f(numA, validatePurchaseResponsePayload);
        if (fVar != null) {
            p.h("rbx.purchaseflow", "PaymentsProtocolV2: OnValidationCheckFinished start.");
            fVar.a(eVarF, str2, validatePurchaseResponsePayload);
        }
    }

    public void c(String str, String str2, String str3, String str4, f fVar) {
        b(str, str2, str3, str4, false, fVar);
    }

    public void d(String str, String str2, String str3, String str4, boolean z10, f fVar) {
        p.h("rbx.purchaseflow", "Get balance.");
        vi.h.e().m(new b(str, str2, str3, str4, z10, fVar), this.f9204a);
    }

    public void e(String str, String str2, String str3, String str4, f fVar) {
        d(str, str2, str3, str4, false, fVar);
    }

    public final e f(Integer num, ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
        if (num == null) {
            p.e("rbx.purchaseflow", "Validation unknown error: responseCode is null");
            this.b.J();
            return e.UNKNOWN_ERROR;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 200) {
            p.h("rbx.purchaseflow", "Validation returns 200");
            this.b.B();
            if (validatePurchaseResponsePayload == null) {
                p.k("rbx.purchaseflow", "validatePurchaseResponsePayload is null in getPurchaseValidationResult.");
                this.b.H();
                return e.ERROR;
            }
            if (validatePurchaseResponsePayload.getFailureReason() == null) {
                return e.OK;
            }
            p.e("rbx.purchaseflow", "Validation returns " + validatePurchaseResponsePayload.getFailureReason());
            int i10 = c.f9213a[validatePurchaseResponsePayload.getFailureReason().ordinal()];
            if (i10 == 1) {
                this.b.E();
                return e.LIMIT;
            }
            if (i10 != 2) {
                this.b.E();
                return e.ERROR;
            }
            this.b.E();
            return e.LIMIT_UNDER_13;
        }
        if (iIntValue == 429) {
            p.e("rbx.purchaseflow", "Service has been rate limited to user.");
            this.b.G();
            return e.LIMIT;
        }
        if (iIntValue == 500) {
            p.e("rbx.purchaseflow", "Server Error");
            this.b.H();
            return e.UNKNOWN_ERROR;
        }
        if (iIntValue == 503) {
            p.e("rbx.purchaseflow", "Service has been turned off. Header response will include Retry-After in seconds.");
            this.b.I();
            return e.RETRY;
        }
        if (iIntValue == 400) {
            p.e("rbx.purchaseflow", "Service has thrown an unknown exception.");
            this.b.C();
            return e.UNKNOWN_ERROR;
        }
        if (iIntValue == 401) {
            p.e("rbx.purchaseflow", "Unauthorized to make request. Auth cookie is needed.");
            this.b.D();
            return e.ERROR;
        }
        if (iIntValue == 403) {
            p.e("rbx.purchaseflow", "Forbidden to make request.");
            this.b.E();
            return e.ERROR;
        }
        if (iIntValue != 404) {
            p.e("rbx.purchaseflow", "Validation unknown error");
            this.b.J();
            return e.UNKNOWN_ERROR;
        }
        p.e("rbx.purchaseflow", "The response is not found");
        this.b.F();
        return e.ERROR;
    }
}
