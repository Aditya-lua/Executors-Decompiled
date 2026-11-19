package com.roblox.client.purchase;

import androidx.annotation.NonNull;
import bi.h;
import com.roblox.engine.jni.autovalue.PreparePaymentParams;
import dj.g;
import java.util.HashMap;
import mi.j;
import mi.l;
import ok.q;
import ok.r;
import ok.t;
import org.json.JSONException;
import org.json.JSONObject;
import pj.ValidatePurchaseResponsePayload;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mi.f f9097a;
    public g b = g.b();

    /* JADX INFO: renamed from: com.roblox.client.purchase.a$a, reason: collision with other inner class name */
    public class C0150a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f9098a;
        public final /* synthetic */ String b;

        public C0150a(f fVar, String str) {
            this.f9098a = fVar;
            this.b = str;
        }

        @Override // mi.l
        public void a(j jVar) {
        }

        @Override // mi.l
        public void b(j jVar) {
            e eVar;
            ValidatePurchaseResponsePayload validatePurchaseResponsePayload;
            JSONException e10;
            String strA = jVar.a();
            ValidatePurchaseResponsePayload validatePurchaseResponsePayload2 = null;
            if (strA != null) {
                q.h("rbx.purchaseflow", "response Str " + strA);
                q.h("rbx.purchaseflow", "response Code " + jVar.b());
                try {
                    JSONObject jSONObject = new JSONObject(new JSONObject(strA).optString("providerPayload"));
                    long jOptLong = jSONObject.optLong("user_id");
                    String strOptString = jSONObject.optString("checkout_session_id");
                    validatePurchaseResponsePayload = new ValidatePurchaseResponsePayload(Long.valueOf(jOptLong), strOptString, null);
                    try {
                        q.h("rbx.purchaseflow", "Created validatePurchaseResponsePayload, userId: " + jOptLong + ", checkoutSessionId: " + strOptString);
                    } catch (JSONException e11) {
                        e10 = e11;
                        q.e("rbx.purchaseflow", "parsing response string failed: " + strA + ", error: " + e10);
                        if (h.a().L0()) {
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
                q.h("rbx.purchaseflow", "Validation successful");
                eVar = e.OK;
                a.this.b.B();
            } else if (iB == 429) {
                q.e("rbx.purchaseflow", "Service has been rate limited to user.");
                a.this.b.G();
                try {
                    int i10 = new JSONObject(strA).getJSONArray("errors").getJSONObject(0).getInt("code");
                    eVar = (i10 == 7 || i10 == 6) ? e.LIMIT_UNDER_13 : e.LIMIT;
                } catch (JSONException unused) {
                }
            } else if (iB == 500) {
                q.e("rbx.purchaseflow", "Server Error");
                eVar = e.UNKNOWN_ERROR;
                a.this.b.H();
            } else if (iB == 503) {
                q.e("rbx.purchaseflow", "Service has been turned off. Header response will include Retry-After in seconds.");
                eVar = e.RETRY;
                a.this.b.I();
            } else if (iB == 400) {
                q.e("rbx.purchaseflow", "Service has thrown an uknown exception.");
                eVar = e.UNKNOWN_ERROR;
                a.this.b.C();
            } else if (iB == 401) {
                q.e("rbx.purchaseflow", "Unauthorized to make request. Auth cookie is needed.");
                eVar = e.ERROR;
                a.this.b.D();
            } else if (iB == 403) {
                q.e("rbx.purchaseflow", "Unauthorized to make request. XSRF token is needed.");
                eVar = e.ERROR;
                a.this.b.E();
            } else if (iB != 404) {
                q.e("rbx.purchaseflow", "Validation unknown error");
                eVar = e.UNKNOWN_ERROR;
                a.this.b.J();
            } else {
                q.e("rbx.purchaseflow", "{validateModel} is invalid.");
                eVar = e.ERROR;
                a.this.b.F();
            }
            f fVar = this.f9098a;
            if (fVar != null) {
                fVar.a(eVar, this.b, validatePurchaseResponsePayload2);
            }
        }
    }

    public class b implements dj.h.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f9100a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f9102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f9103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f f9104f;

        public b(String str, String str2, String str3, String str4, boolean z10, f fVar) {
            this.f9100a = str;
            this.b = str2;
            this.f9101c = str3;
            this.f9102d = str4;
            this.f9103e = z10;
            this.f9104f = fVar;
        }

        @Override // dj.h.d
        public void a(boolean z10, int i10) {
            if (z10) {
                a.this.b(this.f9100a, this.b, this.f9101c, this.f9102d, this.f9103e, this.f9104f);
                return;
            }
            f fVar = this.f9104f;
            if (fVar != null) {
                fVar.a(e.ERROR_CHECKING_BALANCE, this.b, null);
            }
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9106a;

        static {
            int[] iArr = new int[d.values().length];
            f9106a = iArr;
            try {
                iArr[d.ValidationFailure_ExceedPurchaseLimit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9106a[d.ValidationFailure_UserUnder13ExceedPurchaseLimit.ordinal()] = 2;
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

    public a(@NonNull mi.f fVar) {
        this.f9097a = fVar;
    }

    public void b(String str, String str2, String str3, String str4, boolean z10, f fVar) {
        ValidatePurchaseResponsePayload validatePurchaseResponsePayload = null;
        if (!h.a().L1() || !t.g()) {
            this.f9097a.a(str, str4 != null ? new oi.b(str2, str3, str4) : new oi.b(str2, str3), null, new C0150a(fVar, str2)).b();
            this.b.A();
            return;
        }
        PreparePaymentParams.a aVarC = PreparePaymentParams.builder().f(str2).b(str3).e(str4).d(t.k() ? "VngGooglePlayStore" : "GooglePlayStore").c(z10);
        this.b.A();
        HashMap<String, String> mapNativeBeginPaymentsProtocolPurchaseV2 = IAPPurchaseManager.nativeBeginPaymentsProtocolPurchaseV2(aVarC.a());
        q.h("rbx.purchaseflow", "parsing response payload: " + mapNativeBeginPaymentsProtocolPurchaseV2);
        Integer numA = r.a(mapNativeBeginPaymentsProtocolPurchaseV2, "response_code");
        Long lB = r.b(mapNativeBeginPaymentsProtocolPurchaseV2, "user_id");
        String str5 = mapNativeBeginPaymentsProtocolPurchaseV2.get("checkout_session_id");
        if (numA == null || lB == null) {
            q.k("rbx.purchaseflow", "parsing response payload failed: " + mapNativeBeginPaymentsProtocolPurchaseV2);
            this.b.z();
        } else {
            validatePurchaseResponsePayload = new ValidatePurchaseResponsePayload(lB, str5, null);
        }
        e eVarF = f(numA, validatePurchaseResponsePayload);
        if (fVar != null) {
            q.h("rbx.purchaseflow", "PaymentsProtocolV2: OnValidationCheckFinished start.");
            fVar.a(eVarF, str2, validatePurchaseResponsePayload);
        }
    }

    public void c(String str, String str2, String str3, String str4, f fVar) {
        b(str, str2, str3, str4, false, fVar);
    }

    public void d(String str, String str2, String str3, String str4, boolean z10, f fVar) {
        q.h("rbx.purchaseflow", "Get balance.");
        dj.h.e().m(new b(str, str2, str3, str4, z10, fVar), this.f9097a);
    }

    public void e(String str, String str2, String str3, String str4, f fVar) {
        d(str, str2, str3, str4, false, fVar);
    }

    public final e f(Integer num, ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
        if (num == null) {
            q.e("rbx.purchaseflow", "Validation unknown error: responseCode is null");
            this.b.J();
            return e.UNKNOWN_ERROR;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 200) {
            q.h("rbx.purchaseflow", "Validation returns 200");
            this.b.B();
            if (validatePurchaseResponsePayload == null) {
                q.k("rbx.purchaseflow", "validatePurchaseResponsePayload is null in getPurchaseValidationResult.");
                this.b.H();
                return e.ERROR;
            }
            if (validatePurchaseResponsePayload.getFailureReason() == null) {
                return e.OK;
            }
            q.e("rbx.purchaseflow", "Validation returns " + validatePurchaseResponsePayload.getFailureReason());
            int i10 = c.f9106a[validatePurchaseResponsePayload.getFailureReason().ordinal()];
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
            q.e("rbx.purchaseflow", "Service has been rate limited to user.");
            this.b.G();
            return e.LIMIT;
        }
        if (iIntValue == 500) {
            q.e("rbx.purchaseflow", "Server Error");
            this.b.H();
            return e.UNKNOWN_ERROR;
        }
        if (iIntValue == 503) {
            q.e("rbx.purchaseflow", "Service has been turned off. Header response will include Retry-After in seconds.");
            this.b.I();
            return e.RETRY;
        }
        if (iIntValue == 400) {
            q.e("rbx.purchaseflow", "Service has thrown an unknown exception.");
            this.b.C();
            return e.UNKNOWN_ERROR;
        }
        if (iIntValue == 401) {
            q.e("rbx.purchaseflow", "Unauthorized to make request. Auth cookie is needed.");
            this.b.D();
            return e.ERROR;
        }
        if (iIntValue == 403) {
            q.e("rbx.purchaseflow", "Forbidden to make request.");
            this.b.E();
            return e.ERROR;
        }
        if (iIntValue != 404) {
            q.e("rbx.purchaseflow", "Validation unknown error");
            this.b.J();
            return e.UNKNOWN_ERROR;
        }
        q.e("rbx.purchaseflow", "The response is not found");
        this.b.F();
        return e.ERROR;
    }
}
