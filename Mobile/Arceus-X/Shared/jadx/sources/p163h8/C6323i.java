package p163h8;

import android.content.Context;
import ht.InterfaceC6564a;
import p071d8.C4472d;
import p071d8.InterfaceC4470b;
import p190i8.AbstractC6665f;
import p190i8.InterfaceC6683x;
import p212j8.InterfaceC7044d;
import p267l8.InterfaceC8011a;

/* JADX INFO: renamed from: h8.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6323i implements InterfaceC4470b<InterfaceC6683x> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6564a<Context> f24050a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6564a<InterfaceC7044d> f24051b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6564a<AbstractC6665f> f24052c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6564a<InterfaceC8011a> f24053d;

    public C6323i(InterfaceC6564a<Context> interfaceC6564a, InterfaceC6564a<InterfaceC7044d> interfaceC6564a2, InterfaceC6564a<AbstractC6665f> interfaceC6564a3, InterfaceC6564a<InterfaceC8011a> interfaceC6564a4) {
        this.f24050a = interfaceC6564a;
        this.f24051b = interfaceC6564a2;
        this.f24052c = interfaceC6564a3;
        this.f24053d = interfaceC6564a4;
    }

    /* JADX INFO: renamed from: a */
    public static C6323i m27633a(InterfaceC6564a<Context> interfaceC6564a, InterfaceC6564a<InterfaceC7044d> interfaceC6564a2, InterfaceC6564a<AbstractC6665f> interfaceC6564a3, InterfaceC6564a<InterfaceC8011a> interfaceC6564a4) {
        return new C6323i(interfaceC6564a, interfaceC6564a2, interfaceC6564a3, interfaceC6564a4);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC6683x m27634c(Context context, InterfaceC7044d interfaceC7044d, AbstractC6665f abstractC6665f, InterfaceC8011a interfaceC8011a) {
        return (InterfaceC6683x) C4472d.m22419c(AbstractC6322h.m27632a(context, interfaceC7044d, abstractC6665f, interfaceC8011a), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC6683x get() {
        return m27634c(this.f24050a.get(), this.f24051b.get(), this.f24052c.get(), this.f24053d.get());
    }
}
