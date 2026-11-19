.class public final Led/f;
.super Led/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Led/b;",
        ">",
        "Led/g;"
    }
.end annotation


# static fields
.field public static final u:Lz3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz3/c<",
            "Led/f<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field public p:Led/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Led/h<",
            "TS;>;"
        }
    .end annotation
.end field

.field public final q:Lz3/f;

.field public final r:Lz3/e;

.field public final s:Led/h$a;

.field public t:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Led/f$a;

    const-string v1, "indicatorLevel"

    invoke-direct {v0, v1}, Led/f$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Led/f;->u:Lz3/c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Led/b;Led/h;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Led/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Led/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Led/b;",
            "Led/h<",
            "TS;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Led/g;-><init>(Landroid/content/Context;Led/b;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Led/f;->t:Z

    invoke-virtual {p0, p3}, Led/f;->y(Led/h;)V

    new-instance p1, Led/h$a;

    invoke-direct {p1}, Led/h$a;-><init>()V

    iput-object p1, p0, Led/f;->s:Led/h$a;

    new-instance p1, Lz3/f;

    invoke-direct {p1}, Lz3/f;-><init>()V

    iput-object p1, p0, Led/f;->q:Lz3/f;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2}, Lz3/f;->d(F)Lz3/f;

    const/high16 p3, 0x42480000    # 50.0f

    invoke-virtual {p1, p3}, Lz3/f;->f(F)Lz3/f;

    new-instance p3, Lz3/e;

    sget-object v0, Led/f;->u:Lz3/c;

    invoke-direct {p3, p0, v0}, Lz3/e;-><init>(Ljava/lang/Object;Lz3/c;)V

    iput-object p3, p0, Led/f;->r:Lz3/e;

    invoke-virtual {p3, p1}, Lz3/e;->w(Lz3/f;)Lz3/e;

    invoke-virtual {p0, p2}, Led/g;->n(F)V

    return-void
.end method

.method public static synthetic t(Led/f;)F
    .locals 0

    invoke-virtual {p0}, Led/f;->x()F

    move-result p0

    return p0
.end method

.method public static synthetic u(Led/f;F)V
    .locals 0

    invoke-virtual {p0, p1}, Led/f;->z(F)V

    return-void
.end method

.method public static v(Landroid/content/Context;Led/e;Led/c;)Led/f;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Led/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Led/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Led/e;",
            "Led/c;",
            ")",
            "Led/f<",
            "Led/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Led/f;

    invoke-direct {v0, p0, p1, p2}, Led/f;-><init>(Landroid/content/Context;Led/b;Led/h;)V

    return-object v0
.end method


