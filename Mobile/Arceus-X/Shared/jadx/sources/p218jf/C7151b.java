package p218jf;

import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import ie.AbstractC6796t;
import ie.AbstractC6802w;
import p306nb.C9303t8;

/* JADX INFO: renamed from: jf.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7151b {

    /* JADX INFO: renamed from: a */
    public static final AbstractC6802w f27808a = AbstractC6802w.m29143y("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b */
    public static final AbstractC6796t f27809b = AbstractC6796t.m29086D("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c */
    public static final AbstractC6796t f27810c = AbstractC6796t.m29085C("auto", Payload.TYPE_APP, "am");

    /* JADX INFO: renamed from: d */
    public static final AbstractC6796t f27811d = AbstractC6796t.m29084B("_r", "_dbg");

    /* JADX INFO: renamed from: e */
    public static final AbstractC6796t f27812e = new AbstractC6796t.a().m29104i(C9303t8.f33498a).m29104i(C9303t8.f33499b).m29106k();

    /* JADX INFO: renamed from: f */
    public static final AbstractC6796t f27813f = AbstractC6796t.m29084B("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* JADX INFO: renamed from: a */
    public static boolean m29948a(String str) {
        return !f27810c.contains(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: E */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static boolean m29949b(String str, Bundle bundle) {
        if (f27809b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC6796t abstractC6796t = f27811d;
        int size = abstractC6796t.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) abstractC6796t.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: E */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static boolean m29950c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f27812e.contains(str2)) {
            return false;
        }
        AbstractC6796t abstractC6796t = f27813f;
        int size = abstractC6796t.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zMatches = str2.matches((String) abstractC6796t.get(i10));
            i10++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: E */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static boolean m29951d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m29948a(str) || bundle == null) {
            return false;
        }
        AbstractC6796t abstractC6796t = f27811d;
        int size = abstractC6796t.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) abstractC6796t.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals("fiam")) {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            } else if (str.equals("fdl")) {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
        } else if (str.equals("fcm")) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }
}
