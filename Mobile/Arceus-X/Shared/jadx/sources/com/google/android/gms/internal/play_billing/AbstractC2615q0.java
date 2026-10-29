package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2615q0 implements Map, Serializable {

    /* JADX INFO: renamed from: a */
    public transient AbstractC2637s0 f9193a;

    /* JADX INFO: renamed from: b */
    public transient AbstractC2637s0 f9194b;

    /* JADX INFO: renamed from: c */
    public transient AbstractC2538j0 f9195c;

    /* JADX INFO: renamed from: c */
    public static AbstractC2615q0 m11679c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C2494f0.m11400a("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        C2494f0.m11400a("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        C2494f0.m11400a("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return C2451b1.m11272g(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC2538j0 mo11273a();

    /* JADX DEBUG: Method merged with bridge method: values()Ljava/util/Collection; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC2538j0 values() {
        AbstractC2538j0 abstractC2538j0 = this.f9195c;
        if (abstractC2538j0 != null) {
            return abstractC2538j0;
        }
        AbstractC2538j0 abstractC2538j0Mo11273a = mo11273a();
        this.f9195c = abstractC2538j0Mo11273a;
        return abstractC2538j0Mo11273a;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC2637s0 mo11274d();

    /* JADX INFO: renamed from: e */
    public abstract AbstractC2637s0 mo11275e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: entrySet()Ljava/util/Set; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final AbstractC2637s0 entrySet() {
        AbstractC2637s0 abstractC2637s0 = this.f9193a;
        if (abstractC2637s0 != null) {
            return abstractC2637s0;
        }
        AbstractC2637s0 abstractC2637s0Mo11274d = mo11274d();
        this.f9193a = abstractC2637s0Mo11274d;
        return abstractC2637s0Mo11274d;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C2473d1.m11354a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC2637s0 abstractC2637s0 = this.f9194b;
        if (abstractC2637s0 != null) {
            return abstractC2637s0;
        }
        AbstractC2637s0 abstractC2637s0Mo11275e = mo11275e();
        this.f9194b = abstractC2637s0Mo11275e;
        return abstractC2637s0Mo11275e;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
