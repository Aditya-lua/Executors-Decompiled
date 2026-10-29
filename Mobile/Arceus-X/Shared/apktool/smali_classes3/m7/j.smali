.class public Lm7/j;
.super Lm7/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lm7/p<",
        "Ll7/b;",
        "Ll7/b;",
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
            "Ll7/b;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lm7/p;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Li7/a;
    .locals 1

    invoke-virtual {p0}, Lm7/j;->d()Li7/o;

    move-result-object v0

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

.method public d()Li7/o;
    .locals 2

    new-instance v0, Li7/o;

    iget-object v1, p0, Lm7/p;->a:Ljava/util/List;

    invoke-direct {v0, v1}, Li7/o;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lm7/p;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
