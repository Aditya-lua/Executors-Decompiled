.class public Ljm/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljm/a$b;,
        Ljm/a$a;
    }
.end annotation


# static fields
.field public static f:Ljm/a;

.field public static g:Ljm/a$b;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ljm/a$b;->a:Ljm/a$b;

    sput-object v0, Ljm/a;->g:Ljm/a$b;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ljm/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean v1, p0, Ljm/a;->c:Z

    iput-boolean v1, p0, Ljm/a;->d:Z

    iput-boolean v1, p0, Ljm/a;->e:Z

    iput-boolean p1, p0, Ljm/a;->b:Z

    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 1

    sget-object v0, Ljm/a;->f:Ljm/a;

    if-nez v0, :cond_0

    new-instance v0, Ljm/a;

    instance-of p0, p0, Landroid/app/Activity;

    invoke-direct {v0, p0}, Ljm/a;-><init>(Z)V

    sput-object v0, Ljm/a;->f:Ljm/a;

    :cond_0
    return-void
.end method

.method public static i()V
    .locals 1

    sget-object v0, Ljm/a$b;->b:Ljm/a$b;

    sput-object v0, Ljm/a;->g:Ljm/a$b;

    return-void
.end method

.method public static j()Ljm/a;
    .locals 1

    sget-object v0, Ljm/a;->f:Ljm/a;

    return-object v0
.end method


# virtual methods
.method public a(Ljm/a$a;Landroid/os/Bundle;)V
    .locals 6

    sget-object v0, Ljm/a$a;->a:Ljm/a$a;

    const-wide/16 v1, 0x1

    const-string v3, "cold_start"

    const-string v4, "warm_start_pre_forked"

    const-string v5, "warm_start"

    if-ne p1, v0, :cond_3

    if-nez p2, :cond_2

    iget-boolean p1, p0, Ljm/a;->b:Z

    if-eqz p1, :cond_2

    sget-object p1, Ljm/a;->g:Ljm/a$b;

    sget-object p2, Ljm/a$b;->b:Ljm/a$b;

    if-eq p1, p2, :cond_2

    iget-boolean p1, p0, Ljm/a;->c:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Ljm/a;->d:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljm/a;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v5}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {v4}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {v3, v1, v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->h(Ljava/lang/String;J)V

    return-void

    :cond_2
    :goto_0
    invoke-static {v5}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->M1()Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Ljm/a$a;->c:Ljm/a$a;

    if-ne p1, v0, :cond_7

    const-string p1, "game_activity_warm_start"

    if-nez p2, :cond_6

    iget-boolean p2, p0, Ljm/a;->b:Z

    if-eqz p2, :cond_6

    sget-object p2, Ljm/a;->g:Ljm/a$b;

    sget-object v0, Ljm/a$b;->b:Ljm/a$b;

    if-eq p2, v0, :cond_6

    iget-boolean p2, p0, Ljm/a;->e:Z

    if-eqz p2, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Ljm/a;->d()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-static {v5}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {v4}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    invoke-static {v3, v1, v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->h(Ljava/lang/String;J)V

    const-string p1, "game_activity_cold_start"

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    :goto_1
    invoke-static {v5}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :goto_2
    const/4 p1, 0x1

    iput-boolean p1, p0, Ljm/a;->e:Z

    return-void

    :cond_7
    sget-object v0, Ljm/a$a;->b:Ljm/a$a;

    if-ne p1, v0, :cond_c

    iget-object p1, p0, Ljm/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p1

    if-nez p1, :cond_c

    if-eqz p2, :cond_c

    iget-boolean p1, p0, Ljm/a;->c:Z

    const-string p2, "main_activity_warm_start"

    if-nez p1, :cond_b

    iget-boolean p1, p0, Ljm/a;->d:Z

    if-eqz p1, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {p0}, Ljm/a;->d()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {v5}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {v4}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    return-void

    :cond_9
    iget-boolean p1, p0, Ljm/a;->c:Z

    if-nez p1, :cond_a

    iget-boolean p2, p0, Ljm/a;->d:Z

    if-nez p2, :cond_a

    invoke-static {v3, v1, v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->h(Ljava/lang/String;J)V

    const-string p1, "main_activity_cold_start"

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    return-void

    :cond_a
    if-nez p1, :cond_c

    iget-boolean p1, p0, Ljm/a;->d:Z

    if-eqz p1, :cond_c

    invoke-static {v5}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    const-string p1, "main_activity_warm_start_no_splash"

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    return-void

    :cond_b
    :goto_3
    invoke-static {v5}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_c
    return-void
.end method

.method public b(Ljm/a$a;)V
    .locals 0

    const-string p1, "app_paused"

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    return-void
.end method

.method public final d()Z
    .locals 4

    invoke-static {}, Lcom/roblox/universalapp/logging/LoggingProtocol;->getProcessTimestamp()J

    move-result-wide v0

    const-wide/16 v2, 0x7530

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Ljm/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ljm/a;->e:Z

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ljm/a;->d:Z

    return-void
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ljm/a;->c:Z

    return-void
.end method
