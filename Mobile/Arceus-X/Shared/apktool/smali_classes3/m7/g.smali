.class public Lm7/g;
.super Lm7/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lm7/p<",
        "Lt7/d;",
        "Lt7/d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lt7/a<",
            "Lt7/d;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lm7/p;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public a()Li7/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/a<",
            "Lt7/d;",
            "Lt7/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Li7/l;

    iget-object v1, p0, Lm7/p;->a:Ljava/util/List;

    invoke-direct {v0, v1}, Li7/l;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/util/List;
    .locals 1

    invoke-super {p0}, Lm7/p;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Z
    .locals 1

    invoke-super {p0}, Lm7/p;->c()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lm7/p;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
