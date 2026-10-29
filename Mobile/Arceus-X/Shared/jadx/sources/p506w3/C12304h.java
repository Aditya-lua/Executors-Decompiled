package p506w3;

import androidx.datastore.preferences.protobuf.AbstractC0840g;
import androidx.datastore.preferences.protobuf.AbstractC0888x;
import androidx.datastore.preferences.protobuf.InterfaceC0877s0;
import androidx.datastore.preferences.protobuf.InterfaceC0893z0;

/* JADX INFO: renamed from: w3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C12304h extends AbstractC0888x<C12304h, a> implements InterfaceC0877s0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C12304h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC0893z0<C12304h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    /* JADX INFO: renamed from: w3.h$a */
    public static final class a extends AbstractC0888x.a<C12304h, a> implements InterfaceC0877s0 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: w3.h.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ a(C12301e c12301e) {
            this();
        }

        /* JADX INFO: renamed from: E */
        public a m45739E(boolean z10) {
            m4207t();
            ((C12304h) this.f3136b).m45731o0(z10);
            return this;
        }

        /* JADX INFO: renamed from: G */
        public a m45740G(AbstractC0840g abstractC0840g) {
            m4207t();
            ((C12304h) this.f3136b).m45732p0(abstractC0840g);
            return this;
        }

        /* JADX INFO: renamed from: J */
        public a m45741J(double d10) {
            m4207t();
            ((C12304h) this.f3136b).m45733q0(d10);
            return this;
        }

        /* JADX INFO: renamed from: K */
        public a m45742K(float f10) {
            m4207t();
            ((C12304h) this.f3136b).m45734r0(f10);
            return this;
        }

        /* JADX INFO: renamed from: N */
        public a m45743N(int i10) {
            m4207t();
            ((C12304h) this.f3136b).m45735s0(i10);
            return this;
        }

        /* JADX INFO: renamed from: O */
        public a m45744O(long j10) {
            m4207t();
            ((C12304h) this.f3136b).m45736t0(j10);
            return this;
        }

        /* JADX INFO: renamed from: P */
        public a m45745P(String str) {
            m4207t();
            ((C12304h) this.f3136b).m45737u0(str);
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public a m45746Q(C12303g.a aVar) {
            m4207t();
            ((C12304h) this.f3136b).m45738v0(aVar.build());
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
            super(C12304h.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: w3.h$b */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* JADX INFO: renamed from: a */
        public final int f43595a;

        b(int i10) {
            this.f43595a = i10;
        }

        /* JADX INFO: renamed from: b */
        public static b m45748b(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        C12304h c12304h = new C12304h();
        DEFAULT_INSTANCE = c12304h;
        AbstractC0888x.m4180R(C12304h.class, c12304h);
    }

    /* JADX INFO: renamed from: f0 */
    public static C12304h m45720f0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public static a m45721n0() {
        return DEFAULT_INSTANCE.m4198w();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0888x
    /* JADX INFO: renamed from: A */
    public final Object mo4182A(AbstractC0888x.f fVar, Object obj, Object obj2) {
        InterfaceC0893z0 bVar;
        C12301e c12301e = null;
        switch (C12301e.f43583a[fVar.ordinal()]) {
            case 1:
                return new C12304h();
            case 2:
                return new a(c12301e);
            case 3:
                return AbstractC0888x.m4177N(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", C12303g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0893z0<C12304h> interfaceC0893z0 = PARSER;
                if (interfaceC0893z0 != null) {
                    return interfaceC0893z0;
                }
                synchronized (C12304h.class) {
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

    /* JADX INFO: renamed from: d0 */
    public boolean m45722d0() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public AbstractC0840g m45723e0() {
        return this.valueCase_ == 8 ? (AbstractC0840g) this.value_ : AbstractC0840g.f2854b;
    }

    /* JADX INFO: renamed from: g0 */
    public double m45724g0() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: h0 */
    public float m45725h0() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: i0 */
    public int m45726i0() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: j0 */
    public long m45727j0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k0 */
    public String m45728k0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: l0 */
    public C12303g m45729l0() {
        return this.valueCase_ == 6 ? (C12303g) this.value_ : C12303g.m45705Y();
    }

    /* JADX INFO: renamed from: m0 */
    public b m45730m0() {
        return b.m45748b(this.valueCase_);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m45731o0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m45732p0(AbstractC0840g abstractC0840g) {
        abstractC0840g.getClass();
        this.valueCase_ = 8;
        this.value_ = abstractC0840g;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m45733q0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m45734r0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m45735s0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m45736t0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m45737u0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m45738v0(C12303g c12303g) {
        c12303g.getClass();
        this.value_ = c12303g;
        this.valueCase_ = 6;
    }
}
