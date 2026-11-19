package ob;

import android.content.Context;
import android.content.res.Resources;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;

/* JADX INFO: loaded from: classes.dex */
public final class d7 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(k9.l.f21269a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final String b(String str, Resources resources, String str2) {
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

    public static final Boolean c(String str, Resources resources, String str2) {
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
