package com.appsflyer.share.network.http;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ResponseNetwork<Body> {
    @NonNull
    Body getBody();

    List<String> getHeaderField(String str);

    int getStatusCode();

    boolean isSuccessful();
}
