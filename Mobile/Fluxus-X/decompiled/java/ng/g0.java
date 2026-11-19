package ng;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class g0 {

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25551a;

        public class a extends b {
            public final /* synthetic */ Method b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method) {
                super();
                this.b = method;
            }

            @Override // ng.g0.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* JADX INFO: renamed from: ng.g0$b$b, reason: collision with other inner class name */
        public class C0497b extends b {
            public C0497b() {
                super();
            }

            @Override // ng.g0.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (y.c()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    aVar = null;
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C0497b();
            }
            f25551a = aVar;
        }

        public b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f25551a.a(accessibleObject, obj);
    }

    public static lg.w.a b(List<lg.w> list, Class<?> cls) {
        Iterator<lg.w> it = list.iterator();
        while (it.hasNext()) {
            lg.w.a aVarA = it.next().a(cls);
            if (aVarA != lg.w.a.INDECISIVE) {
                return aVarA;
            }
        }
        return lg.w.a.ALLOW;
    }
}
