.class public Lcom/roblox/client/ActivityNativeMain$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ActivityNativeMain;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/ActivityNativeMain;


# direct methods
.method public constructor <init>(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain$c;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "[GrantPendingPurchase] Executor::run: "

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$c;->a:Lcom/roblox/client/ActivityNativeMain;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roblox/client/ActivityNativeMain;->w2(Lcom/roblox/client/ActivityNativeMain;Z)V

    return-void
.end method
