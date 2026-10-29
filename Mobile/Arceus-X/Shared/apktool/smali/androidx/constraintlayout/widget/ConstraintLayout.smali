.class public Landroidx/constraintlayout/widget/ConstraintLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/widget/ConstraintLayout$b;,
        Landroidx/constraintlayout/widget/ConstraintLayout$c;,
        Landroidx/constraintlayout/widget/ConstraintLayout$d;
    }
.end annotation


# static fields
.field public static y:Lg2/e;


# instance fields
.field public a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/widget/b;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lc2/f;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Z

.field public i:I

.field public j:Landroidx/constraintlayout/widget/c;

.field public k:Lg2/a;

.field public l:I

.field public m:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lc2/e;",
            ">;"
        }
    .end annotation
.end field

.field public u:Landroidx/constraintlayout/widget/ConstraintLayout$c;

.field public v:I

.field public w:I

.field public x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/widget/ConstraintLayout$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    .line 4
    new-instance p1, Lc2/f;

    invoke-direct {p1}, Lc2/f;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    .line 6
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    const v0, 0x7fffffff

    .line 7
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    .line 8
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    const/16 v0, 0x101

    .line 10
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/c;

    .line 12
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lg2/a;

    const/4 v0, -0x1

    .line 13
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 14
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    .line 15
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 16
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    .line 17
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    .line 18
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    .line 19
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:I

    .line 20
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:I

    .line 21
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Landroid/util/SparseArray;

    .line 22
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;

    invoke-direct {v0, p0, p0}, Landroidx/constraintlayout/widget/ConstraintLayout$c;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->u:Landroidx/constraintlayout/widget/ConstraintLayout$c;

    .line 23
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->v:I

    .line 24
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->w:I

    .line 25
    invoke-direct {p0, p2, p1, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->s(Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 26
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    .line 28
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    .line 29
    new-instance p1, Lc2/f;

    invoke-direct {p1}, Lc2/f;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    const/4 p1, 0x0

    .line 30
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    .line 31
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    const v0, 0x7fffffff

    .line 32
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    .line 33
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    const/16 v0, 0x101

    .line 35
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    const/4 v0, 0x0

    .line 36
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/c;

    .line 37
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lg2/a;

    const/4 v0, -0x1

    .line 38
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 39
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    .line 40
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    .line 41
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    .line 42
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    .line 43
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    .line 44
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:I

    .line 45
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:I

    .line 46
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Landroid/util/SparseArray;

    .line 47
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;

    invoke-direct {v0, p0, p0}, Landroidx/constraintlayout/widget/ConstraintLayout$c;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->u:Landroidx/constraintlayout/widget/ConstraintLayout$c;

    .line 48
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->v:I

    .line 49
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->w:I

    .line 50
    invoke-direct {p0, p2, p3, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->s(Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic b(Landroidx/constraintlayout/widget/ConstraintLayout;)Lz1/e;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic c(Landroidx/constraintlayout/widget/ConstraintLayout;)I
    .locals 0

    iget p0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    return p0
.end method

.method public static synthetic d(Landroidx/constraintlayout/widget/ConstraintLayout;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    return-object p0
.end method

.method private getPaddingWidth()I
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v0, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v2, v1

    if-lez v2, :cond_0

    return v2

    :cond_0
    return v0
.end method

.method public static getSharedValues()Lg2/e;
    .locals 1

    sget-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->y:Lg2/e;

    if-nez v0, :cond_0

    new-instance v0, Lg2/e;

    invoke-direct {v0}, Lg2/e;-><init>()V

    sput-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->y:Lg2/e;

    :cond_0
    sget-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->y:Lg2/e;

    return-object v0
.end method

.method private s(Landroid/util/AttributeSet;II)V
    .locals 5

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v0, p0}, Lc2/e;->C0(Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->u:Landroidx/constraintlayout/widget/ConstraintLayout$c;

    invoke-virtual {v0, v1}, Lc2/f;->X1(Ld2/b$b;)V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/c;

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lg2/d;->V0:[I

    invoke-virtual {v1, p1, v2, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 p3, 0x0

    move v1, p3

    :goto_0
    if-ge v1, p2, :cond_7

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    sget v3, Lg2/d;->f1:I

    if-ne v2, v3, :cond_0

    iget v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    goto :goto_2

    :cond_0
    sget v3, Lg2/d;->g1:I

    if-ne v2, v3, :cond_1

    iget v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    goto :goto_2

    :cond_1
    sget v3, Lg2/d;->d1:I

    if-ne v2, v3, :cond_2

    iget v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    goto :goto_2

    :cond_2
    sget v3, Lg2/d;->e1:I

    if-ne v2, v3, :cond_3

    iget v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    goto :goto_2

    :cond_3
    sget v3, Lg2/d;->O2:I

    if-ne v2, v3, :cond_4

    iget v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    goto :goto_2

    :cond_4
    sget v3, Lg2/d;->J1:I

    if-ne v2, v3, :cond_5

    invoke-virtual {p1, v2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-eqz v2, :cond_6

    :try_start_0
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->v(I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lg2/a;

    goto :goto_2

    :cond_5
    sget v3, Lg2/d;->n1:I

    if-ne v2, v3, :cond_6

    invoke-virtual {p1, v2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    :try_start_1
    new-instance v3, Landroidx/constraintlayout/widget/c;

    invoke-direct {v3}, Landroidx/constraintlayout/widget/c;-><init>()V

    iput-object v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/c;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroidx/constraintlayout/widget/c;->t(Landroid/content/Context;I)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/c;

    :goto_1
    iput v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    :cond_6
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_8
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    iget p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-virtual {p1, p2}, Lc2/f;->Y1(I)V

    return-void
.end method


# virtual methods
.method public A(Lc2/f;IIII)V
    .locals 7

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->u:Landroidx/constraintlayout/widget/ConstraintLayout$c;

    iget v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->e:I

    iget v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->d:I

    sget-object v2, Lc2/e$b;->a:Lc2/e$b;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    const/4 v5, 0x0

    const/high16 v6, -0x80000000

    if-eq p2, v6, :cond_3

    if-eqz p2, :cond_2

    if-eq p2, v4, :cond_1

    move-object p2, v2

    :cond_0
    move p3, v5

    goto :goto_0

    :cond_1
    iget p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    sub-int/2addr p2, v0

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    move-object p2, v2

    goto :goto_0

    :cond_2
    sget-object p2, Lc2/e$b;->b:Lc2/e$b;

    if-nez v3, :cond_0

    iget p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-static {v5, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    goto :goto_0

    :cond_3
    sget-object p2, Lc2/e$b;->b:Lc2/e$b;

    if-nez v3, :cond_4

    iget p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-static {v5, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    :cond_4
    :goto_0
    if-eq p4, v6, :cond_8

    if-eqz p4, :cond_7

    if-eq p4, v4, :cond_6

    :cond_5
    move p5, v5

    goto :goto_1

    :cond_6
    iget p4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    sub-int/2addr p4, v1

    invoke-static {p4, p5}, Ljava/lang/Math;->min(II)I

    move-result p5

    goto :goto_1

    :cond_7
    sget-object v2, Lc2/e$b;->b:Lc2/e$b;

    if-nez v3, :cond_5

    iget p4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-static {v5, p4}, Ljava/lang/Math;->max(II)I

    move-result p5

    goto :goto_1

    :cond_8
    sget-object v2, Lc2/e$b;->b:Lc2/e$b;

    if-nez v3, :cond_9

    iget p4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-static {v5, p4}, Ljava/lang/Math;->max(II)I

    move-result p5

    :cond_9
    :goto_1
    invoke-virtual {p1}, Lc2/e;->W()I

    move-result p4

    if-ne p3, p4, :cond_a

    invoke-virtual {p1}, Lc2/e;->x()I

    move-result p4

    if-eq p5, p4, :cond_b

    :cond_a
    invoke-virtual {p1}, Lc2/f;->P1()V

    :cond_b
    invoke-virtual {p1, v5}, Lc2/e;->n1(I)V

    invoke-virtual {p1, v5}, Lc2/e;->o1(I)V

    iget p4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    sub-int/2addr p4, v0

    invoke-virtual {p1, p4}, Lc2/e;->Y0(I)V

    iget p4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    sub-int/2addr p4, v1

    invoke-virtual {p1, p4}, Lc2/e;->X0(I)V

    invoke-virtual {p1, v5}, Lc2/e;->b1(I)V

    invoke-virtual {p1, v5}, Lc2/e;->a1(I)V

    invoke-virtual {p1, p2}, Lc2/e;->Q0(Lc2/e$b;)V

    invoke-virtual {p1, p3}, Lc2/e;->l1(I)V

    invoke-virtual {p1, v2}, Lc2/e;->h1(Lc2/e$b;)V

    invoke-virtual {p1, p5}, Lc2/e;->M0(I)V

    iget p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    sub-int/2addr p2, v0

    invoke-virtual {p1, p2}, Lc2/e;->b1(I)V

    iget p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    sub-int/2addr p2, v1

    invoke-virtual {p1, p2}, Lc2/e;->a1(I)V

    return-void
.end method

.method public final B(Lc2/e;Landroidx/constraintlayout/widget/ConstraintLayout$b;Landroid/util/SparseArray;ILc2/d$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc2/e;",
            "Landroidx/constraintlayout/widget/ConstraintLayout$b;",
            "Landroid/util/SparseArray<",
            "Lc2/e;",
            ">;I",
            "Lc2/d$a;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p3, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lc2/e;

    if-eqz p3, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    instance-of p4, p4, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    if-eqz p4, :cond_1

    const/4 p4, 0x1

    iput-boolean p4, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->g0:Z

    sget-object v1, Lc2/d$a;->f:Lc2/d$a;

    if-ne p5, v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    iput-boolean p4, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->g0:Z

    iget-object v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->v0:Lc2/e;

    invoke-virtual {v0, p4}, Lc2/e;->L0(Z)V

    :cond_0
    invoke-virtual {p1, v1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v0

    invoke-virtual {p3, p5}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p3

    iget p5, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->D:I

    iget p2, p2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->C:I

    invoke-virtual {v0, p3, p5, p2, p4}, Lc2/d;->b(Lc2/d;IIZ)Z

    invoke-virtual {p1, p4}, Lc2/e;->L0(Z)V

    sget-object p2, Lc2/d$a;->c:Lc2/d$a;

    invoke-virtual {p1, p2}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p2

    invoke-virtual {p2}, Lc2/d;->q()V

    sget-object p2, Lc2/d$a;->e:Lc2/d$a;

    invoke-virtual {p1, p2}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    invoke-virtual {p1}, Lc2/d;->q()V

    :cond_1
    return-void
.end method

.method public final C()Z
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->y()V

    :cond_2
    return v1
.end method

.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    return p1
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/constraintlayout/widget/b;

    invoke-virtual {v4, v0}, Landroidx/constraintlayout/widget/b;->q(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    move v5, v2

    :goto_1
    if-ge v5, v4, :cond_3

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    const/16 v8, 0x8

    if-ne v7, v8, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_2

    check-cast v6, Ljava/lang/String;

    const-string v7, ","

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x4

    if-ne v7, v8, :cond_2

    aget-object v7, v6, v2

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x1

    aget-object v8, v6, v8

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    const/4 v9, 0x2

    aget-object v9, v6, v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    const/4 v10, 0x3

    aget-object v6, v6, v10

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    int-to-float v7, v7

    const/high16 v10, 0x44870000    # 1080.0f

    div-float/2addr v7, v10

    mul-float/2addr v7, v1

    float-to-int v7, v7

    int-to-float v8, v8

    const/high16 v11, 0x44f00000    # 1920.0f

    div-float/2addr v8, v11

    mul-float/2addr v8, v3

    float-to-int v8, v8

    int-to-float v9, v9

    div-float/2addr v9, v10

    mul-float/2addr v9, v1

    float-to-int v9, v9

    int-to-float v6, v6

    div-float/2addr v6, v11

    mul-float/2addr v6, v3

    float-to-int v6, v6

    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    const/high16 v10, -0x10000

    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v11, v7

    int-to-float v12, v8

    add-int/2addr v7, v9

    int-to-float v13, v7

    move v14, v12

    move-object/from16 v10, p1

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v7, v11

    add-int/2addr v8, v6

    int-to-float v14, v8

    move v11, v13

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v6, v12

    move v12, v14

    move v13, v7

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v7, v11

    move v11, v13

    move v14, v6

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v16, v14

    move v14, v12

    move/from16 v12, v16

    const v6, -0xff0100

    invoke-virtual {v15, v6}, Landroid/graphics/Paint;->setColor(I)V

    move v13, v7

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v16, v14

    move v14, v12

    move/from16 v12, v16

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_3
    return-void
.end method

.method public e(ZLandroid/view/View;Lc2/e;Landroidx/constraintlayout/widget/ConstraintLayout$b;Landroid/util/SparseArray;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroid/view/View;",
            "Lc2/e;",
            "Landroidx/constraintlayout/widget/ConstraintLayout$b;",
            "Landroid/util/SparseArray<",
            "Lc2/e;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    invoke-virtual {v6}, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a()V

    const/4 v8, 0x0

    iput-boolean v8, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->w0:Z

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v2

    invoke-virtual {v1, v2}, Lc2/e;->k1(I)V

    iget-boolean v2, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->j0:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lc2/e;->U0(Z)V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lc2/e;->k1(I)V

    :cond_0
    invoke-virtual {v1, v0}, Lc2/e;->C0(Ljava/lang/Object;)V

    instance-of v2, v0, Landroidx/constraintlayout/widget/b;

    if-eqz v2, :cond_1

    check-cast v0, Landroidx/constraintlayout/widget/b;

    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v2}, Lc2/f;->R1()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroidx/constraintlayout/widget/b;->n(Lc2/e;Z)V

    :cond_1
    iget-boolean v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->h0:Z

    const/4 v9, -0x1

    if-eqz v0, :cond_5

    move-object p1, v1

    check-cast p1, Lc2/h;

    iget v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->s0:I

    iget v1, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->t0:I

    iget v2, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->u0:F

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v3, v2, v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v2}, Lc2/h;->A1(F)V

    return-void

    :cond_2
    if-eq v0, v9, :cond_3

    invoke-virtual {p1, v0}, Lc2/h;->y1(I)V

    return-void

    :cond_3
    if-eq v1, v9, :cond_4

    invoke-virtual {p1, v1}, Lc2/h;->z1(I)V

    :cond_4
    return-void

    :cond_5
    iget v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->l0:I

    iget v2, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->m0:I

    iget v10, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->n0:I

    iget v11, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->o0:I

    iget v5, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->p0:I

    iget v12, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->q0:I

    iget v13, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->r0:F

    iget v3, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->p:I

    if-eq v3, v9, :cond_7

    invoke-virtual {v7, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc2/e;

    if-eqz v0, :cond_6

    iget v2, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->r:F

    iget v3, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->q:I

    invoke-virtual {v1, v0, v2, v3}, Lc2/e;->l(Lc2/e;FI)V

    :cond_6
    move-object v0, v1

    move-object v2, v6

    goto/16 :goto_6

    :cond_7
    if-eq v0, v9, :cond_8

    invoke-virtual {v7, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lc2/e;

    if-eqz v2, :cond_9

    sget-object v1, Lc2/d$a;->b:Lc2/d$a;

    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object v3, v1

    move-object/from16 v0, p3

    invoke-virtual/range {v0 .. v5}, Lc2/e;->e0(Lc2/d$a;Lc2/e;Lc2/d$a;II)V

    goto :goto_0

    :cond_8
    if-eq v2, v9, :cond_9

    invoke-virtual {v7, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lc2/e;

    if-eqz v2, :cond_9

    sget-object v1, Lc2/d$a;->b:Lc2/d$a;

    sget-object v3, Lc2/d$a;->d:Lc2/d$a;

    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v0, p3

    invoke-virtual/range {v0 .. v5}, Lc2/e;->e0(Lc2/d$a;Lc2/e;Lc2/d$a;II)V

    :cond_9
    :goto_0
    if-eq v10, v9, :cond_a

    invoke-virtual {v7, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lc2/e;

    if-eqz v2, :cond_b

    sget-object v1, Lc2/d$a;->d:Lc2/d$a;

    sget-object v3, Lc2/d$a;->b:Lc2/d$a;

    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object/from16 v0, p3

    move v5, v12

    invoke-virtual/range {v0 .. v5}, Lc2/e;->e0(Lc2/d$a;Lc2/e;Lc2/d$a;II)V

    goto :goto_1

    :cond_a
    move v5, v12

    if-eq v11, v9, :cond_b

    invoke-virtual {v7, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lc2/e;

    if-eqz v2, :cond_b

    sget-object v1, Lc2/d$a;->d:Lc2/d$a;

    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object v3, v1

    move-object/from16 v0, p3

    invoke-virtual/range {v0 .. v5}, Lc2/e;->e0(Lc2/d$a;Lc2/e;Lc2/d$a;II)V

    :cond_b
    :goto_1
    iget v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->i:I

    if-eq v0, v9, :cond_c

    invoke-virtual {v7, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lc2/e;

    if-eqz v2, :cond_d

    sget-object v1, Lc2/d$a;->c:Lc2/d$a;

    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v5, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->x:I

    move-object v3, v1

    move-object/from16 v0, p3

    invoke-virtual/range {v0 .. v5}, Lc2/e;->e0(Lc2/d$a;Lc2/e;Lc2/d$a;II)V

    goto :goto_2

    :cond_c
    iget v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->j:I

    if-eq v0, v9, :cond_d

    invoke-virtual {v7, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lc2/e;

    if-eqz v2, :cond_d

    sget-object v1, Lc2/d$a;->c:Lc2/d$a;

    sget-object v3, Lc2/d$a;->e:Lc2/d$a;

    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v5, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->x:I

    move-object/from16 v0, p3

    invoke-virtual/range {v0 .. v5}, Lc2/e;->e0(Lc2/d$a;Lc2/e;Lc2/d$a;II)V

    :cond_d
    :goto_2
    iget v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->k:I

    if-eq v0, v9, :cond_e

    invoke-virtual {v7, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lc2/e;

    if-eqz v2, :cond_f

    sget-object v1, Lc2/d$a;->e:Lc2/d$a;

    sget-object v3, Lc2/d$a;->c:Lc2/d$a;

    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v5, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->z:I

    move-object/from16 v0, p3

    invoke-virtual/range {v0 .. v5}, Lc2/e;->e0(Lc2/d$a;Lc2/e;Lc2/d$a;II)V

    goto :goto_3

    :cond_e
    iget v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->l:I

    if-eq v0, v9, :cond_f

    invoke-virtual {v7, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lc2/e;

    if-eqz v2, :cond_f

    sget-object v1, Lc2/d$a;->e:Lc2/d$a;

    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v5, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->z:I

    move-object v3, v1

    move-object/from16 v0, p3

    invoke-virtual/range {v0 .. v5}, Lc2/e;->e0(Lc2/d$a;Lc2/e;Lc2/d$a;II)V

    :cond_f
    :goto_3
    iget v4, v6, Landroidx/constraintlayout/widget/ConstraintLayout$b;->m:I

    if-eq v4, v9, :cond_11

    sget-object v5, Lc2/d$a;->f:Lc2/d$a;

    move-object v0, p0

    move-object/from16 v1, p3

    move-object v2, v6

    move-object v3, v7

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->B(Lc2/e;Landroidx/constraintlayout/widget/ConstraintLayout$b;Landroid/util/SparseArray;ILc2/d$a;)V

    :cond_10
    :goto_4
    move-object/from16 v0, p3

    goto :goto_5

    :cond_11
    move-object v2, v6

    iget v4, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->n:I

    if-eq v4, v9, :cond_12

    sget-object v5, Lc2/d$a;->c:Lc2/d$a;

    move-object v0, p0

    move-object/from16 v1, p3

    move-object/from16 v3, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->B(Lc2/e;Landroidx/constraintlayout/widget/ConstraintLayout$b;Landroid/util/SparseArray;ILc2/d$a;)V

    goto :goto_4

    :cond_12
    iget v4, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->o:I

    if-eq v4, v9, :cond_10

    sget-object v5, Lc2/d$a;->e:Lc2/d$a;

    move-object v0, p0

    move-object/from16 v1, p3

    move-object/from16 v3, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->B(Lc2/e;Landroidx/constraintlayout/widget/ConstraintLayout$b;Landroid/util/SparseArray;ILc2/d$a;)V

    move-object v0, v1

    :goto_5
    const/4 v1, 0x0

    cmpl-float v3, v13, v1

    if-ltz v3, :cond_13

    invoke-virtual {v0, v13}, Lc2/e;->N0(F)V

    :cond_13
    iget v3, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->H:F

    cmpl-float v1, v3, v1

    if-ltz v1, :cond_14

    invoke-virtual {v0, v3}, Lc2/e;->e1(F)V

    :cond_14
    :goto_6
    if-eqz p1, :cond_16

    iget p1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->X:I

    if-ne p1, v9, :cond_15

    iget v1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->Y:I

    if-eq v1, v9, :cond_16

    :cond_15
    iget v1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->Y:I

    invoke-virtual {v0, p1, v1}, Lc2/e;->c1(II)V

    :cond_16
    iget-boolean p1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->e0:Z

    const/4 v1, -0x2

    if-nez p1, :cond_19

    iget p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-ne p1, v9, :cond_18

    iget-boolean p1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a0:Z

    if-eqz p1, :cond_17

    sget-object p1, Lc2/e$b;->c:Lc2/e$b;

    invoke-virtual {v0, p1}, Lc2/e;->Q0(Lc2/e$b;)V

    goto :goto_7

    :cond_17
    sget-object p1, Lc2/e$b;->d:Lc2/e$b;

    invoke-virtual {v0, p1}, Lc2/e;->Q0(Lc2/e$b;)V

    :goto_7
    sget-object p1, Lc2/d$a;->b:Lc2/d$a;

    invoke-virtual {v0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v3, p1, Lc2/d;->g:I

    sget-object p1, Lc2/d$a;->d:Lc2/d$a;

    invoke-virtual {v0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v3, p1, Lc2/d;->g:I

    goto :goto_8

    :cond_18
    sget-object p1, Lc2/e$b;->c:Lc2/e$b;

    invoke-virtual {v0, p1}, Lc2/e;->Q0(Lc2/e$b;)V

    invoke-virtual {v0, v8}, Lc2/e;->l1(I)V

    goto :goto_8

    :cond_19
    sget-object p1, Lc2/e$b;->a:Lc2/e$b;

    invoke-virtual {v0, p1}, Lc2/e;->Q0(Lc2/e$b;)V

    iget p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {v0, p1}, Lc2/e;->l1(I)V

    iget p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-ne p1, v1, :cond_1a

    sget-object p1, Lc2/e$b;->b:Lc2/e$b;

    invoke-virtual {v0, p1}, Lc2/e;->Q0(Lc2/e$b;)V

    :cond_1a
    :goto_8
    iget-boolean p1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->f0:Z

    if-nez p1, :cond_1d

    iget p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne p1, v9, :cond_1c

    iget-boolean p1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->b0:Z

    if-eqz p1, :cond_1b

    sget-object p1, Lc2/e$b;->c:Lc2/e$b;

    invoke-virtual {v0, p1}, Lc2/e;->h1(Lc2/e$b;)V

    goto :goto_9

    :cond_1b
    sget-object p1, Lc2/e$b;->d:Lc2/e$b;

    invoke-virtual {v0, p1}, Lc2/e;->h1(Lc2/e$b;)V

    :goto_9
    sget-object p1, Lc2/d$a;->c:Lc2/d$a;

    invoke-virtual {v0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    iget v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v1, p1, Lc2/d;->g:I

    sget-object p1, Lc2/d$a;->e:Lc2/d$a;

    invoke-virtual {v0, p1}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object p1

    iget v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v1, p1, Lc2/d;->g:I

    goto :goto_a

    :cond_1c
    sget-object p1, Lc2/e$b;->c:Lc2/e$b;

    invoke-virtual {v0, p1}, Lc2/e;->h1(Lc2/e$b;)V

    invoke-virtual {v0, v8}, Lc2/e;->M0(I)V

    goto :goto_a

    :cond_1d
    sget-object p1, Lc2/e$b;->a:Lc2/e$b;

    invoke-virtual {v0, p1}, Lc2/e;->h1(Lc2/e$b;)V

    iget p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {v0, p1}, Lc2/e;->M0(I)V

    iget p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne p1, v1, :cond_1e

    sget-object p1, Lc2/e$b;->b:Lc2/e$b;

    invoke-virtual {v0, p1}, Lc2/e;->h1(Lc2/e$b;)V

    :cond_1e
    :goto_a
    iget-object p1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->I:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lc2/e;->E0(Ljava/lang/String;)V

    iget p1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->L:F

    invoke-virtual {v0, p1}, Lc2/e;->S0(F)V

    iget p1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->M:F

    invoke-virtual {v0, p1}, Lc2/e;->j1(F)V

    iget p1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->N:I

    invoke-virtual {v0, p1}, Lc2/e;->O0(I)V

    iget p1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->O:I

    invoke-virtual {v0, p1}, Lc2/e;->f1(I)V

    iget p1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->d0:I

    invoke-virtual {v0, p1}, Lc2/e;->m1(I)V

    iget p1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->P:I

    iget v1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->R:I

    iget v3, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->T:I

    iget v4, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->V:F

    invoke-virtual {v0, p1, v1, v3, v4}, Lc2/e;->R0(IIIF)V

    iget p1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->Q:I

    iget v1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->S:I

    iget v3, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->U:I

    iget v2, v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;->W:F

    invoke-virtual {v0, p1, v1, v3, v2}, Lc2/e;->i1(IIIF)V

    return-void
.end method

.method public f(II)Z
    .locals 12

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->x:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->x:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    move v0, v1

    move v2, v0

    :goto_0
    if-ge v2, p2, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v8, v2, 0x1

    move-object v2, v5

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout$d;

    iget-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v5}, Lc2/m;->s1()Ljava/util/ArrayList;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    move v5, v1

    :goto_1
    if-ge v5, v10, :cond_1

    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v11, v5, 0x1

    check-cast v6, Lc2/e;

    invoke-virtual {v6}, Lc2/e;->s()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    invoke-interface/range {v2 .. v7}, Landroidx/constraintlayout/widget/ConstraintLayout$d;->a(IIILandroid/view/View;Landroidx/constraintlayout/widget/ConstraintLayout$b;)Z

    move-result v5

    or-int/2addr v0, v5

    move v5, v11

    goto :goto_1

    :cond_1
    move v2, v8

    goto :goto_0

    :cond_2
    return v0
.end method

.method public forceLayout()V
    .locals 0

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->u()V

    invoke-super {p0}, Landroid/view/View;->forceLayout()V

    return-void
.end method

.method public g()Landroidx/constraintlayout/widget/ConstraintLayout$b;
    .locals 2

    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/constraintlayout/widget/ConstraintLayout$b;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->g()Landroidx/constraintlayout/widget/ConstraintLayout$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/util/AttributeSet;)Landroidx/constraintlayout/widget/ConstraintLayout$b;

    move-result-object p1

    return-object p1
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 2
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    invoke-direct {v0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$b;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getMaxHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    return v0
.end method

.method public getMinHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    return v0
.end method

.method public getMinWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    return v0
.end method

.method public getOptimizationLevel()I
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v0}, Lc2/f;->L1()I

    move-result v0

    return v0
.end method

.method public getSceneString()Ljava/lang/String;
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    iget-object v1, v1, Lc2/e;->o:Ljava/lang/String;

    const/4 v2, -0x1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    if-eq v1, v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    iput-object v1, v3, Lc2/e;->o:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    const-string v3, "parent"

    iput-object v3, v1, Lc2/e;->o:Ljava/lang/String;

    :cond_1
    :goto_0
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v1}, Lc2/e;->t()Ljava/lang/String;

    move-result-object v1

    const-string v3, " setDebugName "

    const-string v4, "ConstraintLayout"

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    iget-object v5, v1, Lc2/e;->o:Ljava/lang/String;

    invoke-virtual {v1, v5}, Lc2/e;->D0(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v5}, Lc2/e;->t()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v1}, Lc2/m;->s1()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    :cond_3
    :goto_1
    if-ge v6, v5, :cond_5

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    check-cast v7, Lc2/e;

    invoke-virtual {v7}, Lc2/e;->s()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/View;

    if-eqz v8, :cond_3

    iget-object v9, v7, Lc2/e;->o:Ljava/lang/String;

    if-nez v9, :cond_4

    invoke-virtual {v8}, Landroid/view/View;->getId()I

    move-result v8

    if-eq v8, v2, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9, v8}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lc2/e;->o:Ljava/lang/String;

    :cond_4
    invoke-virtual {v7}, Lc2/e;->t()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_3

    iget-object v8, v7, Lc2/e;->o:Ljava/lang/String;

    invoke-virtual {v7, v8}, Lc2/e;->D0(Ljava/lang/String;)V

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Lc2/e;->t()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_5
    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v1, v0}, Lc2/f;->O(Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h(Landroid/util/AttributeSet;)Landroidx/constraintlayout/widget/ConstraintLayout$b;
    .locals 2

    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public l(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_0

    check-cast p2, Ljava/lang/String;

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public onLayout(ZIIII)V
    .locals 5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    const/4 p3, 0x0

    move p4, p3

    :goto_0
    if-ge p4, p1, :cond_3

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->v0:Lc2/e;

    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    iget-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->h0:Z

    if-nez v2, :cond_0

    iget-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->i0:Z

    if-nez v2, :cond_0

    iget-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->k0:Z

    if-nez v2, :cond_0

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->j0:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lc2/e;->X()I

    move-result v0

    invoke-virtual {v1}, Lc2/e;->Y()I

    move-result v2

    invoke-virtual {v1}, Lc2/e;->W()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v1}, Lc2/e;->x()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    instance-of v4, p5, Landroidx/constraintlayout/widget/e;

    if-eqz v4, :cond_2

    check-cast p5, Landroidx/constraintlayout/widget/e;

    invoke-virtual {p5}, Landroidx/constraintlayout/widget/e;->getContent()Landroid/view/View;

    move-result-object p5

    if-eqz p5, :cond_2

    invoke-virtual {p5, p3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    :cond_2
    :goto_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_4

    :goto_2
    if-ge p3, p1, :cond_4

    iget-object p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/constraintlayout/widget/b;

    invoke-virtual {p2, p0}, Landroidx/constraintlayout/widget/b;->o(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public onMeasure(II)V
    .locals 8

    iget-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->f(II)Z

    move-result v1

    or-int/2addr v0, v1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->v:I

    iput p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->w:I

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->t()Z

    move-result v2

    invoke-virtual {v0, v2}, Lc2/f;->a2(Z)V

    iget-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->C()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v0}, Lc2/f;->c2()V

    :cond_2
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc2/f;->J1(Lz1/e;)V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    iget v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-virtual {p0, v0, v1, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->x(Lc2/f;III)V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v0}, Lc2/e;->W()I

    move-result v4

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v0}, Lc2/e;->x()I

    move-result v5

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v0}, Lc2/f;->S1()Z

    move-result v6

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v0}, Lc2/f;->Q1()Z

    move-result v7

    move-object v1, p0

    move v2, p1

    move v3, p2

    invoke-virtual/range {v1 .. v7}, Landroidx/constraintlayout/widget/ConstraintLayout;->w(IIIIZZ)V

    return-void
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->r(Landroid/view/View;)Lc2/e;

    move-result-object v0

    instance-of v1, p1, Landroidx/constraintlayout/widget/Guideline;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    instance-of v0, v0, Lc2/h;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    new-instance v1, Lc2/h;

    invoke-direct {v1}, Lc2/h;-><init>()V

    iput-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->v0:Lc2/e;

    iput-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->h0:Z

    iget v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;->Z:I

    invoke-virtual {v1, v0}, Lc2/h;->B1(I)V

    :cond_0
    instance-of v0, p1, Landroidx/constraintlayout/widget/b;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroidx/constraintlayout/widget/b;

    invoke-virtual {v0}, Landroidx/constraintlayout/widget/b;->s()V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    iput-boolean v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->i0:Z

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput-boolean v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->r(Landroid/view/View;)Lc2/e;

    move-result-object v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v1, v0}, Lc2/m;->u1(Lc2/e;)V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    return-void
.end method

.method public final p(I)Lc2/e;
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eq v0, p0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-ne p1, p0, :cond_1

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    :cond_1
    if-ne v0, p0, :cond_2

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    return-object p1

    :cond_2
    if-nez v0, :cond_3

    const/4 p1, 0x0

    return-object p1

    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    iget-object p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->v0:Lc2/e;

    return-object p1
.end method

.method public q(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    return-object p1
.end method

.method public final r(Landroid/view/View;)Lc2/e;
    .locals 1

    if-ne p1, p0, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    return-object p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    iget-object p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->v0:Lc2/e;

    return-object p1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    iget-object p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;->v0:Lc2/e;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public requestLayout()V
    .locals 0

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->u()V

    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setConstraintSet(Landroidx/constraintlayout/widget/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/c;

    return-void
.end method

.method public setId(I)V
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    invoke-super {p0, p1}, Landroid/view/View;->setId(I)V

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p1, v0, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setOnConstraintsChanged(Lg2/b;)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lg2/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lg2/a;->c(Lg2/b;)V

    :cond_0
    return-void
.end method

.method public setOptimizationLevel(I)V
    .locals 1

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v0, p1}, Lc2/f;->Y1(I)V

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public t()Z
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v1, 0x400000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final u()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    const/4 v0, -0x1

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:I

    return-void
.end method

.method public v(I)V
    .locals 2

    new-instance v0, Lg2/a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0, p1}, Lg2/a;-><init>(Landroid/content/Context;Landroidx/constraintlayout/widget/ConstraintLayout;I)V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Lg2/a;

    return-void
.end method

.method public w(IIIIZZ)V
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->u:Landroidx/constraintlayout/widget/ConstraintLayout$c;

    iget v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->e:I

    iget v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$c;->d:I

    add-int/2addr p3, v0

    add-int/2addr p4, v1

    const/4 v0, 0x0

    invoke-static {p3, p1, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p1

    invoke-static {p4, p2, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p2

    const p3, 0xffffff

    and-int/2addr p1, p3

    and-int/2addr p2, p3

    iget p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-static {p3, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-static {p3, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/high16 p3, 0x1000000

    if-eqz p5, :cond_0

    or-int/2addr p1, p3

    :cond_0
    if-eqz p6, :cond_1

    or-int/2addr p2, p3

    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    iput p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    return-void
.end method

.method public x(Lc2/f;III)V
    .locals 13

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    const/4 v5, 0x0

    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v10

    add-int v12, v9, v10

    invoke-direct {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingWidth()I

    move-result v11

    iget-object v6, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->u:Landroidx/constraintlayout/widget/ConstraintLayout$c;

    move/from16 v7, p3

    move/from16 v8, p4

    invoke-virtual/range {v6 .. v12}, Landroidx/constraintlayout/widget/ConstraintLayout$c;->c(IIIIII)V

    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result v3

    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    if-gtz v3, :cond_2

    if-lez v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    :cond_1
    move v8, v3

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->t()Z

    move-result v5

    if-eqz v5, :cond_1

    move v8, v6

    :goto_1
    sub-int v3, v0, v11

    sub-int v5, v1, v12

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->A(Lc2/f;IIII)V

    iget v6, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:I

    iget v7, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    move-object v0, p1

    move v1, p2

    invoke-virtual/range {v0 .. v9}, Lc2/f;->T1(IIIIIIIII)J

    return-void
.end method

.method public final y()V
    .locals 8

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, v6, :cond_1

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->r(Landroid/view/View;)Lc2/e;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Lc2/e;->t0()V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    if-eqz v1, :cond_3

    move v3, v0

    :goto_2
    if-ge v3, v6, :cond_3

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v7

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {p0, v0, v5, v7}, Landroidx/constraintlayout/widget/ConstraintLayout;->z(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v7, 0x2f

    invoke-virtual {v5, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    if-eq v7, v2, :cond_2

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v5, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    :cond_2
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {p0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->p(I)Lc2/e;

    move-result-object v4

    invoke-virtual {v4, v5}, Lc2/e;->D0(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    iget v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    if-eq v3, v2, :cond_5

    move v2, v0

    :goto_3
    if-ge v2, v6, :cond_5

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v4

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    if-ne v4, v5, :cond_4

    instance-of v4, v3, Landroidx/constraintlayout/widget/d;

    if-eqz v4, :cond_4

    check-cast v3, Landroidx/constraintlayout/widget/d;

    invoke-virtual {v3}, Landroidx/constraintlayout/widget/d;->getConstraintSet()Landroidx/constraintlayout/widget/c;

    move-result-object v3

    iput-object v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/c;

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/c;

    if-eqz v2, :cond_6

    const/4 v3, 0x1

    invoke-virtual {v2, p0, v3}, Landroidx/constraintlayout/widget/c;->d(Landroidx/constraintlayout/widget/ConstraintLayout;Z)V

    :cond_6
    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v2}, Lc2/m;->v1()V

    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_7

    move v3, v0

    :goto_4
    if-ge v3, v2, :cond_7

    iget-object v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/constraintlayout/widget/b;

    invoke-virtual {v4, p0}, Landroidx/constraintlayout/widget/b;->r(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_7
    move v2, v0

    :goto_5
    if-ge v2, v6, :cond_9

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v4, v3, Landroidx/constraintlayout/widget/e;

    if-eqz v4, :cond_8

    check-cast v3, Landroidx/constraintlayout/widget/e;

    invoke-virtual {v3, p0}, Landroidx/constraintlayout/widget/e;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_9
    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->clear()V

    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Landroid/util/SparseArray;

    iget-object v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v2, v0, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v3

    iget-object v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v2, v3, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move v2, v0

    :goto_6
    if-ge v2, v6, :cond_a

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->r(Landroid/view/View;)Lc2/e;

    move-result-object v4

    iget-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    invoke-virtual {v5, v3, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_a
    move v7, v0

    :goto_7
    if-ge v7, v6, :cond_c

    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->r(Landroid/view/View;)Lc2/e;

    move-result-object v3

    if-nez v3, :cond_b

    goto :goto_8

    :cond_b
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lc2/f;

    invoke-virtual {v0, v3}, Lc2/m;->a(Lc2/e;)V

    iget-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Landroid/util/SparseArray;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->e(ZLandroid/view/View;Lc2/e;Landroidx/constraintlayout/widget/ConstraintLayout$b;Landroid/util/SparseArray;)V

    :goto_8
    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_c
    return-void
.end method

.method public z(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    if-nez p1, :cond_2

    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_2

    instance-of p1, p3, Ljava/lang/Integer;

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    :cond_0
    check-cast p2, Ljava/lang/String;

    const-string p1, "/"

    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    :cond_1
    check-cast p3, Ljava/lang/Integer;

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method
