package p093e4;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.C0933g;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: e4.g0 */
/* JADX INFO: loaded from: classes.dex */
public class C4812g0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList<ComponentCallbacksC0929c> f19429a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final HashMap<String, C0933g> f19430b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final HashMap<String, Bundle> f19431c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public C4806d0 f19432d;

    /* JADX INFO: renamed from: A */
    public void m23260A(@NonNull C4806d0 c4806d0) {
        this.f19432d = c4806d0;
    }

    /* JADX INFO: renamed from: B */
    public Bundle m23261B(@NonNull String str, Bundle bundle) {
        return bundle != null ? this.f19431c.put(str, bundle) : this.f19431c.remove(str);
    }

    /* JADX INFO: renamed from: a */
    public void m23262a(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        if (this.f19429a.contains(componentCallbacksC0929c)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC0929c);
        }
        synchronized (this.f19429a) {
            this.f19429a.add(componentCallbacksC0929c);
        }
        componentCallbacksC0929c.f3449l = true;
    }

    /* JADX INFO: renamed from: b */
    public void m23263b() {
        this.f19430b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: renamed from: c */
    public boolean m23264c(@NonNull String str) {
        return this.f19430b.get(str) != null;
    }

    /* JADX INFO: renamed from: d */
    public void m23265d(int i10) {
        for (C0933g c0933g : this.f19430b.values()) {
            if (c0933g != null) {
                c0933g.m4772s(i10);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m23266e(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f19430b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0933g c0933g : this.f19430b.values()) {
                printWriter.print(str);
                if (c0933g != null) {
                    ComponentCallbacksC0929c componentCallbacksC0929cM4764k = c0933g.m4764k();
                    printWriter.println(componentCallbacksC0929cM4764k);
                    componentCallbacksC0929cM4764k.mo4682l(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f19429a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                ComponentCallbacksC0929c componentCallbacksC0929c = this.f19429a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0929c.toString());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public ComponentCallbacksC0929c m23267f(@NonNull String str) {
        C0933g c0933g = this.f19430b.get(str);
        if (c0933g != null) {
            return c0933g.m4764k();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public ComponentCallbacksC0929c m23268g(int i10) {
        for (int size = this.f19429a.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0929c componentCallbacksC0929c = this.f19429a.get(size);
            if (componentCallbacksC0929c != null && componentCallbacksC0929c.f3463z == i10) {
                return componentCallbacksC0929c;
            }
        }
        for (C0933g c0933g : this.f19430b.values()) {
            if (c0933g != null) {
                ComponentCallbacksC0929c componentCallbacksC0929cM4764k = c0933g.m4764k();
                if (componentCallbacksC0929cM4764k.f3463z == i10) {
                    return componentCallbacksC0929cM4764k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public ComponentCallbacksC0929c m23269h(String str) {
        if (str != null) {
            for (int size = this.f19429a.size() - 1; size >= 0; size--) {
                ComponentCallbacksC0929c componentCallbacksC0929c = this.f19429a.get(size);
                if (componentCallbacksC0929c != null && str.equals(componentCallbacksC0929c.f3409B)) {
                    return componentCallbacksC0929c;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0933g c0933g : this.f19430b.values()) {
            if (c0933g != null) {
                ComponentCallbacksC0929c componentCallbacksC0929cM4764k = c0933g.m4764k();
                if (str.equals(componentCallbacksC0929cM4764k.f3409B)) {
                    return componentCallbacksC0929cM4764k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public ComponentCallbacksC0929c m23270i(@NonNull String str) {
        ComponentCallbacksC0929c componentCallbacksC0929cM4688n;
        for (C0933g c0933g : this.f19430b.values()) {
            if (c0933g != null && (componentCallbacksC0929cM4688n = c0933g.m4764k().m4688n(str)) != null) {
                return componentCallbacksC0929cM4688n;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public int m23271j(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        View view;
        View view2;
        ViewGroup viewGroup = componentCallbacksC0929c.f3417J;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f19429a.indexOf(componentCallbacksC0929c);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            ComponentCallbacksC0929c componentCallbacksC0929c2 = this.f19429a.get(i10);
            if (componentCallbacksC0929c2.f3417J == viewGroup && (view2 = componentCallbacksC0929c2.f3418K) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f19429a.size()) {
                return -1;
            }
            ComponentCallbacksC0929c componentCallbacksC0929c3 = this.f19429a.get(iIndexOf);
            if (componentCallbacksC0929c3.f3417J == viewGroup && (view = componentCallbacksC0929c3.f3418K) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public List<C0933g> m23272k() {
        ArrayList arrayList = new ArrayList();
        for (C0933g c0933g : this.f19430b.values()) {
            if (c0933g != null) {
                arrayList.add(c0933g);
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public List<ComponentCallbacksC0929c> m23273l() {
        ArrayList arrayList = new ArrayList();
        for (C0933g c0933g : this.f19430b.values()) {
            if (c0933g != null) {
                arrayList.add(c0933g.m4764k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public HashMap<String, Bundle> m23274m() {
        return this.f19431c;
    }

    /* JADX INFO: renamed from: n */
    public C0933g m23275n(@NonNull String str) {
        return this.f19430b.get(str);
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public List<ComponentCallbacksC0929c> m23276o() {
        ArrayList arrayList;
        if (this.f19429a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f19429a) {
            arrayList = new ArrayList(this.f19429a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public C4806d0 m23277p() {
        return this.f19432d;
    }

    /* JADX INFO: renamed from: q */
    public Bundle m23278q(@NonNull String str) {
        return this.f19431c.get(str);
    }

    /* JADX INFO: renamed from: r */
    public void m23279r(@NonNull C0933g c0933g) {
        ComponentCallbacksC0929c componentCallbacksC0929cM4764k = c0933g.m4764k();
        if (m23264c(componentCallbacksC0929cM4764k.f3443f)) {
            return;
        }
        this.f19430b.put(componentCallbacksC0929cM4764k.f3443f, c0933g);
        if (componentCallbacksC0929cM4764k.f3413F) {
            if (componentCallbacksC0929cM4764k.f3412E) {
                this.f19432d.m23248e(componentCallbacksC0929cM4764k);
            } else {
                this.f19432d.m23257o(componentCallbacksC0929cM4764k);
            }
            componentCallbacksC0929cM4764k.f3413F = false;
        }
        if (FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + componentCallbacksC0929cM4764k);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m23280s(@NonNull C0933g c0933g) {
        ComponentCallbacksC0929c componentCallbacksC0929cM4764k = c0933g.m4764k();
        if (componentCallbacksC0929cM4764k.f3412E) {
            this.f19432d.m23257o(componentCallbacksC0929cM4764k);
        }
        if (this.f19430b.get(componentCallbacksC0929cM4764k.f3443f) == c0933g && this.f19430b.put(componentCallbacksC0929cM4764k.f3443f, null) != null && FragmentManager.m4349N0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + componentCallbacksC0929cM4764k);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m23281t() {
        ArrayList<ComponentCallbacksC0929c> arrayList = this.f19429a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            ComponentCallbacksC0929c componentCallbacksC0929c = arrayList.get(i10);
            i10++;
            C0933g c0933g = this.f19430b.get(componentCallbacksC0929c.f3443f);
            if (c0933g != null) {
                c0933g.m4766m();
            }
        }
        for (C0933g c0933g2 : this.f19430b.values()) {
            if (c0933g2 != null) {
                c0933g2.m4766m();
                ComponentCallbacksC0929c componentCallbacksC0929cM4764k = c0933g2.m4764k();
                if (componentCallbacksC0929cM4764k.f3450m && !componentCallbacksC0929cM4764k.m4702s0()) {
                    if (componentCallbacksC0929cM4764k.f3452o && !this.f19431c.containsKey(componentCallbacksC0929cM4764k.f3443f)) {
                        m23261B(componentCallbacksC0929cM4764k.f3443f, c0933g2.m4770q());
                    }
                    m23280s(c0933g2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m23282u(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        synchronized (this.f19429a) {
            this.f19429a.remove(componentCallbacksC0929c);
        }
        componentCallbacksC0929c.f3449l = false;
    }

    /* JADX INFO: renamed from: v */
    public void m23283v() {
        this.f19430b.clear();
    }

    /* JADX INFO: renamed from: w */
    public void m23284w(List<String> list) {
        this.f19429a.clear();
        if (list != null) {
            for (String str : list) {
                ComponentCallbacksC0929c componentCallbacksC0929cM23267f = m23267f(str);
                if (componentCallbacksC0929cM23267f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + componentCallbacksC0929cM23267f);
                }
                m23262a(componentCallbacksC0929cM23267f);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m23285x(@NonNull HashMap<String, Bundle> map) {
        this.f19431c.clear();
        this.f19431c.putAll(map);
    }

    @NonNull
    /* JADX INFO: renamed from: y */
    public ArrayList<String> m23286y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f19430b.size());
        for (C0933g c0933g : this.f19430b.values()) {
            if (c0933g != null) {
                ComponentCallbacksC0929c componentCallbacksC0929cM4764k = c0933g.m4764k();
                m23261B(componentCallbacksC0929cM4764k.f3443f, c0933g.m4770q());
                arrayList.add(componentCallbacksC0929cM4764k.f3443f);
                if (FragmentManager.m4349N0(2)) {
                    Log.v("FragmentManager", "Saved state of " + componentCallbacksC0929cM4764k + ": " + componentCallbacksC0929cM4764k.f3436b);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public ArrayList<String> m23287z() {
        synchronized (this.f19429a) {
            try {
                if (this.f19429a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f19429a.size());
                ArrayList<ComponentCallbacksC0929c> arrayList2 = this.f19429a;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    ComponentCallbacksC0929c componentCallbacksC0929c = arrayList2.get(i10);
                    i10++;
                    ComponentCallbacksC0929c componentCallbacksC0929c2 = componentCallbacksC0929c;
                    arrayList.add(componentCallbacksC0929c2.f3443f);
                    if (FragmentManager.m4349N0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + componentCallbacksC0929c2.f3443f + "): " + componentCallbacksC0929c2);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
