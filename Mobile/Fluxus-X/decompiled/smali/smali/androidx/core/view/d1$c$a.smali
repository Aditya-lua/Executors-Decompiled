.class public Landroidx/core/view/d1$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/d1$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroidx/core/view/d1$b;

.field public b:Landroidx/core/view/WindowInsetsCompat;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroidx/core/view/d1$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/core/view/d1$c$a;->a:Landroidx/core/view/d1$b;

    invoke-static {p1}, Landroidx/core/view/o0;->F(Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p2, Landroidx/core/view/WindowInsetsCompat$Builder;

    invoke-direct {p2, p1}, Landroidx/core/view/WindowInsetsCompat$Builder;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    invoke-virtual {p2}, Landroidx/core/view/WindowInsetsCompat$Builder;->build()Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Landroidx/core/view/d1$c$a;->b:Landroidx/core/view/WindowInsetsCompat;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 12

    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2, p1}, Landroidx/core/view/WindowInsetsCompat;->toWindowInsetsCompat(Landroid/view/WindowInsets;Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/view/d1$c$a;->b:Landroidx/core/view/WindowInsetsCompat;

    invoke-static {p1, p2}, Landroidx/core/view/d1$c;->n(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2, p1}, Landroidx/core/view/WindowInsetsCompat;->toWindowInsetsCompat(Landroid/view/WindowInsets;Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v3

    iget-object v0, p0, Landroidx/core/view/d1$c$a;->b:Landroidx/core/view/WindowInsetsCompat;

    if-nez v0, :cond_1

    invoke-static {p1}, Landroidx/core/view/o0;->F(Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/view/d1$c$a;->b:Landroidx/core/view/WindowInsetsCompat;

    :cond_1
    iget-object v0, p0, Landroidx/core/view/d1$c$a;->b:Landroidx/core/view/WindowInsetsCompat;

    if-nez v0, :cond_2

    iput-object v3, p0, Landroidx/core/view/d1$c$a;->b:Landroidx/core/view/WindowInsetsCompat;

    invoke-static {p1, p2}, Landroidx/core/view/d1$c;->n(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {p1}, Landroidx/core/view/d1$c;->o(Landroid/view/View;)Landroidx/core/view/d1$b;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, v0, Landroidx/core/view/d1$b;->a:Landroidx/core/view/WindowInsetsCompat;

    invoke-static {v0, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1, p2}, Landroidx/core/view/d1$c;->n(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 v0, 0x1

    new-array v1, v0, [I

    new-array v0, v0, [I

    iget-object v2, p0, Landroidx/core/view/d1$c$a;->b:Landroidx/core/view/WindowInsetsCompat;

    invoke-static {v3, v2, v1, v0}, Landroidx/core/view/d1$c;->f(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat;[I[I)V

    const/4 v2, 0x0

    aget v1, v1, v2

    aget v0, v0, v2

    or-int v5, v1, v0

    if-nez v5, :cond_4

    iput-object v3, p0, Landroidx/core/view/d1$c$a;->b:Landroidx/core/view/WindowInsetsCompat;

    invoke-static {p1, p2}, Landroidx/core/view/d1$c;->n(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object v4, p0, Landroidx/core/view/d1$c$a;->b:Landroidx/core/view/WindowInsetsCompat;

    invoke-static {v1, v0}, Landroidx/core/view/d1$c;->h(II)Landroid/view/animation/Interpolator;

    move-result-object v0

    new-instance v9, Landroidx/core/view/d1;

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    move-result v1

    and-int/2addr v1, v5

    if-eqz v1, :cond_5

    const-wide/16 v6, 0xa0

    goto :goto_0

    :cond_5
    const-wide/16 v6, 0xfa

    :goto_0
    invoke-direct {v9, v5, v0, v6, v7}, Landroidx/core/view/d1;-><init>(ILandroid/view/animation/Interpolator;J)V

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroidx/core/view/d1;->f(F)V

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v9}, Landroidx/core/view/d1;->b()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v11

    invoke-static {v3, v4, v5}, Landroidx/core/view/d1$c;->g(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat;I)Landroidx/core/view/d1$a;

    move-result-object v10

    invoke-static {p1, v9, v3, v2}, Landroidx/core/view/d1$c;->k(Landroid/view/View;Landroidx/core/view/d1;Landroidx/core/view/WindowInsetsCompat;Z)V

    new-instance v0, Landroidx/core/view/d1$c$a$a;

    move-object v1, p0

    move-object v6, p1

    move-object v2, v9

    invoke-direct/range {v0 .. v6}, Landroidx/core/view/d1$c$a$a;-><init>(Landroidx/core/view/d1$c$a;Landroidx/core/view/d1;Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat;ILandroid/view/View;)V

    invoke-virtual {v11, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p1, Landroidx/core/view/d1$c$a$b;

    invoke-direct {p1, p0, v2, v6}, Landroidx/core/view/d1$c$a$b;-><init>(Landroidx/core/view/d1$c$a;Landroidx/core/view/d1;Landroid/view/View;)V

    invoke-virtual {v11, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    move-object v8, v6

    new-instance v6, Landroidx/core/view/d1$c$a$c;

    move-object v7, v1

    invoke-direct/range {v6 .. v11}, Landroidx/core/view/d1$c$a$c;-><init>(Landroidx/core/view/d1$c$a;Landroid/view/View;Landroidx/core/view/d1;Landroidx/core/view/d1$a;Landroid/animation/ValueAnimator;)V

    move-object p1, v6

    move-object v6, v8

    invoke-static {v6, p1}, Landroidx/core/view/b0;->a(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/b0;

    iput-object v3, v1, Landroidx/core/view/d1$c$a;->b:Landroidx/core/view/WindowInsetsCompat;

    invoke-static {v6, p2}, Landroidx/core/view/d1$c;->n(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
