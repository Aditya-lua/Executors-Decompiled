package k2;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f22129a;
    public IconCompat b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f22131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22133f;

    public static class a {
        public static r a(PersistableBundle persistableBundle) {
            return new c().e(persistableBundle.getString("name")).f(persistableBundle.getString("uri")).d(persistableBundle.getString("key")).b(persistableBundle.getBoolean("isBot")).c(persistableBundle.getBoolean("isImportant")).a();
        }

        public static PersistableBundle b(r rVar) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = rVar.f22129a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", rVar.f22130c);
            persistableBundle.putString("key", rVar.f22131d);
            persistableBundle.putBoolean("isBot", rVar.f22132e);
            persistableBundle.putBoolean("isImportant", rVar.f22133f);
            return persistableBundle;
        }
    }

    public static class b {
        public static Person a(r rVar) {
            return new Person.Builder().setName(rVar.d()).setIcon(rVar.b() != null ? rVar.b().o() : null).setUri(rVar.e()).setKey(rVar.c()).setBot(rVar.f()).setImportant(rVar.g()).build();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f22134a;
        public IconCompat b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f22135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f22136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f22138f;

        public r a() {
            return new r(this);
        }

        public c b(boolean z10) {
            this.f22137e = z10;
            return this;
        }

        public c c(boolean z10) {
            this.f22138f = z10;
            return this;
        }

        public c d(String str) {
            this.f22136d = str;
            return this;
        }

        public c e(CharSequence charSequence) {
            this.f22134a = charSequence;
            return this;
        }

        public c f(String str) {
            this.f22135c = str;
            return this;
        }
    }

    public r(c cVar) {
        this.f22129a = cVar.f22134a;
        this.b = cVar.b;
        this.f22130c = cVar.f22135c;
        this.f22131d = cVar.f22136d;
        this.f22132e = cVar.f22137e;
        this.f22133f = cVar.f22138f;
    }

    public static r a(PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    public IconCompat b() {
        return this.b;
    }

    public String c() {
        return this.f22131d;
    }

    public CharSequence d() {
        return this.f22129a;
    }

    public String e() {
        return this.f22130c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        String strC = c();
        String strC2 = rVar.c();
        if (strC == null && strC2 == null) {
            return Objects.equals(Objects.toString(d()), Objects.toString(rVar.d())) && Objects.equals(e(), rVar.e()) && Boolean.valueOf(f()).equals(Boolean.valueOf(rVar.f())) && Boolean.valueOf(g()).equals(Boolean.valueOf(rVar.g()));
        }
        return Objects.equals(strC, strC2);
    }

    public boolean f() {
        return this.f22132e;
    }

    public boolean g() {
        return this.f22133f;
    }

    public String h() {
        String str = this.f22130c;
        if (str != null) {
            return str;
        }
        if (this.f22129a == null) {
            return "";
        }
        return "name:" + ((Object) this.f22129a);
    }

    public int hashCode() {
        String strC = c();
        return strC != null ? strC.hashCode() : Objects.hash(d(), e(), Boolean.valueOf(f()), Boolean.valueOf(g()));
    }

    public Person i() {
        return b.a(this);
    }

    public Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f22129a);
        IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.n() : null);
        bundle.putString("uri", this.f22130c);
        bundle.putString("key", this.f22131d);
        bundle.putBoolean("isBot", this.f22132e);
        bundle.putBoolean("isImportant", this.f22133f);
        return bundle;
    }

    public PersistableBundle k() {
        return a.b(this);
    }
}
