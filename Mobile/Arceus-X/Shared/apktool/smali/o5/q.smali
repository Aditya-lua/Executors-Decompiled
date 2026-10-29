.class public abstract Lo5/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/q$g;,
        Lo5/q$h;,
        Lo5/q$d;,
        Lo5/q$f;,
        Lo5/q$i;,
        Lo5/q$e;
    }
.end annotation


# static fields
.field public static final M:[Landroid/animation/Animator;

.field public static final N:[I

.field public static final O:Lo5/k;

.field public static P:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lw1/a<",
            "Landroid/animation/Animator;",
            "Lo5/q$d;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public A:Z

.field public B:Z

.field public C:Lo5/q;

.field public D:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo5/q$h;",
            ">;"
        }
    .end annotation
.end field

.field public E:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator;",
            ">;"
        }
    .end annotation
.end field

.field public F:Lo5/z;

.field public G:Lo5/q$e;

.field public H:Lw1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/a<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public I:Lo5/k;

.field public J:J

.field public K:Lo5/q$g;

.field public L:J

.field public a:Ljava/lang/String;

.field public b:J

.field public c:J

.field public d:Landroid/animation/TimeInterpolator;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field public i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field public l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field public p:Lo5/e0;

.field public q:Lo5/e0;

.field public r:Lo5/b0;

.field public s:[I

.field public t:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo5/d0;",
            ">;"
        }
    .end annotation
.end field

.field public u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo5/d0;",
            ">;"
        }
    .end annotation
.end field

.field public v:[Lo5/q$h;

.field public w:Z

.field public x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator;",
            ">;"
        }
    .end annotation
.end field

