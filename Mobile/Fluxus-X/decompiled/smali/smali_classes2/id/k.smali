.class public Lid/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lid/k$c;,
        Lid/k$b;
    }
.end annotation


# static fields
.field public static final m:Lid/c;


# instance fields
.field public a:Lid/d;

.field public b:Lid/d;

.field public c:Lid/d;

.field public d:Lid/d;

.field public e:Lid/c;

.field public f:Lid/c;

.field public g:Lid/c;

.field public h:Lid/c;

.field public i:Lid/f;

.field public j:Lid/f;

.field public k:Lid/f;

.field public l:Lid/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lid/i;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {v0, v1}, Lid/i;-><init>(F)V

    sput-object v0, Lid/k;->m:Lid/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    invoke-static {}, Lid/h;->b()Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k;->a:Lid/d;

    .line 17
    invoke-static {}, Lid/h;->b()Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k;->b:Lid/d;

    .line 18
    invoke-static {}, Lid/h;->b()Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k;->c:Lid/d;

    .line 19
    invoke-static {}, Lid/h;->b()Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k;->d:Lid/d;

    .line 20
    new-instance v0, Lid/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k;->e:Lid/c;

    .line 21
    new-instance v0, Lid/a;

    invoke-direct {v0, v1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k;->f:Lid/c;

    .line 22
    new-instance v0, Lid/a;

    invoke-direct {v0, v1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k;->g:Lid/c;

    .line 23
    new-instance v0, Lid/a;

    invoke-direct {v0, v1}, Lid/a;-><init>(F)V

    iput-object v0, p0, Lid/k;->h:Lid/c;

    .line 24
    invoke-static {}, Lid/h;->c()Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k;->i:Lid/f;

    .line 25
    invoke-static {}, Lid/h;->c()Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k;->j:Lid/f;

    .line 26
    invoke-static {}, Lid/h;->c()Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k;->k:Lid/f;

    .line 27
    invoke-static {}, Lid/h;->c()Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k;->l:Lid/f;

    return-void
.end method

.method public constructor <init>(Lid/k$b;)V
    .locals 1
    .param p1    # Lid/k$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lid/k$b;->a(Lid/k$b;)Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k;->a:Lid/d;

    .line 4
    invoke-static {p1}, Lid/k$b;->e(Lid/k$b;)Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k;->b:Lid/d;

    .line 5
    invoke-static {p1}, Lid/k$b;->f(Lid/k$b;)Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k;->c:Lid/d;

    .line 6
    invoke-static {p1}, Lid/k$b;->g(Lid/k$b;)Lid/d;

    move-result-object v0

    iput-object v0, p0, Lid/k;->d:Lid/d;

    .line 7
    invoke-static {p1}, Lid/k$b;->h(Lid/k$b;)Lid/c;

    move-result-object v0

    iput-object v0, p0, Lid/k;->e:Lid/c;

    .line 8
    invoke-static {p1}, Lid/k$b;->i(Lid/k$b;)Lid/c;

    move-result-object v0

    iput-object v0, p0, Lid/k;->f:Lid/c;

    .line 9
    invoke-static {p1}, Lid/k$b;->j(Lid/k$b;)Lid/c;

    move-result-object v0

    iput-object v0, p0, Lid/k;->g:Lid/c;

    .line 10
    invoke-static {p1}, Lid/k$b;->k(Lid/k$b;)Lid/c;

    move-result-object v0

    iput-object v0, p0, Lid/k;->h:Lid/c;

    .line 11
    invoke-static {p1}, Lid/k$b;->l(Lid/k$b;)Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k;->i:Lid/f;

    .line 12
    invoke-static {p1}, Lid/k$b;->b(Lid/k$b;)Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k;->j:Lid/f;

    .line 13
    invoke-static {p1}, Lid/k$b;->c(Lid/k$b;)Lid/f;

    move-result-object v0

    iput-object v0, p0, Lid/k;->k:Lid/f;

    .line 14
    invoke-static {p1}, Lid/k$b;->d(Lid/k$b;)Lid/f;

    move-result-object p1

    iput-object p1, p0, Lid/k;->l:Lid/f;

    return-void
.end method

.method public synthetic constructor <init>(Lid/k$b;Lid/k$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lid/k;-><init>(Lid/k$b;)V

    return-void
.end method

.method public static a()Lid/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lid/k$b;

    invoke-direct {v0}, Lid/k$b;-><init>()V

    return-object v0
.end method

.method public static b(Landroid/content/Context;II)Lid/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lid/k;->c(Landroid/content/Context;III)Lid/k$b;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;III)Lid/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lid/a;

    int-to-float p3, p3

    invoke-direct {v0, p3}, Lid/a;-><init>(F)V

    invoke-static {p0, p1, p2, v0}, Lid/k;->d(Landroid/content/Context;IILid/c;)Lid/k$b;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/content/Context;IILid/c;)Lid/k$b;
    .locals 6
    .param p3    # Lid/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-direct {v0, p0, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    if-eqz p2, :cond_0

    new-instance p0, Landroid/view/ContextThemeWrapper;

    invoke-direct {p0, v0, p2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    move-object v0, p0

    :cond_0
    sget-object p0, Ljc/k;->i5:[I

    invoke-virtual {v0, p0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p0

    :try_start_0
    sget p1, Ljc/k;->j5:I

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    sget p2, Ljc/k;->m5:I

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    sget v0, Ljc/k;->n5:I

    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    sget v1, Ljc/k;->l5:I

    invoke-virtual {p0, v1, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    sget v2, Ljc/k;->k5:I

    invoke-virtual {p0, v2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    sget v2, Ljc/k;->o5:I

    invoke-static {p0, v2, p3}, Lid/k;->m(Landroid/content/res/TypedArray;ILid/c;)Lid/c;

    move-result-object p3

    sget v2, Ljc/k;->r5:I

    invoke-static {p0, v2, p3}, Lid/k;->m(Landroid/content/res/TypedArray;ILid/c;)Lid/c;

    move-result-object v2

    sget v3, Ljc/k;->s5:I

    invoke-static {p0, v3, p3}, Lid/k;->m(Landroid/content/res/TypedArray;ILid/c;)Lid/c;

    move-result-object v3

    sget v4, Ljc/k;->q5:I

    invoke-static {p0, v4, p3}, Lid/k;->m(Landroid/content/res/TypedArray;ILid/c;)Lid/c;

    move-result-object v4

    sget v5, Ljc/k;->p5:I

    invoke-static {p0, v5, p3}, Lid/k;->m(Landroid/content/res/TypedArray;ILid/c;)Lid/c;

    move-result-object p3

    new-instance v5, Lid/k$b;

    invoke-direct {v5}, Lid/k$b;-><init>()V

    invoke-virtual {v5, p2, v2}, Lid/k$b;->y(ILid/c;)Lid/k$b;

    move-result-object p2

    invoke-virtual {p2, v0, v3}, Lid/k$b;->C(ILid/c;)Lid/k$b;

    move-result-object p2

    invoke-virtual {p2, v1, v4}, Lid/k$b;->u(ILid/c;)Lid/k$b;

    move-result-object p2

    invoke-virtual {p2, p1, p3}, Lid/k$b;->q(ILid/c;)Lid/k$b;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public static e(Landroid/content/Context;Landroid/util/AttributeSet;II)Lid/k$b;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Lid/k;->f(Landroid/content/Context;Landroid/util/AttributeSet;III)Lid/k$b;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;Landroid/util/AttributeSet;III)Lid/k$b;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lid/a;

    int-to-float p4, p4

    invoke-direct {v0, p4}, Lid/a;-><init>(F)V

    invoke-static {p0, p1, p2, p3, v0}, Lid/k;->g(Landroid/content/Context;Landroid/util/AttributeSet;IILid/c;)Lid/k$b;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/Context;Landroid/util/AttributeSet;IILid/c;)Lid/k$b;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lid/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Ljc/k;->f4:[I

    invoke-virtual {p0, p1, v0, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Ljc/k;->g4:I

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    sget v0, Ljc/k;->h4:I

    invoke-virtual {p1, v0, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static {p0, p2, p3, p4}, Lid/k;->d(Landroid/content/Context;IILid/c;)Lid/k$b;

    move-result-object p0

    return-object p0
.end method

.method public static m(Landroid/content/res/TypedArray;ILid/c;)Lid/c;
    .locals 2
    .param p2    # Lid/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p1, Landroid/util/TypedValue;->type:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    new-instance p2, Lid/a;

    iget p1, p1, Landroid/util/TypedValue;->data:I

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result p0

    int-to-float p0, p0

    invoke-direct {p2, p0}, Lid/a;-><init>(F)V

    return-object p2

    :cond_1
    const/4 p0, 0x6

    if-ne v0, p0, :cond_2

    new-instance p0, Lid/i;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, p2}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result p1

    invoke-direct {p0, p1}, Lid/i;-><init>(F)V

    return-object p0

    :cond_2
    :goto_0
    return-object p2
.end method


# virtual methods
.method public h()Lid/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lid/k;->k:Lid/f;

    return-object v0
.end method

.method public i()Lid/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lid/k;->d:Lid/d;

    return-object v0
.end method

.method public j()Lid/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lid/k;->h:Lid/c;

    return-object v0
.end method

.method public k()Lid/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lid/k;->c:Lid/d;

    return-object v0
.end method

.method public l()Lid/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lid/k;->g:Lid/c;

    return-object v0
.end method

.method public n()Lid/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lid/k;->l:Lid/f;

    return-object v0
.end method

.method public o()Lid/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lid/k;->j:Lid/f;

    return-object v0
.end method

.method public p()Lid/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lid/k;->i:Lid/f;

    return-object v0
.end method

.method public q()Lid/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lid/k;->a:Lid/d;

    return-object v0
.end method

.method public r()Lid/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lid/k;->e:Lid/c;

    return-object v0
.end method

.method public s()Lid/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lid/k;->b:Lid/d;

    return-object v0
.end method

.method public t()Lid/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lid/k;->f:Lid/c;

    return-object v0
.end method

.method public u(Landroid/graphics/RectF;)Z
    .locals 5
    .param p1    # Landroid/graphics/RectF;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lid/k;->l:Lid/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lid/f;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lid/k;->j:Lid/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lid/k;->i:Lid/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lid/k;->k:Lid/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v1, p0, Lid/k;->e:Lid/c;

    invoke-interface {v1, p1}, Lid/c;->a(Landroid/graphics/RectF;)F

    move-result v1

    iget-object v4, p0, Lid/k;->f:Lid/c;

    invoke-interface {v4, p1}, Lid/c;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, Lid/k;->h:Lid/c;

    invoke-interface {v4, p1}, Lid/c;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, Lid/k;->g:Lid/c;

    invoke-interface {v4, p1}, Lid/c;->a(Landroid/graphics/RectF;)F

    move-result p1

    cmpl-float p1, p1, v1

    if-nez p1, :cond_1

    move p1, v3

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    iget-object v1, p0, Lid/k;->b:Lid/d;

    instance-of v1, v1, Lid/j;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lid/k;->a:Lid/d;

    instance-of v1, v1, Lid/j;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lid/k;->c:Lid/d;

    instance-of v1, v1, Lid/j;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lid/k;->d:Lid/d;

    instance-of v1, v1, Lid/j;

    if-eqz v1, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    if-eqz v1, :cond_3

    return v3

    :cond_3
    return v2
.end method

.method public v()Lid/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lid/k$b;

    invoke-direct {v0, p0}, Lid/k$b;-><init>(Lid/k;)V

    return-object v0
.end method

.method public w(F)Lid/k;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lid/k;->v()Lid/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lid/k$b;->o(F)Lid/k$b;

    move-result-object p1

    invoke-virtual {p1}, Lid/k$b;->m()Lid/k;

    move-result-object p1

    return-object p1
.end method

.method public x(Lid/c;)Lid/k;
    .locals 1
    .param p1    # Lid/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lid/k;->v()Lid/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lid/k$b;->p(Lid/c;)Lid/k$b;

    move-result-object p1

    invoke-virtual {p1}, Lid/k$b;->m()Lid/k;

    move-result-object p1

    return-object p1
.end method

.method public y(Lid/k$c;)Lid/k;
    .locals 2
    .param p1    # Lid/k$c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lid/k;->v()Lid/k$b;

    move-result-object v0

    invoke-virtual {p0}, Lid/k;->r()Lid/c;

    move-result-object v1

    invoke-interface {p1, v1}, Lid/k$c;->a(Lid/c;)Lid/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lid/k$b;->B(Lid/c;)Lid/k$b;

    move-result-object v0

    invoke-virtual {p0}, Lid/k;->t()Lid/c;

    move-result-object v1

    invoke-interface {p1, v1}, Lid/k$c;->a(Lid/c;)Lid/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lid/k$b;->F(Lid/c;)Lid/k$b;

    move-result-object v0

    invoke-virtual {p0}, Lid/k;->j()Lid/c;

    move-result-object v1

    invoke-interface {p1, v1}, Lid/k$c;->a(Lid/c;)Lid/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lid/k$b;->t(Lid/c;)Lid/k$b;

    move-result-object v0

    invoke-virtual {p0}, Lid/k;->l()Lid/c;

    move-result-object v1

    invoke-interface {p1, v1}, Lid/k$c;->a(Lid/c;)Lid/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lid/k$b;->x(Lid/c;)Lid/k$b;

    move-result-object p1

    invoke-virtual {p1}, Lid/k$b;->m()Lid/k;

    move-result-object p1

    return-object p1
.end method
