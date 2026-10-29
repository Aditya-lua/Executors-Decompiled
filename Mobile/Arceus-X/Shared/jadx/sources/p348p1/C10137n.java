package p348p1;

import java.util.Objects;
import ne.InterfaceFutureC9440x;
import p347p0.C10110z;
import p397r0.C10773n;
import p436t.InterfaceC11464a;
import p533x2.C12633c;
import p563y1.C12997c;

/* JADX INFO: renamed from: p1.n */
/* JADX INFO: loaded from: classes.dex */
public class C10137n<T> {

    /* JADX INFO: renamed from: a */
    public C12633c<C12997c.a<Void>, T> f36489a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m39081a(C10137n c10137n, Object obj, C12997c.a aVar) {
        C12633c<C12997c.a<Void>, T> c12633c = c10137n.f36489a;
        if (c12633c != null) {
            C12997c.a<Void> aVar2 = c12633c.f44955a;
            Objects.requireNonNull(aVar2);
            aVar2.m48315d();
        }
        c10137n.f36489a = new C12633c<>(aVar, obj);
        return "PendingValue " + obj;
    }

    /* JADX INFO: renamed from: b */
    public void m39082b(InterfaceC11464a<T, InterfaceFutureC9440x<Void>> interfaceC11464a) {
        C10110z.m39008b();
        C12633c<C12997c.a<Void>, T> c12633c = this.f36489a;
        if (c12633c != null) {
            InterfaceFutureC9440x<Void> interfaceFutureC9440xApply = interfaceC11464a.apply(c12633c.f44956b);
            C12997c.a<Void> aVar = this.f36489a.f44955a;
            Objects.requireNonNull(aVar);
            C10773n.m40997t(interfaceFutureC9440xApply, aVar);
            this.f36489a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public InterfaceFutureC9440x<Void> m39083c(final T t8) {
        C10110z.m39008b();
        return C12997c.m48311a(new C12997c.c() { // from class: p1.m
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C10137n.m39081a(this.f36486a, t8, aVar);
            }
        });
    }
}
