.class public Lvs/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvs/c$a;
    }
.end annotation


# static fields
.field public static final x:[F


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:Landroid/graphics/Typeface;

.field public final o:Landroid/graphics/Typeface;

.field public final p:I

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:Landroid/graphics/Typeface;

.field public final u:[F

.field public final v:I

.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x6

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Lvs/c;->x:[F

    return-void

    nop

    :array_0
    .array-data 4
        0x40000000    # 2.0f
        0x3fc00000    # 1.5f
        0x3f95c28f    # 1.17f
        0x3f800000    # 1.0f
        0x3f547ae1    # 0.83f
        0x3f2b851f    # 0.67f
    .end array-data
.end method

.method public constructor <init>(Lvs/c$a;)V
    .locals 1
    .param p1    # Lvs/c$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lvs/c$a;->t(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->a:I

    invoke-static {p1}, Lvs/c$a;->s(Lvs/c$a;)Z

    move-result v0

    iput-boolean v0, p0, Lvs/c;->b:Z

    invoke-static {p1}, Lvs/c$a;->a(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->c:I

    invoke-static {p1}, Lvs/c$a;->c(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->d:I

    invoke-static {p1}, Lvs/c$a;->b(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->e:I

    invoke-static {p1}, Lvs/c$a;->u(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->f:I

    invoke-static {p1}, Lvs/c$a;->d(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->g:I

    invoke-static {p1}, Lvs/c$a;->e(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->h:I

    invoke-static {p1}, Lvs/c$a;->l(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->i:I

    invoke-static {p1}, Lvs/c$a;->i(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->j:I

    invoke-static {p1}, Lvs/c$a;->f(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->k:I

    invoke-static {p1}, Lvs/c$a;->g(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->l:I

    invoke-static {p1}, Lvs/c$a;->h(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->m:I

    invoke-static {p1}, Lvs/c$a;->n(Lvs/c$a;)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lvs/c;->n:Landroid/graphics/Typeface;

    invoke-static {p1}, Lvs/c$a;->k(Lvs/c$a;)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lvs/c;->o:Landroid/graphics/Typeface;

    invoke-static {p1}, Lvs/c$a;->m(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->p:I

    invoke-static {p1}, Lvs/c$a;->j(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->q:I

    invoke-static {p1}, Lvs/c$a;->p(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->r:I

    invoke-static {p1}, Lvs/c$a;->o(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->s:I

    invoke-static {p1}, Lvs/c$a;->r(Lvs/c$a;)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lvs/c;->t:Landroid/graphics/Typeface;

    invoke-static {p1}, Lvs/c$a;->q(Lvs/c$a;)[F

    move-result-object v0

    iput-object v0, p0, Lvs/c;->u:[F

    invoke-static {p1}, Lvs/c$a;->v(Lvs/c$a;)I

    move-result v0

    iput v0, p0, Lvs/c;->v:I

    invoke-static {p1}, Lvs/c$a;->w(Lvs/c$a;)I

    move-result p1

    iput p1, p0, Lvs/c;->w:I

    return-void
.end method

.method public static i(Landroid/content/Context;)Lvs/c$a;
    .locals 4
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lbt/b;->a(Landroid/content/Context;)Lbt/b;

    move-result-object p0

    new-instance v0, Lvs/c$a;

    invoke-direct {v0}, Lvs/c$a;-><init>()V

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Lbt/b;->b(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lvs/c$a;->B(I)Lvs/c$a;

    move-result-object v0

    const/16 v1, 0x18

    invoke-virtual {p0, v1}, Lbt/b;->b(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lvs/c$a;->x(I)Lvs/c$a;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {p0, v1}, Lbt/b;->b(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lvs/c$a;->y(I)Lvs/c$a;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lbt/b;->b(I)I

    move-result v3

    invoke-virtual {v0, v3}, Lvs/c$a;->A(I)Lvs/c$a;

    move-result-object v0

    invoke-virtual {p0, v2}, Lbt/b;->b(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lvs/c$a;->C(I)Lvs/c$a;

    move-result-object v0

    invoke-virtual {p0, v1}, Lbt/b;->b(I)I

    move-result p0

    invoke-virtual {v0, p0}, Lvs/c$a;->D(I)Lvs/c$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroid/graphics/Paint;)V
    .locals 2
    .param p1    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lvs/c;->e:I

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    const/16 v1, 0x19

    invoke-static {v0, v1}, Lbt/a;->a(II)I

    move-result v0

    :cond_0
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public b(Landroid/graphics/Paint;)V
    .locals 2
    .param p1    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lvs/c;->j:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lvs/c;->i:I

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    :cond_1
    iget-object v0, p0, Lvs/c;->o:Landroid/graphics/Typeface;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lvs/c;->n:Landroid/graphics/Typeface;

    :goto_1
    if-eqz v0, :cond_5

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget v0, p0, Lvs/c;->q:I

    if-lez v0, :cond_3

    goto :goto_2

    :cond_3
    iget v0, p0, Lvs/c;->p:I

    :goto_2
    if-lez v0, :cond_4

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_4
    return-void

    :cond_5
    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget v0, p0, Lvs/c;->q:I

    if-lez v0, :cond_6

    goto :goto_3

    :cond_6
    iget v0, p0, Lvs/c;->p:I

    :goto_3
    if-lez v0, :cond_7

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void

    :cond_7
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    const v1, 0x3f5eb852    # 0.87f

    mul-float/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method

.method public c(Landroid/graphics/Paint;)V
    .locals 2
    .param p1    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lvs/c;->i:I

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    iget-object v0, p0, Lvs/c;->n:Landroid/graphics/Typeface;

    if-eqz v0, :cond_2

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget v0, p0, Lvs/c;->p:I

    if-lez v0, :cond_1

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_1
    return-void

    :cond_2
    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget v0, p0, Lvs/c;->p:I

    if-lez v0, :cond_3

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void

    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    const v1, 0x3f5eb852    # 0.87f

    mul-float/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void
.end method

.method public d(Landroid/graphics/Paint;)V
    .locals 2
    .param p1    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lvs/c;->s:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    const/16 v1, 0x4b

    invoke-static {v0, v1}, Lbt/a;->a(II)I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget v0, p0, Lvs/c;->r:I

    if-ltz v0, :cond_1

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    :cond_1
    return-void
.end method

.method public e(Landroid/graphics/Paint;I)V
    .locals 3
    .param p1    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lvs/c;->t:Landroid/graphics/Typeface;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :goto_0
    iget-object v0, p0, Lvs/c;->u:[F

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lvs/c;->x:[F

    :goto_1
    if-eqz v0, :cond_2

    array-length v2, v0

    if-lt v2, p2, :cond_2

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    sub-int/2addr p2, v1

    aget p2, v0, p2

    mul-float/2addr v2, p2

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v0}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    move-result-object v0

    filled-new-array {p2, v0}, [Ljava/lang/Object;

    move-result-object p2

    const-string v0, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`"

    invoke-static {v1, v0, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Landroid/text/TextPaint;)V
    .locals 1
    .param p1    # Landroid/text/TextPaint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean v0, p0, Lvs/c;->b:Z

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    iget v0, p0, Lvs/c;->a:I

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void

    :cond_0
    iget v0, p1, Landroid/text/TextPaint;->linkColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public g(Landroid/graphics/Paint;)V
    .locals 1
    .param p1    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lvs/c;->f:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget v0, p0, Lvs/c;->g:I

    if-eqz v0, :cond_1

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    :cond_1
    return-void
.end method

.method public h(Landroid/graphics/Paint;)V
    .locals 2
    .param p1    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lvs/c;->v:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    const/16 v1, 0x19

    invoke-static {v0, v1}, Lbt/a;->a(II)I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget v0, p0, Lvs/c;->w:I

    if-ltz v0, :cond_1

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    :cond_1
    return-void
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lvs/c;->c:I

    return v0
.end method

.method public k()I
    .locals 2

    iget v0, p0, Lvs/c;->d:I

    if-nez v0, :cond_0

    iget v0, p0, Lvs/c;->c:I

    int-to-float v0, v0

    const/high16 v1, 0x3e800000    # 0.25f

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    :cond_0
    return v0
.end method

.method public l(I)I
    .locals 1

    iget v0, p0, Lvs/c;->c:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    iget v0, p0, Lvs/c;->h:I

    if-eqz v0, :cond_1

    if-le v0, p1, :cond_0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    :goto_0
    return p1
.end method

.method public m(Landroid/graphics/Paint;)I
    .locals 1
    .param p1    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lvs/c;->k:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result p1

    const/16 v0, 0x19

    invoke-static {p1, v0}, Lbt/a;->a(II)I

    move-result p1

    return p1
.end method

.method public n(Landroid/graphics/Paint;)I
    .locals 1
    .param p1    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lvs/c;->l:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lvs/c;->k:I

    :goto_0
    if-eqz v0, :cond_1

    return v0

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result p1

    const/16 v0, 0x19

    invoke-static {p1, v0}, Lbt/a;->a(II)I

    move-result p1

    return p1
.end method

.method public o()I
    .locals 1

    iget v0, p0, Lvs/c;->m:I

    return v0
.end method
