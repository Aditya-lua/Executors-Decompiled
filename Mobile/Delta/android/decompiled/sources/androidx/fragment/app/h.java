package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.p000lifecycle.l;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f2518a;
    public final ClassLoader b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2525i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f2529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f2531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<String> f2532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<String> f2533q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList<Runnable> f2535s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<a> f2519c = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2526j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2534r = false;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2536a;
        public c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2540f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2541g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public l.b f2542h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public l.b f2543i;

        public a() {
        }

        public a(int i10, c cVar) {
            this.f2536a = i10;
            this.b = cVar;
            this.f2537c = false;
            l.b bVar = l.b.RESUMED;
            this.f2542h = bVar;
            this.f2543i = bVar;
        }

        public a(int i10, c cVar, boolean z10) {
            this.f2536a = i10;
            this.b = cVar;
            this.f2537c = z10;
            l.b bVar = l.b.RESUMED;
            this.f2542h = bVar;
            this.f2543i = bVar;
        }
    }

    public h(@NonNull e eVar, ClassLoader classLoader) {
        this.f2518a = eVar;
        this.b = classLoader;
    }

    @NonNull
    public h b(int i10, @NonNull c cVar, String str) {
        l(i10, cVar, str, 1);
        return this;
    }

    @NonNull
    public final h c(@NonNull ViewGroup viewGroup, @NonNull c cVar, String str) {
        cVar.J = viewGroup;
        cVar.f2461r = true;
        return b(viewGroup.getId(), cVar, str);
    }

    @NonNull
    public h d(@NonNull c cVar, String str) {
        l(0, cVar, str, 1);
        return this;
    }

    public void e(a aVar) {
        this.f2519c.add(aVar);
        aVar.f2538d = this.f2520d;
        aVar.f2539e = this.f2521e;
        aVar.f2540f = this.f2522f;
        aVar.f2541g = this.f2523g;
    }

    @NonNull
    public h f(String str) {
        if (!this.f2526j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f2525i = true;
        this.f2527k = str;
        return this;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    @NonNull
    public h k() {
        if (this.f2525i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2526j = false;
        return this;
    }

    public void l(int i10, c cVar, String str, int i11) {
        String str2 = cVar.T;
        if (str2 != null) {
            f4.c.f(cVar, str2);
        }
        Class<?> cls = cVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = cVar.B;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + cVar + ": was " + cVar.B + " now " + str);
            }
            cVar.B = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + cVar + " with tag " + str + " to container view with no id");
            }
            int i12 = cVar.f2469z;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + cVar + ": was " + cVar.f2469z + " now " + i10);
            }
            cVar.f2469z = i10;
            cVar.A = i10;
        }
        e(new a(i11, cVar));
    }

    @NonNull
    public h m(@NonNull c cVar) {
        e(new a(3, cVar));
        return this;
    }

    @NonNull
    public h n(int i10, @NonNull c cVar) {
        return o(i10, cVar, null);
    }

    @NonNull
    public h o(int i10, @NonNull c cVar, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        l(i10, cVar, str, 2);
        return this;
    }

    @NonNull
    public h p(boolean z10, @NonNull Runnable runnable) {
        if (!z10) {
            k();
        }
        if (this.f2535s == null) {
            this.f2535s = new ArrayList<>();
        }
        this.f2535s.add(runnable);
        return this;
    }

    @NonNull
    public h q(int i10, int i11) {
        return r(i10, i11, 0, 0);
    }

    @NonNull
    public h r(int i10, int i11, int i12, int i13) {
        this.f2520d = i10;
        this.f2521e = i11;
        this.f2522f = i12;
        this.f2523g = i13;
        return this;
    }

    @NonNull
    public h s(boolean z10) {
        this.f2534r = z10;
        return this;
    }

    @NonNull
    public h t(@NonNull c cVar) {
        e(new a(5, cVar));
        return this;
    }
}
