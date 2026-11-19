.class public abstract Lke/v;
.super Lke/e;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lke/v$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lke/e<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field public final transient a:Lke/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lke/u<",
            "TK;+",
            "Lke/r<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field public final transient b:I


# direct methods
.method public constructor <init>(Lke/u;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke/u<",
            "TK;+",
            "Lke/r<",
            "TV;>;>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Lke/e;-><init>()V

    iput-object p1, p0, Lke/v;->a:Lke/u;

    iput p2, p0, Lke/v;->b:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/util/Map;
    .locals 1

    invoke-virtual {p0}, Lke/v;->c()Lke/u;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lke/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public c()Lke/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/u<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lke/v;->a:Lke/u;

    return-object v0
.end method

.method public d()Lke/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/y0<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lke/v$a;

    invoke-direct {v0, p0}, Lke/v$a;-><init>(Lke/v;)V

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lke/v;->b:I

    return v0
.end method

.method public bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Lke/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic hashCode()I
    .locals 1

    invoke-super {p0}, Lke/d;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lke/d;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
