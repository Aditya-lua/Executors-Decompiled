package p267l8;

import p071d8.C4472d;
import p071d8.InterfaceC4470b;

/* JADX INFO: renamed from: l8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8013c implements InterfaceC4470b<InterfaceC8011a> {

    /* JADX INFO: renamed from: l8.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C8013c f29967a = new C8013c();
    }

    /* JADX INFO: renamed from: a */
    public static C8013c m33094a() {
        return a.f29967a;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC8011a m33095b() {
        return (InterfaceC8011a) C4472d.m22419c(AbstractC8012b.m33092a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8011a get() {
        return m33095b();
    }
}
