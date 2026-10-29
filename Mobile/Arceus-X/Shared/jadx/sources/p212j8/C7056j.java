package p212j8;

import p071d8.C4472d;
import p071d8.InterfaceC4470b;

/* JADX INFO: renamed from: j8.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7056j implements InterfaceC4470b<AbstractC7046e> {

    /* JADX INFO: renamed from: j8.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C7056j f27628a = new C7056j();
    }

    /* JADX INFO: renamed from: a */
    public static C7056j m29777a() {
        return a.f27628a;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC7046e m29778c() {
        return (AbstractC7046e) C4472d.m22419c(AbstractC7048f.m29765d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC7046e get() {
        return m29778c();
    }
}
