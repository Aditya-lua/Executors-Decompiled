package com.roblox.universalapp.messagebus;

import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final /* synthetic */ class MessageBusHelper$getMessageIdDelegate$1 extends k implements Function2<String, String, String> {
    public static final MessageBusHelper$getMessageIdDelegate$1 INSTANCE = new MessageBusHelper$getMessageIdDelegate$1();

    public MessageBusHelper$getMessageIdDelegate$1() {
        super(2, MessageBus.class, "getMessageId", "getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // p001kotlin.jvm.functions.Function2
    public final String invoke(String str, String str2) {
        return MessageBus.getMessageId(str, str2);
    }
}
