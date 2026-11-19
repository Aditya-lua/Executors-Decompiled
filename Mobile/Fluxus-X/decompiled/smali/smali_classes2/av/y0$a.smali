.class public final Lav/y0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lav/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Lav/y0;JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lav/i1;
    .locals 0
    .param p0    # Lav/y0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lav/v0;->a()Lav/y0;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3, p4}, Lav/y0;->g(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lav/i1;

    move-result-object p0

    return-object p0
.end method
