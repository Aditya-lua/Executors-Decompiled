package com.roblox.client.startup;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public enum StartedForEnum {
    SYSTEM(0),
    SHELL_PROCESS_RESTART(1),
    SHELL_PROCESS_RESTART_FOR_RESULT(2),
    APP_RESTART(3),
    AFTER_SIGN_UP(4),
    AFTER_LOGIN(5),
    PROTOCOL_LAUNCH(6),
    LOG_OUT(7),
    REMINDER_NOTIFICATION(8),
    LOADED_FROM_PUSH_NOTIFICATION(9),
    AFTER_LOGIN_FOR_RESULT(10);


    /* JADX INFO: renamed from: id */
    private final int f12331id;

    StartedForEnum(int i10) {
        this.f12331id = i10;
    }

    public int getId() {
        return this.f12331id;
    }
}
