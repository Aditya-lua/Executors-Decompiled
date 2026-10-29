.class public Lhd/m$b;
.super Lhd/m$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhd/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final c:Lhd/m$d;


# direct methods
.method public constructor <init>(Lhd/m$d;)V
    .locals 0

    invoke-direct {p0}, Lhd/m$g;-><init>()V

    iput-object p1, p0, Lhd/m$b;->c:Lhd/m$d;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Matrix;Lgd/a;ILandroid/graphics/Canvas;)V
    .locals 8
    .param p2    # Lgd/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lhd/m$b;->c:Lhd/m$d;

    invoke-static {v0}, Lhd/m$d;->h(Lhd/m$d;)F

    move-result v6

    iget-object v0, p0, Lhd/m$b;->c:Lhd/m$d;

    invoke-static {v0}, Lhd/m$d;->i(Lhd/m$d;)F

    move-result v7

    new-instance v4, Landroid/graphics/RectF;

    iget-object v0, p0, Lhd/m$b;->c:Lhd/m$d;

    invoke-static {v0}, Lhd/m$d;->b(Lhd/m$d;)F

    move-result v0

    iget-object v1, p0, Lhd/m$b;->c:Lhd/m$d;

    invoke-static {v1}, Lhd/m$d;->c(Lhd/m$d;)F

    move-result v1

    iget-object v2, p0, Lhd/m$b;->c:Lhd/m$d;

    invoke-static {v2}, Lhd/m$d;->d(Lhd/m$d;)F

    move-result v2

    iget-object v3, p0, Lhd/m$b;->c:Lhd/m$d;

    invoke-static {v3}, Lhd/m$d;->e(Lhd/m$d;)F

    move-result v3

    invoke-direct {v4, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object v3, p1

    move-object v1, p2

    move v5, p3

    move-object v2, p4

    invoke-virtual/range {v1 .. v7}, Lgd/a;->a(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Landroid/graphics/RectF;IFF)V

    return-void
.end method
