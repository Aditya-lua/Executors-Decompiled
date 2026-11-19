package com.roblox.platform.http.interfaces;

import com.github.luben.zstd.BuildConfig;
import eu.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import sw.d;
import vw.f;
import vw.t;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fJ=\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/roblox/platform/http/interfaces/ThumbnailsInterface;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "userIds", "size", "format", BuildConfig.FLAVOR, "isCircular", "Lsw/d;", "Lql/b;", "getAvatarHeadshotCall", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lsw/d;", "getAvatarHeadshot", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLeu/b;)Ljava/lang/Object;", "Companion", "a", "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ThumbnailsInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f9674a;

    @NotNull
    public static final String FORMAT_PNG = "Png";

    @NotNull
    public static final String HEADSHOT_SIZE_150X150 = "150x150";

    /* JADX INFO: renamed from: com.roblox.platform.http.interfaces.ThumbnailsInterface$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/roblox/platform/http/interfaces/ThumbnailsInterface$a;", BuildConfig.FLAVOR, "<init>", "()V", "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f9674a = new Companion();
    }

    @f("v1/users/avatar-headshot")
    @Nullable
    Object getAvatarHeadshot(@t("userIds") @NotNull String str, @t("size") @NotNull String str2, @t("format") @NotNull String str3, @t("isCircular") boolean z10, @NotNull b<? super ql.b> bVar);

    @f("v1/users/avatar-headshot")
    @NotNull
    d<ql.b> getAvatarHeadshotCall(@t("userIds") @NotNull String userIds, @t("size") @NotNull String size, @t("format") @NotNull String format, @t("isCircular") boolean isCircular);
}
