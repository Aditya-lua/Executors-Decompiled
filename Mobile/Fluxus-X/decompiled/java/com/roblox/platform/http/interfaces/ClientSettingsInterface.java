package com.roblox.platform.http.interfaces;

import mv.i0;
import sw.d;
import vw.f;
import vw.t;

/* JADX INFO: loaded from: classes2.dex */
public interface ClientSettingsInterface {
    @f("/Setting/Get/AndroidAppSettings/")
    d<i0> getAndroidAppSettings(@t("apiKey") String str);
}
