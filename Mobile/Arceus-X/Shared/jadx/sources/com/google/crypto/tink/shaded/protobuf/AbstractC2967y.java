package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC2967y;
import com.google.crypto.tink.shaded.protobuf.AbstractC2967y.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.y */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2967y<MessageType extends AbstractC2967y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC2899a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC2967y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C2943o1 unknownFields = C2943o1.m14017c();

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.y$a */
    public static abstract class a<MessageType extends AbstractC2967y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC2899a.a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a */
        public final MessageType f11132a;

        /* JADX INFO: renamed from: b */
        public MessageType f11133b;

        public a(MessageType messagetype) {
            this.f11132a = messagetype;
            if (messagetype.m14324J()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f11133b = (MessageType) m14340A();
        }

        /* JADX INFO: renamed from: A */
        private MessageType m14340A() {
            return (MessageType) this.f11132a.m14328P();
        }

        /* JADX INFO: renamed from: z */
        public static <MessageType> void m14341z(MessageType messagetype, MessageType messagetype2) {
            C2907c1.m13412a().m13415d(messagetype).mo13540a(messagetype, messagetype2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0
        public final boolean isInitialized() {
            return AbstractC2967y.m14310I(this.f11133b, false);
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/google/crypto/tink/shaded/protobuf/s0; */
        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) mo577d();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw AbstractC2899a.a.m13377n(messagetype);
        }

        /* JADX DEBUG: Method merged with bridge method: d()Lcom/google/crypto/tink/shaded/protobuf/s0; */
        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public MessageType mo577d() {
            if (!this.f11133b.m14324J()) {
                return this.f11133b;
            }
            this.f11133b.m14325K();
            return this.f11133b;
        }

        /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
        @Override // 
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) mo569f().mo567e();
            buildertype.f11133b = (MessageType) mo577d();
            return buildertype;
        }

        /* JADX INFO: renamed from: r */
        public final void m14345r() {
            if (this.f11133b.m14324J()) {
                return;
            }
            m14346s();
        }

        /* JADX INFO: renamed from: s */
        public void m14346s() {
            MessageType messagetype = (MessageType) m14340A();
            m14341z(messagetype, this.f11133b);
            this.f11133b = messagetype;
        }

        /* JADX DEBUG: Method merged with bridge method: f()Lcom/google/crypto/tink/shaded/protobuf/s0; */
        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public MessageType mo569f() {
            return this.f11132a;
        }

        /* JADX DEBUG: Method merged with bridge method: j(Lcom/google/crypto/tink/shaded/protobuf/a;)Lcom/google/crypto/tink/shaded/protobuf/a$a; */
        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899a.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public BuilderType mo578j(MessageType messagetype) {
            return (BuilderType) m14350x(messagetype);
        }

        /* JADX DEBUG: Method merged with bridge method: F(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/s0$a; */
        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public BuilderType mo575F(AbstractC2923i abstractC2923i, C2944p c2944p) throws IOException {
            m14345r();
            try {
                C2907c1.m13412a().m13415d(this.f11133b).mo13548i(this.f11133b, C2926j.m13706Q(abstractC2923i), c2944p);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        /* JADX INFO: renamed from: x */
        public BuilderType m14350x(MessageType messagetype) {
            if (mo569f().equals(messagetype)) {
                return this;
            }
            m14345r();
            m14341z(this.f11133b, messagetype);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.y$b */
    public static class b<T extends AbstractC2967y<T, ?>> extends AbstractC2902b<T> {

        /* JADX INFO: renamed from: b */
        public final T f11134b;

        public b(T t8) {
            this.f11134b = t8;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Ljava/lang/Object; */
        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2901a1
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T mo13391a(AbstractC2923i abstractC2923i, C2944p c2944p) {
            return (T) AbstractC2967y.m14317U(this.f11134b, abstractC2923i, c2944p);
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.y$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC2967y<MessageType, BuilderType> implements InterfaceC2957t0 {
        protected C2959u<d> extensions = C2959u.m14187h();

        /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: com.google.crypto.tink.shaded.protobuf.u<T extends com.google.crypto.tink.shaded.protobuf.u$b<T>>, com.google.crypto.tink.shaded.protobuf.u<com.google.crypto.tink.shaded.protobuf.y$d> */
        /* JADX INFO: renamed from: Z */
        public C2959u<d> m14352Z() {
            if (this.extensions.m14200n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
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
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.y$d */
    public static final class d implements C2959u.b<d> {

        /* JADX INFO: renamed from: a */
        public final C2900a0.d<?> f11135a;

        /* JADX INFO: renamed from: b */
        public final int f11136b;

        /* JADX INFO: renamed from: c */
        public final C2955s1.b f11137c;

        /* JADX INFO: renamed from: d */
        public final boolean f11138d;

        /* JADX INFO: renamed from: e */
        public final boolean f11139e;

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f11136b - dVar.f11136b;
        }

        /* JADX INFO: renamed from: b */
        public C2900a0.d<?> m14354b() {
            return this.f11135a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2959u.b
        /* JADX INFO: renamed from: f */
        public boolean mo14208f() {
            return this.f11138d;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2959u.b
        /* JADX INFO: renamed from: g */
        public C2955s1.b mo14209g() {
            return this.f11137c;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2959u.b
        public int getNumber() {
            return this.f11136b;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.google.crypto.tink.shaded.protobuf.y$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.C2959u.b
        /* JADX INFO: renamed from: i */
        public InterfaceC2954s0.a mo14210i(InterfaceC2954s0.a aVar, InterfaceC2954s0 interfaceC2954s0) {
            return ((a) aVar).m14350x((AbstractC2967y) interfaceC2954s0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2959u.b
        /* JADX INFO: renamed from: k */
        public C2955s1.c mo14211k() {
            return this.f11137c.m14182a();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2959u.b
        /* JADX INFO: renamed from: m */
        public boolean mo14212m() {
            return this.f11139e;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.y$e */
    public static class e<ContainingType extends InterfaceC2954s0, Type> extends AbstractC2938n<ContainingType, Type> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2954s0 f11140a;

        /* JADX INFO: renamed from: b */
        public final d f11141b;

        /* JADX INFO: renamed from: a */
        public C2955s1.b m14355a() {
            return this.f11141b.mo14209g();
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC2954s0 m14356b() {
            return this.f11140a;
        }

        /* JADX INFO: renamed from: c */
        public int m14357c() {
            return this.f11141b.getNumber();
        }

        /* JADX INFO: renamed from: d */
        public boolean m14358d() {
            return this.f11141b.f11138d;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.y$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: renamed from: A */
    public static <E> C2900a0.i<E> m14307A() {
        return C2910d1.m13423c();
    }

    /* JADX INFO: renamed from: B */
    public static <T extends AbstractC2967y<?, ?>> T m14308B(Class<T> cls) {
        T t8 = (T) defaultInstanceMap.get(cls);
        if (t8 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t8 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t8 != null) {
            return t8;
        }
        T t10 = (T) ((AbstractC2967y) C2949q1.m14096k(cls)).mo569f();
        if (t10 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t10);
        return t10;
    }

    /* JADX INFO: renamed from: G */
    public static Object m14309G(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final <T extends AbstractC2967y<T, ?>> boolean m14310I(T t8, boolean z10) {
        byte bByteValue = ((Byte) t8.m14338x(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo13542c = C2907c1.m13412a().m13415d(t8).mo13542c(t8);
        if (z10) {
            t8.m14339y(f.SET_MEMOIZED_IS_INITIALIZED, zMo13542c ? t8 : null);
        }
        return zMo13542c;
    }

    /* JADX INFO: renamed from: M */
    public static <E> C2900a0.i<E> m14311M(C2900a0.i<E> iVar) {
        int size = iVar.size();
        return iVar.mo13390o(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: renamed from: O */
    public static Object m14312O(InterfaceC2954s0 interfaceC2954s0, String str, Object[] objArr) {
        return new C2913e1(interfaceC2954s0, str, objArr);
    }

    /* JADX INFO: renamed from: Q */
    public static <T extends AbstractC2967y<T, ?>> T m14313Q(T t8, AbstractC2920h abstractC2920h, C2944p c2944p) {
        return (T) m14320q(m14316T(t8, abstractC2920h, c2944p));
    }

    /* JADX INFO: renamed from: R */
    public static <T extends AbstractC2967y<T, ?>> T m14314R(T t8, InputStream inputStream, C2944p c2944p) {
        return (T) m14320q(m14317U(t8, AbstractC2923i.m13583g(inputStream), c2944p));
    }

    /* JADX INFO: renamed from: S */
    public static <T extends AbstractC2967y<T, ?>> T m14315S(T t8, byte[] bArr, C2944p c2944p) {
        return (T) m14320q(m14318V(t8, bArr, 0, bArr.length, c2944p));
    }

    /* JADX INFO: renamed from: T */
    public static <T extends AbstractC2967y<T, ?>> T m14316T(T t8, AbstractC2920h abstractC2920h, C2944p c2944p) throws C2903b0 {
        AbstractC2923i abstractC2923iMo13565m = abstractC2920h.mo13565m();
        T t10 = (T) m14317U(t8, abstractC2923iMo13565m, c2944p);
        try {
            abstractC2923iMo13565m.mo13595a(0);
            return t10;
        } catch (C2903b0 e10) {
            throw e10.m13409k(t10);
        }
    }

    /* JADX INFO: renamed from: U */
    public static <T extends AbstractC2967y<T, ?>> T m14317U(T t8, AbstractC2923i abstractC2923i, C2944p c2944p) throws C2903b0 {
        T t10 = (T) t8.m14328P();
        try {
            InterfaceC2919g1 interfaceC2919g1M13415d = C2907c1.m13412a().m13415d(t10);
            interfaceC2919g1M13415d.mo13548i(t10, C2926j.m13706Q(abstractC2923i), c2944p);
            interfaceC2919g1M13415d.mo13541b(t10);
            return t10;
        } catch (C2903b0 e10) {
            e = e10;
            if (e.m13407a()) {
                e = new C2903b0(e);
            }
            throw e.m13409k(t10);
        } catch (C2937m1 e11) {
            throw e11.m13983a().m13409k(t10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C2903b0) {
                throw ((C2903b0) e12.getCause());
            }
            throw new C2903b0(e12).m13409k(t10);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C2903b0) {
                throw ((C2903b0) e13.getCause());
            }
            throw e13;
        }
    }

    /* JADX INFO: renamed from: V */
    public static <T extends AbstractC2967y<T, ?>> T m14318V(T t8, byte[] bArr, int i10, int i11, C2944p c2944p) throws C2903b0 {
        if (i11 == 0) {
            return t8;
        }
        T t10 = (T) t8.m14328P();
        try {
            InterfaceC2919g1 interfaceC2919g1M13415d = C2907c1.m13412a().m13415d(t10);
            interfaceC2919g1M13415d.mo13547h(t10, bArr, i10, i10 + i11, new C2911e.b(c2944p));
            interfaceC2919g1M13415d.mo13541b(t10);
            return t10;
        } catch (C2903b0 e10) {
            C2903b0 c2903b0 = e10;
            if (c2903b0.m13407a()) {
                c2903b0 = new C2903b0(c2903b0);
            }
            throw c2903b0.m13409k(t10);
        } catch (C2937m1 e11) {
            throw e11.m13983a().m13409k(t10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C2903b0) {
                throw ((C2903b0) e12.getCause());
            }
            throw new C2903b0(e12).m13409k(t10);
        } catch (IndexOutOfBoundsException unused) {
            throw C2903b0.m13406m().m13409k(t10);
        }
    }

    /* JADX INFO: renamed from: W */
    public static <T extends AbstractC2967y<?, ?>> void m14319W(Class<T> cls, T t8) {
        t8.m14326L();
        defaultInstanceMap.put(cls, t8);
    }

    /* JADX INFO: renamed from: q */
    public static <T extends AbstractC2967y<T, ?>> T m14320q(T t8) throws C2903b0 {
        if (t8 == null || t8.isInitialized()) {
            return t8;
        }
        throw t8.m13373l().m13983a().m13409k(t8);
    }

    /* JADX DEBUG: Method merged with bridge method: f()Lcom/google/crypto/tink/shaded/protobuf/s0; */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final MessageType mo569f() {
        return (MessageType) m14338x(f.GET_DEFAULT_INSTANCE);
    }

    /* JADX INFO: renamed from: D */
    public int m14322D() {
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: E */
    public boolean m14323E() {
        return m14322D() == 0;
    }

    /* JADX INFO: renamed from: J */
    public boolean m14324J() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: K */
    public void m14325K() {
        C2907c1.m13412a().m13415d(this).mo13541b(this);
        m14326L();
    }

    /* JADX INFO: renamed from: L */
    public void m14326L() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Method merged with bridge method: e()Lcom/google/crypto/tink/shaded/protobuf/s0$a; */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final BuilderType mo567e() {
        return (BuilderType) m14338x(f.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: P */
    public MessageType m14328P() {
        return (MessageType) m14338x(f.NEW_MUTABLE_INSTANCE);
    }

    /* JADX INFO: renamed from: X */
    public void m14329X(int i10) {
        this.memoizedHashCode = i10;
    }

    /* JADX DEBUG: Method merged with bridge method: a()Lcom/google/crypto/tink/shaded/protobuf/s0$a; */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final BuilderType mo564a() {
        return (BuilderType) ((a) m14338x(f.NEW_BUILDER)).m14350x(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
    /* JADX INFO: renamed from: c */
    public int mo14176c() {
        return mo13371j(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C2907c1.m13412a().m13415d(this).mo13546g(this, (AbstractC2967y) obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899a
    /* JADX INFO: renamed from: g */
    public int mo13370g() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
    /* JADX INFO: renamed from: h */
    public final InterfaceC2901a1<MessageType> mo14177h() {
        return (InterfaceC2901a1) m14338x(f.GET_PARSER);
    }

    public int hashCode() {
        if (m14324J()) {
            return m14334t();
        }
        if (m14323E()) {
            m14329X(m14334t());
        }
        return m14322D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2954s0
    /* JADX INFO: renamed from: i */
    public void mo14178i(AbstractC2929k abstractC2929k) {
        C2907c1.m13412a().m13415d(this).mo13549j(this, C2932l.m13880P(abstractC2929k));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2957t0
    public final boolean isInitialized() {
        return m14310I(this, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899a
    /* JADX INFO: renamed from: j */
    public int mo13371j(InterfaceC2919g1 interfaceC2919g1) {
        if (!m14324J()) {
            if (mo13370g() != Integer.MAX_VALUE) {
                return mo13370g();
            }
            int iM14335u = m14335u(interfaceC2919g1);
            mo13374m(iM14335u);
            return iM14335u;
        }
        int iM14335u2 = m14335u(interfaceC2919g1);
        if (iM14335u2 >= 0) {
            return iM14335u2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iM14335u2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2899a
    /* JADX INFO: renamed from: m */
    public void mo13374m(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    /* JADX INFO: renamed from: p */
    public Object m14331p() {
        return m14338x(f.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: renamed from: r */
    public void m14332r() {
        this.memoizedHashCode = 0;
    }

    /* JADX INFO: renamed from: s */
    public void m14333s() {
        mo13374m(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: t */
    public int m14334t() {
        return C2907c1.m13412a().m13415d(this).mo13545f(this);
    }

    public String toString() {
        return C2960u0.m14218f(this, super.toString());
    }

    /* JADX INFO: renamed from: u */
    public final int m14335u(InterfaceC2919g1<?> interfaceC2919g1) {
        return interfaceC2919g1 == null ? C2907c1.m13412a().m13415d(this).mo13543d(this) : interfaceC2919g1.mo13543d(this);
    }

    /* JADX INFO: renamed from: v */
    public final <MessageType extends AbstractC2967y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType m14336v() {
        return (BuilderType) m14338x(f.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: w */
    public final <MessageType extends AbstractC2967y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType m14337w(MessageType messagetype) {
        return (BuilderType) m14336v().m14350x(messagetype);
    }

    /* JADX INFO: renamed from: x */
    public Object m14338x(f fVar) {
        return mo572z(fVar, null, null);
    }

    /* JADX INFO: renamed from: y */
    public Object m14339y(f fVar, Object obj) {
        return mo572z(fVar, obj, null);
    }

    /* JADX INFO: renamed from: z */
    public abstract Object mo572z(f fVar, Object obj, Object obj2);
}
