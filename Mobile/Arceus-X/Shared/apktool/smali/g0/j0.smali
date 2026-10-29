.class public final Lg0/j0;
.super Lg0/v1;
.source "SourceFile"


# instance fields
.field public final b:F

.field public final c:F

.field public final d:Landroid/view/Display;

.field public final e:Lg0/t;


# direct methods
.method public constructor <init>(Landroid/view/Display;Lg0/t;FF)V
    .locals 0

    invoke-direct {p0}, Lg0/v1;-><init>()V

    iput p3, p0, Lg0/j0;->b:F

    iput p4, p0, Lg0/j0;->c:F

    iput-object p1, p0, Lg0/j0;->d:Landroid/view/Display;

    iput-object p2, p0, Lg0/j0;->e:Lg0/t;

    return-void
.end method


# virtual methods
.method public a(FF)Landroid/graphics/PointF;
    .locals 7

    iget v0, p0, Lg0/j0;->b:F

    iget v1, p0, Lg0/j0;->c:F

    iget-object v2, p0, Lg0/j0;->e:Lg0/t;

    invoke-interface {v2}, Lg0/t;->i()I

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0, v2}, Lg0/j0;->f(Z)I

    move-result v3

    const/16 v4, 0x10e

    const/16 v5, 0x5a

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    goto :goto_1

    :cond_1
    move v6, p2

    move p2, p1

    move p1, v6

    move v6, v1

    move v1, v0

    move v0, v6

    :cond_2
    :goto_1
    if-eq v3, v5, :cond_5

    const/16 v5, 0xb4

    if-eq v3, v5, :cond_4

    if-eq v3, v4, :cond_3

    goto :goto_2

    :cond_3
    sub-float p2, v1, p2

    goto :goto_2

    :cond_4
    sub-float p2, v1, p2

    :cond_5
    sub-float p1, v0, p1

    :goto_2
    if-eqz v2, :cond_6

    sub-float p2, v1, p2

    :cond_6
    div-float/2addr p2, v1

    div-float/2addr p1, v0

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, p2, p1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method public final f(Z)I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lg0/j0;->d:Landroid/view/Display;

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iget-object v1, p0, Lg0/j0;->e:Lg0/t;

    invoke-interface {v1, v0}, Lg0/t;->w(I)I

    move-result v0

    if-eqz p1, :cond_0

    rsub-int p1, v0, 0x168

    rem-int/lit16 p1, p1, 0x168
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :cond_0
    return v0

    :catch_0
    const/4 p1, 0x0

    return p1
.end method
