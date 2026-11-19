package al;

import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f498a;
    public HashMap<String, a> b = new HashMap<>();

    public interface a {
        void a(al.a aVar);
    }

    /* JADX INFO: renamed from: al.b$b, reason: collision with other inner class name */
    public class C0015b implements a {
        @Override // al.b.a
        public void a(al.a aVar) {
            aVar.a(b.this.c(aVar.f().optString("functionName", BuildConfig.FLAVOR)), null);
        }

        public C0015b() {
        }
    }

    public b(String str) {
        this.f498a = str;
        d("supports", new C0015b());
    }

    public void a(al.a aVar) {
        String strD = aVar.d();
        a aVar2 = this.b.get(strD);
        if (aVar2 != null) {
            aVar2.a(aVar);
            return;
        }
        Log.e("RBHybridModule", "Cannot find function " + strD + " in module " + this.f498a);
        aVar.a(false, null);
    }

    public String b() {
        return this.f498a;
    }

    public boolean c(String str) {
        return this.b.containsKey(str);
    }

    public void d(String str, a aVar) {
        this.b.put(str, aVar);
    }
}
