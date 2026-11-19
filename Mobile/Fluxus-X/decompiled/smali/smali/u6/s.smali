.class public final Lu6/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/r;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ \u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u00a8\u0006 "
    }
    d2 = {
        "Lu6/s;",
        "Lu6/r;",
        "Lew/g;",
        "source",
        "c",
        "(Lew/g;)Lew/g;",
        "Lew/f;",
        "sink",
        "",
        "h",
        "(Lew/g;Lew/f;Leu/b;)Ljava/lang/Object;",
        "Lew/k;",
        "fileSystem",
        "Lew/b0;",
        "path",
        "k",
        "(Lew/g;Lew/k;Lew/b0;Leu/b;)Ljava/lang/Object;",
        "b",
        "(Lew/g;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lew/g;",
        "coil-network-core_release"
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
.field public final a:Lew/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public synthetic constructor <init>(Lew/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/s;->a:Lew/g;

    return-void
.end method

.method public static final synthetic a(Lew/g;)Lu6/s;
    .locals 1

    new-instance v0, Lu6/s;

    invoke-direct {v0, p0}, Lu6/s;-><init>(Lew/g;)V

    return-object v0
.end method

.method public static b(Lew/g;)V
    .locals 0

    invoke-interface {p0}, Lew/l0;->close()V

    return-void
.end method

.method public static c(Lew/g;)Lew/g;
    .locals 0
    .param p0    # Lew/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
.end method

.method public static d(Lew/g;Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lu6/s;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lu6/s;

    invoke-virtual {p1}, Lu6/s;->g()Lew/g;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static e(Lew/g;)I
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public static f(Lew/g;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SourceResponseBody(source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lew/g;Lew/f;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lew/f;
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
            "Lew/g;",
            "Lew/f;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-interface {p0, p1}, Lew/g;->a0(Lew/j0;)J

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static k(Lew/g;Lew/k;Lew/b0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lew/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lew/b0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lew/g;",
            "Lew/k;",
            "Lew/b0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Lew/k;->u(Lew/b0;Z)Lew/j0;

    move-result-object p1

    invoke-static {p1}, Lew/v;->b(Lew/j0;)Lew/f;

    move-result-object p1

    :try_start_0
    invoke-interface {p0, p1}, Lew/g;->a0(Lew/j0;)J

    move-result-wide p2

    invoke-static {p2, p3}, Lgu/b;->d(J)Ljava/lang/Long;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_0

    :try_start_1
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p0, 0x0

    goto :goto_1

    :catchall_1
    move-exception p0

    if-eqz p1, :cond_1

    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    invoke-static {p0, p1}, Lzt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    if-nez p0, :cond_2

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_2
    throw p0
.end method


# virtual methods
.method public D(Lew/f;Leu/b;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lew/f;
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
            "Lew/f;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lu6/s;->a:Lew/g;

    invoke-static {v0, p1, p2}, Lu6/s;->h(Lew/g;Lew/f;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public P(Lew/k;Lew/b0;Leu/b;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lew/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lew/b0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lew/k;",
            "Lew/b0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lu6/s;->a:Lew/g;

    invoke-static {v0, p1, p2, p3}, Lu6/s;->k(Lew/g;Lew/k;Lew/b0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lu6/s;->a:Lew/g;

    invoke-static {v0}, Lu6/s;->b(Lew/g;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lu6/s;->a:Lew/g;

    invoke-static {v0, p1}, Lu6/s;->d(Lew/g;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic g()Lew/g;
    .locals 1

    iget-object v0, p0, Lu6/s;->a:Lew/g;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lu6/s;->a:Lew/g;

    invoke-static {v0}, Lu6/s;->e(Lew/g;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu6/s;->a:Lew/g;

    invoke-static {v0}, Lu6/s;->f(Lew/g;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
