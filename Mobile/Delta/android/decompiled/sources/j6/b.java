package j6;

import android.net.Uri;
import backtraceio.library.logger.BacktraceLogger;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final transient String f21098e = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21099a = "json";
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f21101d;

    public b(String str, String str2) {
        this.b = str;
        this.f21100c = str2;
    }

    public final Uri a() {
        return this.f21101d;
    }

    public final String b() {
        return this.b;
    }

    public Uri c() {
        String strReplace;
        String string = f().toString();
        if (string.contains("format=json")) {
            strReplace = string.replace("format=json", "format=minidump");
        } else {
            if (!string.contains("/json")) {
                return null;
            }
            strReplace = string.replace("/json", "/minidump");
        }
        return Uri.parse(strReplace);
    }

    public final Uri d() {
        String strB = b();
        return Uri.parse(String.format("%s%spost?format=%s&token=%s", strB, strB.endsWith("/") ? "" : "/", "json", e()));
    }

    public String e() {
        String str = this.f21100c;
        if (str != null) {
            return str;
        }
        String string = f().toString();
        int iLastIndexOf = string.lastIndexOf("/");
        if (string.contains("submit.backtrace.io")) {
            int i10 = iLastIndexOf - 64;
            if (i10 < 0) {
                return null;
            }
            return string.substring(i10, iLastIndexOf);
        }
        int iIndexOf = string.indexOf("token=");
        if (iIndexOf == -1) {
            return null;
        }
        return string.substring(iIndexOf + 6, iIndexOf + 70);
    }

    public Uri f() {
        Uri uriA = a();
        return uriA != null ? uriA : d();
    }

    public String g() {
        String string = f().toString();
        if (string.startsWith("https://submit.backtrace.io/")) {
            int iIndexOf = string.indexOf(47, 28);
            if (iIndexOf != -1) {
                return string.substring(28, iIndexOf);
            }
            BacktraceLogger.w(f21098e, "Missed universe in server URL: " + string);
            return null;
        }
        if (string.indexOf("backtrace.io") != -1) {
            Uri uri = Uri.parse(string);
            return uri.getHost().substring(0, uri.getHost().indexOf("."));
        }
        BacktraceLogger.w(f21098e, "Missed universe in server URL: " + string);
        return null;
    }
}
