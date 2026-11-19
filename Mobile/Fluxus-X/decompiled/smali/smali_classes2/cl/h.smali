.class public Lcl/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcl/d;


# instance fields
.field public a:Lcom/roblox/platform/http/interfaces/PlatformChatInterface;

.field public b:Lcom/roblox/platform/http/interfaces/ChatInterface;

.field public c:Lcom/roblox/platform/http/interfaces/ClientSettingsInterface;

.field public d:Lcom/roblox/platform/http/interfaces/MetricsInterface;

.field public e:Lcom/roblox/platform/http/interfaces/NotificationsInterface;

.field public f:Lcom/roblox/platform/http/interfaces/NotificationAckInterface;

.field public g:Lcom/roblox/platform/http/interfaces/LocaleInterface;

.field public h:Lcom/roblox/platform/http/interfaces/FriendsInterface;

.field public i:Lcom/roblox/platform/http/interfaces/TranslationsInterface;

.field public j:Lcom/roblox/platform/http/interfaces/AccountSettingsInterface;

.field public k:Lcom/roblox/platform/http/interfaces/AuthInterface;

.field public l:Lcom/roblox/platform/http/interfaces/AccountInformationInterface;

.field public m:Lcom/roblox/platform/http/interfaces/ThumbnailsInterface;

.field public n:Lmv/d0;

.field public o:Lsw/e$a;


