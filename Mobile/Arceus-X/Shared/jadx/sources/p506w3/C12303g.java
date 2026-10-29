package p506w3;

import androidx.datastore.preferences.protobuf.AbstractC0822a;
import androidx.datastore.preferences.protobuf.AbstractC0888x;
import androidx.datastore.preferences.protobuf.C0892z;
import androidx.datastore.preferences.protobuf.InterfaceC0877s0;
import androidx.datastore.preferences.protobuf.InterfaceC0893z0;
import java.util.List;

/* JADX INFO: renamed from: w3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C12303g extends AbstractC0888x<C12303g, a> implements InterfaceC0877s0 {
    private static final C12303g DEFAULT_INSTANCE;
    private static volatile InterfaceC0893z0<C12303g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C0892z.f<String> strings_ = AbstractC0888x.m4172B();

    /* JADX INFO: renamed from: w3.g$a */
    public static final class a extends AbstractC0888x.a<C12303g, a> implements InterfaceC0877s0 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: w3.g.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ a(C12301e c12301e) {
            this();
        }

        /* JADX INFO: renamed from: E */
        public a m45710E(Iterable<String> iterable) {
            m4207t();
            ((C12303g) this.f3136b).m45707W(iterable);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
            super(C12303g.DEFAULT_INSTANCE);
        }
    }

    static {
        C12303g c12303g = new C12303g();
        DEFAULT_INSTANCE = c12303g;
        AbstractC0888x.m4180R(C12303g.class, c12303g);
    }

    /* JADX INFO: renamed from: Y */
    public static C12303g m45705Y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public static a m45706a0() {
        return DEFAULT_INSTANCE.m4198w();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0888x
    /* JADX INFO: renamed from: A */
    public final Object mo4182A(AbstractC0888x.f fVar, Object obj, Object obj2) {
        InterfaceC0893z0 bVar;
        C12301e c12301e = null;
        switch (C12301e.f43583a[fVar.ordinal()]) {
            case 1:
                return new C12303g();
            case 2:
                return new a(c12301e);
            case 3:
                return AbstractC0888x.m4177N(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0893z0<C12303g> interfaceC0893z0 = PARSER;
                if (interfaceC0893z0 != null) {
                    return interfaceC0893z0;
                }
                synchronized (C12303g.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC0888x.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m45707W(Iterable<String> iterable) {
        m45708X();
        AbstractC0822a.m3325g(iterable, this.strings_);
    }

    /* JADX INFO: renamed from: X */
    public final void m45708X() {
        C0892z.f<String> fVar = this.strings_;
        if (fVar.mo3360n()) {
            return;
        }
        this.strings_ = AbstractC0888x.m4176L(fVar);
    }

    /* JADX INFO: renamed from: Z */
    public List<String> m45709Z() {
        return this.strings_;
    }
}
