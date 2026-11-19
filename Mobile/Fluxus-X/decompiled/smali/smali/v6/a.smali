.class public final Lv6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ2\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lv6/a;",
        "Lu6/b;",
        "<init>",
        "()V",
        "Lu6/q;",
        "cacheResponse",
        "Lu6/o;",
        "networkRequest",
        "Ly6/p;",
        "options",
        "Lu6/b$b;",
        "a",
        "(Lu6/q;Lu6/o;Ly6/p;Leu/b;)Ljava/lang/Object;",
        "networkResponse",
        "Lu6/b$c;",
        "b",
        "(Lu6/q;Lu6/o;Lu6/q;Ly6/p;Leu/b;)Ljava/lang/Object;",
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
.method public a(Lu6/q;Lu6/o;Ly6/p;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lu6/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lu6/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ly6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu6/q;",
            "Lu6/o;",
            "Ly6/p;",
            "Leu/b<",
            "-",
            "Lu6/b$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance p2, Lu6/b$b;

    invoke-direct {p2, p1}, Lu6/b$b;-><init>(Lu6/q;)V

    return-object p2
.end method

.method public b(Lu6/q;Lu6/o;Lu6/q;Ly6/p;Leu/b;)Ljava/lang/Object;
    .locals 11
    .param p1    # Lu6/q;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lu6/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lu6/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ly6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu6/q;",
            "Lu6/o;",
            "Lu6/q;",
            "Ly6/p;",
            "Leu/b<",
            "-",
            "Lu6/b$c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p3}, Lu6/q;->d()I

    move-result p2

    const/16 v0, 0x130

    if-ne p2, v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lu6/q;->e()Lu6/n;

    move-result-object p1

    invoke-virtual {p3}, Lu6/q;->e()Lu6/n;

    move-result-object p2

    invoke-static {p1, p2}, Lv6/e;->d(Lu6/n;Lu6/n;)Lu6/n;

    move-result-object v6

    new-instance p1, Lu6/b$c;

    const/16 v9, 0x27

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p3

    invoke-static/range {v0 .. v10}, Lu6/q;->b(Lu6/q;IJJLu6/n;Lu6/r;Ljava/lang/Object;ILjava/lang/Object;)Lu6/q;

    move-result-object p2

    invoke-direct {p1, p2}, Lu6/b$c;-><init>(Lu6/q;)V

    return-object p1

    :cond_0
    new-instance p1, Lu6/b$c;

    invoke-direct {p1, p3}, Lu6/b$c;-><init>(Lu6/q;)V

    return-object p1
.end method
