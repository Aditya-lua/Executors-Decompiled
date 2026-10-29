package p132fn;

import com.withpersona.sdk2.camera.C3402b;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p391qq.C10700c;

/* JADX INFO: renamed from: fn.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C5703q implements InterfaceC5830d<C3402b> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C10700c> f21903a;

    public C5703q(InterfaceC5835i<C10700c> interfaceC5835i) {
        this.f21903a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C5703q m25843a(InterfaceC5835i<C10700c> interfaceC5835i) {
        return new C5703q(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3402b m25844c(C10700c c10700c) {
        return new C3402b(c10700c);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3402b get() {
        return m25844c(this.f21903a.get());
    }
}
