package vn;

/* JADX INFO: renamed from: vn.d */
/* JADX INFO: loaded from: classes3.dex */
public class C12236d {
    /* JADX INFO: renamed from: a */
    public static int m45377a(char c10, CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static int m45378b(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '\n' || cCharAt == '\r') {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m45379c(CharSequence charSequence) {
        int length = charSequence.length();
        return m45385i(' ', charSequence, 0, length) != length;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m45380d(CharSequence charSequence) {
        return m45387k(charSequence, 0, charSequence.length()) == charSequence.length();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m45381e(CharSequence charSequence, int i10) {
        return Character.isLetter(Character.codePointAt(charSequence, i10));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m45382f(int i10) {
        switch (Character.getType(i10)) {
            default:
                if (i10 != 36 && i10 != 43 && i10 != 94 && i10 != 96 && i10 != 124 && i10 != 126) {
                    switch (i10) {
                        case 60:
                        case 61:
                        case 62:
                            break;
                        default:
                            return false;
                    }
                }
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                return true;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m45383g(CharSequence charSequence, int i10) {
        if (i10 >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i10);
        return cCharAt == '\t' || cCharAt == ' ';
    }

    /* JADX INFO: renamed from: h */
    public static boolean m45384h(int i10) {
        return i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32 || Character.getType(i10) == 12;
    }

    /* JADX INFO: renamed from: i */
    public static int m45385i(char c10, CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            if (charSequence.charAt(i10) != c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* JADX INFO: renamed from: j */
    public static int m45386j(char c10, CharSequence charSequence, int i10, int i11) {
        while (i10 >= i11) {
            if (charSequence.charAt(i10) != c10) {
                return i10;
            }
            i10--;
        }
        return i11 - 1;
    }

    /* JADX INFO: renamed from: k */
    public static int m45387k(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* JADX INFO: renamed from: l */
    public static int m45388l(CharSequence charSequence, int i10, int i11) {
        while (i10 >= i11) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i10;
            }
            i10--;
        }
        return i11 - 1;
    }
}
