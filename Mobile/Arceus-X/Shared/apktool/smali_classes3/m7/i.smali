.class public Lm7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm7/o<",
        "Landroid/graphics/PointF;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lm7/b;

.field public final b:Lm7/b;


# direct methods
.method public constructor <init>(Lm7/b;Lm7/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/i;->a:Lm7/b;

    iput-object p2, p0, Lm7/i;->b:Lm7/b;

    return-void
.end method


# virtual methods
.method public a()Li7/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/a<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    new-instance v0, Li7/n;

    iget-object v1, p0, Lm7/i;->a:Lm7/b;

    invoke-virtual {v1}, Lm7/b;->d()Li7/d;

    move-result-object v1

    iget-object v2, p0, Lm7/i;->b:Lm7/b;

    invoke-virtual {v2}, Lm7/b;->d()Li7/d;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Li7/n;-><init>(Li7/a;Li7/a;)V

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lt7/a<",
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

    iget-object v0, p0, Lm7/i;->a:Lm7/b;

    invoke-virtual {v0}, Lm7/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm7/i;->b:Lm7/b;

    invoke-virtual {v0}, Lm7/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
