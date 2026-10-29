.class public final Lk6/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a%\u0010\u0004\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a%\u0010\u0007\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00062\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a%\u0010\n\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\t2\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "T",
        "Lk6/l;",
        "Lk6/l$c;",
        "key",
        "c",
        "(Lk6/l;Lk6/l$c;)Ljava/lang/Object;",
        "Lx6/g;",
        "a",
        "(Lx6/g;Lk6/l$c;)Ljava/lang/Object;",
        "Lx6/p;",
        "b",
        "(Lx6/p;Lk6/l$c;)Ljava/lang/Object;",
        "coil-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lx6/g;Lk6/l$c;)Ljava/lang/Object;
    .locals 1
    .param p0    # Lx6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lk6/l$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lx6/g;",
            "Lk6/l$c<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lx6/g;->k()Lk6/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk6/l;->c(Lk6/l$c;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lx6/g;->g()Lx6/g$b;

    move-result-object p0

    invoke-virtual {p0}, Lx6/g$b;->f()Lk6/l;

    move-result-object p0

    invoke-virtual {p0, p1}, Lk6/l;->c(Lk6/l$c;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-virtual {p1}, Lk6/l$c;->a()Ljava/lang/Object;

    move-result-object p0

    :cond_0
    return-object p0

    :cond_1
    return-object v0
.end method

.method public static final b(Lx6/p;Lk6/l$c;)Ljava/lang/Object;
    .locals 0
    .param p0    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lk6/l$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lx6/p;",
            "Lk6/l$c<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lx6/p;->f()Lk6/l;

    move-result-object p0

    invoke-virtual {p0, p1}, Lk6/l;->c(Lk6/l$c;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-virtual {p1}, Lk6/l$c;->a()Ljava/lang/Object;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final c(Lk6/l;Lk6/l$c;)Ljava/lang/Object;
    .locals 0
    .param p0    # Lk6/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lk6/l$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lk6/l;",
            "Lk6/l$c<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lk6/l;->c(Lk6/l$c;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-virtual {p1}, Lk6/l$c;->a()Ljava/lang/Object;

    move-result-object p0

    :cond_0
    return-object p0
.end method
