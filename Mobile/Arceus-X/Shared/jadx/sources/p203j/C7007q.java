package p203j;

import java.util.LinkedHashSet;
import java.util.Locale;
import p456u2.C11781j;

/* JADX INFO: renamed from: j.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7007q {
    /* JADX INFO: renamed from: a */
    public static C11781j m29630a(C11781j c11781j, C11781j c11781j2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < c11781j.m44074f() + c11781j2.m44074f()) {
            Locale localeM44072c = i10 < c11781j.m44074f() ? c11781j.m44072c(i10) : c11781j2.m44072c(i10 - c11781j.m44074f());
            if (localeM44072c != null) {
                linkedHashSet.add(localeM44072c);
            }
            i10++;
        }
        return C11781j.m44068a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* JADX INFO: renamed from: b */
    public static C11781j m29631b(C11781j c11781j, C11781j c11781j2) {
        return (c11781j == null || c11781j.m44073e()) ? C11781j.m44070d() : m29630a(c11781j, c11781j2);
    }
}
