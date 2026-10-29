.class public Lf7/h0;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;
.implements Landroid/graphics/drawable/Animatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf7/h0$b;,
        Lf7/h0$a;
    }
.end annotation


# static fields
.field public static final T:Z

.field public static final U:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final V:Ljava/util/concurrent/Executor;


# instance fields
.field public A:Landroid/graphics/Canvas;

.field public B:Landroid/graphics/Rect;

.field public C:Landroid/graphics/RectF;

.field public D:Landroid/graphics/Paint;

.field public E:Landroid/graphics/Rect;

.field public F:Landroid/graphics/Rect;

.field public G:Landroid/graphics/RectF;

.field public H:Landroid/graphics/RectF;

.field public I:Landroid/graphics/Matrix;

.field public J:[F

.field public K:Landroid/graphics/Matrix;

.field public L:Z

.field public M:Lf7/a;

.field public final N:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

.field public final O:Ljava/util/concurrent/Semaphore;

.field public P:Landroid/os/Handler;

.field public Q:Ljava/lang/Runnable;

.field public final R:Ljava/lang/Runnable;

.field public S:F

.field public a:Lf7/i;

.field public final b:Ls7/h;

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Lf7/h0$b;

.field public final g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lf7/h0$a;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lk7/b;

.field public i:Ljava/lang/String;

.field public j:Lk7/a;

.field public k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field public l:Ljava/lang/String;

.field public final m:Lf7/j0;

.field public n:Z

.field public o:Z

.field public p:Lo7/c;

.field public q:I

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Lf7/x0;

.field public x:Z

.field public final y:Landroid/graphics/Matrix;

.field public z:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const/4 v0, 0x0

    sput-boolean v0, Lf7/h0;->T:Z

    const-string v0, "reduced-motion"

    const-string v1, "reducedmotion"

    const-string v2, "reduced motion"

    const-string v3, "reduced_motion"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lf7/h0;->U:Ljava/util/List;

    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v8, Ls7/f;

    invoke-direct {v8}, Ls7/f;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x2

    const-wide/16 v4, 0x23

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v1, Lf7/h0;->V:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    new-instance v0, Ls7/h;

    invoke-direct {v0}, Ls7/h;-><init>()V

    iput-object v0, p0, Lf7/h0;->b:Ls7/h;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lf7/h0;->c:Z

    const/4 v2, 0x0

    iput-boolean v2, p0, Lf7/h0;->d:Z

    iput-boolean v2, p0, Lf7/h0;->e:Z

    sget-object v3, Lf7/h0$b;->a:Lf7/h0$b;

    iput-object v3, p0, Lf7/h0;->f:Lf7/h0$b;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    new-instance v3, Lf7/j0;

    invoke-direct {v3}, Lf7/j0;-><init>()V

    iput-object v3, p0, Lf7/h0;->m:Lf7/j0;

    iput-boolean v2, p0, Lf7/h0;->n:Z

    iput-boolean v1, p0, Lf7/h0;->o:Z

    const/16 v3, 0xff

    iput v3, p0, Lf7/h0;->q:I

    iput-boolean v2, p0, Lf7/h0;->v:Z

    sget-object v3, Lf7/x0;->a:Lf7/x0;

    iput-object v3, p0, Lf7/h0;->w:Lf7/x0;

    iput-boolean v2, p0, Lf7/h0;->x:Z

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    iput-object v3, p0, Lf7/h0;->y:Landroid/graphics/Matrix;

    const/16 v3, 0x9

    new-array v3, v3, [F

    iput-object v3, p0, Lf7/h0;->J:[F

    iput-boolean v2, p0, Lf7/h0;->L:Z

    new-instance v2, Lf7/b0;

    invoke-direct {v2, p0}, Lf7/b0;-><init>(Lf7/h0;)V

    iput-object v2, p0, Lf7/h0;->N:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    new-instance v3, Ljava/util/concurrent/Semaphore;

    invoke-direct {v3, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v3, p0, Lf7/h0;->O:Ljava/util/concurrent/Semaphore;

    new-instance v1, Lf7/c0;

    invoke-direct {v1, p0}, Lf7/c0;-><init>(Lf7/h0;)V

    iput-object v1, p0, Lf7/h0;->R:Ljava/lang/Runnable;

    const v1, -0x800001

    iput v1, p0, Lf7/h0;->S:F

    invoke-virtual {v0, v2}, Ls7/a;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method

.method public static synthetic a(Lf7/h0;FLf7/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf7/h0;->O0(F)V

    return-void
.end method

.method public static synthetic b(Lf7/h0;Lf7/i;)V
    .locals 0

    invoke-virtual {p0}, Lf7/h0;->o0()V

    return-void
.end method

.method public static synthetic c(Lf7/h0;Ljava/lang/String;Lf7/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf7/h0;->I0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lf7/h0;ILf7/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf7/h0;->z0(I)V

    return-void
.end method

.method public static synthetic e(Lf7/h0;Lf7/i;)V
    .locals 0

    invoke-virtual {p0}, Lf7/h0;->j0()V

    return-void
.end method

.method public static synthetic f(Lf7/h0;Ljava/lang/String;Lf7/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf7/h0;->F0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic g(Lf7/h0;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-virtual {p0}, Lf7/h0;->F()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lf7/h0;->invalidateSelf()V

    return-void

    :cond_0
    iget-object p1, p0, Lf7/h0;->p:Lo7/c;

    if-eqz p1, :cond_1

    iget-object p0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {p0}, Ls7/h;->o()F

    move-result p0

    invoke-virtual {p1, p0}, Lo7/c;->M(F)V

    :cond_1
    return-void
.end method

.method public static synthetic h(Lf7/h0;ILf7/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf7/h0;->J0(I)V

    return-void
.end method

.method public static synthetic i(Lf7/h0;IILf7/i;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lf7/h0;->H0(II)V

    return-void
.end method

.method public static synthetic j(Lf7/h0;FLf7/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf7/h0;->L0(F)V

    return-void
.end method

.method public static synthetic k(Lf7/h0;)V
    .locals 2

    iget-object v0, p0, Lf7/h0;->p:Lo7/c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v1, p0, Lf7/h0;->O:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v1}, Ljava/util/concurrent/Semaphore;->acquire()V

    iget-object v1, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v1}, Ls7/h;->o()F

    move-result v1

    invoke-virtual {v0, v1}, Lo7/c;->M(F)V

    sget-boolean v0, Lf7/h0;->T:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lf7/h0;->L:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lf7/h0;->P:Landroid/os/Handler;

    if-nez v0, :cond_1

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lf7/h0;->P:Landroid/os/Handler;

    new-instance v0, Lf7/x;

    invoke-direct {v0, p0}, Lf7/x;-><init>(Lf7/h0;)V

    iput-object v0, p0, Lf7/h0;->Q:Ljava/lang/Runnable;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lf7/h0;->P:Landroid/os/Handler;

    iget-object v1, p0, Lf7/h0;->Q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    :cond_2
    iget-object p0, p0, Lf7/h0;->O:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    return-void

    :goto_1
    iget-object p0, p0, Lf7/h0;->O:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    throw v0
.end method

.method public static synthetic l(Lf7/h0;Ll7/e;Ljava/lang/Object;Lt7/c;Lf7/i;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lf7/h0;->r(Ll7/e;Ljava/lang/Object;Lt7/c;)V

    return-void
.end method

.method public static synthetic m(Lf7/h0;Ljava/lang/String;Lf7/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf7/h0;->K0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic n(Lf7/h0;)V
    .locals 1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public static synthetic o(Lf7/h0;FLf7/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf7/h0;->G0(F)V

    return-void
.end method

.method public static synthetic p(Lf7/h0;ILf7/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf7/h0;->E0(I)V

    return-void
.end method


# virtual methods
.method public A(Lf7/i0;Z)V
    .locals 1

    iget-object v0, p0, Lf7/h0;->m:Lf7/j0;

    invoke-virtual {v0, p1, p2}, Lf7/j0;->a(Lf7/i0;Z)Z

    move-result p1

    iget-object p2, p0, Lf7/h0;->a:Lf7/i;

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lf7/h0;->t()V

    :cond_0
    return-void
.end method

.method public A0(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-boolean p1, p0, Lf7/h0;->d:Z

    return-void
.end method

.method public B()V
    .locals 1

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->n()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lf7/h0$b;->a:Lf7/h0$b;

    iput-object v0, p0, Lf7/h0;->f:Lf7/h0$b;

    :cond_0
    return-void
.end method

.method public B0(Lf7/c;)V
    .locals 1

    iget-object v0, p0, Lf7/h0;->h:Lk7/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lk7/b;->d(Lf7/c;)V

    :cond_0
    return-void
.end method

.method public final C(II)V
    .locals 3

    iget-object v0, p0, Lf7/h0;->z:Landroid/graphics/Bitmap;

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-lt v0, p1, :cond_3

    iget-object v0, p0, Lf7/h0;->z:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-ge v0, p2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lf7/h0;->z:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-gt v0, p1, :cond_2

    iget-object v0, p0, Lf7/h0;->z:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-le v0, p2, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    iget-object v0, p0, Lf7/h0;->z:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    invoke-static {v0, v2, v2, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lf7/h0;->z:Landroid/graphics/Bitmap;

    iget-object p2, p0, Lf7/h0;->A:Landroid/graphics/Canvas;

    invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    iput-boolean v1, p0, Lf7/h0;->L:Z

    return-void

    :cond_3
    :goto_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lf7/h0;->z:Landroid/graphics/Bitmap;

    iget-object p2, p0, Lf7/h0;->A:Landroid/graphics/Canvas;

    invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    iput-boolean v1, p0, Lf7/h0;->L:Z

    return-void
.end method

.method public C0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf7/h0;->i:Ljava/lang/String;

    return-void
.end method

.method public final D()V
    .locals 1

    iget-object v0, p0, Lf7/h0;->A:Landroid/graphics/Canvas;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    iput-object v0, p0, Lf7/h0;->A:Landroid/graphics/Canvas;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lf7/h0;->H:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lf7/h0;->I:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lf7/h0;->K:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lf7/h0;->B:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lf7/h0;->C:Landroid/graphics/RectF;

    new-instance v0, Lg7/a;

    invoke-direct {v0}, Lg7/a;-><init>()V

    iput-object v0, p0, Lf7/h0;->D:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lf7/h0;->E:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lf7/h0;->F:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lf7/h0;->G:Landroid/graphics/RectF;

    return-void
.end method

.method public D0(Z)V
    .locals 0

    iput-boolean p1, p0, Lf7/h0;->n:Z

    return-void
.end method

.method public E()Lf7/a;
    .locals 1

    iget-object v0, p0, Lf7/h0;->M:Lf7/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lf7/e;->d()Lf7/a;

    move-result-object v0

    return-object v0
.end method

.method public E0(I)V
    .locals 2

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    new-instance v1, Lf7/s;

    invoke-direct {v1, p0, p1}, Lf7/s;-><init>(Lf7/h0;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    int-to-float p1, p1

    const v1, 0x3f7d70a4    # 0.99f

    add-float/2addr p1, v1

    invoke-virtual {v0, p1}, Ls7/h;->K(F)V

    return-void
.end method

.method public F()Z
    .locals 2

    invoke-virtual {p0}, Lf7/h0;->E()Lf7/a;

    move-result-object v0

    sget-object v1, Lf7/a;->b:Lf7/a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public F0(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    new-instance v1, Lf7/z;

    invoke-direct {v1, p0, p1}, Lf7/z;-><init>(Lf7/h0;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lf7/i;->l(Ljava/lang/String;)Ll7/h;

    move-result-object v0

    if-eqz v0, :cond_1

    iget p1, v0, Ll7/h;->b:F

    iget v0, v0, Ll7/h;->c:F

    add-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Lf7/h0;->E0(I)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot find marker with name "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public G(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    invoke-virtual {p0}, Lf7/h0;->N()Lk7/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lk7/b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public G0(F)V
    .locals 3

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    new-instance v1, Lf7/v;

    invoke-direct {v1, p0, p1}, Lf7/v;-><init>(Lf7/h0;F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v1, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Lf7/i;->p()F

    move-result v0

    iget-object v2, p0, Lf7/h0;->a:Lf7/i;

    invoke-virtual {v2}, Lf7/i;->f()F

    move-result v2

    invoke-static {v0, v2, p1}, Ls7/j;->i(FFF)F

    move-result p1

    invoke-virtual {v1, p1}, Ls7/h;->K(F)V

    return-void
.end method

.method public H()Z
    .locals 1

    iget-boolean v0, p0, Lf7/h0;->v:Z

    return v0
.end method

.method public H0(II)V
    .locals 2

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    new-instance v1, Lf7/w;

    invoke-direct {v1, p0, p1, p2}, Lf7/w;-><init>(Lf7/h0;II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    int-to-float p1, p1

    int-to-float p2, p2

    const v1, 0x3f7d70a4    # 0.99f

    add-float/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Ls7/h;->N(FF)V

    return-void
.end method

.method public I()Z
    .locals 1

    iget-boolean v0, p0, Lf7/h0;->o:Z

    return v0
.end method

.method public I0(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    new-instance v1, Lf7/r;

    invoke-direct {v1, p0, p1}, Lf7/r;-><init>(Lf7/h0;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lf7/i;->l(Ljava/lang/String;)Ll7/h;

    move-result-object v0

    if-eqz v0, :cond_1

    iget p1, v0, Ll7/h;->b:F

    float-to-int p1, p1

    iget v0, v0, Ll7/h;->c:F

    float-to-int v0, v0

    add-int/2addr v0, p1

    invoke-virtual {p0, p1, v0}, Lf7/h0;->H0(II)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot find marker with name "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public J()Lf7/i;
    .locals 1

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    return-object v0
.end method

.method public J0(I)V
    .locals 2

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    new-instance v1, Lf7/t;

    invoke-direct {v1, p0, p1}, Lf7/t;-><init>(Lf7/h0;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0, p1}, Ls7/h;->O(I)V

    return-void
.end method

.method public final K()Landroid/content/Context;
    .locals 3

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    instance-of v2, v0, Landroid/view/View;

    if-eqz v2, :cond_1

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public K0(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    new-instance v1, Lf7/a0;

    invoke-direct {v1, p0, p1}, Lf7/a0;-><init>(Lf7/h0;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lf7/i;->l(Ljava/lang/String;)Ll7/h;

    move-result-object v0

    if-eqz v0, :cond_1

    iget p1, v0, Ll7/h;->b:F

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Lf7/h0;->J0(I)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot find marker with name "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final L()Lk7/a;
    .locals 3

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lf7/h0;->j:Lk7/a;

    if-nez v0, :cond_1

    new-instance v0, Lk7/a;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lk7/a;-><init>(Landroid/graphics/drawable/Drawable$Callback;Lf7/b;)V

    iput-object v0, p0, Lf7/h0;->j:Lk7/a;

    iget-object v1, p0, Lf7/h0;->l:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lk7/a;->c(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lf7/h0;->j:Lk7/a;

    return-object v0
.end method

.method public L0(F)V
    .locals 2

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    new-instance v1, Lf7/e0;

    invoke-direct {v1, p0, p1}, Lf7/e0;-><init>(Lf7/h0;F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0}, Lf7/i;->p()F

    move-result v0

    iget-object v1, p0, Lf7/h0;->a:Lf7/i;

    invoke-virtual {v1}, Lf7/i;->f()F

    move-result v1

    invoke-static {v0, v1, p1}, Ls7/j;->i(FFF)F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Lf7/h0;->J0(I)V

    return-void
.end method

.method public M()I
    .locals 1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->p()F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public M0(Z)V
    .locals 1

    iget-boolean v0, p0, Lf7/h0;->s:Z

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean p1, p0, Lf7/h0;->s:Z

    iget-object v0, p0, Lf7/h0;->p:Lo7/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lo7/c;->K(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final N()Lk7/b;
    .locals 5

    iget-object v0, p0, Lf7/h0;->h:Lk7/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lf7/h0;->K()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2}, Lk7/b;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object v1, p0, Lf7/h0;->h:Lk7/b;

    :cond_0
    iget-object v0, p0, Lf7/h0;->h:Lk7/b;

    if-nez v0, :cond_1

    new-instance v0, Lk7/b;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v2

    iget-object v3, p0, Lf7/h0;->i:Ljava/lang/String;

    iget-object v4, p0, Lf7/h0;->a:Lf7/i;

    invoke-virtual {v4}, Lf7/i;->j()Ljava/util/Map;

    move-result-object v4

    invoke-direct {v0, v2, v3, v1, v4}, Lk7/b;-><init>(Landroid/graphics/drawable/Drawable$Callback;Ljava/lang/String;Lf7/c;Ljava/util/Map;)V

    iput-object v0, p0, Lf7/h0;->h:Lk7/b;

    :cond_1
    iget-object v0, p0, Lf7/h0;->h:Lk7/b;

    return-object v0
.end method

.method public N0(Z)V
    .locals 1

    iput-boolean p1, p0, Lf7/h0;->r:Z

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lf7/i;->v(Z)V

    :cond_0
    return-void
.end method

.method public O()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf7/h0;->i:Ljava/lang/String;

    return-object v0
.end method

.method public O0(F)V
    .locals 3

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    new-instance v1, Lf7/f0;

    invoke-direct {v1, p0, p1}, Lf7/f0;-><init>(Lf7/h0;F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    const-string v1, "Drawable#setProgress"

    if-eqz v0, :cond_1

    invoke-static {v1}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    iget-object v2, p0, Lf7/h0;->a:Lf7/i;

    invoke-virtual {v2, p1}, Lf7/i;->h(F)F

    move-result p1

    invoke-virtual {v0, p1}, Ls7/h;->J(F)V

    invoke-static {}, Lf7/e;->h()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {v1}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_2
    return-void
.end method

.method public P(Ljava/lang/String;)Lf7/k0;
    .locals 1

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0}, Lf7/i;->j()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf7/k0;

    return-object p1
.end method

.method public P0(Lf7/x0;)V
    .locals 0

    iput-object p1, p0, Lf7/h0;->w:Lf7/x0;

    invoke-virtual {p0}, Lf7/h0;->w()V

    return-void
.end method

.method public Q()Z
    .locals 1

    iget-boolean v0, p0, Lf7/h0;->n:Z

    return v0
.end method

.method public Q0(I)V
    .locals 1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    return-void
.end method

.method public R()Ll7/h;
    .locals 3

    sget-object v0, Lf7/h0;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lf7/h0;->a:Lf7/i;

    invoke-virtual {v2, v1}, Lf7/i;->l(Ljava/lang/String;)Ll7/h;

    move-result-object v1

    if-eqz v1, :cond_0

    :cond_1
    return-object v1
.end method

.method public R0(I)V
    .locals 1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0, p1}, Ls7/h;->setRepeatMode(I)V

    return-void
.end method

.method public S()F
    .locals 1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->r()F

    move-result v0

    return v0
.end method

.method public S0(Z)V
    .locals 0

    iput-boolean p1, p0, Lf7/h0;->e:Z

    return-void
.end method

.method public T()F
    .locals 1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->s()F

    move-result v0

    return v0
.end method

.method public T0(F)V
    .locals 1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0, p1}, Ls7/h;->P(F)V

    return-void
.end method

.method public U()Lf7/u0;
    .locals 1

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf7/i;->n()Lf7/u0;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public U0(Lf7/z0;)V
    .locals 0

    return-void
.end method

.method public V()F
    .locals 1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->o()F

    move-result v0

    return v0
.end method

.method public V0(Z)V
    .locals 1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0, p1}, Ls7/h;->Q(Z)V

    return-void
.end method

.method public W()Lf7/x0;
    .locals 1

    iget-boolean v0, p0, Lf7/h0;->x:Z

    if-eqz v0, :cond_0

    sget-object v0, Lf7/x0;->c:Lf7/x0;

    return-object v0

    :cond_0
    sget-object v0, Lf7/x0;->b:Lf7/x0;

    return-object v0
.end method

.method public final W0()Z
    .locals 4

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v2, p0, Lf7/h0;->S:F

    iget-object v3, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v3}, Ls7/h;->o()F

    move-result v3

    iput v3, p0, Lf7/h0;->S:F

    invoke-virtual {v0}, Lf7/i;->d()F

    move-result v0

    sub-float/2addr v3, v2

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v2

    mul-float/2addr v2, v0

    const/high16 v0, 0x42480000    # 50.0f

    cmpl-float v0, v2, v0

    if-ltz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public X()I
    .locals 1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    move-result v0

    return v0
.end method

.method public X0()Z
    .locals 1

    iget-object v0, p0, Lf7/h0;->k:Ljava/util/Map;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    invoke-virtual {v0}, Lf7/i;->c()Lw1/k;

    move-result-object v0

    invoke-virtual {v0}, Lw1/k;->j()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public Y()I
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getRepeatMode()I

    move-result v0

    return v0
.end method

.method public Z()F
    .locals 1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->t()F

    move-result v0

    return v0
.end method

.method public a0()Lf7/z0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public b0(Ll7/c;)Landroid/graphics/Typeface;
    .locals 3

    iget-object v0, p0, Lf7/h0;->k:Ljava/util/Map;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll7/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ll7/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;

    return-object p1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll7/c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll7/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lf7/h0;->L()Lk7/a;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Lk7/a;->b(Ll7/c;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c0()Z
    .locals 3

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getClipChildren()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    :cond_1
    return v2
.end method

.method public d0()Z
    .locals 1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ls7/h;->isRunning()Z

    move-result v0

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 4
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lf7/h0;->p:Lo7/c;

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {p0}, Lf7/h0;->F()Z

    move-result v1

    const-string v2, "Drawable#draw"

    if-eqz v1, :cond_1

    :try_start_0
    iget-object v3, p0, Lf7/h0;->O:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v3}, Ljava/util/concurrent/Semaphore;->acquire()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    :goto_0
    invoke-static {}, Lf7/e;->h()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lf7/h0;->W0()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v3}, Ls7/h;->o()F

    move-result v3

    invoke-virtual {p0, v3}, Lf7/h0;->O0(F)V

    :cond_3
    iget-boolean v3, p0, Lf7/h0;->e:Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_5

    :try_start_1
    iget-boolean v3, p0, Lf7/h0;->x:Z

    if-eqz v3, :cond_4

    invoke-virtual {p0, p1, v0}, Lf7/h0;->m0(Landroid/graphics/Canvas;Lo7/c;)V

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_4
    invoke-virtual {p0, p1}, Lf7/h0;->z(Landroid/graphics/Canvas;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :goto_1
    :try_start_2
    const-string v3, "Lottie crashed in draw!"

    invoke-static {v3, p1}, Ls7/e;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    iget-boolean v3, p0, Lf7/h0;->x:Z

    if-eqz v3, :cond_6

    invoke-virtual {p0, p1, v0}, Lf7/h0;->m0(Landroid/graphics/Canvas;Lo7/c;)V

    goto :goto_2

    :cond_6
    invoke-virtual {p0, p1}, Lf7/h0;->z(Landroid/graphics/Canvas;)V

    :goto_2
    const/4 p1, 0x0

    iput-boolean p1, p0, Lf7/h0;->L:Z
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {}, Lf7/e;->h()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {v2}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_7
    if-eqz v1, :cond_b

    iget-object p1, p0, Lf7/h0;->O:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p1}, Ljava/util/concurrent/Semaphore;->release()V

    invoke-virtual {v0}, Lo7/c;->P()F

    move-result p1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->o()F

    move-result v0

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_b

    :goto_3
    sget-object p1, Lf7/h0;->V:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lf7/h0;->R:Ljava/lang/Runnable;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_5

    :goto_4
    invoke-static {}, Lf7/e;->h()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-static {v2}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_8
    if-eqz v1, :cond_9

    iget-object v1, p0, Lf7/h0;->O:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v1}, Ljava/util/concurrent/Semaphore;->release()V

    invoke-virtual {v0}, Lo7/c;->P()F

    move-result v0

    iget-object v1, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v1}, Ls7/h;->o()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_9

    sget-object v0, Lf7/h0;->V:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lf7/h0;->R:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_9
    throw p1

    :catch_0
    invoke-static {}, Lf7/e;->h()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {v2}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_a
    if-eqz v1, :cond_b

    iget-object p1, p0, Lf7/h0;->O:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p1}, Ljava/util/concurrent/Semaphore;->release()V

    invoke-virtual {v0}, Lo7/c;->P()F

    move-result p1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->o()F

    move-result v0

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_b

    goto :goto_3

    :cond_b
    :goto_5
    return-void
.end method

.method public e0()Z
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->isRunning()Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lf7/h0;->f:Lf7/h0$b;

    sget-object v1, Lf7/h0$b;->b:Lf7/h0$b;

    if-eq v0, v1, :cond_2

    sget-object v1, Lf7/h0$b;->c:Lf7/h0$b;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public f0()Z
    .locals 1

    iget-boolean v0, p0, Lf7/h0;->t:Z

    return v0
.end method

.method public g0()Z
    .locals 1

    iget-boolean v0, p0, Lf7/h0;->u:Z

    return v0
.end method

.method public getAlpha()I
    .locals 1

    iget v0, p0, Lf7/h0;->q:I

    return v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    invoke-virtual {v0}, Lf7/i;->b()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    invoke-virtual {v0}, Lf7/i;->b()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    return v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public h0(Lf7/i0;)Z
    .locals 1

    iget-object v0, p0, Lf7/h0;->m:Lf7/j0;

    invoke-virtual {v0, p1}, Lf7/j0;->b(Lf7/i0;)Z

    move-result p1

    return p1
.end method

.method public i0()V
    .locals 1

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->w()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lf7/h0$b;->a:Lf7/h0$b;

    iput-object v0, p0, Lf7/h0;->f:Lf7/h0$b;

    :cond_0
    return-void
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public invalidateSelf()V
    .locals 2

    iget-boolean v0, p0, Lf7/h0;->L:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lf7/h0;->L:Z

    sget-boolean v0, Lf7/h0;->T:Z

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public isRunning()Z
    .locals 1

    invoke-virtual {p0}, Lf7/h0;->d0()Z

    move-result v0

    return v0
.end method

.method public j0()V
    .locals 2

    iget-object v0, p0, Lf7/h0;->p:Lo7/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    new-instance v1, Lf7/d0;

    invoke-direct {v1, p0}, Lf7/d0;-><init>(Lf7/h0;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {p0}, Lf7/h0;->w()V

    invoke-virtual {p0}, Lf7/h0;->K()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lf7/h0;->s(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lf7/h0;->X()I

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->x()V

    sget-object v0, Lf7/h0$b;->a:Lf7/h0$b;

    iput-object v0, p0, Lf7/h0;->f:Lf7/h0$b;

    goto :goto_0

    :cond_2
    sget-object v0, Lf7/h0$b;->b:Lf7/h0$b;

    iput-object v0, p0, Lf7/h0;->f:Lf7/h0$b;

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lf7/h0;->K()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lf7/h0;->s(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lf7/h0;->R()Ll7/h;

    move-result-object v0

    if-eqz v0, :cond_4

    iget v0, v0, Ll7/h;->b:F

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lf7/h0;->z0(I)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lf7/h0;->Z()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_5

    invoke-virtual {p0}, Lf7/h0;->T()F

    move-result v0

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lf7/h0;->S()F

    move-result v0

    :goto_1
    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lf7/h0;->z0(I)V

    :goto_2
    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->n()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lf7/h0$b;->a:Lf7/h0$b;

    iput-object v0, p0, Lf7/h0;->f:Lf7/h0$b;

    :cond_6
    return-void
.end method

.method public k0()V
    .locals 1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/a;->removeAllListeners()V

    return-void
.end method

.method public l0()V
    .locals 2

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/a;->removeAllUpdateListeners()V

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    iget-object v1, p0, Lf7/h0;->N:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v0, v1}, Ls7/a;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method

.method public final m0(Landroid/graphics/Canvas;Lo7/c;)V
    .locals 10

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-eqz v0, :cond_5

    if-nez p2, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0}, Lf7/h0;->D()V

    iget-object v0, p0, Lf7/h0;->I:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lf7/h0;->B:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    iget-object v0, p0, Lf7/h0;->B:Landroid/graphics/Rect;

    iget-object v1, p0, Lf7/h0;->C:Landroid/graphics/RectF;

    invoke-virtual {p0, v0, v1}, Lf7/h0;->x(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    iget-object v0, p0, Lf7/h0;->I:Landroid/graphics/Matrix;

    iget-object v1, p0, Lf7/h0;->C:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget-object v0, p0, Lf7/h0;->C:Landroid/graphics/RectF;

    iget-object v1, p0, Lf7/h0;->B:Landroid/graphics/Rect;

    invoke-virtual {p0, v0, v1}, Lf7/h0;->y(Landroid/graphics/RectF;Landroid/graphics/Rect;)V

    iget-boolean v0, p0, Lf7/h0;->o:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf7/h0;->H:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lf7/h0;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Lf7/h0;->getIntrinsicHeight()I

    move-result v4

    int-to-float v4, v4

    const/4 v5, 0x0

    invoke-virtual {v0, v5, v5, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lf7/h0;->H:Landroid/graphics/RectF;

    invoke-virtual {p2, v0, v1, v2}, Lo7/c;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    :goto_0
    iget-object v0, p0, Lf7/h0;->I:Landroid/graphics/Matrix;

    iget-object v3, p0, Lf7/h0;->H:Landroid/graphics/RectF;

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Lf7/h0;->getIntrinsicWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lf7/h0;->getIntrinsicHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v0, v4

    iget-object v4, p0, Lf7/h0;->H:Landroid/graphics/RectF;

    invoke-virtual {p0, v4, v3, v0}, Lf7/h0;->p0(Landroid/graphics/RectF;FF)V

    invoke-virtual {p0}, Lf7/h0;->c0()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, Lf7/h0;->H:Landroid/graphics/RectF;

    iget-object v5, p0, Lf7/h0;->B:Landroid/graphics/Rect;

    iget v6, v5, Landroid/graphics/Rect;->left:I

    int-to-float v6, v6

    iget v7, v5, Landroid/graphics/Rect;->top:I

    int-to-float v7, v7

    iget v8, v5, Landroid/graphics/Rect;->right:I

    int-to-float v8, v8

    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    int-to-float v5, v5

    invoke-virtual {v4, v6, v7, v8, v5}, Landroid/graphics/RectF;->intersect(FFFF)Z

    :cond_2
    iget-object v4, p0, Lf7/h0;->H:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    iget-object v5, p0, Lf7/h0;->H:Landroid/graphics/RectF;

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v5

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-int v5, v5

    if-lez v4, :cond_5

    if-gtz v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v4, v5}, Lf7/h0;->C(II)V

    iget-boolean v6, p0, Lf7/h0;->L:Z

    if-eqz v6, :cond_4

    iget-object v6, p0, Lf7/h0;->I:Landroid/graphics/Matrix;

    iget-object v7, p0, Lf7/h0;->J:[F

    invoke-virtual {v6, v7}, Landroid/graphics/Matrix;->getValues([F)V

    iget-object v6, p0, Lf7/h0;->J:[F

    aget v7, v6, v2

    const/4 v8, 0x4

    aget v6, v6, v8

    iget-object v8, p0, Lf7/h0;->y:Landroid/graphics/Matrix;

    iget-object v9, p0, Lf7/h0;->I:Landroid/graphics/Matrix;

    invoke-virtual {v8, v9}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v8, p0, Lf7/h0;->y:Landroid/graphics/Matrix;

    invoke-virtual {v8, v3, v0}, Landroid/graphics/Matrix;->preScale(FF)Z

    iget-object v0, p0, Lf7/h0;->y:Landroid/graphics/Matrix;

    iget-object v3, p0, Lf7/h0;->H:Landroid/graphics/RectF;

    iget v8, v3, Landroid/graphics/RectF;->left:F

    neg-float v8, v8

    iget v3, v3, Landroid/graphics/RectF;->top:F

    neg-float v3, v3

    invoke-virtual {v0, v8, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget-object v0, p0, Lf7/h0;->y:Landroid/graphics/Matrix;

    const/high16 v3, 0x3f800000    # 1.0f

    div-float v8, v3, v7

    div-float/2addr v3, v6

    invoke-virtual {v0, v8, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    iget-object v0, p0, Lf7/h0;->z:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v2}, Landroid/graphics/Bitmap;->eraseColor(I)V

    iget-object v0, p0, Lf7/h0;->A:Landroid/graphics/Canvas;

    sget-object v3, Ls7/m;->a:Landroid/graphics/Matrix;

    invoke-virtual {v0, v3}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lf7/h0;->A:Landroid/graphics/Canvas;

    invoke-virtual {v0, v7, v6}, Landroid/graphics/Canvas;->scale(FF)V

    iget-object v0, p0, Lf7/h0;->A:Landroid/graphics/Canvas;

    iget-object v3, p0, Lf7/h0;->y:Landroid/graphics/Matrix;

    iget v6, p0, Lf7/h0;->q:I

    invoke-virtual {p2, v0, v3, v6, v1}, Lo7/b;->i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V

    iget-object p2, p0, Lf7/h0;->I:Landroid/graphics/Matrix;

    iget-object v0, p0, Lf7/h0;->K:Landroid/graphics/Matrix;

    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    iget-object p2, p0, Lf7/h0;->K:Landroid/graphics/Matrix;

    iget-object v0, p0, Lf7/h0;->G:Landroid/graphics/RectF;

    iget-object v1, p0, Lf7/h0;->H:Landroid/graphics/RectF;

    invoke-virtual {p2, v0, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    iget-object p2, p0, Lf7/h0;->G:Landroid/graphics/RectF;

    iget-object v0, p0, Lf7/h0;->F:Landroid/graphics/Rect;

    invoke-virtual {p0, p2, v0}, Lf7/h0;->y(Landroid/graphics/RectF;Landroid/graphics/Rect;)V

    :cond_4
    iget-object p2, p0, Lf7/h0;->E:Landroid/graphics/Rect;

    invoke-virtual {p2, v2, v2, v4, v5}, Landroid/graphics/Rect;->set(IIII)V

    iget-object p2, p0, Lf7/h0;->z:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lf7/h0;->E:Landroid/graphics/Rect;

    iget-object v1, p0, Lf7/h0;->F:Landroid/graphics/Rect;

    iget-object v2, p0, Lf7/h0;->D:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public n0(Ll7/e;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/e;",
            ")",
            "Ljava/util/List<",
            "Ll7/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf7/h0;->p:Lo7/c;

    if-nez v0, :cond_0

    const-string p1, "Cannot resolve KeyPath. Composition is not set yet."

    invoke-static {p1}, Ls7/e;->c(Ljava/lang/String;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lf7/h0;->p:Lo7/c;

    new-instance v2, Ll7/e;

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/String;

    invoke-direct {v2, v4}, Ll7/e;-><init>([Ljava/lang/String;)V

    invoke-virtual {v1, p1, v3, v0, v2}, Lo7/b;->h(Ll7/e;ILjava/util/List;Ll7/e;)V

    return-object v0
.end method

.method public o0()V
    .locals 2

    iget-object v0, p0, Lf7/h0;->p:Lo7/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    new-instance v1, Lf7/y;

    invoke-direct {v1, p0}, Lf7/y;-><init>(Lf7/h0;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {p0}, Lf7/h0;->w()V

    invoke-virtual {p0}, Lf7/h0;->K()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lf7/h0;->s(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lf7/h0;->X()I

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->D()V

    sget-object v0, Lf7/h0$b;->a:Lf7/h0$b;

    iput-object v0, p0, Lf7/h0;->f:Lf7/h0$b;

    goto :goto_0

    :cond_2
    sget-object v0, Lf7/h0$b;->c:Lf7/h0$b;

    iput-object v0, p0, Lf7/h0;->f:Lf7/h0$b;

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lf7/h0;->K()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lf7/h0;->s(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lf7/h0;->Z()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    invoke-virtual {p0}, Lf7/h0;->T()F

    move-result v0

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lf7/h0;->S()F

    move-result v0

    :goto_1
    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lf7/h0;->z0(I)V

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->n()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lf7/h0$b;->a:Lf7/h0$b;

    iput-object v0, p0, Lf7/h0;->f:Lf7/h0$b;

    :cond_5
    return-void
.end method

.method public final p0(Landroid/graphics/RectF;FF)V
    .locals 3

    iget v0, p1, Landroid/graphics/RectF;->left:F

    mul-float/2addr v0, p2

    iget v1, p1, Landroid/graphics/RectF;->top:F

    mul-float/2addr v1, p3

    iget v2, p1, Landroid/graphics/RectF;->right:F

    mul-float/2addr v2, p2

    iget p2, p1, Landroid/graphics/RectF;->bottom:F

    mul-float/2addr p2, p3

    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public q(Landroid/animation/Animator$AnimatorListener;)V
    .locals 1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0, p1}, Ls7/a;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method public q0(Z)V
    .locals 0

    iput-boolean p1, p0, Lf7/h0;->t:Z

    return-void
.end method

.method public r(Ll7/e;Ljava/lang/Object;Lt7/c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ll7/e;",
            "TT;",
            "Lt7/c<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lf7/h0;->p:Lo7/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    new-instance v1, Lf7/u;

    invoke-direct {v1, p0, p1, p2, p3}, Lf7/u;-><init>(Lf7/h0;Ll7/e;Ljava/lang/Object;Lt7/c;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    sget-object v1, Ll7/e;->c:Ll7/e;

    const/4 v2, 0x1

    if-ne p1, v1, :cond_1

    invoke-virtual {v0, p2, p3}, Lo7/c;->c(Ljava/lang/Object;Lt7/c;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ll7/e;->d()Ll7/f;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll7/e;->d()Ll7/f;

    move-result-object p1

    invoke-interface {p1, p2, p3}, Ll7/f;->c(Ljava/lang/Object;Lt7/c;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1}, Lf7/h0;->n0(Ll7/e;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll7/e;

    invoke-virtual {v1}, Ll7/e;->d()Ll7/f;

    move-result-object v1

    invoke-interface {v1, p2, p3}, Ll7/f;->c(Ljava/lang/Object;Lt7/c;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    xor-int/2addr v2, p1

    :goto_1
    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lf7/h0;->invalidateSelf()V

    sget-object p1, Lf7/o0;->E:Ljava/lang/Float;

    if-ne p2, p1, :cond_4

    invoke-virtual {p0}, Lf7/h0;->V()F

    move-result p1

    invoke-virtual {p0, p1}, Lf7/h0;->O0(F)V

    :cond_4
    return-void
.end method

.method public r0(Z)V
    .locals 0

    iput-boolean p1, p0, Lf7/h0;->u:Z

    return-void
.end method

.method public s(Landroid/content/Context;)Z
    .locals 2

    iget-boolean v0, p0, Lf7/h0;->d:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lf7/h0;->c:Z

    if-eqz v0, :cond_1

    invoke-static {}, Lf7/e;->f()Lj7/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lj7/b;->a(Landroid/content/Context;)Lj7/a;

    move-result-object p1

    sget-object v0, Lj7/a;->a:Lj7/a;

    if-ne p1, v0, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public s0(Lf7/a;)V
    .locals 0

    iput-object p1, p0, Lf7/h0;->M:Lf7/a;

    return-void
.end method

.method public scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1, p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable$Callback;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public setAlpha(I)V
    .locals 0

    iput p1, p0, Lf7/h0;->q:I

    invoke-virtual {p0}, Lf7/h0;->invalidateSelf()V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    const-string p1, "Use addColorFilter instead."

    invoke-static {p1}, Ls7/e;->c(Ljava/lang/String;)V

    return-void
.end method

.method public setVisible(ZZ)Z
    .locals 1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p2

    if-eqz p1, :cond_1

    iget-object p1, p0, Lf7/h0;->f:Lf7/h0$b;

    sget-object v0, Lf7/h0$b;->b:Lf7/h0$b;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lf7/h0;->j0()V

    return p2

    :cond_0
    sget-object v0, Lf7/h0$b;->c:Lf7/h0$b;

    if-ne p1, v0, :cond_3

    invoke-virtual {p0}, Lf7/h0;->o0()V

    return p2

    :cond_1
    iget-object p1, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {p1}, Ls7/h;->isRunning()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lf7/h0;->i0()V

    sget-object p1, Lf7/h0$b;->c:Lf7/h0$b;

    iput-object p1, p0, Lf7/h0;->f:Lf7/h0$b;

    return p2

    :cond_2
    if-eqz v0, :cond_3

    sget-object p1, Lf7/h0$b;->a:Lf7/h0$b;

    iput-object p1, p0, Lf7/h0;->f:Lf7/h0$b;

    :cond_3
    return p2
.end method

.method public start()V
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lf7/h0;->j0()V

    return-void
.end method

.method public stop()V
    .locals 0

    invoke-virtual {p0}, Lf7/h0;->B()V

    return-void
.end method

.method public final t()V
    .locals 4

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lo7/c;

    invoke-static {v0}, Lq7/v;->a(Lf7/i;)Lo7/e;

    move-result-object v2

    invoke-virtual {v0}, Lf7/i;->k()Ljava/util/List;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3, v0}, Lo7/c;-><init>(Lf7/h0;Lo7/e;Ljava/util/List;Lf7/i;)V

    iput-object v1, p0, Lf7/h0;->p:Lo7/c;

    iget-boolean v0, p0, Lf7/h0;->s:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo7/c;->K(Z)V

    :cond_1
    iget-object v0, p0, Lf7/h0;->p:Lo7/c;

    iget-boolean v1, p0, Lf7/h0;->o:Z

    invoke-virtual {v0, v1}, Lo7/c;->Q(Z)V

    return-void
.end method

.method public t0(Z)V
    .locals 1

    iget-boolean v0, p0, Lf7/h0;->v:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Lf7/h0;->v:Z

    invoke-virtual {p0}, Lf7/h0;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public u()V
    .locals 1

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->cancel()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lf7/h0$b;->a:Lf7/h0$b;

    iput-object v0, p0, Lf7/h0;->f:Lf7/h0$b;

    :cond_0
    return-void
.end method

.method public u0(Z)V
    .locals 1

    iget-boolean v0, p0, Lf7/h0;->o:Z

    if-eq p1, v0, :cond_1

    iput-boolean p1, p0, Lf7/h0;->o:Z

    iget-object v0, p0, Lf7/h0;->p:Lo7/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lo7/c;->Q(Z)V

    :cond_0
    invoke-virtual {p0}, Lf7/h0;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1, p0, p2}, Landroid/graphics/drawable/Drawable$Callback;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    return-void
.end method

.method public v()V
    .locals 1

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->cancel()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lf7/h0$b;->a:Lf7/h0$b;

    iput-object v0, p0, Lf7/h0;->f:Lf7/h0$b;

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lf7/h0;->a:Lf7/i;

    iput-object v0, p0, Lf7/h0;->p:Lo7/c;

    iput-object v0, p0, Lf7/h0;->h:Lk7/b;

    const v0, -0x800001

    iput v0, p0, Lf7/h0;->S:F

    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v0}, Ls7/h;->k()V

    invoke-virtual {p0}, Lf7/h0;->invalidateSelf()V

    return-void
.end method

.method public v0(Lf7/i;)Z
    .locals 3

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lf7/h0;->L:Z

    invoke-virtual {p0}, Lf7/h0;->v()V

    iput-object p1, p0, Lf7/h0;->a:Lf7/i;

    invoke-virtual {p0}, Lf7/h0;->t()V

    iget-object v1, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v1, p1}, Ls7/h;->G(Lf7/i;)V

    iget-object v1, p0, Lf7/h0;->b:Ls7/h;

    invoke-virtual {v1}, Ls7/h;->getAnimatedFraction()F

    move-result v1

    invoke-virtual {p0, v1}, Lf7/h0;->O0(F)V

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf7/h0$a;

    if-eqz v2, :cond_1

    invoke-interface {v2, p1}, Lf7/h0$a;->a(Lf7/i;)V

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-boolean v1, p0, Lf7/h0;->r:Z

    invoke-virtual {p1, v1}, Lf7/i;->v(Z)V

    invoke-virtual {p0}, Lf7/h0;->w()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    instance-of v1, p1, Landroid/widget/ImageView;

    if-eqz v1, :cond_3

    check-cast p1, Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    return v0
.end method

.method public final w()V
    .locals 4

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lf7/h0;->w:Lf7/x0;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0}, Lf7/i;->q()Z

    move-result v3

    invoke-virtual {v0}, Lf7/i;->m()I

    move-result v0

    invoke-virtual {v1, v2, v3, v0}, Lf7/x0;->b(IZI)Z

    move-result v0

    iput-boolean v0, p0, Lf7/h0;->x:Z

    return-void
.end method

.method public w0(Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lf7/h0;->l:Ljava/lang/String;

    invoke-virtual {p0}, Lf7/h0;->L()Lk7/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lk7/a;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final x(Landroid/graphics/Rect;Landroid/graphics/RectF;)V
    .locals 3

    iget v0, p1, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    iget v1, p1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    iget v2, p1, Landroid/graphics/Rect;->right:I

    int-to-float v2, v2

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    invoke-virtual {p2, v0, v1, v2, p1}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public x0(Lf7/b;)V
    .locals 1

    iget-object v0, p0, Lf7/h0;->j:Lk7/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lk7/a;->d(Lf7/b;)V

    :cond_0
    return-void
.end method

.method public final y(Landroid/graphics/RectF;Landroid/graphics/Rect;)V
    .locals 5

    iget v0, p1, Landroid/graphics/RectF;->left:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    iget v1, p1, Landroid/graphics/RectF;->top:F

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    iget v2, p1, Landroid/graphics/RectF;->right:F

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    float-to-double v3, p1

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int p1, v3

    invoke-virtual {p2, v0, v1, v2, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public y0(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lf7/h0;->k:Ljava/util/Map;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lf7/h0;->k:Ljava/util/Map;

    invoke-virtual {p0}, Lf7/h0;->invalidateSelf()V

    return-void
.end method

.method public final z(Landroid/graphics/Canvas;)V
    .locals 6

    iget-object v0, p0, Lf7/h0;->p:Lo7/c;

    iget-object v1, p0, Lf7/h0;->a:Lf7/i;

    if-eqz v0, :cond_2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lf7/h0;->y:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v1}, Lf7/i;->b()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v1}, Lf7/i;->b()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v4, v1

    iget-object v1, p0, Lf7/h0;->y:Landroid/graphics/Matrix;

    iget v5, v2, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    iget v2, v2, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    invoke-virtual {v1, v5, v2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    iget-object v1, p0, Lf7/h0;->y:Landroid/graphics/Matrix;

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->preScale(FF)Z

    :cond_1
    iget-object v1, p0, Lf7/h0;->y:Landroid/graphics/Matrix;

    iget v2, p0, Lf7/h0;->q:I

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v1, v2, v3}, Lo7/b;->i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public z0(I)V
    .locals 2

    iget-object v0, p0, Lf7/h0;->a:Lf7/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lf7/h0;->g:Ljava/util/ArrayList;

    new-instance v1, Lf7/g0;

    invoke-direct {v1, p0, p1}, Lf7/g0;-><init>(Lf7/h0;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lf7/h0;->b:Ls7/h;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Ls7/h;->J(F)V

    return-void
.end method
