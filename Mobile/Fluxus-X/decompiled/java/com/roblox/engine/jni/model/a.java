package com.roblox.engine.jni.model;

/* JADX INFO: loaded from: classes2.dex */
public class a extends PlatformParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9663a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9665d;

    public a(PlatformParams platformParams) {
        copy(platformParams);
    }

    public final void a(a aVar) {
        this.f9663a = aVar.f9663a;
        this.b = aVar.b;
        this.f9664c = aVar.f9664c;
        this.f9665d = aVar.f9665d;
    }

    @Override // com.roblox.engine.jni.model.PlatformParams
    public void copy(PlatformParams platformParams) {
        super.copy(platformParams);
        if (platformParams instanceof a) {
            a((a) platformParams);
        }
    }
}
