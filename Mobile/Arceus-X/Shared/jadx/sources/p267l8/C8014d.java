package p267l8;

import p071d8.C4472d;
import p071d8.InterfaceC4470b;

/* JADX INFO: renamed from: l8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8014d implements InterfaceC4470b<InterfaceC8011a> {

    /* JADX INFO: renamed from: l8.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C8014d f29968a = new C8014d();
    }

    /* JADX INFO: renamed from: a */
    public static C8014d m33098a() {
        return a.f29968a;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC8011a m33099c() {
        return (InterfaceC8011a) C4472d.m22419c(AbstractC8012b.m33093b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC8011a get() {
        return m33099c();
    }
}
