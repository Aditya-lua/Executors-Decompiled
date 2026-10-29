package ze;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends com.google.crypto.tink.shaded.protobuf.y<x0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final x0 DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1<x0> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.h crt_;
    private com.google.crypto.tink.shaded.protobuf.h d_;
    private com.google.crypto.tink.shaded.protobuf.h dp_;
    private com.google.crypto.tink.shaded.protobuf.h dq_;
    private com.google.crypto.tink.shaded.protobuf.h p_;
    private y0 publicKey_;
    private com.google.crypto.tink.shaded.protobuf.h q_;
    private int version_;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37607a;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.y.f.values().length];
            f37607a = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37607a[com.google.crypto.tink.shaded.protobuf.y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37607a[com.google.crypto.tink.shaded.protobuf.y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37607a[com.google.crypto.tink.shaded.protobuf.y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37607a[com.google.crypto.tink.shaded.protobuf.y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37607a[com.google.crypto.tink.shaded.protobuf.y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37607a[com.google.crypto.tink.shaded.protobuf.y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.crypto.tink.shaded.protobuf.y.a<x0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b C(com.google.crypto.tink.shaded.protobuf.h hVar) {
            r();
            ((x0) this.b).t0(hVar);
            return this;
        }

        public b D(com.google.crypto.tink.shaded.protobuf.h hVar) {
            r();
            ((x0) this.b).u0(hVar);
            return this;
        }

        public b E(com.google.crypto.tink.shaded.protobuf.h hVar) {
            r();
            ((x0) this.b).v0(hVar);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a F(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
            return super.F(iVar, pVar);
        }

        public b G(com.google.crypto.tink.shaded.protobuf.h hVar) {
            r();
            ((x0) this.b).w0(hVar);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0126a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a H(com.google.crypto.tink.shaded.protobuf.s0 s0Var) {
            return super.H(s0Var);
        }

        public b J(com.google.crypto.tink.shaded.protobuf.h hVar) {
            r();
            ((x0) this.b).x0(hVar);
            return this;
        }

        public b K(y0 y0Var) {
            r();
            ((x0) this.b).y0(y0Var);
            return this;
        }

        public b N(com.google.crypto.tink.shaded.protobuf.h hVar) {
            r();
            ((x0) this.b).z0(hVar);
            return this;
        }

        public b O(int i10) {
            r();
            ((x0) this.b).A0(i10);
            return this;
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
            super(x0.DEFAULT_INSTANCE);
        }
    }

    static {
        x0 x0Var = new x0();
        DEFAULT_INSTANCE = x0Var;
        com.google.crypto.tink.shaded.protobuf.y.W(x0.class, x0Var);
    }

    public x0() {
        com.google.crypto.tink.shaded.protobuf.h hVar = com.google.crypto.tink.shaded.protobuf.h.b;
        this.d_ = hVar;
        this.p_ = hVar;
        this.q_ = hVar;
        this.dp_ = hVar;
        this.dq_ = hVar;
        this.crt_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(int i10) {
        this.version_ = i10;
    }

    public static b q0() {
        return DEFAULT_INSTANCE.v();
    }

    public static x0 r0(com.google.crypto.tink.shaded.protobuf.h hVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (x0) com.google.crypto.tink.shaded.protobuf.y.Q(DEFAULT_INSTANCE, hVar, pVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.a1<x0> s0() {
        return DEFAULT_INSTANCE.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.crt_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.d_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.dp_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.dq_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.p_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.q_ = hVar;
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

    public com.google.crypto.tink.shaded.protobuf.h i0() {
        return this.crt_;
    }

    public com.google.crypto.tink.shaded.protobuf.h j0() {
        return this.d_;
    }

    public com.google.crypto.tink.shaded.protobuf.h k0() {
        return this.dp_;
    }

    public com.google.crypto.tink.shaded.protobuf.h l0() {
        return this.dq_;
    }

    public com.google.crypto.tink.shaded.protobuf.h m0() {
        return this.p_;
    }

    public y0 n0() {
        y0 y0Var = this.publicKey_;
        return y0Var == null ? y0.e0() : y0Var;
    }

    public com.google.crypto.tink.shaded.protobuf.h o0() {
        return this.q_;
    }

    public int p0() {
        return this.version_;
    }

    public final void y0(y0 y0Var) {
        y0Var.getClass();
        this.publicKey_ = y0Var;
        this.bitField0_ |= 1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    public final Object z(com.google.crypto.tink.shaded.protobuf.y.f fVar, Object obj, Object obj2) {
        com.google.crypto.tink.shaded.protobuf.a1 bVar;
        a aVar = null;
        switch (a.f37607a[fVar.ordinal()]) {
            case 1:
                return new x0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.O(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"bitField0_", "version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1<x0> a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (x0.class) {
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
