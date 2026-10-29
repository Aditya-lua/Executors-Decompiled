.class public final synthetic Leh/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/components/RobloxToolbar;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/components/RobloxToolbar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leh/g;->a:Lcom/roblox/client/components/RobloxToolbar;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Leh/g;->a:Lcom/roblox/client/components/RobloxToolbar;

    invoke-static {v0}, Lcom/roblox/client/components/RobloxToolbar;->U(Lcom/roblox/client/components/RobloxToolbar;)V

    return-void
.end method
