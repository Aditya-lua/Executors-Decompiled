package ae;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f413a;
    public final List b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f414a = new ArrayList();
        public final List b = new ArrayList();

        public /* synthetic */ a(p pVar) {
        }

        public a a(String str) {
            this.f414a.add(str);
            return this;
        }

        @NonNull
        public d b() {
            return new d(this, null);
        }
    }

    public /* synthetic */ d(a aVar, q qVar) {
        this.f413a = new ArrayList(aVar.f414a);
        this.b = new ArrayList(aVar.b);
    }

    @NonNull
    public static a c() {
        return new a(null);
    }

    public List<Locale> a() {
        return this.b;
    }

    public List<String> b() {
        return this.f413a;
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.f413a, this.b);
    }
}
