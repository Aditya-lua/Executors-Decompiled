.class public abstract Lxu/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxu/p0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0017\u001a\u0004\u0008\u0002\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lxu/o;",
        "Lxu/p0;",
        "delegate",
        "<init>",
        "(Lxu/p0;)V",
        "Lxu/e;",
        "source",
        "",
        "byteCount",
        "",
        "write",
        "(Lxu/e;J)V",
        "flush",
        "()V",
        "Lxu/s0;",
        "timeout",
        "()Lxu/s0;",
        "close",
        "",
        "toString",
        "()Ljava/lang/String;",
        "-deprecated_delegate",
        "()Lxu/p0;",
        "Lxu/p0;",
        "okio"
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
.field private final delegate:Lxu/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxu/p0;)V
    .locals 1
    .param p1    # Lxu/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxu/o;->delegate:Lxu/p0;

    return-void
.end method


# virtual methods
.method public final -deprecated_delegate()Lxu/p0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lxu/o;->delegate:Lxu/p0;

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lxu/o;->delegate:Lxu/p0;

    invoke-interface {v0}, Lxu/p0;->close()V

    return-void
.end method

.method public final delegate()Lxu/p0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lxu/o;->delegate:Lxu/p0;

    return-object v0
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lxu/o;->delegate:Lxu/p0;

    invoke-interface {v0}, Lxu/p0;->flush()V

    return-void
.end method

.method public timeout()Lxu/s0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lxu/o;->delegate:Lxu/p0;

    invoke-interface {v0}, Lxu/p0;->timeout()Lxu/s0;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lxu/o;->delegate:Lxu/p0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Lxu/e;J)V
    .locals 1
    .param p1    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxu/o;->delegate:Lxu/p0;

    invoke-interface {v0, p1, p2, p3}, Lxu/p0;->write(Lxu/e;J)V

    return-void
.end method