# direct methods
.method public constructor <init>(Lmv/d0;Lsw/e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcl/h;->n:Lmv/d0;

    iput-object p2, p0, Lcl/h;->o:Lsw/e$a;

    return-void
.end method


# virtual methods
.method public a()Lcom/roblox/platform/http/interfaces/MetricsInterface;
    .locals 2

    iget-object v0, p0, Lcl/h;->d:Lcom/roblox/platform/http/interfaces/MetricsInterface;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Metrics interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Lcom/roblox/platform/http/interfaces/FriendsInterface;
    .locals 2

    iget-object v0, p0, Lcl/h;->h:Lcom/roblox/platform/http/interfaces/FriendsInterface;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Friends interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()Lcom/roblox/platform/http/interfaces/PlatformChatInterface;
    .locals 2

    iget-object v0, p0, Lcl/h;->a:Lcom/roblox/platform/http/interfaces/PlatformChatInterface;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "PlatformChat interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Lmv/d0;)Lcom/roblox/platform/http/interfaces/LocaleInterface;
    .locals 3

    new-instance v0, Lgl/a;

    invoke-static {}, Lcl/g;->c()Lcl/b;

    move-result-object v1

    iget-object v1, v1, Lcl/b;->a:Ljava/lang/String;

    const-string v2, "locale"

    invoke-direct {v0, v2, v1}, Lgl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lgl/a;->e(Lmv/d0;)Lgl/a;

    move-result-object p1

    iget-object v0, p0, Lcl/h;->o:Lsw/e$a;

    invoke-virtual {p1, v0}, Lgl/a;->d(Lsw/e$a;)Lgl/a;

    move-result-object p1

    const-class v0, Lcom/roblox/platform/http/interfaces/LocaleInterface;

    invoke-virtual {p1, v0}, Lgl/a;->build(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/roblox/platform/http/interfaces/LocaleInterface;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Locale interface not initialized"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Lcl/b;)Lcom/roblox/platform/http/interfaces/NotificationAckInterface;
    .locals 2

    iget-object v0, p0, Lcl/h;->f:Lcom/roblox/platform/http/interfaces/NotificationAckInterface;

    if-nez v0, :cond_0

    new-instance v0, Lgl/a;

    const-string v1, "apis"

    iget-object p1, p1, Lcl/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Lgl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcl/h;->n:Lmv/d0;

    invoke-virtual {v0, p1}, Lgl/a;->e(Lmv/d0;)Lgl/a;

    move-result-object p1

    iget-object v0, p0, Lcl/h;->o:Lsw/e$a;

    invoke-virtual {p1, v0}, Lgl/a;->d(Lsw/e$a;)Lgl/a;

    move-result-object p1

    const-class v0, Lcom/roblox/platform/http/interfaces/NotificationAckInterface;

    invoke-virtual {p1, v0}, Lgl/a;->build(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/roblox/platform/http/interfaces/NotificationAckInterface;

    iput-object p1, p0, Lcl/h;->f:Lcom/roblox/platform/http/interfaces/NotificationAckInterface;

    :cond_0
    iget-object p1, p0, Lcl/h;->f:Lcom/roblox/platform/http/interfaces/NotificationAckInterface;

    return-object p1
.end method

.method public f()Lcom/roblox/platform/http/interfaces/ThumbnailsInterface;
    .locals 2

    iget-object v0, p0, Lcl/h;->m:Lcom/roblox/platform/http/interfaces/ThumbnailsInterface;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Thumbnails interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()Lcom/roblox/platform/http/interfaces/NotificationsInterface;
    .locals 2

    iget-object v0, p0, Lcl/h;->e:Lcom/roblox/platform/http/interfaces/NotificationsInterface;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Notifications interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()Lcom/roblox/platform/http/interfaces/AccountSettingsInterface;
    .locals 2

    iget-object v0, p0, Lcl/h;->j:Lcom/roblox/platform/http/interfaces/AccountSettingsInterface;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "AccountSettings interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i(Lcl/b;)Lcl/d;
    .locals 3

    iget-object v0, p0, Lcl/h;->a:Lcom/roblox/platform/http/interfaces/PlatformChatInterface;

    if-nez v0, :cond_0

    new-instance v0, Lgl/a;

    const-string v1, "apis"

    iget-object v2, p1, Lcl/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lgl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcl/h;->n:Lmv/d0;

    invoke-virtual {v0, v1}, Lgl/a;->e(Lmv/d0;)Lgl/a;

    move-result-object v0

    iget-object v1, p0, Lcl/h;->o:Lsw/e$a;

    invoke-virtual {v0, v1}, Lgl/a;->d(Lsw/e$a;)Lgl/a;

    move-result-object v0

    const-class v1, Lcom/roblox/platform/http/interfaces/PlatformChatInterface;

    invoke-virtual {v0, v1}, Lgl/a;->build(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/platform/http/interfaces/PlatformChatInterface;

    iput-object v0, p0, Lcl/h;->a:Lcom/roblox/platform/http/interfaces/PlatformChatInterface;

    :cond_0
    iget-object v0, p0, Lcl/h;->b:Lcom/roblox/platform/http/interfaces/ChatInterface;

    if-nez v0, :cond_1

    new-instance v0, Lgl/a;

    const-string v1, "chat"

    iget-object v2, p1, Lcl/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lgl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcl/h;->n:Lmv/d0;

    invoke-virtual {v0, v1}, Lgl/a;->e(Lmv/d0;)Lgl/a;

    move-result-object v0

    iget-object v1, p0, Lcl/h;->o:Lsw/e$a;

    invoke-virtual {v0, v1}, Lgl/a;->d(Lsw/e$a;)Lgl/a;

    move-result-object v0

    const-class v1, Lcom/roblox/platform/http/interfaces/ChatInterface;

    invoke-virtual {v0, v1}, Lgl/a;->build(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/platform/http/interfaces/ChatInterface;

    iput-object v0, p0, Lcl/h;->b:Lcom/roblox/platform/http/interfaces/ChatInterface;

    :cond_1
    iget-object v0, p0, Lcl/h;->c:Lcom/roblox/platform/http/interfaces/ClientSettingsInterface;

    if-nez v0, :cond_2

    new-instance v0, Lgl/a;

    const-string v1, "clientsettings.api"

    iget-object v2, p1, Lcl/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lgl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcl/h;->n:Lmv/d0;

    invoke-virtual {v0, v1}, Lgl/a;->e(Lmv/d0;)Lgl/a;

    move-result-object v0

    iget-object v1, p0, Lcl/h;->o:Lsw/e$a;

    invoke-virtual {v0, v1}, Lgl/a;->d(Lsw/e$a;)Lgl/a;

    move-result-object v0

    const-class v1, Lcom/roblox/platform/http/interfaces/ClientSettingsInterface;

    invoke-virtual {v0, v1}, Lgl/a;->build(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/platform/http/interfaces/ClientSettingsInterface;

    iput-object v0, p0, Lcl/h;->c:Lcom/roblox/platform/http/interfaces/ClientSettingsInterface;

    :cond_2
    iget-object v0, p0, Lcl/h;->d:Lcom/roblox/platform/http/interfaces/MetricsInterface;

    if-nez v0, :cond_3

    new-instance v0, Lgl/a;

    const-string v1, "metrics"

    iget-object v2, p1, Lcl/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lgl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcl/h;->n:Lmv/d0;

    invoke-virtual {v0, v1}, Lgl/a;->e(Lmv/d0;)Lgl/a;

    move-result-object v0

    iget-object v1, p0, Lcl/h;->o:Lsw/e$a;

    invoke-virtual {v0, v1}, Lgl/a;->d(Lsw/e$a;)Lgl/a;

    move-result-object v0

    const-class v1, Lcom/roblox/platform/http/interfaces/MetricsInterface;

    invoke-virtual {v0, v1}, Lgl/a;->build(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/platform/http/interfaces/MetricsInterface;

    iput-object v0, p0, Lcl/h;->d:Lcom/roblox/platform/http/interfaces/MetricsInterface;

    :cond_3
    iget-object v0, p0, Lcl/h;->e:Lcom/roblox/platform/http/interfaces/NotificationsInterface;

    if-nez v0, :cond_4

    new-instance v0, Lgl/a;

    const-string v1, "notifications"

    iget-object v2, p1, Lcl/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lgl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcl/h;->n:Lmv/d0;

    invoke-virtual {v0, v1}, Lgl/a;->e(Lmv/d0;)Lgl/a;

    move-result-object v0

    iget-object v1, p0, Lcl/h;->o:Lsw/e$a;

    invoke-virtual {v0, v1}, Lgl/a;->d(Lsw/e$a;)Lgl/a;

    move-result-object v0

    const-class v1, Lcom/roblox/platform/http/interfaces/NotificationsInterface;

    invoke-virtual {v0, v1}, Lgl/a;->build(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/platform/http/interfaces/NotificationsInterface;

    iput-object v0, p0, Lcl/h;->e:Lcom/roblox/platform/http/interfaces/NotificationsInterface;

    :cond_4
    iget-object v0, p0, Lcl/h;->g:Lcom/roblox/platform/http/interfaces/LocaleInterface;

    if-nez v0, :cond_5

    new-instance v0, Lgl/a;

    const-string v1, "locale"

    iget-object v2, p1, Lcl/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lgl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcl/h;->n:Lmv/d0;

    invoke-virtual {v0, v1}, Lgl/a;->e(Lmv/d0;)Lgl/a;

    move-result-object v0

    iget-object v1, p0, Lcl/h;->o:Lsw/e$a;

    invoke-virtual {v0, v1}, Lgl/a;->d(Lsw/e$a;)Lgl/a;

    move-result-object v0

    const-class v1, Lcom/roblox/platform/http/interfaces/LocaleInterface;

    invoke-virtual {v0, v1}, Lgl/a;->build(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/platform/http/interfaces/LocaleInterface;

    iput-object v0, p0, Lcl/h;->g:Lcom/roblox/platform/http/interfaces/LocaleInterface;

    :cond_5
    iget-object v0, p0, Lcl/h;->h:Lcom/roblox/platform/http/interfaces/FriendsInterface;

    if-nez v0, :cond_6

    new-instance v0, Lgl/a;

    const-string v1, "friends"

    iget-object v2, p1, Lcl/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lgl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcl/h;->n:Lmv/d0;

    invoke-virtual {v0, v1}, Lgl/a;->e(Lmv/d0;)Lgl/a;

    move-result-object v0

    iget-object v1, p0, Lcl/h;->o:Lsw/e$a;

    invoke-virtual {v0, v1}, Lgl/a;->d(Lsw/e$a;)Lgl/a;

    move-result-object v0

    const-class v1, Lcom/roblox/platform/http/interfaces/FriendsInterface;

    invoke-virtual {v0, v1}, Lgl/a;->build(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/platform/http/interfaces/FriendsInterface;

    iput-object v0, p0, Lcl/h;->h:Lcom/roblox/platform/http/interfaces/FriendsInterface;

    :cond_6
    iget-object v0, p0, Lcl/h;->i:Lcom/roblox/platform/http/interfaces/TranslationsInterface;

    if-nez v0, :cond_7

    new-instance v0, Lgl/a;

    const-string v1, "translations"

    iget-object v2, p1, Lcl/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lgl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcl/h;->n:Lmv/d0;

    invoke-virtual {v0, v1}, Lgl/a;->e(Lmv/d0;)Lgl/a;

    move-result-object v0

    iget-object v1, p0, Lcl/h;->o:Lsw/e$a;

    invoke-virtual {v0, v1}, Lgl/a;->d(Lsw/e$a;)Lgl/a;

    move-result-object v0

    const-class v1, Lcom/roblox/platform/http/interfaces/TranslationsInterface;

    invoke-virtual {v0, v1}, Lgl/a;->build(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/platform/http/interfaces/TranslationsInterface;

    iput-object v0, p0, Lcl/h;->i:Lcom/roblox/platform/http/interfaces/TranslationsInterface;

    :cond_7
    iget-object v0, p0, Lcl/h;->j:Lcom/roblox/platform/http/interfaces/AccountSettingsInterface;

    if-nez v0, :cond_8

    new-instance v0, Lgl/a;

    const-string v1, "accountsettings"

    iget-object v2, p1, Lcl/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lgl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcl/h;->n:Lmv/d0;

    invoke-virtual {v0, v1}, Lgl/a;->e(Lmv/d0;)Lgl/a;

    move-result-object v0

    iget-object v1, p0, Lcl/h;->o:Lsw/e$a;

    invoke-virtual {v0, v1}, Lgl/a;->d(Lsw/e$a;)Lgl/a;

    move-result-object v0

    const-class v1, Lcom/roblox/platform/http/interfaces/AccountSettingsInterface;

    invoke-virtual {v0, v1}, Lgl/a;->build(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/platform/http/interfaces/AccountSettingsInterface;

    iput-object v0, p0, Lcl/h;->j:Lcom/roblox/platform/http/interfaces/AccountSettingsInterface;

    :cond_8
    iget-object v0, p0, Lcl/h;->k:Lcom/roblox/platform/http/interfaces/AuthInterface;

    if-nez v0, :cond_9

    new-instance v0, Lgl/a;

    const-string v1, "auth"

    iget-object v2, p1, Lcl/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lgl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcl/h;->n:Lmv/d0;

    invoke-virtual {v0, v1}, Lgl/a;->e(Lmv/d0;)Lgl/a;

    move-result-object v0

    iget-object v1, p0, Lcl/h;->o:Lsw/e$a;

    invoke-virtual {v0, v1}, Lgl/a;->d(Lsw/e$a;)Lgl/a;

    move-result-object v0

    const-class v1, Lcom/roblox/platform/http/interfaces/AuthInterface;

    invoke-virtual {v0, v1}, Lgl/a;->build(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/platform/http/interfaces/AuthInterface;

    iput-object v0, p0, Lcl/h;->k:Lcom/roblox/platform/http/interfaces/AuthInterface;

    :cond_9
    iget-object v0, p0, Lcl/h;->l:Lcom/roblox/platform/http/interfaces/AccountInformationInterface;

    if-nez v0, :cond_a

    new-instance v0, Lgl/a;

    const-string v1, "accountinformation"

    iget-object v2, p1, Lcl/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lgl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcl/h;->n:Lmv/d0;

    invoke-virtual {v0, v1}, Lgl/a;->e(Lmv/d0;)Lgl/a;

    move-result-object v0

    iget-object v1, p0, Lcl/h;->o:Lsw/e$a;

    invoke-virtual {v0, v1}, Lgl/a;->d(Lsw/e$a;)Lgl/a;

    move-result-object v0

    const-class v1, Lcom/roblox/platform/http/interfaces/AccountInformationInterface;

    invoke-virtual {v0, v1}, Lgl/a;->build(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/platform/http/interfaces/AccountInformationInterface;

    iput-object v0, p0, Lcl/h;->l:Lcom/roblox/platform/http/interfaces/AccountInformationInterface;

    :cond_a
    iget-object v0, p0, Lcl/h;->m:Lcom/roblox/platform/http/interfaces/ThumbnailsInterface;

    if-nez v0, :cond_b

    new-instance v0, Lgl/a;

    const-string v1, "thumbnails"

    iget-object p1, p1, Lcl/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Lgl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcl/h;->n:Lmv/d0;

    invoke-virtual {v0, p1}, Lgl/a;->e(Lmv/d0;)Lgl/a;

    move-result-object p1

    iget-object v0, p0, Lcl/h;->o:Lsw/e$a;

    invoke-virtual {p1, v0}, Lgl/a;->d(Lsw/e$a;)Lgl/a;

    move-result-object p1

    const-class v0, Lcom/roblox/platform/http/interfaces/ThumbnailsInterface;

    invoke-virtual {p1, v0}, Lgl/a;->build(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/roblox/platform/http/interfaces/ThumbnailsInterface;

    iput-object p1, p0, Lcl/h;->m:Lcom/roblox/platform/http/interfaces/ThumbnailsInterface;

    :cond_b
    return-object p0
.end method
