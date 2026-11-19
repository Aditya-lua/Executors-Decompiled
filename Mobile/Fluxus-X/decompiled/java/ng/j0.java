package ng;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f25555a = c();

    public class a extends j0 {
        public final /* synthetic */ Method b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f25556c;

        public a(Method method, Object obj) {
            this.b = method;
            this.f25556c = obj;
        }

        @Override // ng.j0
        public <T> T d(Class<T> cls) {
            j0.b(cls);
            return (T) this.b.invoke(this.f25556c, cls);
        }
    }

    public class b extends j0 {
        public final /* synthetic */ Method b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f25557c;

        public b(Method method, int i10) {
            this.b = method;
            this.f25557c = i10;
        }

        @Override // ng.j0
        public <T> T d(Class<T> cls) {
            j0.b(cls);
            return (T) this.b.invoke(null, cls, Integer.valueOf(this.f25557c));
        }
    }

    public class c extends j0 {
        public final /* synthetic */ Method b;

        public c(Method method) {
            this.b = method;
        }

        @Override // ng.j0
        public <T> T d(Class<T> cls) {
            j0.b(cls);
            return (T) this.b.invoke(null, cls, Object.class);
        }
    }

    public class d extends j0 {
        @Override // ng.j0
        public <T> T d(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    public static void b(Class<?> cls) {
        String strV = v.v(cls);
        if (strV == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strV);
    }

    public static j0 c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new c(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new b(declaredMethod3, iIntValue);
        }
    }

    public abstract <T> T d(Class<T> cls);
}