# virtual methods
.method public A(F)V
    .locals 1

    const v0, 0x461c4000    # 10000.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 9
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, Led/f;->p:Led/h;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p0}, Led/g;->h()F

    move-result v3

    invoke-virtual {p0}, Led/f;->k()Z

    move-result v4

    invoke-virtual {p0}, Led/f;->j()Z

    move-result v5

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Led/h;->g(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V

    iget-object v0, p0, Led/g;->m:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Led/g;->m:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Led/f;->s:Led/h$a;

    iget-object v1, p0, Led/g;->b:Led/b;

    iget-object v2, v1, Led/b;->c:[I

    const/4 v8, 0x0

    aget v2, v2, v8

    iput v2, v0, Led/h$a;->c:I

    iget v0, v1, Led/b;->g:I

    if-lez v0, :cond_1

    int-to-float v0, v0

    invoke-virtual {p0}, Led/f;->x()F

    move-result v1

    const/4 v2, 0x0

    const v3, 0x3c23d70a    # 0.01f

    invoke-static {v1, v2, v3}, Ls2/a;->b(FFF)F

    move-result v1

    mul-float/2addr v0, v1

    div-float/2addr v0, v3

    float-to-int v7, v0

    iget-object v0, p0, Led/f;->p:Led/h;

    iget-object v2, p0, Led/g;->m:Landroid/graphics/Paint;

    invoke-virtual {p0}, Led/f;->x()F

    move-result v3

    iget-object v1, p0, Led/g;->b:Led/b;

    iget v5, v1, Led/b;->d:I

    invoke-virtual {p0}, Led/f;->getAlpha()I

    move-result v6

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Led/h;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Led/f;->p:Led/h;

    iget-object v2, p0, Led/g;->m:Landroid/graphics/Paint;

    iget v5, v1, Led/b;->d:I

    invoke-virtual {p0}, Led/f;->getAlpha()I

    move-result v6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Led/h;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    :goto_0
    iget-object v0, p0, Led/f;->p:Led/h;

    iget-object v2, p0, Led/g;->m:Landroid/graphics/Paint;

    iget-object v3, p0, Led/f;->s:Led/h$a;

    invoke-virtual {p0}, Led/f;->getAlpha()I

    move-result v4

    invoke-virtual {v0, p1, v2, v3, v4}, Led/h;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;Led/h$a;I)V

    iget-object v0, p0, Led/f;->p:Led/h;

    iget-object v2, p0, Led/g;->m:Landroid/graphics/Paint;

    iget-object v3, p0, Led/g;->b:Led/b;

    iget-object v3, v3, Led/b;->c:[I

    aget v3, v3, v8

    invoke-virtual {p0}, Led/f;->getAlpha()I

    move-result v4

    invoke-virtual {v0, p1, v2, v3, v4}, Led/h;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_2
    :goto_1
    return-void
.end method

.method public bridge synthetic getAlpha()I
    .locals 1

    invoke-super {p0}, Led/g;->getAlpha()I

    move-result v0

    return v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    iget-object v0, p0, Led/f;->p:Led/h;

    invoke-virtual {v0}, Led/h;->e()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, Led/f;->p:Led/h;

    invoke-virtual {v0}, Led/h;->f()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getOpacity()I
    .locals 1

    invoke-super {p0}, Led/g;->getOpacity()I

    move-result v0

    return v0
.end method

.method public bridge synthetic i()Z
    .locals 1

    invoke-super {p0}, Led/g;->i()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic isRunning()Z
    .locals 1

    invoke-super {p0}, Led/g;->isRunning()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic j()Z
    .locals 1

    invoke-super {p0}, Led/g;->j()Z

    move-result v0

    return v0
.end method

.method public jumpToCurrentState()V
    .locals 2

    iget-object v0, p0, Led/f;->r:Lz3/e;

    invoke-virtual {v0}, Lz3/e;->x()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x461c4000    # 10000.0f

    div-float/2addr v0, v1

    invoke-virtual {p0, v0}, Led/f;->z(F)V

    return-void
.end method

.method public bridge synthetic k()Z
    .locals 1

    invoke-super {p0}, Led/g;->k()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic m(Lq5/b;)V
    .locals 0
    .param p1    # Lq5/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Led/g;->m(Lq5/b;)V

    return-void
.end method

.method public onLevelChange(I)Z
    .locals 3

    iget-boolean v0, p0, Led/f;->t:Z

    const v1, 0x461c4000    # 10000.0f

    if-eqz v0, :cond_0

    iget-object v0, p0, Led/f;->r:Lz3/e;

    invoke-virtual {v0}, Lz3/e;->x()V

    int-to-float p1, p1

    div-float/2addr p1, v1

    invoke-virtual {p0, p1}, Led/f;->z(F)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Led/f;->r:Lz3/e;

    invoke-virtual {p0}, Led/f;->x()F

    move-result v2

    mul-float/2addr v2, v1

    invoke-virtual {v0, v2}, Lz3/b;->m(F)Lz3/b;

    iget-object v0, p0, Led/f;->r:Lz3/e;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Lz3/e;->s(F)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic q(ZZZ)Z
    .locals 0

    invoke-super {p0, p1, p2, p3}, Led/g;->q(ZZZ)Z

    move-result p1

    return p1
.end method

.method public r(ZZZ)Z
    .locals 1

    invoke-super {p0, p1, p2, p3}, Led/g;->r(ZZZ)Z

    move-result p1

    iget-object p2, p0, Led/g;->c:Led/a;

    iget-object p3, p0, Led/g;->a:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p3

    invoke-virtual {p2, p3}, Led/a;->a(Landroid/content/ContentResolver;)F

    move-result p2

    const/4 p3, 0x0

    cmpl-float p3, p2, p3

    if-nez p3, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p0, Led/f;->t:Z

    return p1

    :cond_0
    const/4 p3, 0x0

    iput-boolean p3, p0, Led/f;->t:Z

    iget-object p3, p0, Led/f;->q:Lz3/f;

    const/high16 v0, 0x42480000    # 50.0f

    div-float/2addr v0, p2

    invoke-virtual {p3, v0}, Lz3/f;->f(F)Lz3/f;

    return p1
.end method

.method public bridge synthetic s(Lq5/b;)Z
    .locals 0
    .param p1    # Lq5/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Led/g;->s(Lq5/b;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic setAlpha(I)V
    .locals 0

    invoke-super {p0, p1}, Led/g;->setAlpha(I)V

    return-void
.end method

.method public bridge synthetic setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    invoke-super {p0, p1}, Led/g;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public bridge synthetic setVisible(ZZ)Z
    .locals 0

    invoke-super {p0, p1, p2}, Led/g;->setVisible(ZZ)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic start()V
    .locals 0

    invoke-super {p0}, Led/g;->start()V

    return-void
.end method

.method public bridge synthetic stop()V
    .locals 0

    invoke-super {p0}, Led/g;->stop()V

    return-void
.end method

.method public w()Led/h;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Led/h<",
            "TS;>;"
        }
    .end annotation

    iget-object v0, p0, Led/f;->p:Led/h;

    return-object v0
.end method

.method public final x()F
    .locals 1

    iget-object v0, p0, Led/f;->s:Led/h$a;

    iget v0, v0, Led/h$a;->b:F

    return v0
.end method

.method public y(Led/h;)V
    .locals 0
    .param p1    # Led/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Led/h<",
            "TS;>;)V"
        }
    .end annotation

    iput-object p1, p0, Led/f;->p:Led/h;

    return-void
.end method

.method public final z(F)V
    .locals 1

    iget-object v0, p0, Led/f;->s:Led/h$a;

    iput p1, v0, Led/h$a;->b:F

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
