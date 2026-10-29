.class public Lhd/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhd/k$c;,
        Lhd/k$b;
    }
.end annotation


# static fields
.field public static final m:Lhd/c;


# instance fields
.field public a:Lhd/d;

.field public b:Lhd/d;

.field public c:Lhd/d;

.field public d:Lhd/d;

.field public e:Lhd/c;

.field public f:Lhd/c;

.field public g:Lhd/c;

.field public h:Lhd/c;

.field public i:Lhd/f;

.field public j:Lhd/f;

.field public k:Lhd/f;

.field public l:Lhd/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhd/i;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {v0, v1}, Lhd/i;-><init>(F)V

    sput-object v0, Lhd/k;->m:Lhd/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    invoke-static {}, Lhd/h;->b()Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->a:Lhd/d;

    .line 17
    invoke-static {}, Lhd/h;->b()Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->b:Lhd/d;

    .line 18
    invoke-static {}, Lhd/h;->b()Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->c:Lhd/d;

    .line 19
    invoke-static {}, Lhd/h;->b()Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->d:Lhd/d;

    .line 20
    new-instance v0, Lhd/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k;->e:Lhd/c;

    .line 21
    new-instance v0, Lhd/a;

    invoke-direct {v0, v1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k;->f:Lhd/c;

    .line 22
    new-instance v0, Lhd/a;

    invoke-direct {v0, v1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k;->g:Lhd/c;

    .line 23
    new-instance v0, Lhd/a;

    invoke-direct {v0, v1}, Lhd/a;-><init>(F)V

    iput-object v0, p0, Lhd/k;->h:Lhd/c;

    .line 24
    invoke-static {}, Lhd/h;->c()Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->i:Lhd/f;

    .line 25
    invoke-static {}, Lhd/h;->c()Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->j:Lhd/f;

    .line 26
    invoke-static {}, Lhd/h;->c()Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->k:Lhd/f;

    .line 27
    invoke-static {}, Lhd/h;->c()Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->l:Lhd/f;

    return-void
.end method

.method public constructor <init>(Lhd/k$b;)V
    .locals 1
    .param p1    # Lhd/k$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lhd/k$b;->a(Lhd/k$b;)Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->a:Lhd/d;

    .line 4
    invoke-static {p1}, Lhd/k$b;->e(Lhd/k$b;)Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->b:Lhd/d;

    .line 5
    invoke-static {p1}, Lhd/k$b;->f(Lhd/k$b;)Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->c:Lhd/d;

    .line 6
    invoke-static {p1}, Lhd/k$b;->g(Lhd/k$b;)Lhd/d;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->d:Lhd/d;

    .line 7
    invoke-static {p1}, Lhd/k$b;->h(Lhd/k$b;)Lhd/c;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->e:Lhd/c;

    .line 8
    invoke-static {p1}, Lhd/k$b;->i(Lhd/k$b;)Lhd/c;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->f:Lhd/c;

    .line 9
    invoke-static {p1}, Lhd/k$b;->j(Lhd/k$b;)Lhd/c;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->g:Lhd/c;

    .line 10
    invoke-static {p1}, Lhd/k$b;->k(Lhd/k$b;)Lhd/c;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->h:Lhd/c;

    .line 11
    invoke-static {p1}, Lhd/k$b;->l(Lhd/k$b;)Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->i:Lhd/f;

    .line 12
    invoke-static {p1}, Lhd/k$b;->b(Lhd/k$b;)Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->j:Lhd/f;

    .line 13
    invoke-static {p1}, Lhd/k$b;->c(Lhd/k$b;)Lhd/f;

    move-result-object v0

    iput-object v0, p0, Lhd/k;->k:Lhd/f;

    .line 14
    invoke-static {p1}, Lhd/k$b;->d(Lhd/k$b;)Lhd/f;

    move-result-object p1

    iput-object p1, p0, Lhd/k;->l:Lhd/f;

    return-void
.end method

.method public synthetic constructor <init>(Lhd/k$b;Lhd/k$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhd/k;-><init>(Lhd/k$b;)V

    return-void
.end method

.method public static a()Lhd/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lhd/k$b;

    invoke-direct {v0}, Lhd/k$b;-><init>()V

    return-object v0
.end method

.method public static b(Landroid/content/Context;II)Lhd/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lhd/k;->c(Landroid/content/Context;III)Lhd/k$b;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;III)Lhd/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lhd/a;

    int-to-float p3, p3

    invoke-direct {v0, p3}, Lhd/a;-><init>(F)V

    invoke-static {p0, p1, p2, v0}, Lhd/k;->d(Landroid/content/Context;IILhd/c;)Lhd/k$b;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/content/Context;IILhd/c;)Lhd/k$b;
    .locals 6
    .param p3    # Lhd/c;
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
    sget-object p0, Lic/k;->i5:[I

    invoke-virtual {v0, p0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p0

    :try_start_0
    sget p1, Lic/k;->j5:I

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    sget p2, Lic/k;->m5:I

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    sget v0, Lic/k;->n5:I

    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    sget v1, Lic/k;->l5:I

    invoke-virtual {p0, v1, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    sget v2, Lic/k;->k5:I

    invoke-virtual {p0, v2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    sget v2, Lic/k;->o5:I

    invoke-static {p0, v2, p3}, Lhd/k;->m(Landroid/content/res/TypedArray;ILhd/c;)Lhd/c;

    move-result-object p3

    sget v2, Lic/k;->r5:I

    invoke-static {p0, v2, p3}, Lhd/k;->m(Landroid/content/res/TypedArray;ILhd/c;)Lhd/c;

    move-result-object v2

    sget v3, Lic/k;->s5:I

    invoke-static {p0, v3, p3}, Lhd/k;->m(Landroid/content/res/TypedArray;ILhd/c;)Lhd/c;

    move-result-object v3

    sget v4, Lic/k;->q5:I

    invoke-static {p0, v4, p3}, Lhd/k;->m(Landroid/content/res/TypedArray;ILhd/c;)Lhd/c;

    move-result-object v4

    sget v5, Lic/k;->p5:I

    invoke-static {p0, v5, p3}, Lhd/k;->m(Landroid/content/res/TypedArray;ILhd/c;)Lhd/c;

    move-result-object p3

    new-instance v5, Lhd/k$b;

    invoke-direct {v5}, Lhd/k$b;-><init>()V

    invoke-virtual {v5, p2, v2}, Lhd/k$b;->y(ILhd/c;)Lhd/k$b;

    move-result-object p2

    invoke-virtual {p2, v0, v3}, Lhd/k$b;->C(ILhd/c;)Lhd/k$b;

    move-result-object p2

    invoke-virtual {p2, v1, v4}, Lhd/k$b;->u(ILhd/c;)Lhd/k$b;

    move-result-object p2

    invoke-virtual {p2, p1, p3}, Lhd/k$b;->q(ILhd/c;)Lhd/k$b;

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

.method public static e(Landroid/content/Context;Landroid/util/AttributeSet;II)Lhd/k$b;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Lhd/k;->f(Landroid/content/Context;Landroid/util/AttributeSet;III)Lhd/k$b;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;Landroid/util/AttributeSet;III)Lhd/k$b;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lhd/a;

    int-to-float p4, p4

    invoke-direct {v0, p4}, Lhd/a;-><init>(F)V

    invoke-static {p0, p1, p2, p3, v0}, Lhd/k;->g(Landroid/content/Context;Landroid/util/AttributeSet;IILhd/c;)Lhd/k$b;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/Context;Landroid/util/AttributeSet;IILhd/c;)Lhd/k$b;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lhd/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lic/k;->f4:[I

    invoke-virtual {p0, p1, v0, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lic/k;->g4:I

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    sget v0, Lic/k;->h4:I

    invoke-virtual {p1, v0, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static {p0, p2, p3, p4}, Lhd/k;->d(Landroid/content/Context;IILhd/c;)Lhd/k$b;

    move-result-object p0

    return-object p0
.end method

.method public static m(Landroid/content/res/TypedArray;ILhd/c;)Lhd/c;
    .locals 2
    .param p2    # Lhd/c;
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

    new-instance p2, Lhd/a;

    iget p1, p1, Landroid/util/TypedValue;->data:I

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result p0

    int-to-float p0, p0

    invoke-direct {p2, p0}, Lhd/a;-><init>(F)V

    return-object p2

    :cond_1
    const/4 p0, 0x6

    if-ne v0, p0, :cond_2

    new-instance p0, Lhd/i;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, p2}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result p1

    invoke-direct {p0, p1}, Lhd/i;-><init>(F)V

    return-object p0

    :cond_2
    :goto_0
    return-object p2
.end method


# virtual methods
.method public h()Lhd/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lhd/k;->k:Lhd/f;

    return-object v0
.end method

.method public i()Lhd/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lhd/k;->d:Lhd/d;

    return-object v0
.end method

.method public j()Lhd/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lhd/k;->h:Lhd/c;

    return-object v0
.end method

.method public k()Lhd/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lhd/k;->c:Lhd/d;

    return-object v0
.end method

.method public l()Lhd/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lhd/k;->g:Lhd/c;

    return-object v0
.end method

.method public n()Lhd/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lhd/k;->l:Lhd/f;

    return-object v0
.end method

.method public o()Lhd/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lhd/k;->j:Lhd/f;

    return-object v0
.end method

.method public p()Lhd/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lhd/k;->i:Lhd/f;

    return-object v0
.end method

.method public q()Lhd/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lhd/k;->a:Lhd/d;

    return-object v0
.end method

.method public r()Lhd/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lhd/k;->e:Lhd/c;

    return-object v0
.end method

.method public s()Lhd/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lhd/k;->b:Lhd/d;

    return-object v0
.end method

.method public t()Lhd/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lhd/k;->f:Lhd/c;

    return-object v0
.end method

.method public u(Landroid/graphics/RectF;)Z
    .locals 5
    .param p1    # Landroid/graphics/RectF;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lhd/k;->l:Lhd/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lhd/f;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhd/k;->j:Lhd/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhd/k;->i:Lhd/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhd/k;->k:Lhd/f;

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
    iget-object v1, p0, Lhd/k;->e:Lhd/c;

    invoke-interface {v1, p1}, Lhd/c;->a(Landroid/graphics/RectF;)F

    move-result v1

    iget-object v4, p0, Lhd/k;->f:Lhd/c;

    invoke-interface {v4, p1}, Lhd/c;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, Lhd/k;->h:Lhd/c;

    invoke-interface {v4, p1}, Lhd/c;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, Lhd/k;->g:Lhd/c;

    invoke-interface {v4, p1}, Lhd/c;->a(Landroid/graphics/RectF;)F

    move-result p1

    cmpl-float p1, p1, v1

    if-nez p1, :cond_1

    move p1, v3

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    iget-object v1, p0, Lhd/k;->b:Lhd/d;

    instance-of v1, v1, Lhd/j;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lhd/k;->a:Lhd/d;

    instance-of v1, v1, Lhd/j;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lhd/k;->c:Lhd/d;

    instance-of v1, v1, Lhd/j;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lhd/k;->d:Lhd/d;

    instance-of v1, v1, Lhd/j;

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

.method public v()Lhd/k$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lhd/k$b;

    invoke-direct {v0, p0}, Lhd/k$b;-><init>(Lhd/k;)V

    return-object v0
.end method

.method public w(F)Lhd/k;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lhd/k;->v()Lhd/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhd/k$b;->o(F)Lhd/k$b;

    move-result-object p1

    invoke-virtual {p1}, Lhd/k$b;->m()Lhd/k;

    move-result-object p1

    return-object p1
.end method

.method public x(Lhd/c;)Lhd/k;
    .locals 1
    .param p1    # Lhd/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lhd/k;->v()Lhd/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhd/k$b;->p(Lhd/c;)Lhd/k$b;

    move-result-object p1

    invoke-virtual {p1}, Lhd/k$b;->m()Lhd/k;

    move-result-object p1

    return-object p1
.end method

.method public y(Lhd/k$c;)Lhd/k;
    .locals 2
    .param p1    # Lhd/k$c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lhd/k;->v()Lhd/k$b;

    move-result-object v0

    invoke-virtual {p0}, Lhd/k;->r()Lhd/c;

    move-result-object v1

    invoke-interface {p1, v1}, Lhd/k$c;->a(Lhd/c;)Lhd/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhd/k$b;->B(Lhd/c;)Lhd/k$b;

    move-result-object v0

    invoke-virtual {p0}, Lhd/k;->t()Lhd/c;

    move-result-object v1

    invoke-interface {p1, v1}, Lhd/k$c;->a(Lhd/c;)Lhd/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhd/k$b;->F(Lhd/c;)Lhd/k$b;

    move-result-object v0

    invoke-virtual {p0}, Lhd/k;->j()Lhd/c;

    move-result-object v1

    invoke-interface {p1, v1}, Lhd/k$c;->a(Lhd/c;)Lhd/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhd/k$b;->t(Lhd/c;)Lhd/k$b;

    move-result-object v0

    invoke-virtual {p0}, Lhd/k;->l()Lhd/c;

    move-result-object v1

    invoke-interface {p1, v1}, Lhd/k$c;->a(Lhd/c;)Lhd/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lhd/k$b;->x(Lhd/c;)Lhd/k$b;

    move-result-object p1

    invoke-virtual {p1}, Lhd/k$b;->m()Lhd/k;

    move-result-object p1

    return-object p1
.end method
