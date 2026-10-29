.class public final synthetic Lak/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/startup/ActivitySplash;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/startup/ActivitySplash;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/a;->a:Lcom/roblox/client/startup/ActivitySplash;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lak/a;->a:Lcom/roblox/client/startup/ActivitySplash;

    invoke-static {v0}, Lcom/roblox/client/startup/ActivitySplash;->l2(Lcom/roblox/client/startup/ActivitySplash;)V

    return-void
.end method
