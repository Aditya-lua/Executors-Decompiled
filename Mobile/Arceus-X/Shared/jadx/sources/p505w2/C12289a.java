package p505w2;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: renamed from: w2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C12289a {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC12294f f43531d;

    /* JADX INFO: renamed from: e */
    public static final String f43532e;

    /* JADX INFO: renamed from: f */
    public static final String f43533f;

    /* JADX INFO: renamed from: g */
    public static final C12289a f43534g;

    /* JADX INFO: renamed from: h */
    public static final C12289a f43535h;

    /* JADX INFO: renamed from: a */
    public final boolean f43536a;

    /* JADX INFO: renamed from: b */
    public final int f43537b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12294f f43538c;

    /* JADX INFO: renamed from: w2.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f43539a;

        /* JADX INFO: renamed from: b */
        public int f43540b;

        /* JADX INFO: renamed from: c */
        public InterfaceC12294f f43541c;

        public a() {
            m45656c(C12289a.m45646e(Locale.getDefault()));
        }

        /* JADX INFO: renamed from: b */
        public static C12289a m45654b(boolean z10) {
            return z10 ? C12289a.f43535h : C12289a.f43534g;
        }

        /* JADX INFO: renamed from: a */
        public C12289a m45655a() {
            return (this.f43540b == 2 && this.f43541c == C12289a.f43531d) ? m45654b(this.f43539a) : new C12289a(this.f43539a, this.f43540b, this.f43541c);
        }

        /* JADX INFO: renamed from: c */
        public final void m45656c(boolean z10) {
            this.f43539a = z10;
            this.f43541c = C12289a.f43531d;
            this.f43540b = 2;
        }
    }

    /* JADX INFO: renamed from: w2.a$b */
    public static class b {

        /* JADX INFO: renamed from: f */
        public static final byte[] f43542f = new byte[1792];

        /* JADX INFO: renamed from: a */
        public final CharSequence f43543a;

        /* JADX INFO: renamed from: b */
        public final boolean f43544b;

        /* JADX INFO: renamed from: c */
        public final int f43545c;

        /* JADX INFO: renamed from: d */
        public int f43546d;

        /* JADX INFO: renamed from: e */
        public char f43547e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f43542f[i10] = Character.getDirectionality(i10);
            }
        }

        public b(CharSequence charSequence, boolean z10) {
            this.f43543a = charSequence;
            this.f43544b = z10;
            this.f43545c = charSequence.length();
        }

        /* JADX INFO: renamed from: c */
        public static byte m45657c(char c10) {
            return c10 < 1792 ? f43542f[c10] : Character.getDirectionality(c10);
        }

        /* JADX INFO: renamed from: a */
        public byte m45658a() {
            char cCharAt = this.f43543a.charAt(this.f43546d - 1);
            this.f43547e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f43543a, this.f43546d);
                this.f43546d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f43546d--;
            byte bM45657c = m45657c(this.f43547e);
            if (!this.f43544b) {
                return bM45657c;
            }
            char c10 = this.f43547e;
            if (c10 == '>') {
                return m45664h();
            }
            return c10 == ';' ? m45662f() : bM45657c;
        }

        /* JADX INFO: renamed from: b */
        public byte m45659b() {
            char cCharAt = this.f43543a.charAt(this.f43546d);
            this.f43547e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f43543a, this.f43546d);
                this.f43546d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f43546d++;
            byte bM45657c = m45657c(this.f43547e);
            if (!this.f43544b) {
                return bM45657c;
            }
            char c10 = this.f43547e;
            if (c10 == '<') {
                return m45665i();
            }
            return c10 == '&' ? m45663g() : bM45657c;
        }

        /* JADX INFO: renamed from: d */
        public int m45660d() {
            this.f43546d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f43546d < this.f43545c && i10 == 0) {
                byte bM45659b = m45659b();
                if (bM45659b != 0) {
                    if (bM45659b == 1 || bM45659b == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (bM45659b != 9) {
                        switch (bM45659b) {
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
            while (this.f43546d > 0) {
                switch (m45658a()) {
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

        /* JADX INFO: renamed from: e */
        public int m45661e() {
            this.f43546d = this.f43545c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f43546d > 0) {
                    byte bM45658a = m45658a();
                    if (bM45658a == 0) {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bM45658a == 1 || bM45658a == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bM45658a != 9) {
                        switch (bM45658a) {
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

        /* JADX INFO: renamed from: f */
        public final byte m45662f() {
            char cCharAt;
            int i10 = this.f43546d;
            do {
                int i11 = this.f43546d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f43543a;
                int i12 = i11 - 1;
                this.f43546d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f43547e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f43546d = i10;
            this.f43547e = ';';
            return (byte) 13;
        }

        /* JADX INFO: renamed from: g */
        public final byte m45663g() {
            char cCharAt;
            do {
                int i10 = this.f43546d;
                if (i10 >= this.f43545c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f43543a;
                this.f43546d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f43547e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        /* JADX INFO: renamed from: h */
        public final byte m45664h() {
            char cCharAt;
            int i10 = this.f43546d;
            while (true) {
                int i11 = this.f43546d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f43543a;
                int i12 = i11 - 1;
                this.f43546d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f43547e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f43546d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f43543a;
                        int i14 = i13 - 1;
                        this.f43546d = i14;
                        cCharAt = charSequence2.charAt(i14);
                        this.f43547e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f43546d = i10;
            this.f43547e = '>';
            return (byte) 13;
        }

        /* JADX INFO: renamed from: i */
        public final byte m45665i() {
            char cCharAt;
            int i10 = this.f43546d;
            while (true) {
                int i11 = this.f43546d;
                if (i11 >= this.f43545c) {
                    this.f43546d = i10;
                    this.f43547e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f43543a;
                this.f43546d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f43547e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f43546d;
                        if (i12 >= this.f43545c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f43543a;
                        this.f43546d = i12 + 1;
                        cCharAt = charSequence2.charAt(i12);
                        this.f43547e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }
    }

    static {
        InterfaceC12294f interfaceC12294f = C12295g.f43563c;
        f43531d = interfaceC12294f;
        f43532e = Character.toString((char) 8206);
        f43533f = Character.toString((char) 8207);
        f43534g = new C12289a(false, 2, interfaceC12294f);
        f43535h = new C12289a(true, 2, interfaceC12294f);
    }

    public C12289a(boolean z10, int i10, InterfaceC12294f interfaceC12294f) {
        this.f43536a = z10;
        this.f43537b = i10;
        this.f43538c = interfaceC12294f;
    }

    /* JADX INFO: renamed from: a */
    public static int m45643a(CharSequence charSequence) {
        return new b(charSequence, false).m45660d();
    }

    /* JADX INFO: renamed from: b */
    public static int m45644b(CharSequence charSequence) {
        return new b(charSequence, false).m45661e();
    }

    /* JADX INFO: renamed from: c */
    public static C12289a m45645c() {
        return new a().m45655a();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m45646e(Locale locale) {
        return C12296h.m45685a(locale) == 1;
    }

    /* JADX INFO: renamed from: d */
    public boolean m45647d() {
        return (this.f43537b & 2) != 0;
    }

    /* JADX INFO: renamed from: f */
    public final String m45648f(CharSequence charSequence, InterfaceC12294f interfaceC12294f) {
        boolean zIsRtl = interfaceC12294f.isRtl(charSequence, 0, charSequence.length());
        if (!this.f43536a && (zIsRtl || m45644b(charSequence) == 1)) {
            return f43532e;
        }
        if (this.f43536a) {
            return (!zIsRtl || m45644b(charSequence) == -1) ? f43533f : "";
        }
        return "";
    }

    /* JADX INFO: renamed from: g */
    public final String m45649g(CharSequence charSequence, InterfaceC12294f interfaceC12294f) {
        boolean zIsRtl = interfaceC12294f.isRtl(charSequence, 0, charSequence.length());
        if (!this.f43536a && (zIsRtl || m45643a(charSequence) == 1)) {
            return f43532e;
        }
        if (this.f43536a) {
            return (!zIsRtl || m45643a(charSequence) == -1) ? f43533f : "";
        }
        return "";
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m45650h(CharSequence charSequence) {
        return m45651i(charSequence, this.f43538c, true);
    }

    /* JADX INFO: renamed from: i */
    public CharSequence m45651i(CharSequence charSequence, InterfaceC12294f interfaceC12294f, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = interfaceC12294f.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m45647d() && z10) {
            spannableStringBuilder.append((CharSequence) m45649g(charSequence, zIsRtl ? C12295g.f43562b : C12295g.f43561a));
        }
        if (zIsRtl != this.f43536a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) m45648f(charSequence, zIsRtl ? C12295g.f43562b : C12295g.f43561a));
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: j */
    public String m45652j(String str) {
        return m45653k(str, this.f43538c, true);
    }

    /* JADX INFO: renamed from: k */
    public String m45653k(String str, InterfaceC12294f interfaceC12294f, boolean z10) {
        if (str == null) {
            return null;
        }
        return m45651i(str, interfaceC12294f, z10).toString();
    }
}
