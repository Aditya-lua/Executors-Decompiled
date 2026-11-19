.class public final Lx6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lmv/e;",
        "Lmv/h0;",
        "a",
        "(Lmv/e;Leu/b;)Ljava/lang/Object;",
        "coil-network-okhttp"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lmv/e;Leu/b;)Ljava/lang/Object;
    .locals 3
    .param p0    # Lmv/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/e;",
            "Leu/b<",
            "-",
            "Lmv/h0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lav/p;

    invoke-static {p1}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lav/p;-><init>(Leu/b;I)V

    invoke-virtual {v0}, Lav/p;->G()V

    new-instance v1, Lx6/c;

    invoke-direct {v1, p0, v0}, Lx6/c;-><init>(Lmv/e;Lav/n;)V

    invoke-interface {p0, v1}, Lmv/e;->b0(Lmv/f;)V

    invoke-interface {v0, v1}, Lav/n;->j(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lav/p;->y()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lgu/h;->c(Leu/b;)V

    :cond_0
    return-object p0
.end method
