package w3;

import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends x<h, a> implements s0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile z0<h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends x.a<h, a> implements s0 {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a E(boolean z10) {
            t();
            ((h) this.b).o0(z10);
            return this;
        }

        public a G(androidx.datastore.preferences.protobuf.g gVar) {
            t();
            ((h) this.b).p0(gVar);
            return this;
        }

        public a J(double d10) {
            t();
            ((h) this.b).q0(d10);
            return this;
        }

        public a K(float f10) {
            t();
            ((h) this.b).r0(f10);
            return this;
        }

        public a N(int i10) {
            t();
            ((h) this.b).s0(i10);
            return this;
        }

        public a O(long j10) {
            t();
            ((h) this.b).t0(j10);
            return this;
        }

        public a P(String str) {
            t();
            ((h) this.b).u0(str);
            return this;
        }

        public a Q(g.a aVar) {
            t();
            ((h) this.b).v0(aVar.build());
            return this;
        }

        public a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

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


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33678a;

        b(int i10) {
            this.f33678a = i10;
        }

        public static b b(int i10) {
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
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        x.R(h.class, hVar);
    }

    public static h f0() {
        return DEFAULT_INSTANCE;
    }

    public static a n0() {
        return DEFAULT_INSTANCE.x();
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final Object A(x.f fVar, Object obj, Object obj2) {
        z0 bVar;
        e eVar = null;
        switch (e.f33667a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return x.N(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<h> z0Var = PARSER;
                if (z0Var != null) {
                    return z0Var;
                }
                synchronized (h.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new x.b(DEFAULT_INSTANCE);
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

    public boolean d0() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public androidx.datastore.preferences.protobuf.g e0() {
        return this.valueCase_ == 8 ? (androidx.datastore.preferences.protobuf.g) this.value_ : androidx.datastore.preferences.protobuf.g.b;
    }

    public double g0() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float h0() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int i0() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long j0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String k0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g l0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.Y();
    }

    public b m0() {
        return b.b(this.valueCase_);
    }

    public final void o0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    public final void p0(androidx.datastore.preferences.protobuf.g gVar) {
        gVar.getClass();
        this.valueCase_ = 8;
        this.value_ = gVar;
    }

    public final void q0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    public final void r0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    public final void s0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    public final void t0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    public final void u0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void v0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }
}
