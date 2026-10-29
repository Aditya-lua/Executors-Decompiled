package p473uo;

import android.content.Context;
import com.withpersona.sdk2.camera.C3405e;
import hn.C6434c;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p475uq.C11930a;

/* JADX INFO: renamed from: uo.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C11904k implements InterfaceC5830d<C11903j> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f42265a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C3405e.a> f42266b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C6434c.a> f42267c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C11930a> f42268d;

    public C11904k(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3405e.a> interfaceC5835i2, InterfaceC5835i<C6434c.a> interfaceC5835i3, InterfaceC5835i<C11930a> interfaceC5835i4) {
        this.f42265a = interfaceC5835i;
        this.f42266b = interfaceC5835i2;
        this.f42267c = interfaceC5835i3;
        this.f42268d = interfaceC5835i4;
    }

    /* JADX INFO: renamed from: a */
    public static C11904k m44491a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C3405e.a> interfaceC5835i2, InterfaceC5835i<C6434c.a> interfaceC5835i3, InterfaceC5835i<C11930a> interfaceC5835i4) {
        return new C11904k(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4);
    }

    /* JADX INFO: renamed from: c */
    public static C11903j m44492c(Context context, C3405e.a aVar, C6434c.a aVar2, C11930a c11930a) {
        return new C11903j(context, aVar, aVar2, c11930a);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11903j get() {
        return m44492c(this.f42265a.get(), this.f42266b.get(), this.f42267c.get(), this.f42268d.get());
    }
}
