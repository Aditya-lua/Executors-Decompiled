package he;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    public static abstract class a extends d {
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f19400a;

        public b(char c10) {
            this.f19400a = c10;
        }

        @Override // he.d
        public boolean d(char c10) {
            return c10 == this.f19400a;
        }

        public String toString() {
            String strF = d.f(this.f19400a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strF).length() + 18);
            sb2.append("CharMatcher.is('");
            sb2.append(strF);
            sb2.append("')");
            return sb2.toString();
        }
    }

    public static abstract class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19401a;

        public c(String str) {
            this.f19401a = (String) n.l(str);
        }

        public final String toString() {
            return this.f19401a;
        }
    }

    /* JADX INFO: renamed from: he.d$d, reason: collision with other inner class name */
    public static final class C0342d extends c {
        public static final C0342d b = new C0342d();

        public C0342d() {
            super("CharMatcher.none()");
        }

        @Override // he.d
        public int b(CharSequence charSequence, int i10) {
            n.o(i10, charSequence.length());
            return -1;
        }

        @Override // he.d
        public boolean d(char c10) {
            return false;
        }
    }

    public static d c(char c10) {
        return new b(c10);
    }

    public static d e() {
        return C0342d.b;
    }

    public static String f(char c10) {
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

    public int b(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        n.o(i10, length);
        while (i10 < length) {
            if (d(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean d(char c10);
}
