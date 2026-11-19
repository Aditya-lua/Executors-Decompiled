package t2;

import android.net.Uri;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static String a(Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase("mailto") || scheme.equalsIgnoreCase("nfc")) {
                StringBuilder sb2 = new StringBuilder(64);
                sb2.append(scheme);
                sb2.append(':');
                if (schemeSpecificPart != null) {
                    for (int i10 = 0; i10 < schemeSpecificPart.length(); i10++) {
                        char cCharAt = schemeSpecificPart.charAt(i10);
                        if (cCharAt == '-' || cCharAt == '@' || cCharAt == '.') {
                            sb2.append(cCharAt);
                        } else {
                            sb2.append('x');
                        }
                    }
                }
                return sb2.toString();
            }
            if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("//");
                String host = uri.getHost();
                String str = BuildConfig.FLAVOR;
                sb3.append(host != null ? uri.getHost() : BuildConfig.FLAVOR);
                if (uri.getPort() != -1) {
                    str = ":" + uri.getPort();
                }
                sb3.append(str);
                sb3.append("/...");
                schemeSpecificPart = sb3.toString();
            }
        }
        StringBuilder sb4 = new StringBuilder(64);
        if (scheme != null) {
            sb4.append(scheme);
            sb4.append(':');
        }
        if (schemeSpecificPart != null) {
            sb4.append(schemeSpecificPart);
        }
        return sb4.toString();
    }
}
