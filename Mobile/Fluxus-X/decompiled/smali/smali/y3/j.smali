.class public final Ly3/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001a>\u0010\u0008\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0086@\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lu3/i;",
        "Ly3/f;",
        "Lkotlin/Function2;",
        "Ly3/c;",
        "Leu/b;",
        "",
        "",
        "transform",
        "a",
        "(Lu3/i;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;",
        "datastore-preferences-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lu3/i;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;
    .locals 2
    .param p0    # Lu3/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/i<",
            "Ly3/f;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ly3/c;",
            "-",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Leu/b<",
            "-",
            "Ly3/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Ly3/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ly3/j$a;-><init>(Lkotlin/jvm/functions/Function2;Leu/b;)V

    invoke-interface {p0, v0, p2}, Lu3/i;->a(Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
