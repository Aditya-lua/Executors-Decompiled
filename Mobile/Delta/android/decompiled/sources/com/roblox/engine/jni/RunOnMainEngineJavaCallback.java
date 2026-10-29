package com.roblox.engine.jni;

import android.os.Handler;
import com.roblox.engine.jni.model.NativeTextBoxInfo;

/* JADX INFO: loaded from: classes2.dex */
public class RunOnMainEngineJavaCallback extends EngineJavaCallbackWrapper {
    public Handler b;

    public RunOnMainEngineJavaCallback(Handler handler, EngineJavaCallback2 engineJavaCallback2) {
        super(engineJavaCallback2);
        this.b = handler;
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void a(final int i10) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.8
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.a(i10);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void b(final long j10) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.13
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.b(j10);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void c(final int i10) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.17
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.c(i10);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void d() {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.2
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.d();
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void e(final String str) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.9
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.e(str);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void f(final String str, final String str2) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.12
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.f(str, str2);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void g(final String str) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.14
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.g(str);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void h() {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.15
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.h();
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void i(final String str, final String str2) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.11
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.i(str, str2);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void j(final long j10, final String str) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.4
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.j(j10, str);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void k(final long j10, final String str, final String str2) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.3
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.k(j10, str, str2);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void l(final long j10, final String str, final String str2) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.7
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.l(j10, str, str2);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void m(final long j10, final String str, final String str2) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.6
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.m(j10, str, str2);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void n(final long j10, final String str, final String str2, final String str3) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.5
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.n(j10, str, str2, str3);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void o(final String str) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.16
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.o(str);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void p(final int i10) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.10
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.p(i10);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    public void q(final long j10, final boolean z10, final byte[] bArr, final NativeTextBoxInfo nativeTextBoxInfo) {
        this.b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.1
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.q(j10, z10, bArr, nativeTextBoxInfo);
            }
        });
    }
}
