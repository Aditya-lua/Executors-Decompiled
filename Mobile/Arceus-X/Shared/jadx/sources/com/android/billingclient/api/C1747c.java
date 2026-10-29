package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.AbstractC2582n0;
import com.google.android.gms.internal.play_billing.C2691x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p486v7.C12038g;
import p486v7.C12040g1;

/* JADX INFO: renamed from: com.android.billingclient.api.c */
/* JADX INFO: loaded from: classes.dex */
public class C1747c {

    /* JADX INFO: renamed from: a */
    public boolean f6650a;

    /* JADX INFO: renamed from: b */
    public String f6651b;

    /* JADX INFO: renamed from: c */
    public String f6652c;

    /* JADX INFO: renamed from: d */
    public c f6653d;

    /* JADX INFO: renamed from: e */
    public AbstractC2582n0 f6654e;

    /* JADX INFO: renamed from: f */
    public ArrayList f6655f;

    /* JADX INFO: renamed from: g */
    public boolean f6656g;

    /* JADX INFO: renamed from: com.android.billingclient.api.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f6657a;

        /* JADX INFO: renamed from: b */
        public String f6658b;

        /* JADX INFO: renamed from: c */
        public List f6659c;

        /* JADX INFO: renamed from: d */
        public boolean f6660d;

        /* JADX INFO: renamed from: e */
        public c.a f6661e;

