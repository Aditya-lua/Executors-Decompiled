package p086dt;

import ht.InterfaceC6564a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p136ft.C5828b;
import p136ft.C5834h;

/* JADX INFO: renamed from: dt.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4688b<T> implements InterfaceC4687a<T> {

    /* JADX INFO: renamed from: a */
    public final Map<String, InterfaceC6564a<InterfaceC4687a.a<?>>> f19172a;

    /* JADX INFO: renamed from: dt.b$a */
    public static final class a extends RuntimeException {
        public a(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    public C4688b(Map<Class<?>, InterfaceC6564a<InterfaceC4687a.a<?>>> map, Map<String, InterfaceC6564a<InterfaceC4687a.a<?>>> map2) {
        this.f19172a = m22991d(map, map2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, V> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static <C, V> Map<String, InterfaceC6564a<InterfaceC4687a.a<?>>> m22991d(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        LinkedHashMap linkedHashMapM26176c = C5828b.m26176c(map.size() + map2.size());
        linkedHashMapM26176c.putAll(map2);
        for (Map.Entry<Class<? extends C>, V> entry : map.entrySet()) {
            linkedHashMapM26176c.put(entry.getKey().getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(linkedHashMapM26176c);
    }

    @Override // p086dt.InterfaceC4687a
    /* JADX INFO: renamed from: a */
    public void mo18369a(T t8) {
        if (!m22993c(t8)) {
            throw new IllegalArgumentException(m22992b(t8));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m22992b(T t8) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = t8.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (this.f19172a.containsKey(superclass.getCanonicalName())) {
                arrayList.add(superclass.getCanonicalName());
            }
        }
        return arrayList.isEmpty() ? String.format("No injector factory bound for Class<%s>", t8.getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", t8.getClass().getCanonicalName(), arrayList);
    }

    /* JADX INFO: renamed from: c */
    public boolean m22993c(T t8) {
        InterfaceC6564a<InterfaceC4687a.a<?>> interfaceC6564a = this.f19172a.get(t8.getClass().getName());
        if (interfaceC6564a == null) {
            return false;
        }
        InterfaceC4687a.a<?> aVar = interfaceC6564a.get();
        try {
            ((InterfaceC4687a) C5834h.m26193d(aVar.mo18367a(t8), "%s.create(I) should not return null.", aVar.getClass())).mo18369a(t8);
            return true;
        } catch (ClassCastException e10) {
            throw new a(String.format("%s does not implement AndroidInjector.Factory<%s>", aVar.getClass().getCanonicalName(), t8.getClass().getCanonicalName()), e10);
        }
    }
}
