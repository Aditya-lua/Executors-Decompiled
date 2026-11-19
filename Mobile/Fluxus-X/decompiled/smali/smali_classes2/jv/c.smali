.class public final Ljv/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aE\u0010\t\u001a\u00020\u0008\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001aE\u0010\r\u001a\u00020\u0008\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000c\u001a\u00020\u000b2\u001c\u0010\u0007\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\r\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "R",
        "Ljv/d;",
        "",
        "timeMillis",
        "Lkotlin/Function1;",
        "Leu/b;",
        "",
        "block",
        "",
        "a",
        "(Ljv/d;JLkotlin/jvm/functions/Function1;)V",
        "Lkotlin/time/a;",
        "timeout",
        "b",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ljv/d;JLkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p0    # Ljv/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljv/d<",
            "-TR;>;J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Leu/b<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljv/b;

    invoke-direct {v0, p1, p2}, Ljv/b;-><init>(J)V

    invoke-virtual {v0}, Ljv/b;->c()Ljv/f;

    move-result-object p1

    invoke-interface {p0, p1, p3}, Ljv/d;->a(Ljv/f;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final b(Ljv/d;JLkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p0    # Ljv/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljv/d<",
            "-TR;>;J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Leu/b<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1, p2}, Lav/z0;->e(J)J

    move-result-wide p1

    invoke-static {p0, p1, p2, p3}, Ljv/c;->a(Ljv/d;JLkotlin/jvm/functions/Function1;)V

    return-void
.end method
