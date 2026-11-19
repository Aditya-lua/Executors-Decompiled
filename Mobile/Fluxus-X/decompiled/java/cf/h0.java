package cf;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends com.google.crypto.tink.shaded.protobuf.y<h0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
    private static final h0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1<h0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = BuildConfig.FLAVOR;
    private com.google.crypto.tink.shaded.protobuf.h value_ = com.google.crypto.tink.shaded.protobuf.h.b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5066a;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.y.f.values().length];
            f5066a = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5066a[com.google.crypto.tink.shaded.protobuf.y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5066a[com.google.crypto.tink.shaded.protobuf.y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5066a[com.google.crypto.tink.shaded.protobuf.y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5066a[com.google.crypto.tink.shaded.protobuf.y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5066a[com.google.crypto.tink.shaded.protobuf.y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5066a[com.google.crypto.tink.shaded.protobuf.y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.crypto.tink.shaded.protobuf.y.a<h0, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b D(p0 p0Var) {
            t();
            ((h0) this.b).k0(p0Var);
            return this;
        }

        public b F(String str) {
            t();
            ((h0) this.b).l0(str);
            return this;
        }

        public b G(com.google.crypto.tink.shaded.protobuf.h hVar) {
            t();
            ((h0) this.b).m0(hVar);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a K(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
            return super.K(iVar, pVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0133a, com.google.crypto.tink.shaded.protobuf.s0.a
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a N(com.google.crypto.tink.shaded.protobuf.s0 s0Var) {
            return super.N(s0Var);
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

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.a.AbstractC0133a
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.a.AbstractC0133a l(com.google.crypto.tink.shaded.protobuf.a aVar) {
            return super.l((com.google.crypto.tink.shaded.protobuf.y) aVar);
        }

        public b() {
            super(h0.DEFAULT_INSTANCE);
        }
    }

    static {
        h0 h0Var = new h0();
        DEFAULT_INSTANCE = h0Var;
        com.google.crypto.tink.shaded.protobuf.y.W(h0.class, h0Var);
    }

    public static h0 d0() {
        return DEFAULT_INSTANCE;
    }

    public static b h0() {
        return DEFAULT_INSTANCE.v();
    }

    public static b i0(h0 h0Var) {
        return DEFAULT_INSTANCE.w(h0Var);
    }

    public static h0 j0(byte[] bArr, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (h0) com.google.crypto.tink.shaded.protobuf.y.S(DEFAULT_INSTANCE, bArr, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.value_ = hVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a a() {
        return super.a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a e() {
        return super.e();
    }

    public p0 e0() {
        p0 p0VarA = p0.a(this.outputPrefixType_);
        return p0VarA == null ? p0.UNRECOGNIZED : p0VarA;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.t0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 f() {
        return super.f();
    }

    public String f0() {
        return this.typeUrl_;
    }

    public com.google.crypto.tink.shaded.protobuf.h g0() {
        return this.value_;
    }

    public final void k0(p0 p0Var) {
        this.outputPrefixType_ = p0Var.getNumber();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    public final Object z(com.google.crypto.tink.shaded.protobuf.y.f fVar, Object obj, Object obj2) {
        com.google.crypto.tink.shaded.protobuf.a1 bVar;
        a aVar = null;
        switch (a.f5066a[fVar.ordinal()]) {
            case 1:
                return new h0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.O(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1<h0> a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (h0.class) {
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
