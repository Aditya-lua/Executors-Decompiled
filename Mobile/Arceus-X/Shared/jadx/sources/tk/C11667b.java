package tk;

import android.util.Log;
import java.util.HashMap;

/* JADX INFO: renamed from: tk.b */
/* JADX INFO: loaded from: classes2.dex */
public class C11667b {

    /* JADX INFO: renamed from: a */
    public String f41254a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, a> f41255b = new HashMap<>();

    /* JADX INFO: renamed from: tk.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo29964a(AbstractC11666a abstractC11666a);
    }

    /* JADX INFO: renamed from: tk.b$b */
    public class b implements a {
        @Override // tk.C11667b.a
        /* JADX INFO: renamed from: a */
        public void mo29964a(AbstractC11666a abstractC11666a) {
            abstractC11666a.mo43811a(C11667b.this.m43822c(abstractC11666a.m43816f().optString("functionName", "")), null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    public C11667b(String str) {
        this.f41254a = str;
        m43823d("supports", new b());
    }

    /* JADX INFO: renamed from: a */
    public void mo29963a(AbstractC11666a abstractC11666a) {
        String strM43814d = abstractC11666a.m43814d();
        a aVar = this.f41255b.get(strM43814d);
        if (aVar != null) {
            aVar.mo29964a(abstractC11666a);
            return;
        }
        Log.e("RBHybridModule", "Cannot find function " + strM43814d + " in module " + this.f41254a);
        abstractC11666a.mo43811a(false, null);
    }

    /* JADX INFO: renamed from: b */
    public String m43821b() {
        return this.f41254a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m43822c(String str) {
        return this.f41255b.containsKey(str);
    }

    /* JADX INFO: renamed from: d */
    public void m43823d(String str, a aVar) {
        this.f41255b.put(str, aVar);
    }
}
