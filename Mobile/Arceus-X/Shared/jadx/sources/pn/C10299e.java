package pn;

import com.appsflyer.C1759R;
import sn.C11425i;

/* JADX INFO: renamed from: pn.e */
/* JADX INFO: loaded from: classes3.dex */
public class C10299e {
    /* JADX INFO: renamed from: a */
    public static boolean m39568a(char c10) {
        switch (c10) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (c10) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (c10) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (c10) {
                                    case '{':
                                    case C1759R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                    case C1759R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m39569b(C11425i c11425i) {
        char cM42805l;
        if (!c11425i.m42799e()) {
            return false;
        }
        if (!c11425i.m42803i('<')) {
            return m39570c(c11425i);
        }
        while (c11425i.m42799e() && (cM42805l = c11425i.m42805l()) != '\n' && cM42805l != '<') {
            if (cM42805l == '>') {
                c11425i.m42802h();
                return true;
            }
            if (cM42805l != '\\') {
                c11425i.m42802h();
            } else {
                c11425i.m42802h();
                if (m39568a(c11425i.m42805l())) {
                    c11425i.m42802h();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m39570c(C11425i c11425i) {
        int i10 = 0;
        boolean z10 = true;
        while (c11425i.m42799e()) {
            char cM42805l = c11425i.m42805l();
            if (cM42805l == ' ') {
                return !z10;
            }
            if (cM42805l == '\\') {
                c11425i.m42802h();
                if (m39568a(c11425i.m42805l())) {
                    c11425i.m42802h();
                }
            } else if (cM42805l == '(') {
                i10++;
                if (i10 > 32) {
                    return false;
                }
                c11425i.m42802h();
            } else if (cM42805l != ')') {
                if (Character.isISOControl(cM42805l)) {
                    return !z10;
                }
                c11425i.m42802h();
            } else {
                if (i10 == 0) {
                    return true;
                }
                i10--;
                c11425i.m42802h();
            }
            z10 = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m39571d(C11425i c11425i) {
        while (c11425i.m42799e()) {
            switch (c11425i.m42805l()) {
                case '[':
                    return false;
                case '\\':
                    c11425i.m42802h();
                    if (m39568a(c11425i.m42805l())) {
                        c11425i.m42802h();
                    }
                    break;
                case ']':
                    return true;
                default:
                    c11425i.m42802h();
                    break;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m39572e(C11425i c11425i) {
        if (!c11425i.m42799e()) {
            return false;
        }
        char cM42805l = c11425i.m42805l();
        char c10 = '\"';
        if (cM42805l != '\"') {
            c10 = '\'';
            if (cM42805l != '\'') {
                if (cM42805l != '(') {
                    return false;
                }
                c10 = ')';
            }
        }
        c11425i.m42802h();
        if (!m39573f(c11425i, c10) || !c11425i.m42799e()) {
            return false;
        }
        c11425i.m42802h();
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m39573f(C11425i c11425i, char c10) {
        while (c11425i.m42799e()) {
            char cM42805l = c11425i.m42805l();
            if (cM42805l == '\\') {
                c11425i.m42802h();
                if (m39568a(c11425i.m42805l())) {
                    c11425i.m42802h();
                }
            } else {
                if (cM42805l == c10) {
                    return true;
                }
                if (c10 == ')' && cM42805l == '(') {
                    return false;
                }
                c11425i.m42802h();
            }
        }
        return true;
    }
}
