.class public Ln7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln7/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln7/o<",
        "Landroid/graphics/PointF;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ln7/b;

.field public final b:Ln7/b;


# direct methods
.method public constructor <init>(Ln7/b;Ln7/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln7/i;->a:Ln7/b;

    iput-object p2, p0, Ln7/i;->b:Ln7/b;

    return-void
.end method


# virtual methods
.method public a()Lj7/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj7/a<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    new-instance v0, Lj7/n;

    iget-object v1, p0, Ln7/i;->a:Ln7/b;

    invoke-virtual {v1}, Ln7/b;->d()Lj7/d;

    move-result-object v1

    iget-object v2, p0, Ln7/i;->b:Ln7/b;

    invoke-virtual {v2}, Ln7/b;->d()Lj7/d;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lj7/n;-><init>(Lj7/a;Lj7/a;)V

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lu7/a<",
            "Landroid/graphics/PointF;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Cannot call getKeyframes on AnimatableSplitDimensionPathValue."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Ln7/i;->a:Ln7/b;

    invoke-virtual {v0}, Ln7/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln7/i;->b:Ln7/b;

    invoke-virtual {v0}, Ln7/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
