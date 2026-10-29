package p296n0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p140g0.C5931r1;

/* JADX INFO: renamed from: n0.h4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8765h4 {

    /* JADX INFO: renamed from: a */
    public final String f31872a;

    /* JADX INFO: renamed from: b */
    public final Map<String, b> f31873b = new LinkedHashMap();

    /* JADX INFO: renamed from: n0.h4$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo35064a(b bVar);
    }

    /* JADX INFO: renamed from: n0.h4$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final C8802o3 f31874a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC8771i4<?> f31875b;

        /* JADX INFO: renamed from: c */
        public final AbstractC8827t3 f31876c;

        /* JADX INFO: renamed from: d */
        public final List<InterfaceC8777j4.b> f31877d;

        /* JADX INFO: renamed from: e */
        public boolean f31878e = false;

        /* JADX INFO: renamed from: f */
        public boolean f31879f = false;

        public b(C8802o3 c8802o3, InterfaceC8771i4<?> interfaceC8771i4, AbstractC8827t3 abstractC8827t3, List<InterfaceC8777j4.b> list) {
            this.f31874a = c8802o3;
            this.f31875b = interfaceC8771i4;
            this.f31876c = abstractC8827t3;
            this.f31877d = list;
        }

        /* JADX INFO: renamed from: a */
        public boolean m35173a() {
            return this.f31879f;
        }

        /* JADX INFO: renamed from: b */
        public boolean m35174b() {
            return this.f31878e;
        }

        /* JADX INFO: renamed from: c */
        public List<InterfaceC8777j4.b> m35175c() {
            return this.f31877d;
        }

        /* JADX INFO: renamed from: d */
        public C8802o3 m35176d() {
            return this.f31874a;
        }

        /* JADX INFO: renamed from: e */
        public AbstractC8827t3 m35177e() {
            return this.f31876c;
        }

        /* JADX INFO: renamed from: f */
        public InterfaceC8771i4<?> m35178f() {
            return this.f31875b;
        }

        /* JADX INFO: renamed from: g */
        public void m35179g(boolean z10) {
            this.f31879f = z10;
        }

        /* JADX INFO: renamed from: h */
        public void m35180h(boolean z10) {
            this.f31878e = z10;
        }

        public String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f31874a + ", mUseCaseConfig=" + this.f31875b + ", mStreamSpec=" + this.f31876c + ", mCaptureTypes=" + this.f31877d + ", mAttached=" + this.f31878e + ", mActive=" + this.f31879f + '}';
        }
    }

    public C8765h4(String str) {
        this.f31872a = str;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m35152a(b bVar) {
        return bVar.m35173a() && bVar.m35174b();
    }

    /* JADX INFO: renamed from: e */
    public C8802o3.h m35156e() {
        C8802o3.h hVar = new C8802o3.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f31873b.entrySet()) {
            b value = entry.getValue();
            if (value.m35173a() && value.m35174b()) {
                String key = entry.getKey();
                hVar.m35358b(value.m35176d());
                arrayList.add(key);
            }
        }
        C5931r1.m26561a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f31872a);
        return hVar;
    }

    /* JADX INFO: renamed from: f */
    public Collection<C8802o3> m35157f() {
        return Collections.unmodifiableCollection(m35163l(new a() { // from class: n0.d4
            @Override // p296n0.C8765h4.a
            /* JADX INFO: renamed from: a */
            public final boolean mo35064a(C8765h4.b bVar) {
                return C8765h4.m35152a(bVar);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public C8802o3.h m35158g() {
        C8802o3.h hVar = new C8802o3.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f31873b.entrySet()) {
            b value = entry.getValue();
            if (value.m35174b()) {
                hVar.m35358b(value.m35176d());
                arrayList.add(entry.getKey());
            }
        }
        C5931r1.m26561a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f31872a);
        return hVar;
    }

    /* JADX INFO: renamed from: h */
    public Collection<C8802o3> m35159h() {
        return Collections.unmodifiableCollection(m35163l(new a() { // from class: n0.f4
            @Override // p296n0.C8765h4.a
            /* JADX INFO: renamed from: a */
            public final boolean mo35064a(C8765h4.b bVar) {
                return bVar.m35174b();
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public Collection<InterfaceC8771i4<?>> m35160i() {
        return Collections.unmodifiableCollection(m35164m(new a() { // from class: n0.g4
            @Override // p296n0.C8765h4.a
            /* JADX INFO: renamed from: a */
            public final boolean mo35064a(C8765h4.b bVar) {
                return bVar.m35174b();
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public Collection<b> m35161j() {
        return Collections.unmodifiableCollection(m35165n(new a() { // from class: n0.e4
            @Override // p296n0.C8765h4.a
            /* JADX INFO: renamed from: a */
            public final boolean mo35064a(C8765h4.b bVar) {
                return bVar.m35174b();
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final b m35162k(String str, C8802o3 c8802o3, InterfaceC8771i4<?> interfaceC8771i4, AbstractC8827t3 abstractC8827t3, List<InterfaceC8777j4.b> list) {
        b bVar = this.f31873b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(c8802o3, interfaceC8771i4, abstractC8827t3, list);
        this.f31873b.put(str, bVar2);
        return bVar2;
    }

    /* JADX INFO: renamed from: l */
    public final Collection<C8802o3> m35163l(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f31873b.entrySet()) {
            if (aVar == null || aVar.mo35064a(entry.getValue())) {
                arrayList.add(entry.getValue().m35176d());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final Collection<InterfaceC8771i4<?>> m35164m(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f31873b.entrySet()) {
            if (aVar == null || aVar.mo35064a(entry.getValue())) {
                arrayList.add(entry.getValue().m35178f());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public final Collection<b> m35165n(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f31873b.entrySet()) {
            if (aVar == null || aVar.mo35064a(entry.getValue())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public boolean m35166o(String str) {
        if (this.f31873b.containsKey(str)) {
            return this.f31873b.get(str).m35174b();
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m35167p(String str) {
        this.f31873b.remove(str);
    }

    /* JADX INFO: renamed from: q */
    public void m35168q(String str, C8802o3 c8802o3, InterfaceC8771i4<?> interfaceC8771i4, AbstractC8827t3 abstractC8827t3, List<InterfaceC8777j4.b> list) {
        m35162k(str, c8802o3, interfaceC8771i4, abstractC8827t3, list).m35179g(true);
    }

    /* JADX INFO: renamed from: r */
    public void m35169r(String str, C8802o3 c8802o3, InterfaceC8771i4<?> interfaceC8771i4, AbstractC8827t3 abstractC8827t3, List<InterfaceC8777j4.b> list) {
        m35162k(str, c8802o3, interfaceC8771i4, abstractC8827t3, list).m35180h(true);
        m35172u(str, c8802o3, interfaceC8771i4, abstractC8827t3, list);
    }

    /* JADX INFO: renamed from: s */
    public void m35170s(String str) {
        if (this.f31873b.containsKey(str)) {
            b bVar = this.f31873b.get(str);
            bVar.m35180h(false);
            if (bVar.m35173a()) {
                return;
            }
            this.f31873b.remove(str);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m35171t(String str) {
        if (this.f31873b.containsKey(str)) {
            b bVar = this.f31873b.get(str);
            bVar.m35179g(false);
            if (bVar.m35174b()) {
                return;
            }
            this.f31873b.remove(str);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m35172u(String str, C8802o3 c8802o3, InterfaceC8771i4<?> interfaceC8771i4, AbstractC8827t3 abstractC8827t3, List<InterfaceC8777j4.b> list) {
        if (this.f31873b.containsKey(str)) {
            b bVar = new b(c8802o3, interfaceC8771i4, abstractC8827t3, list);
            b bVar2 = this.f31873b.get(str);
            bVar.m35180h(bVar2.m35174b());
            bVar.m35179g(bVar2.m35173a());
            this.f31873b.put(str, bVar);
        }
    }
}
