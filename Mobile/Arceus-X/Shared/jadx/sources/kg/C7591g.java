package kg;

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

/* JADX INFO: renamed from: kg.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C7591g {

    /* JADX INFO: renamed from: a */
    public Excluder f29091a = Excluder.DEFAULT;

    /* JADX INFO: renamed from: b */
    public EnumC7606v f29092b = EnumC7606v.f29115a;

    /* JADX INFO: renamed from: c */
    public InterfaceC7588d f29093c = EnumC7587c.f29042a;

    /* JADX INFO: renamed from: d */
    public final Map<Type, InterfaceC7592h<?>> f29094d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC7586b0> f29095e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC7586b0> f29096f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public boolean f29097g = false;

    /* JADX INFO: renamed from: h */
    public String f29098h = C7590f.f29056B;

    /* JADX INFO: renamed from: i */
    public int f29099i = 2;

    /* JADX INFO: renamed from: j */
    public int f29100j = 2;

    /* JADX INFO: renamed from: k */
    public boolean f29101k = false;

    /* JADX INFO: renamed from: l */
    public boolean f29102l = false;

    /* JADX INFO: renamed from: m */
    public boolean f29103m = true;

    /* JADX INFO: renamed from: n */
    public C7589e f29104n = C7590f.f29055A;

    /* JADX INFO: renamed from: o */
    public boolean f29105o = false;

    /* JADX INFO: renamed from: p */
    public EnumC7608x f29106p = C7590f.f29060z;

    /* JADX INFO: renamed from: q */
    public boolean f29107q = true;

    /* JADX INFO: renamed from: r */
    public InterfaceC7610z f29108r = C7590f.f29058D;

    /* JADX INFO: renamed from: s */
    public InterfaceC7610z f29109s = C7590f.f29059E;

    /* JADX INFO: renamed from: t */
    public final ArrayDeque<InterfaceC7607w> f29110t = new ArrayDeque<>();

    /* JADX INFO: renamed from: a */
    public static void m31433a(String str, int i10, int i11, List<InterfaceC7586b0> list) {
        InterfaceC7586b0 interfaceC7586b0CreateAdapterFactory;
        InterfaceC7586b0 interfaceC7586b0CreateAdapterFactory2;
        boolean z10 = SqlTypesSupport.SUPPORTS_SQL_TYPES;
        InterfaceC7586b0 interfaceC7586b0CreateAdapterFactory3 = null;
        if (str != null && !str.trim().isEmpty()) {
            interfaceC7586b0CreateAdapterFactory = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(str);
            if (z10) {
                interfaceC7586b0CreateAdapterFactory3 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(str);
                interfaceC7586b0CreateAdapterFactory2 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(str);
            } else {
                interfaceC7586b0CreateAdapterFactory2 = null;
            }
        } else {
            if (i10 == 2 && i11 == 2) {
                return;
            }
            InterfaceC7586b0 interfaceC7586b0CreateAdapterFactory4 = DefaultDateTypeAdapter.DateType.DATE.createAdapterFactory(i10, i11);
            if (z10) {
                interfaceC7586b0CreateAdapterFactory3 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(i10, i11);
                InterfaceC7586b0 interfaceC7586b0CreateAdapterFactory5 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(i10, i11);
                interfaceC7586b0CreateAdapterFactory = interfaceC7586b0CreateAdapterFactory4;
                interfaceC7586b0CreateAdapterFactory2 = interfaceC7586b0CreateAdapterFactory5;
            } else {
                interfaceC7586b0CreateAdapterFactory = interfaceC7586b0CreateAdapterFactory4;
                interfaceC7586b0CreateAdapterFactory2 = null;
            }
        }
        list.add(interfaceC7586b0CreateAdapterFactory);
        if (z10) {
            list.add(interfaceC7586b0CreateAdapterFactory3);
            list.add(interfaceC7586b0CreateAdapterFactory2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m31434c(Type type) {
        return type == Object.class;
    }

    /* JADX INFO: renamed from: b */
    public C7590f m31435b() {
        ArrayList arrayList = new ArrayList(this.f29095e.size() + this.f29096f.size() + 3);
        arrayList.addAll(this.f29095e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f29096f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        m31433a(this.f29098h, this.f29099i, this.f29100j, arrayList);
        return new C7590f(this.f29091a, this.f29093c, new HashMap(this.f29094d), this.f29097g, this.f29101k, this.f29105o, this.f29103m, this.f29104n, this.f29106p, this.f29102l, this.f29107q, this.f29092b, this.f29098h, this.f29099i, this.f29100j, new ArrayList(this.f29095e), new ArrayList(this.f29096f), arrayList, this.f29108r, this.f29109s, new ArrayList(this.f29110t));
    }

    /* JADX INFO: renamed from: d */
    public C7591g m31436d(Type type, Object obj) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(obj);
        boolean z10 = obj instanceof InterfaceC7604t;
        if (!z10 && !(obj instanceof InterfaceC7595k) && !(obj instanceof InterfaceC7592h) && !(obj instanceof AbstractC7584a0)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
        }
        if (m31434c(type)) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
        }
        if (obj instanceof InterfaceC7592h) {
            this.f29094d.put(type, (InterfaceC7592h) obj);
        }
        if (z10 || (obj instanceof InterfaceC7595k)) {
            this.f29095e.add(TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken.get(type), obj));
        }
        if (obj instanceof AbstractC7584a0) {
            this.f29095e.add(TypeAdapters.newFactory(TypeToken.get(type), (AbstractC7584a0) obj));
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C7591g m31437e(InterfaceC7586b0 interfaceC7586b0) {
        Objects.requireNonNull(interfaceC7586b0);
        this.f29095e.add(interfaceC7586b0);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C7591g m31438f() {
        this.f29097g = true;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C7591g m31439g(EnumC7587c enumC7587c) {
        return m31440h(enumC7587c);
    }

    /* JADX INFO: renamed from: h */
    public C7591g m31440h(InterfaceC7588d interfaceC7588d) {
        Objects.requireNonNull(interfaceC7588d);
        this.f29093c = interfaceC7588d;
        return this;
    }
}
