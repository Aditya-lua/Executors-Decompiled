package com.roblox.protocols.webview;

import android.os.Handler;
import android.os.Looper;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class a implements bm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f9761a = new Handler(Looper.getMainLooper());
    public d b;

    /* JADX INFO: renamed from: com.roblox.protocols.webview.a$a, reason: collision with other inner class name */
    public class RunnableC0159a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bm.a f9762a;

        public RunnableC0159a(bm.a aVar) {
            this.f9762a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.g(this.f9762a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bm.a f9763a;

        public b(bm.a aVar) {
            this.f9763a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.d(this.f9763a);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.e();
        }
    }

    public interface d {
        void d(bm.a aVar);

        void e();

        void g(bm.a aVar);
    }

    public a(d dVar) {
        this.b = dVar;
    }

    @Override // bm.b
    public void a(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2, Boolean bool3, Boolean bool4) {
        String str5 = str2;
        if (str5 == null) {
            str5 = BuildConfig.FLAVOR;
        }
        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        boolean z10 = true;
        Boolean bool5 = Boolean.FALSE;
        if (bool3 == null || bool3.booleanValue()) {
            z10 = false;
        }
        this.f9761a.post(new b(new bm.a(str, str5, boolValueOf, bool5, Boolean.valueOf(z10), Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false), Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false))));
    }

    @Override // bm.b
    public void b(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2) {
        this.f9761a.post(new RunnableC0159a(new bm.a(str, str2, bool, null, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false))));
    }

    @Override // bm.b
    public void c() {
        this.f9761a.post(new c());
    }
}
