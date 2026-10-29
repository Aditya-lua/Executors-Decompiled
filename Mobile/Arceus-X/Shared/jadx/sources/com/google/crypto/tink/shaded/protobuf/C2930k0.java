package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2930k0 implements InterfaceC2922h1 {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2951r0 f10931b = new a();

    /* JADX INFO: renamed from: a */
    public final InterfaceC2951r0 f10932a;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k0$a */
    public class a implements InterfaceC2951r0 {
        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2951r0
        /* JADX INFO: renamed from: a */
        public InterfaceC2948q0 mo13876a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2951r0
        /* JADX INFO: renamed from: b */
        public boolean mo13877b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k0$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10933a;

        static {
            int[] iArr = new int[EnumC2904b1.values().length];
            f10933a = iArr;
            try {
                iArr[EnumC2904b1.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k0$c */
    public static class c implements InterfaceC2951r0 {

        /* JADX INFO: renamed from: a */
        public InterfaceC2951r0[] f10934a;

        public c(InterfaceC2951r0... interfaceC2951r0Arr) {
            this.f10934a = interfaceC2951r0Arr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2951r0
        /* JADX INFO: renamed from: a */
        public InterfaceC2948q0 mo13876a(Class<?> cls) {
            for (InterfaceC2951r0 interfaceC2951r0 : this.f10934a) {
                if (interfaceC2951r0.mo13877b(cls)) {
                    return interfaceC2951r0.mo13876a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2951r0
        /* JADX INFO: renamed from: b */
        public boolean mo13877b(Class<?> cls) {
            for (InterfaceC2951r0 interfaceC2951r0 : this.f10934a) {
                if (interfaceC2951r0.mo13877b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2930k0() {
        this(m13872c());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13871b(InterfaceC2948q0 interfaceC2948q0) {
        return b.f10933a[interfaceC2948q0.mo13477c().ordinal()] != 1;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC2951r0 m13872c() {
        return new c(C2965x.m14305c(), m13873d());
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC2951r0 m13873d() {
        if (C2907c1.f10823d) {
            return f10931b;
        }
        try {
            return (InterfaceC2951r0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f10931b;
        }
    }

    /* JADX INFO: renamed from: e */
    public static <T> InterfaceC2919g1<T> m13874e(Class<T> cls, InterfaceC2948q0 interfaceC2948q0) {
        if (m13875f(cls)) {
            return C2962v0.m14225S(cls, interfaceC2948q0, C2970z0.m14372b(), C2924i0.m13648b(), C2925i1.m13661L(), m13871b(interfaceC2948q0) ? C2953s.m14174b() : null, C2945p0.m14038b());
        }
        InterfaceC2966x0 interfaceC2966x0M14371a = C2970z0.m14371a();
        AbstractC2947q<?> abstractC2947qM14173a = null;
        InterfaceC2918g0 interfaceC2918g0M13647a = C2924i0.m13647a();
        AbstractC2940n1<?, ?> abstractC2940n1M13660K = C2925i1.m13660K();
        if (m13871b(interfaceC2948q0)) {
            abstractC2947qM14173a = C2953s.m14173a();
        }
        return C2962v0.m14225S(cls, interfaceC2948q0, interfaceC2966x0M14371a, interfaceC2918g0M13647a, abstractC2940n1M13660K, abstractC2947qM14173a, C2945p0.m14037a());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m13875f(Class<?> cls) {
        return C2907c1.f10823d || AbstractC2967y.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2922h1
    /* JADX INFO: renamed from: a */
    public <T> InterfaceC2919g1<T> mo13580a(Class<T> cls) {
        C2925i1.m13657H(cls);
        InterfaceC2948q0 interfaceC2948q0Mo13876a = this.f10932a.mo13876a(cls);
        if (interfaceC2948q0Mo13876a.mo13475a()) {
            return m13875f(cls) ? C2964w0.m14302m(C2925i1.m13661L(), C2953s.m14174b(), interfaceC2948q0Mo13876a.mo13476b()) : C2964w0.m14302m(C2925i1.m13660K(), C2953s.m14173a(), interfaceC2948q0Mo13876a.mo13476b());
        }
        return m13874e(cls, interfaceC2948q0Mo13876a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2930k0(InterfaceC2951r0 interfaceC2951r0) {
        this.f10932a = (InterfaceC2951r0) C2900a0.m13380b(interfaceC2951r0, "messageInfoFactory");
    }
}
