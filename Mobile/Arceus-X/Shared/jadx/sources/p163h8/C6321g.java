package p163h8;

import ht.InterfaceC6564a;
import p071d8.C4472d;
import p071d8.InterfaceC4470b;
import p190i8.AbstractC6665f;
import p267l8.InterfaceC8011a;

/* JADX INFO: renamed from: h8.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6321g implements InterfaceC4470b<AbstractC6665f> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6564a<InterfaceC8011a> f24049a;

    public C6321g(InterfaceC6564a<InterfaceC8011a> interfaceC6564a) {
        this.f24049a = interfaceC6564a;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC6665f m27629a(InterfaceC8011a interfaceC8011a) {
        return (AbstractC6665f) C4472d.m22419c(AbstractC6320f.m27628a(interfaceC8011a), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX INFO: renamed from: b */
    public static C6321g m27630b(InterfaceC6564a<InterfaceC8011a> interfaceC6564a) {
        return new C6321g(interfaceC6564a);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC6665f get() {
        return m27629a(this.f24049a.get());
    }
}
