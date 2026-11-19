.class public final Lrv/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrv/i;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lrv/v;",
        "Lrv/i;",
        "Lrv/t;",
        "routePlanner",
        "<init>",
        "(Lrv/t;)V",
        "Lrv/n;",
        "a",
        "()Lrv/n;",
        "Lrv/t;",
        "b",
        "()Lrv/t;",
        "okhttp"
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
.field public final a:Lrv/t;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lrv/t;)V
    .locals 1
    .param p1    # Lrv/t;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "routePlanner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrv/v;->a:Lrv/t;

    return-void
.end method


# virtual methods
.method public a()Lrv/n;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    invoke-virtual {p0}, Lrv/v;->b()Lrv/t;

    move-result-object v2

    invoke-interface {v2}, Lrv/t;->m()Z

    move-result v2

    if-nez v2, :cond_5

    :try_start_0
    invoke-virtual {p0}, Lrv/v;->b()Lrv/t;

    move-result-object v2

    invoke-interface {v2}, Lrv/t;->d()Lrv/t$b;

    move-result-object v2

    invoke-interface {v2}, Lrv/t$b;->a()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {v2}, Lrv/t$b;->h()Lrv/t$a;

    move-result-object v3

    invoke-virtual {v3}, Lrv/t$a;->f()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Lrv/t$b;->e()Lrv/t$a;

    move-result-object v3

    goto :goto_1

    :catch_0
    move-exception v2

    goto :goto_2

    :cond_0
    :goto_1
    invoke-virtual {v3}, Lrv/t$a;->a()Lrv/t$b;

    move-result-object v4

    invoke-virtual {v3}, Lrv/t$a;->b()Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_1

    if-eqz v4, :cond_2

    invoke-virtual {p0}, Lrv/v;->b()Lrv/t;

    move-result-object v2

    invoke-interface {v2}, Lrv/t;->c()Lkotlin/collections/i;

    move-result-object v2

    invoke-virtual {v2, v4}, Lkotlin/collections/i;->addFirst(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    throw v3

    :cond_2
    invoke-interface {v2}, Lrv/t$b;->c()Lrv/n;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_2
    if-nez v1, :cond_3

    move-object v1, v2

    goto :goto_3

    :cond_3
    invoke-static {v1, v2}, Lzt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_3
    invoke-virtual {p0}, Lrv/v;->b()Lrv/t;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v0, v3, v0}, Lrv/t;->b(Lrv/t;Lrv/n;ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    throw v1

    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Lrv/t;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lrv/v;->a:Lrv/t;

    return-object v0
.end method
