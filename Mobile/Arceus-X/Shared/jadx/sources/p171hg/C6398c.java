package p171hg;

import java.util.Iterator;
import java.util.Set;
import p292mf.C8492c;
import p292mf.C8511r;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;

/* JADX INFO: renamed from: hg.c */
/* JADX INFO: loaded from: classes2.dex */
public class C6398c implements InterfaceC6404i {

    /* JADX INFO: renamed from: a */
    public final String f24330a;

    /* JADX INFO: renamed from: b */
    public final C6399d f24331b;

    public C6398c(Set<AbstractC6401f> set, C6399d c6399d) {
        this.f24330a = m27979d(set);
        this.f24331b = c6399d;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
      (wrap java.util.Set:0x0004: INVOKE (r2v0 mf.d), (wrap java.lang.Class:0x0002: CONST_CLASS  A[WRAPPED] hg.f.class) INTERFACE call: mf.d.d(java.lang.Class):java.util.Set A[MD:<T>:(java.lang.Class<T>):java.util.Set<T> (m), WRAPPED])
      (wrap hg.d:0x0008: INVOKE  STATIC call: hg.d.a():hg.d A[MD:():hg.d (m), WRAPPED])
     A[MD:(java.util.Set<hg.f>, hg.d):void (m)] call: hg.c.<init>(java.util.Set, hg.d):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC6404i m27977b(InterfaceC8494d interfaceC8494d) {
        return new C6398c(interfaceC8494d.m34307d(AbstractC6401f.class), C6399d.m27981a());
    }

    /* JADX INFO: renamed from: c */
    public static C8492c<InterfaceC6404i> m27978c() {
        return C8492c.m34274c(InterfaceC6404i.class).m34291b(C8511r.m34362m(AbstractC6401f.class)).m34295f(new InterfaceC8500g() { // from class: hg.b
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return C6398c.m27977b(interfaceC8494d);
            }
        }).m34293d();
    }

    /* JADX INFO: renamed from: d */
    public static String m27979d(Set<AbstractC6401f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AbstractC6401f> it = set.iterator();
        while (it.hasNext()) {
            AbstractC6401f next = it.next();
            sb2.append(next.mo27975b());
            sb2.append('/');
            sb2.append(next.mo27976c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // p171hg.InterfaceC6404i
    /* JADX INFO: renamed from: a */
    public String mo27980a() {
        if (this.f24331b.m27982b().isEmpty()) {
            return this.f24330a;
        }
        return this.f24330a + ' ' + m27979d(this.f24331b.m27982b());
    }
}
