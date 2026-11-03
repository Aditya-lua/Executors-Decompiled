package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.m0;
import v7.j1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5185a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5186c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5187a;
        public int b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f5188c = "";

        public /* synthetic */ a(j1 j1Var) {
        }

        @NonNull
        public d a() {
            d dVar = new d();
            dVar.f5185a = this.f5187a;
            dVar.b = this.b;
            dVar.f5186c = this.f5188c;
            return dVar;
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f5188c = str;
            return this;
        }

        @NonNull
        public a c(int i10) {
            this.b = i10;
            return this;
        }

        @NonNull
        public a d(int i10) {
            this.f5187a = i10;
            return this;
        }
    }

    @NonNull
    public static a d() {
        return new a(null);
    }

    @NonNull
    public String a() {
        return this.f5186c;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.f5185a;
    }

    @NonNull
    public String toString() {
        return "Response Code: " + m0.j(this.f5185a) + ", Debug Message: " + this.f5186c;
    }
}
