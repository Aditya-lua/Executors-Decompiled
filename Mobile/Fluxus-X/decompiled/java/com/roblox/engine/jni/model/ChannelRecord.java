package com.roblox.engine.jni.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class ChannelRecord {
    private long expiration;
    private String name;

    public ChannelRecord(String str, long j10) {
        this.name = str;
        this.expiration = j10;
    }

    public long getExpiration() {
        return this.expiration;
    }

    public String getName() {
        return this.name;
    }

    public boolean isEmpty() {
        return 0 < this.expiration && this.name.isEmpty();
    }

    public boolean isExpired(long j10) {
        return this.expiration < j10;
    }

    public boolean isReset() {
        return 0 == this.expiration;
    }

    public boolean isValid() {
        return 0 <= this.expiration;
    }

    public void setExpiration(long j10) {
        this.expiration = j10;
    }

    public void setName(String str) {
        this.name = str;
    }
}
