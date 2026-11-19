.class public abstract Ltv/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lew/l0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltv/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u00a2\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00188\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u001d8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u0014\u0010 \"\u0004\u0008\u001e\u0010!\u00a8\u0006#"
    }
    d2 = {
        "Ltv/b$a;",
        "Lew/l0;",
        "Lmv/z;",
        "url",
        "<init>",
        "(Ltv/b;Lmv/z;)V",
        "Lew/m0;",
        "t",
        "()Lew/m0;",
        "Lew/e;",
        "sink",
        "",
        "byteCount",
        "f3",
        "(Lew/e;J)J",
        "Lmv/y;",
        "trailers",
        "",
        "b",
        "(Lmv/y;)V",
        "a",
        "Lmv/z;",
        "getUrl",
        "()Lmv/z;",
        "Lew/o;",
        "Lew/o;",
        "getTimeout",
        "()Lew/o;",
        "timeout",
        "",
        "c",
        "Z",
        "()Z",
        "(Z)V",
        "closed",
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
.field public final a:Lmv/z;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lew/o;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Z

.field public final synthetic d:Ltv/b;


# direct methods
.method public constructor <init>(Ltv/b;Lmv/z;)V
    .locals 1
    .param p1    # Ltv/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/z;",
            ")V"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltv/b$a;->d:Ltv/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ltv/b$a;->a:Lmv/z;

    new-instance p2, Lew/o;

    invoke-virtual {p1}, Ltv/b;->s()Lrv/a;

    move-result-object p1

    invoke-interface {p1}, Lrv/a;->a()Lew/g;

    move-result-object p1

    invoke-interface {p1}, Lew/l0;->t()Lew/m0;

    move-result-object p1

    invoke-direct {p2, p1}, Lew/o;-><init>(Lew/m0;)V

    iput-object p2, p0, Ltv/b$a;->b:Lew/o;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Ltv/b$a;->c:Z

    return v0
.end method

.method public final b(Lmv/y;)V
    .locals 3
    .param p1    # Lmv/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "trailers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltv/b$a;->d:Ltv/b;

    invoke-static {v0}, Ltv/b;->n(Ltv/b;)I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ltv/b$a;->d:Ltv/b;

    invoke-static {v0}, Ltv/b;->n(Ltv/b;)I

    move-result v0

    const/4 v2, 0x5

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Ltv/b$a;->d:Ltv/b;

    iget-object v2, p0, Ltv/b$a;->b:Lew/o;

    invoke-static {v0, v2}, Ltv/b;->k(Ltv/b;Lew/o;)V

    iget-object v0, p0, Ltv/b$a;->d:Ltv/b;

    invoke-static {v0, p1}, Ltv/b;->q(Ltv/b;Lmv/y;)V

    iget-object v0, p0, Ltv/b$a;->d:Ltv/b;

    invoke-static {v0, v1}, Ltv/b;->p(Ltv/b;I)V

    invoke-virtual {p1}, Lmv/y;->size()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Ltv/b$a;->d:Ltv/b;

    invoke-static {v0}, Ltv/b;->l(Ltv/b;)Lmv/d0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lmv/d0;->n()Lmv/o;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Ltv/b$a;->a:Lmv/z;

    invoke-static {v0, v1, p1}, Lsv/e;->f(Lmv/o;Lmv/z;Lmv/y;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ltv/b$a;->d:Ltv/b;

    invoke-static {v1}, Ltv/b;->n(Ltv/b;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Z)V
    .locals 0

    iput-boolean p1, p0, Ltv/b$a;->c:Z

    return-void
.end method

.method public f3(Lew/e;J)J
    .locals 1
    .param p1    # Lew/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Ltv/b$a;->d:Ltv/b;

    invoke-virtual {v0}, Ltv/b;->s()Lrv/a;

    move-result-object v0

    invoke-interface {v0}, Lrv/a;->a()Lew/g;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lew/l0;->f3(Lew/e;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Ltv/b$a;->d:Ltv/b;

    invoke-virtual {p2}, Ltv/b;->i()Lsv/d$a;

    move-result-object p2

    invoke-interface {p2}, Lsv/d$a;->d()V

    invoke-static {}, Ltv/b;->o()Lmv/y;

    move-result-object p2

    invoke-virtual {p0, p2}, Ltv/b$a;->b(Lmv/y;)V

    throw p1
.end method

.method public t()Lew/m0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ltv/b$a;->b:Lew/o;

    return-object v0
.end method
