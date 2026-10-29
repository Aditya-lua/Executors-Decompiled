.class public final synthetic Lsg/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/c$k;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/c$k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/l1;->a:Lcom/roblox/client/c$k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lsg/l1;->a:Lcom/roblox/client/c$k;

    invoke-static {v0}, Lcom/roblox/client/c$k;->b(Lcom/roblox/client/c$k;)V

    return-void
.end method
