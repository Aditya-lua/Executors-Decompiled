package tk;

import android.util.Log;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31850a;
    public HashMap<String, a> b = new HashMap<>();

    public interface a {
        void a(tk.a aVar);
    }

    /* JADX INFO: renamed from: tk.b$b, reason: collision with other inner class name */
    public class C0575b implements a {
        @Override // tk.b.a
        public void a(tk.a aVar) {
            aVar.a(b.this.c(aVar.f().optString("functionName", "")), null);
        }

        public C0575b() {
        }
    }

    public b(String str) {
        this.f31850a = str;
        d("supports", new C0575b());
    }

    public void a(tk.a aVar) {
        String strD = aVar.d();
        a aVar2 = this.b.get(strD);
        if (aVar2 != null) {
            aVar2.a(aVar);
            return;
        }
        Log.e("RBHybridModule", "Cannot find function " + strD + " in module " + this.f31850a);
        aVar.a(false, null);
    }

    public String b() {
        return this.f31850a;
    }

    public boolean c(String str) {
        return this.b.containsKey(str);
    }

    public void d(String str, a aVar) {
        this.b.put(str, aVar);
    }
}
