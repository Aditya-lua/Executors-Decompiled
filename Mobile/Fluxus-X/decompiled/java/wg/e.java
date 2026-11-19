package wg;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f35797a = Charset.defaultCharset();
    public static final Charset b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f35798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f35799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f35800e;

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
        f35798c = charsetForName2;
        try {
            charsetForName3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        f35799d = charsetForName3;
        Charset charset = b;
        f35800e = (charset != null && charset.equals(f35797a)) || (charsetForName3 != null && charsetForName3.equals(f35797a));
    }
}
