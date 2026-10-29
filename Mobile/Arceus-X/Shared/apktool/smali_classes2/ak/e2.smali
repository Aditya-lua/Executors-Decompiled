.class public final synthetic Lak/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/roblox/client/startup/NativeHelper;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/startup/NativeHelper;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/e2;->a:Lcom/roblox/client/startup/NativeHelper;

    iput p2, p0, Lak/e2;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lak/e2;->a:Lcom/roblox/client/startup/NativeHelper;

    iget v1, p0, Lak/e2;->b:I

    invoke-static {v0, v1}, Lcom/roblox/client/startup/NativeHelper;->e(Lcom/roblox/client/startup/NativeHelper;I)V

    return-void
.end method
