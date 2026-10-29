package af;

import com.google.crypto.tink.shaded.protobuf.AbstractC2899a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2923i;
import com.google.crypto.tink.shaded.protobuf.AbstractC2967y;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2901a1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0;

/* JADX INFO: renamed from: af.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C0219g extends AbstractC2967y<C0219g, b> implements InterfaceC2957t0 {
    private static final C0219g DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC2901a1<C0219g> PARSER;
    private int bitField0_;
    private int keySize_;
    private C0221h params_;

    /* JADX INFO: renamed from: af.g$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f643a;

        static {
            int[] iArr = new int[AbstractC2967y.f.values().length];
            f643a = iArr;
            try {
                iArr[AbstractC2967y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f643a[AbstractC2967y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f643a[AbstractC2967y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f643a[AbstractC2967y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f643a[AbstractC2967y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f643a[AbstractC2967y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f643a[AbstractC2967y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: af.g$b */
    public static final class b extends AbstractC2967y.a<C0219g, b> implements InterfaceC2957t0 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: af.g.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: C */
        public b m741C(int i10) {
            m14345r();
            ((C0219g) this.f11133b).m737g0(i10);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public b m742D(C0221h c0221h) {
            m14345r();
            ((C0219g) this.f11133b).m738h0(c0221h);
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
            super(C0219g.DEFAULT_INSTANCE);
        }
    }

    static {
        C0219g c0219g = new C0219g();
        DEFAULT_INSTANCE = c0219g;
        AbstractC2967y.m14319W(C0219g.class, c0219g);
    }

    /* JADX INFO: renamed from: c0 */
    public static C0219g m735c0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: f0 */
    public static b m736f0() {
        return DEFAULT_INSTANCE.m14336v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m737g0(int i10) {
        this.keySize_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public void m738h0(C0221h c0221h) {
        c0221h.getClass();
        this.params_ = c0221h;
        this.bitField0_ |= 1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo564a() {
        return super.mo564a();
    }

    /* JADX INFO: renamed from: d0 */
    public int m739d0() {
        return this.keySize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo567e() {
        return super.mo567e();
    }

    /* JADX INFO: renamed from: e0 */
    public C0221h m740e0() {
        C0221h c0221h = this.params_;
        return c0221h == null ? C0221h.m747b0() : c0221h;
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
        switch (a.f643a[fVar.ordinal()]) {
            case 1:
                return new C0219g();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2967y.m14312O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2901a1<C0219g> interfaceC2901a1 = PARSER;
                if (interfaceC2901a1 != null) {
                    return interfaceC2901a1;
                }
                synchronized (C0219g.class) {
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
