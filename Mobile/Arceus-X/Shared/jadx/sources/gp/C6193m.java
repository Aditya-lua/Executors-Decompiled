package gp;

import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import java.util.Set;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p471um.AbstractC11873h;

/* JADX INFO: renamed from: gp.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C6193m implements InterfaceC5830d<Set<AbstractC11873h.e>> {

    /* JADX INFO: renamed from: gp.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C6193m f23603a = new C6193m();
    }

    /* JADX INFO: renamed from: a */
    public static C6193m m27282a() {
        return a.f23603a;
    }

    /* JADX INFO: renamed from: c */
    public static Set<AbstractC11873h.e> m27283c() {
        return (Set) C5834h.m26194e(C3707f.m18755h());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<AbstractC11873h.e> get() {
        return m27283c();
    }
}
