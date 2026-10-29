.class public Lcom/roblox/client/realtime/RealtimeService$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/realtime/RealtimeService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/roblox/client/realtime/RealtimeService$a;->a:Z

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/roblox/client/realtime/RealtimeService$a;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(Lsj/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/realtime/RealtimeService$a;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p1}, Lsg/e2;->j(Landroid/content/Context;)Z

    move-result p1

    iget-boolean p2, p0, Lcom/roblox/client/realtime/RealtimeService$a;->b:Z

    if-eqz p2, :cond_0

    iput-boolean p1, p0, Lcom/roblox/client/realtime/RealtimeService$a;->a:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/roblox/client/realtime/RealtimeService$a;->b:Z

    return-void

    :cond_0
    iget-boolean p2, p0, Lcom/roblox/client/realtime/RealtimeService$a;->a:Z

    if-eq p1, p2, :cond_1

    iput-boolean p1, p0, Lcom/roblox/client/realtime/RealtimeService$a;->a:Z

    new-instance p2, Lph/e;

    invoke-direct {p2, p1}, Lph/e;-><init>(Z)V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p1

    invoke-virtual {p1, p2}, Lfv/c;->j(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
