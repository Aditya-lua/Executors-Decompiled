.class public Lwg/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwg/c$d;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Landroid/os/Handler;

.field public c:Lwg/c$d;

.field public d:Lcom/roblox/engine/jni/memstorage/Connection;

.field public e:Lcom/roblox/engine/jni/memstorage/Connection;

.field public f:Lcom/roblox/engine/jni/memstorage/Connection;


# direct methods
.method public constructor <init>(Lwg/c$d;Landroid/os/Handler;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.browserservice"

    iput-object v0, p0, Lwg/c;->a:Ljava/lang/String;

    iput-object p1, p0, Lwg/c;->c:Lwg/c$d;

    iput-object p2, p0, Lwg/c;->b:Landroid/os/Handler;

    return-void
.end method

.method public static bridge synthetic a(Lwg/c;)Lwg/c$d;
    .locals 0

    iget-object p0, p0, Lwg/c;->c:Lwg/c$d;

    return-object p0
.end method

.method public static bridge synthetic b(Lwg/c;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lwg/c;->d(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    new-instance v0, Lwg/c$a;

    invoke-direct {v0, p0}, Lwg/c$a;-><init>(Lwg/c;)V

    const-string v1, "BrowserService.OpenBrowserWindow"

    invoke-static {v1, v0}, Lcom/roblox/engine/jni/memstorage/MemStorage;->bind(Ljava/lang/String;Lcom/roblox/engine/jni/memstorage/Callback;)Lcom/roblox/engine/jni/memstorage/Connection;

    move-result-object v0

    iput-object v0, p0, Lwg/c;->d:Lcom/roblox/engine/jni/memstorage/Connection;

    new-instance v0, Lwg/c$b;

    invoke-direct {v0, p0}, Lwg/c$b;-><init>(Lwg/c;)V

    const-string v1, "BrowserService.CloseBrowserWindow"

    invoke-static {v1, v0}, Lcom/roblox/engine/jni/memstorage/MemStorage;->bind(Ljava/lang/String;Lcom/roblox/engine/jni/memstorage/Callback;)Lcom/roblox/engine/jni/memstorage/Connection;

    move-result-object v0

    iput-object v0, p0, Lwg/c;->e:Lcom/roblox/engine/jni/memstorage/Connection;

    new-instance v0, Lwg/c$c;

    invoke-direct {v0, p0}, Lwg/c$c;-><init>(Lwg/c;)V

    const-string v1, "BrowserService.SendCommand"

    invoke-static {v1, v0}, Lcom/roblox/engine/jni/memstorage/MemStorage;->bind(Ljava/lang/String;Lcom/roblox/engine/jni/memstorage/Callback;)Lcom/roblox/engine/jni/memstorage/Connection;

    move-result-object v0

    iput-object v0, p0, Lwg/c;->f:Lcom/roblox/engine/jni/memstorage/Connection;

    return-void
.end method

.method public final d(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lwg/c;->b:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lwg/c;->d:Lcom/roblox/engine/jni/memstorage/Connection;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/engine/jni/memstorage/Connection;->disconnect()V

    :cond_0
    iget-object v0, p0, Lwg/c;->e:Lcom/roblox/engine/jni/memstorage/Connection;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/roblox/engine/jni/memstorage/Connection;->disconnect()V

    :cond_1
    iget-object v0, p0, Lwg/c;->f:Lcom/roblox/engine/jni/memstorage/Connection;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/roblox/engine/jni/memstorage/Connection;->disconnect()V

    :cond_2
    return-void
.end method
