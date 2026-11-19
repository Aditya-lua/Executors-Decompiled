package com.roblox.platform.http.interfaces;

import mv.i0;
import sw.d;
import vw.f;
import vw.s;

/* JADX INFO: loaded from: classes2.dex */
public interface TranslationsInterface {
    @f("v1/translations/{locale}?consumerType=AndroidApp")
    d<i0> getUpdatedStrings(@s("locale") String str);
}
