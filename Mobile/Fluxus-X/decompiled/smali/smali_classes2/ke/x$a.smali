.class public final Lke/x$a;
.super Lke/v$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lke/x;
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
        "Lke/v$b<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lke/v$b;-><init>()V

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

    invoke-static {}, Lke/n0;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public c()Lke/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/x<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lke/v$b;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lke/v$b;->b:Ljava/util/Comparator;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lke/m0;->a(Ljava/util/Comparator;)Lke/m0;

    move-result-object v1

    invoke-virtual {v1}, Lke/m0;->d()Lke/m0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lke/m0;->b(Ljava/lang/Iterable;)Lke/t;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lke/v$b;->c:Ljava/util/Comparator;

    invoke-static {v0, v1}, Lke/x;->i(Ljava/util/Collection;Ljava/util/Comparator;)Lke/x;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/Object;Ljava/lang/Iterable;)Lke/x$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/Iterable<",
            "+TV;>;)",
            "Lke/x$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lke/v$b;->b(Ljava/lang/Object;Ljava/lang/Iterable;)Lke/v$b;

    return-object p0
.end method

.method public varargs e(Ljava/lang/Object;[Ljava/lang/Object;)Lke/x$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;[TV;)",
            "Lke/x$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lke/x$a;->d(Ljava/lang/Object;Ljava/lang/Iterable;)Lke/x$a;

    move-result-object p1

    return-object p1
.end method
