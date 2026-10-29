.class public Lm0/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx0/a0<",
        "Lx0/b0<",
        "[B>;",
        "Lx0/b0<",
        "Landroidx/camera/core/d;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lx0/b0;)Lx0/b0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/b0<",
            "[B>;)",
            "Lx0/b0<",
            "Landroidx/camera/core/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/camera/core/f;

    invoke-virtual {p1}, Lx0/b0;->h()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Lx0/b0;->h()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    const/16 v3, 0x100

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lg0/n1;->a(IIII)Ln0/j2;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/camera/core/f;-><init>(Ln0/j2;)V

    invoke-virtual {p1}, Lx0/b0;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-static {v0, v1}, Landroidx/camera/core/ImageProcessingUtil;->e(Ln0/j2;[B)Landroidx/camera/core/d;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/camera/core/f;->j()V

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Landroidx/camera/core/d;

    invoke-virtual {p1}, Lx0/b0;->d()Lp0/g;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lx0/b0;->b()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {p1}, Lx0/b0;->f()I

    move-result v5

    invoke-virtual {p1}, Lx0/b0;->g()Landroid/graphics/Matrix;

    move-result-object v6

    invoke-virtual {p1}, Lx0/b0;->a()Ln0/e0;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lx0/b0;->k(Landroidx/camera/core/d;Lp0/g;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)Lx0/b0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx0/b0;

    invoke-virtual {p0, p1}, Lm0/g0;->a(Lx0/b0;)Lx0/b0;

    move-result-object p1

    return-object p1
.end method
