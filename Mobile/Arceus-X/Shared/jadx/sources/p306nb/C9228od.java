package p306nb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.EnumC2229o9;
import com.google.android.gms.internal.measurement.EnumC2247p9;
import ie.AbstractC6796t;
import ie.AbstractC6798u;
import ie.AbstractC6802w;
import java.util.Map;

/* JADX INFO: renamed from: nb.od */
/* JADX INFO: loaded from: classes.dex */
public final class C9228od {

    /* JADX INFO: renamed from: a */
    public static final AbstractC6796t f33311a = AbstractC6796t.m29087E("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    /* JADX INFO: renamed from: a */
    public static String m36600a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m36601b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m36602c(EnumC2229o9 enumC2229o9, AbstractC6798u abstractC6798u, AbstractC6798u abstractC6798u2, AbstractC6802w abstractC6802w, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        int i15;
        int i16;
        AbstractC6802w abstractC6802w2;
        String str4;
        EnumC9212nd enumC9212nd;
        char c10;
        int iM36604e = m36604e(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (iM36604e > 0) {
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
            cArr[iM36604e] = '2';
        } else {
            i15 = i11;
            i16 = i12;
        }
        if (m36608i(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i15, i16, i13, i14, str, str2, str3, z10, z11, true) == EnumC2247p9.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            int i17 = i14;
            if (enumC2229o9 == EnumC2229o9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                abstractC6802w2 = abstractC6802w;
                str4 = str;
                if (i17 == 1) {
                    if (abstractC6802w2.contains(str4)) {
                        if (iM36604e > 0 && cArr[iM36604e] != '2') {
                            cArr[iM36604e] = '1';
                        }
                        return true;
                    }
                    i17 = 1;
                }
            } else {
                abstractC6802w2 = abstractC6802w;
                str4 = str;
            }
            if (abstractC6798u.containsKey(enumC2229o9) && (enumC9212nd = (EnumC9212nd) abstractC6798u.get(enumC2229o9)) != null) {
                int iOrdinal = enumC9212nd.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return m36608i(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) == EnumC2247p9.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? m36607h(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : m36606g(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        if (iOrdinal == 3) {
                            return m36608i(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w2, cArr, i10, i15, i16, i13, i17, str4, str2, str3, z10, z11, true) == EnumC2247p9.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? m36606g(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : m36607h(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        c10 = '0';
                    } else if (m36608i(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != EnumC2247p9.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return m36607h(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                    }
                } else if (m36608i(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != EnumC2247p9.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return m36606g(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                }
                c10 = '8';
            } else {
                c10 = '0';
            }
        }
        if (iM36604e <= 0 || cArr[iM36604e] == '2') {
            return false;
        }
        cArr[iM36604e] = c10;
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final Map m36603d(AbstractC6798u abstractC6798u, AbstractC6798u abstractC6798u2, AbstractC6802w abstractC6802w, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (!z12) {
            return AbstractC6798u.m29117j();
        }
        EnumC2229o9 enumC2229o9 = EnumC2229o9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        EnumC2247p9 enumC2247p9 = (EnumC2247p9) abstractC6798u2.get(enumC2229o9);
        EnumC2229o9 enumC2229o10 = EnumC2229o9.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        EnumC2247p9 enumC2247p10 = (EnumC2247p9) abstractC6798u2.get(enumC2229o10);
        EnumC2229o9 enumC2229o11 = EnumC2229o9.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        EnumC2247p9 enumC2247p11 = (EnumC2247p9) abstractC6798u2.get(enumC2229o11);
        EnumC2229o9 enumC2229o12 = EnumC2229o9.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        EnumC2247p9 enumC2247p12 = (EnumC2247p9) abstractC6798u2.get(enumC2229o12);
        return AbstractC6798u.m29114a().mo29043f("Version", "2").mo29043f("VendorConsent", true != z10 ? "0" : "1").mo29043f("VendorLegitimateInterest", true != z11 ? "0" : "1").mo29043f("gdprApplies", i12 != 1 ? "0" : "1").mo29043f("EnableAdvertiserConsentMode", i11 != 1 ? "0" : "1").mo29043f("PolicyVersion", String.valueOf(i13)).mo29043f("CmpSdkID", String.valueOf(i10)).mo29043f("PurposeOneTreatment", i14 != 1 ? "0" : "1").mo29043f("PublisherCC", str).mo29043f("PublisherRestrictions1", String.valueOf(enumC2247p9 != null ? enumC2247p9.zza() : EnumC2247p9.PURPOSE_RESTRICTION_UNDEFINED.zza())).mo29043f("PublisherRestrictions3", String.valueOf(enumC2247p10 != null ? enumC2247p10.zza() : EnumC2247p9.PURPOSE_RESTRICTION_UNDEFINED.zza())).mo29043f("PublisherRestrictions4", String.valueOf(enumC2247p11 != null ? enumC2247p11.zza() : EnumC2247p9.PURPOSE_RESTRICTION_UNDEFINED.zza())).mo29043f("PublisherRestrictions7", String.valueOf(enumC2247p12 != null ? enumC2247p12.zza() : EnumC2247p9.PURPOSE_RESTRICTION_UNDEFINED.zza())).mo29046i(AbstractC6798u.m29120m("Purpose1", m36605f(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose3", m36605f(enumC2229o10, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose4", m36605f(enumC2229o11, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose7", m36605f(enumC2229o12, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true))).mo29046i(AbstractC6798u.m29121n("AuthorizePurpose1", true != m36602c(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose3", true != m36602c(enumC2229o10, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose4", true != m36602c(enumC2229o11, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose7", true != m36602c(enumC2229o12, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).mo29042c();
    }

    /* JADX INFO: renamed from: e */
    public static final int m36604e(EnumC2229o9 enumC2229o9, AbstractC6798u abstractC6798u, AbstractC6798u abstractC6798u2, AbstractC6802w abstractC6802w, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (enumC2229o9 == EnumC2229o9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (enumC2229o9 == EnumC2229o9.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (enumC2229o9 == EnumC2229o9.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return enumC2229o9 == EnumC2229o9.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    /* JADX INFO: renamed from: f */
    public static final String m36605f(EnumC2229o9 enumC2229o9, AbstractC6798u abstractC6798u, AbstractC6798u abstractC6798u2, AbstractC6802w abstractC6802w, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str2) || str2.length() < enumC2229o9.zza()) ? "0" : String.valueOf(str2.charAt(enumC2229o9.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= enumC2229o9.zza()) {
            strValueOf = String.valueOf(str3.charAt(enumC2229o9.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m36606g(EnumC2229o9 enumC2229o9, AbstractC6798u abstractC6798u, AbstractC6798u abstractC6798u2, AbstractC6802w abstractC6802w, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iM36604e = m36604e(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z10) {
            c10 = '4';
        } else {
            if (str2.length() >= enumC2229o9.zza()) {
                char cCharAt = str2.charAt(enumC2229o9.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iM36604e > 0 && cArr[iM36604e] != '2') {
                    cArr[iM36604e] = cCharAt != '1' ? '6' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iM36604e > 0 && cArr[iM36604e] != '2') {
            cArr[iM36604e] = c10;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m36607h(EnumC2229o9 enumC2229o9, AbstractC6798u abstractC6798u, AbstractC6798u abstractC6798u2, AbstractC6802w abstractC6802w, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iM36604e = m36604e(enumC2229o9, abstractC6798u, abstractC6798u2, abstractC6802w, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z11) {
            c10 = '5';
        } else {
            if (str3.length() >= enumC2229o9.zza()) {
                char cCharAt = str3.charAt(enumC2229o9.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iM36604e > 0 && cArr[iM36604e] != '2') {
                    cArr[iM36604e] = cCharAt != '1' ? '7' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iM36604e > 0 && cArr[iM36604e] != '2') {
            cArr[iM36604e] = c10;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final EnumC2247p9 m36608i(EnumC2229o9 enumC2229o9, AbstractC6798u abstractC6798u, AbstractC6798u abstractC6798u2, AbstractC6802w abstractC6802w, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        return (EnumC2247p9) abstractC6798u2.getOrDefault(enumC2229o9, EnumC2247p9.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
