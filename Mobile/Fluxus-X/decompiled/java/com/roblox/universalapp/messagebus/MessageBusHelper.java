package com.roblox.universalapp.messagebus;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR4\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/roblox/universalapp/messagebus/MessageBusHelper;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "domainName", "messageName", "getMessageId", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function2;", "getMessageIdDelegate", "Lkotlin/jvm/functions/Function2;", "getGetMessageIdDelegate", "()Lkotlin/jvm/functions/Function2;", "setGetMessageIdDelegate", "(Lkotlin/jvm/functions/Function2;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MessageBusHelper {

    @NotNull
    public static final MessageBusHelper INSTANCE = new MessageBusHelper();

    @NotNull
    private static Function2<? super String, ? super String, String> getMessageIdDelegate = MessageBusHelper$getMessageIdDelegate$1.INSTANCE;

    private MessageBusHelper() {
    }

    @NotNull
    public final Function2<String, String, String> getGetMessageIdDelegate() {
        return getMessageIdDelegate;
    }

    @NotNull
    public final String getMessageId(@NotNull String domainName, @NotNull String messageName) {
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(messageName, "messageName");
        return getMessageIdDelegate.invoke(domainName, messageName);
    }

    public final void setGetMessageIdDelegate(@NotNull Function2<? super String, ? super String, String> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        getMessageIdDelegate = function2;
    }
}
