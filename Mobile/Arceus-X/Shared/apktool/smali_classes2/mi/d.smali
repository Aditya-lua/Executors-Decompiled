.class public Lmi/d;
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

    const/4 p1, 0x0

    invoke-super {p0, p1, p2, p3, p4}, Lmi/c;->e(IIII)V

    return-void
.end method

.method public f(Landroidx/core/graphics/Insets;)Landroidx/core/graphics/Insets;
    .locals 1

    const/4 v0, 0x0

    iget p1, p1, Landroidx/core/graphics/Insets;->top:I

    invoke-static {v0, p1, v0, v0}, Landroidx/core/graphics/Insets;->of(IIII)Landroidx/core/graphics/Insets;

    move-result-object p1

    return-object p1
.end method
