package p554xo;

import android.content.Context;
import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p502w.C12267c;

/* JADX INFO: renamed from: xo.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lxo/e;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lxo/a;", "c", "(Landroid/content/Context;)Lxo/a;", "", "url", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri;", "b", "(Ljava/lang/String;)Landroid/net/Uri;", "", "Ljava/util/List;", "CHROME_PACKAGES", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12873e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12873e f45728a = new C12873e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<String> CHROME_PACKAGES = C7697o.m31878d("com.android.chrome");

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m47905a(@NotNull String url) throws UnsupportedEncodingException {
        String host;
        Intrinsics.checkNotNullParameter(url, "url");
        Uri uriM47906b = m47906b(url);
        if (uriM47906b == null || (host = uriM47906b.getHost()) == null) {
            return "withpersona.com";
        }
        int port = uriM47906b.getPort();
        if (port == -1) {
            return host;
        }
        return host + ":" + port;
    }

    /* JADX INFO: renamed from: b */
    public final Uri m47906b(String url) throws UnsupportedEncodingException {
        String queryParameter = Uri.parse(url).getQueryParameter("redirect_uri");
        if (queryParameter == null) {
            return null;
        }
        String strDecode = URLDecoder.decode(queryParameter, Charsets.UTF_8.name());
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        return Uri.parse(strDecode);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final BrowserSelection m47907c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strM45519d = C12267c.m45519d(context, CHROME_PACKAGES, true);
        if (strM45519d != null) {
            return new BrowserSelection(strM45519d, C12267c.m45520e(context, strM45519d));
        }
        String strM45518c = C12267c.m45518c(context, null);
        return new BrowserSelection(strM45518c, strM45518c != null && C12267c.m45520e(context, strM45518c));
    }
}
