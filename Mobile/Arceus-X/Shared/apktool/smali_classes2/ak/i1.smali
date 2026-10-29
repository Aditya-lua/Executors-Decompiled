.class public final synthetic Lak/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lcom/roblox/client/startup/NativeHelper;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/i1;->a:Landroid/content/Context;

    iput-object p2, p0, Lak/i1;->b:Lcom/roblox/client/startup/NativeHelper;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lak/i1;->a:Landroid/content/Context;

    iget-object v1, p0, Lak/i1;->b:Lcom/roblox/client/startup/NativeHelper;

    invoke-static {v0, v1}, Lcom/roblox/client/startup/NativeHelper;->t(Landroid/content/Context;Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method
