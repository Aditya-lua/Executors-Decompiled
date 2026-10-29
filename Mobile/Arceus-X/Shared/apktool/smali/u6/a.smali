.class public final Lu6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ2\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lu6/a;",
        "Lt6/b;",
        "<init>",
        "()V",
        "Lt6/q;",
        "cacheResponse",
        "Lt6/o;",
        "networkRequest",
        "Lx6/p;",
        "options",
        "Lt6/b$b;",
        "b",
        "(Lt6/q;Lt6/o;Lx6/p;Lnt/b;)Ljava/lang/Object;",
        "networkResponse",
        "Lt6/b$c;",
        "a",
        "(Lt6/q;Lt6/o;Lt6/q;Lx6/p;Lnt/b;)Ljava/lang/Object;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lt6/q;Lt6/o;Lt6/q;Lx6/p;Lnt/b;)Ljava/lang/Object;
    .locals 11
    .param p1    # Lt6/q;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lt6/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lt6/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt6/q;",
            "Lt6/o;",
            "Lt6/q;",
            "Lx6/p;",
            "Lnt/b<",
            "-",
            "Lt6/b$c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p3}, Lt6/q;->d()I

    move-result p2

    const/16 v0, 0x130

    if-ne p2, v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lt6/q;->e()Lt6/n;

    move-result-object p1

    invoke-virtual {p3}, Lt6/q;->e()Lt6/n;

    move-result-object p2

    invoke-static {p1, p2}, Lu6/e;->d(Lt6/n;Lt6/n;)Lt6/n;

    move-result-object v6

    new-instance p1, Lt6/b$c;

    const/16 v9, 0x27

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p3

    invoke-static/range {v0 .. v10}, Lt6/q;->b(Lt6/q;IJJLt6/n;Lt6/r;Ljava/lang/Object;ILjava/lang/Object;)Lt6/q;

    move-result-object p2

    invoke-direct {p1, p2}, Lt6/b$c;-><init>(Lt6/q;)V

    return-object p1

    :cond_0
    new-instance p1, Lt6/b$c;

    invoke-direct {p1, p3}, Lt6/b$c;-><init>(Lt6/q;)V

    return-object p1
.end method

.method public b(Lt6/q;Lt6/o;Lx6/p;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lt6/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lt6/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt6/q;",
            "Lt6/o;",
            "Lx6/p;",
            "Lnt/b<",
            "-",
            "Lt6/b$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance p2, Lt6/b$b;

    invoke-direct {p2, p1}, Lt6/b$b;-><init>(Lt6/q;)V

    return-object p2
.end method
