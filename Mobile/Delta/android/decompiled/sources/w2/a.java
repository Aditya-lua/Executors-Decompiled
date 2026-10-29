package w2;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f33626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f33627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f33628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f33629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f33630h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33631a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f33632c;

    /* JADX INFO: renamed from: w2.a$a, reason: collision with other inner class name */
    public static final class C0615a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f33633a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f f33634c;

        public C0615a() {
            c(a.e(Locale.getDefault()));
        }

        public static a b(boolean z10) {
            return z10 ? a.f33630h : a.f33629g;
        }

        public a a() {
            return (this.b == 2 && this.f33634c == a.f33626d) ? b(this.f33633a) : new a(this.f33633a, this.b, this.f33634c);
        }

        public final void c(boolean z10) {
            this.f33633a = z10;
            this.f33634c = a.f33626d;
            this.b = 2;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte[] f33635f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f33636a;
        public final boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f33637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f33638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public char f33639e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f33635f[i10] = Character.getDirectionality(i10);
            }
        }

        public b(CharSequence charSequence, boolean z10) {
            this.f33636a = charSequence;
            this.b = z10;
            this.f33637c = charSequence.length();
        }

        public static byte c(char c10) {
            return c10 < 1792 ? f33635f[c10] : Character.getDirectionality(c10);
        }

        public byte a() {
            char cCharAt = this.f33636a.charAt(this.f33638d - 1);
            this.f33639e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f33636a, this.f33638d);
                this.f33638d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f33638d--;
            byte bC = c(this.f33639e);
            if (!this.b) {
                return bC;
            }
            char c10 = this.f33639e;
            if (c10 == '>') {
                return h();
            }
            return c10 == ';' ? f() : bC;
        }

        public byte b() {
            char cCharAt = this.f33636a.charAt(this.f33638d);
            this.f33639e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f33636a, this.f33638d);
                this.f33638d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f33638d++;
            byte bC = c(this.f33639e);
            if (!this.b) {
                return bC;
            }
            char c10 = this.f33639e;
            if (c10 == '<') {
                return i();
            }
            return c10 == '&' ? g() : bC;
        }

        public int d() {
            this.f33638d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f33638d < this.f33637c && i10 == 0) {
                byte b = b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f33638d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                    default:
                        continue;
                }
                i12--;
            }
            return 0;
        }

        public int e() {
            this.f33638d = this.f33637c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f33638d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }

        public final byte f() {
            char cCharAt;
            int i10 = this.f33638d;
            do {
                int i11 = this.f33638d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f33636a;
                int i12 = i11 - 1;
                this.f33638d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f33639e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f33638d = i10;
            this.f33639e = ';';
            return (byte) 13;
        }

        public final byte g() {
            char cCharAt;
            do {
                int i10 = this.f33638d;
                if (i10 >= this.f33637c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f33636a;
                this.f33638d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f33639e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        public final byte h() {
            char cCharAt;
            int i10 = this.f33638d;
            while (true) {
                int i11 = this.f33638d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f33636a;
                int i12 = i11 - 1;
                this.f33638d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f33639e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f33638d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f33636a;
                        int i14 = i13 - 1;
                        this.f33638d = i14;
                        cCharAt = charSequence2.charAt(i14);
                        this.f33639e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f33638d = i10;
            this.f33639e = '>';
            return (byte) 13;
        }

        public final byte i() {
            char cCharAt;
            int i10 = this.f33638d;
            while (true) {
                int i11 = this.f33638d;
                if (i11 >= this.f33637c) {
                    this.f33638d = i10;
                    this.f33639e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f33636a;
                this.f33638d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f33639e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f33638d;
                        if (i12 >= this.f33637c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f33636a;
                        this.f33638d = i12 + 1;
                        cCharAt = charSequence2.charAt(i12);
                        this.f33639e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }
    }

    static {
        f fVar = g.f33651c;
        f33626d = fVar;
        f33627e = Character.toString((char) 8206);
        f33628f = Character.toString((char) 8207);
        f33629g = new a(false, 2, fVar);
        f33630h = new a(true, 2, fVar);
    }

    public a(boolean z10, int i10, f fVar) {
        this.f33631a = z10;
        this.b = i10;
        this.f33632c = fVar;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0615a().a();
    }

    public static boolean e(Locale locale) {
        return h.a(locale) == 1;
    }

    public boolean d() {
        return (this.b & 2) != 0;
    }

    public final String f(CharSequence charSequence, f fVar) {
        boolean zIsRtl = fVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f33631a && (zIsRtl || b(charSequence) == 1)) {
            return f33627e;
        }
        if (this.f33631a) {
            return (!zIsRtl || b(charSequence) == -1) ? f33628f : "";
        }
        return "";
    }

    public final String g(CharSequence charSequence, f fVar) {
        boolean zIsRtl = fVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f33631a && (zIsRtl || a(charSequence) == 1)) {
            return f33627e;
        }
        if (this.f33631a) {
            return (!zIsRtl || a(charSequence) == -1) ? f33628f : "";
        }
        return "";
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f33632c, true);
    }

    public CharSequence i(CharSequence charSequence, f fVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = fVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zIsRtl ? g.b : g.f33650a));
        }
        if (zIsRtl != this.f33631a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zIsRtl ? g.b : g.f33650a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f33632c, true);
    }

    public String k(String str, f fVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, fVar, z10).toString();
    }
}
