.class public final Lcom/roblox/client/startup/NativeHelper$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/d$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/startup/NativeHelper;->m0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "com/roblox/client/startup/NativeHelper$f",
        "Lcom/roblox/client/d$d;",
        "Lcom/roblox/client/d$e;",
        "result",
        "",
        "a",
        "(Lcom/roblox/client/d$e;)V",
        "status",
        "b",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/startup/NativeHelper;


# direct methods
.method public constructor <init>(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/startup/NativeHelper$f;->a:Lcom/roblox/client/startup/NativeHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/client/d$e;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roblox/client/d$e;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper$f;->a:Lcom/roblox/client/startup/NativeHelper;

    invoke-static {p1}, Lcom/roblox/client/startup/NativeHelper;->F(Lcom/roblox/client/startup/NativeHelper;)Lfh/i;

    move-result-object p1

    sget-object v0, Lfh/i$a;->a:Lfh/i$a;

    invoke-interface {p1, v0}, Lfh/i;->a(Lfh/i$a;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/roblox/client/d$e;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper$f;->a:Lcom/roblox/client/startup/NativeHelper;

    invoke-static {p1}, Lcom/roblox/client/startup/NativeHelper;->F(Lcom/roblox/client/startup/NativeHelper;)Lfh/i;

    move-result-object p1

    sget-object v0, Lfh/i$a;->b:Lfh/i$a;

    invoke-interface {p1, v0}, Lfh/i;->a(Lfh/i$a;)V

    return-void

    :cond_1
    invoke-static {}, Lgk/t;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/roblox/client/d$e;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper$f;->a:Lcom/roblox/client/startup/NativeHelper;

    invoke-static {p1}, Lcom/roblox/client/startup/NativeHelper;->F(Lcom/roblox/client/startup/NativeHelper;)Lfh/i;

    move-result-object p1

    sget-object v0, Lfh/i$a;->c:Lfh/i$a;

    invoke-interface {p1, v0}, Lfh/i;->a(Lfh/i$a;)V

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper$f;->a:Lcom/roblox/client/startup/NativeHelper;

    invoke-static {v0}, Lcom/roblox/client/startup/NativeHelper;->E(Lcom/roblox/client/startup/NativeHelper;)Lcom/roblox/client/startup/MainGameActivity;

    move-result-object v0

    sget-object v1, Lvi/b$d;->a:Lvi/b$d;

    invoke-virtual {p1, v0, v1}, Lvi/b;->i(Landroid/app/Activity;Lvi/b$d;)V

    :cond_2
    return-void
.end method

.method public b(Lcom/roblox/client/d$e;)V
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/roblox/client/d$e;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper$f;->a:Lcom/roblox/client/startup/NativeHelper;

    invoke-static {p1}, Lcom/roblox/client/startup/NativeHelper;->F(Lcom/roblox/client/startup/NativeHelper;)Lfh/i;

    move-result-object p1

    sget-object v0, Lfh/i$a;->b:Lfh/i$a;

    invoke-interface {p1, v0}, Lfh/i;->a(Lfh/i$a;)V

    :cond_0
    return-void
.end method
