package p152go;

import android.content.Context;
import androidx.p616lifecycle.C0967l0;
import java.util.Set;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: go.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6160f implements InterfaceC5830d<C6159e> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Set<InterfaceC6158d>> f23534a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<Context> f23535b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C0967l0> f23536c;

    public C6160f(InterfaceC5835i<Set<InterfaceC6158d>> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<C0967l0> interfaceC5835i3) {
        this.f23534a = interfaceC5835i;
        this.f23535b = interfaceC5835i2;
        this.f23536c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C6160f m27150a(InterfaceC5835i<Set<InterfaceC6158d>> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<C0967l0> interfaceC5835i3) {
        return new C6160f(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C6159e m27151c(Set<InterfaceC6158d> set, Context context, C0967l0 c0967l0) {
        return new C6159e(set, context, c0967l0);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6159e get() {
        return m27151c(this.f23534a.get(), this.f23535b.get(), this.f23536c.get());
    }
}
