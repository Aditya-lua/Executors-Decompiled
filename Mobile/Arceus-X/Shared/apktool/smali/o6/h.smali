.class public final Lo6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo6/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo6/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lo6/h;",
        "Lo6/j;",
        "Landroid/graphics/drawable/Drawable;",
        "data",
        "Lx6/p;",
        "options",
        "<init>",
        "(Landroid/graphics/drawable/Drawable;Lx6/p;)V",
        "Lo6/i;",
        "a",
        "(Lnt/b;)Ljava/lang/Object;",
        "Landroid/graphics/drawable/Drawable;",
        "b",
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
.field public final a:Landroid/graphics/drawable/Drawable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lx6/p;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Lx6/p;)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/h;->a:Landroid/graphics/drawable/Drawable;

    iput-object p2, p0, Lo6/h;->b:Lx6/p;

    return-void
.end method


# virtual methods
.method public a(Lnt/b;)Ljava/lang/Object;
    .locals 8
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

    iget-object p1, p0, Lo6/h;->a:Landroid/graphics/drawable/Drawable;

    invoke-static {p1}, Le7/i0;->j(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    new-instance v0, Lo6/l;

    if-eqz p1, :cond_1

    sget-object v1, Le7/i;->a:Le7/i;

    iget-object v2, p0, Lo6/h;->a:Landroid/graphics/drawable/Drawable;

    iget-object v3, p0, Lo6/h;->b:Lx6/p;

    invoke-static {v3}, Lx6/j;->j(Lx6/p;)Landroid/graphics/Bitmap$Config;

    move-result-object v3

    iget-object v4, p0, Lo6/h;->b:Lx6/p;

    invoke-virtual {v4}, Lx6/p;->k()Ly6/g;

    move-result-object v4

    iget-object v5, p0, Lo6/h;->b:Lx6/p;

    invoke-virtual {v5}, Lx6/p;->j()Ly6/f;

    move-result-object v5

    iget-object v6, p0, Lo6/h;->b:Lx6/p;

    invoke-virtual {v6}, Lx6/p;->i()Ly6/c;

    move-result-object v6

    sget-object v7, Ly6/c;->b:Ly6/c;

    if-ne v6, v7, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    invoke-virtual/range {v1 .. v6}, Le7/i;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Ly6/g;Ly6/f;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    iget-object v2, p0, Lo6/h;->b:Lx6/p;

    invoke-virtual {v2}, Lx6/p;->c()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v3, v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lo6/h;->a:Landroid/graphics/drawable/Drawable;

    :goto_1
    invoke-static {v3}, Lk6/v;->c(Landroid/graphics/drawable/Drawable;)Lk6/n;

    move-result-object v1

    sget-object v2, Lm6/f;->b:Lm6/f;

    invoke-direct {v0, v1, p1, v2}, Lo6/l;-><init>(Lk6/n;ZLm6/f;)V

    return-object v0
.end method
