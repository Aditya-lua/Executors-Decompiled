package rk;

import android.util.Log;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30757a;
    public HashMap<String, a> b = new HashMap<>();

    public interface a {
        void a(rk.a aVar);
    }

    /* JADX INFO: renamed from: rk.b$b, reason: collision with other inner class name */
    public class C0537b implements a {
        @Override // rk.b.a
        public void a(rk.a aVar) {
            aVar.a(b.this.c(aVar.f().optString("functionName", "")), null);
        }

        public C0537b() {
        }
    }

    public b(String str) {
        this.f30757a = str;
        d("supports", new C0537b());
    }

    public void a(rk.a aVar) {
        String strD = aVar.d();
        a aVar2 = this.b.get(strD);
        if (aVar2 != null) {
            aVar2.a(aVar);
            return;
        }
        Log.e("RBHybridModule", "Cannot find function " + strD + " in module " + this.f30757a);
        aVar.a(false, null);
    }

    public String b() {
        return this.f30757a;
    }

    public boolean c(String str) {
        return this.b.containsKey(str);
    }

    public void d(String str, a aVar) {
        this.b.put(str, aVar);
    }
}
