package e4;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends x0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a1.c f15696i = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15699e;
    public final HashMap<String, androidx.fragment.app.c> b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, d0> f15697c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, b1> f15698d = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15700f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15701g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15702h = false;

    public class a implements a1.c {
        @Override // androidx.lifecycle.a1.c
        @NonNull
        public <T extends x0> T c(@NonNull Class<T> cls) {
            return new d0(true);
        }
    }

    public d0(boolean z10) {
        this.f15699e = z10;
    }

    @NonNull
    public static d0 k(b1 b1Var) {
        return (d0) new a1(b1Var, f15696i).b(d0.class);
    }

    @Override // androidx.p000lifecycle.x0
    public void d() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f15700f = true;
    }

    public void e(@NonNull androidx.fragment.app.c cVar) {
        if (this.f15702h) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.containsKey(cVar.f2449f)) {
                return;
            }
            this.b.put(cVar.f2449f, cVar);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + cVar);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (this.b.equals(d0Var.b) && this.f15697c.equals(d0Var.f15697c) && this.f15698d.equals(d0Var.f15698d)) {
                return true;
            }
        }
        return false;
    }

    public void f(@NonNull androidx.fragment.app.c cVar, boolean z10) {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + cVar);
        }
        h(cVar.f2449f, z10);
    }

    public void g(@NonNull String str, boolean z10) {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str, z10);
    }

    public final void h(@NonNull String str, boolean z10) {
        d0 d0Var = this.f15697c.get(str);
        if (d0Var != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(d0Var.f15697c.keySet());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    d0Var.g((String) obj, true);
                }
            }
            d0Var.d();
            this.f15697c.remove(str);
        }
        b1 b1Var = this.f15698d.get(str);
        if (b1Var != null) {
            b1Var.a();
            this.f15698d.remove(str);
        }
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.f15697c.hashCode()) * 31) + this.f15698d.hashCode();
    }

    public androidx.fragment.app.c i(String str) {
        return this.b.get(str);
    }

    @NonNull
    public d0 j(@NonNull androidx.fragment.app.c cVar) {
        d0 d0Var = this.f15697c.get(cVar.f2449f);
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0(this.f15699e);
        this.f15697c.put(cVar.f2449f, d0Var2);
        return d0Var2;
    }

    @NonNull
    public Collection<androidx.fragment.app.c> l() {
        return new ArrayList(this.b.values());
    }

    @NonNull
    public b1 m(@NonNull androidx.fragment.app.c cVar) {
        b1 b1Var = this.f15698d.get(cVar.f2449f);
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1();
        this.f15698d.put(cVar.f2449f, b1Var2);
        return b1Var2;
    }

    public boolean n() {
        return this.f15700f;
    }

    public void o(@NonNull androidx.fragment.app.c cVar) {
        if (this.f15702h) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(cVar.f2449f) == null || !FragmentManager.N0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + cVar);
        }
    }

    public void p(boolean z10) {
        this.f15702h = z10;
    }

    public boolean q(@NonNull androidx.fragment.app.c cVar) {
        if (this.b.containsKey(cVar.f2449f)) {
            return this.f15699e ? this.f15700f : !this.f15701g;
        }
        return true;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<androidx.fragment.app.c> it = this.b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f15697c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f15698d.keySet().iterator();
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
