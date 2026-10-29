package gp;

import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import java.util.Set;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: gp.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C6192l implements InterfaceC5830d<Set<Object>> {

    /* JADX INFO: renamed from: gp.l$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C6192l f23602a = new C6192l();
    }

    /* JADX INFO: renamed from: a */
    public static C6192l m27279a() {
        return a.f23602a;
    }

    /* JADX INFO: renamed from: c */
    public static Set<Object> m27280c() {
        return (Set) C5834h.m26194e(C3707f.m18753f());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<Object> get() {
        return m27280c();
    }
}
