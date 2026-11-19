package f4;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends androidx.p000lifecycle.x0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final androidx.lifecycle.a1.c f15440i = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15443e;
    public final HashMap<String, q> b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, n0> f15441c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, androidx.p000lifecycle.b1> f15442d = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15444f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15445g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15446h = false;

    public class a implements androidx.lifecycle.a1.c {
        @Override // androidx.lifecycle.a1.c
        @NonNull
        public <T extends androidx.p000lifecycle.x0> T a(@NonNull Class<T> cls) {
            return new n0(true);
        }
    }

    public n0(boolean z10) {
        this.f15443e = z10;
    }

    @NonNull
    public static n0 k(androidx.p000lifecycle.b1 b1Var) {
        return (n0) new androidx.p000lifecycle.a1(b1Var, f15440i).a(n0.class);
    }

    @Override // androidx.p000lifecycle.x0
    public void d() {
        if (k0.N0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f15444f = true;
    }

    public void e(@NonNull q qVar) {
        if (this.f15446h) {
            if (k0.N0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.containsKey(qVar.f15478f)) {
                return;
            }
            this.b.put(qVar.f15478f, qVar);
            if (k0.N0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + qVar);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            if (this.b.equals(n0Var.b) && this.f15441c.equals(n0Var.f15441c) && this.f15442d.equals(n0Var.f15442d)) {
                return true;
            }
        }
        return false;
    }

    public void f(@NonNull q qVar, boolean z10) {
        if (k0.N0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + qVar);
        }
        h(qVar.f15478f, z10);
    }

    public void g(@NonNull String str, boolean z10) {
        if (k0.N0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str, z10);
    }

    public final void h(@NonNull String str, boolean z10) {
        n0 n0Var = this.f15441c.get(str);
        if (n0Var != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(n0Var.f15441c.keySet());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    n0Var.g((String) obj, true);
                }
            }
            n0Var.d();
            this.f15441c.remove(str);
        }
        androidx.p000lifecycle.b1 b1Var = this.f15442d.get(str);
        if (b1Var != null) {
            b1Var.a();
            this.f15442d.remove(str);
        }
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.f15441c.hashCode()) * 31) + this.f15442d.hashCode();
    }

    public q i(String str) {
        return this.b.get(str);
    }

    @NonNull
    public n0 j(@NonNull q qVar) {
        n0 n0Var = this.f15441c.get(qVar.f15478f);
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0(this.f15443e);
        this.f15441c.put(qVar.f15478f, n0Var2);
        return n0Var2;
    }

    @NonNull
    public Collection<q> l() {
        return new ArrayList(this.b.values());
    }

    @NonNull
    public androidx.p000lifecycle.b1 m(@NonNull q qVar) {
        androidx.p000lifecycle.b1 b1Var = this.f15442d.get(qVar.f15478f);
        if (b1Var != null) {
            return b1Var;
        }
        androidx.p000lifecycle.b1 b1Var2 = new androidx.p000lifecycle.b1();
        this.f15442d.put(qVar.f15478f, b1Var2);
        return b1Var2;
    }

    public boolean n() {
        return this.f15444f;
    }

    public void o(@NonNull q qVar) {
        if (this.f15446h) {
            if (k0.N0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(qVar.f15478f) == null || !k0.N0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + qVar);
        }
    }

    public void p(boolean z10) {
        this.f15446h = z10;
    }

    public boolean q(@NonNull q qVar) {
        if (this.b.containsKey(qVar.f15478f)) {
            return this.f15443e ? this.f15444f : !this.f15445g;
        }
        return true;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<q> it = this.b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f15441c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f15442d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
