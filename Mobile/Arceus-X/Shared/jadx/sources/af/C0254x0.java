package af;

import com.google.crypto.tink.shaded.protobuf.AbstractC2899a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.AbstractC2923i;
import com.google.crypto.tink.shaded.protobuf.AbstractC2967y;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2901a1;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0;

/* JADX INFO: renamed from: af.x0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0254x0 extends AbstractC2967y<C0254x0, b> implements InterfaceC2957t0 {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final C0254x0 DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile InterfaceC2901a1<C0254x0> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC2920h crt_;

    /* JADX INFO: renamed from: d_ */
    private AbstractC2920h f706d_;
    private AbstractC2920h dp_;
    private AbstractC2920h dq_;

    /* JADX INFO: renamed from: p_ */
    private AbstractC2920h f707p_;
    private C0256y0 publicKey_;

    /* JADX INFO: renamed from: q_ */
    private AbstractC2920h f708q_;
    private int version_;

    /* JADX INFO: renamed from: af.x0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f709a;

        static {
            int[] iArr = new int[AbstractC2967y.f.values().length];
            f709a = iArr;
            try {
                iArr[AbstractC2967y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f709a[AbstractC2967y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f709a[AbstractC2967y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f709a[AbstractC2967y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f709a[AbstractC2967y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f709a[AbstractC2967y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f709a[AbstractC2967y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: af.x0$b */
    public static final class b extends AbstractC2967y.a<C0254x0, b> implements InterfaceC2957t0 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: af.x0.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: renamed from: C */
        public b m1153C(AbstractC2920h abstractC2920h) {
            m14345r();
            ((C0254x0) this.f11133b).m1138t0(abstractC2920h);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public b m1154D(AbstractC2920h abstractC2920h) {
            m14345r();
            ((C0254x0) this.f11133b).m1139u0(abstractC2920h);
            return this;
        }

        /* JADX INFO: renamed from: E */
        public b m1155E(AbstractC2920h abstractC2920h) {
            m14345r();
            ((C0254x0) this.f11133b).m1140v0(abstractC2920h);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0.a
        /* JADX INFO: renamed from: F */
        public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo575F(AbstractC2923i abstractC2923i, C2944p c2944p) {
            return super.mo575F(abstractC2923i, c2944p);
        }

        /* JADX INFO: renamed from: G */
        public b m1156G(AbstractC2920h abstractC2920h) {
            m14345r();
            ((C0254x0) this.f11133b).m1141w0(abstractC2920h);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899a.a, com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0.a
        /* JADX INFO: renamed from: H */
        public /* bridge */ /* synthetic */ InterfaceC2954s0.a mo576H(InterfaceC2954s0 interfaceC2954s0) {
            return super.mo576H(interfaceC2954s0);
        }

        /* JADX INFO: renamed from: J */
        public b m1157J(AbstractC2920h abstractC2920h) {
            m14345r();
            ((C0254x0) this.f11133b).m1142x0(abstractC2920h);
            return this;
        }

        /* JADX INFO: renamed from: K */
        public b m1158K(C0256y0 c0256y0) {
            m14345r();
            ((C0254x0) this.f11133b).m1152y0(c0256y0);
            return this;
        }

        /* JADX INFO: renamed from: N */
        public b m1159N(AbstractC2920h abstractC2920h) {
            m14345r();
            ((C0254x0) this.f11133b).m1143z0(abstractC2920h);
            return this;
        }

        /* JADX INFO: renamed from: O */
        public b m1160O(int i10) {
            m14345r();
            ((C0254x0) this.f11133b).m1125A0(i10);
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
        public b() {
            super(C0254x0.DEFAULT_INSTANCE);
        }
    }

    static {
        C0254x0 c0254x0 = new C0254x0();
        DEFAULT_INSTANCE = c0254x0;
        AbstractC2967y.m14319W(C0254x0.class, c0254x0);
    }

    public C0254x0() {
        AbstractC2920h abstractC2920h = AbstractC2920h.f10853b;
        this.f706d_ = abstractC2920h;
        this.f707p_ = abstractC2920h;
        this.f708q_ = abstractC2920h;
        this.dp_ = abstractC2920h;
        this.dq_ = abstractC2920h;
        this.crt_ = abstractC2920h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public void m1125A0(int i10) {
        this.version_ = i10;
    }

    /* JADX INFO: renamed from: q0 */
    public static b m1135q0() {
        return DEFAULT_INSTANCE.m14336v();
    }

    /* JADX INFO: renamed from: r0 */
    public static C0254x0 m1136r0(AbstractC2920h abstractC2920h, C2944p c2944p) {
        return (C0254x0) AbstractC2967y.m14313Q(DEFAULT_INSTANCE, abstractC2920h, c2944p);
    }

    /* JADX INFO: renamed from: s0 */
    public static InterfaceC2901a1<C0254x0> m1137s0() {
        return DEFAULT_INSTANCE.mo14177h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public void m1138t0(AbstractC2920h abstractC2920h) {
        abstractC2920h.getClass();
        this.crt_ = abstractC2920h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public void m1139u0(AbstractC2920h abstractC2920h) {
        abstractC2920h.getClass();
        this.f706d_ = abstractC2920h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public void m1140v0(AbstractC2920h abstractC2920h) {
        abstractC2920h.getClass();
        this.dp_ = abstractC2920h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public void m1141w0(AbstractC2920h abstractC2920h) {
        abstractC2920h.getClass();
        this.dq_ = abstractC2920h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public void m1142x0(AbstractC2920h abstractC2920h) {
        abstractC2920h.getClass();
        this.f707p_ = abstractC2920h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public void m1143z0(AbstractC2920h abstractC2920h) {
        abstractC2920h.getClass();
        this.f708q_ = abstractC2920h;
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

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y, com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC2954s0 mo569f() {
        return super.mo569f();
    }

    /* JADX INFO: renamed from: i0 */
    public AbstractC2920h m1144i0() {
        return this.crt_;
    }

    /* JADX INFO: renamed from: j0 */
    public AbstractC2920h m1145j0() {
        return this.f706d_;
    }

    /* JADX INFO: renamed from: k0 */
    public AbstractC2920h m1146k0() {
        return this.dp_;
    }

    /* JADX INFO: renamed from: l0 */
    public AbstractC2920h m1147l0() {
        return this.dq_;
    }

    /* JADX INFO: renamed from: m0 */
    public AbstractC2920h m1148m0() {
        return this.f707p_;
    }

    /* JADX INFO: renamed from: n0 */
    public C0256y0 m1149n0() {
        C0256y0 c0256y0 = this.publicKey_;
        return c0256y0 == null ? C0256y0.m1176e0() : c0256y0;
    }

    /* JADX INFO: renamed from: o0 */
    public AbstractC2920h m1150o0() {
        return this.f708q_;
    }

    /* JADX INFO: renamed from: p0 */
    public int m1151p0() {
        return this.version_;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m1152y0(C0256y0 c0256y0) {
        c0256y0.getClass();
        this.publicKey_ = c0256y0;
        this.bitField0_ |= 1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2967y
    /* JADX INFO: renamed from: z */
    public final Object mo572z(AbstractC2967y.f fVar, Object obj, Object obj2) {
        InterfaceC2901a1 bVar;
        a aVar = null;
        switch (a.f709a[fVar.ordinal()]) {
            case 1:
                return new C0254x0();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2967y.m14312O(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"bitField0_", "version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2901a1<C0254x0> interfaceC2901a1 = PARSER;
                if (interfaceC2901a1 != null) {
                    return interfaceC2901a1;
                }
                synchronized (C0254x0.class) {
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
