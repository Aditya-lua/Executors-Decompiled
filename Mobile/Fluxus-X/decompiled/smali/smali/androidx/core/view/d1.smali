.class public final Landroidx/core/view/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/d1$d;,
        Landroidx/core/view/d1$e;,
        Landroidx/core/view/d1$c;,
        Landroidx/core/view/d1$b;,
        Landroidx/core/view/d1$a;
    }
.end annotation


# instance fields
.field public a:Landroidx/core/view/d1$e;


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Landroidx/core/view/d1$d;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/core/view/d1$d;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object v0, p0, Landroidx/core/view/d1;->a:Landroidx/core/view/d1$e;

    return-void

    .line 4
    :cond_0
    new-instance v0, Landroidx/core/view/d1$c;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/core/view/d1$c;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object v0, p0, Landroidx/core/view/d1;->a:Landroidx/core/view/d1$e;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsAnimation;)V
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    .line 5
    invoke-direct {p0, v3, v0, v1, v2}, Landroidx/core/view/d1;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 7
    new-instance v0, Landroidx/core/view/d1$d;

    invoke-direct {v0, p1}, Landroidx/core/view/d1$d;-><init>(Landroid/view/WindowInsetsAnimation;)V

    iput-object v0, p0, Landroidx/core/view/d1;->a:Landroidx/core/view/d1$e;

    :cond_0
    return-void
.end method

.method public static e(Landroid/view/View;Landroidx/core/view/d1$b;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Landroidx/core/view/d1$d;->i(Landroid/view/View;Landroidx/core/view/d1$b;)V

    return-void

    :cond_0
    invoke-static {p0, p1}, Landroidx/core/view/d1$c;->q(Landroid/view/View;Landroidx/core/view/d1$b;)V

    return-void
.end method

.method public static g(Landroid/view/WindowInsetsAnimation;)Landroidx/core/view/d1;
    .locals 1

    new-instance v0, Landroidx/core/view/d1;

    invoke-direct {v0, p0}, Landroidx/core/view/d1;-><init>(Landroid/view/WindowInsetsAnimation;)V

    return-object v0
.end method


# virtual methods
.method public a()F
    .locals 1

    iget-object v0, p0, Landroidx/core/view/d1;->a:Landroidx/core/view/d1$e;

    invoke-virtual {v0}, Landroidx/core/view/d1$e;->a()F

    move-result v0

    return v0
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Landroidx/core/view/d1;->a:Landroidx/core/view/d1$e;

    invoke-virtual {v0}, Landroidx/core/view/d1$e;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c()F
    .locals 1

    iget-object v0, p0, Landroidx/core/view/d1;->a:Landroidx/core/view/d1$e;

    invoke-virtual {v0}, Landroidx/core/view/d1$e;->c()F

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Landroidx/core/view/d1;->a:Landroidx/core/view/d1$e;

    invoke-virtual {v0}, Landroidx/core/view/d1$e;->d()I

    move-result v0

    return v0
.end method

.method public f(F)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/d1;->a:Landroidx/core/view/d1$e;

    invoke-virtual {v0, p1}, Landroidx/core/view/d1$e;->e(F)V

    return-void
.end method
