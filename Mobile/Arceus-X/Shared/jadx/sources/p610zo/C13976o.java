package p610zo;

import android.app.Application;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: zo.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C13976o implements InterfaceC5830d<Application> {

    /* JADX INFO: renamed from: a */
    public final C13974n f48842a;

    public C13976o(C13974n c13974n) {
        this.f48842a = c13974n;
    }

    /* JADX INFO: renamed from: a */
    public static Application m50509a(C13974n c13974n) {
        return (Application) C5834h.m26194e(c13974n.m50502a());
    }

    /* JADX INFO: renamed from: b */
    public static C13976o m50510b(C13974n c13974n) {
        return new C13976o(c13974n);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return m50509a(this.f48842a);
    }
}
