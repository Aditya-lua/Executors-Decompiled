package mg;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f24222a = Charset.defaultCharset();
    public static final Charset b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f24223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f24224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f24225e;

    static {
        Charset charsetForName;
        Charset charsetForName2;
        Charset charsetForName3 = null;
        try {
            charsetForName = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        b = charsetForName;
        try {
            charsetForName2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charsetForName2 = null;
        }
        f24223c = charsetForName2;
        try {
            charsetForName3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        f24224d = charsetForName3;
        Charset charset = b;
        f24225e = (charset != null && charset.equals(f24222a)) || (charsetForName3 != null && charsetForName3.equals(f24222a));
    }
}
