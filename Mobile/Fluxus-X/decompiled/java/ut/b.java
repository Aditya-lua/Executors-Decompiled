package ut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import wt.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> implements ut.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, yt.a<ut.a.InterfaceC0692a<?>>> f33949a;

    public static final class a extends RuntimeException {
        public a(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    public b(Map<Class<?>, yt.a<ut.a.InterfaceC0692a<?>>> map, Map<String, yt.a<ut.a.InterfaceC0692a<?>>> map2) {
        this.f33949a = d(map, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <C, V> Map<String, yt.a<ut.a.InterfaceC0692a<?>>> d(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        LinkedHashMap linkedHashMapC = wt.b.c(map.size() + map2.size());
        linkedHashMapC.putAll(map2);
        for (Map.Entry<Class<? extends C>, V> entry : map.entrySet()) {
            linkedHashMapC.put(entry.getKey().getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(linkedHashMapC);
    }

    @Override // ut.a
    public void a(T t8) {
        if (!c(t8)) {
            throw new IllegalArgumentException(b(t8));
        }
    }

    public final String b(T t8) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = t8.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (this.f33949a.containsKey(superclass.getCanonicalName())) {
                arrayList.add(superclass.getCanonicalName());
            }
        }
        return arrayList.isEmpty() ? String.format("No injector factory bound for Class<%s>", t8.getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", t8.getClass().getCanonicalName(), arrayList);
    }

    public boolean c(T t8) {
        yt.a<ut.a.InterfaceC0692a<?>> aVar = this.f33949a.get(t8.getClass().getName());
        if (aVar == null) {
            return false;
        }
        ut.a.InterfaceC0692a<?> interfaceC0692a = aVar.get();
        try {
            ((ut.a) h.d(interfaceC0692a.a(t8), "%s.create(I) should not return null.", interfaceC0692a.getClass())).a(t8);
            return true;
        } catch (ClassCastException e10) {
            throw new a(String.format("%s does not implement AndroidInjector.Factory<%s>", interfaceC0692a.getClass().getCanonicalName(), t8.getClass().getCanonicalName()), e10);
        }
    }
}
