package p044c8;

import android.content.Context;
import ht.InterfaceC6564a;
import p071d8.InterfaceC4470b;
import p267l8.InterfaceC8011a;

/* JADX INFO: renamed from: c8.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1564j implements InterfaceC4470b<C1563i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6564a<Context> f6266a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6564a<InterfaceC8011a> f6267b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6564a<InterfaceC8011a> f6268c;

    public C1564j(InterfaceC6564a<Context> interfaceC6564a, InterfaceC6564a<InterfaceC8011a> interfaceC6564a2, InterfaceC6564a<InterfaceC8011a> interfaceC6564a3) {
        this.f6266a = interfaceC6564a;
        this.f6267b = interfaceC6564a2;
        this.f6268c = interfaceC6564a3;
    }

    /* JADX INFO: renamed from: a */
    public static C1564j m8167a(InterfaceC6564a<Context> interfaceC6564a, InterfaceC6564a<InterfaceC8011a> interfaceC6564a2, InterfaceC6564a<InterfaceC8011a> interfaceC6564a3) {
        return new C1564j(interfaceC6564a, interfaceC6564a2, interfaceC6564a3);
    }

    /* JADX INFO: renamed from: c */
    public static C1563i m8168c(Context context, InterfaceC8011a interfaceC8011a, InterfaceC8011a interfaceC8011a2) {
        return new C1563i(context, interfaceC8011a, interfaceC8011a2);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1563i get() {
        return m8168c(this.f6266a.get(), this.f6267b.get(), this.f6268c.get());
    }
}
