package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0888x;
import androidx.datastore.preferences.protobuf.AbstractC0888x.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0888x<MessageType extends AbstractC0888x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC0822a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0888x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C0866o1 unknownFields = C0866o1.m3916c();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x$a */
    public static abstract class a<MessageType extends AbstractC0888x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC0822a.a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a */
        public final MessageType f3135a;

        /* JADX INFO: renamed from: b */
        public MessageType f3136b;

        public a(MessageType messagetype) {
            this.f3135a = messagetype;
            if (messagetype.m4186I()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f3136b = (MessageType) m4202D();
        }

        /* JADX INFO: renamed from: C */
        public static <MessageType> void m4201C(MessageType messagetype, MessageType messagetype2) {
            C0830c1.m3364a().m3367d(messagetype).mo3468a(messagetype, messagetype2);
        }

        /* JADX INFO: renamed from: D */
        private MessageType m4202D() {
            return (MessageType) this.f3135a.m4190O();
        }

        /* JADX INFO: renamed from: A */
        public BuilderType m4203A(MessageType messagetype) {
            if (mo4057f().equals(messagetype)) {
                return this;
            }
            m4207t();
            m4201C(this.f3136b, messagetype);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0877s0
        public final boolean isInitialized() {
            return AbstractC0888x.m4175H(this.f3136b, false);
        }

        /* JADX DEBUG: Method merged with bridge method: build()Landroidx/datastore/preferences/protobuf/r0; */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0874r0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) mo4030d();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw AbstractC0822a.a.m3335p(messagetype);
        }

        /* JADX DEBUG: Method merged with bridge method: d()Landroidx/datastore/preferences/protobuf/r0; */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0874r0.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public MessageType mo4030d() {
            if (!this.f3136b.m4186I()) {
                return this.f3136b;
            }
            this.f3136b.m4187J();
            return this.f3136b;
        }

        /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) mo4057f().mo4027e();
            buildertype.f3136b = (MessageType) mo4030d();
            return buildertype;
        }

        /* JADX INFO: renamed from: t */
        public final void m4207t() {
            if (this.f3136b.m4186I()) {
                return;
            }
            m4208v();
        }

        /* JADX INFO: renamed from: v */
        public void m4208v() {
            MessageType messagetype = (MessageType) m4202D();
            m4201C(messagetype, this.f3136b);
            this.f3136b = messagetype;
        }

        /* JADX DEBUG: Method merged with bridge method: f()Landroidx/datastore/preferences/protobuf/r0; */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0877s0
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public MessageType mo4057f() {
            return this.f3135a;
        }

        /* JADX DEBUG: Method merged with bridge method: n(Landroidx/datastore/preferences/protobuf/a;)Landroidx/datastore/preferences/protobuf/a$a; */
        @Override // androidx.datastore.preferences.protobuf.AbstractC0822a.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public BuilderType mo3337n(MessageType messagetype) {
            return (BuilderType) m4203A(messagetype);
        }

        /* JADX DEBUG: Method merged with bridge method: y(Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/r0$a; */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0874r0.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public BuilderType mo4031y(AbstractC0843h abstractC0843h, C0864o c0864o) throws IOException {
            m4207t();
            try {
                C0830c1.m3364a().m3367d(this.f3136b).mo3475h(this.f3136b, C0846i.m3547Q(abstractC0843h), c0864o);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x$b */
    public static class b<T extends AbstractC0888x<T, ?>> extends AbstractC0825b<T> {

        /* JADX INFO: renamed from: b */
        public final T f3137b;

        public b(T t8) {
            this.f3137b = t8;
        }

        /* JADX DEBUG: Method merged with bridge method: b(Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/o;)Ljava/lang/Object; */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0893z0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public T mo4212b(AbstractC0843h abstractC0843h, C0864o c0864o) {
            return (T) AbstractC0888x.m4179Q(this.f3137b, abstractC0843h, c0864o);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC0888x<MessageType, BuilderType> implements InterfaceC0877s0 {
        protected C0879t<d> extensions = C0879t.m4069h();

        /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: androidx.datastore.preferences.protobuf.t<T extends androidx.datastore.preferences.protobuf.t$b<T>>, androidx.datastore.preferences.protobuf.t<androidx.datastore.preferences.protobuf.x$d> */
        /* JADX INFO: renamed from: U */
        public C0879t<d> m4214U() {
            if (this.extensions.m4083o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0888x, androidx.datastore.preferences.protobuf.InterfaceC0874r0
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ InterfaceC0874r0.a mo4025a() {
            return super.mo4025a();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0888x, androidx.datastore.preferences.protobuf.InterfaceC0874r0
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ InterfaceC0874r0.a mo4027e() {
            return super.mo4027e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0888x, androidx.datastore.preferences.protobuf.InterfaceC0877s0
        /* JADX INFO: renamed from: f */
        public /* bridge */ /* synthetic */ InterfaceC0874r0 mo4057f() {
            return super.mo4057f();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x$d */
    public static final class d implements C0879t.b<d> {

        /* JADX INFO: renamed from: a */
        public final int f3138a;

        /* JADX INFO: renamed from: b */
        public final C0878s1.b f3139b;

        /* JADX INFO: renamed from: c */
        public final boolean f3140c;

        /* JADX INFO: renamed from: d */
        public final boolean f3141d;

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f3138a - dVar.f3138a;
        }

        /* JADX INFO: renamed from: b */
        public C0892z.b<?> m4216b() {
            return null;
        }

        @Override // androidx.datastore.preferences.protobuf.C0879t.b
        /* JADX INFO: renamed from: f */
        public boolean mo4091f() {
            return this.f3140c;
        }

        @Override // androidx.datastore.preferences.protobuf.C0879t.b
        /* JADX INFO: renamed from: g */
        public C0878s1.b mo4092g() {
            return this.f3139b;
        }

        @Override // androidx.datastore.preferences.protobuf.C0879t.b
        public int getNumber() {
            return this.f3138a;
        }

        @Override // androidx.datastore.preferences.protobuf.C0879t.b
        /* JADX INFO: renamed from: k */
        public C0878s1.c mo4093k() {
            return this.f3139b.m4061a();
        }

        @Override // androidx.datastore.preferences.protobuf.C0879t.b
        /* JADX INFO: renamed from: m */
        public boolean mo4094m() {
            return this.f3141d;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: androidx.datastore.preferences.protobuf.x$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.C0879t.b
        /* JADX INFO: renamed from: p */
        public InterfaceC0874r0.a mo4095p(InterfaceC0874r0.a aVar, InterfaceC0874r0 interfaceC0874r0) {
            return ((a) aVar).m4203A((AbstractC0888x) interfaceC0874r0);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x$e */
    public static class e<ContainingType extends InterfaceC0874r0, Type> extends AbstractC0858m<ContainingType, Type> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0874r0 f3142a;

        /* JADX INFO: renamed from: b */
        public final d f3143b;

        /* JADX INFO: renamed from: a */
        public C0878s1.b m4217a() {
            return this.f3143b.mo4092g();
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC0874r0 m4218b() {
            return this.f3142a;
        }

        /* JADX INFO: renamed from: c */
        public int m4219c() {
            return this.f3143b.getNumber();
        }

        /* JADX INFO: renamed from: d */
        public boolean m4220d() {
            return this.f3143b.f3140c;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: renamed from: B */
    public static <E> C0892z.f<E> m4172B() {
        return C0833d1.m3377c();
    }

    /* JADX INFO: renamed from: C */
    public static <T extends AbstractC0888x<?, ?>> T m4173C(Class<T> cls) {
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
        T t10 = (T) ((AbstractC0888x) C0872q1.m3985i(cls)).mo4057f();
        if (t10 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t10);
        return t10;
    }

    /* JADX INFO: renamed from: G */
    public static Object m4174G(Method method, Object obj, Object... objArr) {
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

    /* JADX INFO: renamed from: H */
    public static final <T extends AbstractC0888x<T, ?>> boolean m4175H(T t8, boolean z10) {
        byte bByteValue = ((Byte) t8.m4199x(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo3470c = C0830c1.m3364a().m3367d(t8).mo3470c(t8);
        if (z10) {
            t8.m4200z(f.SET_MEMOIZED_IS_INITIALIZED, zMo3470c ? t8 : null);
        }
        return zMo3470c;
    }

    /* JADX INFO: renamed from: L */
    public static <E> C0892z.f<E> m4176L(C0892z.f<E> fVar) {
        int size = fVar.size();
        return fVar.mo3381o(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: renamed from: N */
    public static Object m4177N(InterfaceC0874r0 interfaceC0874r0, String str, Object[] objArr) {
        return new C0836e1(interfaceC0874r0, str, objArr);
    }

    /* JADX INFO: renamed from: P */
    public static <T extends AbstractC0888x<T, ?>> T m4178P(T t8, InputStream inputStream) {
        return (T) m4181r(m4179Q(t8, AbstractC0843h.m3479g(inputStream), C0864o.m3911b()));
    }

    /* JADX INFO: renamed from: Q */
    public static <T extends AbstractC0888x<T, ?>> T m4179Q(T t8, AbstractC0843h abstractC0843h, C0864o c0864o) throws C0823a0 {
        T t10 = (T) t8.m4190O();
        try {
            InterfaceC0842g1 interfaceC0842g1M3367d = C0830c1.m3364a().m3367d(t10);
            interfaceC0842g1M3367d.mo3475h(t10, C0846i.m3547Q(abstractC0843h), c0864o);
            interfaceC0842g1M3367d.mo3469b(t10);
            return t10;
        } catch (C0823a0 e10) {
            e = e10;
            if (e.m3349a()) {
                e = new C0823a0(e);
            }
            throw e.m3351k(t10);
        } catch (C0860m1 e11) {
            throw e11.m3885a().m3351k(t10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C0823a0) {
                throw ((C0823a0) e12.getCause());
            }
            throw new C0823a0(e12).m3351k(t10);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C0823a0) {
                throw ((C0823a0) e13.getCause());
            }
            throw e13;
        }
    }

    /* JADX INFO: renamed from: R */
    public static <T extends AbstractC0888x<?, ?>> void m4180R(Class<T> cls, T t8) {
        t8.m4188K();
        defaultInstanceMap.put(cls, t8);
    }

    /* JADX INFO: renamed from: r */
    public static <T extends AbstractC0888x<T, ?>> T m4181r(T t8) throws C0823a0 {
        if (t8 == null || t8.isInitialized()) {
            return t8;
        }
        throw t8.m3330n().m3885a().m3351k(t8);
    }

    /* JADX INFO: renamed from: A */
    public abstract Object mo4182A(f fVar, Object obj, Object obj2);

    /* JADX DEBUG: Method merged with bridge method: f()Landroidx/datastore/preferences/protobuf/r0; */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0877s0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final MessageType mo4057f() {
        return (MessageType) m4199x(f.GET_DEFAULT_INSTANCE);
    }

    /* JADX INFO: renamed from: E */
    public int m4184E() {
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: F */
    public boolean m4185F() {
        return m4184E() == 0;
    }

    /* JADX INFO: renamed from: I */
    public boolean m4186I() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: J */
    public void m4187J() {
        C0830c1.m3364a().m3367d(this).mo3469b(this);
        m4188K();
    }

    /* JADX INFO: renamed from: K */
    public void m4188K() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Method merged with bridge method: e()Landroidx/datastore/preferences/protobuf/r0$a; */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874r0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final BuilderType mo4027e() {
        return (BuilderType) m4199x(f.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: O */
    public MessageType m4190O() {
        return (MessageType) m4199x(f.NEW_MUTABLE_INSTANCE);
    }

    /* JADX INFO: renamed from: S */
    public void m4191S(int i10) {
        this.memoizedHashCode = i10;
    }

    /* JADX DEBUG: Method merged with bridge method: a()Landroidx/datastore/preferences/protobuf/r0$a; */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874r0
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final BuilderType mo4025a() {
        return (BuilderType) ((a) m4199x(f.NEW_BUILDER)).m4203A(this);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874r0
    /* JADX INFO: renamed from: c */
    public int mo4026c() {
        return mo3328k(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C0830c1.m3364a().m3367d(this).mo3474g(this, (AbstractC0888x) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874r0
    /* JADX INFO: renamed from: h */
    public final InterfaceC0893z0<MessageType> mo4028h() {
        return (InterfaceC0893z0) m4199x(f.GET_PARSER);
    }

    public int hashCode() {
        if (m4186I()) {
            return m4196u();
        }
        if (m4185F()) {
            m4191S(m4196u());
        }
        return m4184E();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874r0
    /* JADX INFO: renamed from: i */
    public void mo4029i(AbstractC0849j abstractC0849j) {
        C0830c1.m3364a().m3367d(this).mo3476i(this, C0852k.m3777P(abstractC0849j));
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0877s0
    public final boolean isInitialized() {
        return m4175H(this, true);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0822a
    /* JADX INFO: renamed from: j */
    public int mo3327j() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0822a
    /* JADX INFO: renamed from: k */
    public int mo3328k(InterfaceC0842g1 interfaceC0842g1) {
        if (!m4186I()) {
            if (mo3327j() != Integer.MAX_VALUE) {
                return mo3327j();
            }
            int iM4197v = m4197v(interfaceC0842g1);
            mo3331o(iM4197v);
            return iM4197v;
        }
        int iM4197v2 = m4197v(interfaceC0842g1);
        if (iM4197v2 >= 0) {
            return iM4197v2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iM4197v2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0822a
    /* JADX INFO: renamed from: o */
    public void mo3331o(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    /* JADX INFO: renamed from: q */
    public Object m4193q() {
        return m4199x(f.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: renamed from: s */
    public void m4194s() {
        this.memoizedHashCode = 0;
    }

    /* JADX INFO: renamed from: t */
    public void m4195t() {
        mo3331o(Integer.MAX_VALUE);
    }

    public String toString() {
        return C0880t0.m4101f(this, super.toString());
    }

    /* JADX INFO: renamed from: u */
    public int m4196u() {
        return C0830c1.m3364a().m3367d(this).mo3473f(this);
    }

    /* JADX INFO: renamed from: v */
    public final int m4197v(InterfaceC0842g1<?> interfaceC0842g1) {
        return interfaceC0842g1 == null ? C0830c1.m3364a().m3367d(this).mo3471d(this) : interfaceC0842g1.mo3471d(this);
    }

    /* JADX INFO: renamed from: w */
    public final <MessageType extends AbstractC0888x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType m4198w() {
        return (BuilderType) m4199x(f.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: x */
    public Object m4199x(f fVar) {
        return mo4182A(fVar, null, null);
    }

    /* JADX INFO: renamed from: z */
    public Object m4200z(f fVar, Object obj) {
        return mo4182A(fVar, obj, null);
    }
}
