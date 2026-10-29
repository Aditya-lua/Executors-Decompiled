package com.google.android.play.core.integrity;

import td.C11610p;
import td.C11613q;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2888a extends IntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a */
    public String f10765a;

    /* JADX INFO: renamed from: b */
    public Long f10766b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f10765a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        C11610p c11610p = null;
        return new C11613q(str, this.f10766b, c11610p, c11610p);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f10766b = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f10765a = str;
        return this;
    }
}
