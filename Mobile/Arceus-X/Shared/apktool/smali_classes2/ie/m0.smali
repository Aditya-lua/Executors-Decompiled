.class public abstract Lie/m0;
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

.method public static a(Ljava/util/Comparator;)Lie/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lie/m0<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lie/m0;

    if-eqz v0, :cond_0

    check-cast p0, Lie/m0;

    return-object p0

    :cond_0
    new-instance v0, Lie/l;

    invoke-direct {v0, p0}, Lie/l;-><init>(Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static c()Lie/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Ljava/lang/Comparable;",
            ">()",
            "Lie/m0<",
            "TC;>;"
        }
    .end annotation

    sget-object v0, Lie/j0;->a:Lie/j0;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Iterable;)Lie/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:TT;>(",
            "Ljava/lang/Iterable<",
            "TE;>;)",
            "Lie/t<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lie/t;->G(Ljava/util/Comparator;Ljava/lang/Iterable;)Lie/t;

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

.method public d()Lie/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T2:TT;>()",
            "Lie/m0<",
            "Ljava/util/Map$Entry<",
            "TT2;*>;>;"
        }
    .end annotation

    invoke-static {}, Lie/f0;->c()Lhe/f;

    move-result-object v0

    invoke-virtual {p0, v0}, Lie/m0;->e(Lhe/f;)Lie/m0;

    move-result-object v0

    return-object v0
.end method

.method public e(Lhe/f;)Lie/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            ">(",
            "Lhe/f<",
            "TF;+TT;>;)",
            "Lie/m0<",
            "TF;>;"
        }
    .end annotation

    new-instance v0, Lie/f;

    invoke-direct {v0, p1, p0}, Lie/f;-><init>(Lhe/f;Lie/m0;)V

    return-object v0
.end method
