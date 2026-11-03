package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.n0;
import com.google.android.gms.internal.play_billing.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import v7.g1;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5168a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0114c f5170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n0 f5171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f5172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5173g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5174a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f5175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f5176d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C0114c.a f5177e;

        public /* synthetic */ a(g1 g1Var) {
            C0114c.a aVarA = C0114c.a();
            C0114c.a.b(aVarA);
            this.f5177e = aVarA;
        }

        @NonNull
        public c a() {
            List list = this.f5175c;
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            List list2 = this.f5175c;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((b) it.next()) == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
            }
            c cVar = new c(null);
            cVar.f5168a = !((b) this.f5175c.get(0)).c().g().isEmpty();
            cVar.b = this.f5174a;
            cVar.f5169c = this.b;
            cVar.f5170d = this.f5177e.a();
            cVar.f5172f = new ArrayList();
            cVar.f5173g = this.f5176d;
            List list3 = this.f5175c;
            cVar.f5171e = list3 != null ? n0.i(list3) : n0.k();
            cVar.getClass();
            return cVar;
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f5174a = str;
            return this;
        }

        @NonNull
        public a c(@NonNull String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public a d(@NonNull List<b> list) {
            this.f5175c = new ArrayList(list);
            return this;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f5178a;
        public final String b;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public e f5179a;
            public String b;

            public /* synthetic */ a(g1 g1Var) {
            }

            public static /* bridge */ /* synthetic */ C0113b d(a aVar) {
                aVar.getClass();
                return null;
            }

            @NonNull
            public b a() {
                x.c(this.f5179a, "ProductDetails is required for constructing ProductDetailsParams.");
                return new b(this, null);
            }

            @NonNull
            public a b(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.b = str;
                return this;
            }

            @NonNull
            public a c(@NonNull e eVar) {
                this.f5179a = eVar;
                if (eVar.b() != null) {
                    eVar.b().getClass();
                    e.b bVarB = eVar.b();
                    if (bVarB.b() != null) {
                        this.b = bVarB.b();
                    }
                }
                return this;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.c$b$b, reason: collision with other inner class name */
        public static class C0113b {
        }

        public /* synthetic */ b(a aVar, g1 g1Var) {
            this.f5178a = aVar.f5179a;
            this.b = aVar.b;
            a.d(aVar);
        }

        @NonNull
        public static a b() {
            return new a(null);
        }

        public C0113b a() {
            return null;
        }

        @NonNull
        public final e c() {
            return this.f5178a;
        }

        public final String d() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.c$c, reason: collision with other inner class name */
    public static class C0114c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5180a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5181c = 0;

        /* JADX INFO: renamed from: com.android.billingclient.api.c$c$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f5182a;
            public String b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f5183c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f5184d = 0;

            public /* synthetic */ a(g1 g1Var) {
            }

            public static /* synthetic */ a b(a aVar) {
                aVar.f5183c = true;
                return aVar;
            }

            @NonNull
            public C0114c a() {
                boolean z10 = true;
                g1 g1Var = null;
                if (TextUtils.isEmpty(this.f5182a) && TextUtils.isEmpty(null)) {
                    z10 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.b);
                if (z10 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f5183c && !z10 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                C0114c c0114c = new C0114c(g1Var);
                c0114c.f5180a = this.f5182a;
                c0114c.f5181c = this.f5184d;
                c0114c.b = this.b;
                return c0114c;
            }
        }

        public /* synthetic */ C0114c(g1 g1Var) {
        }

        @NonNull
        public static a a() {
            return new a(null);
        }

        public final int b() {
            return this.f5181c;
        }

        public final String c() {
            return this.f5180a;
        }

        public final String d() {
            return this.b;
        }
    }

    public /* synthetic */ c(g1 g1Var) {
    }

    @NonNull
    public static a b() {
        return new a(null);
    }

    public v7.g a() {
        return null;
    }

    public int c() {
        return 0;
    }

    public final int d() {
        return this.f5170d.b();
    }

    public long e() {
        return 0L;
    }

    public final d f() {
        e.b next;
        if (this.f5171e.isEmpty()) {
            return h.f5245i;
        }
        b bVar = (b) this.f5171e.get(0);
        for (int i10 = 1; i10 < this.f5171e.size(); i10++) {
            b bVar2 = (b) this.f5171e.get(i10);
            if (!bVar2.c().e().equals(bVar.c().e()) && !bVar2.c().e().equals("play_pass_subs")) {
                return h.a(5, "All products should have same ProductType.");
            }
        }
        String strG = bVar.c().g();
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        n0 n0Var = this.f5171e;
        int size = n0Var.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar3 = (b) n0Var.get(i11);
            bVar3.a();
            if (bVar3.c().f() != null && bVar3.d() == null) {
                return h.a(5, String.format("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s", bVar3.c().d()));
            }
            if (map.containsKey(bVar3.c().d())) {
                return h.a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", bVar3.c().d()));
            }
            map.put(bVar3.c().d(), bVar3);
            if (!bVar.c().e().equals("play_pass_subs") && !bVar3.c().e().equals("play_pass_subs") && !strG.equals(bVar3.c().g())) {
                return h.a(5, "All products must have the same package name.");
            }
        }
        for (String str : hashSet) {
            if (map.containsKey(str)) {
                ((b) map.get(str)).a();
                return h.a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        List<e.b> listC = bVar.c().c();
        String strD = bVar.d();
        if (strD != null && listC != null) {
            Iterator<e.b> it = listC.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!strD.equals(next.b()));
            if (next != null && next.e() != null) {
                return h.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return h.f5245i;
    }

    public final String g() {
        return this.b;
    }

    public final String h() {
        return this.f5169c;
    }

    @Deprecated
    public String i() {
        return null;
    }

    @Deprecated
    public final String j() {
        return this.f5170d.c();
    }

    public final String k() {
        return this.f5170d.d();
    }

    @NonNull
    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f5172f);
        return arrayList;
    }

    @NonNull
    public final List m() {
        return this.f5171e;
    }

    public final boolean v() {
        return this.f5173g;
    }

    public final boolean w() {
        if (this.b != null || this.f5169c != null || this.f5170d.d() != null || this.f5170d.b() != 0 || this.f5168a || this.f5173g) {
            return true;
        }
        n0 n0Var = this.f5171e;
        if (n0Var != null) {
            int size = n0Var.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) n0Var.get(i10)).a();
            }
        }
        return false;
    }
}
