.class public Lmi/e;
.super Lmi/c;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lmi/c;-><init>()V

    return-void
.end method


# virtual methods
.method public e(IIII)V
    .locals 0

    const/4 p2, 0x0

    invoke-super {p0, p1, p2, p2, p2}, Lmi/c;->e(IIII)V

    return-void
.end method

.method public f(Landroidx/core/graphics/Insets;)Landroidx/core/graphics/Insets;
    .locals 3

    iget v0, p1, Landroidx/core/graphics/Insets;->left:I

    iget v1, p1, Landroidx/core/graphics/Insets;->right:I

    iget p1, p1, Landroidx/core/graphics/Insets;->bottom:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, p1}, Landroidx/core/graphics/Insets;->of(IIII)Landroidx/core/graphics/Insets;

    move-result-object p1

    return-object p1
.end method
