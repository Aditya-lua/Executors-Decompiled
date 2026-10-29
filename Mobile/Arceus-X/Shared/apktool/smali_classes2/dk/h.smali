.class public Ldk/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lcom/roblox/engine/jni/memstorage/Connection;

.field public c:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "UserThemeListener"

    iput-object v0, p0, Ldk/h;->a:Ljava/lang/String;

    iput-object p1, p0, Ldk/h;->c:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Ldk/h;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    if-nez v0, :cond_0

    new-instance v0, Ldk/g;

    invoke-direct {v0, p0}, Ldk/g;-><init>(Ldk/h;)V

    const-string v1, "ThemeUpdate"

    invoke-static {v1, v0}, Lcom/roblox/engine/jni/memstorage/MemStorage;->bind(Ljava/lang/String;Lcom/roblox/engine/jni/memstorage/Callback;)Lcom/roblox/engine/jni/memstorage/Connection;

    move-result-object v0

    iput-object v0, p0, Ldk/h;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Ldk/h;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/engine/jni/memstorage/Connection;->disconnect()V

    const/4 v0, 0x0

    iput-object v0, p0, Ldk/h;->b:Lcom/roblox/engine/jni/memstorage/Connection;

    :cond_0
    return-void
.end method
