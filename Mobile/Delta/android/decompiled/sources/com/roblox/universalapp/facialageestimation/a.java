package com.roblox.universalapp.facialageestimation;

import j.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/roblox/universalapp/facialageestimation/a;", "", "Lj/b;", "activity", "", "onActivityCreated", "(Lj/b;)V", "", "inquiryId", "sessionToken", "Lcom/roblox/universalapp/facialageestimation/a$a;", "callback", "launchInquiry", "(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/facialageestimation/a$a;)V", "a", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: com.roblox.universalapp.facialageestimation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/roblox/universalapp/facialageestimation/a$a;", "", "", "inquiryId", "", "onComplete", "(Ljava/lang/String;)V", "onCancel", "debugMessage", "onError", "(Ljava/lang/String;Ljava/lang/String;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC0155a {
        void onCancel(@NotNull String inquiryId);

        void onComplete(@NotNull String inquiryId);

        void onError(@NotNull String inquiryId, @NotNull String debugMessage);
    }

    void launchInquiry(@NotNull String inquiryId, @NotNull String sessionToken, @NotNull InterfaceC0155a callback);

    void onActivityCreated(@NotNull b activity);
}
