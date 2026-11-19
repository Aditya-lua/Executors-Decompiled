package com.roblox.platform.http.interfaces;

import pl.b;
import sw.d;
import vw.a;
import vw.o;
import vw.t;

/* JADX INFO: loaded from: classes2.dex */
public interface TencentInterface {
    @o("v1/qq/token-authentication")
    d<Object> authenticateQQToken(@a pl.a aVar, @t("apiKey") String str);

    @o("v1/qq/token-authentication")
    d<Object> authenticateQQTokenWithChannelId(@a b bVar, @t("apiKey") String str);

    @o("v1/wechat/token-authentication")
    d<Object> authenticateToken(@a nl.a aVar, @t("apiKey") String str);

    @o("v1/wechat/token-authentication")
    d<Object> authenticateTokenWithChannelId(@a nl.b bVar, @t("apiKey") String str);
}
