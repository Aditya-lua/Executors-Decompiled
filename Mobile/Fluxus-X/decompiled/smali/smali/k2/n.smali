.class public final Lk2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk2/n$g;,
        Lk2/n$d;,
        Lk2/n$a;,
        Lk2/n$b;,
        Lk2/n$c;,
        Lk2/n$f;,
        Lk2/n$e;
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/Object;

.field public static d:Ljava/lang/String;

.field public static e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Ljava/lang/Object;

.field public static g:Lk2/n$f;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/app/NotificationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lk2/n;->c:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lk2/n;->e:Ljava/util/Set;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lk2/n;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk2/n;->a:Landroid/content/Context;

    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    iput-object p1, p0, Lk2/n;->b:Landroid/app/NotificationManager;

    return-void
.end method

.method public static g(Landroid/content/Context;)Lk2/n;
    .locals 1

    new-instance v0, Lk2/n;

    invoke-direct {v0, p0}, Lk2/n;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static h(Landroid/content/Context;)Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string v0, "enabled_notification_listeners"

    invoke-static {p0, v0}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lk2/n;->c:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p0, :cond_2

    :try_start_0
    sget-object v1, Lk2/n;->d:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, ":"

    const/4 v2, -0x1

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(I)V

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v1, v4

    invoke-static {v5}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    sput-object v2, Lk2/n;->e:Ljava/util/Set;

    sput-object p0, Lk2/n;->d:Ljava/lang/String;

    :cond_2
    sget-object p0, Lk2/n;->e:Ljava/util/Set;

    monitor-exit v0

    return-object p0

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static p(Landroid/app/Notification;)Z
    .locals 1

    invoke-static {p0}, Lk2/k;->a(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "android.support.useSideChannel"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lk2/n;->b:Landroid/app/NotificationManager;

    invoke-static {v0}, Lk2/n$a;->a(Landroid/app/NotificationManager;)Z

    move-result v0

    return v0
.end method

.method public b(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lk2/n;->c(Ljava/lang/String;I)V

    return-void
.end method

.method public c(Ljava/lang/String;I)V
    .locals 1

    iget-object v0, p0, Lk2/n;->b:Landroid/app/NotificationManager;

    invoke-virtual {v0, p1, p2}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    return-void
.end method

.method public d(Landroid/app/NotificationChannel;)V
    .locals 1

    iget-object v0, p0, Lk2/n;->b:Landroid/app/NotificationManager;

    invoke-static {v0, p1}, Lk2/n$b;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    return-void
.end method

.method public e(Landroid/app/NotificationChannelGroup;)V
    .locals 1

    iget-object v0, p0, Lk2/n;->b:Landroid/app/NotificationManager;

    invoke-static {v0, p1}, Lk2/n$b;->b(Landroid/app/NotificationManager;Landroid/app/NotificationChannelGroup;)V

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lk2/n;->b:Landroid/app/NotificationManager;

    invoke-static {v0, p1}, Lk2/n$b;->c(Landroid/app/NotificationManager;Ljava/lang/String;)V

    return-void
.end method

.method public i(Ljava/lang/String;)Landroid/app/NotificationChannel;
    .locals 1

    iget-object v0, p0, Lk2/n;->b:Landroid/app/NotificationManager;

    invoke-static {v0, p1}, Lk2/n$b;->e(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/String;)Landroid/app/NotificationChannelGroup;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lk2/n;->b:Landroid/app/NotificationManager;

    invoke-static {v0, p1}, Lk2/n$c;->a(Landroid/app/NotificationManager;Ljava/lang/String;)Landroid/app/NotificationChannelGroup;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lk2/n;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationChannelGroup;

    invoke-static {v1}, Lk2/n$b;->d(Landroid/app/NotificationChannelGroup;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannelGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk2/n;->b:Landroid/app/NotificationManager;

    invoke-static {v0}, Lk2/n$b;->f(Landroid/app/NotificationManager;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public l()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk2/n;->b:Landroid/app/NotificationManager;

    invoke-static {v0}, Lk2/n$b;->g(Landroid/app/NotificationManager;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public m(ILandroid/app/Notification;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2}, Lk2/n;->n(Ljava/lang/String;ILandroid/app/Notification;)V

    return-void
.end method

.method public n(Ljava/lang/String;ILandroid/app/Notification;)V
    .locals 2

    invoke-static {p3}, Lk2/n;->p(Landroid/app/Notification;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lk2/n$d;

    iget-object v1, p0, Lk2/n;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p2, p1, p3}, Lk2/n$d;-><init>(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V

    invoke-virtual {p0, v0}, Lk2/n;->o(Lk2/n$g;)V

    iget-object p3, p0, Lk2/n;->b:Landroid/app/NotificationManager;

    invoke-virtual {p3, p1, p2}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    return-void

    :cond_0
    iget-object v0, p0, Lk2/n;->b:Landroid/app/NotificationManager;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    return-void
.end method

.method public final o(Lk2/n$g;)V
    .locals 3

    sget-object v0, Lk2/n;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lk2/n;->g:Lk2/n$f;

    if-nez v1, :cond_0

    new-instance v1, Lk2/n$f;

    iget-object v2, p0, Lk2/n;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lk2/n$f;-><init>(Landroid/content/Context;)V

    sput-object v1, Lk2/n;->g:Lk2/n$f;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lk2/n;->g:Lk2/n$f;

    invoke-virtual {v1, p1}, Lk2/n$f;->h(Lk2/n$g;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
