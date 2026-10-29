package p471um;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p522wm.C12494c;

/* JADX INFO: renamed from: um.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11868c<T> {

    /* JADX INFO: renamed from: um.c$a */
    public class a extends AbstractC11868c<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Constructor f42080a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Class f42081b;

        public a(Constructor constructor, Class cls) {
            this.f42080a = constructor;
            this.f42081b = cls;
        }

        @Override // p471um.AbstractC11868c
        /* JADX INFO: renamed from: b */
        public T mo44302b() {
            return (T) this.f42080a.newInstance(null);
        }

        public String toString() {
            return this.f42081b.getName();
        }
    }

    /* JADX INFO: renamed from: um.c$b */
    public class b extends AbstractC11868c<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Method f42082a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f42083b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Class f42084c;

        public b(Method method, Object obj, Class cls) {
            this.f42082a = method;
            this.f42083b = obj;
            this.f42084c = cls;
        }

        @Override // p471um.AbstractC11868c
        /* JADX INFO: renamed from: b */
        public T mo44302b() {
            return (T) this.f42082a.invoke(this.f42083b, this.f42084c);
        }

        public String toString() {
            return this.f42084c.getName();
        }
    }

    /* JADX INFO: renamed from: um.c$c */
    public class c extends AbstractC11868c<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Method f42085a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Class f42086b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f42087c;

        public c(Method method, Class cls, int i10) {
            this.f42085a = method;
            this.f42086b = cls;
            this.f42087c = i10;
        }

        @Override // p471um.AbstractC11868c
        /* JADX INFO: renamed from: b */
        public T mo44302b() {
            return (T) this.f42085a.invoke(null, this.f42086b, Integer.valueOf(this.f42087c));
        }

        public String toString() {
            return this.f42086b.getName();
        }
    }

    /* JADX INFO: renamed from: um.c$d */
    public class d extends AbstractC11868c<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Method f42088a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Class f42089b;

        public d(Method method, Class cls) {
            this.f42088a = method;
            this.f42089b = cls;
        }

        @Override // p471um.AbstractC11868c
        /* JADX INFO: renamed from: b */
        public T mo44302b() {
            return (T) this.f42088a.invoke(null, this.f42089b, Object.class);
        }

        public String toString() {
            return this.f42089b.getName();
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> AbstractC11868c<T> m44301a(Class<?> cls) {
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
                return new c(declaredMethod2, cls, iIntValue);
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
            throw C12494c.m46807t(e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract T mo44302b();
}
