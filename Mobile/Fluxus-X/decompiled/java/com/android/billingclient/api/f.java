package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.n0;
import java.util.HashSet;
import java.util.List;
import w7.y1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f5675a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n0 f5676a;

        public /* synthetic */ a(y1 y1Var) {
        }

        @NonNull
        public f a() {
            if (this.f5676a != null) {
                return new f(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        @NonNull
        public a b(@NonNull List<b> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (b bVar : list) {
                if (!"play_pass_subs".equals(bVar.d())) {
                    hashSet.add(bVar.d());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f5676a = n0.i(list);
            return this;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5677a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5678c;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f5679a;
            public String b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f5680c;

            public /* synthetic */ a(y1 y1Var) {
            }

            @NonNull
            public b a() {
                String str = this.f5680c;
                if ("first_party".equals(str)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.b == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (str != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            @NonNull
            public a b(@NonNull String str) {
                this.b = str;
                return this;
            }

            @NonNull
            public a c(@NonNull String str) {
                this.f5680c = str;
                return this;
            }
        }

        public /* synthetic */ b(a aVar, y1 y1Var) {
            this.b = aVar.b;
            this.f5678c = aVar.f5680c;
            this.f5677a = aVar.f5679a;
        }

        @NonNull
        public static a b() {
            return new a(null);
        }

        public String a() {
            return this.f5677a;
        }

        @NonNull
        public final String c() {
            return this.b;
        }

        @NonNull
        public final String d() {
            return this.f5678c;
        }
    }

    public /* synthetic */ f(a aVar, y1 y1Var) {
        this.f5675a = aVar.f5676a;
    }

    @NonNull
    public static a a() {
        return new a(null);
    }

    public final n0 b() {
        return this.f5675a;
    }

    @NonNull
    public final String c() {
        return ((b) this.f5675a.get(0)).d();
    }
}
