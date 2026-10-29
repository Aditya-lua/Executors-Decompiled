package p169he;

/* JADX INFO: renamed from: he.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6374d {

    /* JADX INFO: renamed from: he.d$a */
    public static abstract class a extends AbstractC6374d {
    }

    /* JADX INFO: renamed from: he.d$b */
    public static final class b extends a {

        /* JADX INFO: renamed from: a */
        public final char f24253a;

        public b(char c10) {
            this.f24253a = c10;
        }

        @Override // p169he.AbstractC6374d
        /* JADX INFO: renamed from: d */
        public boolean mo27897d(char c10) {
            return c10 == this.f24253a;
        }

        public String toString() {
            String strM27895f = AbstractC6374d.m27895f(this.f24253a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strM27895f).length() + 18);
            sb2.append("CharMatcher.is('");
            sb2.append(strM27895f);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: he.d$c */
    public static abstract class c extends a {

        /* JADX INFO: renamed from: a */
        public final String f24254a;

        public c(String str) {
            this.f24254a = (String) C6384n.m27928l(str);
        }

        public final String toString() {
            return this.f24254a;
        }
    }

    /* JADX INFO: renamed from: he.d$d */
    public static final class d extends c {

        /* JADX INFO: renamed from: b */
        public static final d f24255b = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override // p169he.AbstractC6374d
        /* JADX INFO: renamed from: b */
        public int mo27896b(CharSequence charSequence, int i10) {
            C6384n.m27931o(i10, charSequence.length());
            return -1;
        }

        @Override // p169he.AbstractC6374d
        /* JADX INFO: renamed from: d */
        public boolean mo27897d(char c10) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC6374d m27893c(char c10) {
        return new b(c10);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC6374d m27894e() {
        return d.f24255b;
    }

    /* JADX INFO: renamed from: f */
    public static String m27895f(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* JADX INFO: renamed from: b */
    public int mo27896b(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        C6384n.m27931o(i10, length);
        while (i10 < length) {
            if (mo27897d(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo27897d(char c10);
}
