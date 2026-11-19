package f4;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f15559a;
    public final ClassLoader b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15566i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f15570m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15571n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f15572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<String> f15573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<String> f15574q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList<Runnable> f15576s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<a> f15560c = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15567j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15575r = false;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15577a;
        public q b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15581f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15582g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public androidx.lifecycle.l.b f15583h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public androidx.lifecycle.l.b f15584i;

        public a() {
        }

        public a(int i10, q qVar) {
            this.f15577a = i10;
            this.b = qVar;
            this.f15578c = false;
            androidx.lifecycle.l.b bVar = androidx.lifecycle.l.b.RESUMED;
            this.f15583h = bVar;
            this.f15584i = bVar;
        }

        public a(int i10, q qVar, boolean z10) {
            this.f15577a = i10;
            this.b = qVar;
            this.f15578c = z10;
            androidx.lifecycle.l.b bVar = androidx.lifecycle.l.b.RESUMED;
            this.f15583h = bVar;
            this.f15584i = bVar;
        }
    }

    public t0(@NonNull z zVar, ClassLoader classLoader) {
        this.f15559a = zVar;
        this.b = classLoader;
    }

    @NonNull
    public t0 b(int i10, @NonNull q qVar, String str) {
        l(i10, qVar, str, 1);
        return this;
    }

    @NonNull
    public final t0 c(@NonNull ViewGroup viewGroup, @NonNull q qVar, String str) {
        qVar.J = viewGroup;
        qVar.f15490r = true;
        return b(viewGroup.getId(), qVar, str);
    }

    @NonNull
    public t0 d(@NonNull q qVar, String str) {
        l(0, qVar, str, 1);
        return this;
    }

    public void e(a aVar) {
        this.f15560c.add(aVar);
        aVar.f15579d = this.f15561d;
        aVar.f15580e = this.f15562e;
        aVar.f15581f = this.f15563f;
        aVar.f15582g = this.f15564g;
    }

    @NonNull
    public t0 f(String str) {
        if (!this.f15567j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f15566i = true;
        this.f15568k = str;
        return this;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    @NonNull
    public t0 k() {
        if (this.f15566i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f15567j = false;
        return this;
    }

    public void l(int i10, q qVar, String str, int i11) {
        String str2 = qVar.T;
        if (str2 != null) {
            g4.c.f(qVar, str2);
        }
        Class<?> cls = qVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = qVar.B;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + qVar + ": was " + qVar.B + " now " + str);
            }
            qVar.B = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + qVar + " with tag " + str + " to container view with no id");
            }
            int i12 = qVar.f15498z;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + qVar + ": was " + qVar.f15498z + " now " + i10);
            }
            qVar.f15498z = i10;
            qVar.A = i10;
        }
        e(new a(i11, qVar));
    }

    @NonNull
    public t0 m(@NonNull q qVar) {
        e(new a(3, qVar));
        return this;
    }

    @NonNull
    public t0 n(int i10, @NonNull q qVar) {
        return o(i10, qVar, null);
    }

    @NonNull
    public t0 o(int i10, @NonNull q qVar, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        l(i10, qVar, str, 2);
        return this;
    }

    @NonNull
    public t0 p(boolean z10, @NonNull Runnable runnable) {
        if (!z10) {
            k();
        }
        if (this.f15576s == null) {
            this.f15576s = new ArrayList<>();
        }
        this.f15576s.add(runnable);
        return this;
    }

    @NonNull
    public t0 q(int i10, int i11) {
        return r(i10, i11, 0, 0);
    }

    @NonNull
    public t0 r(int i10, int i11, int i12, int i13) {
        this.f15561d = i10;
        this.f15562e = i11;
        this.f15563f = i12;
        this.f15564g = i13;
        return this;
    }

    @NonNull
    public t0 s(boolean z10) {
        this.f15575r = z10;
        return this;
    }

    @NonNull
    public t0 t(@NonNull q qVar) {
        e(new a(5, qVar));
        return this;
    }
}
