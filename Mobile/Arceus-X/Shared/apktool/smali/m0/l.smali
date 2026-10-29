.class public Lm0/l;
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
        "Landroid/graphics/Bitmap;",
        ">;",
        "Lx0/b0<",
        "Landroid/graphics/Bitmap;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Lx0/y;


# direct methods
.method public constructor <init>(Lx0/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/l;->a:Lx0/y;

    return-void
.end method


# virtual methods
.method public a(Lx0/b0;)Lx0/b0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/b0<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lx0/b0<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm0/l;->a:Lx0/y;

    new-instance v1, Lx0/v;

    new-instance v2, Lm0/z0;

    invoke-direct {v2, p1}, Lm0/z0;-><init>(Lx0/b0;)V

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lx0/v;-><init>(Landroidx/camera/core/d;I)V

    invoke-virtual {v0, v1}, Lx0/y;->c(Lg0/l1$a;)Lg0/l1$b;

    move-result-object v0

    invoke-interface {v0}, Lg0/l1$b;->a()Landroidx/camera/core/d;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/camera/core/d;

    invoke-interface {v1}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v1

    invoke-interface {v0}, Landroidx/camera/core/d;->getWidth()I

    move-result v2

    invoke-interface {v0}, Landroidx/camera/core/d;->getHeight()I

    move-result v0

    invoke-static {v1, v2, v0}, Lw0/b;->d([Landroidx/camera/core/d$a;II)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {p1}, Lx0/b0;->d()Lp0/g;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lx0/b0;->b()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {p1}, Lx0/b0;->f()I

    move-result v6

    invoke-virtual {p1}, Lx0/b0;->g()Landroid/graphics/Matrix;

    move-result-object v7

    invoke-virtual {p1}, Lx0/b0;->a()Ln0/e0;

    move-result-object v8

    invoke-static/range {v3 .. v8}, Lx0/b0;->j(Landroid/graphics/Bitmap;Lp0/g;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)Lx0/b0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx0/b0;

    invoke-virtual {p0, p1}, Lm0/l;->a(Lx0/b0;)Lx0/b0;

    move-result-object p1

    return-object p1
.end method
