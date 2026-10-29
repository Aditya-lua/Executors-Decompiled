.class public Landroidx/core/graphics/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/graphics/k$a;
    }
.end annotation


# static fields
.field public static final a:Landroidx/core/graphics/q;

.field public static final b:Lw1/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/i<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field public static c:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "TypefaceCompat static init"

    invoke-static {v0}, Ln5/a;->c(Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    new-instance v0, Landroidx/core/graphics/p;

    invoke-direct {v0}, Landroidx/core/graphics/p;-><init>()V

    sput-object v0, Landroidx/core/graphics/k;->a:Landroidx/core/graphics/q;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, Landroidx/core/graphics/o;

    invoke-direct {v0}, Landroidx/core/graphics/o;-><init>()V

    sput-object v0, Landroidx/core/graphics/k;->a:Landroidx/core/graphics/q;

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    new-instance v0, Landroidx/core/graphics/n;

    invoke-direct {v0}, Landroidx/core/graphics/n;-><init>()V

    sput-object v0, Landroidx/core/graphics/k;->a:Landroidx/core/graphics/q;

    goto :goto_0

    :cond_2
    new-instance v0, Landroidx/core/graphics/m;

    invoke-direct {v0}, Landroidx/core/graphics/m;-><init>()V

    sput-object v0, Landroidx/core/graphics/k;->a:Landroidx/core/graphics/q;

    :goto_0
    new-instance v0, Lw1/i;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lw1/i;-><init>(I)V

    sput-object v0, Landroidx/core/graphics/k;->b:Lw1/i;

    const/4 v0, 0x0

    sput-object v0, Landroidx/core/graphics/k;->c:Landroid/graphics/Paint;

    invoke-static {}, Ln5/a;->f()V

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Context cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Landroid/content/Context;Landroid/os/CancellationSignal;[Lv2/g$b;I)Landroid/graphics/Typeface;
    .locals 1

    const-string v0, "TypefaceCompat.createFromFontInfo"

    invoke-static {v0}, Ln5/a;->c(Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Landroidx/core/graphics/k;->a:Landroidx/core/graphics/q;

    invoke-virtual {v0, p0, p1, p2, p3}, Landroidx/core/graphics/q;->b(Landroid/content/Context;Landroid/os/CancellationSignal;[Lv2/g$b;I)Landroid/graphics/Typeface;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Ln5/a;->f()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {}, Ln5/a;->f()V

    throw p0
.end method

.method public static c(Landroid/content/Context;Landroid/os/CancellationSignal;Ljava/util/List;I)Landroid/graphics/Typeface;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/CancellationSignal;",
            "Ljava/util/List<",
            "[",
            "Lv2/g$b;",
            ">;I)",
            "Landroid/graphics/Typeface;"
        }
    .end annotation

    const-string v0, "TypefaceCompat.createFromFontInfoWithFallback"

    invoke-static {v0}, Ln5/a;->c(Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Landroidx/core/graphics/k;->a:Landroidx/core/graphics/q;

    invoke-virtual {v0, p0, p1, p2, p3}, Landroidx/core/graphics/q;->c(Landroid/content/Context;Landroid/os/CancellationSignal;Ljava/util/List;I)Landroid/graphics/Typeface;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Ln5/a;->f()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {}, Ln5/a;->f()V

    throw p0
.end method

.method public static d(Landroid/content/Context;Ln2/e$b;Landroid/content/res/Resources;ILjava/lang/String;IILn2/h$f;Landroid/os/Handler;Z)Landroid/graphics/Typeface;
    .locals 12

    move-object/from16 v0, p7

    move-object/from16 v1, p8

    instance-of v2, p1, Ln2/e$e;

    if-eqz v2, :cond_5

    check-cast p1, Ln2/e$e;

    invoke-static {p1}, Landroidx/core/graphics/k;->i(Ln2/e$e;)Landroid/graphics/Typeface;

    move-result-object v2

    if-eqz v2, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0, v2, v1}, Ln2/h$f;->d(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    :cond_0
    sget-object p0, Landroidx/core/graphics/k;->b:Lw1/i;

    invoke-static/range {p2 .. p6}, Landroidx/core/graphics/k;->f(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v2}, Lw1/i;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :cond_1
    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p9, :cond_3

    invoke-virtual {p1}, Ln2/e$e;->a()I

    move-result v4

    if-nez v4, :cond_2

    :goto_0
    move v8, v3

    goto :goto_1

    :cond_2
    move v8, v2

    goto :goto_1

    :cond_3
    if-nez v0, :cond_2

    goto :goto_0

    :goto_1
    if-eqz p9, :cond_4

    invoke-virtual {p1}, Ln2/e$e;->d()I

    move-result v2

    :goto_2
    move v9, v2

    goto :goto_3

    :cond_4
    const/4 v2, -0x1

    goto :goto_2

    :goto_3
    invoke-static {v1}, Ln2/h$f;->e(Landroid/os/Handler;)Landroid/os/Handler;

    move-result-object v10

    new-instance v11, Landroidx/core/graphics/k$a;

    invoke-direct {v11, v0}, Landroidx/core/graphics/k$a;-><init>(Ln2/h$f;)V

    invoke-virtual {p1}, Ln2/e$e;->b()Ljava/util/List;

    move-result-object v6

    move-object v5, p0

    move/from16 v7, p6

    invoke-static/range {v5 .. v11}, Lv2/g;->c(Landroid/content/Context;Ljava/util/List;IZILandroid/os/Handler;Lv2/g$c;)Landroid/graphics/Typeface;

    move-result-object p0

    goto :goto_4

    :cond_5
    sget-object v2, Landroidx/core/graphics/k;->a:Landroidx/core/graphics/q;

    check-cast p1, Ln2/e$c;

    move/from16 v7, p6

    invoke-virtual {v2, p0, p1, p2, v7}, Landroidx/core/graphics/q;->a(Landroid/content/Context;Ln2/e$c;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object p0

    if-eqz v0, :cond_7

    if-eqz p0, :cond_6

    invoke-virtual {v0, p0, v1}, Ln2/h$f;->d(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    goto :goto_4

    :cond_6
    const/4 p1, -0x3

    invoke-virtual {v0, p1, v1}, Ln2/h$f;->c(ILandroid/os/Handler;)V

    :cond_7
    :goto_4
    if-eqz p0, :cond_8

    sget-object p1, Landroidx/core/graphics/k;->b:Lw1/i;

    invoke-static/range {p2 .. p6}, Landroidx/core/graphics/k;->f(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Lw1/i;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    return-object p0
.end method

.method public static e(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;
    .locals 6

    sget-object v0, Landroidx/core/graphics/k;->a:Landroidx/core/graphics/q;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/core/graphics/q;->d(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {v2, v3, v4, p4, v5}, Landroidx/core/graphics/k;->f(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Landroidx/core/graphics/k;->b:Lw1/i;

    invoke-virtual {p2, p1, p0}, Lw1/i;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public static f(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;
    .locals 1

    sget-object v0, Landroidx/core/graphics/k;->b:Lw1/i;

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/core/graphics/k;->f(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lw1/i;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Typeface;

    return-object p0
.end method

.method public static h(Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-static {p0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p0

    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v2, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v1

    if-eqz p0, :cond_1

    invoke-virtual {p0, v1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return-object p0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static i(Ln2/e$e;)Landroid/graphics/Typeface;
    .locals 8

    invoke-virtual {p0}, Ln2/e$e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Landroidx/core/graphics/k;->h(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ln2/e$e;->b()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv2/e;

    invoke-virtual {p0}, Lv2/e;->h()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/graphics/k;->h(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    const/4 v4, 0x0

    if-ge v0, v3, :cond_2

    return-object v4

    :cond_2
    move v0, v1

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_4

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv2/e;

    invoke-virtual {v3}, Lv2/e;->h()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroidx/core/graphics/k;->h(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    if-nez v3, :cond_3

    return-object v4

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    move-object v0, v4

    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_9

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv2/e;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v2

    if-ne v1, v5, :cond_5

    invoke-virtual {v3}, Lv2/e;->i()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v3}, Lv2/e;->h()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setSystemFallback(Ljava/lang/String;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Lv2/e;->h()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroidx/core/graphics/k;->h(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v5

    invoke-static {v5}, Landroidx/core/graphics/k;->j(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;

    move-result-object v5

    const-string v6, "TypefaceCompat"

    if-nez v5, :cond_6

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable identify the primary font for "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lv2/e;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Falling back to provider font."

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v6, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v4

    :cond_6
    invoke-virtual {v3}, Lv2/e;->i()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_7

    :try_start_0
    invoke-static {}, Landroidx/core/graphics/i;->a()V

    invoke-static {}, Landroidx/core/graphics/j;->a()V

    invoke-static {v5}, Landroidx/core/graphics/f;->a(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/Font$Builder;

    move-result-object v5

    invoke-virtual {v3}, Lv2/e;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/graphics/fonts/Font$Builder;->setFontVariationSettings(Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/fonts/Font$Builder;->build()Landroid/graphics/fonts/Font;

    move-result-object v3

    invoke-static {v3}, Landroidx/core/graphics/g;->a(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-string p0, "Failed to clone Font instance. Fall back to provider font."

    invoke-static {v6, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v4

    :cond_7
    invoke-static {v5}, Landroidx/core/graphics/g;->a(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    move-result-object v3

    :goto_2
    if-nez v0, :cond_8

    invoke-static {v3}, Landroidx/core/graphics/h;->a(Landroid/graphics/fonts/FontFamily;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    move-result-object v0

    goto :goto_3

    :cond_8
    invoke-virtual {v0, v3}, Landroid/graphics/Typeface$CustomFallbackBuilder;->addCustomFallback(Landroid/graphics/fonts/FontFamily;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    :cond_9
    :goto_4
    invoke-virtual {v0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static j(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;
    .locals 10

    sget-object v0, Landroidx/core/graphics/k;->c:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    sput-object v0, Landroidx/core/graphics/k;->c:Landroid/graphics/Paint;

    :cond_0
    sget-object v0, Landroidx/core/graphics/k;->c:Landroid/graphics/Paint;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    sget-object v0, Landroidx/core/graphics/k;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/4 v8, 0x0

    sget-object v9, Landroidx/core/graphics/k;->c:Landroid/graphics/Paint;

    const-string v1, " "

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Landroid/graphics/text/TextRunShaper;->shapeTextRun(Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)Landroid/graphics/text/PositionedGlyphs;

    move-result-object p0

    invoke-virtual {p0}, Landroid/graphics/text/PositionedGlyphs;->glyphCount()I

    move-result v0

    if-nez v0, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/graphics/text/PositionedGlyphs;->getFont(I)Landroid/graphics/fonts/Font;

    move-result-object p0

    return-object p0
.end method
