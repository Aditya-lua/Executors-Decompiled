.class public Ln7/j;
.super Ln7/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln7/p<",
        "Lm7/b;",
        "Lm7/b;",
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
            "Lu7/a<",
            "Lm7/b;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ln7/p;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lj7/a;
    .locals 1

    invoke-virtual {p0}, Ln7/j;->d()Lj7/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/util/List;
    .locals 1

    invoke-super {p0}, Ln7/p;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Z
    .locals 1

    invoke-super {p0}, Ln7/p;->c()Z

    move-result v0

    return v0
.end method

.method public d()Lj7/o;
    .locals 2

    new-instance v0, Lj7/o;

    iget-object v1, p0, Ln7/p;->a:Ljava/util/List;

    invoke-direct {v0, v1}, Lj7/o;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ln7/p;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
