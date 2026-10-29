package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j implements DynamiteModule.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5883a;

    public j(int i10, int i11) {
        this.f5883a = i10;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int a(Context context, String str, boolean z10) {
        return 0;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int b(Context context, String str) {
        return this.f5883a;
    }
}
