package p235k2;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: renamed from: k2.r */
/* JADX INFO: loaded from: classes.dex */
public class C7426r {

    /* JADX INFO: renamed from: a */
    public CharSequence f28664a;

    /* JADX INFO: renamed from: b */
    public IconCompat f28665b;

    /* JADX INFO: renamed from: c */
    public String f28666c;

    /* JADX INFO: renamed from: d */
    public String f28667d;

    /* JADX INFO: renamed from: e */
    public boolean f28668e;

    /* JADX INFO: renamed from: f */
    public boolean f28669f;

    /* JADX INFO: renamed from: k2.r$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static C7426r m30922a(PersistableBundle persistableBundle) {
            return new c().m30929e(persistableBundle.getString("name")).m30930f(persistableBundle.getString("uri")).m30928d(persistableBundle.getString("key")).m30926b(persistableBundle.getBoolean("isBot")).m30927c(persistableBundle.getBoolean("isImportant")).m30925a();
        }

        /* JADX INFO: renamed from: b */
        public static PersistableBundle m30923b(C7426r c7426r) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = c7426r.f28664a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", c7426r.f28666c);
            persistableBundle.putString("key", c7426r.f28667d);
            persistableBundle.putBoolean("isBot", c7426r.f28668e);
            persistableBundle.putBoolean("isImportant", c7426r.f28669f);
            return persistableBundle;
        }
    }

    /* JADX INFO: renamed from: k2.r$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Person m30924a(C7426r c7426r) {
            return new Person.Builder().setName(c7426r.m30914d()).setIcon(c7426r.m30912b() != null ? c7426r.m30912b().m2698o() : null).setUri(c7426r.m30915e()).setKey(c7426r.m30913c()).setBot(c7426r.m30916f()).setImportant(c7426r.m30917g()).build();
        }
    }

    /* JADX INFO: renamed from: k2.r$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public CharSequence f28670a;

        /* JADX INFO: renamed from: b */
        public IconCompat f28671b;

        /* JADX INFO: renamed from: c */
        public String f28672c;

        /* JADX INFO: renamed from: d */
        public String f28673d;

        /* JADX INFO: renamed from: e */
        public boolean f28674e;

        /* JADX INFO: renamed from: f */
        public boolean f28675f;

        /* JADX INFO: renamed from: a */
        public C7426r m30925a() {
            return new C7426r(this);
        }

        /* JADX INFO: renamed from: b */
        public c m30926b(boolean z10) {
            this.f28674e = z10;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public c m30927c(boolean z10) {
            this.f28675f = z10;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public c m30928d(String str) {
            this.f28673d = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public c m30929e(CharSequence charSequence) {
            this.f28670a = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public c m30930f(String str) {
            this.f28672c = str;
            return this;
        }
    }

    public C7426r(c cVar) {
        this.f28664a = cVar.f28670a;
        this.f28665b = cVar.f28671b;
        this.f28666c = cVar.f28672c;
        this.f28667d = cVar.f28673d;
        this.f28668e = cVar.f28674e;
        this.f28669f = cVar.f28675f;
    }

    /* JADX INFO: renamed from: a */
    public static C7426r m30911a(PersistableBundle persistableBundle) {
        return a.m30922a(persistableBundle);
    }

    /* JADX INFO: renamed from: b */
    public IconCompat m30912b() {
        return this.f28665b;
    }

    /* JADX INFO: renamed from: c */
    public String m30913c() {
        return this.f28667d;
    }

    /* JADX INFO: renamed from: d */
    public CharSequence m30914d() {
        return this.f28664a;
    }

    /* JADX INFO: renamed from: e */
    public String m30915e() {
        return this.f28666c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C7426r)) {
            return false;
        }
        C7426r c7426r = (C7426r) obj;
        String strM30913c = m30913c();
        String strM30913c2 = c7426r.m30913c();
        if (strM30913c == null && strM30913c2 == null) {
            return Objects.equals(Objects.toString(m30914d()), Objects.toString(c7426r.m30914d())) && Objects.equals(m30915e(), c7426r.m30915e()) && Boolean.valueOf(m30916f()).equals(Boolean.valueOf(c7426r.m30916f())) && Boolean.valueOf(m30917g()).equals(Boolean.valueOf(c7426r.m30917g()));
        }
        return Objects.equals(strM30913c, strM30913c2);
    }

    /* JADX INFO: renamed from: f */
    public boolean m30916f() {
        return this.f28668e;
    }

    /* JADX INFO: renamed from: g */
    public boolean m30917g() {
        return this.f28669f;
    }

    /* JADX INFO: renamed from: h */
    public String m30918h() {
        String str = this.f28666c;
        if (str != null) {
            return str;
        }
        if (this.f28664a == null) {
            return "";
        }
        return "name:" + ((Object) this.f28664a);
    }

    public int hashCode() {
        String strM30913c = m30913c();
        return strM30913c != null ? strM30913c.hashCode() : Objects.hash(m30914d(), m30915e(), Boolean.valueOf(m30916f()), Boolean.valueOf(m30917g()));
    }

    /* JADX INFO: renamed from: i */
    public Person m30919i() {
        return b.m30924a(this);
    }

    /* JADX INFO: renamed from: j */
    public Bundle m30920j() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f28664a);
        IconCompat iconCompat = this.f28665b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m2697n() : null);
        bundle.putString("uri", this.f28666c);
        bundle.putString("key", this.f28667d);
        bundle.putBoolean("isBot", this.f28668e);
        bundle.putBoolean("isImportant", this.f28669f);
        return bundle;
    }

    /* JADX INFO: renamed from: k */
    public PersistableBundle m30921k() {
        return a.m30923b(this);
    }
}
