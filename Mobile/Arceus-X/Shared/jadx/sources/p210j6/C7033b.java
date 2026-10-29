package p210j6;

import android.net.Uri;
import backtraceio.library.logger.BacktraceLogger;

/* JADX INFO: renamed from: j6.b */
/* JADX INFO: loaded from: classes.dex */
public class C7033b {

    /* JADX INFO: renamed from: e */
    public static final transient String f27593e = "b";

    /* JADX INFO: renamed from: a */
    public final String f27594a = "json";

    /* JADX INFO: renamed from: b */
    public String f27595b;

    /* JADX INFO: renamed from: c */
    public String f27596c;

    /* JADX INFO: renamed from: d */
    public Uri f27597d;

    public C7033b(String str, String str2) {
        this.f27595b = str;
        this.f27596c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final Uri m29726a() {
        return this.f27597d;
    }

    /* JADX INFO: renamed from: b */
    public final String m29727b() {
        return this.f27595b;
    }

    /* JADX INFO: renamed from: c */
    public Uri m29728c() {
        String strReplace;
        String string = m29731f().toString();
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

    /* JADX INFO: renamed from: d */
    public final Uri m29729d() {
        String strM29727b = m29727b();
        return Uri.parse(String.format("%s%spost?format=%s&token=%s", strM29727b, strM29727b.endsWith("/") ? "" : "/", "json", m29730e()));
    }

    /* JADX INFO: renamed from: e */
    public String m29730e() {
        String str = this.f27596c;
        if (str != null) {
            return str;
        }
        String string = m29731f().toString();
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

    /* JADX INFO: renamed from: f */
    public Uri m29731f() {
        Uri uriM29726a = m29726a();
        return uriM29726a != null ? uriM29726a : m29729d();
    }

    /* JADX INFO: renamed from: g */
    public String m29732g() {
        String string = m29731f().toString();
        if (string.startsWith("https://submit.backtrace.io/")) {
            int iIndexOf = string.indexOf(47, 28);
            if (iIndexOf != -1) {
                return string.substring(28, iIndexOf);
            }
            BacktraceLogger.m7083w(f27593e, "Missed universe in server URL: " + string);
            return null;
        }
        if (string.indexOf("backtrace.io") != -1) {
            Uri uri = Uri.parse(string);
            return uri.getHost().substring(0, uri.getHost().indexOf("."));
        }
        BacktraceLogger.m7083w(f27593e, "Missed universe in server URL: " + string);
        return null;
    }
}
