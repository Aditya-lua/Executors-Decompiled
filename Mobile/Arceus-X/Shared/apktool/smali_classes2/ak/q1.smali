.class public final synthetic Lak/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/startup/NativeHelper;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/q1;->a:Lcom/roblox/client/startup/NativeHelper;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lak/q1;->a:Lcom/roblox/client/startup/NativeHelper;

    invoke-static {v0}, Lcom/roblox/client/startup/NativeHelper;->d(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method
