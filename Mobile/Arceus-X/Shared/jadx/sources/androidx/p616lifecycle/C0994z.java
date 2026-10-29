package androidx.p616lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.lifecycle.z */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00152\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u0004\u0012\u00020\u00150\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR2\u0010 \u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f0\u001f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001d¨\u0006!"}, m31665d2 = {"Landroidx/lifecycle/z;", "", "<init>", "()V", "object", "Landroidx/lifecycle/p;", "f", "(Ljava/lang/Object;)Landroidx/lifecycle/p;", "", "className", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/i;", "constructor", "a", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/i;", "Ljava/lang/Class;", "klass", "b", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", "d", "(Ljava/lang/Class;)I", "g", "", "e", "(Ljava/lang/Class;)Z", "", "Ljava/util/Map;", "callbackCache", "", "classToAdapters", "lifecycle-common"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0994z {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0994z f3752a = new C0994z();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<Class<?>, Integer> callbackCache = new HashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Map<Class<?>, List<Constructor<? extends InterfaceC0960i>>> classToAdapters = new HashMap();

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m5014c(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return C7797x.m32303N(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final InterfaceC0974p m5015f(@NotNull Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z10 = object instanceof InterfaceC0974p;
        boolean z11 = object instanceof InterfaceC0954f;
        if (z10 && z11) {
            return new C0956g((InterfaceC0954f) object, (InterfaceC0974p) object);
        }
        if (z11) {
            return new C0956g((InterfaceC0954f) object, null);
        }
        if (z10) {
            return (InterfaceC0974p) object;
        }
        Class<?> cls = object.getClass();
        C0994z c0994z = f3752a;
        if (c0994z.m5018d(cls) != 2) {
            return new C0961i0(object);
        }
        List<Constructor<? extends InterfaceC0960i>> list = classToAdapters.get(cls);
        Intrinsics.checkNotNull(list);
        List<Constructor<? extends InterfaceC0960i>> list2 = list;
        if (list2.size() == 1) {
            return new C0989w0(c0994z.m5016a(list2.get(0), object));
        }
        int size = list2.size();
        InterfaceC0960i[] interfaceC0960iArr = new InterfaceC0960i[size];
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC0960iArr[i10] = f3752a.m5016a(list2.get(i10), object);
        }
        return new C0951e(interfaceC0960iArr);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0960i m5016a(Constructor<? extends InterfaceC0960i> constructor, Object object) {
        try {
            InterfaceC0960i interfaceC0960iNewInstance = constructor.newInstance(object);
            Intrinsics.checkNotNull(interfaceC0960iNewInstance);
            return interfaceC0960iNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Constructor<? extends InterfaceC0960i> m5017b(Class<?> klass) {
        try {
            Package r8 = klass.getPackage();
            String canonicalName = klass.getCanonicalName();
            String name = r8 != null ? r8.getName() : "";
            Intrinsics.checkNotNull(name);
            if (name.length() != 0) {
                Intrinsics.checkNotNull(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "substring(...)");
            }
            Intrinsics.checkNotNull(canonicalName);
            String strM5014c = m5014c(canonicalName);
            if (name.length() != 0) {
                strM5014c = name + '.' + strM5014c;
            }
            Class<?> cls = Class.forName(strM5014c);
            Intrinsics.m31981d(cls, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls.getDeclaredConstructor(klass);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m5018d(Class<?> klass) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int iM5020g = m5020g(klass);
        map.put(klass, Integer.valueOf(iM5020g));
        return iM5020g;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5019e(Class<?> klass) {
        return klass != null && InterfaceC0978r.class.isAssignableFrom(klass);
    }

    /* JADX INFO: renamed from: g */
    public final int m5020g(Class<?> klass) {
        ArrayList arrayList;
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0960i> constructorM5017b = m5017b(klass);
        if (constructorM5017b != null) {
            classToAdapters.put(klass, C7697o.m31878d(constructorM5017b));
            return 2;
        }
        if (C0948d.f3626c.m4896d(klass)) {
            return 1;
        }
        Class<? super Object> superclass = klass.getSuperclass();
        if (m5019e(superclass)) {
            Intrinsics.checkNotNull(superclass);
            if (m5018d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends InterfaceC0960i>> list = classToAdapters.get(superclass);
            Intrinsics.checkNotNull(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = klass.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        for (Class<?> cls : interfaces) {
            if (m5019e(cls)) {
                Intrinsics.checkNotNull(cls);
                if (m5018d(cls) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends InterfaceC0960i>> list2 = classToAdapters.get(cls);
                Intrinsics.checkNotNull(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(klass, arrayList);
        return 2;
    }
}
