.class public final Lku/t2;
.super Lku/i2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lku/i2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lku/t2;",
        "T",
        "Lku/i2;",
        "Lku/p;",
        "continuation",
        "<init>",
        "(Lku/p;)V",
        "",
        "cause",
        "",
        "x",
        "(Ljava/lang/Throwable;)V",
        "e",
        "Lku/p;",
        "",
        "w",
        "()Z",
        "onCancelling",
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
.field public final e:Lku/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lku/p<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lku/p;)V
    .locals 0
    .param p1    # Lku/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lku/i2;-><init>()V

    iput-object p1, p0, Lku/t2;->e:Lku/p;

    return-void
.end method


# virtual methods
.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public x(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p0}, Lku/i2;->v()Lku/j2;

    move-result-object p1

    invoke-virtual {p1}, Lku/j2;->l0()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lku/c0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lku/t2;->e:Lku/p;

    sget-object v1, Ljt/n;->b:Ljt/n$a;

    check-cast p1, Lku/c0;

    iget-object p1, p1, Lku/c0;->a:Ljava/lang/Throwable;

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lku/t2;->e:Lku/p;

    sget-object v1, Ljt/n;->b:Ljt/n$a;

    invoke-static {p1}, Lku/k2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
