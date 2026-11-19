package com.roblox.platform.http.interfaces;

import mv.i0;
import sw.d;
import vw.f;
import vw.s;

/* JADX INFO: loaded from: classes2.dex */
public interface AccountSettingsInterface {
    @f("/v1/account/settings/settings-groups")
    d<i0> getAccountSettingsGroups();

    @f("v1/themes/User/{userId}")
    d<i0> getUserSelectedTheme(@s("userId") long j10);
}
