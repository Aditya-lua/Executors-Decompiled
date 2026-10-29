.class public final Lo6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo6/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo6/n$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lo6/n;",
        "Lo6/j;",
        "Lk6/h0;",
        "data",
        "Lx6/p;",
        "options",
        "<init>",
        "(Lk6/h0;Lx6/p;)V",
        "Lo6/i;",
        "a",
        "(Lnt/b;)Ljava/lang/Object;",
        "",
        "b",
        "(Lk6/h0;)Ljava/lang/Void;",
        "Lk6/h0;",
        "Lx6/p;",
        "coil-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lk6/h0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lx6/p;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lk6/h0;Lx6/p;)V
    .locals 0
    .param p1    # Lk6/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/n;->a:Lk6/h0;

    iput-object p2, p0, Lo6/n;->b:Lx6/p;

    return-void
.end method


# virtual methods
.method public a(Lnt/b;)Ljava/lang/Object;
    .locals 11
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lo6/i;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p1, p0, Lo6/n;->a:Lk6/h0;

    invoke-virtual {p1}, Lk6/h0;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p1}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_7

    iget-object v0, p0, Lo6/n;->a:Lk6/h0;

    invoke-static {v0}, Lk6/i0;->f(Lk6/h0;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->p0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lo6/n;->b:Lx6/p;

    invoke-virtual {v1}, Lx6/p;->c()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object v2

    :goto_1
    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    const/4 v4, 0x1

    invoke-virtual {v2, v0, v3, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    iget-object v3, v3, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    sget-object v5, Le7/x;->a:Le7/x;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Le7/x;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "text/xml"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {v1, v0}, Le7/e;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    :goto_2
    move-object v6, p1

    goto :goto_3

    :cond_2
    invoke-static {v1, v2, v0}, Le7/e;->f(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_2

    :goto_3
    invoke-static {v6}, Le7/i0;->j(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    new-instance v0, Lo6/l;

    if-eqz p1, :cond_4

    sget-object v5, Le7/i;->a:Le7/i;

    iget-object v2, p0, Lo6/n;->b:Lx6/p;

    invoke-static {v2}, Lx6/j;->j(Lx6/p;)Landroid/graphics/Bitmap$Config;

    move-result-object v7

    iget-object v2, p0, Lo6/n;->b:Lx6/p;

    invoke-virtual {v2}, Lx6/p;->k()Ly6/g;

    move-result-object v8

    iget-object v2, p0, Lo6/n;->b:Lx6/p;

    invoke-virtual {v2}, Lx6/p;->j()Ly6/f;

    move-result-object v9

    iget-object v2, p0, Lo6/n;->b:Lx6/p;

    invoke-virtual {v2}, Lx6/p;->i()Ly6/c;

    move-result-object v2

    sget-object v3, Ly6/c;->b:Ly6/c;

    if-ne v2, v3, :cond_3

    :goto_4
    move v10, v4

    goto :goto_5

    :cond_3
    const/4 v4, 0x0

    goto :goto_4

    :goto_5
    invoke-virtual/range {v5 .. v10}, Le7/i;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Ly6/g;Ly6/f;Z)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    new-instance v6, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v6, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    :cond_4
    invoke-static {v6}, Lk6/v;->c(Landroid/graphics/drawable/Drawable;)Lk6/n;

    move-result-object v1

    sget-object v2, Lm6/f;->c:Lm6/f;

    invoke-direct {v0, v1, p1, v2}, Lo6/l;-><init>(Lk6/n;ZLm6/f;)V

    return-object v0

    :cond_5
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v2, v0, v1}, Landroid/content/res/Resources;->openRawResource(ILandroid/util/TypedValue;)Ljava/io/InputStream;

    move-result-object v2

    new-instance v4, Lo6/o;

    invoke-static {v2}, Lxu/b0;->j(Ljava/io/InputStream;)Lxu/r0;

    move-result-object v2

    invoke-static {v2}, Lxu/b0;->c(Lxu/r0;)Lxu/g;

    move-result-object v2

    iget-object v5, p0, Lo6/n;->b:Lx6/p;

    invoke-virtual {v5}, Lx6/p;->g()Lxu/l;

    move-result-object v5

    new-instance v6, Lm6/u;

    iget v1, v1, Landroid/util/TypedValue;->density:I

    invoke-direct {v6, p1, v0, v1}, Lm6/u;-><init>(Ljava/lang/String;II)V

    invoke-static {v2, v5, v6}, Lm6/t;->a(Lxu/g;Lxu/l;Lm6/s$a;)Lm6/s;

    move-result-object p1

    sget-object v0, Lm6/f;->c:Lm6/f;

    invoke-direct {v4, p1, v3, v0}, Lo6/o;-><init>(Lm6/s;Ljava/lang/String;Lm6/f;)V

    return-object v4

    :cond_6
    iget-object p1, p0, Lo6/n;->a:Lk6/h0;

    invoke-virtual {p0, p1}, Lo6/n;->b(Lk6/h0;)Ljava/lang/Void;

    new-instance p1, Ljt/d;

    invoke-direct {p1}, Ljt/d;-><init>()V

    throw p1

    :cond_7
    iget-object p1, p0, Lo6/n;->a:Lk6/h0;

    invoke-virtual {p0, p1}, Lo6/n;->b(Lk6/h0;)Ljava/lang/Void;

    new-instance p1, Ljt/d;

    invoke-direct {p1}, Ljt/d;-><init>()V

    throw p1
.end method

.method public final b(Lk6/h0;)Ljava/lang/Void;
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid android.resource URI: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
