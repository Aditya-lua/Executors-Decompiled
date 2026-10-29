package com.roblox.protocols.webview;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class a implements nl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f9741a = new Handler(Looper.getMainLooper());
    public f b;

    /* JADX INFO: renamed from: com.roblox.protocols.webview.a$a, reason: collision with other inner class name */
    public class RunnableC0153a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nl.a f9742a;

        public RunnableC0153a(nl.a aVar) {
            this.f9742a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.g(this.f9742a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nl.a f9743a;

        public b(nl.a aVar) {
            this.f9743a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.d(this.f9743a);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nl.a f9744a;

        public c(nl.a aVar) {
            this.f9744a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.g(this.f9744a);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nl.a f9745a;

        public d(nl.a aVar) {
            this.f9745a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.g(this.f9745a);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.e();
        }
    }

    public interface f {
        void d(nl.a aVar);

        void e();

        void g(nl.a aVar);
    }

    public a(f fVar) {
        this.b = fVar;
    }

    @Override // nl.b
    public void a(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2, Boolean bool3, Boolean bool4) {
        String str5 = str2;
        if (str5 == null) {
            str5 = "";
        }
        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        boolean z10 = true;
        Boolean bool5 = Boolean.FALSE;
        if (bool3 == null || bool3.booleanValue()) {
            z10 = false;
        }
        this.f9741a.post(new d(new nl.a(str, str5, boolValueOf, bool5, Boolean.valueOf(z10), Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false), Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false))));
    }

    @Override // nl.b
    public void b(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2) {
        this.f9741a.post(new b(new nl.a(str, str2, bool, null, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false))));
    }

    @Override // nl.b
    public void c() {
        this.f9741a.post(new e());
    }

    @Override // nl.b
    public void d(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2, Boolean bool3) {
        String str5 = str2;
        if (str5 == null) {
            str5 = "";
        }
        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        boolean z10 = true;
        Boolean bool4 = Boolean.FALSE;
        if (bool3 == null || bool3.booleanValue()) {
            z10 = false;
        }
        this.f9741a.post(new c(new nl.a(str, str5, boolValueOf, bool4, Boolean.valueOf(z10), Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false))));
    }

    @Override // nl.b
    public void e(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2) {
        if (str2 == null) {
            str2 = "";
        }
        String str5 = str2;
        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        Boolean bool3 = Boolean.FALSE;
        this.f9741a.post(new RunnableC0153a(new nl.a(str, str5, boolValueOf, bool3, bool3, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false))));
    }
}
