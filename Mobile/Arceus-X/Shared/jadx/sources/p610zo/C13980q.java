package p610zo;

import android.content.Context;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p239k6.InterfaceC7479s;

/* JADX INFO: renamed from: zo.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C13980q implements InterfaceC5830d<InterfaceC7479s> {

    /* JADX INFO: renamed from: a */
    public final C13974n f48847a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<Context> f48848b;

    public C13980q(C13974n c13974n, InterfaceC5835i<Context> interfaceC5835i) {
        this.f48847a = c13974n;
        this.f48848b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13980q m50521a(C13974n c13974n, InterfaceC5835i<Context> interfaceC5835i) {
        return new C13980q(c13974n, interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC7479s m50522c(C13974n c13974n, Context context) {
        return (InterfaceC7479s) C5834h.m26194e(c13974n.m50504c(context));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC7479s get() {
        return m50522c(this.f48847a, this.f48848b.get());
    }
}
