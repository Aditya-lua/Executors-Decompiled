package p093e4;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import androidx.p616lifecycle.AbstractC0991x0;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: e4.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4806d0 extends AbstractC0991x0 {

    /* JADX INFO: renamed from: i */
    public static final C0941a1.c f19413i = new a();

    /* JADX INFO: renamed from: e */
    public final boolean f19417e;

    /* JADX INFO: renamed from: b */
    public final HashMap<String, ComponentCallbacksC0929c> f19414b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final HashMap<String, C4806d0> f19415c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final HashMap<String, C0944b1> f19416d = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public boolean f19418f = false;

    /* JADX INFO: renamed from: g */
    public boolean f19419g = false;

    /* JADX INFO: renamed from: h */
    public boolean f19420h = false;

    /* JADX INFO: renamed from: e4.d0$a */
    public class a implements C0941a1.c {
        @Override // androidx.p616lifecycle.C0941a1.c
        @NonNull
        /* JADX INFO: renamed from: b */
        public <T extends AbstractC0991x0> T mo4847b(@NonNull Class<T> cls) {
            return new C4806d0(true);
        }
    }

    public C4806d0(boolean z10) {
        this.f19417e = z10;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public static C4806d0 m23247k(C0944b1 c0944b1) {
        return (C4806d0) new C0941a1(c0944b1, f19413i).m4869b(C4806d0.class);
    }

    @Override // androidx.p616lifecycle.AbstractC0991x0
    /* JADX INFO: renamed from: d */
    public void mo5012d() {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f19418f = true;
    }

    /* JADX INFO: renamed from: e */
    public void m23248e(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (this.f19420h) {
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f19414b.containsKey(componentCallbacksC0929c.f3443f)) {
                return;
            }
            this.f19414b.put(componentCallbacksC0929c.f3443f, componentCallbacksC0929c);
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + componentCallbacksC0929c);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4806d0.class == obj.getClass()) {
            C4806d0 c4806d0 = (C4806d0) obj;
            if (this.f19414b.equals(c4806d0.f19414b) && this.f19415c.equals(c4806d0.f19415c) && this.f19416d.equals(c4806d0.f19416d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m23249f(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c, boolean z10) {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + componentCallbacksC0929c);
        }
        m23251h(componentCallbacksC0929c.f3443f, z10);
    }

    /* JADX INFO: renamed from: g */
    public void m23250g(@NonNull String str, boolean z10) {
        if (FragmentManager.m4349N0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m23251h(str, z10);
    }

    /* JADX INFO: renamed from: h */
    public final void m23251h(@NonNull String str, boolean z10) {
        C4806d0 c4806d0 = this.f19415c.get(str);
        if (c4806d0 != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c4806d0.f19415c.keySet());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    c4806d0.m23250g((String) obj, true);
                }
            }
            c4806d0.mo5012d();
            this.f19415c.remove(str);
        }
        C0944b1 c0944b1 = this.f19416d.get(str);
        if (c0944b1 != null) {
            c0944b1.m4887a();
            this.f19416d.remove(str);
        }
    }

    public int hashCode() {
        return (((this.f19414b.hashCode() * 31) + this.f19415c.hashCode()) * 31) + this.f19416d.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public ComponentCallbacksC0929c m23252i(String str) {
        return this.f19414b.get(str);
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public C4806d0 m23253j(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        C4806d0 c4806d0 = this.f19415c.get(componentCallbacksC0929c.f3443f);
        if (c4806d0 != null) {
            return c4806d0;
        }
        C4806d0 c4806d1 = new C4806d0(this.f19417e);
        this.f19415c.put(componentCallbacksC0929c.f3443f, c4806d1);
        return c4806d1;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public Collection<ComponentCallbacksC0929c> m23254l() {
        return new ArrayList(this.f19414b.values());
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public C0944b1 m23255m(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        C0944b1 c0944b1 = this.f19416d.get(componentCallbacksC0929c.f3443f);
        if (c0944b1 != null) {
            return c0944b1;
        }
        C0944b1 c0944b2 = new C0944b1();
        this.f19416d.put(componentCallbacksC0929c.f3443f, c0944b2);
        return c0944b2;
    }

    /* JADX INFO: renamed from: n */
    public boolean m23256n() {
        return this.f19418f;
    }

    /* JADX INFO: renamed from: o */
    public void m23257o(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (this.f19420h) {
            if (FragmentManager.m4349N0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f19414b.remove(componentCallbacksC0929c.f3443f) == null || !FragmentManager.m4349N0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + componentCallbacksC0929c);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m23258p(boolean z10) {
        this.f19420h = z10;
    }

    /* JADX INFO: renamed from: q */
    public boolean m23259q(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (this.f19414b.containsKey(componentCallbacksC0929c.f3443f)) {
            return this.f19417e ? this.f19418f : !this.f19419g;
        }
        return true;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<ComponentCallbacksC0929c> it = this.f19414b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f19415c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f19416d.keySet().iterator();
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
