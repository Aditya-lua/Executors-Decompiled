.class public Lid/m$b;
.super Lid/m$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lid/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final c:Lid/m$d;


# direct methods
.method public constructor <init>(Lid/m$d;)V
    .locals 0

    invoke-direct {p0}, Lid/m$g;-><init>()V

    iput-object p1, p0, Lid/m$b;->c:Lid/m$d;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Matrix;Lhd/a;ILandroid/graphics/Canvas;)V
    .locals 8
    .param p2    # Lhd/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lid/m$b;->c:Lid/m$d;

    invoke-static {v0}, Lid/m$d;->h(Lid/m$d;)F

    move-result v6

    iget-object v0, p0, Lid/m$b;->c:Lid/m$d;

    invoke-static {v0}, Lid/m$d;->i(Lid/m$d;)F

    move-result v7

    new-instance v4, Landroid/graphics/RectF;

    iget-object v0, p0, Lid/m$b;->c:Lid/m$d;

    invoke-static {v0}, Lid/m$d;->b(Lid/m$d;)F

    move-result v0

    iget-object v1, p0, Lid/m$b;->c:Lid/m$d;

    invoke-static {v1}, Lid/m$d;->c(Lid/m$d;)F

    move-result v1

    iget-object v2, p0, Lid/m$b;->c:Lid/m$d;

    invoke-static {v2}, Lid/m$d;->d(Lid/m$d;)F

    move-result v2

    iget-object v3, p0, Lid/m$b;->c:Lid/m$d;

    invoke-static {v3}, Lid/m$d;->e(Lid/m$d;)F

    move-result v3

    invoke-direct {v4, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object v3, p1

    move-object v1, p2

    move v5, p3

    move-object v2, p4

    invoke-virtual/range {v1 .. v7}, Lhd/a;->a(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Landroid/graphics/RectF;IFF)V

    return-void
.end method
