package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0850j0 implements InterfaceC0845h1 {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0871q0 f2915b = new a();

    /* JADX INFO: renamed from: a */
    public final InterfaceC0871q0 f2916a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j0$a */
    public class a implements InterfaceC0871q0 {
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0871q0
        /* JADX INFO: renamed from: a */
        public InterfaceC0868p0 mo3748a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0871q0
        /* JADX INFO: renamed from: b */
        public boolean mo3749b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j0$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2917a;

        static {
            int[] iArr = new int[EnumC0827b1.values().length];
            f2917a = iArr;
            try {
                iArr[EnumC0827b1.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j0$c */
    public static class c implements InterfaceC0871q0 {

        /* JADX INFO: renamed from: a */
        public InterfaceC0871q0[] f2918a;

        public c(InterfaceC0871q0... interfaceC0871q0Arr) {
            this.f2918a = interfaceC0871q0Arr;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0871q0
        /* JADX INFO: renamed from: a */
        public InterfaceC0868p0 mo3748a(Class<?> cls) {
            for (InterfaceC0871q0 interfaceC0871q0 : this.f2918a) {
                if (interfaceC0871q0.mo3749b(cls)) {
                    return interfaceC0871q0.mo3748a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0871q0
        /* JADX INFO: renamed from: b */
        public boolean mo3749b(Class<?> cls) {
            for (InterfaceC0871q0 interfaceC0871q0 : this.f2918a) {
                if (interfaceC0871q0.mo3749b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0850j0() {
        this(m3744c());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3743b(InterfaceC0868p0 interfaceC0868p0) {
        return b.f2917a[interfaceC0868p0.mo3389c().ordinal()] != 1;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0871q0 m3744c() {
        return new c(C0886w.m4170c(), m3745d());
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC0871q0 m3745d() {
        if (C0830c1.f2837d) {
            return f2915b;
        }
        try {
            return (InterfaceC0871q0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f2915b;
        }
    }

    /* JADX INFO: renamed from: e */
    public static <T> InterfaceC0842g1<T> m3746e(Class<T> cls, InterfaceC0868p0 interfaceC0868p0) {
        if (m3747f(cls)) {
            return C0883u0.m4106O(cls, interfaceC0868p0, C0891y0.m4234b(), C0844h0.m3544b(), C0848i1.m3581L(), m3743b(interfaceC0868p0) ? C0873r.m4023b() : null, C0865o0.m3914b());
        }
        InterfaceC0887w0 interfaceC0887w0M4233a = C0891y0.m4233a();
        AbstractC0867p<?> abstractC0867pM4022a = null;
        InterfaceC0838f0 interfaceC0838f0M3543a = C0844h0.m3543a();
        AbstractC0863n1<?, ?> abstractC0863n1M3580K = C0848i1.m3580K();
        if (m3743b(interfaceC0868p0)) {
            abstractC0867pM4022a = C0873r.m4022a();
        }
        return C0883u0.m4106O(cls, interfaceC0868p0, interfaceC0887w0M4233a, interfaceC0838f0M3543a, abstractC0863n1M3580K, abstractC0867pM4022a, C0865o0.m3913a());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m3747f(Class<?> cls) {
        return C0830c1.f2837d || AbstractC0888x.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0845h1
    /* JADX INFO: renamed from: a */
    public <T> InterfaceC0842g1<T> mo3546a(Class<T> cls) {
        C0848i1.m3577H(cls);
        InterfaceC0868p0 interfaceC0868p0Mo3748a = this.f2916a.mo3748a(cls);
        if (interfaceC0868p0Mo3748a.mo3387a()) {
            return m3747f(cls) ? C0885v0.m4167l(C0848i1.m3581L(), C0873r.m4023b(), interfaceC0868p0Mo3748a.mo3388b()) : C0885v0.m4167l(C0848i1.m3580K(), C0873r.m4022a(), interfaceC0868p0Mo3748a.mo3388b());
        }
        return m3746e(cls, interfaceC0868p0Mo3748a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0850j0(InterfaceC0871q0 interfaceC0871q0) {
        this.f2916a = (InterfaceC0871q0) C0892z.m4237b(interfaceC0871q0, "messageInfoFactory");
    }
}
