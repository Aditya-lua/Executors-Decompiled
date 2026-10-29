package af;

import com.google.crypto.tink.shaded.protobuf.AbstractC2899a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2923i;
import com.google.crypto.tink.shaded.protobuf.AbstractC2967y;
import com.google.crypto.tink.shaded.protobuf.C2900a0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2901a1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: af.j0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0226j0 extends AbstractC2967y<C0226j0, b> implements InterfaceC2957t0 {
    private static final C0226j0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile InterfaceC2901a1<C0226j0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C2900a0.i<c> key_ = AbstractC2967y.m14307A();
    private int primaryKeyId_;

    /* JADX INFO: renamed from: af.j0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f657a;

        static {
            int[] iArr = new int[AbstractC2967y.f.values().length];
            f657a = iArr;
            try {
                iArr[AbstractC2967y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f657a[AbstractC2967y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f657a[AbstractC2967y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f657a[AbstractC2967y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f657a[AbstractC2967y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f657a[AbstractC2967y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f657a[AbstractC2967y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: af.j0$b */
    public static final class b extends AbstractC2967y.a<C0226j0, b> implements InterfaceC2957t0 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: af.j0.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: C */
        public b m807C(c cVar) {
            m14345r();
            ((C0226j0) this.f11133b).m800c0(cVar);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public b m808D(int i10) {
            m14345r();
            ((C0226j0) this.f11133b).m806l0(i10);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0.a
        /* JADX INFO: renamed from: F */
        public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo575F(AbstractC2923i abstractC2923i, C2944p c2944p) {
            return super.mo575F(abstractC2923i, c2944p);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899a.a, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0.a
        /* JADX INFO: renamed from: H */
        public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo576H(InterfaceC2954s0 interfaceC2954s0) {
            return super.mo576H(interfaceC2954s0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0.a
        public /* bridge */ /* synthetic */ InterfaceC2954s0 build() {
            return super.build();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y.a
        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0.a
        /* JADX INFO: renamed from: d */
        public /* bridge */ /* synthetic */ InterfaceC2954s0 mo577d() {
            return super.mo577d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0
        /* JADX INFO: renamed from: f */
        public /* bridge */ /* synthetic */ InterfaceC2954s0 mo569f() {
            return super.mo569f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y.a, com.google.crypto.tink.shaded.protobuf.AbstractC2899a.a
        /* JADX INFO: renamed from: j */
        public /* bridge */ /* synthetic */ AbstractC2899a.a mo578j(AbstractC2899a abstractC2899a) {
            return super.mo578j((AbstractC2967y) abstractC2899a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            super(C0226j0.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: af.j0$c */
    public static final class c extends AbstractC2967y<c, a> implements InterfaceC2957t0 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile InterfaceC2901a1<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private int bitField0_;
        private C0218f0 keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* JADX INFO: renamed from: af.j0$c$a */
        public static final class a extends AbstractC2967y.a<c, a> implements InterfaceC2957t0 {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: af.j0.c.a.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ a(a aVar) {
                this();
            }

            /* JADX INFO: renamed from: C */
            public a m824C(C0218f0.b bVar) {
                m14345r();
                ((c) this.f11133b).m821k0(bVar.build());
                return this;
            }

            /* JADX INFO: renamed from: D */
            public a m825D(C0218f0 c0218f0) {
                m14345r();
                ((c) this.f11133b).m821k0(c0218f0);
                return this;
            }

            /* JADX INFO: renamed from: E */
            public a m826E(int i10) {
                m14345r();
                ((c) this.f11133b).m822l0(i10);
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0.a
            /* JADX INFO: renamed from: F */
            public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo575F(AbstractC2923i abstractC2923i, C2944p c2944p) {
                return super.mo575F(abstractC2923i, c2944p);
            }

            /* JADX INFO: renamed from: G */
            public a m827G(EnumC0238p0 enumC0238p0) {
                m14345r();
                ((c) this.f11133b).m815m0(enumC0238p0);
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899a.a, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0.a
            /* JADX INFO: renamed from: H */
            public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo576H(InterfaceC2954s0 interfaceC2954s0) {
                return super.mo576H(interfaceC2954s0);
            }

            /* JADX INFO: renamed from: J */
            public a m828J(EnumC0220g0 enumC0220g0) {
                m14345r();
                ((c) this.f11133b).m823n0(enumC0220g0);
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0.a
            public /* bridge */ /* synthetic */ InterfaceC2954s0 build() {
                return super.build();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y.a
            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0.a
            /* JADX INFO: renamed from: d */
            public /* bridge */ /* synthetic */ InterfaceC2954s0 mo577d() {
                return super.mo577d();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0
            /* JADX INFO: renamed from: f */
            public /* bridge */ /* synthetic */ InterfaceC2954s0 mo569f() {
                return super.mo569f();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y.a, com.google.crypto.tink.shaded.protobuf.AbstractC2899a.a
            /* JADX INFO: renamed from: j */
            public /* bridge */ /* synthetic */ AbstractC2899a.a mo578j(AbstractC2899a abstractC2899a) {
                return super.mo578j((AbstractC2967y) abstractC2899a);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC2967y.m14319W(c.class, cVar);
        }

        /* JADX INFO: renamed from: j0 */
        public static a m814j0() {
            return DEFAULT_INSTANCE.m14336v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m0 */
        public void m815m0(EnumC0238p0 enumC0238p0) {
            this.outputPrefixType_ = enumC0238p0.getNumber();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo564a() {
            return super.mo564a();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo567e() {
            return super.mo567e();
        }

        /* JADX INFO: renamed from: e0 */
        public C0218f0 m816e0() {
            C0218f0 c0218f0 = this.keyData_;
            return c0218f0 == null ? C0218f0.m719d0() : c0218f0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0
        /* JADX INFO: renamed from: f */
        public /* bridge */ /* synthetic */ InterfaceC2954s0 mo569f() {
            return super.mo569f();
        }

        /* JADX INFO: renamed from: f0 */
        public int m817f0() {
            return this.keyId_;
        }

        /* JADX INFO: renamed from: g0 */
        public EnumC0238p0 m818g0() {
            EnumC0238p0 enumC0238p0M940a = EnumC0238p0.m940a(this.outputPrefixType_);
            return enumC0238p0M940a == null ? EnumC0238p0.UNRECOGNIZED : enumC0238p0M940a;
        }

        /* JADX INFO: renamed from: h0 */
        public EnumC0220g0 m819h0() {
            EnumC0220g0 enumC0220g0M743a = EnumC0220g0.m743a(this.status_);
            return enumC0220g0M743a == null ? EnumC0220g0.UNRECOGNIZED : enumC0220g0M743a;
        }

        /* JADX INFO: renamed from: i0 */
        public boolean m820i0() {
            return (this.bitField0_ & 1) != 0;
        }

        /* JADX INFO: renamed from: k0 */
        public final void m821k0(C0218f0 c0218f0) {
            c0218f0.getClass();
            this.keyData_ = c0218f0;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: renamed from: l0 */
        public final void m822l0(int i10) {
            this.keyId_ = i10;
        }

        /* JADX INFO: renamed from: n0 */
        public final void m823n0(EnumC0220g0 enumC0220g0) {
            this.status_ = enumC0220g0.getNumber();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y
        /* JADX INFO: renamed from: z */
        public final Object mo572z(AbstractC2967y.f fVar, Object obj, Object obj2) {
            InterfaceC2901a1 bVar;
            a aVar = null;
            switch (a.f657a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC2967y.m14312O(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC2901a1<c> interfaceC2901a1 = PARSER;
                    if (interfaceC2901a1 != null) {
                        return interfaceC2901a1;
                    }
                    synchronized (c.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new AbstractC2967y.b(DEFAULT_INSTANCE);
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
        C0226j0 c0226j0 = new C0226j0();
        DEFAULT_INSTANCE = c0226j0;
        AbstractC2967y.m14319W(C0226j0.class, c0226j0);
    }

    /* JADX INFO: renamed from: i0 */
    public static b m797i0() {
        return DEFAULT_INSTANCE.m14336v();
    }

    /* JADX INFO: renamed from: j0 */
    public static C0226j0 m798j0(InputStream inputStream, C2944p c2944p) {
        return (C0226j0) AbstractC2967y.m14314R(DEFAULT_INSTANCE, inputStream, c2944p);
    }

    /* JADX INFO: renamed from: k0 */
    public static C0226j0 m799k0(byte[] bArr, C2944p c2944p) {
        return (C0226j0) AbstractC2967y.m14315S(DEFAULT_INSTANCE, bArr, c2944p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo564a() {
        return super.mo564a();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m800c0(c cVar) {
        cVar.getClass();
        m801d0();
        this.key_.add(cVar);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m801d0() {
        C2900a0.i<c> iVar = this.key_;
        if (iVar.mo13389n()) {
            return;
        }
        this.key_ = AbstractC2967y.m14311M(iVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo567e() {
        return super.mo567e();
    }

    /* JADX INFO: renamed from: e0 */
    public c m802e0(int i10) {
        return this.key_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC2954s0 mo569f() {
        return super.mo569f();
    }

    /* JADX INFO: renamed from: f0 */
    public int m803f0() {
        return this.key_.size();
    }

    /* JADX INFO: renamed from: g0 */
    public List<c> m804g0() {
        return this.key_;
    }

    /* JADX INFO: renamed from: h0 */
    public int m805h0() {
        return this.primaryKeyId_;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m806l0(int i10) {
        this.primaryKeyId_ = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y
    /* JADX INFO: renamed from: z */
    public final Object mo572z(AbstractC2967y.f fVar, Object obj, Object obj2) {
        InterfaceC2901a1 bVar;
        a aVar = null;
        switch (a.f657a[fVar.ordinal()]) {
            case 1:
                return new C0226j0();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2967y.m14312O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2901a1<C0226j0> interfaceC2901a1 = PARSER;
                if (interfaceC2901a1 != null) {
                    return interfaceC2901a1;
                }
                synchronized (C0226j0.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC2967y.b(DEFAULT_INSTANCE);
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
