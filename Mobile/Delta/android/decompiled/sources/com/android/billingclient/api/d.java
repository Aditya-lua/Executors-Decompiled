package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.m0;
import v7.j1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5112a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5113c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5114a;
        public int b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f5115c = "";

        public /* synthetic */ a(j1 j1Var) {
        }

        @NonNull
        public d a() {
            d dVar = new d();
            dVar.f5112a = this.f5114a;
            dVar.b = this.b;
            dVar.f5113c = this.f5115c;
            return dVar;
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f5115c = str;
            return this;
        }

        @NonNull
        public a c(int i10) {
            this.b = i10;
            return this;
        }

        @NonNull
        public a d(int i10) {
            this.f5114a = i10;
            return this;
        }
    }

    @NonNull
    public static a d() {
        return new a(null);
    }

    @NonNull
    public String a() {
        return this.f5113c;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.f5112a;
    }

    @NonNull
    public String toString() {
        return "Response Code: " + m0.j(this.f5112a) + ", Debug Message: " + this.f5113c;
    }
}
