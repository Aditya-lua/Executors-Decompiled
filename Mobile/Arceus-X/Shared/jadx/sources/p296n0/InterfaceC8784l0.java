package p296n0;

import java.util.Collections;
import java.util.List;
import ne.InterfaceFutureC9440x;
import p140g0.C5883f1;
import p140g0.C5910m0;
import p140g0.C5914n0;
import p140g0.InterfaceC5909m;
import p281m0.InterfaceC8308m;
import p397r0.C10773n;

/* JADX INFO: renamed from: n0.l0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8784l0 extends InterfaceC5909m {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC8784l0 f31940a = new b();

    /* JADX INFO: renamed from: n0.l0$a */
    public class a implements InterfaceC8308m {
        public a() {
        }

        @Override // p281m0.InterfaceC8308m
        /* JADX INFO: renamed from: a */
        public InterfaceFutureC9440x<Void> mo33779a() {
            return C10773n.m40993p(null);
        }

        @Override // p281m0.InterfaceC8308m
        /* JADX INFO: renamed from: b */
        public InterfaceFutureC9440x<Void> mo33780b() {
            return C10773n.m40993p(null);
        }
    }

    /* JADX INFO: renamed from: n0.l0$b */
    public class b implements InterfaceC8784l0 {
        @Override // p296n0.InterfaceC8784l0
        /* JADX INFO: renamed from: a */
        public void mo35010a(C8802o3.b bVar) {
        }

        @Override // p296n0.InterfaceC8784l0
        /* JADX INFO: renamed from: b */
        public void mo35011b() {
        }

        @Override // p140g0.InterfaceC5909m
        /* JADX INFO: renamed from: c */
        public InterfaceFutureC9440x<Void> mo26524c(boolean z10) {
            return C10773n.m40993p(null);
        }

        @Override // p140g0.InterfaceC5909m
        /* JADX INFO: renamed from: e */
        public InterfaceFutureC9440x<Void> mo26525e(float f10) {
            return C10773n.m40993p(null);
        }

        @Override // p296n0.InterfaceC8784l0
        /* JADX INFO: renamed from: f */
        public InterfaceFutureC9440x<List<Void>> mo6745f(List<C8785l1> list, int i10, int i11) {
            return C10773n.m40993p(Collections.EMPTY_LIST);
        }

        @Override // p140g0.InterfaceC5909m
        /* JADX INFO: renamed from: g */
        public InterfaceFutureC9440x<Void> mo26526g(float f10) {
            return C10773n.m40993p(null);
        }

        @Override // p296n0.InterfaceC8784l0
        /* JADX INFO: renamed from: i */
        public void mo35014i(int i10) {
        }

        @Override // p296n0.InterfaceC8784l0
        /* JADX INFO: renamed from: j */
        public InterfaceC8795n1 mo35015j() {
            return null;
        }

        @Override // p296n0.InterfaceC8784l0
        /* JADX INFO: renamed from: l */
        public void mo35017l(InterfaceC8795n1 interfaceC8795n1) {
        }

        @Override // p296n0.InterfaceC8784l0
        /* JADX INFO: renamed from: n */
        public void mo35019n() {
        }

        @Override // p140g0.InterfaceC5909m
        /* JADX INFO: renamed from: o */
        public InterfaceFutureC9440x<C5914n0> mo26527o(C5910m0 c5910m0) {
            return C10773n.m40993p(C5914n0.m26548b());
        }
    }

    /* JADX INFO: renamed from: n0.l0$c */
    public static final class c extends Exception {

        /* JADX INFO: renamed from: a */
        public C8838w f31942a;

        public c(C8838w c8838w) {
            this.f31942a = c8838w;
        }
    }

    /* JADX INFO: renamed from: n0.l0$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo35236a();

        /* JADX INFO: renamed from: b */
        void mo35237b(List<C8785l1> list);
    }

    /* JADX INFO: renamed from: a */
    void mo35010a(C8802o3.b bVar);

    /* JADX INFO: renamed from: b */
    void mo35011b();

    /* JADX INFO: renamed from: d */
    default void mo35012d() {
    }

    /* JADX INFO: renamed from: f */
    InterfaceFutureC9440x<List<Void>> mo6745f(List<C8785l1> list, int i10, int i11);

    /* JADX INFO: renamed from: h */
    default void mo35013h(C5883f1.j jVar) {
    }

    /* JADX INFO: renamed from: i */
    void mo35014i(int i10);

    /* JADX INFO: renamed from: j */
    InterfaceC8795n1 mo35015j();

    /* JADX INFO: renamed from: k */
    default void mo35016k() {
    }

    /* JADX INFO: renamed from: l */
    void mo35017l(InterfaceC8795n1 interfaceC8795n1);

    /* JADX INFO: renamed from: m */
    default InterfaceFutureC9440x<InterfaceC8308m> mo35018m(int i10, int i11) {
        return C10773n.m40993p(new a());
    }

    /* JADX INFO: renamed from: n */
    void mo35019n();
}
