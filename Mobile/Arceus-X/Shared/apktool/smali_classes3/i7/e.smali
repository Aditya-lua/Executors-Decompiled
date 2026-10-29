.class public Li7/e;
.super Li7/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li7/g<",
        "Ln7/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Ln7/d;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lt7/a<",
            "Ln7/d;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Li7/g;-><init>(Ljava/util/List;)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt7/a;

    iget-object v2, v2, Lt7/a;->b:Ljava/lang/Object;

    check-cast v2, Ln7/d;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ln7/d;->f()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ln7/d;

    new-array v0, v1, [F

    new-array v1, v1, [I

    invoke-direct {p1, v0, v1}, Ln7/d;-><init>([F[I)V

    iput-object p1, p0, Li7/e;->i:Ln7/d;

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Lt7/a;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li7/e;->r(Lt7/a;F)Ln7/d;

    move-result-object p1

    return-object p1
.end method

.method public r(Lt7/a;F)Ln7/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/a<",
            "Ln7/d;",
            ">;F)",
            "Ln7/d;"
        }
    .end annotation

    iget-object v0, p0, Li7/e;->i:Ln7/d;

    iget-object v1, p1, Lt7/a;->b:Ljava/lang/Object;

    check-cast v1, Ln7/d;

    iget-object p1, p1, Lt7/a;->c:Ljava/lang/Object;

    check-cast p1, Ln7/d;

    invoke-virtual {v0, v1, p1, p2}, Ln7/d;->g(Ln7/d;Ln7/d;F)V

    iget-object p1, p0, Li7/e;->i:Ln7/d;

    return-object p1
.end method
