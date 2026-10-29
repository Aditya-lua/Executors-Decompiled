.class public Lhd/j;
.super Lhd/d;
.source "SourceFile"


# instance fields
.field public a:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lhd/d;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lhd/j;->a:F

    return-void
.end method


# virtual methods
.method public a(Lhd/m;FFF)V
    .locals 7
    .param p1    # Lhd/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    mul-float v0, p4, p3

    const/high16 v1, 0x43340000    # 180.0f

    sub-float v2, v1, p2

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v0, v1, v2}, Lhd/m;->o(FFFF)V

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr p4, v0

    mul-float v3, p4, p3

    const/high16 v5, 0x43340000    # 180.0f

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v4, v3

    move-object v0, p1

    move v6, p2

    invoke-virtual/range {v0 .. v6}, Lhd/m;->a(FFFFFF)V

    return-void
.end method
