.class public abstract Lke/q;
.super Lke/u;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lke/q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lke/u<",
        "TK;TV;>;",
        "Ljava/util/Map;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lke/u;-><init>()V

    return-void
.end method

.method public static s()Lke/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lke/q<",
            "TK;TV;>;"
        }
    .end annotation

    sget-object v0, Lke/o0;->j:Lke/o0;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic f()Lke/r;
    .locals 1

    invoke-virtual {p0}, Lke/q;->p()Lke/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o()Lke/r;
    .locals 1

    invoke-virtual {p0}, Lke/q;->t()Lke/w;

    move-result-object v0

    return-object v0
.end method

.method public final p()Lke/w;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/w<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "should never be called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public abstract r()Lke/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/q<",
            "TV;TK;>;"
        }
    .end annotation
.end method

.method public t()Lke/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/w<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lke/q;->r()Lke/q;

    move-result-object v0

    invoke-virtual {v0}, Lke/u;->h()Lke/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic values()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lke/q;->t()Lke/w;

    move-result-object v0

    return-object v0
.end method
