package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.m0;
import v7.l;
import v7.m;
import v7.o;
import v7.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    public static final class C0112a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile v7.i f5134a;
        public final Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile m f5135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f5136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f5137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f5138f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f5139g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f5140h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f5141i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f5142j;

        public /* synthetic */ C0112a(Context context, u uVar) {
            this.b = context;
        }

        @NonNull
        public a a() {
            Context context = this.b;
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f5135c == null) {
                if (this.f5141i) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing or Side by side Billing.");
                }
                if (this.f5136d || this.f5137e || this.f5138f || this.f5139g || this.f5140h) {
                    return d() ? new g(null, context, null, null, this) : new b(null, context, null, null, this);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f5134a == null || !this.f5134a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f5135c == null) {
                v7.i iVar = this.f5134a;
                return d() ? new g(null, iVar, context, null, null, null, this) : new b(null, iVar, context, null, null, null, this);
            }
            v7.i iVar2 = this.f5134a;
            m mVar = this.f5135c;
            return d() ? new g(null, iVar2, context, mVar, null, null, null, this) : new b(null, iVar2, context, mVar, null, null, null, this);
        }

        @NonNull
        public C0112a b(@NonNull v7.i iVar) {
            this.f5134a = iVar;
            return this;
        }

        @NonNull
        public C0112a c(@NonNull m mVar) {
            this.f5135c = mVar;
            return this;
        }

        public final boolean d() {
            try {
                Context context = this.b;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e10) {
                m0.n("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
                return false;
            }
        }
    }

    @NonNull
    public static C0112a f(@NonNull Context context) {
        return new C0112a(context, null);
    }

    public abstract void a(@NonNull v7.b bVar, @NonNull v7.c cVar);

    public abstract void b(@NonNull v7.e eVar, @NonNull v7.f fVar);

    @NonNull
    public abstract d c(@NonNull String str);

    public abstract boolean d();

    @NonNull
    public abstract d e(@NonNull Activity activity, @NonNull c cVar);

    public abstract void g(@NonNull f fVar, @NonNull v7.j jVar);

    public abstract void h(@NonNull o oVar, @NonNull l lVar);

    public abstract void i(@NonNull v7.d dVar);
}
