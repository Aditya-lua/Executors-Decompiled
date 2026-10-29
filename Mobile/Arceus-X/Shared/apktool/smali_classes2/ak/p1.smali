.class public final synthetic Lak/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/startup/NativeHelper;

.field public final synthetic b:D


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/startup/NativeHelper;D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/p1;->a:Lcom/roblox/client/startup/NativeHelper;

    iput-wide p2, p0, Lak/p1;->b:D

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lak/p1;->a:Lcom/roblox/client/startup/NativeHelper;

    iget-wide v1, p0, Lak/p1;->b:D

    invoke-static {v0, v1, v2}, Lcom/roblox/client/startup/NativeHelper;->s(Lcom/roblox/client/startup/NativeHelper;D)V

    return-void
.end method
