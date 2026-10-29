.class public final synthetic Lak/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/startup/NativeHelper;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/l1;->a:Lcom/roblox/client/startup/NativeHelper;

    iput-object p2, p0, Lak/l1;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lak/l1;->a:Lcom/roblox/client/startup/NativeHelper;

    iget-object v1, p0, Lak/l1;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roblox/client/startup/NativeHelper;->c(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    return-void
.end method
