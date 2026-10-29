package com.roblox.engine.jni;

import android.os.Handler;
import com.roblox.engine.jni.model.NativeTextBoxInfo;

/* JADX INFO: loaded from: classes2.dex */
public class RunOnMainEngineJavaCallback extends EngineJavaCallbackWrapper {

    /* JADX INFO: renamed from: b */
    public Handler f12540b;

    public RunOnMainEngineJavaCallback(Handler handler, EngineJavaCallback2 engineJavaCallback2) {
        super(engineJavaCallback2);
        this.f12540b = handler;
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: a */
    public void mo15217a(final int i10) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.8
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15217a(i10);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: b */
    public void mo15218b(final long j10) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.13
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15218b(j10);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: c */
    public void mo15782c(final int i10) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.17
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15782c(i10);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: d */
    public void mo15783d() {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.2
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15783d();
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: e */
    public void mo15219e(final String str) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.9
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15219e(str);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: f */
    public void mo15220f(final String str, final String str2) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.12
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15220f(str, str2);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: g */
    public void mo15784g(final String str) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.14
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15784g(str);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: h */
    public void mo15785h() {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.15
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15785h();
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: i */
    public void mo15786i(final String str, final String str2) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.11
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15786i(str, str2);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: j */
    public void mo15221j(final long j10, final String str) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.4
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15221j(j10, str);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: k */
    public void mo15222k(final long j10, final String str, final String str2) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.3
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15222k(j10, str, str2);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: l */
    public void mo15223l(final long j10, final String str, final String str2) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.7
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15223l(j10, str, str2);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: m */
    public void mo15224m(final long j10, final String str, final String str2) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.6
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15224m(j10, str, str2);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: n */
    public void mo15225n(final long j10, final String str, final String str2, final String str3) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.5
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15225n(j10, str, str2, str3);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: o */
    public void mo15787o(final String str) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.16
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15787o(str);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: p */
    public void mo15226p(final int i10) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.10
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15226p(i10);
            }
        });
    }

    @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
    /* JADX INFO: renamed from: q */
    public void mo15788q(final long j10, final boolean z10, final byte[] bArr, final NativeTextBoxInfo nativeTextBoxInfo) {
        this.f12540b.post(new Runnable() { // from class: com.roblox.engine.jni.RunOnMainEngineJavaCallback.1
            @Override // java.lang.Runnable
            public void run() {
                RunOnMainEngineJavaCallback.super.mo15788q(j10, z10, bArr, nativeTextBoxInfo);
            }
        });
    }
}
