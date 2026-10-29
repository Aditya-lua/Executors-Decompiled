.class public final Lz3/j;
.super Lz3/e;
.source "SourceFile"


# static fields
.field public static g:Landroid/graphics/Paint;


# instance fields
.field public f:Landroid/text/TextPaint;


# direct methods
.method public constructor <init>(Lz3/i;)V
    .locals 0
    .param p1    # Lz3/i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Lz3/e;-><init>(Lz3/i;)V

    return-void
.end method

.method public static e()Landroid/graphics/Paint;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lz3/j;->g:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    sput-object v0, Lz3/j;->g:Landroid/graphics/Paint;

    invoke-static {}, Landroidx/emoji2/text/c;->c()Landroidx/emoji2/text/c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/emoji2/text/c;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v0, Lz3/j;->g:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    :cond_0
    sget-object v0, Lz3/j;->g:Landroid/graphics/Paint;

    return-object v0
.end method


# virtual methods
.method public final c(Ljava/lang/CharSequence;IILandroid/graphics/Paint;)Landroid/text/TextPaint;
    .locals 2

    instance-of v0, p1, Landroid/text/Spanned;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    check-cast p1, Landroid/text/Spanned;

    const-class v0, Landroid/text/style/CharacterStyle;

    invoke-interface {p1, p2, p3, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/text/style/CharacterStyle;

    array-length p2, p1

    if-eqz p2, :cond_3

    array-length p2, p1

    const/4 p3, 0x0

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    aget-object p2, p1, p3

    if-ne p2, p0, :cond_0

    goto :goto_1

    :cond_0
    iget-object p2, p0, Lz3/j;->f:Landroid/text/TextPaint;

    if-nez p2, :cond_1

    new-instance p2, Landroid/text/TextPaint;

    invoke-direct {p2}, Landroid/text/TextPaint;-><init>()V

    iput-object p2, p0, Lz3/j;->f:Landroid/text/TextPaint;

    :cond_1
    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    :goto_0
    array-length p4, p1

    if-ge p3, p4, :cond_2

    aget-object p4, p1, p3

    invoke-virtual {p4, p2}, Landroid/text/style/CharacterStyle;->updateDrawState(Landroid/text/TextPaint;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_2
    return-object p2

    :cond_3
    :goto_1
    instance-of p1, p4, Landroid/text/TextPaint;

    if-eqz p1, :cond_4

    check-cast p4, Landroid/text/TextPaint;

    return-object p4

    :cond_4
    return-object v1

    :cond_5
    instance-of p1, p4, Landroid/text/TextPaint;

    if-eqz p1, :cond_6

    check-cast p4, Landroid/text/TextPaint;

    return-object p4

    :cond_6
    return-object v1
.end method

.method public d(Landroid/graphics/Canvas;Landroid/text/TextPaint;FFFF)V
    .locals 4

    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    move-result-object v1

    iget v2, p2, Landroid/text/TextPaint;->bgColor:I

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move v3, p6

    move-object p6, p2

    move p2, p3

    move p3, p5

    move p5, v3

    invoke-virtual/range {p1 .. p6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    invoke-virtual {p6, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p6, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 10
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .param p9    # Landroid/graphics/Paint;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move/from16 v0, p6

    move/from16 v1, p8

    move-object/from16 v2, p9

    invoke-virtual {p0, p2, p3, p4, v2}, Lz3/j;->c(Ljava/lang/CharSequence;IILandroid/graphics/Paint;)Landroid/text/TextPaint;

    move-result-object v5

    if-eqz v5, :cond_0

    iget p2, v5, Landroid/text/TextPaint;->bgColor:I

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lz3/e;->b()I

    move-result p2

    int-to-float p2, p2

    add-float v7, p5, p2

    int-to-float v8, v0

    int-to-float v9, v1

    move-object v3, p0

    move-object v4, p1

    move v6, p5

    invoke-virtual/range {v3 .. v9}, Lz3/j;->d(Landroid/graphics/Canvas;Landroid/text/TextPaint;FFFF)V

    :cond_0
    move-object p2, v5

    invoke-static {}, Landroidx/emoji2/text/c;->c()Landroidx/emoji2/text/c;

    move-result-object p3

    invoke-virtual {p3}, Landroidx/emoji2/text/c;->j()Z

    move-result p3

    if-eqz p3, :cond_1

    int-to-float v5, v0

    invoke-virtual {p0}, Lz3/e;->b()I

    move-result p3

    int-to-float p3, p3

    add-float v6, p5, p3

    int-to-float v7, v1

    invoke-static {}, Lz3/j;->e()Landroid/graphics/Paint;

    move-result-object v8

    move-object v3, p1

    move v4, p5

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_1
    invoke-virtual {p0}, Lz3/e;->a()Lz3/i;

    move-result-object p3

    move/from16 p4, p7

    int-to-float p4, p4

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    move-object p2, v2

    :goto_0
    invoke-virtual {p3, p1, p5, p4, p2}, Lz3/i;->a(Landroid/graphics/Canvas;FFLandroid/graphics/Paint;)V

    return-void
.end method
