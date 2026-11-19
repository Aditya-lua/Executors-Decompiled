package hn;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c<T> {

    public class a extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Constructor f18321a;
        public final /* synthetic */ Class b;

        public a(Constructor constructor, Class cls) {
            this.f18321a = constructor;
            this.b = cls;
        }

        @Override // hn.c
        public T b() {
            return (T) this.f18321a.newInstance(null);
        }

        public String toString() {
            return this.b.getName();
        }
    }

    public class b extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f18322a;
        public final /* synthetic */ Object b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f18323c;

        public b(Method method, Object obj, Class cls) {
            this.f18322a = method;
            this.b = obj;
            this.f18323c = cls;
        }

        @Override // hn.c
        public T b() {
            return (T) this.f18322a.invoke(this.b, this.f18323c);
        }

        public String toString() {
            return this.f18323c.getName();
        }
    }

    /* JADX INFO: renamed from: hn.c$c, reason: collision with other inner class name */
    public class C0351c extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f18324a;
        public final /* synthetic */ Class b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f18325c;

        public C0351c(Method method, Class cls, int i10) {
            this.f18324a = method;
            this.b = cls;
            this.f18325c = i10;
        }

        @Override // hn.c
        public T b() {
            return (T) this.f18324a.invoke(null, this.b, Integer.valueOf(this.f18325c));
        }

        public String toString() {
            return this.b.getName();
        }
    }

    public class d extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f18326a;
        public final /* synthetic */ Class b;

        public d(Method method, Class cls) {
            this.f18326a = method;
            this.b = cls;
        }

        @Override // hn.c
        public T b() {
            return (T) this.f18326a.invoke(null, this.b, Object.class);
        }

        public String toString() {
            return this.b.getName();
        }
    }

    public static <T> c<T> a(Class<?> cls) {
        try {
            try {
                try {
                    try {
                        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        return new a(declaredConstructor, cls);
                    } catch (Exception unused) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                } catch (NoSuchMethodException unused2) {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new C0351c(declaredMethod2, cls, iIntValue);
            } catch (IllegalAccessException unused4) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused5) {
            throw new AssertionError();
        } catch (NoSuchMethodException unused6) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new d(declaredMethod3, cls);
        } catch (InvocationTargetException e10) {
            throw jn.c.t(e10);
        }
    }

    public abstract T b();
}
