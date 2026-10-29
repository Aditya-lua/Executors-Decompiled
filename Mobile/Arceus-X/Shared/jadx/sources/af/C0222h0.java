package af;

import com.google.crypto.tink.shaded.protobuf.AbstractC2899a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.AbstractC2923i;
import com.google.crypto.tink.shaded.protobuf.AbstractC2967y;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2901a1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0;

/* JADX INFO: renamed from: af.h0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0222h0 extends AbstractC2967y<C0222h0, b> implements InterfaceC2957t0 {
    private static final C0222h0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC2901a1<C0222h0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC2920h value_ = AbstractC2920h.f10853b;

    /* JADX INFO: renamed from: af.h0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f653a;

        static {
            int[] iArr = new int[AbstractC2967y.f.values().length];
            f653a = iArr;
            try {
                iArr[AbstractC2967y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f653a[AbstractC2967y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f653a[AbstractC2967y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f653a[AbstractC2967y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f653a[AbstractC2967y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f653a[AbstractC2967y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f653a[AbstractC2967y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: af.h0$b */
    public static final class b extends AbstractC2967y.a<C0222h0, b> implements InterfaceC2957t0 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: af.h0.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: C */
        public b m766C(EnumC0238p0 enumC0238p0) {
            m14345r();
            ((C0222h0) this.f11133b).m765k0(enumC0238p0);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public b m767D(String str) {
            m14345r();
            ((C0222h0) this.f11133b).m760l0(str);
            return this;
        }

        /* JADX INFO: renamed from: E */
        public b m768E(AbstractC2920h abstractC2920h) {
            m14345r();
            ((C0222h0) this.f11133b).m761m0(abstractC2920h);
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
            super(C0222h0.DEFAULT_INSTANCE);
        }
    }

    static {
        C0222h0 c0222h0 = new C0222h0();
        DEFAULT_INSTANCE = c0222h0;
        AbstractC2967y.m14319W(C0222h0.class, c0222h0);
    }

    /* JADX INFO: renamed from: d0 */
    public static C0222h0 m756d0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: h0 */
    public static b m757h0() {
        return DEFAULT_INSTANCE.m14336v();
    }

    /* JADX INFO: renamed from: i0 */
    public static b m758i0(C0222h0 c0222h0) {
        return DEFAULT_INSTANCE.m14337w(c0222h0);
    }

    /* JADX INFO: renamed from: j0 */
    public static C0222h0 m759j0(byte[] bArr, C2944p c2944p) {
        return (C0222h0) AbstractC2967y.m14315S(DEFAULT_INSTANCE, bArr, c2944p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public void m760l0(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public void m761m0(AbstractC2920h abstractC2920h) {
        abstractC2920h.getClass();
        this.value_ = abstractC2920h;
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
    public EnumC0238p0 m762e0() {
        EnumC0238p0 enumC0238p0M940a = EnumC0238p0.m940a(this.outputPrefixType_);
        return enumC0238p0M940a == null ? EnumC0238p0.UNRECOGNIZED : enumC0238p0M940a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC2954s0 mo569f() {
        return super.mo569f();
    }

    /* JADX INFO: renamed from: f0 */
    public String m763f0() {
        return this.typeUrl_;
    }

    /* JADX INFO: renamed from: g0 */
    public AbstractC2920h m764g0() {
        return this.value_;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m765k0(EnumC0238p0 enumC0238p0) {
        this.outputPrefixType_ = enumC0238p0.getNumber();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y
    /* JADX INFO: renamed from: z */
    public final Object mo572z(AbstractC2967y.f fVar, Object obj, Object obj2) {
        InterfaceC2901a1 bVar;
        a aVar = null;
        switch (a.f653a[fVar.ordinal()]) {
            case 1:
                return new C0222h0();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2967y.m14312O(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2901a1<C0222h0> interfaceC2901a1 = PARSER;
                if (interfaceC2901a1 != null) {
                    return interfaceC2901a1;
                }
                synchronized (C0222h0.class) {
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
