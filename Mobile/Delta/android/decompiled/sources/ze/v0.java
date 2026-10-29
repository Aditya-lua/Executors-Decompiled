package ze;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends com.google.crypto.tink.shaded.protobuf.y<v0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
    private static final v0 DEFAULT_INSTANCE;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1<v0> PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 3;
    private int bitField0_;
    private int modulusSizeInBits_;
    private w0 params_;
    private com.google.crypto.tink.shaded.protobuf.h publicExponent_ = com.google.crypto.tink.shaded.protobuf.h.b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37603a;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.y.f.values().length];
            f37603a = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37603a[com.google.crypto.tink.shaded.protobuf.y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37603a[com.google.crypto.tink.shaded.protobuf.y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37603a[com.google.crypto.tink.shaded.protobuf.y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37603a[com.google.crypto.tink.shaded.protobuf.y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37603a[com.google.crypto.tink.shaded.protobuf.y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37603a[com.google.crypto.tink.shaded.protobuf.y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.crypto.tink.shaded.protobuf.y.a<v0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b C(int i10) {
            r();
            ((v0) this.b).i0(i10);
            return this;
        }

        public b D(w0 w0Var) {
            r();
            ((v0) this.b).j0(w0Var);
            return this;
        }

        public b E(com.google.crypto.tink.shaded.protobuf.h hVar) {
            r();
            ((v0) this.b).k0(hVar);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a F(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
            return super.F(iVar, pVar);
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
            super(v0.DEFAULT_INSTANCE);
        }
    }

    static {
        v0 v0Var = new v0();
        DEFAULT_INSTANCE = v0Var;
        com.google.crypto.tink.shaded.protobuf.y.W(v0.class, v0Var);
    }

    public static b g0() {
        return DEFAULT_INSTANCE.v();
    }

    public static v0 h0(com.google.crypto.tink.shaded.protobuf.h hVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (v0) com.google.crypto.tink.shaded.protobuf.y.Q(DEFAULT_INSTANCE, hVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(int i10) {
        this.modulusSizeInBits_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.publicExponent_ = hVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a a() {
        return super.a();
    }

    public int d0() {
        return this.modulusSizeInBits_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a e() {
        return super.e();
    }

    public w0 e0() {
        w0 w0Var = this.params_;
        return w0Var == null ? w0.d0() : w0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.t0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 f() {
        return super.f();
    }

    public com.google.crypto.tink.shaded.protobuf.h f0() {
        return this.publicExponent_;
    }

    public final void j0(w0 w0Var) {
        w0Var.getClass();
        this.params_ = w0Var;
        this.bitField0_ |= 1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    public final Object z(com.google.crypto.tink.shaded.protobuf.y.f fVar, Object obj, Object obj2) {
        com.google.crypto.tink.shaded.protobuf.a1 bVar;
        a aVar = null;
        switch (a.f37603a[fVar.ordinal()]) {
            case 1:
                return new v0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.O(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"bitField0_", "params_", "modulusSizeInBits_", "publicExponent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1<v0> a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (v0.class) {
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
