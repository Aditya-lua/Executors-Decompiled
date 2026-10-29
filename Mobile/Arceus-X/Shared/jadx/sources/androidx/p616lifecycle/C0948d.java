package androidx.p616lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0948d {

    /* JADX INFO: renamed from: c */
    public static C0948d f3626c = new C0948d();

    /* JADX INFO: renamed from: a */
    public final Map<Class<?>, a> f3627a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, Boolean> f3628b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.d$a */
    @Deprecated
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Map<AbstractC0966l.a, List<b>> f3629a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final Map<b, AbstractC0966l.a> f3630b;

        public a(Map<b, AbstractC0966l.a> map) {
            this.f3630b = map;
            for (Map.Entry<b, AbstractC0966l.a> entry : map.entrySet()) {
                AbstractC0966l.a value = entry.getValue();
                List<b> arrayList = this.f3629a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f3629a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m4898b(List<b> list, InterfaceC0980s interfaceC0980s, AbstractC0966l.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m4900a(interfaceC0980s, aVar, obj);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m4899a(InterfaceC0980s interfaceC0980s, AbstractC0966l.a aVar, Object obj) {
            m4898b(this.f3629a.get(aVar), interfaceC0980s, aVar, obj);
            m4898b(this.f3629a.get(AbstractC0966l.a.ON_ANY), interfaceC0980s, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.d$b */
    @Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f3631a;

        /* JADX INFO: renamed from: b */
        public final Method f3632b;

        public b(int i10, Method method) {
            this.f3631a = i10;
            this.f3632b = method;
            method.setAccessible(true);
        }

        /* JADX INFO: renamed from: a */
        public void m4900a(InterfaceC0980s interfaceC0980s, AbstractC0966l.a aVar, Object obj) {
            try {
                int i10 = this.f3631a;
                if (i10 == 0) {
                    this.f3632b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f3632b.invoke(obj, interfaceC0980s);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f3632b.invoke(obj, interfaceC0980s, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3631a == bVar.f3631a && this.f3632b.getName().equals(bVar.f3632b.getName());
        }

        public int hashCode() {
            return (this.f3631a * 31) + this.f3632b.getName().hashCode();
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m4893a(Class<?> cls, Method[] methodArr) {
        int i10;
        a aVarM4895c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarM4895c = m4895c(superclass)) != null) {
            map.putAll(aVarM4895c.f3630b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC0966l.a> entry : m4895c(cls2).f3630b.entrySet()) {
                m4897e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m4894b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            InterfaceC0955f0 interfaceC0955f0 = (InterfaceC0955f0) method.getAnnotation(InterfaceC0955f0.class);
            if (interfaceC0955f0 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC0980s.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                AbstractC0966l.a aVarValue = interfaceC0955f0.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC0966l.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC0966l.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m4897e(map, new b(i10, method), aVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f3627a.put(cls, aVar);
        this.f3628b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public final Method[] m4894b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public a m4895c(Class<?> cls) {
        a aVar = this.f3627a.get(cls);
        return aVar != null ? aVar : m4893a(cls, null);
    }

    /* JADX INFO: renamed from: d */
    public boolean m4896d(Class<?> cls) {
        Boolean bool = this.f3628b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrM4894b = m4894b(cls);
        for (Method method : methodArrM4894b) {
            if (((InterfaceC0955f0) method.getAnnotation(InterfaceC0955f0.class)) != null) {
                m4893a(cls, methodArrM4894b);
                return true;
            }
        }
        this.f3628b.put(cls, Boolean.FALSE);
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m4897e(Map<b, AbstractC0966l.a> map, b bVar, AbstractC0966l.a aVar, Class<?> cls) {
        AbstractC0966l.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f3632b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
