package cf;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends com.google.crypto.tink.shaded.protobuf.y<a, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
    private static final a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1<a> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.crypto.tink.shaded.protobuf.h keyValue_ = com.google.crypto.tink.shaded.protobuf.h.b;
    private c params_;
    private int version_;

    /* JADX INFO: renamed from: cf.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0100a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5025a;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.y.f.values().length];
            f5025a = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5025a[com.google.crypto.tink.shaded.protobuf.y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5025a[com.google.crypto.tink.shaded.protobuf.y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5025a[com.google.crypto.tink.shaded.protobuf.y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5025a[com.google.crypto.tink.shaded.protobuf.y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5025a[com.google.crypto.tink.shaded.protobuf.y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5025a[com.google.crypto.tink.shaded.protobuf.y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends com.google.crypto.tink.shaded.protobuf.y.a<a, b> implements com.google.crypto.tink.shaded.protobuf.t0 {
        public /* synthetic */ b(C0100a c0100a) {
            this();
        }

        public b D(com.google.crypto.tink.shaded.protobuf.h hVar) {
            t();
            ((a) this.b).i0(hVar);
            return this;
        }

        public b F(c cVar) {
            t();
            ((a) this.b).j0(cVar);
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
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        com.google.crypto.tink.shaded.protobuf.y.W(a.class, aVar);
    }

    public static b f0() {
        return DEFAULT_INSTANCE.v();
    }

    public static a g0(com.google.crypto.tink.shaded.protobuf.h hVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (a) com.google.crypto.tink.shaded.protobuf.y.Q(DEFAULT_INSTANCE, hVar, pVar);
    }

    public static com.google.crypto.tink.shaded.protobuf.a1<a> h0() {
        return DEFAULT_INSTANCE.i();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a a() {
        return super.a();
    }

    public com.google.crypto.tink.shaded.protobuf.h c0() {
        return this.keyValue_;
    }

    public c d0() {
        c cVar = this.params_;
        return cVar == null ? c.b0() : cVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0.a e() {
        return super.e();
    }

    public int e0() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.t0
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.s0 f() {
        return super.f();
    }

    public final void i0(com.google.crypto.tink.shaded.protobuf.h hVar) {
        hVar.getClass();
        this.keyValue_ = hVar;
    }

    public final void j0(c cVar) {
        cVar.getClass();
        this.params_ = cVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    public final Object z(com.google.crypto.tink.shaded.protobuf.y.f fVar, Object obj, Object obj2) {
        com.google.crypto.tink.shaded.protobuf.a1 bVar;
        C0100a c0100a = null;
        switch (C0100a.f5025a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0100a);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.O(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1<a> a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (a.class) {
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
