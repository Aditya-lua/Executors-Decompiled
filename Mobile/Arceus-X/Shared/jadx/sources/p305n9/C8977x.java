package p305n9;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Locale;
import p164h9.C6325b;
import p213j9.C7097g;
import p213j9.C7103j;
import p456u2.C11777f;
import p462u9.C11818i;
import p504w1.C12286j;
import p511w9.C12327c;

/* JADX INFO: renamed from: n9.x */
/* JADX INFO: loaded from: classes.dex */
public final class C8977x {

    /* JADX INFO: renamed from: a */
    public static final C12286j f32645a = new C12286j();

    /* JADX INFO: renamed from: b */
    public static Locale f32646b;

    /* JADX INFO: renamed from: a */
    public static String m36078a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C12327c.m46181a(context).m46177d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static String m36079b(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 == 1) {
            return resources.getString(C6325b.f24058d);
        }
        if (i10 != 2) {
            return i10 != 3 ? resources.getString(R.string.ok) : resources.getString(C6325b.f24055a);
        }
        return resources.getString(C6325b.f24064j);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static String m36080c(Context context, int i10) {
        Resources resources = context.getResources();
        String strM36078a = m36078a(context);
        if (i10 == 1) {
            return resources.getString(C6325b.f24059e, strM36078a);
        }
        if (i10 == 2) {
            return C11818i.m44184d(context) ? resources.getString(C6325b.f24068n) : resources.getString(C6325b.f24065k, strM36078a);
        }
        if (i10 == 3) {
            return resources.getString(C6325b.f24056b, strM36078a);
        }
        if (i10 == 5) {
            return m36084g(context, "common_google_play_services_invalid_account_text", strM36078a);
        }
        if (i10 == 7) {
            return m36084g(context, "common_google_play_services_network_error_text", strM36078a);
        }
        if (i10 == 9) {
            return resources.getString(C6325b.f24063i, strM36078a);
        }
        if (i10 == 20) {
            return m36084g(context, "common_google_play_services_restricted_profile_text", strM36078a);
        }
        switch (i10) {
            case 16:
                return m36084g(context, "common_google_play_services_api_unavailable_text", strM36078a);
            case 17:
                return m36084g(context, "common_google_play_services_sign_in_failed_text", strM36078a);
            case 18:
                return resources.getString(C6325b.f24067m, strM36078a);
            default:
                return resources.getString(C7103j.f27724a, strM36078a);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static String m36081d(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? m36084g(context, "common_google_play_services_resolution_required_text", m36078a(context)) : m36080c(context, i10);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static String m36082e(Context context, int i10) {
        String strM36085h = i10 == 6 ? m36085h(context, "common_google_play_services_resolution_required_title") : m36083f(context, i10);
        return strM36085h == null ? context.getResources().getString(C6325b.f24062h) : strM36085h;
    }

    /* JADX INFO: renamed from: f */
    public static String m36083f(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(C6325b.f24060f);
            case 2:
                return resources.getString(C6325b.f24066l);
            case 3:
                return resources.getString(C6325b.f24057c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m36085h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m36085h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i10);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m36085h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m36085h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m36084g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strM36085h = m36085h(context, str);
        if (strM36085h == null) {
            strM36085h = resources.getString(C7103j.f27724a);
        }
        return String.format(resources.getConfiguration().locale, strM36085h, str2);
    }

    /* JADX INFO: renamed from: h */
    public static String m36085h(Context context, String str) {
        C12286j c12286j = f32645a;
        synchronized (c12286j) {
            try {
                Locale localeM44072c = C11777f.m44061a(context.getResources().getConfiguration()).m44072c(0);
                if (!localeM44072c.equals(f32646b)) {
                    c12286j.clear();
                    f32646b = localeM44072c;
                }
                String str2 = (String) c12286j.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesM29881d = C7097g.m29881d(context);
                if (resourcesM29881d == null) {
                    return null;
                }
                int identifier = resourcesM29881d.getIdentifier(str, InquiryField.StringField.TYPE, "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = resourcesM29881d.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    c12286j.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
