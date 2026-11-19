package ob;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f27768a;

    public rd(Map map) {
        HashMap map2 = new HashMap();
        this.f27768a = map2;
        map2.putAll(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        ke.t tVar = td.f27826a;
        int size = tVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) tVar.get(i10);
            Map map = this.f27768a;
            if (map.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) map.get(str));
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0071, please report this as an issue */
    public final Bundle b() {
        Map map;
        Bundle bundle;
        String str;
        String str2;
        d5 d5Var = e5.f27226a1;
        if (((Boolean) d5Var.b(null)).booleanValue()) {
            Map map2 = this.f27768a;
            if ("1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
                if (((Boolean) d5Var.b(null)).booleanValue()) {
                    return f();
                }
                map = this.f27768a;
                if (map.get("Version") == null) {
                    return f();
                }
                if (g() >= 0) {
                    bundle = new Bundle();
                    String str3 = u8.AD_STORAGE.f27847a;
                    if (true != Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                        str = "denied";
                    } else {
                        str = "granted";
                    }
                    bundle.putString(str3, str);
                    String str4 = u8.AD_PERSONALIZATION.f27847a;
                    if (Objects.equals(map.get("AuthorizePurpose3"), "1") || !Objects.equals(map.get("AuthorizePurpose4"), "1")) {
                        str2 = "denied";
                    } else {
                        str2 = "granted";
                    }
                    bundle.putString(str4, str2);
                    if (g() >= 4) {
                        bundle.putString(u8.AD_USER_DATA.f27847a, (Objects.equals(map.get("AuthorizePurpose1"), "1") || !Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "denied" : "granted");
                    }
                    return bundle;
                }
            }
        } else {
            Map map3 = this.f27768a;
            if ("1".equals(map3.get("GoogleConsent")) && "1".equals(map3.get("gdprApplies")) && "1".equals(map3.get("EnableAdvertiserConsentMode"))) {
                if (((Boolean) d5Var.b(null)).booleanValue()) {
                    return f();
                }
                map = this.f27768a;
                if (map.get("Version") == null) {
                    return f();
                }
                if (g() >= 0) {
                    bundle = new Bundle();
                    String str5 = u8.AD_STORAGE.f27847a;
                    if (true != Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                        str = "denied";
                    } else {
                        str = "granted";
                    }
                    bundle.putString(str5, str);
                    String str6 = u8.AD_PERSONALIZATION.f27847a;
                    if (Objects.equals(map.get("AuthorizePurpose3"), "1")) {
                        str2 = "denied";
                    } else {
                        str2 = "denied";
                    }
                    bundle.putString(str6, str2);
                    if (g() >= 4) {
                        bundle.putString(u8.AD_USER_DATA.f27847a, (Objects.equals(map.get("AuthorizePurpose1"), "1") || !Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "denied" : "granted");
                    }
                    return bundle;
                }
            }
        }
        return Bundle.EMPTY;
    }

    public final String c() {
        String str = (String) this.f27768a.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String d(rd rdVar) {
        Map map = rdVar.f27768a;
        String str = (map.isEmpty() || ((String) map.get("Version")) != null) ? "0" : "1";
        Bundle bundleB = b();
        Bundle bundleB2 = rdVar.b();
        return str.concat((bundleB.size() == bundleB2.size() && Objects.equals(bundleB.getString("ad_storage"), bundleB2.getString("ad_storage")) && Objects.equals(bundleB.getString("ad_personalization"), bundleB2.getString("ad_personalization")) && Objects.equals(bundleB.getString("ad_user_data"), bundleB2.getString("ad_user_data"))) ? "0" : "1");
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        int i10 = -1;
        try {
            String str = (String) this.f27768a.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i10 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i10 < 0 || i10 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 >> 6));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 & 63));
        }
        int iG = g();
        if (iG < 0 || iG > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iG));
        }
        o9.s.a(true);
        Map map = this.f27768a;
        int i11 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        boolean zEquals = "1".equals(map.get("EnableAdvertiserConsentMode"));
        int i12 = i11 | 4;
        if (zEquals) {
            i12 = i11 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i12));
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rd) {
            return a().equalsIgnoreCase(((rd) obj).a());
        }
        return false;
    }

    public final Bundle f() {
        int iG;
        Map map = this.f27768a;
        if ("1".equals(map.get("GoogleConsent")) && (iG = g()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(u8.AD_STORAGE.f27847a, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(u8.AD_PERSONALIZATION.f27847a, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iG >= 4) {
                    String str3 = u8.AD_USER_DATA.f27847a;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final int g() {
        try {
            String str = (String) this.f27768a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
