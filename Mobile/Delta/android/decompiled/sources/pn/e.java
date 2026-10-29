package pn;

import com.appsflyer.R;
import sn.i;

/* JADX INFO: loaded from: classes3.dex */
public class e {
    public static boolean a(char c10) {
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
                                    case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                    case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static boolean b(i iVar) {
        char cL;
        if (!iVar.e()) {
            return false;
        }
        if (!iVar.i('<')) {
            return c(iVar);
        }
        while (iVar.e() && (cL = iVar.l()) != '\n' && cL != '<') {
            if (cL == '>') {
                iVar.h();
                return true;
            }
            if (cL != '\\') {
                iVar.h();
            } else {
                iVar.h();
                if (a(iVar.l())) {
                    iVar.h();
                }
            }
        }
        return false;
    }

    public static boolean c(i iVar) {
        int i10 = 0;
        boolean z10 = true;
        while (iVar.e()) {
            char cL = iVar.l();
            if (cL == ' ') {
                return !z10;
            }
            if (cL == '\\') {
                iVar.h();
                if (a(iVar.l())) {
                    iVar.h();
                }
            } else if (cL == '(') {
                i10++;
                if (i10 > 32) {
                    return false;
                }
                iVar.h();
            } else if (cL != ')') {
                if (Character.isISOControl(cL)) {
                    return !z10;
                }
                iVar.h();
            } else {
                if (i10 == 0) {
                    return true;
                }
                i10--;
                iVar.h();
            }
            z10 = false;
        }
        return true;
    }

    public static boolean d(i iVar) {
        while (iVar.e()) {
            switch (iVar.l()) {
                case '[':
                    return false;
                case '\\':
                    iVar.h();
                    if (a(iVar.l())) {
                        iVar.h();
                    }
                    break;
                case ']':
                    return true;
                default:
                    iVar.h();
                    break;
            }
        }
        return true;
    }

    public static boolean e(i iVar) {
        if (!iVar.e()) {
            return false;
        }
        char cL = iVar.l();
        char c10 = '\"';
        if (cL != '\"') {
            c10 = '\'';
            if (cL != '\'') {
                if (cL != '(') {
                    return false;
                }
                c10 = ')';
            }
        }
        iVar.h();
        if (!f(iVar, c10) || !iVar.e()) {
            return false;
        }
        iVar.h();
        return true;
    }

    public static boolean f(i iVar, char c10) {
        while (iVar.e()) {
            char cL = iVar.l();
            if (cL == '\\') {
                iVar.h();
                if (a(iVar.l())) {
                    iVar.h();
                }
            } else {
                if (cL == c10) {
                    return true;
                }
                if (c10 == ')' && cL == '(') {
                    return false;
                }
                iVar.h();
            }
        }
        return true;
    }
}
