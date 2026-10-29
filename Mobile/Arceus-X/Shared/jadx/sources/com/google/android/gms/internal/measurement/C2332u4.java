package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2332u4 {

    /* JADX INFO: renamed from: a */
    public final C2332u4 f8682a;

    /* JADX INFO: renamed from: b */
    public final C2399y f8683b;

    /* JADX INFO: renamed from: c */
    public final Map f8684c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map f8685d = new HashMap();

    public C2332u4(C2332u4 c2332u4, C2399y c2399y) {
        this.f8682a = c2332u4;
        this.f8683b = c2399y;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q m10776a(InterfaceC2255q interfaceC2255q) {
        return this.f8683b.m10990b(this, interfaceC2255q);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2255q m10777b(C2055f c2055f) {
        InterfaceC2255q interfaceC2255qM10990b = InterfaceC2255q.f8587zo;
        Iterator itM9956i = c2055f.m9956i();
        while (itM9956i.hasNext()) {
            interfaceC2255qM10990b = this.f8683b.m10990b(this, c2055f.m9959m(((Integer) itM9956i.next()).intValue()));
            if (interfaceC2255qM10990b instanceof C2093h) {
                break;
            }
        }
        return interfaceC2255qM10990b;
    }

    /* JADX INFO: renamed from: c */
    public final C2332u4 m10778c() {
        return new C2332u4(this, this.f8683b);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10779d(String str) {
        if (this.f8684c.containsKey(str)) {
            return true;
        }
        C2332u4 c2332u4 = this.f8682a;
        if (c2332u4 != null) {
            return c2332u4.m10779d(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m10780e(String str, InterfaceC2255q interfaceC2255q) {
        C2332u4 c2332u4;
        Map map = this.f8684c;
        if (!map.containsKey(str) && (c2332u4 = this.f8682a) != null && c2332u4.m10779d(str)) {
            c2332u4.m10780e(str, interfaceC2255q);
        } else {
            if (this.f8685d.containsKey(str)) {
                return;
            }
            if (interfaceC2255q == null) {
                map.remove(str);
            } else {
                map.put(str, interfaceC2255q);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10781f(String str, InterfaceC2255q interfaceC2255q) {
        if (this.f8685d.containsKey(str)) {
            return;
        }
        if (interfaceC2255q == null) {
            this.f8684c.remove(str);
        } else {
            this.f8684c.put(str, interfaceC2255q);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10782g(String str, InterfaceC2255q interfaceC2255q) {
        m10781f(str, interfaceC2255q);
        this.f8685d.put(str, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC2255q m10783h(String str) {
        Map map = this.f8684c;
        if (map.containsKey(str)) {
            return (InterfaceC2255q) map.get(str);
        }
        C2332u4 c2332u4 = this.f8682a;
        if (c2332u4 != null) {
            return c2332u4.m10783h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }
}
