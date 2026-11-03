package sm;

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
        public final /* synthetic */ Constructor f31566a;
        public final /* synthetic */ Class b;

        public a(Constructor constructor, Class cls) {
            this.f31566a = constructor;
            this.b = cls;
        }

        @Override // sm.c
        public T b() {
            return (T) this.f31566a.newInstance(null);
        }

        public String toString() {
            return this.b.getName();
        }
    }

    public class b extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f31567a;
        public final /* synthetic */ Object b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f31568c;

        public b(Method method, Object obj, Class cls) {
            this.f31567a = method;
            this.b = obj;
            this.f31568c = cls;
        }

        @Override // sm.c
        public T b() {
            return (T) this.f31567a.invoke(this.b, this.f31568c);
        }

        public String toString() {
            return this.f31568c.getName();
        }
    }

    /* JADX INFO: renamed from: sm.c$c, reason: collision with other inner class name */
    public class C0559c extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f31569a;
        public final /* synthetic */ Class b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f31570c;

        public C0559c(Method method, Class cls, int i10) {
            this.f31569a = method;
            this.b = cls;
            this.f31570c = i10;
        }

        @Override // sm.c
        public T b() {
            return (T) this.f31569a.invoke(null, this.b, Integer.valueOf(this.f31570c));
        }

        public String toString() {
            return this.b.getName();
        }
    }

    public class d extends c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f31571a;
        public final /* synthetic */ Class b;

        public d(Method method, Class cls) {
            this.f31571a = method;
            this.b = cls;
        }

        @Override // sm.c
        public T b() {
            return (T) this.f31571a.invoke(null, this.b, Object.class);
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
                return new C0559c(declaredMethod2, cls, iIntValue);
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
            throw um.c.t(e10);
        }
    }

    public abstract T b();
}
