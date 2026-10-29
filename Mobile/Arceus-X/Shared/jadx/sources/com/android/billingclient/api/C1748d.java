package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.C2571m0;
import p486v7.C12051j1;

/* JADX INFO: renamed from: com.android.billingclient.api.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1748d {

    /* JADX INFO: renamed from: a */
    public int f6673a;

    /* JADX INFO: renamed from: b */
    public int f6674b;

    /* JADX INFO: renamed from: c */
    public String f6675c;

    /* JADX INFO: renamed from: com.android.billingclient.api.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f6676a;

        /* JADX INFO: renamed from: b */
        public int f6677b = 0;

        /* JADX INFO: renamed from: c */
        public String f6678c = "";

        public /* synthetic */ a(C12051j1 c12051j1) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C1748d m8611a() {
            C1748d c1748d = new C1748d();
            c1748d.f6673a = this.f6676a;
            c1748d.f6674b = this.f6677b;
            c1748d.f6675c = this.f6678c;
            return c1748d;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m8612b(@NonNull String str) {
            this.f6678c = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public a m8613c(int i10) {
            this.f6677b = i10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public a m8614d(int i10) {
            this.f6676a = i10;
            return this;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static a m8604d() {
        return new a(null);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m8608a() {
        return this.f6675c;
    }

    /* JADX INFO: renamed from: b */
    public int m8609b() {
        return this.f6674b;
    }

    /* JADX INFO: renamed from: c */
    public int m8610c() {
        return this.f6673a;
    }

    @NonNull
    public String toString() {
        return "Response Code: " + C2571m0.m11562j(this.f6673a) + ", Debug Message: " + this.f6675c;
    }
}
