.class public final Lrv/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrv/t$b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0001\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u000f\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\u0008J\u000f\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u000bR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u000e\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lrv/r;",
        "Lrv/t$b;",
        "Lrv/n;",
        "connection",
        "<init>",
        "(Lrv/n;)V",
        "",
        "f",
        "()Ljava/lang/Void;",
        "g",
        "c",
        "()Lrv/n;",
        "d",
        "j",
        "a",
        "Lrv/n;",
        "i",
        "",
        "b",
        "Z",
        "()Z",
        "isReady",
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
.field public final a:Lrv/n;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Z


# direct methods
.method public constructor <init>(Lrv/n;)V
    .locals 1
    .param p1    # Lrv/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrv/r;->a:Lrv/n;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lrv/r;->b:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lrv/r;->b:Z

    return v0
.end method

.method public bridge synthetic b()Lrv/t$b;
    .locals 1

    invoke-virtual {p0}, Lrv/r;->j()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lrv/t$b;

    return-object v0
.end method

.method public c()Lrv/n;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lrv/r;->a:Lrv/n;

    return-object v0
.end method

.method public bridge synthetic cancel()V
    .locals 0

    invoke-virtual {p0}, Lrv/r;->d()Ljava/lang/Void;

    return-void
.end method

.method public d()Ljava/lang/Void;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected cancel"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic e()Lrv/t$a;
    .locals 1

    invoke-virtual {p0}, Lrv/r;->g()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lrv/t$a;

    return-object v0
.end method

.method public f()Ljava/lang/Void;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()Ljava/lang/Void;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic h()Lrv/t$a;
    .locals 1

    invoke-virtual {p0}, Lrv/r;->f()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lrv/t$a;

    return-object v0
.end method

.method public final i()Lrv/n;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lrv/r;->a:Lrv/n;

    return-object v0
.end method

.method public j()Ljava/lang/Void;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected retry"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
