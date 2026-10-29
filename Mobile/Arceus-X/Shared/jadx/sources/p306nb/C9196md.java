package p306nb;

import android.os.Bundle;
import android.text.TextUtils;
import ie.AbstractC6796t;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.md */
/* JADX INFO: loaded from: classes.dex */
public final class C9196md {

    /* JADX INFO: renamed from: a */
    public final Map f33215a;

    public C9196md(Map map) {
        HashMap map2 = new HashMap();
        this.f33215a = map2;
        map2.putAll(map);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: E */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final String m36481a() {
        StringBuilder sb2 = new StringBuilder();
        AbstractC6796t abstractC6796t = C9228od.f33311a;
        int size = abstractC6796t.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) abstractC6796t.get(i10);
            Map map = this.f33215a;
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
    /* JADX INFO: renamed from: b */
    public final Bundle m36482b() {
        Map map;
        Bundle bundle;
        String str;
        String str2;
        C9379y4 c9379y4 = C9395z4.f33759a1;
        if (((Boolean) c9379y4.m37079b(null)).booleanValue()) {
            Map map2 = this.f33215a;
            if ("1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
                if (((Boolean) c9379y4.m37079b(null)).booleanValue()) {
                    return m36486f();
                }
                map = this.f33215a;
                if (map.get("Version") == null) {
                    return m36486f();
                }
                if (m36487g() >= 0) {
                    bundle = new Bundle();
                    String str3 = EnumC9239p8.AD_STORAGE.f33347a;
                    if (true != Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                        str = "denied";
                    } else {
                        str = "granted";
                    }
                    bundle.putString(str3, str);
                    String str4 = EnumC9239p8.AD_PERSONALIZATION.f33347a;
                    if (Objects.equals(map.get("AuthorizePurpose3"), "1") || !Objects.equals(map.get("AuthorizePurpose4"), "1")) {
                        str2 = "denied";
                    } else {
                        str2 = "granted";
                    }
                    bundle.putString(str4, str2);
                    if (m36487g() >= 4) {
                        bundle.putString(EnumC9239p8.AD_USER_DATA.f33347a, (Objects.equals(map.get("AuthorizePurpose1"), "1") || !Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "denied" : "granted");
                    }
                    return bundle;
                }
            }
        } else {
            Map map3 = this.f33215a;
            if ("1".equals(map3.get("GoogleConsent")) && "1".equals(map3.get("gdprApplies")) && "1".equals(map3.get("EnableAdvertiserConsentMode"))) {
                if (((Boolean) c9379y4.m37079b(null)).booleanValue()) {
                    return m36486f();
                }
                map = this.f33215a;
                if (map.get("Version") == null) {
                    return m36486f();
                }
                if (m36487g() >= 0) {
                    bundle = new Bundle();
                    String str5 = EnumC9239p8.AD_STORAGE.f33347a;
                    if (true != Objects.equals(map.get("AuthorizePurpose1"), "1")) {
                        str = "denied";
                    } else {
                        str = "granted";
                    }
                    bundle.putString(str5, str);
                    String str6 = EnumC9239p8.AD_PERSONALIZATION.f33347a;
                    if (Objects.equals(map.get("AuthorizePurpose3"), "1")) {
                        str2 = "denied";
                    } else {
                        str2 = "denied";
                    }
                    bundle.putString(str6, str2);
                    if (m36487g() >= 4) {
                        bundle.putString(EnumC9239p8.AD_USER_DATA.f33347a, (Objects.equals(map.get("AuthorizePurpose1"), "1") || !Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "denied" : "granted");
                    }
                    return bundle;
                }
            }
        }
        return Bundle.EMPTY;
    }

    /* JADX INFO: renamed from: c */
    public final String m36483c() {
        String str = (String) this.f33215a.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    /* JADX INFO: renamed from: d */
    public final String m36484d(C9196md c9196md) {
        Map map = c9196md.f33215a;
        String str = (map.isEmpty() || ((String) map.get("Version")) != null) ? "0" : "1";
        Bundle bundleM36482b = m36482b();
        Bundle bundleM36482b2 = c9196md.m36482b();
        return str.concat((bundleM36482b.size() == bundleM36482b2.size() && Objects.equals(bundleM36482b.getString("ad_storage"), bundleM36482b2.getString("ad_storage")) && Objects.equals(bundleM36482b.getString("ad_personalization"), bundleM36482b2.getString("ad_personalization")) && Objects.equals(bundleM36482b.getString("ad_user_data"), bundleM36482b2.getString("ad_user_data"))) ? "0" : "1");
    }

    /* JADX INFO: renamed from: e */
    public final String m36485e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        int i10 = -1;
        try {
            String str = (String) this.f33215a.get("CmpSdkID");
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
        int iM36487g = m36487g();
        if (iM36487g < 0 || iM36487g > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iM36487g));
        }
        C8953m.m36036a(true);
        Map map = this.f33215a;
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
        if (obj instanceof C9196md) {
            return m36481a().equalsIgnoreCase(((C9196md) obj).m36481a());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Bundle m36486f() {
        int iM36487g;
        Map map = this.f33215a;
        if ("1".equals(map.get("GoogleConsent")) && (iM36487g = m36487g()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(EnumC9239p8.AD_STORAGE.f33347a, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(EnumC9239p8.AD_PERSONALIZATION.f33347a, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iM36487g >= 4) {
                    String str3 = EnumC9239p8.AD_USER_DATA.f33347a;
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

    /* JADX INFO: renamed from: g */
    public final int m36487g() {
        try {
            String str = (String) this.f33215a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final int hashCode() {
        return m36481a().hashCode();
    }

    public final String toString() {
        return m36481a();
    }
}
