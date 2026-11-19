package com.roblox.platform.http.interfaces;

import hl.b;
import hl.c;
import mv.i0;
import sw.d;
import vw.a;
import vw.o;

/* JADX INFO: loaded from: classes2.dex */
public interface AuthInterface {
    @o("/v1/username")
    d<i0> updateUsername(@a ml.a aVar);

    @o("/v2/verified-signup")
    d<Object> verifiedSignUp(@a b bVar);

    @o("/v2/verified-signup/challenge")
    d<Object> verifiedSignUpChallenge(@a hl.a aVar);

    @o("/v2/verified-signup/voucher")
    d<Object> verifiedSignUpVerify(@a c cVar);
}
