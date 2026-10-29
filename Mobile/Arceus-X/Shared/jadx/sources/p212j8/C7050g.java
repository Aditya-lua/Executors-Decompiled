package p212j8;

import p071d8.C4472d;
import p071d8.InterfaceC4470b;

/* JADX INFO: renamed from: j8.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7050g implements InterfaceC4470b<String> {

    /* JADX INFO: renamed from: j8.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C7050g f27622a = new C7050g();
    }

    /* JADX INFO: renamed from: a */
    public static C7050g m29766a() {
        return a.f27622a;
    }

    /* JADX INFO: renamed from: b */
    public static String m29767b() {
        return (String) C4472d.m22419c(AbstractC7048f.m29762a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m29767b();
    }
}
