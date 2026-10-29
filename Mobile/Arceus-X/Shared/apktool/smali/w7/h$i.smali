.class public Lw7/h$i;
.super Lw7/h$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field public b:F

.field public c:F

.field public d:Landroid/graphics/RectF;

.field public final synthetic e:Lw7/h;


# direct methods
.method public constructor <init>(Lw7/h;FF)V
    .locals 1

    iput-object p1, p0, Lw7/h$i;->e:Lw7/h;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lw7/h$j;-><init>(Lw7/h;Lw7/h$a;)V

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lw7/h$i;->d:Landroid/graphics/RectF;

    iput p2, p0, Lw7/h$i;->b:F

    iput p3, p0, Lw7/h$i;->c:F

    return-void
.end method


# virtual methods
.method public a(Lw7/g$y0;)Z
    .locals 5

    instance-of v0, p1, Lw7/g$z0;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lw7/g$z0;

    iget-object p1, p1, Lw7/g$n0;->a:Lw7/g;

    iget-object v2, v0, Lw7/g$z0;->o:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lw7/g;->p(Ljava/lang/String;)Lw7/g$n0;

    move-result-object p1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    iget-object p1, v0, Lw7/g$z0;->o:Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "TextPath path reference \'%s\' not found"

    invoke-static {v0, p1}, Lw7/h;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_0
    check-cast p1, Lw7/g$v;

    new-instance v0, Lw7/h$d;

    iget-object v3, p0, Lw7/h$i;->e:Lw7/h;

    iget-object v4, p1, Lw7/g$v;->o:Lw7/g$w;

    invoke-direct {v0, v3, v4}, Lw7/h$d;-><init>(Lw7/h;Lw7/g$w;)V

    invoke-virtual {v0}, Lw7/h$d;->f()Landroid/graphics/Path;

    move-result-object v0

    iget-object p1, p1, Lw7/g$l;->n:Landroid/graphics/Matrix;

    if-eqz p1, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    :cond_1
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    invoke-virtual {v0, p1, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    iget-object v0, p0, Lw7/h$i;->d:Landroid/graphics/RectF;

    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    return v2

    :cond_2
    return v1
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lw7/h$i;->e:Lw7/h;

    invoke-static {v0}, Lw7/h;->b(Lw7/h;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iget-object v1, p0, Lw7/h$i;->e:Lw7/h;

    invoke-static {v1}, Lw7/h;->c(Lw7/h;)Lw7/h$h;

    move-result-object v1

    iget-object v1, v1, Lw7/h$h;->d:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, p1, v2, v3, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    iget v0, p0, Lw7/h$i;->b:F

    iget v2, p0, Lw7/h$i;->c:F

    invoke-virtual {v1, v0, v2}, Landroid/graphics/RectF;->offset(FF)V

    iget-object v0, p0, Lw7/h$i;->d:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    :cond_0
    iget v0, p0, Lw7/h$i;->b:F

    iget-object v1, p0, Lw7/h$i;->e:Lw7/h;

    invoke-static {v1}, Lw7/h;->c(Lw7/h;)Lw7/h$h;

    move-result-object v1

    iget-object v1, v1, Lw7/h$h;->d:Landroid/graphics/Paint;

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    add-float/2addr v0, p1

    iput v0, p0, Lw7/h$i;->b:F

    return-void
.end method
