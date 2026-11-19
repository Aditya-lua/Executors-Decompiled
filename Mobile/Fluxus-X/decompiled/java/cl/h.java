package cl;

import com.roblox.platform.http.interfaces.AccountInformationInterface;
import com.roblox.platform.http.interfaces.AccountSettingsInterface;
import com.roblox.platform.http.interfaces.AuthInterface;
import com.roblox.platform.http.interfaces.ChatInterface;
import com.roblox.platform.http.interfaces.ClientSettingsInterface;
import com.roblox.platform.http.interfaces.FriendsInterface;
import com.roblox.platform.http.interfaces.LocaleInterface;
import com.roblox.platform.http.interfaces.MetricsInterface;
import com.roblox.platform.http.interfaces.NotificationAckInterface;
import com.roblox.platform.http.interfaces.NotificationsInterface;
import com.roblox.platform.http.interfaces.PlatformChatInterface;
import com.roblox.platform.http.interfaces.ThumbnailsInterface;
import com.roblox.platform.http.interfaces.TranslationsInterface;
import mv.d0;

/* JADX INFO: loaded from: classes2.dex */
public class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlatformChatInterface f5490a;
    public ChatInterface b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ClientSettingsInterface f5491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MetricsInterface f5492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public NotificationsInterface f5493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NotificationAckInterface f5494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LocaleInterface f5495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FriendsInterface f5496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TranslationsInterface f5497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AccountSettingsInterface f5498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AuthInterface f5499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AccountInformationInterface f5500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ThumbnailsInterface f5501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d0 f5502n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public sw.e.a f5503o;

    public h(d0 d0Var, sw.e.a aVar) {
        this.f5502n = d0Var;
        this.f5503o = aVar;
    }

    @Override // cl.d
    public MetricsInterface a() {
        MetricsInterface metricsInterface = this.f5492d;
        if (metricsInterface != null) {
            return metricsInterface;
        }
        throw new RuntimeException("Metrics interface not initialized");
    }

    @Override // cl.d
    public FriendsInterface b() {
        FriendsInterface friendsInterface = this.f5496h;
        if (friendsInterface != null) {
            return friendsInterface;
        }
        throw new RuntimeException("Friends interface not initialized");
    }

    @Override // cl.d
    public PlatformChatInterface c() {
        PlatformChatInterface platformChatInterface = this.f5490a;
        if (platformChatInterface != null) {
            return platformChatInterface;
        }
        throw new RuntimeException("PlatformChat interface not initialized");
    }

    @Override // cl.d
    public LocaleInterface d(d0 d0Var) {
        LocaleInterface localeInterface = (LocaleInterface) new gl.a("locale", g.c().f5481a).e(d0Var).d(this.f5503o).build(LocaleInterface.class);
        if (localeInterface != null) {
            return localeInterface;
        }
        throw new RuntimeException("Locale interface not initialized");
    }

    @Override // cl.d
    public NotificationAckInterface e(b bVar) {
        if (this.f5494f == null) {
            this.f5494f = (NotificationAckInterface) new gl.a("apis", bVar.f5481a).e(this.f5502n).d(this.f5503o).build(NotificationAckInterface.class);
        }
        return this.f5494f;
    }

    @Override // cl.d
    public ThumbnailsInterface f() {
        ThumbnailsInterface thumbnailsInterface = this.f5501m;
        if (thumbnailsInterface != null) {
            return thumbnailsInterface;
        }
        throw new RuntimeException("Thumbnails interface not initialized");
    }

    @Override // cl.d
    public NotificationsInterface g() {
        NotificationsInterface notificationsInterface = this.f5493e;
        if (notificationsInterface != null) {
            return notificationsInterface;
        }
        throw new RuntimeException("Notifications interface not initialized");
    }

    @Override // cl.d
    public AccountSettingsInterface h() {
        AccountSettingsInterface accountSettingsInterface = this.f5498j;
        if (accountSettingsInterface != null) {
            return accountSettingsInterface;
        }
        throw new RuntimeException("AccountSettings interface not initialized");
    }

    public d i(b bVar) {
        if (this.f5490a == null) {
            this.f5490a = (PlatformChatInterface) new gl.a("apis", bVar.f5481a).e(this.f5502n).d(this.f5503o).build(PlatformChatInterface.class);
        }
        if (this.b == null) {
            this.b = (ChatInterface) new gl.a("chat", bVar.f5481a).e(this.f5502n).d(this.f5503o).build(ChatInterface.class);
        }
        if (this.f5491c == null) {
            this.f5491c = (ClientSettingsInterface) new gl.a("clientsettings.api", bVar.f5481a).e(this.f5502n).d(this.f5503o).build(ClientSettingsInterface.class);
        }
        if (this.f5492d == null) {
            this.f5492d = (MetricsInterface) new gl.a("metrics", bVar.f5481a).e(this.f5502n).d(this.f5503o).build(MetricsInterface.class);
        }
        if (this.f5493e == null) {
            this.f5493e = (NotificationsInterface) new gl.a("notifications", bVar.f5481a).e(this.f5502n).d(this.f5503o).build(NotificationsInterface.class);
        }
        if (this.f5495g == null) {
            this.f5495g = (LocaleInterface) new gl.a("locale", bVar.f5481a).e(this.f5502n).d(this.f5503o).build(LocaleInterface.class);
        }
        if (this.f5496h == null) {
            this.f5496h = (FriendsInterface) new gl.a("friends", bVar.f5481a).e(this.f5502n).d(this.f5503o).build(FriendsInterface.class);
        }
        if (this.f5497i == null) {
            this.f5497i = (TranslationsInterface) new gl.a("translations", bVar.f5481a).e(this.f5502n).d(this.f5503o).build(TranslationsInterface.class);
        }
        if (this.f5498j == null) {
            this.f5498j = (AccountSettingsInterface) new gl.a("accountsettings", bVar.f5481a).e(this.f5502n).d(this.f5503o).build(AccountSettingsInterface.class);
        }
        if (this.f5499k == null) {
            this.f5499k = (AuthInterface) new gl.a("auth", bVar.f5481a).e(this.f5502n).d(this.f5503o).build(AuthInterface.class);
        }
        if (this.f5500l == null) {
            this.f5500l = (AccountInformationInterface) new gl.a("accountinformation", bVar.f5481a).e(this.f5502n).d(this.f5503o).build(AccountInformationInterface.class);
        }
        if (this.f5501m == null) {
            this.f5501m = (ThumbnailsInterface) new gl.a("thumbnails", bVar.f5481a).e(this.f5502n).d(this.f5503o).build(ThumbnailsInterface.class);
        }
        return this;
    }
}
