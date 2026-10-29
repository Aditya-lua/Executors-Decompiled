.class public final Lcom/roblox/client/realtime/RealtimeService$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/realtime/RealtimeService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/realtime/RealtimeService;


# direct methods
.method public constructor <init>(Lcom/roblox/client/realtime/RealtimeService;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/realtime/RealtimeService$c;->a:Lcom/roblox/client/realtime/RealtimeService;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    iget p1, p1, Landroid/os/Message;->arg1:I

    const/16 v0, 0xa

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/roblox/client/realtime/RealtimeService$c;->a:Lcom/roblox/client/realtime/RealtimeService;

    invoke-static {p1}, Lcom/roblox/client/realtime/RealtimeService;->a(Lcom/roblox/client/realtime/RealtimeService;)V

    return-void

    :cond_0
    const/16 v0, 0x14

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/roblox/client/realtime/RealtimeService$c;->a:Lcom/roblox/client/realtime/RealtimeService;

    invoke-static {p1}, Lcom/roblox/client/realtime/RealtimeService;->b(Lcom/roblox/client/realtime/RealtimeService;)V

    return-void

    :cond_1
    const/16 v0, 0x1e

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lcom/roblox/client/realtime/RealtimeService$c;->a:Lcom/roblox/client/realtime/RealtimeService;

    invoke-static {p1}, Lcom/roblox/client/realtime/RealtimeService;->b(Lcom/roblox/client/realtime/RealtimeService;)V

    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Looper;->quit()V

    :cond_2
    return-void
.end method
