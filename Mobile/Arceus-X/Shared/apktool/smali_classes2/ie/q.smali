.class public abstract Lie/q;
.super Lie/u;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lie/q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lie/u<",
        "TK;TV;>;",
        "Ljava/util/Map;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lie/u;-><init>()V

    return-void
.end method

.method public static s()Lie/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lie/q<",
            "TK;TV;>;"
        }
    .end annotation

    sget-object v0, Lie/o0;->j:Lie/o0;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic f()Lie/r;
    .locals 1

    invoke-virtual {p0}, Lie/q;->q()Lie/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p()Lie/r;
    .locals 1

    invoke-virtual {p0}, Lie/q;->t()Lie/w;

    move-result-object v0

    return-object v0
.end method

.method public final q()Lie/w;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/w<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "should never be called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public abstract r()Lie/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/q<",
            "TV;TK;>;"
        }
    .end annotation
.end method

.method public t()Lie/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/w<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lie/q;->r()Lie/q;

    move-result-object v0

    invoke-virtual {v0}, Lie/u;->i()Lie/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic values()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lie/q;->t()Lie/w;

    move-result-object v0

    return-object v0
.end method
