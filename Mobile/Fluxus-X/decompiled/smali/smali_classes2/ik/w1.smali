.class public final synthetic Lik/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/roblox/client/startup/NativeHelper;

.field public final synthetic c:D


# direct methods
.method public synthetic constructor <init>(ZLcom/roblox/client/startup/NativeHelper;D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lik/w1;->a:Z

    iput-object p2, p0, Lik/w1;->b:Lcom/roblox/client/startup/NativeHelper;

    iput-wide p3, p0, Lik/w1;->c:D

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-boolean v0, p0, Lik/w1;->a:Z

    iget-object v1, p0, Lik/w1;->b:Lcom/roblox/client/startup/NativeHelper;

    iget-wide v2, p0, Lik/w1;->c:D

    invoke-static {v0, v1, v2, v3}, Lcom/roblox/client/startup/NativeHelper;->m(ZLcom/roblox/client/startup/NativeHelper;D)V

    return-void
.end method
