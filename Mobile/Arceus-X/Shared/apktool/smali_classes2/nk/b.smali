.class public Lnk/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static h:Z


# instance fields
.field public a:Landroid/graphics/Rect;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Rect;IIIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnk/b;->a:Landroid/graphics/Rect;

    iput p2, p0, Lnk/b;->b:I

    iput p3, p0, Lnk/b;->c:I

    iput p4, p0, Lnk/b;->d:I

    iput p5, p0, Lnk/b;->e:I

    iput p6, p0, Lnk/b;->f:I

    iput p7, p0, Lnk/b;->g:I

    return-void
.end method

.method public static a(Landroid/view/View;Landroid/view/WindowManager;Landroid/view/View;Landroid/graphics/Rect;)Lnk/b;
    .locals 9

    const-string v0, "getInfo() ------ start ------"

    invoke-static {v0}, Lnk/b;->b(Ljava/lang/String;)V

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getInfo() sr:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/graphics/Rect;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnk/b;->b(Ljava/lang/String;)V

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInfo() ss:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/graphics/Point;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnk/b;->b(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    invoke-static {}, Lmk/d;->a()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    iget p1, v3, Landroid/graphics/Point;->y:I

    iget v3, v3, Landroid/graphics/Point;->x:I

    goto :goto_0

    :cond_0
    move p1, v4

    move v3, p1

    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "getInfo() sh1:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " sh2:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lnk/b;->b(Ljava/lang/String;)V

    if-le v1, p1, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move p0, v3

    move v3, p1

    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getInfo() sh:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lnk/b;->b(Ljava/lang/String;)V

    if-eqz p3, :cond_2

    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    goto :goto_2

    :cond_2
    iget p1, v2, Landroid/graphics/Rect;->bottom:I

    sub-int p1, v3, p1

    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getInfo() bm:"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnk/b;->b(Ljava/lang/String;)V

    iget v1, v0, Landroid/graphics/Point;->y:I

    sub-int v1, v3, v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "getInfo() sbh:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lnk/b;->b(Ljava/lang/String;)V

    if-eqz p3, :cond_3

    iget p2, p3, Landroid/graphics/Rect;->top:I

    :goto_3
    move v8, p2

    goto :goto_4

    :cond_3
    const/4 v5, 0x2

    new-array v5, v5, [I

    if-eqz p2, :cond_4

    invoke-virtual {p2, v5}, Landroid/view/View;->getLocationInWindow([I)V

    :cond_4
    const/4 p2, 0x1

    aget p2, v5, p2

    goto :goto_3

    :goto_4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getInfo() top:"

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lnk/b;->b(Ljava/lang/String;)V

    iget p2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-static {}, Lmk/d;->b()Z

    move-result v5

    if-eqz v5, :cond_5

    iget v5, v2, Landroid/graphics/Rect;->top:I

    if-ge v8, v5, :cond_5

    const-string v5, "getInfo() adjusting top margin"

    invoke-static {v5}, Lnk/b;->b(Ljava/lang/String;)V

    iget v5, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr p2, v5

    sub-int/2addr v1, v5

    :cond_5
    move v7, p2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getInfo() kby:"

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lnk/b;->b(Ljava/lang/String;)V

    if-eqz p3, :cond_6

    iget p0, p3, Landroid/graphics/Rect;->right:I

    :goto_5
    move v5, p0

    goto :goto_6

    :cond_6
    iget p2, v0, Landroid/graphics/Point;->x:I

    sub-int/2addr p0, p2

    goto :goto_5

    :goto_6
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "getInfo() rsbw:"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lnk/b;->b(Ljava/lang/String;)V

    invoke-static {}, Lmk/d;->a()Z

    move-result p0

    if-eqz p0, :cond_7

    move p0, v4

    goto :goto_7

    :cond_7
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p0

    :goto_7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "getInfo() rsbh:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lnk/b;->b(Ljava/lang/String;)V

    sub-int/2addr p1, v1

    invoke-static {v4, p1}, Ljava/lang/Math;->max(II)I

    move-result v6

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "getInfo() kbh:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lnk/b;->b(Ljava/lang/String;)V

    new-instance v1, Lnk/b;

    move v4, p0

    invoke-direct/range {v1 .. v8}, Lnk/b;-><init>(Landroid/graphics/Rect;IIIIII)V

    return-object v1
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    sget-boolean v0, Lnk/b;->h:Z

    if-eqz v0, :cond_0

    const-string v0, "rbx.screen"

    invoke-static {v0, p0}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnk/b;

    if-eqz v1, :cond_1

    check-cast p1, Lnk/b;

    iget-object v1, p1, Lnk/b;->a:Landroid/graphics/Rect;

    iget-object v2, p0, Lnk/b;->a:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p1, Lnk/b;->b:I

    iget v2, p0, Lnk/b;->b:I

    if-ne v1, v2, :cond_1

    iget v1, p1, Lnk/b;->c:I

    iget v2, p0, Lnk/b;->c:I

    if-ne v1, v2, :cond_1

    iget v1, p1, Lnk/b;->d:I

    iget v2, p0, Lnk/b;->d:I

    if-ne v1, v2, :cond_1

    iget v1, p1, Lnk/b;->e:I

    iget v2, p0, Lnk/b;->e:I

    if-ne v1, v2, :cond_1

    iget v1, p1, Lnk/b;->f:I

    iget v2, p0, Lnk/b;->f:I

    if-ne v1, v2, :cond_1

    iget p1, p1, Lnk/b;->g:I

    iget v1, p0, Lnk/b;->g:I

    if-ne p1, v1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
