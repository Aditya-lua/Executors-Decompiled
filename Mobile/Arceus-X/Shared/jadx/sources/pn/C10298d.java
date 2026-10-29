package pn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: pn.d */
/* JADX INFO: loaded from: classes3.dex */
public class C10298d {

    /* JADX INFO: renamed from: a */
    public static final Map<String, String> f37012a = m39567b();

    /* JADX INFO: renamed from: a */
    public static String m39566a(String str) {
        int i10;
        if (str.startsWith("&") && str.endsWith(";")) {
            String strSubstring = str.substring(1, str.length() - 1);
            if (strSubstring.startsWith("#")) {
                String strSubstring2 = strSubstring.substring(1);
                if (strSubstring2.startsWith("x") || strSubstring2.startsWith("X")) {
                    strSubstring2 = strSubstring2.substring(1);
                    i10 = 16;
                } else {
                    i10 = 10;
                }
                try {
                    int i11 = Integer.parseInt(strSubstring2, i10);
                    return i11 == 0 ? "�" : new String(Character.toChars(i11));
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            }
            String str2 = f37012a.get(strSubstring);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, String> m39567b() {
        HashMap map = new HashMap();
        InputStream resourceAsStream = C10298d.class.getResourceAsStream("/com/withpersona/sdk2/commonmark/internal/util/entities.txt");
        if (resourceAsStream != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!line.isEmpty()) {
                            int iIndexOf = line.indexOf("=");
                            map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                        }
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                    throw new IllegalStateException("Failed reading data for HTML named character references", e);
                }
                bufferedReader.close();
            } catch (IOException e10) {
                throw new IllegalStateException("Failed reading data for HTML named character references", e10);
            }
        }
        map.put("NewLine", "\n");
        return map;
    }
}
