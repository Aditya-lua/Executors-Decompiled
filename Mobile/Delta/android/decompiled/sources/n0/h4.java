package n0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24677a;
    public final Map<String, b> b = new LinkedHashMap();

    public interface a {
        boolean a(b bVar);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o3 f24678a;
        public final i4<?> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t3 f24679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<j4.b> f24680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f24681e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f24682f = false;

        public b(o3 o3Var, i4<?> i4Var, t3 t3Var, List<j4.b> list) {
            this.f24678a = o3Var;
            this.b = i4Var;
            this.f24679c = t3Var;
            this.f24680d = list;
        }

        public boolean a() {
            return this.f24682f;
        }

        public boolean b() {
            return this.f24681e;
        }

        public List<j4.b> c() {
            return this.f24680d;
        }

        public o3 d() {
            return this.f24678a;
        }

        public t3 e() {
            return this.f24679c;
        }

        public i4<?> f() {
            return this.b;
        }

        public void g(boolean z10) {
            this.f24682f = z10;
        }

        public void h(boolean z10) {
            this.f24681e = z10;
        }

        public String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f24678a + ", mUseCaseConfig=" + this.b + ", mStreamSpec=" + this.f24679c + ", mCaptureTypes=" + this.f24680d + ", mAttached=" + this.f24681e + ", mActive=" + this.f24682f + '}';
        }
    }

    public h4(String str) {
        this.f24677a = str;
    }

    public static /* synthetic */ boolean a(b bVar) {
        return bVar.a() && bVar.b();
    }

    public o3.h e() {
        o3.h hVar = new o3.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            b value = entry.getValue();
            if (value.a() && value.b()) {
                String key = entry.getKey();
                hVar.b(value.d());
                arrayList.add(key);
            }
        }
        g0.r1.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f24677a);
        return hVar;
    }

    public Collection<o3> f() {
        return Collections.unmodifiableCollection(l(new a() { // from class: n0.d4
            @Override // n0.h4.a
            public final boolean a(h4.b bVar) {
                return h4.a(bVar);
            }
        }));
    }

    public o3.h g() {
        o3.h hVar = new o3.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            b value = entry.getValue();
            if (value.b()) {
                hVar.b(value.d());
                arrayList.add(entry.getKey());
            }
        }
        g0.r1.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f24677a);
        return hVar;
    }

    public Collection<o3> h() {
        return Collections.unmodifiableCollection(l(new a() { // from class: n0.f4
            @Override // n0.h4.a
            public final boolean a(h4.b bVar) {
                return bVar.b();
            }
        }));
    }

    public Collection<i4<?>> i() {
        return Collections.unmodifiableCollection(m(new a() { // from class: n0.g4
            @Override // n0.h4.a
            public final boolean a(h4.b bVar) {
                return bVar.b();
            }
        }));
    }

    public Collection<b> j() {
        return Collections.unmodifiableCollection(n(new a() { // from class: n0.e4
            @Override // n0.h4.a
            public final boolean a(h4.b bVar) {
                return bVar.b();
            }
        }));
    }

    public final b k(String str, o3 o3Var, i4<?> i4Var, t3 t3Var, List<j4.b> list) {
        b bVar = this.b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(o3Var, i4Var, t3Var, list);
        this.b.put(str, bVar2);
        return bVar2;
    }

    public final Collection<o3> l(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().d());
            }
        }
        return arrayList;
    }

    public final Collection<i4<?>> m(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().f());
            }
        }
        return arrayList;
    }

    public final Collection<b> n(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public boolean o(String str) {
        if (this.b.containsKey(str)) {
            return this.b.get(str).b();
        }
        return false;
    }

    public void p(String str) {
        this.b.remove(str);
    }

    public void q(String str, o3 o3Var, i4<?> i4Var, t3 t3Var, List<j4.b> list) {
        k(str, o3Var, i4Var, t3Var, list).g(true);
    }

    public void r(String str, o3 o3Var, i4<?> i4Var, t3 t3Var, List<j4.b> list) {
        k(str, o3Var, i4Var, t3Var, list).h(true);
        u(str, o3Var, i4Var, t3Var, list);
    }

    public void s(String str) {
        if (this.b.containsKey(str)) {
            b bVar = this.b.get(str);
            bVar.h(false);
            if (bVar.a()) {
                return;
            }
            this.b.remove(str);
        }
    }

    public void t(String str) {
        if (this.b.containsKey(str)) {
            b bVar = this.b.get(str);
            bVar.g(false);
            if (bVar.b()) {
                return;
            }
            this.b.remove(str);
        }
    }

    public void u(String str, o3 o3Var, i4<?> i4Var, t3 t3Var, List<j4.b> list) {
        if (this.b.containsKey(str)) {
            b bVar = new b(o3Var, i4Var, t3Var, list);
            b bVar2 = this.b.get(str);
            bVar.h(bVar2.b());
            bVar.g(bVar2.a());
            this.b.put(str, bVar);
        }
    }
}
