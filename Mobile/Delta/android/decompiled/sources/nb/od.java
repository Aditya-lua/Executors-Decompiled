package nb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final he.t f25824a = he.t.E("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static final boolean c(com.google.android.gms.internal.measurement.o9 o9Var, he.u uVar, he.u uVar2, he.w wVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        int i15;
        int i16;
        he.w wVar2;
        String str4;
        nd ndVar;
        char c10;
        int iE = e(o9Var, uVar, uVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (iE > 0) {
            i16 = i12;
            if (i16 == 1) {
                i15 = i11;
                if (i15 != 1) {
                    i16 = 1;
                } else {
                    i15 = 1;
                    i16 = 1;
                }
            } else {
                i15 = i11;
            }
            cArr[iE] = '2';
        } else {
            i15 = i11;
            i16 = i12;
        }
        if (i(o9Var, uVar, uVar2, wVar, cArr, i10, i15, i16, i13, i14, str, str2, str3, z10, z11, true) == com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            int i17 = i14;
            if (o9Var == com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                wVar2 = wVar;
                str4 = str;
                if (i17 == 1) {
                    if (wVar2.contains(str4)) {
                        if (iE > 0 && cArr[iE] != '2') {
                            cArr[iE] = '1';
                        }
                        return true;
                    }
                    i17 = 1;
                }
            } else {
                wVar2 = wVar;
                str4 = str;
            }
            if (uVar.containsKey(o9Var) && (ndVar = (nd) uVar.get(o9Var)) != null) {
                int iOrdinal = ndVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return i(o9Var, uVar, uVar2, wVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) == com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? h(o9Var, uVar, uVar2, wVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : g(o9Var, uVar, uVar2, wVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        if (iOrdinal == 3) {
                            return i(o9Var, uVar, uVar2, wVar2, cArr, i10, i15, i16, i13, i17, str4, str2, str3, z10, z11, true) == com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? g(o9Var, uVar, uVar2, wVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : h(o9Var, uVar, uVar2, wVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        c10 = '0';
                    } else if (i(o9Var, uVar, uVar2, wVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return h(o9Var, uVar, uVar2, wVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                    }
                } else if (i(o9Var, uVar, uVar2, wVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return g(o9Var, uVar, uVar2, wVar, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                }
                c10 = '8';
            } else {
                c10 = '0';
            }
        }
        if (iE <= 0 || cArr[iE] == '2') {
            return false;
        }
        cArr[iE] = c10;
        return false;
    }

    public static final Map d(he.u uVar, he.u uVar2, he.w wVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (!z12) {
            return he.u.j();
        }
        com.google.android.gms.internal.measurement.o9 o9Var = com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.p9 p9Var = (com.google.android.gms.internal.measurement.p9) uVar2.get(o9Var);
        com.google.android.gms.internal.measurement.o9 o9Var2 = com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.p9 p9Var2 = (com.google.android.gms.internal.measurement.p9) uVar2.get(o9Var2);
        com.google.android.gms.internal.measurement.o9 o9Var3 = com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.p9 p9Var3 = (com.google.android.gms.internal.measurement.p9) uVar2.get(o9Var3);
        com.google.android.gms.internal.measurement.o9 o9Var4 = com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.p9 p9Var4 = (com.google.android.gms.internal.measurement.p9) uVar2.get(o9Var4);
        return he.u.a().f("Version", "2").f("VendorConsent", true != z10 ? "0" : "1").f("VendorLegitimateInterest", true != z11 ? "0" : "1").f("gdprApplies", i12 != 1 ? "0" : "1").f("EnableAdvertiserConsentMode", i11 != 1 ? "0" : "1").f("PolicyVersion", String.valueOf(i13)).f("CmpSdkID", String.valueOf(i10)).f("PurposeOneTreatment", i14 != 1 ? "0" : "1").f("PublisherCC", str).f("PublisherRestrictions1", String.valueOf(p9Var != null ? p9Var.zza() : com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions3", String.valueOf(p9Var2 != null ? p9Var2.zza() : com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions4", String.valueOf(p9Var3 != null ? p9Var3.zza() : com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions7", String.valueOf(p9Var4 != null ? p9Var4.zza() : com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_UNDEFINED.zza())).i(he.u.m("Purpose1", f(o9Var, uVar, uVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose3", f(o9Var2, uVar, uVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose4", f(o9Var3, uVar, uVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose7", f(o9Var4, uVar, uVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true))).i(he.u.n("AuthorizePurpose1", true != c(o9Var, uVar, uVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose3", true != c(o9Var2, uVar, uVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose4", true != c(o9Var3, uVar, uVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose7", true != c(o9Var4, uVar, uVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).c();
    }

    public static final int e(com.google.android.gms.internal.measurement.o9 o9Var, he.u uVar, he.u uVar2, he.w wVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (o9Var == com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (o9Var == com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (o9Var == com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return o9Var == com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String f(com.google.android.gms.internal.measurement.o9 o9Var, he.u uVar, he.u uVar2, he.w wVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str2) || str2.length() < o9Var.zza()) ? "0" : String.valueOf(str2.charAt(o9Var.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= o9Var.zza()) {
            strValueOf = String.valueOf(str3.charAt(o9Var.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean g(com.google.android.gms.internal.measurement.o9 o9Var, he.u uVar, he.u uVar2, he.w wVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iE = e(o9Var, uVar, uVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z10) {
            c10 = '4';
        } else {
            if (str2.length() >= o9Var.zza()) {
                char cCharAt = str2.charAt(o9Var.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    cArr[iE] = cCharAt != '1' ? '6' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c10;
        }
        return false;
    }

    public static final boolean h(com.google.android.gms.internal.measurement.o9 o9Var, he.u uVar, he.u uVar2, he.w wVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iE = e(o9Var, uVar, uVar2, wVar, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z11) {
            c10 = '5';
        } else {
            if (str3.length() >= o9Var.zza()) {
                char cCharAt = str3.charAt(o9Var.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    cArr[iE] = cCharAt != '1' ? '7' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c10;
        }
        return false;
    }

    public static final com.google.android.gms.internal.measurement.p9 i(com.google.android.gms.internal.measurement.o9 o9Var, he.u uVar, he.u uVar2, he.w wVar, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        return (com.google.android.gms.internal.measurement.p9) uVar2.getOrDefault(o9Var, com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
