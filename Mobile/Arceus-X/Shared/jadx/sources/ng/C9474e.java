package ng;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: ng.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C9474e {

    /* JADX INFO: renamed from: a */
    public static final Charset f34078a = Charset.defaultCharset();

    /* JADX INFO: renamed from: b */
    public static final Charset f34079b;

    /* JADX INFO: renamed from: c */
    public static final Charset f34080c;

    /* JADX INFO: renamed from: d */
    public static final Charset f34081d;

    /* JADX INFO: renamed from: e */
    public static final boolean f34082e;

    static {
        Charset charsetForName;
        Charset charsetForName2;
        Charset charsetForName3 = null;
        try {
            charsetForName = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        f34079b = charsetForName;
        try {
            charsetForName2 = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
            charsetForName2 = null;
        }
        f34080c = charsetForName2;
        try {
            charsetForName3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        f34081d = charsetForName3;
        Charset charset = f34079b;
        f34082e = (charset != null && charset.equals(f34078a)) || (charsetForName3 != null && charsetForName3.equals(f34078a));
    }
}
