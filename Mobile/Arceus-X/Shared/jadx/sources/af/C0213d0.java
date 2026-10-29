package af;

import com.google.crypto.tink.shaded.protobuf.AbstractC2899a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.AbstractC2923i;
import com.google.crypto.tink.shaded.protobuf.AbstractC2967y;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2901a1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0;

/* JADX INFO: renamed from: af.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0213d0 extends AbstractC2967y<C0213d0, b> implements InterfaceC2957t0 {
    private static final C0213d0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC2901a1<C0213d0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int keySize_;
    private C0216e0 params_;
    private int version_;

    /* JADX INFO: renamed from: af.d0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f628a;

        static {
            int[] iArr = new int[AbstractC2967y.f.values().length];
            f628a = iArr;
            try {
                iArr[AbstractC2967y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f628a[AbstractC2967y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f628a[AbstractC2967y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f628a[AbstractC2967y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f628a[AbstractC2967y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f628a[AbstractC2967y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f628a[AbstractC2967y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: af.d0$b */
    public static final class b extends AbstractC2967y.a<C0213d0, b> implements InterfaceC2957t0 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: af.d0.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: C */
        public b m675C(int i10) {
            m14345r();
            ((C0213d0) this.f11133b).m670i0(i10);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public b m676D(C0216e0 c0216e0) {
            m14345r();
            ((C0213d0) this.f11133b).m671j0(c0216e0);
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
            super(C0213d0.DEFAULT_INSTANCE);
        }
    }

    static {
        C0213d0 c0213d0 = new C0213d0();
        DEFAULT_INSTANCE = c0213d0;
        AbstractC2967y.m14319W(C0213d0.class, c0213d0);
    }

    /* JADX INFO: renamed from: c0 */
    public static C0213d0 m667c0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static b m668g0() {
        return DEFAULT_INSTANCE.m14336v();
    }

    /* JADX INFO: renamed from: h0 */
    public static C0213d0 m669h0(AbstractC2920h abstractC2920h, C2944p c2944p) {
        return (C0213d0) AbstractC2967y.m14313Q(DEFAULT_INSTANCE, abstractC2920h, c2944p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public void m670i0(int i10) {
        this.keySize_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public void m671j0(C0216e0 c0216e0) {
        c0216e0.getClass();
        this.params_ = c0216e0;
        this.bitField0_ |= 1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo564a() {
        return super.mo564a();
    }

    /* JADX INFO: renamed from: d0 */
    public int m672d0() {
        return this.keySize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo567e() {
        return super.mo567e();
    }

    /* JADX INFO: renamed from: e0 */
    public C0216e0 m673e0() {
        C0216e0 c0216e0 = this.params_;
        return c0216e0 == null ? C0216e0.m695c0() : c0216e0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC2954s0 mo569f() {
        return super.mo569f();
    }

    /* JADX INFO: renamed from: f0 */
    public int m674f0() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y
    /* JADX INFO: renamed from: z */
    public final Object mo572z(AbstractC2967y.f fVar, Object obj, Object obj2) {
        InterfaceC2901a1 bVar;
        a aVar = null;
        switch (a.f628a[fVar.ordinal()]) {
            case 1:
                return new C0213d0();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2967y.m14312O(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2901a1<C0213d0> interfaceC2901a1 = PARSER;
                if (interfaceC2901a1 != null) {
                    return interfaceC2901a1;
                }
                synchronized (C0213d0.class) {
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
