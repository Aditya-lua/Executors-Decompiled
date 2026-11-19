package lg;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ng.w f22120a = ng.w.f25567g;
    public v b = v.f22143a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f22121c = c.f22079a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Type, h<?>> f22122d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b0> f22123e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<b0> f22124f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22125g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f22126h = f.B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22127i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22128j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22129k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22130l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22131m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f22132n = f.A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22133o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x f22134p = f.f22090z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22135q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z f22136r = f.D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z f22137s = f.E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayDeque<w> f22138t = new ArrayDeque<>();

    public static void a(String str, int i10, int i11, List<b0> list) {
        b0 b0VarB;
        b0 b0VarB2;
        boolean z10 = rg.d.f30704a;
        b0 b0VarA = null;
        if (str != null && !str.trim().isEmpty()) {
            b0VarB = og.c.b.b.b(str);
            if (z10) {
                b0VarA = rg.d.f30705c.b(str);
                b0VarB2 = rg.d.b.b(str);
            } else {
                b0VarB2 = null;
            }
        } else {
            if (i10 == 2 && i11 == 2) {
                return;
            }
            b0 b0VarA2 = og.c.b.b.a(i10, i11);
            if (z10) {
                b0VarA = rg.d.f30705c.a(i10, i11);
                b0 b0VarA3 = rg.d.b.a(i10, i11);
                b0VarB = b0VarA2;
                b0VarB2 = b0VarA3;
            } else {
                b0VarB = b0VarA2;
                b0VarB2 = null;
            }
        }
        list.add(b0VarB);
        if (z10) {
            list.add(b0VarA);
            list.add(b0VarB2);
        }
    }

    public static boolean c(Type type) {
        return type == Object.class;
    }

    public f b() {
        ArrayList arrayList = new ArrayList(this.f22123e.size() + this.f22124f.size() + 3);
        arrayList.addAll(this.f22123e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f22124f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f22126h, this.f22127i, this.f22128j, arrayList);
        return new f(this.f22120a, this.f22121c, new HashMap(this.f22122d), this.f22125g, this.f22129k, this.f22133o, this.f22131m, this.f22132n, this.f22134p, this.f22130l, this.f22135q, this.b, this.f22126h, this.f22127i, this.f22128j, new ArrayList(this.f22123e), new ArrayList(this.f22124f), arrayList, this.f22136r, this.f22137s, new ArrayList(this.f22138t));
    }

    public g d(Type type, Object obj) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(obj);
        boolean z10 = obj instanceof t;
        if (!z10 && !(obj instanceof k) && !(obj instanceof h) && !(obj instanceof a0)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
        }
        if (c(type)) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
        }
        if (obj instanceof h) {
            this.f22122d.put(type, (h) obj);
        }
        if (z10 || (obj instanceof k)) {
            this.f22123e.add(og.n.c(sg.a.b(type), obj));
        }
        if (obj instanceof a0) {
            this.f22123e.add(og.p.c(sg.a.b(type), (a0) obj));
        }
        return this;
    }

    public g e(b0 b0Var) {
        Objects.requireNonNull(b0Var);
        this.f22123e.add(b0Var);
        return this;
    }

    public g f() {
        this.f22125g = true;
        return this;
    }

    public g g(c cVar) {
        return h(cVar);
    }

    public g h(d dVar) {
        Objects.requireNonNull(dVar);
        this.f22121c = dVar;
        return this;
    }
}
