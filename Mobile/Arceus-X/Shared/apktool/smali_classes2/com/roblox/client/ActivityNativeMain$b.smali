.class public Lcom/roblox/client/ActivityNativeMain$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ActivityNativeMain;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/ActivityNativeMain;

.field public final synthetic b:Lcom/roblox/client/ActivityNativeMain;


# direct methods
.method public constructor <init>(Lcom/roblox/client/ActivityNativeMain;Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain$b;->b:Lcom/roblox/client/ActivityNativeMain;

    iput-object p2, p0, Lcom/roblox/client/ActivityNativeMain$b;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$b;->b:Lcom/roblox/client/ActivityNativeMain;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lvi/b;->q()V

    new-instance v0, Lcom/roblox/client/ActivityNativeMain$l;

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain$b;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {v0, v1}, Lcom/roblox/client/ActivityNativeMain$l;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