        public /* synthetic */ a(C12040g1 c12040g1) {
            c.a aVarM8595a = c.m8595a();
            c.a.m8602b(aVarM8595a);
            this.f6661e = aVarM8595a;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C1747c m8581a() {
            List list = this.f6659c;
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            List list2 = this.f6659c;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((b) it.next()) == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
            }
            C1747c c1747c = new C1747c(null);
            c1747c.f6650a = !((b) this.f6659c.get(0)).m8587c().m8621g().isEmpty();
            c1747c.f6651b = this.f6657a;
            c1747c.f6652c = this.f6658b;
            c1747c.f6653d = this.f6661e.m8603a();
            c1747c.f6655f = new ArrayList();
            c1747c.f6656g = this.f6660d;
            List list3 = this.f6659c;
            c1747c.f6654e = list3 != null ? AbstractC2582n0.m11598i(list3) : AbstractC2582n0.m11599k();
            c1747c.getClass();
            return c1747c;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m8582b(@NonNull String str) {
            this.f6657a = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public a m8583c(@NonNull String str) {
            this.f6658b = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public a m8584d(@NonNull List<b> list) {
            this.f6659c = new ArrayList(list);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final C1749e f6662a;

        /* JADX INFO: renamed from: b */
        public final String f6663b;

        /* JADX INFO: renamed from: com.android.billingclient.api.c$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public C1749e f6664a;

            /* JADX INFO: renamed from: b */
            public String f6665b;

            public /* synthetic */ a(C12040g1 c12040g1) {
            }

            /* JADX INFO: renamed from: d */
            public static /* bridge */ /* synthetic */ C14104b m8589d(a aVar) {
                aVar.getClass();
                return null;
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public b m8592a() {
                C2691x.m11817c(this.f6664a, "ProductDetails is required for constructing ProductDetailsParams.");
                return new b(this, null);
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public a m8593b(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f6665b = str;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: c */
            public a m8594c(@NonNull C1749e c1749e) {
                this.f6664a = c1749e;
                if (c1749e.m8616b() != null) {
                    c1749e.m8616b().getClass();
                    C1749e.b bVarM8616b = c1749e.m8616b();
                    if (bVarM8616b.m8625b() != null) {
                        this.f6665b = bVarM8616b.m8625b();
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.c$b$b, reason: collision with other inner class name */
        public static class C14104b {
        }

        public /* synthetic */ b(a aVar, C12040g1 c12040g1) {
            this.f6662a = aVar.f6664a;
            this.f6663b = aVar.f6665b;
            a.m8589d(aVar);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public static a m8585b() {
            return new a(null);
        }

        /* JADX INFO: renamed from: a */
        public C14104b m8586a() {
            return null;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public final C1749e m8587c() {
            return this.f6662a;
        }

        /* JADX INFO: renamed from: d */
        public final String m8588d() {
            return this.f6663b;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.c$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public String f6666a;

        /* JADX INFO: renamed from: b */
        public String f6667b;

        /* JADX INFO: renamed from: c */
        public int f6668c = 0;

        /* JADX INFO: renamed from: com.android.billingclient.api.c$c$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public String f6669a;

            /* JADX INFO: renamed from: b */
            public String f6670b;

            /* JADX INFO: renamed from: c */
            public boolean f6671c;

            /* JADX INFO: renamed from: d */
            public int f6672d = 0;

            public /* synthetic */ a(C12040g1 c12040g1) {
            }

            /* JADX INFO: renamed from: b */
            public static /* synthetic */ a m8602b(a aVar) {
                aVar.f6671c = true;
                return aVar;
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public c m8603a() {
                boolean z10 = true;
                C12040g1 c12040g1 = null;
                if (TextUtils.isEmpty(this.f6669a) && TextUtils.isEmpty(null)) {
                    z10 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f6670b);
                if (z10 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f6671c && !z10 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c(c12040g1);
                cVar.f6666a = this.f6669a;
                cVar.f6668c = this.f6672d;
                cVar.f6667b = this.f6670b;
                return cVar;
            }
        }

        public /* synthetic */ c(C12040g1 c12040g1) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public static a m8595a() {
            return new a(null);
        }

        /* JADX INFO: renamed from: b */
        public final int m8599b() {
            return this.f6668c;
        }

        /* JADX INFO: renamed from: c */
        public final String m8600c() {
            return this.f6666a;
        }

        /* JADX INFO: renamed from: d */
        public final String m8601d() {
            return this.f6667b;
        }
    }

    public /* synthetic */ C1747c(C12040g1 c12040g1) {
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static a m8558b() {
        return new a(null);
    }

    /* JADX INFO: renamed from: a */
    public C12038g m8567a() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public int m8568c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m8569d() {
        return this.f6653d.m8599b();
    }

    /* JADX INFO: renamed from: e */
    public long m8570e() {
        return 0L;
    }

    /* JADX INFO: renamed from: f */
    public final C1748d m8571f() {
        C1749e.b next;
        if (this.f6654e.isEmpty()) {
            return C1752h.f6763i;
        }
        b bVar = (b) this.f6654e.get(0);
        for (int i10 = 1; i10 < this.f6654e.size(); i10++) {
            b bVar2 = (b) this.f6654e.get(i10);
            if (!bVar2.m8587c().m8619e().equals(bVar.m8587c().m8619e()) && !bVar2.m8587c().m8619e().equals("play_pass_subs")) {
                return C1752h.m8675a(5, "All products should have same ProductType.");
            }
        }
        String strM8621g = bVar.m8587c().m8621g();
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        AbstractC2582n0 abstractC2582n0 = this.f6654e;
        int size = abstractC2582n0.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar3 = (b) abstractC2582n0.get(i11);
            bVar3.m8586a();
            if (bVar3.m8587c().m8620f() != null && bVar3.m8588d() == null) {
                return C1752h.m8675a(5, String.format("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s", bVar3.m8587c().m8618d()));
            }
            if (map.containsKey(bVar3.m8587c().m8618d())) {
                return C1752h.m8675a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", bVar3.m8587c().m8618d()));
            }
            map.put(bVar3.m8587c().m8618d(), bVar3);
            if (!bVar.m8587c().m8619e().equals("play_pass_subs") && !bVar3.m8587c().m8619e().equals("play_pass_subs") && !strM8621g.equals(bVar3.m8587c().m8621g())) {
                return C1752h.m8675a(5, "All products must have the same package name.");
            }
        }
        for (String str : hashSet) {
            if (map.containsKey(str)) {
                ((b) map.get(str)).m8586a();
                return C1752h.m8675a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        List<C1749e.b> listM8617c = bVar.m8587c().m8617c();
        String strM8588d = bVar.m8588d();
        if (strM8588d != null && listM8617c != null) {
            Iterator<C1749e.b> it = listM8617c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!strM8588d.equals(next.m8625b()));
            if (next != null && next.m8628e() != null) {
                return C1752h.m8675a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return C1752h.f6763i;
    }

    /* JADX INFO: renamed from: g */
    public final String m8572g() {
        return this.f6651b;
    }

    /* JADX INFO: renamed from: h */
    public final String m8573h() {
        return this.f6652c;
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public String m8574i() {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public final String m8575j() {
        return this.f6653d.m8600c();
    }

    /* JADX INFO: renamed from: k */
    public final String m8576k() {
        return this.f6653d.m8601d();
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public final ArrayList m8577l() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f6655f);
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public final List m8578m() {
        return this.f6654e;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m8579v() {
        return this.f6656g;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m8580w() {
        if (this.f6651b != null || this.f6652c != null || this.f6653d.m8601d() != null || this.f6653d.m8599b() != 0 || this.f6650a || this.f6656g) {
            return true;
        }
        AbstractC2582n0 abstractC2582n0 = this.f6654e;
        if (abstractC2582n0 != null) {
            int size = abstractC2582n0.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) abstractC2582n0.get(i10)).m8586a();
            }
        }
        return false;
    }
}
