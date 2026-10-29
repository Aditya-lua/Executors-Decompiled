package jg;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
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
    public Excluder f21419a = Excluder.DEFAULT;
    public v b = v.f21442a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f21420c = c.f21378a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Type, h<?>> f21421d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b0> f21422e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<b0> f21423f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21424g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f21425h = f.B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21426i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21427j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21428k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f21429l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21430m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f21431n = f.A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21432o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x f21433p = f.f21389z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21434q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z f21435r = f.D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z f21436s = f.E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayDeque<w> f21437t = new ArrayDeque<>();

    public static void a(String str, int i10, int i11, List<b0> list) {
        b0 b0VarCreateAdapterFactory;
        b0 b0VarCreateAdapterFactory2;
        boolean z10 = SqlTypesSupport.SUPPORTS_SQL_TYPES;
        b0 b0VarCreateAdapterFactory3 = null;
        if (str != null && !str.trim().isEmpty()) {
            b0VarCreateAdapterFactory = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(str);
            if (z10) {
                b0VarCreateAdapterFactory3 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(str);
                b0VarCreateAdapterFactory2 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(str);
            } else {
                b0VarCreateAdapterFactory2 = null;
            }
        } else {
            if (i10 == 2 && i11 == 2) {
                return;
            }
            b0 b0VarCreateAdapterFactory4 = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(i10, i11);
            if (z10) {
                b0VarCreateAdapterFactory3 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(i10, i11);
                b0 b0VarCreateAdapterFactory5 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(i10, i11);
                b0VarCreateAdapterFactory = b0VarCreateAdapterFactory4;
                b0VarCreateAdapterFactory2 = b0VarCreateAdapterFactory5;
            } else {
                b0VarCreateAdapterFactory = b0VarCreateAdapterFactory4;
                b0VarCreateAdapterFactory2 = null;
            }
        }
        list.add(b0VarCreateAdapterFactory);
        if (z10) {
            list.add(b0VarCreateAdapterFactory3);
            list.add(b0VarCreateAdapterFactory2);
        }
    }

    public static boolean c(Type type) {
        return type == Object.class;
    }

    public f b() {
        ArrayList arrayList = new ArrayList(this.f21422e.size() + this.f21423f.size() + 3);
        arrayList.addAll(this.f21422e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f21423f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f21425h, this.f21426i, this.f21427j, arrayList);
        return new f(this.f21419a, this.f21420c, new HashMap(this.f21421d), this.f21424g, this.f21428k, this.f21432o, this.f21430m, this.f21431n, this.f21433p, this.f21429l, this.f21434q, this.b, this.f21425h, this.f21426i, this.f21427j, new ArrayList(this.f21422e), new ArrayList(this.f21423f), arrayList, this.f21435r, this.f21436s, new ArrayList(this.f21437t));
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
            this.f21421d.put(type, (h) obj);
        }
        if (z10 || (obj instanceof k)) {
            this.f21422e.add(TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken.get(type), obj));
        }
        if (obj instanceof a0) {
            this.f21422e.add(TypeAdapters.newFactory(TypeToken.get(type), (a0) obj));
        }
        return this;
    }

    public g e(b0 b0Var) {
        Objects.requireNonNull(b0Var);
        this.f21422e.add(b0Var);
        return this;
    }

    public g f() {
        this.f21424g = true;
        return this;
    }

    public g g(c cVar) {
        return h(cVar);
    }

    public g h(d dVar) {
        Objects.requireNonNull(dVar);
        this.f21420c = dVar;
        return this;
    }
}
