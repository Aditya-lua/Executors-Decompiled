package p190i8;

import android.content.Context;
import ht.InterfaceC6564a;
import java.util.concurrent.Executor;
import p044c8.InterfaceC1559e;
import p071d8.InterfaceC4470b;
import p212j8.InterfaceC7042c;
import p212j8.InterfaceC7044d;
import p241k8.InterfaceC7490b;
import p267l8.InterfaceC8011a;

/* JADX INFO: renamed from: i8.s */
/* JADX INFO: loaded from: classes.dex */
public final class C6678s implements InterfaceC4470b<C6677r> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6564a<Context> f25744a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6564a<InterfaceC1559e> f25745b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6564a<InterfaceC7044d> f25746c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6564a<InterfaceC6683x> f25747d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC6564a<Executor> f25748e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC6564a<InterfaceC7490b> f25749f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6564a<InterfaceC8011a> f25750g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC6564a<InterfaceC8011a> f25751h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC6564a<InterfaceC7042c> f25752i;

    public C6678s(InterfaceC6564a<Context> interfaceC6564a, InterfaceC6564a<InterfaceC1559e> interfaceC6564a2, InterfaceC6564a<InterfaceC7044d> interfaceC6564a3, InterfaceC6564a<InterfaceC6683x> interfaceC6564a4, InterfaceC6564a<Executor> interfaceC6564a5, InterfaceC6564a<InterfaceC7490b> interfaceC6564a6, InterfaceC6564a<InterfaceC8011a> interfaceC6564a7, InterfaceC6564a<InterfaceC8011a> interfaceC6564a8, InterfaceC6564a<InterfaceC7042c> interfaceC6564a9) {
        this.f25744a = interfaceC6564a;
        this.f25745b = interfaceC6564a2;
        this.f25746c = interfaceC6564a3;
        this.f25747d = interfaceC6564a4;
        this.f25748e = interfaceC6564a5;
        this.f25749f = interfaceC6564a6;
        this.f25750g = interfaceC6564a7;
        this.f25751h = interfaceC6564a8;
        this.f25752i = interfaceC6564a9;
    }

    /* JADX INFO: renamed from: a */
    public static C6678s m28765a(InterfaceC6564a<Context> interfaceC6564a, InterfaceC6564a<InterfaceC1559e> interfaceC6564a2, InterfaceC6564a<InterfaceC7044d> interfaceC6564a3, InterfaceC6564a<InterfaceC6683x> interfaceC6564a4, InterfaceC6564a<Executor> interfaceC6564a5, InterfaceC6564a<InterfaceC7490b> interfaceC6564a6, InterfaceC6564a<InterfaceC8011a> interfaceC6564a7, InterfaceC6564a<InterfaceC8011a> interfaceC6564a8, InterfaceC6564a<InterfaceC7042c> interfaceC6564a9) {
        return new C6678s(interfaceC6564a, interfaceC6564a2, interfaceC6564a3, interfaceC6564a4, interfaceC6564a5, interfaceC6564a6, interfaceC6564a7, interfaceC6564a8, interfaceC6564a9);
    }

    /* JADX INFO: renamed from: c */
    public static C6677r m28766c(Context context, InterfaceC1559e interfaceC1559e, InterfaceC7044d interfaceC7044d, InterfaceC6683x interfaceC6683x, Executor executor, InterfaceC7490b interfaceC7490b, InterfaceC8011a interfaceC8011a, InterfaceC8011a interfaceC8011a2, InterfaceC7042c interfaceC7042c) {
        return new C6677r(context, interfaceC1559e, interfaceC7044d, interfaceC6683x, executor, interfaceC7490b, interfaceC8011a, interfaceC8011a2, interfaceC7042c);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6677r get() {
        return m28766c(this.f25744a.get(), this.f25745b.get(), this.f25746c.get(), this.f25747d.get(), this.f25748e.get(), this.f25749f.get(), this.f25750g.get(), this.f25751h.get(), this.f25752i.get());
    }
}
