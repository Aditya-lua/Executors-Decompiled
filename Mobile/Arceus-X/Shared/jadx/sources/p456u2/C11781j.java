package p456u2;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: u2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C11781j {

    /* JADX INFO: renamed from: b */
    public static final C11781j f41502b = m44068a(new Locale[0]);

    /* JADX INFO: renamed from: a */
    public final InterfaceC11782k f41503a;

    /* JADX INFO: renamed from: u2.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final Locale[] f41504a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        /* JADX INFO: renamed from: a */
        public static Locale m44076a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: renamed from: u2.j$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static LocaleList m44077a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    public C11781j(InterfaceC11782k interfaceC11782k) {
        this.f41503a = interfaceC11782k;
    }

    /* JADX INFO: renamed from: a */
    public static C11781j m44068a(Locale... localeArr) {
        return m44071h(b.m44077a(localeArr));
    }

    /* JADX INFO: renamed from: b */
    public static C11781j m44069b(String str) {
        if (str == null || str.isEmpty()) {
            return m44070d();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.m44076a(strArrSplit[i10]);
        }
        return m44068a(localeArr);
    }

    /* JADX INFO: renamed from: d */
    public static C11781j m44070d() {
        return f41502b;
    }

    /* JADX INFO: renamed from: h */
    public static C11781j m44071h(LocaleList localeList) {
        return new C11781j(new C11783l(localeList));
    }

    /* JADX INFO: renamed from: c */
    public Locale m44072c(int i10) {
        return this.f41503a.get(i10);
    }

    /* JADX INFO: renamed from: e */
    public boolean m44073e() {
        return this.f41503a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11781j) && this.f41503a.equals(((C11781j) obj).f41503a);
    }

    /* JADX INFO: renamed from: f */
    public int m44074f() {
        return this.f41503a.size();
    }

    /* JADX INFO: renamed from: g */
    public String m44075g() {
        return this.f41503a.mo44078a();
    }

    public int hashCode() {
        return this.f41503a.hashCode();
    }

    public String toString() {
        return this.f41503a.toString();
    }
}
