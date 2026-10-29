.class public Lo5/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo5/j0;

.field public static final b:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Lo5/n0;

    invoke-direct {v0}, Lo5/n0;-><init>()V

    sput-object v0, Lo5/i0;->a:Lo5/j0;

    goto :goto_0

    :cond_0
    new-instance v0, Lo5/m0;

    invoke-direct {v0}, Lo5/m0;-><init>()V

    sput-object v0, Lo5/i0;->a:Lo5/j0;

    :goto_0
    new-instance v0, Lo5/i0$a;

    const-class v1, Ljava/lang/Float;

    const-string v2, "translationAlpha"

    invoke-direct {v0, v1, v2}, Lo5/i0$a;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lo5/i0;->b:Landroid/util/Property;

    new-instance v0, Lo5/i0$b;

    const-class v1, Landroid/graphics/Rect;

    const-string v2, "clipBounds"

    invoke-direct {v0, v1, v2}, Lo5/i0$b;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lo5/i0;->c:Landroid/util/Property;

    return-void
.end method

.method public static a(Landroid/view/View;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lo5/i0;->a:Lo5/j0;

    invoke-virtual {v0, p0}, Lo5/j0;->a(Landroid/view/View;)V

    return-void
.end method

.method public static b(Landroid/view/View;)F
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lo5/i0;->a:Lo5/j0;

    invoke-virtual {v0, p0}, Lo5/j0;->b(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method public static c(Landroid/view/View;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lo5/i0;->a:Lo5/j0;

    invoke-virtual {v0, p0}, Lo5/j0;->c(Landroid/view/View;)V

    return-void
.end method

.method public static d(Landroid/view/View;IIII)V
    .locals 6
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lo5/i0;->a:Lo5/j0;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lo5/j0;->d(Landroid/view/View;IIII)V

    return-void
.end method

.method public static e(Landroid/view/View;F)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lo5/i0;->a:Lo5/j0;

    invoke-virtual {v0, p0, p1}, Lo5/j0;->e(Landroid/view/View;F)V

    return-void
.end method

.method public static f(Landroid/view/View;I)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lo5/i0;->a:Lo5/j0;

    invoke-virtual {v0, p0, p1}, Lo5/j0;->f(Landroid/view/View;I)V

    return-void
.end method

.method public static g(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lo5/i0;->a:Lo5/j0;

    invoke-virtual {v0, p0, p1}, Lo5/j0;->g(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public static h(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lo5/i0;->a:Lo5/j0;

    invoke-virtual {v0, p0, p1}, Lo5/j0;->h(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method
