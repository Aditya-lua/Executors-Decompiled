package com.google.android.play.core.integrity;

import vd.p;
import vd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends IntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8294a;
    public Long b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f8294a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        p pVar = null;
        return new q(str, this.b, pVar, pVar);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.b = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f8294a = str;
        return this;
    }
}
