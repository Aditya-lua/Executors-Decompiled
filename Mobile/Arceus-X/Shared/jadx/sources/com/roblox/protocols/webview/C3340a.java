package com.roblox.protocols.webview;

import android.os.Handler;
import android.os.Looper;
import nl.C9492a;
import nl.InterfaceC9493b;

/* JADX INFO: renamed from: com.roblox.protocols.webview.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3340a implements InterfaceC9493b {

    /* JADX INFO: renamed from: a */
    public Handler f12690a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public f f12691b;

    /* JADX INFO: renamed from: com.roblox.protocols.webview.a$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C9492a f12692a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(C9492a c9492a) {
            this.f12692a = c9492a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3340a.this.f12691b.mo1224g(this.f12692a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.protocols.webview.a$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C9492a f12694a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(C9492a c9492a) {
            this.f12694a = c9492a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3340a.this.f12691b.mo1222d(this.f12694a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.protocols.webview.a$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C9492a f12696a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(C9492a c9492a) {
            this.f12696a = c9492a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3340a.this.f12691b.mo1224g(this.f12696a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.protocols.webview.a$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C9492a f12698a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public d(C9492a c9492a) {
            this.f12698a = c9492a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3340a.this.f12691b.mo1224g(this.f12698a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.protocols.webview.a$e */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3340a.this.f12691b.mo1223e();
        }
    }

    /* JADX INFO: renamed from: com.roblox.protocols.webview.a$f */
    public interface f {
        /* JADX INFO: renamed from: d */
        void mo1222d(C9492a c9492a);

        /* JADX INFO: renamed from: e */
        void mo1223e();

        /* JADX INFO: renamed from: g */
        void mo1224g(C9492a c9492a);
    }

    public C3340a(f fVar) {
        this.f12691b = fVar;
    }

    @Override // nl.InterfaceC9493b
    /* JADX INFO: renamed from: a */
    public void mo15917a(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2, Boolean bool3, Boolean bool4) {
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
        this.f12690a.post(new d(new C9492a(str, str5, boolValueOf, bool5, Boolean.valueOf(z10), Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false), Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false))));
    }

    @Override // nl.InterfaceC9493b
    /* JADX INFO: renamed from: b */
    public void mo15918b(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2) {
        this.f12690a.post(new b(new C9492a(str, str2, bool, null, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false))));
    }

    @Override // nl.InterfaceC9493b
    /* JADX INFO: renamed from: c */
    public void mo15919c() {
        this.f12690a.post(new e());
    }

    @Override // nl.InterfaceC9493b
    /* JADX INFO: renamed from: d */
    public void mo15920d(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2, Boolean bool3) {
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
        this.f12690a.post(new c(new C9492a(str, str5, boolValueOf, bool4, Boolean.valueOf(z10), Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false))));
    }

    @Override // nl.InterfaceC9493b
    /* JADX INFO: renamed from: e */
    public void mo15921e(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2) {
        if (str2 == null) {
            str2 = "";
        }
        String str5 = str2;
        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        Boolean bool3 = Boolean.FALSE;
        this.f12690a.post(new a(new C9492a(str, str5, boolValueOf, bool3, bool3, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false))));
    }
}
