package com.roblox.client.purchase;

import androidx.annotation.NonNull;
import com.roblox.client.personasdk.BuildConfig;
import com.roblox.engine.jni.autovalue.PreparePaymentParams;
import gi.C6101b;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p104ei.C5132j;
import p104ei.InterfaceC5128f;
import p104ei.InterfaceC5134l;
import p151gk.C6124q;
import p151gk.C6125r;
import p151gk.C6127t;
import p174hj.ValidatePurchaseResponsePayload;
import th.C11659h;
import vi.C12216g;
import vi.C12217h;

/* JADX INFO: renamed from: com.roblox.client.purchase.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3219a {

    /* JADX INFO: renamed from: a */
    public InterfaceC5128f f11996a;

    /* JADX INFO: renamed from: b */
    public C12216g f11997b = C12216g.m45228b();

    /* JADX INFO: renamed from: com.roblox.client.purchase.a$a */
    public class a implements InterfaceC5134l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f f11998a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f11999b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(f fVar, String str) {
            this.f11998a = fVar;
            this.f11999b = str;
        }

        @Override // p104ei.InterfaceC5134l
        /* JADX INFO: renamed from: a */
        public void mo15091a(C5132j c5132j) {
            e eVar;
            ValidatePurchaseResponsePayload validatePurchaseResponsePayload;
            JSONException e10;
            String strM23932a = c5132j.m23932a();
            ValidatePurchaseResponsePayload validatePurchaseResponsePayload2 = null;
            if (strM23932a != null) {
                C6124q.m27063h("rbx.purchaseflow", "response Str " + strM23932a);
                C6124q.m27063h("rbx.purchaseflow", "response Code " + c5132j.m23933b());
                try {
                    JSONObject jSONObject = new JSONObject(new JSONObject(strM23932a).optString("providerPayload"));
                    long jOptLong = jSONObject.optLong("user_id");
                    String strOptString = jSONObject.optString("checkout_session_id");
                    validatePurchaseResponsePayload = new ValidatePurchaseResponsePayload(Long.valueOf(jOptLong), strOptString, null);
                    try {
                        C6124q.m27063h("rbx.purchaseflow", "Created validatePurchaseResponsePayload, userId: " + jOptLong + ", checkoutSessionId: " + strOptString);
                    } catch (JSONException e11) {
                        e10 = e11;
                        C6124q.m27060e("rbx.purchaseflow", "parsing response string failed: " + strM23932a + ", error: " + e10);
                        if (C11659h.m43403a().mo43447G0()) {
                            C3219a.this.f11997b.m45287z();
                        }
                    }
                } catch (JSONException e12) {
                    validatePurchaseResponsePayload = null;
                    e10 = e12;
                }
                validatePurchaseResponsePayload2 = validatePurchaseResponsePayload;
            }
            int iM23933b = c5132j.m23933b();
            if (iM23933b == 200) {
                C6124q.m27063h("rbx.purchaseflow", "Validation successful");
                eVar = e.OK;
                C3219a.this.f11997b.m45234B();
            } else if (iM23933b == 429) {
                C6124q.m27060e("rbx.purchaseflow", "Service has been rate limited to user.");
                C3219a.this.f11997b.m45239G();
                try {
                    int i10 = new JSONObject(strM23932a).getJSONArray("errors").getJSONObject(0).getInt("code");
                    eVar = (i10 == 7 || i10 == 6) ? e.LIMIT_UNDER_13 : e.LIMIT;
                } catch (JSONException unused) {
                }
            } else if (iM23933b == 500) {
                C6124q.m27060e("rbx.purchaseflow", "Server Error");
                eVar = e.UNKNOWN_ERROR;
                C3219a.this.f11997b.m45240H();
            } else if (iM23933b == 503) {
                C6124q.m27060e("rbx.purchaseflow", "Service has been turned off. Header response will include Retry-After in seconds.");
                eVar = e.RETRY;
                C3219a.this.f11997b.m45241I();
            } else if (iM23933b == 400) {
                C6124q.m27060e("rbx.purchaseflow", "Service has thrown an uknown exception.");
                eVar = e.UNKNOWN_ERROR;
                C3219a.this.f11997b.m45235C();
            } else if (iM23933b == 401) {
                C6124q.m27060e("rbx.purchaseflow", "Unauthorized to make request. Auth cookie is needed.");
                eVar = e.ERROR;
                C3219a.this.f11997b.m45236D();
            } else if (iM23933b == 403) {
                C6124q.m27060e("rbx.purchaseflow", "Unauthorized to make request. XSRF token is needed.");
                eVar = e.ERROR;
                C3219a.this.f11997b.m45237E();
            } else if (iM23933b != 404) {
                C6124q.m27060e("rbx.purchaseflow", "Validation unknown error");
                eVar = e.UNKNOWN_ERROR;
                C3219a.this.f11997b.m45242J();
            } else {
                C6124q.m27060e("rbx.purchaseflow", "{validateModel} is invalid.");
                eVar = e.ERROR;
                C3219a.this.f11997b.m45238F();
            }
            f fVar = this.f11998a;
            if (fVar != null) {
                fVar.mo15396a(eVar, this.f11999b, validatePurchaseResponsePayload2);
            }
        }

        @Override // p104ei.InterfaceC5134l
        /* JADX INFO: renamed from: b */
        public void mo15092b(C5132j c5132j) {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.purchase.a$b */
    public class b implements C12217h.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f12001a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f12002b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f12003c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f12004d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f12005e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ f f12006f;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(String str, String str2, String str3, String str4, boolean z10, f fVar) {
            this.f12001a = str;
            this.f12002b = str2;
            this.f12003c = str3;
            this.f12004d = str4;
            this.f12005e = z10;
            this.f12006f = fVar;
        }

        @Override // vi.C12217h.d
        /* JADX INFO: renamed from: a */
        public void mo15393a(boolean z10, int i10) {
            if (z10) {
                C3219a.this.m15388b(this.f12001a, this.f12002b, this.f12003c, this.f12004d, this.f12005e, this.f12006f);
                return;
            }
            f fVar = this.f12006f;
            if (fVar != null) {
                fVar.mo15396a(e.ERROR_CHECKING_BALANCE, this.f12002b, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.purchase.a$c */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12008a;

        static {
            int[] iArr = new int[d.values().length];
            f12008a = iArr;
            try {
                iArr[d.ValidationFailure_ExceedPurchaseLimit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12008a[d.ValidationFailure_UserUnder13ExceedPurchaseLimit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.purchase.a$d */
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

    /* JADX INFO: renamed from: com.roblox.client.purchase.a$e */
    public enum e {
        OK,
        ERROR,
        RETRY,
        LIMIT,
        LIMIT_UNDER_13,
        ERROR_CHECKING_BALANCE,
        UNKNOWN_ERROR
    }

    /* JADX INFO: renamed from: com.roblox.client.purchase.a$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo15396a(e eVar, String str, ValidatePurchaseResponsePayload validatePurchaseResponsePayload);
    }

    public C3219a(@NonNull InterfaceC5128f interfaceC5128f) {
        this.f11996a = interfaceC5128f;
    }

    /* JADX INFO: renamed from: b */
    public void m15388b(String str, String str2, String str3, String str4, boolean z10, f fVar) {
        ValidatePurchaseResponsePayload validatePurchaseResponsePayload = null;
        if (!C11659h.m43403a().mo43455H1() || !C6127t.m27091g()) {
            this.f11996a.mo23930b(str, str4 != null ? new C6101b(str2, str3, str4) : new C6101b(str2, str3), null, new a(fVar, str2)).m23907b();
            this.f11997b.m45233A();
            return;
        }
        PreparePaymentParams.Builder isInApp = PreparePaymentParams.builder().setProductId(str2).setCurrencyCode(str3).setPaymentSessionId(str4).setPaymentMethod(C6127t.m27095k() ? "VngGooglePlayStore" : BuildConfig.STORE_TYPE).setIsInApp(z10);
        this.f11997b.m45233A();
        HashMap<String, String> mapNativeBeginPaymentsProtocolPurchaseV2 = IAPPurchaseManager.nativeBeginPaymentsProtocolPurchaseV2(isInApp.build());
        C6124q.m27063h("rbx.purchaseflow", "parsing response payload: " + mapNativeBeginPaymentsProtocolPurchaseV2);
        Integer numM27081a = C6125r.m27081a(mapNativeBeginPaymentsProtocolPurchaseV2, "response_code");
        Long lM27082b = C6125r.m27082b(mapNativeBeginPaymentsProtocolPurchaseV2, "user_id");
        String str5 = mapNativeBeginPaymentsProtocolPurchaseV2.get("checkout_session_id");
        if (numM27081a == null || lM27082b == null) {
            C6124q.m27066k("rbx.purchaseflow", "parsing response payload failed: " + mapNativeBeginPaymentsProtocolPurchaseV2);
            this.f11997b.m45287z();
        } else {
            validatePurchaseResponsePayload = new ValidatePurchaseResponsePayload(lM27082b, str5, null);
        }
        e eVarM15392f = m15392f(numM27081a, validatePurchaseResponsePayload);
        if (fVar != null) {
            C6124q.m27063h("rbx.purchaseflow", "PaymentsProtocolV2: OnValidationCheckFinished start.");
            fVar.mo15396a(eVarM15392f, str2, validatePurchaseResponsePayload);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15389c(String str, String str2, String str3, String str4, f fVar) {
        m15388b(str, str2, str3, str4, false, fVar);
    }

    /* JADX INFO: renamed from: d */
    public void m15390d(String str, String str2, String str3, String str4, boolean z10, f fVar) {
        C6124q.m27063h("rbx.purchaseflow", "Get balance.");
        C12217h.m45288e().m45300m(new b(str, str2, str3, str4, z10, fVar), this.f11996a);
    }

    /* JADX INFO: renamed from: e */
    public void m15391e(String str, String str2, String str3, String str4, f fVar) {
        m15390d(str, str2, str3, str4, false, fVar);
    }

    /* JADX INFO: renamed from: f */
    public final e m15392f(Integer num, ValidatePurchaseResponsePayload validatePurchaseResponsePayload) {
        if (num == null) {
            C6124q.m27060e("rbx.purchaseflow", "Validation unknown error: responseCode is null");
            this.f11997b.m45242J();
            return e.UNKNOWN_ERROR;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 200) {
            C6124q.m27063h("rbx.purchaseflow", "Validation returns 200");
            this.f11997b.m45234B();
            if (validatePurchaseResponsePayload == null) {
                C6124q.m27066k("rbx.purchaseflow", "validatePurchaseResponsePayload is null in getPurchaseValidationResult.");
                this.f11997b.m45240H();
                return e.ERROR;
            }
            if (validatePurchaseResponsePayload.getFailureReason() == null) {
                return e.OK;
            }
            C6124q.m27060e("rbx.purchaseflow", "Validation returns " + validatePurchaseResponsePayload.getFailureReason());
            int i10 = c.f12008a[validatePurchaseResponsePayload.getFailureReason().ordinal()];
            if (i10 == 1) {
                this.f11997b.m45237E();
                return e.LIMIT;
            }
            if (i10 != 2) {
                this.f11997b.m45237E();
                return e.ERROR;
            }
            this.f11997b.m45237E();
            return e.LIMIT_UNDER_13;
        }
        if (iIntValue == 429) {
            C6124q.m27060e("rbx.purchaseflow", "Service has been rate limited to user.");
            this.f11997b.m45239G();
            return e.LIMIT;
        }
        if (iIntValue == 500) {
            C6124q.m27060e("rbx.purchaseflow", "Server Error");
            this.f11997b.m45240H();
            return e.UNKNOWN_ERROR;
        }
        if (iIntValue == 503) {
            C6124q.m27060e("rbx.purchaseflow", "Service has been turned off. Header response will include Retry-After in seconds.");
            this.f11997b.m45241I();
            return e.RETRY;
        }
        if (iIntValue == 400) {
            C6124q.m27060e("rbx.purchaseflow", "Service has thrown an unknown exception.");
            this.f11997b.m45235C();
            return e.UNKNOWN_ERROR;
        }
        if (iIntValue == 401) {
            C6124q.m27060e("rbx.purchaseflow", "Unauthorized to make request. Auth cookie is needed.");
            this.f11997b.m45236D();
            return e.ERROR;
        }
        if (iIntValue == 403) {
            C6124q.m27060e("rbx.purchaseflow", "Forbidden to make request.");
            this.f11997b.m45237E();
            return e.ERROR;
        }
        if (iIntValue != 404) {
            C6124q.m27060e("rbx.purchaseflow", "Validation unknown error");
            this.f11997b.m45242J();
            return e.UNKNOWN_ERROR;
        }
        C6124q.m27060e("rbx.purchaseflow", "The response is not found");
        this.f11997b.m45238F();
        return e.ERROR;
    }
}
