package f4;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<q> f15555a = new ArrayList<>();
    public final HashMap<String, r0> b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, Bundle> f15556c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n0 f15557d;

    public void A(@NonNull n0 n0Var) {
        this.f15557d = n0Var;
    }

    public Bundle B(@NonNull String str, Bundle bundle) {
        return bundle != null ? this.f15556c.put(str, bundle) : this.f15556c.remove(str);
    }

    public void a(@NonNull q qVar) {
        if (this.f15555a.contains(qVar)) {
            throw new IllegalStateException("Fragment already added: " + qVar);
        }
        synchronized (this.f15555a) {
            this.f15555a.add(qVar);
        }
        qVar.f15484l = true;
    }

    public void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(@NonNull String str) {
        return this.b.get(str) != null;
    }

    public void d(int i10) {
        for (r0 r0Var : this.b.values()) {
            if (r0Var != null) {
                r0Var.s(i10);
            }
        }
    }

    public void e(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (r0 r0Var : this.b.values()) {
                printWriter.print(str);
                if (r0Var != null) {
                    q qVarK = r0Var.k();
                    printWriter.println(qVarK);
                    qVarK.l(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f15555a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = this.f15555a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(qVar.toString());
            }
        }
    }

    public q f(@NonNull String str) {
        r0 r0Var = this.b.get(str);
        if (r0Var != null) {
            return r0Var.k();
        }
        return null;
    }

    public q g(int i10) {
        for (int size = this.f15555a.size() - 1; size >= 0; size--) {
            q qVar = this.f15555a.get(size);
            if (qVar != null && qVar.f15498z == i10) {
                return qVar;
            }
        }
        for (r0 r0Var : this.b.values()) {
            if (r0Var != null) {
                q qVarK = r0Var.k();
                if (qVarK.f15498z == i10) {
                    return qVarK;
                }
            }
        }
        return null;
    }

    public q h(String str) {
        if (str != null) {
            for (int size = this.f15555a.size() - 1; size >= 0; size--) {
                q qVar = this.f15555a.get(size);
                if (qVar != null && str.equals(qVar.B)) {
                    return qVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (r0 r0Var : this.b.values()) {
            if (r0Var != null) {
                q qVarK = r0Var.k();
                if (str.equals(qVarK.B)) {
                    return qVarK;
                }
            }
        }
        return null;
    }

    public q i(@NonNull String str) {
        q qVarN;
        for (r0 r0Var : this.b.values()) {
            if (r0Var != null && (qVarN = r0Var.k().n(str)) != null) {
                return qVarN;
            }
        }
        return null;
    }

    public int j(@NonNull q qVar) {
        View view;
        View view2;
        ViewGroup viewGroup = qVar.J;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f15555a.indexOf(qVar);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            q qVar2 = this.f15555a.get(i10);
            if (qVar2.J == viewGroup && (view2 = qVar2.K) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f15555a.size()) {
                return -1;
            }
            q qVar3 = this.f15555a.get(iIndexOf);
            if (qVar3.J == viewGroup && (view = qVar3.K) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    @NonNull
    public List<r0> k() {
        ArrayList arrayList = new ArrayList();
        for (r0 r0Var : this.b.values()) {
            if (r0Var != null) {
                arrayList.add(r0Var);
            }
        }
        return arrayList;
    }

    @NonNull
    public List<q> l() {
        ArrayList arrayList = new ArrayList();
        for (r0 r0Var : this.b.values()) {
            if (r0Var != null) {
                arrayList.add(r0Var.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @NonNull
    public HashMap<String, Bundle> m() {
        return this.f15556c;
    }

    public r0 n(@NonNull String str) {
        return this.b.get(str);
    }

    @NonNull
    public List<q> o() {
        ArrayList arrayList;
        if (this.f15555a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f15555a) {
            arrayList = new ArrayList(this.f15555a);
        }
        return arrayList;
    }

    public n0 p() {
        return this.f15557d;
    }

    public Bundle q(@NonNull String str) {
        return this.f15556c.get(str);
    }

    public void r(@NonNull r0 r0Var) {
        q qVarK = r0Var.k();
        if (c(qVarK.f15478f)) {
            return;
        }
        this.b.put(qVarK.f15478f, r0Var);
        if (qVarK.F) {
            if (qVarK.E) {
                this.f15557d.e(qVarK);
            } else {
                this.f15557d.o(qVarK);
            }
            qVarK.F = false;
        }
        if (k0.N0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + qVarK);
        }
    }

    public void s(@NonNull r0 r0Var) {
        q qVarK = r0Var.k();
        if (qVarK.E) {
            this.f15557d.o(qVarK);
        }
        if (this.b.get(qVarK.f15478f) == r0Var && this.b.put(qVarK.f15478f, null) != null && k0.N0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + qVarK);
        }
    }

    public void t() {
        ArrayList<q> arrayList = this.f15555a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            q qVar = arrayList.get(i10);
            i10++;
            r0 r0Var = this.b.get(qVar.f15478f);
            if (r0Var != null) {
                r0Var.m();
            }
        }
        for (r0 r0Var2 : this.b.values()) {
            if (r0Var2 != null) {
                r0Var2.m();
                q qVarK = r0Var2.k();
                if (qVarK.f15485m && !qVarK.s0()) {
                    if (qVarK.f15487o && !this.f15556c.containsKey(qVarK.f15478f)) {
                        B(qVarK.f15478f, r0Var2.q());
                    }
                    s(r0Var2);
                }
            }
        }
    }

    public void u(@NonNull q qVar) {
        synchronized (this.f15555a) {
            this.f15555a.remove(qVar);
        }
        qVar.f15484l = false;
    }

    public void v() {
        this.b.clear();
    }

    public void w(List<String> list) {
        this.f15555a.clear();
        if (list != null) {
            for (String str : list) {
                q qVarF = f(str);
                if (qVarF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (k0.N0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + qVarF);
                }
                a(qVarF);
            }
        }
    }

    public void x(@NonNull HashMap<String, Bundle> map) {
        this.f15556c.clear();
        this.f15556c.putAll(map);
    }

    @NonNull
    public ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.b.size());
        for (r0 r0Var : this.b.values()) {
            if (r0Var != null) {
                q qVarK = r0Var.k();
                B(qVarK.f15478f, r0Var.q());
                arrayList.add(qVarK.f15478f);
                if (k0.N0(2)) {
                    Log.v("FragmentManager", "Saved state of " + qVarK + ": " + qVarK.b);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<String> z() {
        synchronized (this.f15555a) {
            try {
                if (this.f15555a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f15555a.size());
                ArrayList<q> arrayList2 = this.f15555a;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    q qVar = arrayList2.get(i10);
                    i10++;
                    q qVar2 = qVar;
                    arrayList.add(qVar2.f15478f);
                    if (k0.N0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + qVar2.f15478f + "): " + qVar2);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
