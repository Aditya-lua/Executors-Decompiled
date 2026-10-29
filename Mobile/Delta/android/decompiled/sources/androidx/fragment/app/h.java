package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.p000lifecycle.l;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f2673a;
    public final ClassLoader b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2680i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f2684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2685n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f2686o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<String> f2687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<String> f2688q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList<Runnable> f2690s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<a> f2674c = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2681j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2689r = false;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2691a;
        public c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2696g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public l.b f2697h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public l.b f2698i;

        public a() {
        }

        public a(int i10, c cVar) {
            this.f2691a = i10;
            this.b = cVar;
            this.f2692c = false;
            l.b bVar = l.b.RESUMED;
            this.f2697h = bVar;
            this.f2698i = bVar;
        }

        public a(int i10, c cVar, boolean z10) {
            this.f2691a = i10;
            this.b = cVar;
            this.f2692c = z10;
            l.b bVar = l.b.RESUMED;
            this.f2697h = bVar;
            this.f2698i = bVar;
        }
    }

    public h(@NonNull e eVar, ClassLoader classLoader) {
        this.f2673a = eVar;
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
        cVar.f2616r = true;
        return b(viewGroup.getId(), cVar, str);
    }

    @NonNull
    public h d(@NonNull c cVar, String str) {
        l(0, cVar, str, 1);
        return this;
    }

    public void e(a aVar) {
        this.f2674c.add(aVar);
        aVar.f2693d = this.f2675d;
        aVar.f2694e = this.f2676e;
        aVar.f2695f = this.f2677f;
        aVar.f2696g = this.f2678g;
    }

    @NonNull
    public h f(String str) {
        if (!this.f2681j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f2680i = true;
        this.f2682k = str;
        return this;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    @NonNull
    public h k() {
        if (this.f2680i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2681j = false;
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
            int i12 = cVar.f2624z;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + cVar + ": was " + cVar.f2624z + " now " + i10);
            }
            cVar.f2624z = i10;
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
        if (this.f2690s == null) {
            this.f2690s = new ArrayList<>();
        }
        this.f2690s.add(runnable);
        return this;
    }

    @NonNull
    public h q(int i10, int i11) {
        return r(i10, i11, 0, 0);
    }

    @NonNull
    public h r(int i10, int i11, int i12, int i13) {
        this.f2675d = i10;
        this.f2676e = i11;
        this.f2677f = i12;
        this.f2678g = i13;
        return this;
    }

    @NonNull
    public h s(boolean z10) {
        this.f2689r = z10;
        return this;
    }

    @NonNull
    public h t(@NonNull c cVar) {
        e(new a(5, cVar));
        return this;
    }
}
