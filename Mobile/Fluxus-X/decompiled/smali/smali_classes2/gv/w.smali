.class public final Lgv/w;
.super Lav/l0;
.source "SourceFile"

# interfaces
.implements Lav/y0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00082\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00082\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0017\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J&\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0018H\u0096\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ,\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\t\u001a\u00020\u0008H\u0096\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lgv/w;",
        "Lav/l0;",
        "Lav/y0;",
        "dispatcher",
        "",
        "name",
        "<init>",
        "(Lav/l0;Ljava/lang/String;)V",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "",
        "N",
        "(Lkotlin/coroutines/CoroutineContext;)Z",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "block",
        "",
        "I",
        "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V",
        "L",
        "toString",
        "()Ljava/lang/String;",
        "",
        "timeMillis",
        "Lav/n;",
        "continuation",
        "A",
        "(JLav/n;)V",
        "Lav/i1;",
        "g",
        "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lav/i1;",
        "d",
        "Lav/l0;",
        "e",
        "Ljava/lang/String;",
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
.field public final synthetic c:Lav/y0;

.field public final d:Lav/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lav/l0;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lav/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lav/l0;-><init>()V

    instance-of v0, p1, Lav/y0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lav/y0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Lav/v0;->a()Lav/y0;

    move-result-object v0

    :cond_1
    iput-object v0, p0, Lgv/w;->c:Lav/y0;

    iput-object p1, p0, Lgv/w;->d:Lav/l0;

    iput-object p2, p0, Lgv/w;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public A(JLav/n;)V
    .locals 1
    .param p3    # Lav/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lav/n<",
            "-",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lgv/w;->c:Lav/y0;

    invoke-interface {v0, p1, p2, p3}, Lav/y0;->A(JLav/n;)V

    return-void
.end method

.method public I(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Lgv/w;->d:Lav/l0;

    invoke-virtual {v0, p1, p2}, Lav/l0;->I(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    return-void
.end method

.method public L(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Lgv/w;->d:Lav/l0;

    invoke-virtual {v0, p1, p2}, Lav/l0;->L(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    return-void
.end method

.method public N(Lkotlin/coroutines/CoroutineContext;)Z
    .locals 1
    .param p1    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Lgv/w;->d:Lav/l0;

    invoke-virtual {v0, p1}, Lav/l0;->N(Lkotlin/coroutines/CoroutineContext;)Z

    move-result p1

    return p1
.end method

.method public g(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lav/i1;
    .locals 1
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

    iget-object v0, p0, Lgv/w;->c:Lav/y0;

    invoke-interface {v0, p1, p2, p3, p4}, Lav/y0;->g(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lav/i1;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lgv/w;->e:Ljava/lang/String;

    return-object v0
.end method
