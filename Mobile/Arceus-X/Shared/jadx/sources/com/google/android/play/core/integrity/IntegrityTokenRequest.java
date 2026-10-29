package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IntegrityTokenRequest {

    public static abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j10);

        public abstract Builder setNonce(String str);
    }

    public static Builder builder() {
        return new C2888a();
    }

    /* JADX INFO: renamed from: a */
    public abstract Long mo13347a();

    /* JADX INFO: renamed from: b */
    public abstract String mo13348b();
}
