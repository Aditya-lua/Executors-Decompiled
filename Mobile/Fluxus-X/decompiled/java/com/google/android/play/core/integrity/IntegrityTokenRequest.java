package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IntegrityTokenRequest {

    public static abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j10);

        public abstract Builder setNonce(String str);
    }

    public static Builder builder() {
        return new a();
    }

    public abstract Long a();

    public abstract String b();
}
