package cl;

import com.roblox.platform.http.interfaces.AccountSettingsInterface;
import com.roblox.platform.http.interfaces.FriendsInterface;
import com.roblox.platform.http.interfaces.LocaleInterface;
import com.roblox.platform.http.interfaces.MetricsInterface;
import com.roblox.platform.http.interfaces.NotificationAckInterface;
import com.roblox.platform.http.interfaces.NotificationsInterface;
import com.roblox.platform.http.interfaces.PlatformChatInterface;
import com.roblox.platform.http.interfaces.ThumbnailsInterface;
import mv.d0;

/* JADX INFO: loaded from: classes2.dex */
public interface d {
    MetricsInterface a();

    FriendsInterface b();

    PlatformChatInterface c();

    LocaleInterface d(d0 d0Var);

    NotificationAckInterface e(b bVar);

    ThumbnailsInterface f();

    NotificationsInterface g();

    AccountSettingsInterface h();
}
