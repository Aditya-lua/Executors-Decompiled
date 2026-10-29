package p506w3;

import androidx.datastore.preferences.protobuf.AbstractC0888x;
import androidx.datastore.preferences.protobuf.C0853k0;
import androidx.datastore.preferences.protobuf.C0856l0;
import androidx.datastore.preferences.protobuf.C0878s1;
import androidx.datastore.preferences.protobuf.InterfaceC0877s0;
import androidx.datastore.preferences.protobuf.InterfaceC0893z0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: w3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C12302f extends AbstractC0888x<C12302f, a> implements InterfaceC0877s0 {
    private static final C12302f DEFAULT_INSTANCE;
    private static volatile InterfaceC0893z0<C12302f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C0856l0<String, C12304h> preferences_ = C0856l0.m3865e();

    /* JADX INFO: renamed from: w3.f$a */
    public static final class a extends AbstractC0888x.a<C12302f, a> implements InterfaceC0877s0 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: w3.f.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ a(C12301e c12301e) {
            this();
        }

        /* JADX INFO: renamed from: E */
        public a m45702E(String str, C12304h c12304h) {
            str.getClass();
            c12304h.getClass();
            m4207t();
            ((C12302f) this.f3136b).m45698W().put(str, c12304h);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
            super(C12302f.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: w3.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C0853k0<String, C12304h> f43584a = C0853k0.m3854d(C0878s1.b.f3010k, "", C0878s1.b.f3012m, C12304h.m45720f0());
    }

    static {
        C12302f c12302f = new C12302f();
        DEFAULT_INSTANCE = c12302f;
        AbstractC0888x.m4180R(C12302f.class, c12302f);
    }

    /* JADX INFO: renamed from: a0 */
    public static a m45696a0() {
        return DEFAULT_INSTANCE.m4198w();
    }

    /* JADX INFO: renamed from: b0 */
    public static C12302f m45697b0(InputStream inputStream) {
        return (C12302f) AbstractC0888x.m4178P(DEFAULT_INSTANCE, inputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0888x
    /* JADX INFO: renamed from: A */
    public final Object mo4182A(AbstractC0888x.f fVar, Object obj, Object obj2) {
        InterfaceC0893z0 bVar;
        C12301e c12301e = null;
        switch (C12301e.f43583a[fVar.ordinal()]) {
            case 1:
                return new C12302f();
            case 2:
                return new a(c12301e);
            case 3:
                return AbstractC0888x.m4177N(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f43584a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0893z0<C12302f> interfaceC0893z0 = PARSER;
                if (interfaceC0893z0 != null) {
                    return interfaceC0893z0;
                }
                synchronized (C12302f.class) {
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
    public final Map<String, C12304h> m45698W() {
        return m45700Y();
    }

    /* JADX INFO: renamed from: X */
    public Map<String, C12304h> m45699X() {
        return Collections.unmodifiableMap(m45701Z());
    }

    /* JADX INFO: renamed from: Y */
    public final C0856l0<String, C12304h> m45700Y() {
        if (!this.preferences_.m3869k()) {
            this.preferences_ = this.preferences_.m3872p();
        }
        return this.preferences_;
    }

    /* JADX INFO: renamed from: Z */
    public final C0856l0<String, C12304h> m45701Z() {
        return this.preferences_;
    }
}
