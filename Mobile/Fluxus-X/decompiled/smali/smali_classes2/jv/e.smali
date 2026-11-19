.class public final Ljv/e;
.super Ljv/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljv/k<",
        "TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Ljv/e;",
        "R",
        "Ljv/k;",
        "Leu/b;",
        "uCont",
        "<init>",
        "(Leu/b;)V",
        "",
        "B",
        "()Ljava/lang/Object;",
        "",
        "e",
        "",
        "C",
        "(Ljava/lang/Throwable;)V",
        "Lav/p;",
        "g",
        "Lav/p;",
        "cont",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final g:Lav/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lav/p<",
            "TR;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Leu/b;)V
    .locals 2
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-TR;>;)V"
        }
    .end annotation

    invoke-interface {p1}, Leu/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-direct {p0, v0}, Ljv/k;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    new-instance v0, Lav/p;

    invoke-static {p1}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lav/p;-><init>(Leu/b;I)V

    iput-object v0, p0, Ljv/e;->g:Lav/p;

    return-void
.end method

.method public static final synthetic A(Ljv/e;)Lav/p;
    .locals 0

    iget-object p0, p0, Ljv/e;->g:Lav/p;

    return-object p0
.end method


# virtual methods
.method public final B()Ljava/lang/Object;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Ljv/e;->g:Lav/p;

    invoke-virtual {v0}, Lav/p;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljv/e;->g:Lav/p;

    invoke-virtual {v0}, Lav/p;->y()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljv/k;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lav/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lav/p0;

    move-result-object v1

    sget-object v3, Lav/r0;->d:Lav/r0;

    new-instance v4, Ljv/e$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Ljv/e$a;-><init>(Ljv/e;Leu/b;)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    iget-object v0, p0, Ljv/e;->g:Lav/p;

    invoke-virtual {v0}, Lav/p;->y()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final C(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Ljv/e;->g:Lav/p;

    sget-object v1, Lzt/n;->b:Lzt/n$a;

    invoke-static {p1}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Leu/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
