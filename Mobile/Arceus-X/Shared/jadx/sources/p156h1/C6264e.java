package p156h1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p140g0.C5902k0;
import p296n0.InterfaceC8721a2;
import p296n0.InterfaceC8855z1;
import p297n1.C8859b;

/* JADX INFO: renamed from: h1.e */
/* JADX INFO: loaded from: classes.dex */
public class C6264e implements InterfaceC8855z1 {

    /* JADX INFO: renamed from: c */
    public final InterfaceC8855z1 f23790c;

    /* JADX INFO: renamed from: d */
    public final C5902k0 f23791d;

    /* JADX INFO: renamed from: e */
    public final Map<Integer, InterfaceC8721a2> f23792e = new HashMap();

    public C6264e(InterfaceC8855z1 interfaceC8855z1, C5902k0 c5902k0) {
        this.f23790c = interfaceC8855z1;
        this.f23791d = c5902k0;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC8721a2 m27514c(InterfaceC8721a2 interfaceC8721a2, C5902k0 c5902k0) {
        if (interfaceC8721a2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC8721a2.c cVar : interfaceC8721a2.mo27490b()) {
            if (C8859b.m35574f(cVar, c5902k0)) {
                arrayList.add(cVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC8721a2.b.m34986h(interfaceC8721a2.mo27489a(), interfaceC8721a2.mo27491e(), interfaceC8721a2.mo27492f(), arrayList);
    }

    /* JADX INFO: renamed from: d */
    private InterfaceC8721a2 m27515d(int i10) {
        if (this.f23792e.containsKey(Integer.valueOf(i10))) {
            return this.f23792e.get(Integer.valueOf(i10));
        }
        if (!this.f23790c.mo27503a(i10)) {
            return null;
        }
        InterfaceC8721a2 interfaceC8721a2M27514c = m27514c(this.f23790c.mo27504b(i10), this.f23791d);
        this.f23792e.put(Integer.valueOf(i10), interfaceC8721a2M27514c);
        return interfaceC8721a2M27514c;
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: a */
    public boolean mo27503a(int i10) {
        return this.f23790c.mo27503a(i10) && m27515d(i10) != null;
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: b */
    public InterfaceC8721a2 mo27504b(int i10) {
        return m27515d(i10);
    }
}
