package pn;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: pn.c */
/* JADX INFO: loaded from: classes3.dex */
public class C10297c {

    /* JADX INFO: renamed from: a */
    public static final Pattern f37005a = Pattern.compile("[\\\\&]");

    /* JADX INFO: renamed from: b */
    public static final Pattern f37006b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: c */
    public static final Pattern f37007c = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");

    /* JADX INFO: renamed from: d */
    public static final char[] f37008d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: e */
    public static final Pattern f37009e = Pattern.compile("[ \t\r\n]+");

    /* JADX INFO: renamed from: f */
    public static final a f37010f = new a() { // from class: pn.a
        @Override // pn.C10297c.a
        /* JADX INFO: renamed from: a */
        public final void mo39560a(String str, StringBuilder sb2) {
            C10297c.m39561a(str, sb2);
        }
    };

    /* JADX INFO: renamed from: g */
    public static final a f37011g = new a() { // from class: pn.b
        @Override // pn.C10297c.a
        /* JADX INFO: renamed from: a */
        public final void mo39560a(String str, StringBuilder sb2) {
            C10297c.m39562b(str, sb2);
        }
    };

    /* JADX INFO: renamed from: pn.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo39560a(String str, StringBuilder sb2);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m39561a(String str, StringBuilder sb2) {
        if (str.charAt(0) == '\\') {
            sb2.append((CharSequence) str, 1, str.length());
        } else {
            sb2.append(C10298d.m39566a(str));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m39562b(String str, StringBuilder sb2) {
        if (str.startsWith("%")) {
            if (str.length() == 3) {
                sb2.append(str);
                return;
            } else {
                sb2.append("%25");
                sb2.append((CharSequence) str, 1, str.length());
                return;
            }
        }
        for (byte b : str.getBytes(StandardCharsets.UTF_8)) {
            sb2.append('%');
            char[] cArr = f37008d;
            sb2.append(cArr[(b >> 4) & 15]);
            sb2.append(cArr[b & 15]);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m39563c(String str) {
        String strTrim = str.trim();
        Locale locale = Locale.ROOT;
        return f37009e.matcher(strTrim.toLowerCase(locale).toUpperCase(locale)).replaceAll(" ");
    }

    /* JADX INFO: renamed from: d */
    public static String m39564d(Pattern pattern, String str, a aVar) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb2.append((CharSequence) str, iEnd, matcher.start());
            aVar.mo39560a(matcher.group(), sb2);
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb2.append((CharSequence) str, iEnd, str.length());
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m39565e(String str) {
        return f37005a.matcher(str).find() ? m39564d(f37006b, str, f37010f) : str;
    }
}
