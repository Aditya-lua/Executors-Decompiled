package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.C2571m0;
import p486v7.C12018b;
import p486v7.C12030e;
import p486v7.C12046i;
import p486v7.C12064o;
import p486v7.C12082u;
import p486v7.InterfaceC12022c;
import p486v7.InterfaceC12026d;
import p486v7.InterfaceC12034f;
import p486v7.InterfaceC12049j;
import p486v7.InterfaceC12055l;
import p486v7.InterfaceC12058m;

/* JADX INFO: renamed from: com.android.billingclient.api.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1745a {

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public volatile C12046i f6601a;

        /* JADX INFO: renamed from: b */
        public final Context f6602b;

        /* JADX INFO: renamed from: c */
        public volatile InterfaceC12058m f6603c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f6604d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f6605e;

        /* JADX INFO: renamed from: f */
        public volatile boolean f6606f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f6607g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f6608h;

        /* JADX INFO: renamed from: i */
        public volatile boolean f6609i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f6610j;

        /* JADX DEBUG: Marked for inline */
        /* JADX DEBUG: Method not inlined, still used in: [com.android.billingclient.api.a.f(android.content.Context):com.android.billingclient.api.a$a] */
        public /* synthetic */ a(Context context, C12082u c12082u) {
            this.f6602b = context;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public AbstractC1745a m8469a() {
            Context context = this.f6602b;
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f6603c == null) {
                if (this.f6609i) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing or Side by side Billing.");
                }
                if (this.f6604d || this.f6605e || this.f6606f || this.f6607g || this.f6608h) {
                    return m8472d() ? new C1751g(null, context, null, null, this) : new C1746b(null, context, null, null, this);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f6601a == null || !this.f6601a.m44861a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f6603c == null) {
                C12046i c12046i = this.f6601a;
                return m8472d() ? new C1751g(null, c12046i, context, null, null, null, this) : new C1746b(null, c12046i, context, null, null, null, this);
            }
            C12046i c12046i2 = this.f6601a;
            InterfaceC12058m interfaceC12058m = this.f6603c;
            return m8472d() ? new C1751g(null, c12046i2, context, interfaceC12058m, null, null, null, this) : new C1746b(null, c12046i2, context, interfaceC12058m, null, null, null, this);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public a m8470b(@NonNull C12046i c12046i) {
            this.f6601a = c12046i;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public a m8471c(@NonNull InterfaceC12058m interfaceC12058m) {
            this.f6603c = interfaceC12058m;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m8472d() {
            try {
                Context context = this.f6602b;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e10) {
                C2571m0.m11566n("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
                return false;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static a m8460f(@NonNull Context context) {
        return new a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo8461a(@NonNull C12018b c12018b, @NonNull InterfaceC12022c interfaceC12022c);

    /* JADX INFO: renamed from: b */
    public abstract void mo8462b(@NonNull C12030e c12030e, @NonNull InterfaceC12034f interfaceC12034f);

    @NonNull
    /* JADX INFO: renamed from: c */
    public abstract C1748d mo8463c(@NonNull String str);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo8464d();

    @NonNull
    /* JADX INFO: renamed from: e */
    public abstract C1748d mo8465e(@NonNull Activity activity, @NonNull C1747c c1747c);

    /* JADX INFO: renamed from: g */
    public abstract void mo8466g(@NonNull C1750f c1750f, @NonNull InterfaceC12049j interfaceC12049j);

    /* JADX INFO: renamed from: h */
    public abstract void mo8467h(@NonNull C12064o c12064o, @NonNull InterfaceC12055l interfaceC12055l);

    /* JADX INFO: renamed from: i */
    public abstract void mo8468i(@NonNull InterfaceC12026d interfaceC12026d);
}
