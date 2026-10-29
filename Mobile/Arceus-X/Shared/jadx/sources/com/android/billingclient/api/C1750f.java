package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.AbstractC2582n0;
import java.util.HashSet;
import java.util.List;
import p486v7.C12096y1;

/* JADX INFO: renamed from: com.android.billingclient.api.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1750f {

    /* JADX INFO: renamed from: a */
    public final AbstractC2582n0 f6733a;

    /* JADX INFO: renamed from: com.android.billingclient.api.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public AbstractC2582n0 f6734a;

        public /* synthetic */ a(C12096y1 c12096y1) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C1750f m8641a() {
            if (this.f6734a != null) {
                return new C1750f(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m8642b(@NonNull List<b> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (b bVar : list) {
                if (!"play_pass_subs".equals(bVar.m8646d())) {
                    hashSet.add(bVar.m8646d());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f6734a = AbstractC2582n0.m11598i(list);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.f$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final String f6735a;

        /* JADX INFO: renamed from: b */
        public final String f6736b;

        /* JADX INFO: renamed from: c */
        public final String f6737c;

        /* JADX INFO: renamed from: com.android.billingclient.api.f$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public String f6738a;

            /* JADX INFO: renamed from: b */
            public String f6739b;

            /* JADX INFO: renamed from: c */
            public String f6740c;

            public /* synthetic */ a(C12096y1 c12096y1) {
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public b m8650a() {
                String str = this.f6740c;
                if ("first_party".equals(str)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f6739b == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (str != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public a m8651b(@NonNull String str) {
                this.f6739b = str;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: c */
            public a m8652c(@NonNull String str) {
                this.f6740c = str;
                return this;
            }
        }

        public /* synthetic */ b(a aVar, C12096y1 c12096y1) {
            this.f6736b = aVar.f6739b;
            this.f6737c = aVar.f6740c;
            this.f6735a = aVar.f6738a;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public static a m8643b() {
            return new a(null);
        }

        /* JADX INFO: renamed from: a */
        public String m8644a() {
            return this.f6735a;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public final String m8645c() {
            return this.f6736b;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public final String m8646d() {
            return this.f6737c;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.android.billingclient.api.f.a.a():com.android.billingclient.api.f] */
    public /* synthetic */ C1750f(a aVar, C12096y1 c12096y1) {
        this.f6733a = aVar.f6734a;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static a m8637a() {
        return new a(null);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC2582n0 m8638b() {
        return this.f6733a;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final String m8639c() {
        return ((b) this.f6733a.get(0)).m8646d();
    }
}
