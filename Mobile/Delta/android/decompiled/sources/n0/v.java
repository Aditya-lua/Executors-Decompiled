package n0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    public static final class a extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<u> f24889a = new ArrayList();

        public a(List<u> list) {
            for (u uVar : list) {
                if (!(uVar instanceof b)) {
                    this.f24889a.add(uVar);
                }
            }
        }

        @Override // n0.u
        public void a(int i10) {
            Iterator<u> it = this.f24889a.iterator();
            while (it.hasNext()) {
                it.next().a(i10);
            }
        }

        @Override // n0.u
        public void b(int i10, e0 e0Var) {
            Iterator<u> it = this.f24889a.iterator();
            while (it.hasNext()) {
                it.next().b(i10, e0Var);
            }
        }

        @Override // n0.u
        public void c(int i10, w wVar) {
            Iterator<u> it = this.f24889a.iterator();
            while (it.hasNext()) {
                it.next().c(i10, wVar);
            }
        }

        @Override // n0.u
        public void d(int i10) {
            Iterator<u> it = this.f24889a.iterator();
            while (it.hasNext()) {
                it.next().d(i10);
            }
        }

        public List<u> e() {
            return this.f24889a;
        }
    }

    public static final class b extends u {
        @Override // n0.u
        public void b(int i10, e0 e0Var) {
        }

        @Override // n0.u
        public void c(int i10, w wVar) {
        }

        @Override // n0.u
        public void d(int i10) {
        }
    }

    public static u a(List<u> list) {
        if (list.isEmpty()) {
            return c();
        }
        return list.size() == 1 ? list.get(0) : new a(list);
    }

    public static u b(u... uVarArr) {
        return a(Arrays.asList(uVarArr));
    }

    public static u c() {
        return new b();
    }
}
