package io;

import com.withpersona.sdk2.inquiry.governmentid.C3550k;
import java.util.Set;
import p016an.InterfaceC0364a0;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p251ko.C7667z;

/* JADX INFO: renamed from: io.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C6888m implements InterfaceC5830d<Set<InterfaceC0364a0<?>>> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C7667z> f26991a;

    public C6888m(InterfaceC5835i<C7667z> interfaceC5835i) {
        this.f26991a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C6888m m29325a(InterfaceC5835i<C7667z> interfaceC5835i) {
        return new C6888m(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static Set<InterfaceC0364a0<?>> m29326c(C7667z c7667z) {
        return (Set) C5834h.m26194e(C3550k.m17564b(c7667z));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<InterfaceC0364a0<?>> get() {
        return m29326c(this.f26991a.get());
    }
}
