package p306nb;

import android.content.Context;
import android.content.res.Resources;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import p213j9.C7103j;

/* JADX INFO: renamed from: nb.y6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9381y6 {
    /* JADX INFO: renamed from: a */
    public static String m37080a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C7103j.f27724a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m37081b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier("google_app_id", InquiryField.StringField.TYPE, str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Boolean m37082c(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return Boolean.valueOf(resources.getBoolean(identifier));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
