.class public Lei/y0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lei/y0;->i(Landroidx/lifecycle/s;Landroidx/lifecycle/a0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/e0<",
        "Landroid/graphics/Rect;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lei/y0;


# direct methods
.method public constructor <init>(Lei/y0;)V
    .locals 0

    iput-object p1, p0, Lei/y0$c;->a:Lei/y0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Lei/y0$c;->b(Landroid/graphics/Rect;)V

    return-void
.end method

.method public b(Landroid/graphics/Rect;)V
    .locals 4

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "New cutout insets: %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SafeAreaInsetsObserver"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    if-nez p1, :cond_0

    invoke-static {}, Ldn/a;->b()Ldn/a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, v0}, Ldn/a;->a(FFFF)V

    return-void

    :cond_0
    iget-object v0, p0, Lei/y0$c;->a:Lei/y0;

    invoke-static {v0}, Lei/y0;->a(Lei/y0;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/platform/util/DeviceUtils;->getScreenDensity(Landroid/content/Context;)F

    move-result v0

    iget-object v1, p0, Lei/y0$c;->a:Lei/y0;

    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2, p1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-static {v1, v2, v0}, Lei/y0;->d(Lei/y0;Landroid/graphics/RectF;F)Landroid/graphics/Rect;

    move-result-object p1

    invoke-static {}, Ldn/a;->b()Ldn/a;

    move-result-object v0

    iget v1, p1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v2, p1, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    iget v3, p1, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    invoke-virtual {v0, v1, v2, v3, p1}, Ldn/a;->a(FFFF)V

    return-void
.end method
