package o9;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1.j f26951a = new w1.j();
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return x9.c.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    @NonNull
    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 == 1) {
            return resources.getString(i9.b.f19294d);
        }
        if (i10 != 2) {
            return i10 != 3 ? resources.getString(R.string.ok) : resources.getString(i9.b.f19292a);
        }
        return resources.getString(i9.b.f19300j);
    }

    @NonNull
    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i10 == 1) {
            return resources.getString(i9.b.f19295e, strA);
        }
        if (i10 == 2) {
            return v9.i.d(context) ? resources.getString(i9.b.f19304n) : resources.getString(i9.b.f19301k, strA);
        }
        if (i10 == 3) {
            return resources.getString(i9.b.b, strA);
        }
        if (i10 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i10 == 7) {
            return g(context, "common_google_play_services_network_error_text", strA);
        }
        if (i10 == 9) {
            return resources.getString(i9.b.f19299i, strA);
        }
        if (i10 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i10) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", strA);
            case MlKitException.UNSUPPORTED /* 18 */:
                return resources.getString(i9.b.f19303m, strA);
            default:
                return resources.getString(k9.l.f21269a, strA);
        }
    }

    @NonNull
    public static String d(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i10);
    }

    @NonNull
    public static String e(Context context, int i10) {
        String strH = i10 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i10);
        return strH == null ? context.getResources().getString(i9.b.f19298h) : strH;
    }

    public static String f(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(i9.b.f19296f);
            case 2:
                return resources.getString(i9.b.f19302l);
            case 3:
                return resources.getString(i9.b.f19293c);
            case 4:
            case 6:
            case MlKitException.UNSUPPORTED /* 18 */:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
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
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(k9.l.f21269a);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }

    public static String h(Context context, String str) {
        w1.j jVar = f26951a;
        synchronized (jVar) {
            try {
                Locale localeC = u2.f.a(context.getResources().getConfiguration()).c(0);
                if (!localeC.equals(b)) {
                    jVar.clear();
                    b = localeC;
                }
                String str2 = (String) jVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesD = k9.i.d(context);
                if (resourcesD == null) {
                    return null;
                }
                int identifier = resourcesD.getIdentifier(str, InquiryField.StringField.TYPE, "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = resourcesD.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    jVar.put(str, string);
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
