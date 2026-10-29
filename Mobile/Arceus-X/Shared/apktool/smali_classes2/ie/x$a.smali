.class public final Lie/x$a;
.super Lie/v$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lie/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lie/v$b<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lie/v$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    invoke-static {}, Lie/n0;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public c()Lie/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/x<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lie/v$b;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lie/v$b;->b:Ljava/util/Comparator;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lie/m0;->a(Ljava/util/Comparator;)Lie/m0;

    move-result-object v1

    invoke-virtual {v1}, Lie/m0;->d()Lie/m0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lie/m0;->b(Ljava/lang/Iterable;)Lie/t;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lie/v$b;->c:Ljava/util/Comparator;

    invoke-static {v0, v1}, Lie/x;->i(Ljava/util/Collection;Ljava/util/Comparator;)Lie/x;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/Object;Ljava/lang/Iterable;)Lie/x$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/Iterable<",
            "+TV;>;)",
            "Lie/x$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lie/v$b;->b(Ljava/lang/Object;Ljava/lang/Iterable;)Lie/v$b;

    return-object p0
.end method

.method public varargs e(Ljava/lang/Object;[Ljava/lang/Object;)Lie/x$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;[TV;)",
            "Lie/x$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lie/x$a;->d(Ljava/lang/Object;Ljava/lang/Iterable;)Lie/x$a;

    move-result-object p1

    return-object p1
.end method
