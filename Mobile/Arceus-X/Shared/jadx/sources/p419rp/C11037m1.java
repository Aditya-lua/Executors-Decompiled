package p419rp;

import java.util.Set;
import p016an.InterfaceC0364a0;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: rp.m1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11037m1 implements InterfaceC5830d<Set<InterfaceC0364a0<?>>> {

    /* JADX INFO: renamed from: rp.m1$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C11037m1 f39009a = new C11037m1();
    }

    /* JADX INFO: renamed from: a */
    public static C11037m1 m41732a() {
        return a.f39009a;
    }

    /* JADX INFO: renamed from: c */
    public static Set<InterfaceC0364a0<?>> m41733c() {
        return (Set) C5834h.m26194e(InterfaceC11031k1.m41730a());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<InterfaceC0364a0<?>> get() {
        return m41733c();
    }
}
