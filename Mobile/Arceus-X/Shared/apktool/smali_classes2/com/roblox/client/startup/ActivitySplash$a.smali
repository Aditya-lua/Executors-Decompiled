.class public Lcom/roblox/client/startup/ActivitySplash$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/startup/ActivitySplash;->C2(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/startup/ActivitySplash;


# direct methods
.method public constructor <init>(Lcom/roblox/client/startup/ActivitySplash;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/startup/ActivitySplash$a;->a:Lcom/roblox/client/startup/ActivitySplash;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash$a;->a:Lcom/roblox/client/startup/ActivitySplash;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roblox/client/startup/ActivitySplash;->n2(Lcom/roblox/client/startup/ActivitySplash;Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash$a;->a:Lcom/roblox/client/startup/ActivitySplash;

    invoke-static {v0}, Lcom/roblox/client/startup/ActivitySplash;->m2(Lcom/roblox/client/startup/ActivitySplash;)Lcom/roblox/client/components/LoadingBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roblox/client/components/LoadingBar;->setVisibility(I)V

    return-void
.end method
