package com.roblox.client.pushnotification.v2.model;

import androidx.annotation.Keep;
import com.google.gson.reflect.TypeToken;
import gk.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JR\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013¨\u0006'"}, d2 = {"Lcom/roblox/client/pushnotification/v2/model/NotificationAction;", "", "", "id", "label", "deeplink", "postUrl", "postPayload", "", "requireUnlock", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/roblox/client/pushnotification/v2/model/NotificationAction;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLabel", "getDeeplink", "getPostUrl", "getPostPayload", "Z", "getRequireUnlock", "Companion", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationAction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String deeplink;

    @NotNull
    private final String id;

    @NotNull
    private final String label;

    @Nullable
    private final String postPayload;

    @Nullable
    private final String postUrl;
    private final boolean requireUnlock;

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.v2.model.NotificationAction$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/roblox/client/pushnotification/v2/model/NotificationAction$a;", "", "<init>", "()V", "", "json", "", "Lcom/roblox/client/pushnotification/v2/model/NotificationAction;", "a", "(Ljava/lang/String;)Ljava/util/List;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.roblox.client.pushnotification.v2.model.NotificationAction$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/roblox/client/pushnotification/v2/model/NotificationAction$a$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/roblox/client/pushnotification/v2/model/NotificationAction;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0146a extends TypeToken<List<? extends NotificationAction>> {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<NotificationAction> a(@NotNull String json) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                List list = (List) m.b().k(json, new C0146a().getType());
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        NotificationAction notificationAction = (NotificationAction) obj;
                        if (notificationAction.getId() != null && notificationAction.getLabel() != null) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = null;
                }
                return arrayList == null ? p.k() : arrayList;
            } catch (Exception e10) {
                gk.p.d("Failed to get notification actions. Exception: " + e10.getMessage() + "\nJson: " + json);
                return p.k();
            }
        }

        public Companion() {
        }
    }

    public NotificationAction(@NotNull String id2, @NotNull String label, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        this.id = id2;
        this.label = label;
        this.deeplink = str;
        this.postUrl = str2;
        this.postPayload = str3;
        this.requireUnlock = z10;
    }

    public static /* synthetic */ NotificationAction copy$default(NotificationAction notificationAction, String str, String str2, String str3, String str4, String str5, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notificationAction.id;
        }
        if ((i10 & 2) != 0) {
            str2 = notificationAction.label;
        }
        if ((i10 & 4) != 0) {
            str3 = notificationAction.deeplink;
        }
        if ((i10 & 8) != 0) {
            str4 = notificationAction.postUrl;
        }
        if ((i10 & 16) != 0) {
            str5 = notificationAction.postPayload;
        }
        if ((i10 & 32) != 0) {
            z10 = notificationAction.requireUnlock;
        }
        String str6 = str5;
        boolean z11 = z10;
        return notificationAction.copy(str, str2, str3, str4, str6, z11);
    }

    @NotNull
    public static final List<NotificationAction> getListFromJson(@NotNull String str) {
        return INSTANCE.a(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPostUrl() {
        return this.postUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPostPayload() {
        return this.postPayload;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getRequireUnlock() {
        return this.requireUnlock;
    }

    @NotNull
    public final NotificationAction copy(@NotNull String id2, @NotNull String label, @Nullable String deeplink, @Nullable String postUrl, @Nullable String postPayload, boolean requireUnlock) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        return new NotificationAction(id2, label, deeplink, postUrl, postPayload, requireUnlock);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationAction)) {
            return false;
        }
        NotificationAction notificationAction = (NotificationAction) other;
        return Intrinsics.c(this.id, notificationAction.id) && Intrinsics.c(this.label, notificationAction.label) && Intrinsics.c(this.deeplink, notificationAction.deeplink) && Intrinsics.c(this.postUrl, notificationAction.postUrl) && Intrinsics.c(this.postPayload, notificationAction.postPayload) && this.requireUnlock == notificationAction.requireUnlock;
    }

    @Nullable
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getPostPayload() {
        return this.postPayload;
    }

    @Nullable
    public final String getPostUrl() {
        return this.postUrl;
    }

    public final boolean getRequireUnlock() {
        return this.requireUnlock;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.label.hashCode()) * 31;
        String str = this.deeplink;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.postUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postPayload;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.requireUnlock);
    }

    @NotNull
    public String toString() {
        return "NotificationAction(id=" + this.id + ", label=" + this.label + ", deeplink=" + this.deeplink + ", postUrl=" + this.postUrl + ", postPayload=" + this.postPayload + ", requireUnlock=" + this.requireUnlock + ")";
    }
}
