package p525wp;

import java.util.Set;
import p016an.InterfaceC0364a0;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: wp.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C12509h implements InterfaceC5830d<Set<InterfaceC0364a0<?>>> {

    /* JADX INFO: renamed from: wp.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C12509h f44708a = new C12509h();
    }

    /* JADX INFO: renamed from: a */
    public static C12509h m46840a() {
        return a.f44708a;
    }

    /* JADX INFO: renamed from: c */
    public static Set<InterfaceC0364a0<?>> m46841c() {
        return (Set) C5834h.m26194e(C12507f.m46834d());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<InterfaceC0364a0<?>> get() {
        return m46841c();
    }
}
