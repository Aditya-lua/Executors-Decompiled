package p178hq;

import android.content.Context;
import com.withpersona.sdk2.camera.C3405e;
import hn.C6434c;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p152go.C6159e;
import p475uq.C11930a;

/* JADX INFO: renamed from: hq.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C6545k implements InterfaceC5830d<C6544j> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f24870a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C3405e.a> f24871b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C6434c.a> f24872c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C11930a> f24873d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<C6159e> f24874e;

    public C6545k(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3405e.a> interfaceC5835i2, InterfaceC5835i<C6434c.a> interfaceC5835i3, InterfaceC5835i<C11930a> interfaceC5835i4, InterfaceC5835i<C6159e> interfaceC5835i5) {
        this.f24870a = interfaceC5835i;
        this.f24871b = interfaceC5835i2;
        this.f24872c = interfaceC5835i3;
        this.f24873d = interfaceC5835i4;
        this.f24874e = interfaceC5835i5;
    }

    /* JADX INFO: renamed from: a */
    public static C6545k m28381a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3405e.a> interfaceC5835i2, InterfaceC5835i<C6434c.a> interfaceC5835i3, InterfaceC5835i<C11930a> interfaceC5835i4, InterfaceC5835i<C6159e> interfaceC5835i5) {
        return new C6545k(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5);
    }

    /* JADX INFO: renamed from: c */
    public static C6544j m28382c(Context context, C3405e.a aVar, C6434c.a aVar2, C11930a c11930a, C6159e c6159e) {
        return new C6544j(context, aVar, aVar2, c11930a, c6159e);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6544j get() {
        return m28382c(this.f24870a.get(), this.f24871b.get(), this.f24872c.get(), this.f24873d.get(), this.f24874e.get());
    }
}
