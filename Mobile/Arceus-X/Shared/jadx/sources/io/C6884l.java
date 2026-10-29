package io;

import com.withpersona.sdk2.inquiry.governmentid.C3550k;
import java.util.Set;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p471um.AbstractC11873h;

/* JADX INFO: renamed from: io.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C6884l implements InterfaceC5830d<Set<AbstractC11873h.e>> {

    /* JADX INFO: renamed from: io.l$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C6884l f26987a = new C6884l();
    }

    /* JADX INFO: renamed from: a */
    public static C6884l m29322a() {
        return a.f26987a;
    }

    /* JADX INFO: renamed from: c */
    public static Set<AbstractC11873h.e> m29323c() {
        return (Set) C5834h.m26194e(C3550k.m17563a());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<AbstractC11873h.e> get() {
        return m29323c();
    }
}
