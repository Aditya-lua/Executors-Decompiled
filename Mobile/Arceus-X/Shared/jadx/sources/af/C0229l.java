package af;

import com.google.crypto.tink.shaded.protobuf.AbstractC2899a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.AbstractC2923i;
import com.google.crypto.tink.shaded.protobuf.AbstractC2967y;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2901a1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0;

/* JADX INFO: renamed from: af.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C0229l extends AbstractC2967y<C0229l, b> implements InterfaceC2957t0 {
    private static final C0229l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile InterfaceC2901a1<C0229l> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC2920h keyValue_ = AbstractC2920h.f10853b;
    private int version_;

    /* JADX INFO: renamed from: af.l$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f660a;

        static {
            int[] iArr = new int[AbstractC2967y.f.values().length];
            f660a = iArr;
            try {
                iArr[AbstractC2967y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f660a[AbstractC2967y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f660a[AbstractC2967y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f660a[AbstractC2967y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f660a[AbstractC2967y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f660a[AbstractC2967y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f660a[AbstractC2967y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: af.l$b */
    public static final class b extends AbstractC2967y.a<C0229l, b> implements InterfaceC2957t0 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: af.l.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: C */
        public b m867C(AbstractC2920h abstractC2920h) {
            m14345r();
            ((C0229l) this.f11133b).m864g0(abstractC2920h);
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
            super(C0229l.DEFAULT_INSTANCE);
        }
    }

    static {
        C0229l c0229l = new C0229l();
        DEFAULT_INSTANCE = c0229l;
        AbstractC2967y.m14319W(C0229l.class, c0229l);
    }

    /* JADX INFO: renamed from: d0 */
    public static b m861d0() {
        return DEFAULT_INSTANCE.m14336v();
    }

    /* JADX INFO: renamed from: e0 */
    public static C0229l m862e0(AbstractC2920h abstractC2920h, C2944p c2944p) {
        return (C0229l) AbstractC2967y.m14313Q(DEFAULT_INSTANCE, abstractC2920h, c2944p);
    }

    /* JADX INFO: renamed from: f0 */
    public static InterfaceC2901a1<C0229l> m863f0() {
        return DEFAULT_INSTANCE.mo14177h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m864g0(AbstractC2920h abstractC2920h) {
        abstractC2920h.getClass();
        this.keyValue_ = abstractC2920h;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo564a() {
        return super.mo564a();
    }

    /* JADX INFO: renamed from: b0 */
    public AbstractC2920h m865b0() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: c0 */
    public int m866c0() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo567e() {
        return super.mo567e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC2954s0 mo569f() {
        return super.mo569f();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y
    /* JADX INFO: renamed from: z */
    public final Object mo572z(AbstractC2967y.f fVar, Object obj, Object obj2) {
        InterfaceC2901a1 bVar;
        a aVar = null;
        switch (a.f660a[fVar.ordinal()]) {
            case 1:
                return new C0229l();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2967y.m14312O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2901a1<C0229l> interfaceC2901a1 = PARSER;
                if (interfaceC2901a1 != null) {
                    return interfaceC2901a1;
                }
                synchronized (C0229l.class) {
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
