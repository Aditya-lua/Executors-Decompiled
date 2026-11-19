.class public final Lik/a0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/c$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lik/a0;->d(Lbm/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J!\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "ik/a0$c",
        "Lcom/roblox/client/c$j;",
        "",
        "url",
        "",
        "b",
        "(Ljava/lang/String;)V",
        "deeplinkId",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;)V",
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
.field public final synthetic a:Lik/a0;


# direct methods
.method public constructor <init>(Lik/a0;)V
    .locals 0

    iput-object p1, p0, Lik/a0$c;->a:Lik/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 2

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lik/a0$c;->a:Lik/a0;

    invoke-virtual {v0}, Lik/a0;->e()V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->m5()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lik/a0$c;->a:Lik/a0;

    invoke-static {v0}, Lik/a0;->c(Lik/a0;)Lym/g;

    move-result-object v0

    const-string v1, "android_webview"

    invoke-virtual {v0, p1, v1}, Lym/g;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lik/a0$c;->a:Lik/a0;

    invoke-static {v0}, Lik/a0;->c(Lik/a0;)Lym/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lym/g;->m(Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lik/a0$c;->a:Lik/a0;

    invoke-virtual {p1}, Lik/a0;->e()V

    iget-object p1, p0, Lik/a0$c;->a:Lik/a0;

    invoke-static {p1}, Lik/a0;->c(Lik/a0;)Lym/g;

    move-result-object p1

    invoke-virtual {p1, p2}, Lym/g;->l(Ljava/lang/String;)V

    return-void
.end method
