.class public Lvi/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/b$c;,
        Lvi/b$d;
    }
.end annotation


# static fields
.field public static d:Z

.field public static e:Z

.field public static final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static g:Z


# instance fields
.field public volatile a:Z

.field public b:Z

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lvi/b;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lvi/b;->a:Z

    .line 4
    const-string v0, "rbx.AppManager"

    const-string v1, "[AppManager]: Constructor called."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public synthetic constructor <init>(Lvi/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lvi/b;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    invoke-static {p0}, Lsg/t;->c(Landroid/content/Context;)V

    invoke-static {}, Lsg/a1;->t()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "content/guac/defaultConfigs/GuacDefaultPolicy-"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".json"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetDefaultAppPolicyFile(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic b(Z)V
    .locals 0

    sput-boolean p0, Lvi/b;->d:Z

    return-void
.end method

.method public static e()Z
    .locals 2

    sget-boolean v0, Lvi/b;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-boolean v1, Lvi/b;->e:Z

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public static f()Lvi/b;
    .locals 1

    invoke-static {}, Lvi/b$c;->a()Lvi/b;

    move-result-object v0

    return-object v0
.end method

.method public static g(Landroid/os/Bundle;)Lvi/b$d;
    .locals 1

    if-eqz p0, :cond_0

    const-string v0, "logout_type"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p0

    check-cast p0, Lvi/b$d;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "rbx.AppManager"

    const-string v0, "getLogoutTypeFromBundle: Logic error: Cannot find LogoutType enum in bundle!"

    invoke-static {p0, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lvi/b$d;->a:Lvi/b$d;

    return-object p0
.end method

.method public static n()Z
    .locals 1

    sget-boolean v0, Lvi/b;->g:Z

    return v0
.end method

.method public static q()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lvi/b;->e:Z

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;)V
    .locals 3

    const-string v0, "DeviceInstallPreferences"

    invoke-static {p1, v0}, Lgk/z;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    const/4 v0, 0x1

    const-string v1, "AppFirstLaunch"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lvi/b;->b:Z

    if-eqz v0, :cond_0

    const-string v0, "rbx.AppManager"

    const-string v2, "First App launch!"

    invoke-static {v0, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    invoke-virtual {v0}, Lvi/g;->f()V

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v0, "AppFirstLaunchTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    return-void
.end method

.method public final d(Lvi/b$d;)V
    .locals 4

    sget-object v0, Lvi/b$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const-string v2, "manual"

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    const-string v3, "luaapp"

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    const-string v2, "failedSessionCheck"

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "fireLogoutEvent: Unknown logoutType:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.AppManager"

    invoke-static {v0, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-static {v2, v3}, Lsg/t0;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string p1, "webview"

    invoke-static {v2, p1}, Lsg/t0;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const-string p1, "native"

    invoke-static {v2, p1}, Lsg/t0;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-static {v2, v3}, Lsg/t0;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    invoke-static {v2, v2}, Lsg/t0;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lvi/b;->g:Z

    return-void
.end method

.method public i(Landroid/app/Activity;Lvi/b$d;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleLogout: logoutType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activity = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.AppManager"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->S1()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lvi/b$d;->c:Lvi/b$d;

    if-eq p2, v0, :cond_0

    sget-object v0, Lvi/b$d;->d:Lvi/b$d;

    if-eq p2, v0, :cond_0

    sget-object v0, Lvi/b$d;->e:Lvi/b$d;

    if-ne p2, v0, :cond_1

    :cond_0
    invoke-virtual {p0, p2}, Lvi/b;->p(Lvi/b$d;)V

    :cond_1
    const/4 v0, 0x1

    sput-boolean v0, Lvi/b;->d:Z

    invoke-virtual {p0, p2}, Lvi/b;->d(Lvi/b$d;)V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "logout_type"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->A5()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Lgk/c;->g()Lgk/c;

    move-result-object v2

    invoke-virtual {v2}, Lgk/c;->c()V

    invoke-static {}, Lsg/a1;->X0()V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v2

    invoke-virtual {v2}, Lsg/y;->d()Lvi/d;

    move-result-object v2

    invoke-virtual {v2}, Lvi/d;->b()V

    :cond_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->n5()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1}, Lcom/roblox/client/ossearch/b;->f(Landroid/content/Context;)V

    :cond_3
    sget-object v2, Lvi/b$d;->a:Lvi/b$d;

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-ne p2, v2, :cond_6

    instance-of p2, p1, Lcom/roblox/client/a;

    if-eqz p2, :cond_4

    move-object v3, p1

    check-cast v3, Lcom/roblox/client/a;

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {v3, v3}, Lcom/roblox/client/a;->d2(Landroid/content/Context;)V

    :cond_5
    invoke-static {p1}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object p2

    new-instance v2, Lvi/b$a;

    invoke-direct {v2, p0, p1, v3, v1}, Lvi/b$a;-><init>(Lvi/b;Landroid/app/Activity;Lcom/roblox/client/a;Landroid/os/Bundle;)V

    invoke-virtual {p2, p1, v0, v2}, Lak/k0;->C(Landroid/content/Context;ZLxi/c$b;)V

    goto :goto_0

    :cond_6
    invoke-static {p1}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object p2

    invoke-virtual {p2, p1, v4, v3}, Lak/k0;->C(Landroid/content/Context;ZLxi/c$b;)V

    invoke-static {}, Lvi/e;->c()Lvi/e;

    move-result-object p2

    const/4 v0, 0x2

    invoke-virtual {p2, v0, v1}, Lvi/e;->f(ILandroid/os/Bundle;)V

    sput-boolean v4, Lvi/b;->d:Z

    :goto_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->O3()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 p2, 0x2000

    invoke-virtual {p1, p2, p2}, Landroid/view/Window;->setFlags(II)V

    :cond_7
    sput-boolean v4, Lvi/b;->g:Z

    return-void
.end method

.method public j(Landroid/app/Activity;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleSwitchAccount activity = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.AppManager"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    sput-boolean v0, Lvi/b;->d:Z

    invoke-static {}, Lsg/t0;->z()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "logout_type"

    sget-object v2, Lvi/b$d;->b:Lvi/b$d;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->A5()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lgk/c;->g()Lgk/c;

    move-result-object v1

    invoke-virtual {v1}, Lgk/c;->c()V

    invoke-static {}, Lsg/a1;->X0()V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v1

    invoke-virtual {v1}, Lsg/y;->d()Lvi/d;

    move-result-object v1

    invoke-virtual {v1}, Lvi/d;->b()V

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->s5()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lcom/roblox/client/ossearch/b;->f(Landroid/content/Context;)V

    :cond_1
    invoke-static {p1}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2}, Lak/k0;->C(Landroid/content/Context;ZLxi/c$b;)V

    invoke-static {}, Lvi/e;->c()Lvi/e;

    move-result-object p1

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lvi/e;->f(ILandroid/os/Bundle;)V

    sput-boolean v3, Lvi/b;->d:Z

    sput-boolean v3, Lvi/b;->g:Z

    return-void
.end method

.method public final k(Landroid/content/Context;)V
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/app/NotificationChannel;

    sget v1, Lsg/q0;->f1:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "channel_general"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v1, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const-string v1, "notification"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    const-string v0, "channel_games"

    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    const/4 v2, 0x1

    const-string v4, "channel_calls"

    const/4 v5, 0x4

    if-nez v0, :cond_0

    new-instance v0, Landroid/app/NotificationChannel;

    sget v6, Lsg/q0;->b1:I

    invoke-virtual {p1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v4, v6, v5}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    new-instance v4, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v4}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v6, 0x6

    invoke-virtual {v4, v6}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v4

    invoke-virtual {v4}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v4

    invoke-static {v2}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v0, v6, v4}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    sget-object v4, Ljj/n;->b:[J

    invoke-virtual {v0, v4}, Landroid/app/NotificationChannel;->setVibrationPattern([J)V

    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v4}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    :goto_0
    sget v0, Lsg/q0;->k1:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v4, Landroid/app/NotificationChannel;

    const-string v6, "channel_urgent"

    invoke-direct {v4, v6, v0, v5}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    sget v0, Lsg/q0;->d1:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v5, Landroid/app/NotificationChannel;

    const-string v6, "channel_default"

    invoke-direct {v5, v6, v0, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    sget v0, Lsg/q0;->g1:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v6, Landroid/app/NotificationChannel;

    const-string v7, "channel_medium"

    const/4 v8, 0x2

    invoke-direct {v6, v7, v0, v8}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    sget v0, Lsg/q0;->h1:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v7, Landroid/app/NotificationChannel;

    const-string v8, "channel_minimum"

    invoke-direct {v7, v8, v0, v2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v1, v4}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    invoke-virtual {v1, v5}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    invoke-virtual {v1, v6}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    invoke-virtual {v1, v7}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    sget v0, Lsg/q0;->m0:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Landroid/app/NotificationChannel;

    const-string v2, "channel_recommended"

    invoke-direct {v0, v2, p1, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1, p1}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    return-void
.end method

.method public l(Landroid/content/Context;)V
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-class v0, Lvi/b;

    monitor-enter v0

    :try_start_0
    const-string v1, "rbx.AppManager"

    const-string v2, "initialize: Start..."

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v1, p0, Lvi/b;->a:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lvi/b;->o()V

    const-string p1, "rbx.AppManager"

    const-string v1, "initialize: Already initialized."

    invoke-static {p1, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    invoke-virtual {p0, p1}, Lvi/b;->m(Landroid/content/Context;)V

    const/4 p1, 0x0

    sput-boolean p1, Lvi/b;->g:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lvi/b;->a:Z

    invoke-virtual {p0}, Lvi/b;->o()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sub-long/2addr v3, v1

    const-string p1, "rbx.AppManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initialize: Completed OK. elapsedTime(ms) = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final m(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lgk/z;->e(Landroid/content/Context;)Lgk/z;

    invoke-static {p1}, Lsg/a1;->g0(Landroid/content/Context;)V

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lsg/a1;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetBaseUrl(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lsg/a1;->W()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetRobloxChannel(Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->S1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lwk/e;->c()Lwk/e$a;

    move-result-object v0

    sget-object v1, Lwk/e$a;->c:Lwk/e$a;

    const-string v2, "rbx.AppManager"

    if-ne v0, v1, :cond_0

    const-string v0, "cookie_migrated"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    const-string v0, "VersionB: cookies migrated from WebView to native storage."

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    sget-object v1, Lwk/e$a;->b:Lwk/e$a;

    if-ne v0, v1, :cond_1

    const-string v0, "cookie_loaded"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    const-string v0, "VersionB: cookies loaded from native storage."

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    new-instance v0, Lni/c;

    invoke-direct {v0}, Lni/c;-><init>()V

    invoke-static {v0}, Lcom/roblox/engine/jni/user/NativeUserJavaInterface;->setImplementation(Lsk/a;)V

    invoke-static {p1}, Lak/l2;->b(Landroid/content/Context;)V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->l()Lvk/f;

    move-result-object v0

    invoke-static {v0}, Lvk/g;->i(Lvk/f;)V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->p()Lvj/a;

    invoke-static {}, Lvi/h;->e()Lvi/h;

    invoke-static {}, Lsg/u;->g()Lsg/u;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lsg/u;->d(Lsg/u$c;)V

    invoke-static {}, Lxg/a;->e()Lxg/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxg/a;->g(Landroid/content/Context;)V

    invoke-static {}, Lnh/d;->b()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqi/b;->q(Ljava/util/Locale;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->J4()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljj/r;->x(Landroid/content/Context;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1}, Lvi/b;->k(Landroid/content/Context;)V

    :goto_1
    new-instance v0, Lwj/b;

    invoke-direct {v0}, Lwj/b;-><init>()V

    invoke-static {v0}, Lmk/d;->c(Lmk/d$a;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lorg/webrtc/ContextUtils;->initialize(Landroid/content/Context;)V

    invoke-static {}, Lmk/c;->p()Lmk/c;

    move-result-object v0

    new-instance v1, Lvi/a;

    invoke-direct {v1, p1}, Lvi/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lmk/c;->s(Ljava/util/function/Consumer;)V

    invoke-static {}, Lmk/c;->p()Lmk/c;

    move-result-object p1

    invoke-virtual {p1}, Lmk/c;->x()V

    return-void
.end method

.method public final o()V
    .locals 3

    invoke-static {}, Lsg/a1;->Z0()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ROBLOX\n| User-Agent = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n| Build = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lgk/h;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ID = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lsg/a1;->K()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n| Version = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "2.744.1081"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", Code = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x4be2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n| BaseUrl = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lsg/a1;->H()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n| OS Ver. = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", Lvl = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\n| Arch = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lsg/u;->g()Lsg/u;

    move-result-object v0

    invoke-virtual {v0}, Lsg/u;->i()Lsg/u$b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n| Is domain set = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lvk/g;->c()Lvk/b;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.AppManager"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public p(Lvi/b$d;)V
    .locals 25

    const-string v0, "native_cookie_write_source"

    const-string v1, "native_cookie_age_seconds"

    const-string v2, "engine_has_roblosecurity"

    const-string v3, "shell_has_roblosecurity"

    const-string v4, "has_cached_user"

    const-string v5, "was_logged_in"

    const-string v6, "logout_type"

    const-string v7, "rbx.AppManager"

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v8

    invoke-interface {v8}, Lth/i;->S1()Z

    move-result v8

    if-nez v8, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v8

    invoke-virtual {v8}, Lvi/h;->f()Z

    move-result v8

    invoke-static {}, Lvi/h;->h()Z

    move-result v9

    invoke-static {}, Lsg/a1;->u()Z

    move-result v10

    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object v11

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Lwk/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_1

    const-string v14, ".ROBLOSECURITY=_"

    invoke-virtual {v11, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_1

    const/4 v11, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    const/4 v11, 0x0

    :goto_0
    invoke-static {}, Lwk/e;->f()Ljava/lang/String;

    move-result-object v14

    invoke-static {}, Lwk/e;->c()Lwk/e$a;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-static {}, Lwk/e;->e()J

    move-result-wide v16

    const-wide/16 v18, 0x0

    cmp-long v18, v16, v18

    if-lez v18, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    sub-long v18, v18, v16

    const-wide/16 v16, 0x3e8

    div-long v18, v18, v16

    goto :goto_1

    :cond_2
    const-wide/16 v18, -0x1

    :goto_1
    invoke-static {}, Lwk/e;->d()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Lsm/c$a;

    move/from16 v20, v8

    const-string v8, "cookie_versionb_did_logout"

    sget-object v21, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    move/from16 v22, v9

    invoke-static/range {v21 .. v21}, Lwf/k;->a(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-direct {v13, v8, v9}, Lsm/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    const/16 v8, 0x9

    const/16 v9, 0x15

    move/from16 v21, v10

    const/16 v10, 0x7ea

    invoke-virtual {v13, v10, v8, v9}, Lsm/c$a;->j(III)Lsm/c$a;

    move-result-object v8

    invoke-virtual {v8}, Lsm/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v8

    new-instance v9, Lsm/c$b;

    invoke-direct {v9}, Lsm/c$b;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v6, v10}, Lsm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;

    move-result-object v9

    invoke-static/range {v20 .. v20}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v5, v10}, Lsm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;

    move-result-object v9

    invoke-static/range {v22 .. v22}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v4, v10}, Lsm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;

    move-result-object v9

    invoke-static {v11}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v3, v10}, Lsm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;

    move-result-object v9

    invoke-static/range {v21 .. v21}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v2, v10}, Lsm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;

    move-result-object v9

    const-string v10, "webview_state"

    invoke-virtual {v9, v10, v14}, Lsm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;

    move-result-object v9

    const-string v10, "migration_result"

    invoke-virtual {v9, v10, v15}, Lsm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;

    move-result-object v9

    invoke-static/range {v18 .. v19}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v1, v10}, Lsm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;

    move-result-object v9

    invoke-virtual {v9, v0, v12}, Lsm/c$b;->i(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;

    move-result-object v9

    invoke-virtual {v9}, Lsm/c$b;->l()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;

    move-result-object v9

    invoke-static {v8, v9}, Lsm/c;->d(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;)Z

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v8

    const-wide/high16 v23, 0x4059000000000000L    # 100.0

    mul-double v8, v8, v23

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v10

    invoke-interface {v10}, Lth/i;->H4()I

    move-result v10

    move-wide/from16 v23, v8

    int-to-double v8, v10

    cmpg-double v8, v23, v8

    if-gez v8, :cond_3

    const/4 v8, 0x1

    goto :goto_2

    :cond_3
    const/4 v8, 0x0

    :goto_2
    invoke-static {}, Lvg/e;->h()Lvg/e;

    move-result-object v9

    invoke-virtual {v9}, Lvg/e;->g()Lj6/a;

    move-result-object v9

    if-eqz v8, :cond_4

    if-eqz v9, :cond_4

    sget-object v10, Lvi/b;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    move/from16 v16, v11

    const/4 v11, 0x1

    const/4 v13, 0x0

    invoke-virtual {v10, v13, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v10

    if-eqz v10, :cond_5

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v8, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v8, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v8, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "cookie_webview_state"

    invoke-interface {v8, v3, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "cookie_migration_result"

    invoke-interface {v8, v3, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v8, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {v18 .. v19}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v8, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v8, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lbacktraceio/library/models/json/BacktraceReport;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "involuntary_logout:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v8}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v9, v0}, Lj6/a;->send(Lbacktraceio/library/models/json/BacktraceReport;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportInvoluntaryLogout: sent Backtrace report for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    const/4 v11, 0x1

    const/4 v13, 0x0

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportInvoluntaryLogout: counter only (inUploadSample="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", clientReady="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v9, :cond_6

    move v12, v11

    goto :goto_3

    :cond_6
    move v12, v13

    :goto_3
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", alreadyUploadedThisProcess="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lvi/b;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reportInvoluntaryLogout: failed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public r(Z)V
    .locals 0

    iput-boolean p1, p0, Lvi/b;->c:Z

    return-void
.end method
