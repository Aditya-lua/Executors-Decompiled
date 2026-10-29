package ze;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends com.google.crypto.tink.shaded.protobuf.y<y0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
    private static final y0 DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1<y0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.h e_;
    private com.google.crypto.tink.shaded.protobuf.h n_;
    private w0 params_;
    private int version_;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37609a;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.y.f.values().length];
            f37609a = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37609a[com.google.crypto.tink.shaded.protobuf.y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37609a[com.google.crypto.tink.shaded.protobuf.y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37609a[com.google.crypto.tink.shaded.protobuf.y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37609a[com.google.crypto.tink.shaded.protobuf.y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37609a[com.google.crypto.tink.shaded.protobuf.y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37609a[com.google.crypto.tink.shaded.protobuf.y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.crypto.tink.shaded.protobuf.y.a<y0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b C(com.google.crypto.tink.shaded.protobuf.h hVar) {
            r();
            ((y0) this.b).m0(hVar);
            return this;
        }

        public b D(com.google.crypto.tink.shaded.protobuf.h hVar) {
            r();
            ((y0) this.b).n0(hVar);
            return this;
        }

        public b E(w0 w0Var) {
            r();
            ((y0) this.b).o0(w0Var);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a F(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
            return super.F(iVar, pVar);
        }

        public b G(int i10) {
            r();
            ((y0) this.b).p0(i10);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0126a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a H(com.google.crypto.tink.shaded.protobuf.s0 s0Var) {
            return super.H(s0Var);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 build() {
            return super.build();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a
        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 d() {
            return super.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.t0
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 f() {
            return super.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.a.AbstractC0126a
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.a.AbstractC0126a j(com.google.crypto.tink.shaded.protobuf.a aVar) {
            return super.j((com.google.crypto.tink.shaded.protobuf.y) aVar);
        }

        public b() {
            super(y0.DEFAULT_INSTANCE);
        }
    }

    static {
        y0 y0Var = new y0();
        DEFAULT_INSTANCE = y0Var;
        com.google.crypto.tink.shaded.protobuf.y.W(y0.class, y0Var);
    }

    public y0() {
        com.google.crypto.tink.shaded.protobuf.h hVar = com.google.crypto.tink.shaded.protobuf.h.b;
        this.n_ = hVar;
        this.e_ = hVar;
    }

    public static y0 e0() {
        return DEFAULT_INSTANCE;
    }

    public static b j0() {
        return DEFAULT_INSTANCE.v();
    }

    public static y0 k0(com.google.crypto.tink.shaded.protobuf.h hVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (y0) com.google.crypto.tink.shaded.protobuf.y.Q(DEFAULT_INSTANCE, hVar, pVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.a1<y0> l0() {
        return DEFAULT_INSTANCE.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.e_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.n_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(w0 w0Var) {
        w0Var.getClass();
        this.params_ = w0Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(int i10) {
        this.version_ = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a a() {
        return super.a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a e() {
        return super.e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.t0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 f() {
        return super.f();
    }

    public com.google.crypto.tink.shaded.protobuf.h f0() {
        return this.e_;
    }

    public com.google.crypto.tink.shaded.protobuf.h g0() {
        return this.n_;
    }

    public w0 h0() {
        w0 w0Var = this.params_;
        return w0Var == null ? w0.d0() : w0Var;
    }

    public int i0() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    public final Object z(com.google.crypto.tink.shaded.protobuf.y.f fVar, Object obj, Object obj2) {
        com.google.crypto.tink.shaded.protobuf.a1 bVar;
        a aVar = null;
        switch (a.f37609a[fVar.ordinal()]) {
            case 1:
                return new y0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.O(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "n_", "e_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1<y0> a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (y0.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new com.google.crypto.tink.shaded.protobuf.y.b(DEFAULT_INSTANCE);
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
}
