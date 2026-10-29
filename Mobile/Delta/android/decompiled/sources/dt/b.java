package dt;

import ft.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> implements dt.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, ht.a<dt.a.InterfaceC0277a<?>>> f14881a;

    public static final class a extends RuntimeException {
        public a(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    public b(Map<Class<?>, ht.a<dt.a.InterfaceC0277a<?>>> map, Map<String, ht.a<dt.a.InterfaceC0277a<?>>> map2) {
        this.f14881a = d(map, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <C, V> Map<String, ht.a<dt.a.InterfaceC0277a<?>>> d(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        LinkedHashMap linkedHashMapC = ft.b.c(map.size() + map2.size());
        linkedHashMapC.putAll(map2);
        for (Map.Entry<Class<? extends C>, V> entry : map.entrySet()) {
            linkedHashMapC.put(entry.getKey().getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(linkedHashMapC);
    }

    @Override // dt.a
    public void a(T t8) {
        if (!c(t8)) {
            throw new IllegalArgumentException(b(t8));
        }
    }

    public final String b(T t8) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = t8.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (this.f14881a.containsKey(superclass.getCanonicalName())) {
                arrayList.add(superclass.getCanonicalName());
            }
        }
        return arrayList.isEmpty() ? String.format("No injector factory bound for Class<%s>", t8.getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", t8.getClass().getCanonicalName(), arrayList);
    }

    public boolean c(T t8) {
        ht.a<dt.a.InterfaceC0277a<?>> aVar = this.f14881a.get(t8.getClass().getName());
        if (aVar == null) {
            return false;
        }
        dt.a.InterfaceC0277a<?> interfaceC0277a = aVar.get();
        try {
            ((dt.a) h.d(interfaceC0277a.a(t8), "%s.create(I) should not return null.", interfaceC0277a.getClass())).a(t8);
            return true;
        } catch (ClassCastException e10) {
            throw new a(String.format("%s does not implement AndroidInjector.Factory<%s>", interfaceC0277a.getClass().getCanonicalName(), t8.getClass().getCanonicalName()), e10);
        }
    }
}
