package ae;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: ae.d */
/* JADX INFO: loaded from: classes2.dex */
public class C0157d {

    /* JADX INFO: renamed from: a */
    public final List f527a;

    /* JADX INFO: renamed from: b */
    public final List f528b;

    /* JADX INFO: renamed from: ae.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final List f529a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List f530b = new ArrayList();

        public /* synthetic */ a(C0181p c0181p) {
        }

        /* JADX INFO: renamed from: a */
        public a m500a(String str) {
            this.f529a.add(str);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C0157d m501b() {
            return new C0157d(this, null);
        }
    }

    public /* synthetic */ C0157d(a aVar, C0183q c0183q) {
        this.f527a = new ArrayList(aVar.f529a);
        this.f528b = new ArrayList(aVar.f530b);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static a m495c() {
        return new a(null);
    }

    /* JADX INFO: renamed from: a */
    public List<Locale> m496a() {
        return this.f528b;
    }

    /* JADX INFO: renamed from: b */
    public List<String> m497b() {
        return this.f527a;
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.f527a, this.f528b);
    }
}