.field public y:[Landroid/animation/Animator;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    new-array v0, v0, [Landroid/animation/Animator;

    sput-object v0, Lo5/q;->M:[Landroid/animation/Animator;

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x2

    const/4 v3, 0x1

    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lo5/q;->N:[I

    new-instance v0, Lo5/q$a;

    invoke-direct {v0}, Lo5/q$a;-><init>()V

    sput-object v0, Lo5/q;->O:Lo5/k;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lo5/q;->P:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo5/q;->a:Ljava/lang/String;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo5/q;->b:J

    iput-wide v0, p0, Lo5/q;->c:J

    const/4 v0, 0x0

    iput-object v0, p0, Lo5/q;->d:Landroid/animation/TimeInterpolator;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lo5/q;->e:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lo5/q;->f:Ljava/util/ArrayList;

    iput-object v0, p0, Lo5/q;->g:Ljava/util/ArrayList;

    iput-object v0, p0, Lo5/q;->h:Ljava/util/ArrayList;

    iput-object v0, p0, Lo5/q;->i:Ljava/util/ArrayList;

    iput-object v0, p0, Lo5/q;->j:Ljava/util/ArrayList;

    iput-object v0, p0, Lo5/q;->k:Ljava/util/ArrayList;

    iput-object v0, p0, Lo5/q;->l:Ljava/util/ArrayList;

    iput-object v0, p0, Lo5/q;->m:Ljava/util/ArrayList;

    iput-object v0, p0, Lo5/q;->n:Ljava/util/ArrayList;

    iput-object v0, p0, Lo5/q;->o:Ljava/util/ArrayList;

    new-instance v1, Lo5/e0;

    invoke-direct {v1}, Lo5/e0;-><init>()V

    iput-object v1, p0, Lo5/q;->p:Lo5/e0;

    new-instance v1, Lo5/e0;

    invoke-direct {v1}, Lo5/e0;-><init>()V

    iput-object v1, p0, Lo5/q;->q:Lo5/e0;

    iput-object v0, p0, Lo5/q;->r:Lo5/b0;

    sget-object v1, Lo5/q;->N:[I

    iput-object v1, p0, Lo5/q;->s:[I

    const/4 v1, 0x0

    iput-boolean v1, p0, Lo5/q;->w:Z

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lo5/q;->x:Ljava/util/ArrayList;

    sget-object v2, Lo5/q;->M:[Landroid/animation/Animator;

    iput-object v2, p0, Lo5/q;->y:[Landroid/animation/Animator;

    iput v1, p0, Lo5/q;->z:I

    iput-boolean v1, p0, Lo5/q;->A:Z

    iput-boolean v1, p0, Lo5/q;->B:Z

    iput-object v0, p0, Lo5/q;->C:Lo5/q;

    iput-object v0, p0, Lo5/q;->D:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo5/q;->E:Ljava/util/ArrayList;

    sget-object v0, Lo5/q;->O:Lo5/k;

    iput-object v0, p0, Lo5/q;->I:Lo5/k;

    return-void
.end method

.method public static O()Lw1/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw1/a<",
            "Landroid/animation/Animator;",
            "Lo5/q$d;",
            ">;"
        }
    .end annotation

    sget-object v0, Lo5/q;->P:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw1/a;

    if-nez v0, :cond_0

    new-instance v0, Lw1/a;

    invoke-direct {v0}, Lw1/a;-><init>()V

    sget-object v1, Lo5/q;->P:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public static synthetic a(Lo5/q;)Lo5/q;
    .locals 0

    iget-object p0, p0, Lo5/q;->C:Lo5/q;

    return-object p0
.end method

.method public static synthetic b(Lo5/q;Lo5/q;)Lo5/q;
    .locals 0

    iput-object p1, p0, Lo5/q;->C:Lo5/q;

    return-object p1
.end method

.method public static b0(Lo5/d0;Lo5/d0;Ljava/lang/String;)Z
    .locals 0

    iget-object p0, p0, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    iget-object p1, p1, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p2, 0x1

    if-eqz p0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, p2

    return p0

    :cond_2
    :goto_0
    return p2
.end method

.method public static h(Lo5/e0;Landroid/view/View;Lo5/d0;)V
    .locals 3

    iget-object v0, p0, Lo5/e0;->a:Lw1/a;

    invoke-virtual {v0, p1, p2}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    const/4 v0, 0x0

    if-ltz p2, :cond_1

    iget-object v1, p0, Lo5/e0;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, p2}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v1

    if-ltz v1, :cond_0

    iget-object v1, p0, Lo5/e0;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lo5/e0;->b:Landroid/util/SparseArray;

    invoke-virtual {v1, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-static {p1}, Landroidx/core/view/o0;->H(Landroid/view/View;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object v1, p0, Lo5/e0;->d:Lw1/a;

    invoke-virtual {v1, p2}, Lw1/a;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lo5/e0;->d:Lw1/a;

    invoke-virtual {v1, p2, v0}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lo5/e0;->d:Lw1/a;

    invoke-virtual {v1, p2, p1}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of p2, p2, Landroid/widget/ListView;

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/widget/ListView;

    invoke-virtual {p2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/Adapter;->hasStableIds()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p2, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/AdapterView;->getItemIdAtPosition(I)J

    move-result-wide v1

    iget-object p2, p0, Lo5/e0;->c:Lw1/g;

    invoke-virtual {p2, v1, v2}, Lw1/g;->f(J)I

    move-result p2

    if-ltz p2, :cond_4

    iget-object p1, p0, Lo5/e0;->c:Lw1/g;

    invoke-virtual {p1, v1, v2}, Lw1/g;->e(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_5

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setHasTransientState(Z)V

    iget-object p0, p0, Lo5/e0;->c:Lw1/g;

    invoke-virtual {p0, v1, v2, v0}, Lw1/g;->i(JLjava/lang/Object;)V

    return-void

    :cond_4
    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setHasTransientState(Z)V

    iget-object p0, p0, Lo5/e0;->c:Lw1/g;

    invoke-virtual {p0, v1, v2, p1}, Lw1/g;->i(JLjava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public A()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lo5/q;->G:Lo5/q$e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0, p0}, Lo5/q$e;->a(Lo5/q;)Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public A0(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "@"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lo5/q;->c:J

    const-wide/16 v3, -0x1

    cmp-long p1, v1, v3

    const-string v1, ") "

    if-eqz p1, :cond_0

    const-string p1, "dur("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, p0, Lo5/q;->c:J

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-wide v5, p0, Lo5/q;->b:J

    cmp-long p1, v5, v3

    if-eqz p1, :cond_1

    const-string p1, "dly("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lo5/q;->b:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object p1, p0, Lo5/q;->d:Landroid/animation/TimeInterpolator;

    if-eqz p1, :cond_2

    const-string p1, "interp("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lo5/q;->d:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object p1, p0, Lo5/q;->e:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-gtz p1, :cond_3

    iget-object p1, p0, Lo5/q;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_8

    :cond_3
    const-string p1, "tgts("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lo5/q;->e:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const-string v1, ", "

    const/4 v2, 0x0

    if-lez p1, :cond_5

    move p1, v2

    :goto_0
    iget-object v3, p0, Lo5/q;->e:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge p1, v3, :cond_5

    if-lez p1, :cond_4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v3, p0, Lo5/q;->e:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lo5/q;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_7

    :goto_1
    iget-object p1, p0, Lo5/q;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v2, p1, :cond_7

    if-lez v2, :cond_6

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-object p1, p0, Lo5/q;->f:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public C()Lo5/q$e;
    .locals 1

    iget-object v0, p0, Lo5/q;->G:Lo5/q$e;

    return-object v0
.end method

.method public D()Landroid/animation/TimeInterpolator;
    .locals 1

    iget-object v0, p0, Lo5/q;->d:Landroid/animation/TimeInterpolator;

    return-object v0
.end method

.method public E(Landroid/view/View;Z)Lo5/d0;
    .locals 5

    iget-object v0, p0, Lo5/q;->r:Lo5/b0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lo5/q;->E(Landroid/view/View;Z)Lo5/d0;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Lo5/q;->t:Ljava/util/ArrayList;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo5/q;->u:Ljava/util/ArrayList;

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_5

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo5/d0;

    if-nez v4, :cond_3

    return-object v1

    :cond_3
    iget-object v4, v4, Lo5/d0;->b:Landroid/view/View;

    if-ne v4, p1, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    const/4 v3, -0x1

    :goto_2
    if-ltz v3, :cond_7

    if-eqz p2, :cond_6

    iget-object p1, p0, Lo5/q;->u:Ljava/util/ArrayList;

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lo5/q;->t:Ljava/util/ArrayList;

    :goto_3
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo5/d0;

    return-object p1

    :cond_7
    return-object v1
.end method

.method public G()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lo5/q;->a:Ljava/lang/String;

    return-object v0
.end method

.method public J()Lo5/k;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lo5/q;->I:Lo5/k;

    return-object v0
.end method

.method public K()Lo5/z;
    .locals 1

    iget-object v0, p0, Lo5/q;->F:Lo5/z;

    return-object v0
.end method

.method public final N()Lo5/q;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lo5/q;->r:Lo5/b0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo5/q;->N()Lo5/q;

    move-result-object v0

    return-object v0

    :cond_0
    return-object p0
.end method

.method public P()J
    .locals 2

    iget-wide v0, p0, Lo5/q;->b:J

    return-wide v0
.end method

.method public Q()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo5/q;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method public R()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo5/q;->g:Ljava/util/ArrayList;

    return-object v0
.end method

.method public S()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lo5/q;->h:Ljava/util/ArrayList;

    return-object v0
.end method

.method public T()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lo5/q;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final U()J
    .locals 2

    iget-wide v0, p0, Lo5/q;->J:J

    return-wide v0
.end method

.method public V()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public W(Landroid/view/View;Z)Lo5/d0;
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lo5/q;->r:Lo5/b0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lo5/q;->W(Landroid/view/View;Z)Lo5/d0;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Lo5/q;->p:Lo5/e0;

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lo5/q;->q:Lo5/e0;

    :goto_0
    iget-object p2, p2, Lo5/e0;->a:Lw1/a;

    invoke-virtual {p2, p1}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo5/d0;

    return-object p1
.end method

.method public X()Z
    .locals 1

    iget-object v0, p0, Lo5/q;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public Y()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public Z(Lo5/d0;Lo5/d0;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lo5/q;->V()[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    array-length v3, v1

    move v4, v0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v1, v4

    invoke-static {p1, p2, v5}, Lo5/q;->b0(Lo5/d0;Lo5/d0;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    return v2

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p1, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {p1, p2, v3}, Lo5/q;->b0(Lo5/d0;Lo5/d0;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    return v2

    :cond_3
    return v0
.end method

.method public a0(Landroid/view/View;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lo5/q;->i:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v2

    :cond_0
    iget-object v1, p0, Lo5/q;->j:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lo5/q;->k:Ljava/util/ArrayList;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    iget-object v4, p0, Lo5/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    invoke-virtual {v4, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    return v2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lo5/q;->l:Ljava/util/ArrayList;

    if-eqz v1, :cond_4

    invoke-static {p1}, Landroidx/core/view/o0;->H(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lo5/q;->l:Ljava/util/ArrayList;

    invoke-static {p1}, Landroidx/core/view/o0;->H(Landroid/view/View;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lo5/q;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_7

    iget-object v1, p0, Lo5/q;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Lo5/q;->h:Ljava/util/ArrayList;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_5
    iget-object v1, p0, Lo5/q;->g:Ljava/util/ArrayList;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_6
    return v3

    :cond_7
    iget-object v1, p0, Lo5/q;->e:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Lo5/q;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_2

    :cond_8
    iget-object v0, p0, Lo5/q;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_9

    invoke-static {p1}, Landroidx/core/view/o0;->H(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    return v3

    :cond_9
    iget-object v0, p0, Lo5/q;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_b

    move v0, v2

    :goto_1
    iget-object v1, p0, Lo5/q;->h:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_b

    iget-object v1, p0, Lo5/q;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    return v3

    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_b
    return v2

    :cond_c
    :goto_2
    return v3
.end method

.method public c(Lo5/q$h;)Lo5/q;
    .locals 1
    .param p1    # Lo5/q$h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lo5/q;->D:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo5/q;->D:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lo5/q;->D:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final c0(Lw1/a;Lw1/a;Landroid/util/SparseArray;Landroid/util/SparseArray;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw1/a<",
            "Landroid/view/View;",
            "Lo5/d0;",
            ">;",
            "Lw1/a<",
            "Landroid/view/View;",
            "Lo5/d0;",
            ">;",
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;",
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Lo5/q;->a0(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p3, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    invoke-virtual {p4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {p0, v3}, Lo5/q;->a0(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v2}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo5/d0;

    invoke-virtual {p2, v3}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo5/d0;

    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    iget-object v6, p0, Lo5/q;->t:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lo5/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2}, Lw1/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, v3}, Lw1/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public cancel()V
    .locals 4

    iget-object v0, p0, Lo5/q;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lo5/q;->x:Ljava/util/ArrayList;

    iget-object v2, p0, Lo5/q;->y:[Landroid/animation/Animator;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/animation/Animator;

    sget-object v2, Lo5/q;->M:[Landroid/animation/Animator;

    iput-object v2, p0, Lo5/q;->y:[Landroid/animation/Animator;

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    aget-object v2, v1, v0

    const/4 v3, 0x0

    aput-object v3, v1, v0

    invoke-virtual {v2}, Landroid/animation/Animator;->cancel()V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lo5/q;->y:[Landroid/animation/Animator;

    sget-object v0, Lo5/q$i;->c:Lo5/q$i;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo5/q;->i0(Lo5/q$i;Z)V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lo5/q;->r()Lo5/q;

    move-result-object v0

    return-object v0
.end method

.method public final d0(Lw1/a;Lw1/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw1/a<",
            "Landroid/view/View;",
            "Lo5/d0;",
            ">;",
            "Lw1/a<",
            "Landroid/view/View;",
            "Lo5/d0;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lw1/j;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p1, v0}, Lw1/j;->f(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Lo5/q;->a0(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p2, v1}, Lw1/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo5/d0;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {p0, v2}, Lo5/q;->a0(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v0}, Lw1/j;->i(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/d0;

    iget-object v3, p0, Lo5/q;->t:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lo5/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public e(Landroid/view/View;)Lo5/q;
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lo5/q;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final e0(Lw1/a;Lw1/a;Lw1/g;Lw1/g;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw1/a<",
            "Landroid/view/View;",
            "Lo5/d0;",
            ">;",
            "Lw1/a<",
            "Landroid/view/View;",
            "Lo5/d0;",
            ">;",
            "Lw1/g<",
            "Landroid/view/View;",
            ">;",
            "Lw1/g<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p3}, Lw1/g;->n()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p3, v1}, Lw1/g;->o(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Lo5/q;->a0(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p3, v1}, Lw1/g;->h(I)J

    move-result-wide v3

    invoke-virtual {p4, v3, v4}, Lw1/g;->e(J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {p0, v3}, Lo5/q;->a0(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v2}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo5/d0;

    invoke-virtual {p2, v3}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo5/d0;

    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    iget-object v6, p0, Lo5/q;->t:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lo5/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2}, Lw1/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, v3}, Lw1/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final f(Lw1/a;Lw1/a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw1/a<",
            "Landroid/view/View;",
            "Lo5/d0;",
            ">;",
            "Lw1/a<",
            "Landroid/view/View;",
            "Lo5/d0;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p1}, Lw1/j;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ge v1, v2, :cond_1

    invoke-virtual {p1, v1}, Lw1/j;->k(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/d0;

    iget-object v4, v2, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {p0, v4}, Lo5/q;->a0(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lo5/q;->t:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lo5/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p2}, Lw1/j;->size()I

    move-result p1

    if-ge v0, p1, :cond_3

    invoke-virtual {p2, v0}, Lw1/j;->k(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo5/d0;

    iget-object v1, p1, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {p0, v1}, Lo5/q;->a0(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lo5/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lo5/q;->t:Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final f0(Lw1/a;Lw1/a;Lw1/a;Lw1/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw1/a<",
            "Landroid/view/View;",
            "Lo5/d0;",
            ">;",
            "Lw1/a<",
            "Landroid/view/View;",
            "Lo5/d0;",
            ">;",
            "Lw1/a<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Lw1/a<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p3}, Lw1/j;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p3, v1}, Lw1/j;->k(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Lo5/q;->a0(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p3, v1}, Lw1/j;->f(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p4, v3}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {p0, v3}, Lo5/q;->a0(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v2}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo5/d0;

    invoke-virtual {p2, v3}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo5/d0;

    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    iget-object v6, p0, Lo5/q;->t:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lo5/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2}, Lw1/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, v3}, Lw1/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final g0(Lo5/e0;Lo5/e0;)V
    .locals 5

    new-instance v0, Lw1/a;

    iget-object v1, p1, Lo5/e0;->a:Lw1/a;

    invoke-direct {v0, v1}, Lw1/a;-><init>(Lw1/j;)V

    new-instance v1, Lw1/a;

    iget-object v2, p2, Lo5/e0;->a:Lw1/a;

    invoke-direct {v1, v2}, Lw1/a;-><init>(Lw1/j;)V

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lo5/q;->s:[I

    array-length v4, v3

    if-ge v2, v4, :cond_4

    aget v3, v3, v2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_1

    const/4 v4, 0x4

    if-eq v3, v4, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, p1, Lo5/e0;->c:Lw1/g;

    iget-object v4, p2, Lo5/e0;->c:Lw1/g;

    invoke-virtual {p0, v0, v1, v3, v4}, Lo5/q;->e0(Lw1/a;Lw1/a;Lw1/g;Lw1/g;)V

    goto :goto_1

    :cond_1
    iget-object v3, p1, Lo5/e0;->b:Landroid/util/SparseArray;

    iget-object v4, p2, Lo5/e0;->b:Landroid/util/SparseArray;

    invoke-virtual {p0, v0, v1, v3, v4}, Lo5/q;->c0(Lw1/a;Lw1/a;Landroid/util/SparseArray;Landroid/util/SparseArray;)V

    goto :goto_1

    :cond_2
    iget-object v3, p1, Lo5/e0;->d:Lw1/a;

    iget-object v4, p2, Lo5/e0;->d:Lw1/a;

    invoke-virtual {p0, v0, v1, v3, v4}, Lo5/q;->f0(Lw1/a;Lw1/a;Lw1/a;Lw1/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v0, v1}, Lo5/q;->d0(Lw1/a;Lw1/a;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v0, v1}, Lo5/q;->f(Lw1/a;Lw1/a;)V

    return-void
.end method

.method public final h0(Lo5/q;Lo5/q$i;Z)V
    .locals 5

    iget-object v0, p0, Lo5/q;->C:Lo5/q;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lo5/q;->h0(Lo5/q;Lo5/q$i;Z)V

    :cond_0
    iget-object v0, p0, Lo5/q;->D:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo5/q;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lo5/q;->v:[Lo5/q$h;

    if-nez v1, :cond_1

    new-array v1, v0, [Lo5/q$h;

    :cond_1
    const/4 v2, 0x0

    iput-object v2, p0, Lo5/q;->v:[Lo5/q$h;

    iget-object v3, p0, Lo5/q;->D:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lo5/q$h;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, v1, v3

    invoke-interface {p2, v4, p1, p3}, Lo5/q$i;->a(Lo5/q$h;Lo5/q;Z)V

    aput-object v2, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iput-object v1, p0, Lo5/q;->v:[Lo5/q$h;

    :cond_3
    return-void
.end method

.method public i(Landroid/animation/Animator;)V
    .locals 4

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lo5/q;->w()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lo5/q;->z()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lo5/q;->z()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    :cond_1
    invoke-virtual {p0}, Lo5/q;->P()J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    invoke-virtual {p0}, Lo5/q;->P()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setStartDelay(J)V

    :cond_2
    invoke-virtual {p0}, Lo5/q;->D()Landroid/animation/TimeInterpolator;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lo5/q;->D()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    :cond_3
    new-instance v0, Lo5/q$c;

    invoke-direct {v0, p0}, Lo5/q$c;-><init>(Lo5/q;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    return-void
.end method

.method public i0(Lo5/q$i;Z)V
    .locals 0

    invoke-virtual {p0, p0, p1, p2}, Lo5/q;->h0(Lo5/q;Lo5/q$i;Z)V

    return-void
.end method

.method public abstract j(Lo5/d0;)V
    .param p1    # Lo5/d0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public j0(Landroid/view/View;)V
    .locals 4

    iget-boolean p1, p0, Lo5/q;->B:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lo5/q;->x:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget-object v0, p0, Lo5/q;->x:Ljava/util/ArrayList;

    iget-object v1, p0, Lo5/q;->y:[Landroid/animation/Animator;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/animation/Animator;

    sget-object v1, Lo5/q;->M:[Landroid/animation/Animator;

    iput-object v1, p0, Lo5/q;->y:[Landroid/animation/Animator;

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    :goto_0
    if-ltz p1, :cond_0

    aget-object v2, v0, p1

    const/4 v3, 0x0

    aput-object v3, v0, p1

    invoke-virtual {v2}, Landroid/animation/Animator;->pause()V

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lo5/q;->y:[Landroid/animation/Animator;

    sget-object p1, Lo5/q$i;->d:Lo5/q$i;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo5/q;->i0(Lo5/q$i;Z)V

    iput-boolean v1, p0, Lo5/q;->A:Z

    :cond_1
    return-void
.end method

.method public final k(Landroid/view/View;Z)V
    .locals 5

    if-nez p1, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lo5/q;->i:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_5

    :cond_1
    iget-object v1, p0, Lo5/q;->j:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_5

    :cond_2
    iget-object v1, p0, Lo5/q;->k:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_4

    iget-object v4, p0, Lo5/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    invoke-virtual {v4, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_5

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_7

    new-instance v1, Lo5/d0;

    invoke-direct {v1, p1}, Lo5/d0;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_5

    invoke-virtual {p0, v1}, Lo5/q;->o(Lo5/d0;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0, v1}, Lo5/q;->j(Lo5/d0;)V

    :goto_1
    iget-object v3, v1, Lo5/d0;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v1}, Lo5/q;->n(Lo5/d0;)V

    if-eqz p2, :cond_6

    iget-object v3, p0, Lo5/q;->p:Lo5/e0;

    invoke-static {v3, p1, v1}, Lo5/q;->h(Lo5/e0;Landroid/view/View;Lo5/d0;)V

    goto :goto_2

    :cond_6
    iget-object v3, p0, Lo5/q;->q:Lo5/e0;

    invoke-static {v3, p1, v1}, Lo5/q;->h(Lo5/e0;Landroid/view/View;Lo5/d0;)V

    :cond_7
    :goto_2
    instance-of v1, p1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_c

    iget-object v1, p0, Lo5/q;->m:Ljava/util/ArrayList;

    if-eqz v1, :cond_8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_5

    :cond_8
    iget-object v0, p0, Lo5/q;->n:Ljava/util/ArrayList;

    if-eqz v0, :cond_9

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_5

    :cond_9
    iget-object v0, p0, Lo5/q;->o:Ljava/util/ArrayList;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v1, v2

    :goto_3
    if-ge v1, v0, :cond_b

    iget-object v3, p0, Lo5/q;->o:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_5

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_b
    check-cast p1, Landroid/view/ViewGroup;

    :goto_4
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v2, v0, :cond_c

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lo5/q;->k(Landroid/view/View;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_c
    :goto_5
    return-void
.end method

.method public k0(Landroid/view/ViewGroup;)V
    .locals 10
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo5/q;->t:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo5/q;->u:Ljava/util/ArrayList;

    iget-object v0, p0, Lo5/q;->p:Lo5/e0;

    iget-object v1, p0, Lo5/q;->q:Lo5/e0;

    invoke-virtual {p0, v0, v1}, Lo5/q;->g0(Lo5/e0;Lo5/e0;)V

    invoke-static {}, Lo5/q;->O()Lw1/a;

    move-result-object v0

    invoke-virtual {v0}, Lw1/j;->size()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object v2

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    :goto_0
    if-ltz v1, :cond_6

    invoke-virtual {v0, v1}, Lw1/j;->f(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    if-eqz v4, :cond_5

    invoke-virtual {v0, v4}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo5/q$d;

    if-eqz v5, :cond_5

    iget-object v6, v5, Lo5/q$d;->a:Landroid/view/View;

    if-eqz v6, :cond_5

    iget-object v6, v5, Lo5/q$d;->d:Landroid/view/WindowId;

    invoke-virtual {v2, v6}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v6, v5, Lo5/q$d;->c:Lo5/d0;

    iget-object v7, v5, Lo5/q$d;->a:Landroid/view/View;

    invoke-virtual {p0, v7, v3}, Lo5/q;->W(Landroid/view/View;Z)Lo5/d0;

    move-result-object v8

    invoke-virtual {p0, v7, v3}, Lo5/q;->E(Landroid/view/View;Z)Lo5/d0;

    move-result-object v9

    if-nez v8, :cond_0

    if-nez v9, :cond_0

    iget-object v9, p0, Lo5/q;->q:Lo5/e0;

    iget-object v9, v9, Lo5/e0;->a:Lw1/a;

    invoke-virtual {v9, v7}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Lo5/d0;

    :cond_0
    if-nez v8, :cond_1

    if-eqz v9, :cond_5

    :cond_1
    iget-object v7, v5, Lo5/q$d;->e:Lo5/q;

    invoke-virtual {v7, v6, v9}, Lo5/q;->Z(Lo5/d0;Lo5/d0;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v5, v5, Lo5/q$d;->e:Lo5/q;

    invoke-virtual {v5}, Lo5/q;->N()Lo5/q;

    move-result-object v6

    iget-object v6, v6, Lo5/q;->K:Lo5/q$g;

    if-eqz v6, :cond_2

    invoke-virtual {v4}, Landroid/animation/Animator;->cancel()V

    iget-object v6, v5, Lo5/q;->x:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0, v4}, Lw1/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v5, Lo5/q;->x:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_5

    sget-object v4, Lo5/q$i;->c:Lo5/q$i;

    const/4 v6, 0x0

    invoke-virtual {v5, v4, v6}, Lo5/q;->i0(Lo5/q$i;Z)V

    iget-boolean v4, v5, Lo5/q;->B:Z

    if-nez v4, :cond_5

    iput-boolean v3, v5, Lo5/q;->B:Z

    sget-object v4, Lo5/q$i;->b:Lo5/q$i;

    invoke-virtual {v5, v4, v6}, Lo5/q;->i0(Lo5/q$i;Z)V

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Landroid/animation/Animator;->isRunning()Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual {v4}, Landroid/animation/Animator;->isStarted()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v4}, Lw1/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    :goto_1
    invoke-virtual {v4}, Landroid/animation/Animator;->cancel()V

    :cond_5
    :goto_2
    add-int/lit8 v1, v1, -0x1

    goto/16 :goto_0

    :cond_6
    iget-object v6, p0, Lo5/q;->p:Lo5/e0;

    iget-object v7, p0, Lo5/q;->q:Lo5/e0;

    iget-object v8, p0, Lo5/q;->t:Ljava/util/ArrayList;

    iget-object v9, p0, Lo5/q;->u:Ljava/util/ArrayList;

    move-object v4, p0

    move-object v5, p1

    invoke-virtual/range {v4 .. v9}, Lo5/q;->t(Landroid/view/ViewGroup;Lo5/e0;Lo5/e0;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    iget-object p1, v4, Lo5/q;->K:Lo5/q$g;

    if-nez p1, :cond_7

    invoke-virtual {p0}, Lo5/q;->q0()V

    return-void

    :cond_7
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x22

    if-lt p1, v0, :cond_8

    invoke-virtual {p0}, Lo5/q;->l0()V

    iget-object p1, v4, Lo5/q;->K:Lo5/q$g;

    invoke-virtual {p1}, Lo5/q$g;->p()V

    iget-object p1, v4, Lo5/q;->K:Lo5/q$g;

    invoke-virtual {p1}, Lo5/q$g;->q()V

    :cond_8
    return-void
.end method

.method public l0()V
    .locals 11

    invoke-static {}, Lo5/q;->O()Lw1/a;

    move-result-object v0

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lo5/q;->J:J

    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Lo5/q;->E:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    iget-object v4, p0, Lo5/q;->E:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/animation/Animator;

    invoke-virtual {v0, v4}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo5/q$d;

    if-eqz v4, :cond_3

    if-eqz v5, :cond_3

    invoke-virtual {p0}, Lo5/q;->z()J

    move-result-wide v6

    cmp-long v6, v6, v1

    if-ltz v6, :cond_0

    iget-object v6, v5, Lo5/q$d;->f:Landroid/animation/Animator;

    invoke-virtual {p0}, Lo5/q;->z()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    :cond_0
    invoke-virtual {p0}, Lo5/q;->P()J

    move-result-wide v6

    cmp-long v6, v6, v1

    if-ltz v6, :cond_1

    iget-object v6, v5, Lo5/q$d;->f:Landroid/animation/Animator;

    invoke-virtual {p0}, Lo5/q;->P()J

    move-result-wide v7

    iget-object v9, v5, Lo5/q$d;->f:Landroid/animation/Animator;

    invoke-virtual {v9}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v9

    add-long/2addr v7, v9

    invoke-virtual {v6, v7, v8}, Landroid/animation/Animator;->setStartDelay(J)V

    :cond_1
    invoke-virtual {p0}, Lo5/q;->D()Landroid/animation/TimeInterpolator;

    move-result-object v6

    if-eqz v6, :cond_2

    iget-object v5, v5, Lo5/q$d;->f:Landroid/animation/Animator;

    invoke-virtual {p0}, Lo5/q;->D()Landroid/animation/TimeInterpolator;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    :cond_2
    iget-object v5, p0, Lo5/q;->x:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v5, p0, Lo5/q;->J:J

    invoke-static {v4}, Lo5/q$f;->a(Landroid/animation/Animator;)J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, p0, Lo5/q;->J:J

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lo5/q;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public m0(Lo5/q$h;)Lo5/q;
    .locals 1
    .param p1    # Lo5/q$h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lo5/q;->D:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo5/q;->C:Lo5/q;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lo5/q;->m0(Lo5/q$h;)Lo5/q;

    :cond_1
    iget-object p1, p0, Lo5/q;->D:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Lo5/q;->D:Ljava/util/ArrayList;

    :cond_2
    :goto_0
    return-object p0
.end method

.method public n(Lo5/d0;)V
    .locals 4

    iget-object v0, p0, Lo5/q;->F:Lo5/z;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo5/q;->F:Lo5/z;

    invoke-virtual {v0}, Lo5/z;->b()[Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_2

    iget-object v2, p1, Lo5/d0;->a:Ljava/util/Map;

    aget-object v3, v0, v1

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v0, p0, Lo5/q;->F:Lo5/z;

    invoke-virtual {v0, p1}, Lo5/z;->a(Lo5/d0;)V

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public n0(Landroid/view/View;)Lo5/q;
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lo5/q;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public abstract o(Lo5/d0;)V
    .param p1    # Lo5/d0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public o0(Landroid/view/View;)V
    .locals 4

    iget-boolean p1, p0, Lo5/q;->A:Z

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lo5/q;->B:Z

    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Lo5/q;->x:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget-object v1, p0, Lo5/q;->x:Ljava/util/ArrayList;

    iget-object v2, p0, Lo5/q;->y:[Landroid/animation/Animator;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/animation/Animator;

    sget-object v2, Lo5/q;->M:[Landroid/animation/Animator;

    iput-object v2, p0, Lo5/q;->y:[Landroid/animation/Animator;

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_0

    aget-object v2, v1, p1

    const/4 v3, 0x0

    aput-object v3, v1, p1

    invoke-virtual {v2}, Landroid/animation/Animator;->resume()V

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lo5/q;->y:[Landroid/animation/Animator;

    sget-object p1, Lo5/q$i;->e:Lo5/q$i;

    invoke-virtual {p0, p1, v0}, Lo5/q;->i0(Lo5/q$i;Z)V

    :cond_1
    iput-boolean v0, p0, Lo5/q;->A:Z

    :cond_2
    return-void
.end method

.method public p(Landroid/view/ViewGroup;Z)V
    .locals 5
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p2}, Lo5/q;->q(Z)V

    iget-object v0, p0, Lo5/q;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lo5/q;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lo5/q;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lo5/q;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1, p2}, Lo5/q;->k(Landroid/view/View;Z)V

    goto/16 :goto_7

    :cond_3
    :goto_0
    move v0, v1

    :goto_1
    iget-object v2, p0, Lo5/q;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_7

    iget-object v2, p0, Lo5/q;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_6

    new-instance v3, Lo5/d0;

    invoke-direct {v3, v2}, Lo5/d0;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_4

    invoke-virtual {p0, v3}, Lo5/q;->o(Lo5/d0;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0, v3}, Lo5/q;->j(Lo5/d0;)V

    :goto_2
    iget-object v4, v3, Lo5/d0;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v3}, Lo5/q;->n(Lo5/d0;)V

    if-eqz p2, :cond_5

    iget-object v4, p0, Lo5/q;->p:Lo5/e0;

    invoke-static {v4, v2, v3}, Lo5/q;->h(Lo5/e0;Landroid/view/View;Lo5/d0;)V

    goto :goto_3

    :cond_5
    iget-object v4, p0, Lo5/q;->q:Lo5/e0;

    invoke-static {v4, v2, v3}, Lo5/q;->h(Lo5/e0;Landroid/view/View;Lo5/d0;)V

    :cond_6
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    move p1, v1

    :goto_4
    iget-object v0, p0, Lo5/q;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_a

    iget-object v0, p0, Lo5/q;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    new-instance v2, Lo5/d0;

    invoke-direct {v2, v0}, Lo5/d0;-><init>(Landroid/view/View;)V

    if-eqz p2, :cond_8

    invoke-virtual {p0, v2}, Lo5/q;->o(Lo5/d0;)V

    goto :goto_5

    :cond_8
    invoke-virtual {p0, v2}, Lo5/q;->j(Lo5/d0;)V

    :goto_5
    iget-object v3, v2, Lo5/d0;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v2}, Lo5/q;->n(Lo5/d0;)V

    if-eqz p2, :cond_9

    iget-object v3, p0, Lo5/q;->p:Lo5/e0;

    invoke-static {v3, v0, v2}, Lo5/q;->h(Lo5/e0;Landroid/view/View;Lo5/d0;)V

    goto :goto_6

    :cond_9
    iget-object v3, p0, Lo5/q;->q:Lo5/e0;

    invoke-static {v3, v0, v2}, Lo5/q;->h(Lo5/e0;Landroid/view/View;Lo5/d0;)V

    :goto_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_a
    :goto_7
    if-nez p2, :cond_d

    iget-object p1, p0, Lo5/q;->H:Lw1/a;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lw1/j;->size()I

    move-result p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(I)V

    move v0, v1

    :goto_8
    if-ge v0, p1, :cond_b

    iget-object v2, p0, Lo5/q;->H:Lw1/a;

    invoke-virtual {v2, v0}, Lw1/j;->f(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lo5/q;->p:Lo5/e0;

    iget-object v3, v3, Lo5/e0;->d:Lw1/a;

    invoke-virtual {v3, v2}, Lw1/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_b
    :goto_9
    if-ge v1, p1, :cond_d

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_c

    iget-object v2, p0, Lo5/q;->H:Lw1/a;

    invoke-virtual {v2, v1}, Lw1/j;->k(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lo5/q;->p:Lo5/e0;

    iget-object v3, v3, Lo5/e0;->d:Lw1/a;

    invoke-virtual {v3, v2, v0}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_d
    return-void
.end method

.method public final p0(Landroid/animation/Animator;Lw1/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/animation/Animator;",
            "Lw1/a<",
            "Landroid/animation/Animator;",
            "Lo5/q$d;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    new-instance v0, Lo5/q$b;

    invoke-direct {v0, p0, p2}, Lo5/q$b;-><init>(Lo5/q;Lw1/a;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p0, p1}, Lo5/q;->i(Landroid/animation/Animator;)V

    :cond_0
    return-void
.end method

.method public q(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lo5/q;->p:Lo5/e0;

    iget-object p1, p1, Lo5/e0;->a:Lw1/a;

    invoke-virtual {p1}, Lw1/j;->clear()V

    iget-object p1, p0, Lo5/q;->p:Lo5/e0;

    iget-object p1, p1, Lo5/e0;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    iget-object p1, p0, Lo5/q;->p:Lo5/e0;

    iget-object p1, p1, Lo5/e0;->c:Lw1/g;

    invoke-virtual {p1}, Lw1/g;->a()V

    return-void

    :cond_0
    iget-object p1, p0, Lo5/q;->q:Lo5/e0;

    iget-object p1, p1, Lo5/e0;->a:Lw1/a;

    invoke-virtual {p1}, Lw1/j;->clear()V

    iget-object p1, p0, Lo5/q;->q:Lo5/e0;

    iget-object p1, p1, Lo5/e0;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    iget-object p1, p0, Lo5/q;->q:Lo5/e0;

    iget-object p1, p1, Lo5/e0;->c:Lw1/g;

    invoke-virtual {p1}, Lw1/g;->a()V

    return-void
.end method

.method public q0()V
    .locals 6

    invoke-virtual {p0}, Lo5/q;->z0()V

    invoke-static {}, Lo5/q;->O()Lw1/a;

    move-result-object v0

    iget-object v1, p0, Lo5/q;->E:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Landroid/animation/Animator;

    invoke-virtual {v0, v4}, Lw1/a;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p0}, Lo5/q;->z0()V

    invoke-virtual {p0, v4, v0}, Lo5/q;->p0(Landroid/animation/Animator;Lw1/a;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo5/q;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Lo5/q;->w()V

    return-void
.end method

.method public r()Lo5/q;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/q;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lo5/q;->E:Ljava/util/ArrayList;

    new-instance v1, Lo5/e0;

    invoke-direct {v1}, Lo5/e0;-><init>()V

    iput-object v1, v0, Lo5/q;->p:Lo5/e0;

    new-instance v1, Lo5/e0;

    invoke-direct {v1}, Lo5/e0;-><init>()V

    iput-object v1, v0, Lo5/q;->q:Lo5/e0;

    const/4 v1, 0x0

    iput-object v1, v0, Lo5/q;->t:Ljava/util/ArrayList;

    iput-object v1, v0, Lo5/q;->u:Ljava/util/ArrayList;

    iput-object v1, v0, Lo5/q;->K:Lo5/q$g;

    iput-object p0, v0, Lo5/q;->C:Lo5/q;

    iput-object v1, v0, Lo5/q;->D:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public r0(Z)V
    .locals 0

    iput-boolean p1, p0, Lo5/q;->w:Z

    return-void
.end method

.method public s(Landroid/view/ViewGroup;Lo5/d0;Lo5/d0;)Landroid/animation/Animator;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    return-object p1
.end method

.method public s0(JJ)V
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    invoke-virtual {v0}, Lo5/q;->U()J

    move-result-wide v3

    cmp-long v5, v1, p3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-gez v5, :cond_0

    move v5, v7

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    const-wide/16 v8, 0x0

    cmp-long v10, p3, v8

    if-gez v10, :cond_1

    cmp-long v11, v1, v8

    if-gez v11, :cond_2

    :cond_1
    cmp-long v11, p3, v3

    if-lez v11, :cond_3

    cmp-long v11, v1, v3

    if-gtz v11, :cond_3

    :cond_2
    iput-boolean v6, v0, Lo5/q;->B:Z

    sget-object v11, Lo5/q$i;->a:Lo5/q$i;

    invoke-virtual {v0, v11, v5}, Lo5/q;->i0(Lo5/q$i;Z)V

    :cond_3
    iget-object v11, v0, Lo5/q;->x:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    iget-object v12, v0, Lo5/q;->x:Ljava/util/ArrayList;

    iget-object v13, v0, Lo5/q;->y:[Landroid/animation/Animator;

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Landroid/animation/Animator;

    sget-object v13, Lo5/q;->M:[Landroid/animation/Animator;

    iput-object v13, v0, Lo5/q;->y:[Landroid/animation/Animator;

    :goto_1
    if-ge v6, v11, :cond_4

    aget-object v13, v12, v6

    const/4 v14, 0x0

    aput-object v14, v12, v6

    invoke-static {v13}, Lo5/q$f;->a(Landroid/animation/Animator;)J

    move-result-wide v14

    move-wide/from16 v16, v3

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    invoke-static {v3, v4, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    invoke-static {v13, v3, v4}, Lo5/q$f;->b(Landroid/animation/Animator;J)V

    add-int/lit8 v6, v6, 0x1

    move-wide/from16 v3, v16

    goto :goto_1

    :cond_4
    move-wide/from16 v16, v3

    iput-object v12, v0, Lo5/q;->y:[Landroid/animation/Animator;

    cmp-long v3, v1, v16

    if-lez v3, :cond_5

    cmp-long v4, p3, v16

    if-lez v4, :cond_6

    :cond_5
    cmp-long v1, v1, v8

    if-gez v1, :cond_8

    if-ltz v10, :cond_8

    :cond_6
    if-lez v3, :cond_7

    iput-boolean v7, v0, Lo5/q;->B:Z

    :cond_7
    sget-object v1, Lo5/q$i;->b:Lo5/q$i;

    invoke-virtual {v0, v1, v5}, Lo5/q;->i0(Lo5/q$i;Z)V

    :cond_8
    return-void
.end method

.method public t(Landroid/view/ViewGroup;Lo5/e0;Lo5/e0;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 22
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lo5/e0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lo5/e0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/ArrayList;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/ArrayList;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lo5/e0;",
            "Lo5/e0;",
            "Ljava/util/ArrayList<",
            "Lo5/d0;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lo5/d0;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v3, p0

    move-object/from16 v7, p1

    invoke-static {}, Lo5/q;->O()Lw1/a;

    move-result-object v8

    new-instance v9, Landroid/util/SparseIntArray;

    invoke-direct {v9}, Landroid/util/SparseIntArray;-><init>()V

    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-virtual {v3}, Lo5/q;->N()Lo5/q;

    move-result-object v0

    iget-object v0, v0, Lo5/q;->K:Lo5/q$g;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    move v12, v0

    goto :goto_0

    :cond_0
    const/4 v12, 0x0

    :goto_0
    const-wide v0, 0x7fffffffffffffffL

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v10, :cond_f

    move-object/from16 v14, p4

    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/d0;

    move-object/from16 v15, p5

    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo5/d0;

    if-eqz v2, :cond_1

    iget-object v6, v2, Lo5/d0;->c:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    const/4 v2, 0x0

    :cond_1
    if-eqz v4, :cond_2

    iget-object v6, v4, Lo5/d0;->c:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    const/4 v4, 0x0

    :cond_2
    if-nez v2, :cond_4

    if-nez v4, :cond_4

    :cond_3
    move/from16 v17, v10

    move/from16 v18, v12

    move/from16 v19, v13

    goto/16 :goto_7

    :cond_4
    if-eqz v2, :cond_5

    if-eqz v4, :cond_5

    invoke-virtual {v3, v2, v4}, Lo5/q;->Z(Lo5/d0;Lo5/d0;)Z

    move-result v6

    if-eqz v6, :cond_3

    :cond_5
    invoke-virtual {v3, v7, v2, v4}, Lo5/q;->s(Landroid/view/ViewGroup;Lo5/d0;Lo5/d0;)Landroid/animation/Animator;

    move-result-object v6

    if-eqz v6, :cond_3

    if-eqz v4, :cond_b

    iget-object v5, v4, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {v3}, Lo5/q;->V()[Ljava/lang/String;

    move-result-object v11

    move-object/from16 v16, v6

    if-eqz v11, :cond_a

    array-length v6, v11

    if-lez v6, :cond_a

    new-instance v6, Lo5/d0;

    invoke-direct {v6, v5}, Lo5/d0;-><init>(Landroid/view/View;)V

    move/from16 v17, v10

    move/from16 v18, v12

    move-object/from16 v10, p3

    iget-object v12, v10, Lo5/e0;->a:Lw1/a;

    invoke-virtual {v12, v5}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo5/d0;

    move/from16 v19, v13

    if-eqz v12, :cond_6

    const/4 v10, 0x0

    :goto_2
    array-length v13, v11

    if-ge v10, v13, :cond_6

    iget-object v13, v6, Lo5/d0;->a:Ljava/util/Map;

    move/from16 v20, v10

    aget-object v10, v11, v20

    move-object/from16 v21, v11

    iget-object v11, v12, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v13, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v10, v20, 0x1

    move-object/from16 v11, v21

    goto :goto_2

    :cond_6
    invoke-virtual {v8}, Lw1/j;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_3
    if-ge v11, v10, :cond_9

    invoke-virtual {v8, v11}, Lw1/j;->f(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/animation/Animator;

    invoke-virtual {v8, v12}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo5/q$d;

    iget-object v13, v12, Lo5/q$d;->c:Lo5/d0;

    if-eqz v13, :cond_7

    iget-object v13, v12, Lo5/q$d;->a:Landroid/view/View;

    if-ne v13, v5, :cond_7

    iget-object v13, v12, Lo5/q$d;->b:Ljava/lang/String;

    move-object/from16 v20, v5

    invoke-virtual {v3}, Lo5/q;->G()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v5, v12, Lo5/q$d;->c:Lo5/d0;

    invoke-virtual {v5, v6}, Lo5/d0;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/4 v5, 0x0

    goto :goto_4

    :cond_7
    move-object/from16 v20, v5

    :cond_8
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v5, v20

    goto :goto_3

    :cond_9
    move-object/from16 v20, v5

    move-object/from16 v5, v16

    goto :goto_4

    :cond_a
    move-object/from16 v20, v5

    move/from16 v17, v10

    move/from16 v18, v12

    move/from16 v19, v13

    move-object/from16 v5, v16

    const/4 v6, 0x0

    :goto_4
    move-object/from16 v16, v5

    move-object/from16 v5, v20

    goto :goto_5

    :cond_b
    move-object/from16 v16, v6

    move/from16 v17, v10

    move/from16 v18, v12

    move/from16 v19, v13

    iget-object v5, v2, Lo5/d0;->b:Landroid/view/View;

    const/4 v6, 0x0

    :goto_5
    if-eqz v16, :cond_e

    iget-object v10, v3, Lo5/q;->F:Lo5/z;

    if-eqz v10, :cond_c

    invoke-virtual {v10, v7, v3, v2, v4}, Lo5/z;->c(Landroid/view/ViewGroup;Lo5/q;Lo5/d0;Lo5/d0;)J

    move-result-wide v10

    iget-object v2, v3, Lo5/q;->E:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    long-to-int v4, v10

    invoke-virtual {v9, v2, v4}, Landroid/util/SparseIntArray;->put(II)V

    invoke-static {v10, v11, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    :cond_c
    move-wide v10, v0

    new-instance v0, Lo5/q$d;

    invoke-virtual {v3}, Lo5/q;->G()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object v4

    move-object v1, v5

    move-object v5, v6

    move-object/from16 v6, v16

    invoke-direct/range {v0 .. v6}, Lo5/q$d;-><init>(Landroid/view/View;Ljava/lang/String;Lo5/q;Landroid/view/WindowId;Lo5/d0;Landroid/animation/Animator;)V

    if-eqz v18, :cond_d

    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-virtual {v1, v6}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    goto :goto_6

    :cond_d
    move-object v1, v6

    :goto_6
    invoke-virtual {v8, v1, v0}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v3, Lo5/q;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide v0, v10

    :cond_e
    :goto_7
    add-int/lit8 v13, v19, 0x1

    move/from16 v10, v17

    move/from16 v12, v18

    goto/16 :goto_1

    :cond_f
    invoke-virtual {v9}, Landroid/util/SparseIntArray;->size()I

    move-result v2

    if-eqz v2, :cond_10

    const/4 v11, 0x0

    :goto_8
    invoke-virtual {v9}, Landroid/util/SparseIntArray;->size()I

    move-result v2

    if-ge v11, v2, :cond_10

    invoke-virtual {v9, v11}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v2

    iget-object v4, v3, Lo5/q;->E:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator;

    invoke-virtual {v8, v2}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q$d;

    invoke-virtual {v9, v11}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v4

    int-to-long v4, v4

    sub-long/2addr v4, v0

    iget-object v6, v2, Lo5/q$d;->f:Landroid/animation/Animator;

    invoke-virtual {v6}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v6

    add-long/2addr v4, v6

    iget-object v2, v2, Lo5/q$d;->f:Landroid/animation/Animator;

    invoke-virtual {v2, v4, v5}, Landroid/animation/Animator;->setStartDelay(J)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    :cond_10
    return-void
.end method

.method public t0(J)Lo5/q;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-wide p1, p0, Lo5/q;->c:J

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, ""

    invoke-virtual {p0, v0}, Lo5/q;->A0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u0(Lo5/q$e;)V
    .locals 0

    iput-object p1, p0, Lo5/q;->G:Lo5/q$e;

    return-void
.end method

.method public v()Lo5/a0;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lo5/q$g;

    invoke-direct {v0, p0}, Lo5/q$g;-><init>(Lo5/q;)V

    iput-object v0, p0, Lo5/q;->K:Lo5/q$g;

    invoke-virtual {p0, v0}, Lo5/q;->c(Lo5/q$h;)Lo5/q;

    iget-object v0, p0, Lo5/q;->K:Lo5/q$g;

    return-object v0
.end method

.method public v0(Landroid/animation/TimeInterpolator;)Lo5/q;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lo5/q;->d:Landroid/animation/TimeInterpolator;

    return-object p0
.end method

.method public w()V
    .locals 4

    iget v0, p0, Lo5/q;->z:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lo5/q;->z:I

    if-nez v0, :cond_4

    sget-object v0, Lo5/q$i;->b:Lo5/q$i;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Lo5/q;->i0(Lo5/q$i;Z)V

    move v0, v2

    :goto_0
    iget-object v3, p0, Lo5/q;->p:Lo5/e0;

    iget-object v3, v3, Lo5/e0;->c:Lw1/g;

    invoke-virtual {v3}, Lw1/g;->n()I

    move-result v3

    if-ge v0, v3, :cond_1

    iget-object v3, p0, Lo5/q;->p:Lo5/e0;

    iget-object v3, v3, Lo5/e0;->c:Lw1/g;

    invoke-virtual {v3, v0}, Lw1/g;->o(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {v3, v2}, Landroid/view/View;->setHasTransientState(Z)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_1
    iget-object v3, p0, Lo5/q;->q:Lo5/e0;

    iget-object v3, v3, Lo5/e0;->c:Lw1/g;

    invoke-virtual {v3}, Lw1/g;->n()I

    move-result v3

    if-ge v0, v3, :cond_3

    iget-object v3, p0, Lo5/q;->q:Lo5/e0;

    iget-object v3, v3, Lo5/e0;->c:Lw1/g;

    invoke-virtual {v3, v0}, Lw1/g;->o(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_2

    invoke-virtual {v3, v2}, Landroid/view/View;->setHasTransientState(Z)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iput-boolean v1, p0, Lo5/q;->B:Z

    :cond_4
    return-void
.end method

.method public w0(Lo5/k;)V
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lo5/q;->O:Lo5/k;

    iput-object p1, p0, Lo5/q;->I:Lo5/k;

    return-void

    :cond_0
    iput-object p1, p0, Lo5/q;->I:Lo5/k;

    return-void
.end method

.method public x(Landroid/view/ViewGroup;)V
    .locals 4

    invoke-static {}, Lo5/q;->O()Lw1/a;

    move-result-object v0

    invoke-virtual {v0}, Lw1/j;->size()I

    move-result v1

    if-eqz p1, :cond_2

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object p1

    new-instance v2, Lw1/a;

    invoke-direct {v2, v0}, Lw1/a;-><init>(Lw1/j;)V

    invoke-virtual {v0}, Lw1/j;->clear()V

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_2

    invoke-virtual {v2, v1}, Lw1/j;->k(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/q$d;

    iget-object v3, v0, Lo5/q$d;->a:Landroid/view/View;

    if-eqz v3, :cond_1

    iget-object v0, v0, Lo5/q$d;->d:Landroid/view/WindowId;

    invoke-virtual {p1, v0}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2, v1}, Lw1/j;->f(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->end()V

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public x0(Lo5/z;)V
    .locals 0

    iput-object p1, p0, Lo5/q;->F:Lo5/z;

    return-void
.end method

.method public y0(J)Lo5/q;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-wide p1, p0, Lo5/q;->b:J

    return-object p0
.end method

.method public z()J
    .locals 2

    iget-wide v0, p0, Lo5/q;->c:J

    return-wide v0
.end method

.method public z0()V
    .locals 2

    iget v0, p0, Lo5/q;->z:I

    if-nez v0, :cond_0

    sget-object v0, Lo5/q$i;->a:Lo5/q$i;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo5/q;->i0(Lo5/q$i;Z)V

    iput-boolean v1, p0, Lo5/q;->B:Z

    :cond_0
    iget v0, p0, Lo5/q;->z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo5/q;->z:I

    return-void
.end method
