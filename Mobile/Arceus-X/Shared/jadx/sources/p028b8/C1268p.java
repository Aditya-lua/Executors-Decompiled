package p028b8;

import java.util.Set;
import p569y7.C13116c;
import p569y7.InterfaceC13120g;
import p569y7.InterfaceC13121h;
import p569y7.InterfaceC13122i;

/* JADX INFO: renamed from: b8.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1268p implements InterfaceC13122i {

    /* JADX INFO: renamed from: a */
    public final Set<C13116c> f5283a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1267o f5284b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1271s f5285c;

    public C1268p(Set<C13116c> set, AbstractC1267o abstractC1267o, InterfaceC1271s interfaceC1271s) {
        this.f5283a = set;
        this.f5284b = abstractC1267o;
        this.f5285c = interfaceC1271s;
    }

    @Override // p569y7.InterfaceC13122i
    /* JADX INFO: renamed from: a */
    public <T> InterfaceC13121h<T> mo7043a(String str, Class<T> cls, C13116c c13116c, InterfaceC13120g<T, byte[]> interfaceC13120g) {
        if (this.f5283a.contains(c13116c)) {
            return new C1270r(this.f5284b, str, c13116c, interfaceC13120g, this.f5285c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c13116c, this.f5283a));
    }
}
