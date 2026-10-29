.class public final Lak/a0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/c$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lak/a0;->g(Lnl/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "ak/a0$c",
        "Lcom/roblox/client/c$j;",
        "",
        "url",
        "",
        "b",
        "(Ljava/lang/String;)V",
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
.field public final synthetic a:Lak/a0;


# direct methods
.method public constructor <init>(Lak/a0;)V
    .locals 0

    iput-object p1, p0, Lak/a0$c;->a:Lak/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 3

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lak/a0$c;->a:Lak/a0;

    invoke-virtual {v0}, Lak/a0;->e()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->d1()Z

    move-result v0

    const-string v1, "android_webview"

    if-eqz v0, :cond_2

    iget-object v0, p0, Lak/a0$c;->a:Lak/a0;

    invoke-static {v0}, Lak/a0;->c(Lak/a0;)Lkm/f;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lkm/f;->x(Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object v0, p0, Lak/a0$c;->a:Lak/a0;

    invoke-static {v0}, Lak/a0;->c(Lak/a0;)Lkm/f;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Lkm/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lak/a0$c;->a:Lak/a0;

    invoke-static {p1}, Lak/a0;->c(Lak/a0;)Lkm/f;

    move-result-object p1

    invoke-virtual {p1, v0}, Lkm/f;->j(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lak/a0$c;->a:Lak/a0;

    invoke-static {v0}, Lak/a0;->c(Lak/a0;)Lkm/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkm/f;->m(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->y()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->g5()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lak/a0$c;->a:Lak/a0;

    invoke-static {v0}, Lak/a0;->c(Lak/a0;)Lkm/f;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Lkm/f;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lak/a0$c;->a:Lak/a0;

    invoke-static {v0}, Lak/a0;->c(Lak/a0;)Lkm/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkm/f;->k(Ljava/lang/String;)V

    return-void
.end method
