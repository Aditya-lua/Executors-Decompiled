package ze;

import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends com.google.crypto.tink.shaded.protobuf.y<j0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
    private static final j0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1<j0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.a0.i<c> key_ = com.google.crypto.tink.shaded.protobuf.y.A();
    private int primaryKeyId_;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37567a;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.y.f.values().length];
            f37567a = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37567a[com.google.crypto.tink.shaded.protobuf.y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37567a[com.google.crypto.tink.shaded.protobuf.y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37567a[com.google.crypto.tink.shaded.protobuf.y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37567a[com.google.crypto.tink.shaded.protobuf.y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37567a[com.google.crypto.tink.shaded.protobuf.y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37567a[com.google.crypto.tink.shaded.protobuf.y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.crypto.tink.shaded.protobuf.y.a<j0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b C(c cVar) {
            r();
            ((j0) this.b).c0(cVar);
            return this;
        }

        public b D(int i10) {
            r();
            ((j0) this.b).l0(i10);
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
            super(j0.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends com.google.crypto.tink.shaded.protobuf.y<c, a> implements com.google.crypto.tink.shaded.protobuf.t0 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile com.google.crypto.tink.shaded.protobuf.a1<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private int bitField0_;
        private f0 keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        public static final class a extends com.google.crypto.tink.shaded.protobuf.y.a<c, a> implements com.google.crypto.tink.shaded.protobuf.t0 {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a C(f0.b bVar) {
                r();
                ((c) this.b).k0(bVar.build());
                return this;
            }

            public a D(f0 f0Var) {
                r();
                ((c) this.b).k0(f0Var);
                return this;
            }

            public a E(int i10) {
                r();
                ((c) this.b).l0(i10);
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0.a
            public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a F(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
                return super.F(iVar, pVar);
            }

            public a G(p0 p0Var) {
                r();
                ((c) this.b).m0(p0Var);
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0126a, com.google.crypto.tink.shaded.protobuf.s0.a
            public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a H(com.google.crypto.tink.shaded.protobuf.s0 s0Var) {
                return super.H(s0Var);
            }

            public a J(g0 g0Var) {
                r();
                ((c) this.b).n0(g0Var);
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

            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            com.google.crypto.tink.shaded.protobuf.y.W(c.class, cVar);
        }

        public static a j0() {
            return DEFAULT_INSTANCE.v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m0(p0 p0Var) {
            this.outputPrefixType_ = p0Var.getNumber();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a a() {
            return super.a();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a e() {
            return super.e();
        }

        public f0 e0() {
            f0 f0Var = this.keyData_;
            return f0Var == null ? f0.d0() : f0Var;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.t0
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 f() {
            return super.f();
        }

        public int f0() {
            return this.keyId_;
        }

        public p0 g0() {
            p0 p0VarA = p0.a(this.outputPrefixType_);
            return p0VarA == null ? p0.UNRECOGNIZED : p0VarA;
        }

        public g0 h0() {
            g0 g0VarA = g0.a(this.status_);
            return g0VarA == null ? g0.UNRECOGNIZED : g0VarA;
        }

        public boolean i0() {
            return (this.bitField0_ & 1) != 0;
        }

        public final void k0(f0 f0Var) {
            f0Var.getClass();
            this.keyData_ = f0Var;
            this.bitField0_ |= 1;
        }

        public final void l0(int i10) {
            this.keyId_ = i10;
        }

        public final void n0(g0 g0Var) {
            this.status_ = g0Var.getNumber();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y
        public final Object z(com.google.crypto.tink.shaded.protobuf.y.f fVar, Object obj, Object obj2) {
            com.google.crypto.tink.shaded.protobuf.a1 bVar;
            a aVar = null;
            switch (a.f37567a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.crypto.tink.shaded.protobuf.y.O(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.crypto.tink.shaded.protobuf.a1<c> a1Var = PARSER;
                    if (a1Var != null) {
                        return a1Var;
                    }
                    synchronized (c.class) {
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

    static {
        j0 j0Var = new j0();
        DEFAULT_INSTANCE = j0Var;
        com.google.crypto.tink.shaded.protobuf.y.W(j0.class, j0Var);
    }

    public static b i0() {
        return DEFAULT_INSTANCE.v();
    }

    public static j0 j0(InputStream inputStream, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (j0) com.google.crypto.tink.shaded.protobuf.y.R(DEFAULT_INSTANCE, inputStream, pVar);
    }

    public static j0 k0(byte[] bArr, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (j0) com.google.crypto.tink.shaded.protobuf.y.S(DEFAULT_INSTANCE, bArr, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a a() {
        return super.a();
    }

    public final void c0(c cVar) {
        cVar.getClass();
        d0();
        this.key_.add(cVar);
    }

    public final void d0() {
        com.google.crypto.tink.shaded.protobuf.a0.i<c> iVar = this.key_;
        if (iVar.n()) {
            return;
        }
        this.key_ = com.google.crypto.tink.shaded.protobuf.y.M(iVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a e() {
        return super.e();
    }

    public c e0(int i10) {
        return this.key_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.t0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 f() {
        return super.f();
    }

    public int f0() {
        return this.key_.size();
    }

    public List<c> g0() {
        return this.key_;
    }

    public int h0() {
        return this.primaryKeyId_;
    }

    public final void l0(int i10) {
        this.primaryKeyId_ = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    public final Object z(com.google.crypto.tink.shaded.protobuf.y.f fVar, Object obj, Object obj2) {
        com.google.crypto.tink.shaded.protobuf.a1 bVar;
        a aVar = null;
        switch (a.f37567a[fVar.ordinal()]) {
            case 1:
                return new j0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1<j0> a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (j0.class) {
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
