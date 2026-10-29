.class public Lm0/h0;
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
        "Landroidx/camera/core/d;",
        ">;",
        "Landroidx/camera/core/d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lx0/b0;)Landroidx/camera/core/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/b0<",
            "Landroidx/camera/core/d;",
            ">;)",
            "Landroidx/camera/core/d;"
        }
    .end annotation

    invoke-virtual {p1}, Lx0/b0;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/d;

    invoke-interface {v0}, Landroidx/camera/core/d;->H2()Lg0/i1;

    move-result-object v1

    invoke-interface {v1}, Lg0/i1;->c()Ln0/z3;

    move-result-object v2

    invoke-interface {v0}, Landroidx/camera/core/d;->H2()Lg0/i1;

    move-result-object v1

    invoke-interface {v1}, Lg0/i1;->getTimestamp()J

    move-result-wide v3

    invoke-virtual {p1}, Lx0/b0;->f()I

    move-result v5

    invoke-virtual {p1}, Lx0/b0;->g()Landroid/graphics/Matrix;

    move-result-object v6

    invoke-interface {v0}, Landroidx/camera/core/d;->H2()Lg0/i1;

    move-result-object v1

    invoke-interface {v1}, Lg0/i1;->b()I

    move-result v7

    invoke-static/range {v2 .. v7}, Lg0/o1;->f(Ln0/z3;JILandroid/graphics/Matrix;I)Lg0/i1;

    move-result-object v1

    new-instance v2, Lg0/h2;

    invoke-virtual {p1}, Lx0/b0;->h()Landroid/util/Size;

    move-result-object v3

    invoke-direct {v2, v0, v3, v1}, Lg0/h2;-><init>(Landroidx/camera/core/d;Landroid/util/Size;Lg0/i1;)V

    invoke-virtual {p1}, Lx0/b0;->b()Landroid/graphics/Rect;

    move-result-object p1

    invoke-interface {v2, p1}, Landroidx/camera/core/d;->M0(Landroid/graphics/Rect;)V

    return-object v2
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx0/b0;

    invoke-virtual {p0, p1}, Lm0/h0;->a(Lx0/b0;)Landroidx/camera/core/d;

    move-result-object p1

    return-object p1
.end method
