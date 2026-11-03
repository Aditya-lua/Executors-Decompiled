package com.roblox.protocols.webview;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class a implements ll.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f9822a = new Handler(Looper.getMainLooper());
    public f b;

    /* JADX INFO: renamed from: com.roblox.protocols.webview.a$a, reason: collision with other inner class name */
    public class RunnableC0156a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ll.a f9823a;

        public RunnableC0156a(ll.a aVar) {
            this.f9823a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.d(this.f9823a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ll.a f9824a;

        public b(ll.a aVar) {
            this.f9824a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.f(this.f9824a);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ll.a f9825a;

        public c(ll.a aVar) {
            this.f9825a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.d(this.f9825a);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ll.a f9826a;

        public d(ll.a aVar) {
            this.f9826a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b.d(this.f9826a);
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
        void d(ll.a aVar);

        void e();

        void f(ll.a aVar);
    }

    public a(f fVar) {
        this.b = fVar;
    }

    @Override // ll.b
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
        this.f9822a.post(new d(new ll.a(str, str5, boolValueOf, bool5, Boolean.valueOf(z10), Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false), Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false))));
    }

    @Override // ll.b
    public void b(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2) {
        this.f9822a.post(new b(new ll.a(str, str2, bool, null, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false))));
    }

    @Override // ll.b
    public void c() {
        this.f9822a.post(new e());
    }

    @Override // ll.b
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
        this.f9822a.post(new c(new ll.a(str, str5, boolValueOf, bool4, Boolean.valueOf(z10), Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false))));
    }

    @Override // ll.b
    public void e(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2) {
        if (str2 == null) {
            str2 = "";
        }
        String str5 = str2;
        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        Boolean bool3 = Boolean.FALSE;
        this.f9822a.post(new RunnableC0156a(new ll.a(str, str5, boolValueOf, bool3, bool3, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false))));
    }
}
