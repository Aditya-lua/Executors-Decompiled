.class public abstract Lke/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Comparator;)Lke/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lke/m0<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lke/m0;

    if-eqz v0, :cond_0

    check-cast p0, Lke/m0;

    return-object p0

    :cond_0
    new-instance v0, Lke/l;

    invoke-direct {v0, p0}, Lke/l;-><init>(Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static c()Lke/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Ljava/lang/Comparable;",
            ">()",
            "Lke/m0<",
            "TC;>;"
        }
    .end annotation

    sget-object v0, Lke/j0;->a:Lke/j0;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Iterable;)Lke/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:TT;>(",
            "Ljava/lang/Iterable<",
            "TE;>;)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lke/t;->G(Ljava/util/Comparator;Ljava/lang/Iterable;)Lke/t;

    move-result-object p1

    return-object p1
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation
.end method

.method public d()Lke/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T2:TT;>()",
            "Lke/m0<",
            "Ljava/util/Map$Entry<",
            "TT2;*>;>;"
        }
    .end annotation

    invoke-static {}, Lke/f0;->c()Lje/f;

    move-result-object v0

    invoke-virtual {p0, v0}, Lke/m0;->e(Lje/f;)Lke/m0;

    move-result-object v0

    return-object v0
.end method

.method public e(Lje/f;)Lke/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            ">(",
            "Lje/f<",
            "TF;+TT;>;)",
            "Lke/m0<",
            "TF;>;"
        }
    .end annotation

    new-instance v0, Lke/f;

    invoke-direct {v0, p1, p0}, Lke/f;-><init>(Lje/f;Lke/m0;)V

    return-object v0
.end method
