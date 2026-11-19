package com.roblox.platform.http.interfaces;

import mv.i0;
import sw.d;
import vw.f;
import vw.i;

/* JADX INFO: loaded from: classes2.dex */
public interface LocaleInterface {
    @f("v1/locales/user-localization-locus-supported-locales")
    d<i0> getMultipleLocales(@i("Accept-Language") String str);
}
