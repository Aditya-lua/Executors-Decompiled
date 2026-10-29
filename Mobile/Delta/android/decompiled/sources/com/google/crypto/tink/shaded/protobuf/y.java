package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.y.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected o1 unknownFields = o1.c();

    public static abstract class a<MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.a.AbstractC0126a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageType f8653a;
        public MessageType b;

        public a(MessageType messagetype) {
            this.f8653a = messagetype;
            if (messagetype.J()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.b = (MessageType) A();
        }

        private MessageType A() {
            return (MessageType) this.f8653a.P();
        }

        public static <MessageType> void z(MessageType messagetype, MessageType messagetype2) {
            c1.a().d(messagetype).a(messagetype, messagetype2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.t0
        public final boolean isInitialized() {
            return y.I(this.b, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) d();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw com.google.crypto.tink.shaded.protobuf.a.AbstractC0126a.n(messagetype);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public MessageType d() {
            if (!this.b.J()) {
                return this.b;
            }
            this.b.K();
            return this.b;
        }

        @Override // 
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) f().e();
            buildertype.b = (MessageType) d();
            return buildertype;
        }

        public final void r() {
            if (this.b.J()) {
                return;
            }
            s();
        }

        public void s() {
            MessageType messagetype = (MessageType) A();
            z(messagetype, this.b);
            this.b = messagetype;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.t0
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public MessageType f() {
            return this.f8653a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0126a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public BuilderType j(MessageType messagetype) {
            return (BuilderType) x(messagetype);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s0.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public BuilderType F(i iVar, p pVar) throws IOException {
            r();
            try {
                c1.a().d(this.b).i(this.b, j.Q(iVar), pVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType x(MessageType messagetype) {
            if (f().equals(messagetype)) {
                return this;
            }
            r();
            z(this.b, messagetype);
            return this;
        }
    }

    public static class b<T extends y<T, ?>> extends com.google.crypto.tink.shaded.protobuf.b<T> {
        public final T b;

        public b(T t8) {
            this.b = t8;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a1
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T a(i iVar, p pVar) {
            return (T) y.U(this.b, iVar, pVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends y<MessageType, BuilderType> implements t0 {
        protected u<d> extensions = u.h();

        public u<d> Z() {
            if (this.extensions.n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
        public /* bridge */ /* synthetic */ s0.a a() {
            return super.a();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
        public /* bridge */ /* synthetic */ s0.a e() {
            return super.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.t0
        public /* bridge */ /* synthetic */ s0 f() {
            return super.f();
        }
    }

    public static final class d implements u.b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0.d<?> f8654a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s1.b f8655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f8656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f8657e;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.b - dVar.b;
        }

        public a0.d<?> b() {
            return this.f8654a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public boolean f() {
            return this.f8656d;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public s1.b g() {
            return this.f8655c;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public int getNumber() {
            return this.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public s0.a i(s0.a aVar, s0 s0Var) {
            return ((a) aVar).x((y) s0Var);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public s1.c k() {
            return this.f8655c.a();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.u.b
        public boolean m() {
            return this.f8657e;
        }
    }

    public static class e<ContainingType extends s0, Type> extends n<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s0 f8658a;
        public final d b;

        public s1.b a() {
            return this.b.g();
        }

        public s0 b() {
            return this.f8658a;
        }

        public int c() {
            return this.b.getNumber();
        }

        public boolean d() {
            return this.b.f8656d;
        }
    }

    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static <E> a0.i<E> A() {
        return d1.c();
    }

    public static <T extends y<?, ?>> T B(Class<T> cls) {
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
        T t10 = (T) ((y) q1.k(cls)).f();
        if (t10 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t10);
        return t10;
    }

    public static Object G(Method method, Object obj, Object... objArr) {
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

    public static final <T extends y<T, ?>> boolean I(T t8, boolean z10) {
        byte bByteValue = ((Byte) t8.x(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = c1.a().d(t8).c(t8);
        if (z10) {
            t8.y(f.SET_MEMOIZED_IS_INITIALIZED, zC ? t8 : null);
        }
        return zC;
    }

    public static <E> a0.i<E> M(a0.i<E> iVar) {
        int size = iVar.size();
        return iVar.o(size == 0 ? 10 : size * 2);
    }

    public static Object O(s0 s0Var, String str, Object[] objArr) {
        return new e1(s0Var, str, objArr);
    }

    public static <T extends y<T, ?>> T Q(T t8, h hVar, p pVar) {
        return (T) q(T(t8, hVar, pVar));
    }

    public static <T extends y<T, ?>> T R(T t8, InputStream inputStream, p pVar) {
        return (T) q(U(t8, i.g(inputStream), pVar));
    }

    public static <T extends y<T, ?>> T S(T t8, byte[] bArr, p pVar) {
        return (T) q(V(t8, bArr, 0, bArr.length, pVar));
    }

    public static <T extends y<T, ?>> T T(T t8, h hVar, p pVar) throws b0 {
        i iVarM = hVar.m();
        T t10 = (T) U(t8, iVarM, pVar);
        try {
            iVarM.a(0);
            return t10;
        } catch (b0 e10) {
            throw e10.k(t10);
        }
    }

    public static <T extends y<T, ?>> T U(T t8, i iVar, p pVar) throws b0 {
        T t10 = (T) t8.P();
        try {
            g1 g1VarD = c1.a().d(t10);
            g1VarD.i(t10, j.Q(iVar), pVar);
            g1VarD.b(t10);
            return t10;
        } catch (b0 e10) {
            e = e10;
            if (e.a()) {
                e = new b0(e);
            }
            throw e.k(t10);
        } catch (m1 e11) {
            throw e11.a().k(t10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof b0) {
                throw ((b0) e12.getCause());
            }
            throw new b0(e12).k(t10);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof b0) {
                throw ((b0) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends y<T, ?>> T V(T t8, byte[] bArr, int i10, int i11, p pVar) throws b0 {
        if (i11 == 0) {
            return t8;
        }
        T t10 = (T) t8.P();
        try {
            g1 g1VarD = c1.a().d(t10);
            g1VarD.h(t10, bArr, i10, i10 + i11, new com.google.crypto.tink.shaded.protobuf.e.b(pVar));
            g1VarD.b(t10);
            return t10;
        } catch (b0 e10) {
            b0 b0Var = e10;
            if (b0Var.a()) {
                b0Var = new b0(b0Var);
            }
            throw b0Var.k(t10);
        } catch (m1 e11) {
            throw e11.a().k(t10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof b0) {
                throw ((b0) e12.getCause());
            }
            throw new b0(e12).k(t10);
        } catch (IndexOutOfBoundsException unused) {
            throw b0.m().k(t10);
        }
    }

    public static <T extends y<?, ?>> void W(Class<T> cls, T t8) {
        t8.L();
        defaultInstanceMap.put(cls, t8);
    }

    public static <T extends y<T, ?>> T q(T t8) throws b0 {
        if (t8 == null || t8.isInitialized()) {
            return t8;
        }
        throw t8.l().a().k(t8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final MessageType f() {
        return (MessageType) x(f.GET_DEFAULT_INSTANCE);
    }

    public int D() {
        return this.memoizedHashCode;
    }

    public boolean E() {
        return D() == 0;
    }

    public boolean J() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void K() {
        c1.a().d(this).b(this);
        L();
    }

    public void L() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final BuilderType e() {
        return (BuilderType) x(f.NEW_BUILDER);
    }

    public MessageType P() {
        return (MessageType) x(f.NEW_MUTABLE_INSTANCE);
    }

    public void X(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final BuilderType a() {
        return (BuilderType) ((a) x(f.NEW_BUILDER)).x(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public int c() {
        return j(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return c1.a().d(this).g(this, (y) obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public int g() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public final a1<MessageType> h() {
        return (a1) x(f.GET_PARSER);
    }

    public int hashCode() {
        if (J()) {
            return t();
        }
        if (E()) {
            X(t());
        }
        return D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void i(k kVar) {
        c1.a().d(this).j(this, l.P(kVar));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t0
    public final boolean isInitialized() {
        return I(this, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public int j(g1 g1Var) {
        if (!J()) {
            if (g() != Integer.MAX_VALUE) {
                return g();
            }
            int iU = u(g1Var);
            m(iU);
            return iU;
        }
        int iU2 = u(g1Var);
        if (iU2 >= 0) {
            return iU2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iU2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    public void m(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    public Object p() {
        return x(f.BUILD_MESSAGE_INFO);
    }

    public void r() {
        this.memoizedHashCode = 0;
    }

    public void s() {
        m(Integer.MAX_VALUE);
    }

    public int t() {
        return c1.a().d(this).f(this);
    }

    public String toString() {
        return u0.f(this, super.toString());
    }

    public final int u(g1<?> g1Var) {
        return g1Var == null ? c1.a().d(this).d(this) : g1Var.d(this);
    }

    public final <MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType v() {
        return (BuilderType) x(f.NEW_BUILDER);
    }

    public final <MessageType extends y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType w(MessageType messagetype) {
        return (BuilderType) v().x(messagetype);
    }

    public Object x(f fVar) {
        return z(fVar, null, null);
    }

    public Object y(f fVar, Object obj) {
        return z(fVar, obj, null);
    }

    public abstract Object z(f fVar, Object obj, Object obj2);
}
