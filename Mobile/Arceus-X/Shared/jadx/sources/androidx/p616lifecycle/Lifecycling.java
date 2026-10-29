package androidx.p616lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;
    private static Map<Class, Integer> sCallbackCache = new HashMap();
    private static Map<Class, List<Constructor<? extends GeneratedAdapter>>> sClassToAdapters = new HashMap();

    @NonNull
    static GenericLifecycleObserver getCallback(Object object) {
        if (object instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) object);
        }
        if (object instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) object;
        }
        Class<?> klass = object.getClass();
        int type = getObserverConstructorType(klass);
        if (type == 2) {
            List<Constructor<? extends GeneratedAdapter>> constructors = sClassToAdapters.get(klass);
            if (constructors.size() == 1) {
                GeneratedAdapter generatedAdapter = createGeneratedAdapter(constructors.get(0), object);
                return new SingleGeneratedAdapterObserver(generatedAdapter);
            }
            GeneratedAdapter[] adapters = new GeneratedAdapter[constructors.size()];
            for (int i10 = 0; i10 < constructors.size(); i10++) {
                adapters[i10] = createGeneratedAdapter(constructors.get(i10), object);
            }
            return new CompositeGeneratedAdaptersObserver(adapters);
        }
        return new ReflectiveGenericLifecycleObserver(object);
    }

    private static GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object object) {
        try {
            return constructor.newInstance(object);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Nullable
    private static Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> klass) {
        String str;
        try {
            Package aPackage = klass.getPackage();
            String name = klass.getCanonicalName();
            String fullPackage = aPackage != null ? aPackage.getName() : "";
            String adapterName = getAdapterName(fullPackage.isEmpty() ? name : name.substring(fullPackage.length() + 1));
            if (fullPackage.isEmpty()) {
                str = adapterName;
            } else {
                str = fullPackage + "." + adapterName;
            }
            Constructor declaredConstructor = Class.forName(str).getDeclaredConstructor(klass);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException e10) {
            return null;
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static int getObserverConstructorType(Class<?> klass) {
        if (sCallbackCache.containsKey(klass)) {
            return sCallbackCache.get(klass).intValue();
        }
        int type = resolveObserverCallbackType(klass);
        sCallbackCache.put(klass, Integer.valueOf(type));
        return type;
    }

    private static int resolveObserverCallbackType(Class<?> klass) {
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> constructor = generatedConstructor(klass);
        if (constructor != null) {
            sClassToAdapters.put(klass, Collections.singletonList(constructor));
            return 2;
        }
        boolean hasLifecycleMethods = ClassesInfoCache.sInstance.hasLifecycleMethods(klass);
        if (hasLifecycleMethods) {
            return 1;
        }
        Class<?> superclass = klass.getSuperclass();
        List<Constructor<? extends GeneratedAdapter>> adapterConstructors = null;
        if (isLifecycleParent(superclass)) {
            if (getObserverConstructorType(superclass) == 1) {
                return 1;
            }
            adapterConstructors = new ArrayList<>(sClassToAdapters.get(superclass));
        }
        for (Class<?> intrface : klass.getInterfaces()) {
            if (isLifecycleParent(intrface)) {
                if (getObserverConstructorType(intrface) == 1) {
                    return 1;
                }
                if (adapterConstructors == null) {
                    adapterConstructors = new ArrayList<>();
                }
                adapterConstructors.addAll(sClassToAdapters.get(intrface));
            }
        }
        if (adapterConstructors == null) {
            return 1;
        }
        sClassToAdapters.put(klass, adapterConstructors);
        return 2;
    }

    private static boolean isLifecycleParent(Class<?> klass) {
        return klass != null && LifecycleObserver.class.isAssignableFrom(klass);
    }

    public static String getAdapterName(String className) {
        return className.replace(".", "_") + "_LifecycleAdapter";
    }

    private Lifecycling() {
    }
}
