package k2;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import com.github.luben.zstd.BuildConfig;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f21100a;
    public IconCompat b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f21102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21104f;

    public static class a {
        public static r a(PersistableBundle persistableBundle) {
            return new c().f(persistableBundle.getString("name")).g(persistableBundle.getString("uri")).e(persistableBundle.getString("key")).b(persistableBundle.getBoolean("isBot")).d(persistableBundle.getBoolean("isImportant")).a();
        }

        public static PersistableBundle b(r rVar) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = rVar.f21100a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", rVar.f21101c);
            persistableBundle.putString("key", rVar.f21102d);
            persistableBundle.putBoolean("isBot", rVar.f21103e);
            persistableBundle.putBoolean("isImportant", rVar.f21104f);
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
        public CharSequence f21105a;
        public IconCompat b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f21106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f21107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f21108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f21109f;

        public r a() {
            return new r(this);
        }

        public c b(boolean z10) {
            this.f21108e = z10;
            return this;
        }

        public c c(IconCompat iconCompat) {
            this.b = iconCompat;
            return this;
        }

        public c d(boolean z10) {
            this.f21109f = z10;
            return this;
        }

        public c e(String str) {
            this.f21107d = str;
            return this;
        }

        public c f(CharSequence charSequence) {
            this.f21105a = charSequence;
            return this;
        }

        public c g(String str) {
            this.f21106c = str;
            return this;
        }
    }

    public r(c cVar) {
        this.f21100a = cVar.f21105a;
        this.b = cVar.b;
        this.f21101c = cVar.f21106c;
        this.f21102d = cVar.f21107d;
        this.f21103e = cVar.f21108e;
        this.f21104f = cVar.f21109f;
    }

    public static r a(PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    public IconCompat b() {
        return this.b;
    }

    public String c() {
        return this.f21102d;
    }

    public CharSequence d() {
        return this.f21100a;
    }

    public String e() {
        return this.f21101c;
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
        return this.f21103e;
    }

    public boolean g() {
        return this.f21104f;
    }

    public String h() {
        String str = this.f21101c;
        if (str != null) {
            return str;
        }
        if (this.f21100a == null) {
            return BuildConfig.FLAVOR;
        }
        return "name:" + ((Object) this.f21100a);
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
        bundle.putCharSequence("name", this.f21100a);
        IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.n() : null);
        bundle.putString("uri", this.f21101c);
        bundle.putString("key", this.f21102d);
        bundle.putBoolean("isBot", this.f21103e);
        bundle.putBoolean("isImportant", this.f21104f);
        return bundle;
    }

    public PersistableBundle k() {
        return a.b(this);
    }
}
