package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class x<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected o1 unknownFields = o1.c();

    public static abstract class a<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.a.AbstractC0031a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageType f2383a;
        public MessageType b;

        public a(MessageType messagetype) {
            this.f2383a = messagetype;
            if (messagetype.I()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.b = (MessageType) D();
        }

        public static <MessageType> void C(MessageType messagetype, MessageType messagetype2) {
            c1.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType D() {
            return (MessageType) this.f2383a.O();
        }

        public BuilderType A(MessageType messagetype) {
            if (f().equals(messagetype)) {
                return this;
            }
            t();
            C(this.b, messagetype);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.s0
        public final boolean isInitialized() {
            return x.H(this.b, false);
        }

        @Override // androidx.datastore.preferences.protobuf.r0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) d();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw androidx.datastore.preferences.protobuf.a.AbstractC0031a.p(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.r0.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public MessageType d() {
            if (!this.b.I()) {
                return this.b;
            }
            this.b.J();
            return this.b;
        }

        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) f().e();
            buildertype.b = (MessageType) d();
            return buildertype;
        }

        public final void t() {
            if (this.b.I()) {
                return;
            }
            v();
        }

        public void v() {
            MessageType messagetype = (MessageType) D();
            C(messagetype, this.b);
            this.b = messagetype;
        }

        @Override // androidx.datastore.preferences.protobuf.s0
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public MessageType f() {
            return this.f2383a;
        }

        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0031a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public BuilderType n(MessageType messagetype) {
            return (BuilderType) A(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.r0.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public BuilderType u(h hVar, o oVar) throws IOException {
            t();
            try {
                c1.a().d(this.b).h(this.b, i.Q(hVar), oVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }
    }

    public static class b<T extends x<T, ?>> extends androidx.datastore.preferences.protobuf.b<T> {
        public final T b;

        public b(T t8) {
            this.b = t8;
        }

        @Override // androidx.datastore.preferences.protobuf.z0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T b(h hVar, o oVar) {
            return (T) x.Q(this.b, hVar, oVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends x<MessageType, BuilderType> implements s0 {
        protected t<d> extensions = t.h();

        public t<d> U() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.x, androidx.datastore.preferences.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a a() {
            return super.a();
        }

        @Override // androidx.datastore.preferences.protobuf.x, androidx.datastore.preferences.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a e() {
            return super.e();
        }

        @Override // androidx.datastore.preferences.protobuf.x, androidx.datastore.preferences.protobuf.s0
        public /* bridge */ /* synthetic */ r0 f() {
            return super.f();
        }
    }

    public static final class d implements t.b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2384a;
        public final s1.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f2385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f2386d;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f2384a - dVar.f2384a;
        }

        public z.b<?> b() {
            return null;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public boolean f() {
            return this.f2385c;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public s1.b g() {
            return this.b;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public int getNumber() {
            return this.f2384a;
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public s1.c k() {
            return this.b.a();
        }

        @Override // androidx.datastore.preferences.protobuf.t.b
        public boolean m() {
            return this.f2386d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.t.b
        public r0.a t(r0.a aVar, r0 r0Var) {
            return ((a) aVar).A((x) r0Var);
        }
    }

    public static class e<ContainingType extends r0, Type> extends m<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r0 f2387a;
        public final d b;

        public s1.b a() {
            return this.b.g();
        }

        public r0 b() {
            return this.f2387a;
        }

        public int c() {
            return this.b.getNumber();
        }

        public boolean d() {
            return this.b.f2385c;
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

    public static <E> z.f<E> B() {
        return d1.c();
    }

    public static <T extends x<?, ?>> T C(Class<T> cls) {
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
        T t10 = (T) ((x) q1.i(cls)).f();
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

    public static final <T extends x<T, ?>> boolean H(T t8, boolean z10) {
        byte bByteValue = ((Byte) t8.y(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = c1.a().d(t8).c(t8);
        if (z10) {
            t8.z(f.SET_MEMOIZED_IS_INITIALIZED, zC ? t8 : null);
        }
        return zC;
    }

    public static <E> z.f<E> L(z.f<E> fVar) {
        int size = fVar.size();
        return fVar.o(size == 0 ? 10 : size * 2);
    }

    public static Object N(r0 r0Var, String str, Object[] objArr) {
        return new e1(r0Var, str, objArr);
    }

    public static <T extends x<T, ?>> T P(T t8, InputStream inputStream) {
        return (T) r(Q(t8, h.g(inputStream), o.b()));
    }

    public static <T extends x<T, ?>> T Q(T t8, h hVar, o oVar) throws a0 {
        T t10 = (T) t8.O();
        try {
            g1 g1VarD = c1.a().d(t10);
            g1VarD.h(t10, i.Q(hVar), oVar);
            g1VarD.b(t10);
            return t10;
        } catch (a0 e10) {
            e = e10;
            if (e.a()) {
                e = new a0(e);
            }
            throw e.k(t10);
        } catch (m1 e11) {
            throw e11.a().k(t10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof a0) {
                throw ((a0) e12.getCause());
            }
            throw new a0(e12).k(t10);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof a0) {
                throw ((a0) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends x<?, ?>> void R(Class<T> cls, T t8) {
        t8.K();
        defaultInstanceMap.put(cls, t8);
    }

    public static <T extends x<T, ?>> T r(T t8) throws a0 {
        if (t8 == null || t8.isInitialized()) {
            return t8;
        }
        throw t8.n().a().k(t8);
    }

    public abstract Object A(f fVar, Object obj, Object obj2);

    @Override // androidx.datastore.preferences.protobuf.s0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final MessageType f() {
        return (MessageType) y(f.GET_DEFAULT_INSTANCE);
    }

    public int E() {
        return this.memoizedHashCode;
    }

    public boolean F() {
        return E() == 0;
    }

    public boolean I() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void J() {
        c1.a().d(this).b(this);
        K();
    }

    public void K() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final BuilderType e() {
        return (BuilderType) y(f.NEW_BUILDER);
    }

    public MessageType O() {
        return (MessageType) y(f.NEW_MUTABLE_INSTANCE);
    }

    public void S(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final BuilderType a() {
        return (BuilderType) ((a) y(f.NEW_BUILDER)).A(this);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public int c() {
        return k(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return c1.a().d(this).g(this, (x) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final z0<MessageType> h() {
        return (z0) y(f.GET_PARSER);
    }

    public int hashCode() {
        if (I()) {
            return v();
        }
        if (F()) {
            S(v());
        }
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void i(j jVar) {
        c1.a().d(this).i(this, k.P(jVar));
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final boolean isInitialized() {
        return H(this, true);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public int j() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public int k(g1 g1Var) {
        if (!I()) {
            if (j() != Integer.MAX_VALUE) {
                return j();
            }
            int iW = w(g1Var);
            o(iW);
            return iW;
        }
        int iW2 = w(g1Var);
        if (iW2 >= 0) {
            return iW2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iW2);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public void o(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    public Object q() {
        return y(f.BUILD_MESSAGE_INFO);
    }

    public void s() {
        this.memoizedHashCode = 0;
    }

    public void t() {
        o(Integer.MAX_VALUE);
    }

    public String toString() {
        return t0.f(this, super.toString());
    }

    public int v() {
        return c1.a().d(this).f(this);
    }

    public final int w(g1<?> g1Var) {
        return g1Var == null ? c1.a().d(this).d(this) : g1Var.d(this);
    }

    public final <MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType x() {
        return (BuilderType) y(f.NEW_BUILDER);
    }

    public Object y(f fVar) {
        return A(fVar, null, null);
    }

    public Object z(f fVar, Object obj) {
        return A(fVar, obj, null);
    }
}
